DESCRIPTION = "Package group for FM demo"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe;"

inherit packagegroup

PACKAGES = "\
         qtbase \
         rtl-sdr \
         radioservice \
         alsajackout \
         fmradioqtplugin \
         gstreamer1.0-plugins-good \
         "
