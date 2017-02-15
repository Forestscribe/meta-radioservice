DESCRIPTION = "Package group for FM demo"
LICENSE = "GPLv2"

inherit packagegroup

PACKAGES = "\
         packagegroup-radiodemo \
         "

RDEPENDS_packagegroup-radiodemo = "\
         qtbase \
         rtl-sdr \
         radioservice \
         alsajackout \
         fmradioqtplugin \
         gstreamer1.0-plugins-good \
         "

