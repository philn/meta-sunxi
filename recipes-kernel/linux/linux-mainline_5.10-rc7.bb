require linux-mainline.inc

DESCRIPTION = "Mainline Stable Linux kernel"

LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "https://git.kernel.org/torvalds/t/linux-${PV}.tar.gz \
	file://0003-ARM-dts-nanopi-neo-air-Add-WiFi-eMMC.patch \
	file://0001-dts-orange-pi-zero-Add-wifi-support.patch \
	file://defconfig \
"

SRC_URI[md5sum] = "fbd373ba1a12b85c36a085ca1af8c305"
SRC_URI[sha256sum] = "9f95194fc84eef01789f2ed6566518ef597e9c6541b640f7276f2a3ef1a221f2"

SRC_URI_append_sun8i = " file://sun8i_defconfig"