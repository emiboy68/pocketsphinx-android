/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.cmu.pocketsphinx;

public class nGramModelSetIterator implements java.util.Iterator<nGramModel> {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected nGramModelSetIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(nGramModelSetIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        SphinxBaseJNI.delete_nGramModelSetIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  public nGramModelSetIterator(SWIGTYPE_p_void ptr) {
    this(SphinxBaseJNI.new_nGramModelSetIterator(SWIGTYPE_p_void.getCPtr(ptr)), true);
  }

  public nGramModel next() {
    long cPtr = SphinxBaseJNI.nGramModelSetIterator_next(swigCPtr, this);
    return (cPtr == 0) ? null : new nGramModel(cPtr, true);
  }

  public boolean hasNext() {
    return SphinxBaseJNI.nGramModelSetIterator_hasNext(swigCPtr, this);
  }

}
