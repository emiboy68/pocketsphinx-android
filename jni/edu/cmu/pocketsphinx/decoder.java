/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.cmu.pocketsphinx;

public class Decoder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Decoder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Decoder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PocketSphinxJNI.delete_Decoder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public float emiGetHypScore(Decoder ps) {
    return PocketSphinxJNI.Decoder_emiGetHypScore(swigCPtr, this, Decoder.getCPtr(ps), ps);
  }

  public int emiGetUttno() {
    return PocketSphinxJNI.Decoder_emiGetUttno(swigCPtr, this);
  }

  public float emiGetVadSNR() {
    return PocketSphinxJNI.Decoder_emiGetVadSNR(swigCPtr, this);
  }

  public void emiSetYinSearchThreshold(float threshold) {
    PocketSphinxJNI.Decoder_emiSetYinSearchThreshold(swigCPtr, this, threshold);
  }

  public void emiSetYinSearchRange(float range) {
    PocketSphinxJNI.Decoder_emiSetYinSearchRange(swigCPtr, this, range);
  }

  public void emiSetYinSmoothWindow(int smooth_window) {
    PocketSphinxJNI.Decoder_emiSetYinSmoothWindow(swigCPtr, this, smooth_window);
  }

  public void emiSetYinParametros(int post_speech_reset_yin, int yin_vad_stopspeech, int yin_min_pitch_threshold, int yin_max_pitch_threshold, float yin_prob_pitch_threshold, float yin_prob_pitch_threshold2, float yin_desv_pitch_threshold) {
    PocketSphinxJNI.Decoder_emiSetYinParametros(swigCPtr, this, post_speech_reset_yin, yin_vad_stopspeech, yin_min_pitch_threshold, yin_max_pitch_threshold, yin_prob_pitch_threshold, yin_prob_pitch_threshold2, yin_desv_pitch_threshold);
  }

  public void emiSetVadThreshold(float threshold) {
    PocketSphinxJNI.Decoder_emiSetVadThreshold(swigCPtr, this, threshold);
  }

  public void emiSetVadMaxThreshold(float threshold) {
    PocketSphinxJNI.Decoder_emiSetVadMaxThreshold(swigCPtr, this, threshold);
  }

  public void emiSetVadMinThreshold(float threshold) {
    PocketSphinxJNI.Decoder_emiSetVadMinThreshold(swigCPtr, this, threshold);
  }

  public float emiGetVadThreshold() {
    return PocketSphinxJNI.Decoder_emiGetVadThreshold(swigCPtr, this);
  }

  public void emiSetVadLocked(boolean locked) {
    PocketSphinxJNI.Decoder_emiSetVadLocked(swigCPtr, this, locked);
  }

  public int emiGetVadLocked() {
    return PocketSphinxJNI.Decoder_emiGetVadLocked(swigCPtr, this);
  }

  public void emiInicializaAverageSNR(int numsnr) {
    PocketSphinxJNI.Decoder_emiInicializaAverageSNR(swigCPtr, this, numsnr);
  }

  public float emiGetVadAverageSNR() {
    return PocketSphinxJNI.Decoder_emiGetVadAverageSNR(swigCPtr, this);
  }

  public float emiGetVadAverageRMSDB() {
    return PocketSphinxJNI.Decoder_emiGetVadAverageRMSDB(swigCPtr, this);
  }

  public float emiGetVadAverageDBSNR() {
    return PocketSphinxJNI.Decoder_emiGetVadAverageDBSNR(swigCPtr, this);
  }

  public float emiGetVadDBThreshold() {
    return PocketSphinxJNI.Decoder_emiGetVadDBThreshold(swigCPtr, this);
  }

  public float emiGetVadDBSNR() {
    return PocketSphinxJNI.Decoder_emiGetVadDBSNR(swigCPtr, this);
  }

  public void emiSetVadDBThreshold(float dbthreshold) {
    PocketSphinxJNI.Decoder_emiSetVadDBThreshold(swigCPtr, this, dbthreshold);
  }

  public void emiCambiaConfiguracionRawlog() {
    PocketSphinxJNI.Decoder_emiCambiaConfiguracionRawlog(swigCPtr, this);
  }

  public int emiGetNumsPitchUtt() {
    return PocketSphinxJNI.Decoder_emiGetNumsPitchUtt(swigCPtr, this);
  }

  public float emiGetCMN() {
    return PocketSphinxJNI.Decoder_emiGetCMN(swigCPtr, this);
  }

  public float emiGetProbability(int prob) {
    return PocketSphinxJNI.Decoder_emiGetProbability(swigCPtr, this, prob);
  }

  public void emiUsaDeteccionPitch(boolean usaPitch) {
    PocketSphinxJNI.Decoder_emiUsaDeteccionPitch(swigCPtr, this, usaPitch);
  }

  public boolean emiGetVadCalculoAutomaticoThreshold() {
    return PocketSphinxJNI.Decoder_emiGetVadCalculoAutomaticoThreshold(swigCPtr, this);
  }

  public void emiSetVadCalculoAutomaticoThreshold(boolean calculoAutomatico) {
    PocketSphinxJNI.Decoder_emiSetVadCalculoAutomaticoThreshold(swigCPtr, this, calculoAutomatico);
  }

  public Decoder() {
    this(PocketSphinxJNI.new_Decoder__SWIG_0(), true);
  }

  public Decoder(Config config) {
    this(PocketSphinxJNI.new_Decoder__SWIG_1(Config.getCPtr(config), config), true);
  }

  public void reinit(Config config) {
    PocketSphinxJNI.Decoder_reinit(swigCPtr, this, Config.getCPtr(config), config);
  }

  public void loadDict(String fdict, String ffilter, String format) {
    PocketSphinxJNI.Decoder_loadDict(swigCPtr, this, fdict, ffilter, format);
  }

  public void saveDict(String dictfile, String format) {
    PocketSphinxJNI.Decoder_saveDict(swigCPtr, this, dictfile, format);
  }

  public void addWord(String word, String phones, int update) {
    PocketSphinxJNI.Decoder_addWord(swigCPtr, this, word, phones, update);
  }

  public String lookupWord(String word) {
    return PocketSphinxJNI.Decoder_lookupWord(swigCPtr, this, word);
  }

  public Lattice getLattice() {
    long cPtr = PocketSphinxJNI.Decoder_getLattice(swigCPtr, this);
    return (cPtr == 0) ? null : new Lattice(cPtr, false);
  }

  public Config getConfig() {
    long cPtr = PocketSphinxJNI.Decoder_getConfig(swigCPtr, this);
    return (cPtr == 0) ? null : new Config(cPtr, true);
  }

  public static Config defaultConfig() {
    long cPtr = PocketSphinxJNI.Decoder_defaultConfig();
    return (cPtr == 0) ? null : new Config(cPtr, true);
  }

  public static Config fileConfig(String path) {
    long cPtr = PocketSphinxJNI.Decoder_fileConfig(path);
    return (cPtr == 0) ? null : new Config(cPtr, true);
  }

  public void startStream() {
    PocketSphinxJNI.Decoder_startStream(swigCPtr, this);
  }

  public void startUtt() {
    PocketSphinxJNI.Decoder_startUtt(swigCPtr, this);
  }

  public void endUtt() {
    PocketSphinxJNI.Decoder_endUtt(swigCPtr, this);
  }

  public int processRaw(short[] SDATA, long NSAMP, boolean no_search, boolean full_utt) {
    return PocketSphinxJNI.Decoder_processRaw(swigCPtr, this, SDATA, NSAMP, no_search, full_utt);
  }

  public void setRawdataSize(long size) {
    PocketSphinxJNI.Decoder_setRawdataSize(swigCPtr, this, size);
  }

  public short[] getRawdata() {
  return PocketSphinxJNI.Decoder_getRawdata(swigCPtr, this);
}

  public Hypothesis hyp() {
    long cPtr = PocketSphinxJNI.Decoder_hyp(swigCPtr, this);
    return (cPtr == 0) ? null : new Hypothesis(cPtr, true);
  }

  public FrontEnd getFe() {
    long cPtr = PocketSphinxJNI.Decoder_getFe(swigCPtr, this);
    return (cPtr == 0) ? null : new FrontEnd(cPtr, false);
  }

  public Feature getFeat() {
    long cPtr = PocketSphinxJNI.Decoder_getFeat(swigCPtr, this);
    return (cPtr == 0) ? null : new Feature(cPtr, false);
  }

  public boolean getInSpeech() {
    return PocketSphinxJNI.Decoder_getInSpeech(swigCPtr, this);
  }

  public FsgModel getFsg(String name) {
    long cPtr = PocketSphinxJNI.Decoder_getFsg(swigCPtr, this, name);
    return (cPtr == 0) ? null : new FsgModel(cPtr, false);
  }

  public void setFsg(String name, FsgModel fsg) {
    PocketSphinxJNI.Decoder_setFsg(swigCPtr, this, name, FsgModel.getCPtr(fsg), fsg);
  }

  public void setJsgfFile(String name, String path) {
    PocketSphinxJNI.Decoder_setJsgfFile(swigCPtr, this, name, path);
  }

  public void setJsgfString(String name, String jsgf_string) {
    PocketSphinxJNI.Decoder_setJsgfString(swigCPtr, this, name, jsgf_string);
  }

  public String getKws(String name) {
    return PocketSphinxJNI.Decoder_getKws(swigCPtr, this, name);
  }

  public void setKws(String name, String keyfile) {
    PocketSphinxJNI.Decoder_setKws(swigCPtr, this, name, keyfile);
  }

  public void setKeyphrase(String name, String keyphrase) {
    PocketSphinxJNI.Decoder_setKeyphrase(swigCPtr, this, name, keyphrase);
  }

  public void setAllphoneFile(String name, String lmfile) {
    PocketSphinxJNI.Decoder_setAllphoneFile(swigCPtr, this, name, lmfile);
  }

  public NGramModel getLm(String name) {
    long cPtr = PocketSphinxJNI.Decoder_getLm(swigCPtr, this, name);
    return (cPtr == 0) ? null : new NGramModel(cPtr, true);
  }

  public void setLm(String name, NGramModel lm) {
    PocketSphinxJNI.Decoder_setLm(swigCPtr, this, name, NGramModel.getCPtr(lm), lm);
  }

  public void setLmFile(String name, String path) {
    PocketSphinxJNI.Decoder_setLmFile(swigCPtr, this, name, path);
  }

  public LogMath getLogmath() {
    long cPtr = PocketSphinxJNI.Decoder_getLogmath(swigCPtr, this);
    return (cPtr == 0) ? null : new LogMath(cPtr, true);
  }

  public void setSearch(String search_name) {
    PocketSphinxJNI.Decoder_setSearch(swigCPtr, this, search_name);
  }

  public void unsetSearch(String search_name) {
    PocketSphinxJNI.Decoder_unsetSearch(swigCPtr, this, search_name);
  }

  public String getSearch() {
    return PocketSphinxJNI.Decoder_getSearch(swigCPtr, this);
  }

  public int nFrames() {
    return PocketSphinxJNI.Decoder_nFrames(swigCPtr, this);
  }

  public SegmentList seg() {
    long cPtr = PocketSphinxJNI.Decoder_seg(swigCPtr, this);
    return (cPtr == 0) ? null : new SegmentList(cPtr, false);
  }

  public NBestList nbest() {
    long cPtr = PocketSphinxJNI.Decoder_nbest(swigCPtr, this);
    return (cPtr == 0) ? null : new NBestList(cPtr, false);
  }

}
