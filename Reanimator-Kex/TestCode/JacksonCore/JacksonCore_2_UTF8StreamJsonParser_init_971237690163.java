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

public class UTF8StreamJsonParser_init_971237690163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20562;
     Object term20636;
     Object term20641;

    public UTF8StreamJsonParser_init_971237690163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20394 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term20478 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term20394, term20394.getClass(), "_inputPtr", 0);
        setIntField(term20394, term20394.getClass(), "_inputEnd", 0);
        setLongField(term20394, term20394.getClass(), "_currInputProcessed", 0L);
        setIntField(term20394, term20394.getClass(), "_currInputRow", 0);
        setIntField(term20394, term20394.getClass(), "_currInputRowStart", 0);
        setLongField(term20394, term20394.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20394, term20394.getClass(), "_tokenInputRow", 0);
        setIntField(term20394, term20394.getClass(), "_tokenInputCol", 0);
        setField(term20394, term20394.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20394, term20394.getClass(), "_nameCopied", false);
        setField(term20394, term20394.getClass(), "_byteArrayBuilder", null);
        setIntField(term20394, term20394.getClass(), "_numTypesValid", 0);
        setIntField(term20394, term20394.getClass(), "_features", 0);
        setField(term20394, term20394.getClass(), "_ioContext", term20478);
        term20562 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term20636 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term20637 = (int[]) newIntArray(16);
        Object term20638 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term20639 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term20640 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term20636, term20636.getClass(), "_objectCodec", null);
        setField(term20636, term20636.getClass(), "_symbols", null);
        setField(term20636, term20636.getClass(), "_quadBuffer", term20637);
        setBooleanField(term20636, term20636.getClass(), "_tokenIncomplete", false);
        setIntField(term20636, term20636.getClass(), "_quad1", 0);
        setField(term20636, term20636.getClass(), "_inputStream", null);
        setField(term20636, term20636.getClass(), "_inputBuffer", null);
        setBooleanField(term20636, term20636.getClass(), "_bufferRecyclable", false);
        setField(term20638, term20638.getClass(), "_sourceRef", null);
        setField(term20638, term20638.getClass(), "_encoding", null);
        setBooleanField(term20638, term20638.getClass(), "_managedResource", false);
        setField(term20638, term20638.getClass(), "_bufferRecycler", null);
        setField(term20638, term20638.getClass(), "_readIOBuffer", null);
        setField(term20638, term20638.getClass(), "_writeEncodingBuffer", null);
        setField(term20638, term20638.getClass(), "_base64Buffer", null);
        setField(term20638, term20638.getClass(), "_tokenCBuffer", null);
        setField(term20638, term20638.getClass(), "_concatCBuffer", null);
        setField(term20638, term20638.getClass(), "_nameCopyBuffer", null);
        setField(term20636, term20636.getClass(), "_ioContext", term20638);
        setBooleanField(term20636, term20636.getClass(), "_closed", false);
        setIntField(term20636, term20636.getClass(), "_inputPtr", 0);
        setIntField(term20636, term20636.getClass(), "_inputEnd", 0);
        setLongField(term20636, term20636.getClass(), "_currInputProcessed", 0L);
        setIntField(term20636, term20636.getClass(), "_currInputRow", 1);
        setIntField(term20636, term20636.getClass(), "_currInputRowStart", 0);
        setLongField(term20636, term20636.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20636, term20636.getClass(), "_tokenInputRow", 1);
        setIntField(term20636, term20636.getClass(), "_tokenInputCol", 0);
        setField(term20639, term20639.getClass(), "_parent", null);
        setIntField(term20639, term20639.getClass(), "_lineNr", 1);
        setIntField(term20639, term20639.getClass(), "_columnNr", 0);
        setField(term20639, term20639.getClass(), "_currentName", null);
        setField(term20639, term20639.getClass(), "_child", null);
        setIntField(term20639, term20639.getClass(), "_type", 0);
        setIntField(term20639, term20639.getClass(), "_index", -1);
        setField(term20636, term20636.getClass(), "_parsingContext", term20639);
        setField(term20636, term20636.getClass(), "_nextToken", null);
        setField(term20640, term20640.getClass(), "_allocator", null);
        setField(term20640, term20640.getClass(), "_inputBuffer", null);
        setIntField(term20640, term20640.getClass(), "_inputStart", 0);
        setIntField(term20640, term20640.getClass(), "_inputLen", 0);
        setField(term20640, term20640.getClass(), "_segments", null);
        setBooleanField(term20640, term20640.getClass(), "_hasSegments", false);
        setIntField(term20640, term20640.getClass(), "_segmentSize", 0);
        setField(term20640, term20640.getClass(), "_currentSegment", null);
        setIntField(term20640, term20640.getClass(), "_currentSize", 0);
        setField(term20640, term20640.getClass(), "_resultString", null);
        setField(term20640, term20640.getClass(), "_resultArray", null);
        setField(term20636, term20636.getClass(), "_textBuffer", term20640);
        setField(term20636, term20636.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20636, term20636.getClass(), "_nameCopied", false);
        setField(term20636, term20636.getClass(), "_byteArrayBuilder", null);
        setField(term20636, term20636.getClass(), "_binaryValue", null);
        setIntField(term20636, term20636.getClass(), "_numTypesValid", 0);
        setIntField(term20636, term20636.getClass(), "_numberInt", 0);
        setLongField(term20636, term20636.getClass(), "_numberLong", 0L);
        setDoubleField(term20636, term20636.getClass(), "_numberDouble", 0.0);
        setField(term20636, term20636.getClass(), "_numberBigInt", null);
        setField(term20636, term20636.getClass(), "_numberBigDecimal", null);
        setBooleanField(term20636, term20636.getClass(), "_numberNegative", false);
        setIntField(term20636, term20636.getClass(), "_intLength", 0);
        setIntField(term20636, term20636.getClass(), "_fractLength", 0);
        setIntField(term20636, term20636.getClass(), "_expLength", 0);
        setField(term20636, term20636.getClass(), "_currToken", null);
        setField(term20636, term20636.getClass(), "_lastClearedToken", null);
        setIntField(term20636, term20636.getClass(), "_features", 0);
        term20641 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term20641, term20641.getClass(), "_sourceRef", null);
        setField(term20641, term20641.getClass(), "_encoding", null);
        setBooleanField(term20641, term20641.getClass(), "_managedResource", false);
        setField(term20641, term20641.getClass(), "_bufferRecycler", null);
        setField(term20641, term20641.getClass(), "_readIOBuffer", null);
        setField(term20641, term20641.getClass(), "_writeEncodingBuffer", null);
        setField(term20641, term20641.getClass(), "_base64Buffer", null);
        setField(term20641, term20641.getClass(), "_tokenCBuffer", null);
        setField(term20641, term20641.getClass(), "_concatCBuffer", null);
        setField(term20641, term20641.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term20562;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20636));
        assertTrue(recursiveEquals(term20562, term20641));
    }

};


