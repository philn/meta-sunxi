require linux-mainline.inc

DESCRIPTION = "Mainline Stable Linux kernel"

LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[md5sum] = "4727d38ee292c83c230a30a1db067983"
SRC_URI[sha256sum] = "39fcfb41dcdf71b6b42b88eff3d8cedbe7523830ccae847f3914c0b97e1e6b49"

SRC_URI_append_sun8i = " file://sun8i_defconfig"
