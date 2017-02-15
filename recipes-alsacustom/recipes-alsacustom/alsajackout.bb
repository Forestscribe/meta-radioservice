# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)
SUMMARY = "Force audio output to Jack"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe;"
SRC_URI ="file://.asoundrc"

# Copy script to the deploy area with u-boot, uImage, and rootfs
do_install() {
   install -d ${D}/home/root
   install -m 0755 ${WORKDIR}/.asoundrc  ${D}/home/root/
}

FILES_${PN} = "/home/root/.asoundrc"
