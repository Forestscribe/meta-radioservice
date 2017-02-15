# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://../LICENSE.txt;md5=815ca599c9df247a0c7f619bab123dad"
SRC_URI = "git://github.com/GENIVI/FMRadio"
SRCREV  = "256c49af8719e2831a316e18240670df66ea2964"

SRC_URI += " file://dbus_interface_as_attribute_avoid_freeze.patch"
SUMMARY = "FM Radio QT plugin"
DEPENDS = "qtbase qtdeclarative"

S = "${WORKDIR}/git/qdeclarativeradio"

inherit qmake5
prefix="/usr"
FILES_${PN} += "${prefix}/lib/*"
