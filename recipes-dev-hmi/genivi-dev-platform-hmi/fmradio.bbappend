# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
DEPENDS_append = " fmradioqtplugin"
SRC_URI_append ="\
    file://fm-radio-remove-fmradioservice-stub_001.patch \
    "
