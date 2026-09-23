package com.fasterxml.jackson.core.json;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.json.EqualityUtils.*;
import java.lang.Object;

public class UTF8StreamJsonParser_init_971237690173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42218;
     Object term42492;
     Object term42499;

    public UTF8StreamJsonParser_init_971237690173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42032 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        char[] term41824 = (char[]) newCharArray(0);
        Object term42134 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term42032, term42032.getClass(), "_inputPtr", 0);
        setIntField(term42032, term42032.getClass(), "_inputEnd", 0);
        setLongField(term42032, term42032.getClass(), "_currInputProcessed", 0L);
        setIntField(term42032, term42032.getClass(), "_currInputRow", 0);
        setIntField(term42032, term42032.getClass(), "_currInputRowStart", 0);
        setLongField(term42032, term42032.getClass(), "_tokenInputTotal", 0L);
        setIntField(term42032, term42032.getClass(), "_tokenInputRow", 0);
        setIntField(term42032, term42032.getClass(), "_tokenInputCol", 0);
        setField(term42032, term42032.getClass(), "_nameCopyBuffer", term41824);
        setBooleanField(term42032, term42032.getClass(), "_nameCopied", false);
        setField(term42032, term42032.getClass(), "_byteArrayBuilder", term42134);
        setIntField(term42032, term42032.getClass(), "_numTypesValid", 0);
        setIntField(term42032, term42032.getClass(), "_features", 0);
        setField(term42032, term42032.getClass(), "_ioContext", null);
        setField(term42032, term42032.getClass(), "_textBuffer", null);
        term42218 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term42316 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term42218, term42218.getClass(), "_bufferRecycler", term42316);
        term42492 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term42493 = (int[]) newIntArray(16);
        Object term42494 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term42495 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term42496 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term42497 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        Object term42498 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term42492, term42492.getClass(), "_objectCodec", null);
        setField(term42492, term42492.getClass(), "_symbols", null);
        setField(term42492, term42492.getClass(), "_quadBuffer", term42493);
        setBooleanField(term42492, term42492.getClass(), "_tokenIncomplete", false);
        setIntField(term42492, term42492.getClass(), "_quad1", 0);
        setField(term42492, term42492.getClass(), "_inputStream", null);
        setField(term42492, term42492.getClass(), "_inputBuffer", null);
        setBooleanField(term42492, term42492.getClass(), "_bufferRecyclable", false);
        setField(term42494, term42494.getClass(), "_sourceRef", null);
        setField(term42494, term42494.getClass(), "_encoding", null);
        setBooleanField(term42494, term42494.getClass(), "_managedResource", false);
        setField(term42495, term42495.getClass(), "_byteBuffers", null);
        setField(term42495, term42495.getClass(), "_charBuffers", null);
        setField(term42494, term42494.getClass(), "_bufferRecycler", term42495);
        setField(term42494, term42494.getClass(), "_readIOBuffer", null);
        setField(term42494, term42494.getClass(), "_writeEncodingBuffer", null);
        setField(term42494, term42494.getClass(), "_base64Buffer", null);
        setField(term42494, term42494.getClass(), "_tokenCBuffer", null);
        setField(term42494, term42494.getClass(), "_concatCBuffer", null);
        setField(term42494, term42494.getClass(), "_nameCopyBuffer", null);
        setField(term42492, term42492.getClass(), "_ioContext", term42494);
        setBooleanField(term42492, term42492.getClass(), "_closed", false);
        setIntField(term42492, term42492.getClass(), "_inputPtr", 0);
        setIntField(term42492, term42492.getClass(), "_inputEnd", 0);
        setLongField(term42492, term42492.getClass(), "_currInputProcessed", 0L);
        setIntField(term42492, term42492.getClass(), "_currInputRow", 1);
        setIntField(term42492, term42492.getClass(), "_currInputRowStart", 0);
        setLongField(term42492, term42492.getClass(), "_tokenInputTotal", 0L);
        setIntField(term42492, term42492.getClass(), "_tokenInputRow", 1);
        setIntField(term42492, term42492.getClass(), "_tokenInputCol", 0);
        setField(term42496, term42496.getClass(), "_parent", null);
        setField(term42497, term42497.getClass(), "_source", term42492);
        setField(term42497, term42497.getClass(), "_firstName", null);
        setField(term42497, term42497.getClass(), "_secondName", null);
        setField(term42497, term42497.getClass(), "_seen", null);
        setField(term42496, term42496.getClass(), "_dups", term42497);
        setIntField(term42496, term42496.getClass(), "_lineNr", 1);
        setIntField(term42496, term42496.getClass(), "_columnNr", 0);
        setField(term42496, term42496.getClass(), "_currentName", null);
        setField(term42496, term42496.getClass(), "_child", null);
        setIntField(term42496, term42496.getClass(), "_type", 0);
        setIntField(term42496, term42496.getClass(), "_index", -1);
        setField(term42492, term42492.getClass(), "_parsingContext", term42496);
        setField(term42492, term42492.getClass(), "_nextToken", null);
        setField(term42498, term42498.getClass(), "_allocator", term42495);
        setField(term42498, term42498.getClass(), "_inputBuffer", null);
        setIntField(term42498, term42498.getClass(), "_inputStart", 0);
        setIntField(term42498, term42498.getClass(), "_inputLen", 0);
        setField(term42498, term42498.getClass(), "_segments", null);
        setBooleanField(term42498, term42498.getClass(), "_hasSegments", false);
        setIntField(term42498, term42498.getClass(), "_segmentSize", 0);
        setField(term42498, term42498.getClass(), "_currentSegment", null);
        setIntField(term42498, term42498.getClass(), "_currentSize", 0);
        setField(term42498, term42498.getClass(), "_resultString", null);
        setField(term42498, term42498.getClass(), "_resultArray", null);
        setField(term42492, term42492.getClass(), "_textBuffer", term42498);
        setField(term42492, term42492.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term42492, term42492.getClass(), "_nameCopied", false);
        setField(term42492, term42492.getClass(), "_byteArrayBuilder", null);
        setField(term42492, term42492.getClass(), "_binaryValue", null);
        setIntField(term42492, term42492.getClass(), "_numTypesValid", 0);
        setIntField(term42492, term42492.getClass(), "_numberInt", 0);
        setLongField(term42492, term42492.getClass(), "_numberLong", 0L);
        setDoubleField(term42492, term42492.getClass(), "_numberDouble", 0.0);
        setField(term42492, term42492.getClass(), "_numberBigInt", null);
        setField(term42492, term42492.getClass(), "_numberBigDecimal", null);
        setBooleanField(term42492, term42492.getClass(), "_numberNegative", false);
        setIntField(term42492, term42492.getClass(), "_intLength", 0);
        setIntField(term42492, term42492.getClass(), "_fractLength", 0);
        setIntField(term42492, term42492.getClass(), "_expLength", 0);
        setField(term42492, term42492.getClass(), "_currToken", null);
        setField(term42492, term42492.getClass(), "_lastClearedToken", null);
        setIntField(term42492, term42492.getClass(), "_features", -1);
        term42499 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term42500 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term42499, term42499.getClass(), "_sourceRef", null);
        setField(term42499, term42499.getClass(), "_encoding", null);
        setBooleanField(term42499, term42499.getClass(), "_managedResource", false);
        setField(term42500, term42500.getClass(), "_byteBuffers", null);
        setField(term42500, term42500.getClass(), "_charBuffers", null);
        setField(term42499, term42499.getClass(), "_bufferRecycler", term42500);
        setField(term42499, term42499.getClass(), "_readIOBuffer", null);
        setField(term42499, term42499.getClass(), "_writeEncodingBuffer", null);
        setField(term42499, term42499.getClass(), "_base64Buffer", null);
        setField(term42499, term42499.getClass(), "_tokenCBuffer", null);
        setField(term42499, term42499.getClass(), "_concatCBuffer", null);
        setField(term42499, term42499.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.InputStream");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer");
        argTypes[5] = Array.newInstance(byte.class, 0).getClass();
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term42218;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42492));
        assertTrue(recursiveEquals(term42218, term42499));
    }

};


