/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.cmu.pocketsphinx;

class SphinxBaseJNI {
  public final static native void delete_config(long jarg1);
  public final static native void config_setBoolean(long jarg1, config jarg1_, String jarg2, boolean jarg3);
  public final static native void config_setInt(long jarg1, config jarg1_, String jarg2, int jarg3);
  public final static native void config_setFloat(long jarg1, config jarg1_, String jarg2, double jarg3);
  public final static native void config_setString(long jarg1, config jarg1_, String jarg2, String jarg3);
  public final static native void config_setStringExtra(long jarg1, config jarg1_, String jarg2, String jarg3);
  public final static native boolean config_exists(long jarg1, config jarg1_, String jarg2);
  public final static native boolean config_getBoolean(long jarg1, config jarg1_, String jarg2);
  public final static native int config_getInt(long jarg1, config jarg1_, String jarg2);
  public final static native double config_getFloat(long jarg1, config jarg1_, String jarg2);
  public final static native String config_getString(long jarg1, config jarg1_, String jarg2);
  public final static native long new_frontEnd();
  public final static native void delete_frontEnd(long jarg1);
  public final static native int frontEnd_outputSize(long jarg1, frontEnd jarg1_);
  public final static native int frontEnd_processUtt(long jarg1, frontEnd jarg1_, String jarg2, long jarg3, long jarg4);
  public final static native void delete_feature(long jarg1);
  public final static native long new_feature();
  public final static native long new_fsgModel__SWIG_0(String jarg1, long jarg2, logMath jarg2_, float jarg3, int jarg4);
  public final static native long new_fsgModel__SWIG_1(String jarg1, long jarg2, logMath jarg2_, float jarg3);
  public final static native void delete_fsgModel(long jarg1);
  public final static native int fsgModel_wordId(long jarg1, fsgModel jarg1_, String jarg2);
  public final static native int fsgModel_wordAdd(long jarg1, fsgModel jarg1_, String jarg2);
  public final static native void fsgModel_transAdd(long jarg1, fsgModel jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int fsgModel_nullTransAdd(long jarg1, fsgModel jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native int fsgModel_tagTransAdd(long jarg1, fsgModel jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int fsgModel_addSilence(long jarg1, fsgModel jarg1_, String jarg2, int jarg3, float jarg4);
  public final static native int fsgModel_addAlt(long jarg1, fsgModel jarg1_, String jarg2, String jarg3);
  public final static native void fsgModel_writefile(long jarg1, fsgModel jarg1_, String jarg2);
  public final static native long new_jsgfRule();
  public final static native long jsgfRule_fromIter(long jarg1);
  public final static native String jsgfRule_getName(long jarg1, jsgfRule jarg1_);
  public final static native boolean jsgfRule_isPublic(long jarg1, jsgfRule jarg1_);
  public final static native void delete_jsgfRule(long jarg1);
  public final static native long nGramModel_fromIter(long jarg1);
  public final static native long new_nGramModel__SWIG_0(String jarg1);
  public final static native long new_nGramModel__SWIG_1(long jarg1, config jarg1_, long jarg2, logMath jarg2_, String jarg3);
  public final static native void delete_nGramModel(long jarg1);
  public final static native void nGramModel_write(long jarg1, nGramModel jarg1_, String jarg2, int jarg3);
  public final static native int nGramModel_strToType(long jarg1, nGramModel jarg1_, String jarg2);
  public final static native String nGramModel_typeToStr(long jarg1, nGramModel jarg1_, int jarg2);
  public final static native void nGramModel_casefold(long jarg1, nGramModel jarg1_, int jarg2);
  public final static native int nGramModel_size(long jarg1, nGramModel jarg1_);
  public final static native int nGramModel_addWord(long jarg1, nGramModel jarg1_, String jarg2, float jarg3);
  public final static native int nGramModel_prob(long jarg1, nGramModel jarg1_, String[] jarg2);
  public final static native long new_logMath();
  public final static native void delete_logMath(long jarg1);
  public final static native double logMath_exp(long jarg1, logMath jarg1_, int jarg2);
  public final static native long new_nGramModelSetIterator(long jarg1);
  public final static native void delete_nGramModelSetIterator(long jarg1);
  public final static native long nGramModelSetIterator_next(long jarg1, nGramModelSetIterator jarg1_);
  public final static native boolean nGramModelSetIterator_hasNext(long jarg1, nGramModelSetIterator jarg1_);
  public final static native long new_jsgfIterator(long jarg1);
  public final static native void delete_jsgfIterator(long jarg1);
  public final static native long jsgfIterator_next(long jarg1, jsgfIterator jarg1_);
  public final static native boolean jsgfIterator_hasNext(long jarg1, jsgfIterator jarg1_);
  public final static native long nGramModelSet_iterator(long jarg1, nGramModelSet jarg1_);
  public final static native long new_nGramModelSet(long jarg1, config jarg1_, long jarg2, logMath jarg2_, String jarg3);
  public final static native void delete_nGramModelSet(long jarg1);
  public final static native int nGramModelSet_count(long jarg1, nGramModelSet jarg1_);
  public final static native long nGramModelSet_add(long jarg1, nGramModelSet jarg1_, long jarg2, nGramModel jarg2_, String jarg3, float jarg4, boolean jarg5);
  public final static native long nGramModelSet_select(long jarg1, nGramModelSet jarg1_, String jarg2);
  public final static native long nGramModelSet_lookup(long jarg1, nGramModelSet jarg1_, String jarg2);
  public final static native String nGramModelSet_current(long jarg1, nGramModelSet jarg1_);
  public final static native long jsgf_iterator(long jarg1, jsgf jarg1_);
  public final static native long new_jsgf(String jarg1);
  public final static native void delete_jsgf(long jarg1);
  public final static native String jsgf_getName(long jarg1, jsgf jarg1_);
  public final static native long jsgf_getRule(long jarg1, jsgf jarg1_, String jarg2);
  public final static native long jsgf_buildFsg(long jarg1, jsgf jarg1_, long jarg2, jsgfRule jarg2_, long jarg3, logMath jarg3_, float jarg4);
}
