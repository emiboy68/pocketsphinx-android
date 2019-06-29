#Pocketsphinx cmake file

cmake_minimum_required(VERSION 3.4.1)

#set(SPHINXBASE_SRC $ENV{SPINXBASE_HOME}/src/libsphinxbase)
#set(POCKETSPHINX_SRC $ENV{POCKETSPHINX_HOME}/src/libpocketsphinx)

set(SPHINXBASE_SRC E:/repos/sphinx/sphinxbase/src/libsphinxbase)
set(POCKETSPHINX_SRC E:/repos/sphinx/pocketsphinx/src/libpocketsphinx)
set(WEBRTC_SRC E:/repos/sphinx/webrtc)


set (WEBRTC_SOURCES
common_audio/vad/vad_core.c
common_audio/vad/vad_filterbank.c
common_audio/vad/vad_gmm.c
        common_audio/vad/vad_sp.c
        common_audio/vad/webrtc_vad.c
        common_audio/signal_processing/cross_correlation.c
        common_audio/signal_processing/division_operations.c
        common_audio/signal_processing/downsample_fast.c
        common_audio/signal_processing/energy.c
        common_audio/signal_processing/get_scaling_square.c
        common_audio/signal_processing/min_max_operations.c
        common_audio/signal_processing/resample_48khz.c
        common_audio/signal_processing/resample_by_2_internal.c
        common_audio/signal_processing/resample_fractional.c
        common_audio/signal_processing/spl_init.c
        common_audio/signal_processing/spl_inl.c
        common_audio/signal_processing/vector_scaling_operations.c
        rtc_base/checks.cc
        )

set(WEBRTC_SOURCES_ABS)
foreach(source ${WEBRTC_SOURCES})
list(APPEND WEBRTC_SOURCES_ABS "${WEBRTC_SRC}/${source}")
endforeach()

set(SPHINXBASE_SOURCES
fe/fe_interface.c
fe/fe_noise.c
fe/fe_prespch_buf.c
fe/fe_sigproc.c
fe/emi_fe_interface.c #Emilio Rueda
fe/emi_fe_sigproc.c #Emilio Rueda
fe/fe_warp.c
fe/fe_warp_affine.c
fe/fe_warp_inverse_linear.c
fe/fe_warp_piecewise_linear.c
fe/fixlog.c
feat/agc.c
feat/cmn.c
feat/cmn_live.c
feat/feat.c
feat/lda.c
lm/fsg_model.c
lm/jsgf.c
lm/jsgf_parser.c
lm/jsgf_scanner.c
lm/lm_trie.c
lm/lm_trie_quant.c
lm/ngram_model.c
lm/ngram_model_set.c
lm/ngram_model_trie.c
lm/ngrams_raw.c
util/bio.c
util/bitarr.c
util/bitvec.c
util/blas_lite.c
util/case.c
util/ckd_alloc.c
util/cmd_ln.c
util/dtoa.c
util/err.c
util/errno.c
util/f2c_lite.c
util/filename.c
util/genrand.c
util/glist.c
util/hash_table.c
util/heap.c
util/listelem_alloc.c
util/logmath.c
util/matrix.c
util/mmio.c
util/pio.c
util/priority_queue.c
util/profile.c
util/sbthread.c
util/slamch.c
util/slapack_lite.c
util/strfuncs.c
)

set(SPHINXBASE_SOURCES_ABS)
foreach(source ${SPHINXBASE_SOURCES})
    list(APPEND SPHINXBASE_SOURCES_ABS "${SPHINXBASE_SRC}/${source}")
endforeach()

set(POCKETSPHINX_SOURCES
acmod.c
allphone_search.c
bin_mdef.c
blkarray_list.c
dict.c
dict2pid.c
fsg_history.c
fsg_lextree.c
fsg_search.c
hmm.c
kws_detections.c
kws_search.c
mdef.c
ms_gauden.c
ms_mgau.c
ms_senone.c
ngram_search.c
ngram_search_fwdflat.c
ngram_search_fwdtree.c
phone_loop_search.c
pocketsphinx.c
ps_alignment.c
ps_lattice.c
ps_mllr.c
ptm_mgau.c
s2_semi_mgau.c
state_align_search.c
tmat.c
vector.c
emi_pocketsphinx.c #Emilio Rueda
)

set(POCKETSPHINX_SOURCES_ABS)
foreach(source ${POCKETSPHINX_SOURCES})
    list(APPEND POCKETSPHINX_SOURCES_ABS "${POCKETSPHINX_SRC}/${source}")
endforeach()

add_library( pocketsphinx_jni SHARED
            build/generated-src/cpp/pocketsphinx_wrap.c
            build/generated-src/cpp/sphinxbase_wrap.c
	        ${SPHINXBASE_SOURCES_ABS}
            ${POCKETSPHINX_SOURCES_ABS}
            ${WEBRTC_SOURCES_ABS}
)

include_directories(
        E:/repos/sphinx/sphinxbase/include
        E:/repos/sphinx/sphinxbase/include/android
        E:/repos/sphinx/sphinxbase/include/sphinxbase
        E:/repos/sphinx/pocketsphinx/include
        E:/repos/sphinx
        E:/repos/sphinx/webrtc
        E:/repos/abseil-cpp
        # D:\\Android\\android-ndk-windows\\sources\\cxx-stl\\llvm-libc++\\include
        # E:/repos/tensorflow
        # E:/repos/tensorflow/tensorflow/c
        # E:/repos/tensorflow/tensorflow/lite/
        )

add_definitions(-DHAVE_CONFIG_H -DWEBRTC_POSIX)
add_compile_options(-O3)

target_link_libraries( pocketsphinx_jni
                       log )
