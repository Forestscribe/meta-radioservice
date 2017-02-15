# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=815ca599c9df247a0c7f619bab123dad"
SRC_URI = "git://github.com/PDXostc/fmradioservice.git;protocol=https;rev=cb1e1472cd55c148c816835f2e1fb063db00eb24 \
	   file://replace_pulsesink_by_alsasink_001.patch"
BB_STRICT_CHECKSUM = "0"
SUMMARY = "FM Radio service"

S = "${WORKDIR}/git"


DEPENDS_prepend = "pkgconfig-native glib-2.0 rtl-sdr fftwf dbus dbus-glib vala-dbus-binding-tool gstreamer1.0 gstreamer1.0-meta-base libsamplerate0"

inherit autotools
prefix="/usr"

FILES_${PN} += "${prefix}/lib/*"
FILES_${PN} += "${prefix}/share/*"
EXTRA_OECONF_append = " --enable-static=no"
