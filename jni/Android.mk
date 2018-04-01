# Build the native component of the PocketSphinx library for Android.

# You MUST change this to the absolute path of the directory containing
# sphinxbase and pocketsphinx source code.
SPHINX_PATH := d:\sphinx
#
# Copy this Android.mk along with pocketsphinx_wrap.c and the contents of the 'edu' folder
# built by swig to the jni/ directory of your Android project.
BASE_PATH := $(call my-dir)

# WEBRTC COMMON AUDIO
include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include \
 $(SPHINX_PATH) 
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK
 
LOCAL_PATH := $(SPHINX_PATH)/webrtc/common_audio/vad
LOCAL_MODULE := sphinxvad
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda
LOCAL_ARM_MODE := arm
 
LOCAL_SRC_FILES := \
vad_core.c \
vad_filterbank.c \
vad_gmm.c \
vad_sp.c \
webrtc_vad.c
include $(BUILD_STATIC_LIBRARY)

# WEBRTC SIGNAL PROCESSING
include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include \
 $(SPHINX_PATH)
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK
LOCAL_CFLAGS += -DWEBRTC_POSIX
 
LOCAL_PATH := $(SPHINX_PATH)/webrtc/common_audio/signal_processing
LOCAL_MODULE := sphinxsignal_processing
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda
LOCAL_ARM_MODE := arm
 
LOCAL_SRC_FILES := \
cross_correlation.c \
division_operations.c \
downsample_fast.c \
energy.c \
get_scaling_square.c \
min_max_operations.c \
resample_48khz.c \
resample_by_2_internal.c \
resample_fractional.c \
spl_init.c \
spl_inl.c \
vector_scaling_operations.c
 
include $(BUILD_STATIC_LIBRARY)


include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(SPHINX_PATH)/sphinxbase/src/libsphinxbase/util
LOCAL_MODULE := sphinxutil

LOCAL_SRC_FILES := \
  bio.c \
  bitarr.c \
  bitvec.c \
  case.c \
  ckd_alloc.c \
  cmd_ln.c \
  dtoa.c \
  err.c \
  errno.c \
  f2c_lite.c \
  filename.c \
  genrand.c \
  glist.c \
  hash_table.c \
  heap.c \
  listelem_alloc.c \
  logmath.c.arm \
  matrix.c \
  mmio.c \
  pio.c \
  profile.c \
  priority_queue.c \
  sbthread.c \
  strfuncs.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(SPHINX_PATH)/sphinxbase/src/libsphinxbase/fe
LOCAL_MODULE := sphinxfe
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda
LOCAL_ARM_MODE := arm

LOCAL_SRC_FILES := \
  fe_noise.c \
  fe_prespch_buf.c \
	fe_interface.c emi_fe_interface.c \
	fe_sigproc.c emi_fe_sigproc.c \
  fe_warp_affine.c \
  fe_warp.c \
  fe_warp_inverse_linear.c \
  fe_warp_piecewise_linear.c \
  fixlog.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(SPHINX_PATH)/sphinxbase/src/libsphinxbase/feat
LOCAL_MODULE := sphinxfeat
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda

LOCAL_SRC_FILES := \
  agc.c \
  cmn.c \
  cmn_live.c \
  feat.c \
  lda.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(SPHINX_PATH)/sphinxbase/src/libsphinxbase/lm
LOCAL_MODULE := sphinxlm

LOCAL_SRC_FILES := \
  fsg_model.c \
  jsgf.c \
  jsgf_parser.c \
  jsgf_scanner.c \
  lm_trie.c \
  lm_trie_quant.c \
  ngram_model_trie.c \
  ngram_model_set.c \
  ngram_model.c \
  ngrams_raw.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include \
  $(SPHINX_PATH)/pocketsphinx/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(SPHINX_PATH)/pocketsphinx/src/libpocketsphinx
LOCAL_MODULE := pocketsphinx
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda

LOCAL_SRC_FILES := \
  acmod.c     \
  allphone_search.c \
  bin_mdef.c    \
  blkarray_list.c   \
  dict.c     \
  dict2pid.c    \
  fsg_history.c   \
  fsg_lextree.c   \
  fsg_search.c   \
  kws_detections.c \
  kws_search.c   \
  hmm.c.arm     \
  mdef.c     \
  ms_gauden.c.arm    \
  ms_mgau.c.arm    \
  ms_senone.c.arm    \
  ngram_search.c   \
  ngram_search_fwdtree.c \
  ngram_search_fwdflat.c \
  phone_loop_search.c  \
	pocketsphinx.c emi_pocketsphinx.c \
  ps_lattice.c   \
  ps_mllr.c    \
  ptm_mgau.c.arm    \
  s2_semi_mgau.c.arm   \
  tmat.c     \
  vector.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include \
  $(SPHINX_PATH)/pocketsphinx/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK
LOCAL_CFLAGS += -DSWIG_NOINCLUDE

LOCAL_PATH := $(BASE_PATH)
LOCAL_MODULE := sphinxbase_wrap

LOCAL_SRC_FILES := sphinxbase_wrap.c

include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_C_INCLUDES := \
  $(SPHINX_PATH)/sphinxbase/include/android \
  $(SPHINX_PATH)/sphinxbase/include \
  $(SPHINX_PATH)/pocketsphinx/include
LOCAL_CFLAGS += -DHAVE_CONFIG_H
LOCAL_CFLAGS += -DANDROID_NDK

LOCAL_PATH := $(BASE_PATH)
LOCAL_MODULE := pocketsphinx_wrap
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda

LOCAL_SRC_FILES := pocketsphinx_wrap.c

include $(BUILD_STATIC_LIBRARY)

# Create the dynamic library wrapper
include $(CLEAR_VARS)

LOCAL_PATH := $(BASE_PATH)
LOCAL_MODULE := pocketsphinx_jni
LOCAL_C_INCLUDES += $(SPHINX_PATH) $(SPHINX_PATH)/webrtc # Emilio Rueda

LOCAL_LDLIBS := -llog

LOCAL_STATIC_LIBRARIES := \
  pocketsphinx \
  sphinxlm \
  sphinxfeat \
  sphinxfe \
  sphinxutil \
sphinxvad \
sphinxsignal_processing

LOCAL_WHOLE_STATIC_LIBRARIES := sphinxbase_wrap pocketsphinx_wrap

include $(BUILD_SHARED_LIBRARY)
