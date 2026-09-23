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

public class UTF8StreamJsonParser_init_1068833607207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45238;
     Object term45600;
     Object term45605;

    public UTF8StreamJsonParser_init_1068833607207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44968 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term45070 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term45154 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term44968, term44968.getClass(), "_features", 0);
        setIntField(term44968, term44968.getClass(), "_inputPtr", 0);
        setIntField(term44968, term44968.getClass(), "_inputEnd", 0);
        setLongField(term44968, term44968.getClass(), "_currInputProcessed", 0L);
        setIntField(term44968, term44968.getClass(), "_currInputRow", 0);
        setIntField(term44968, term44968.getClass(), "_currInputRowStart", 0);
        setLongField(term44968, term44968.getClass(), "_tokenInputTotal", 0L);
        setIntField(term44968, term44968.getClass(), "_tokenInputRow", 0);
        setIntField(term44968, term44968.getClass(), "_tokenInputCol", 0);
        setField(term44968, term44968.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term44968, term44968.getClass(), "_nameCopied", false);
        setField(term44968, term44968.getClass(), "_byteArrayBuilder", term45070);
        setIntField(term44968, term44968.getClass(), "_numTypesValid", 0);
        setField(term44968, term44968.getClass(), "_ioContext", term45154);
        term45238 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term45600 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term45601 = (int[]) newIntArray(16);
        Object term45602 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term45603 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term45604 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term45600, term45600.getClass(), "_objectCodec", null);
        setField(term45600, term45600.getClass(), "_symbols", null);
        setField(term45600, term45600.getClass(), "_quadBuffer", term45601);
        setBooleanField(term45600, term45600.getClass(), "_tokenIncomplete", false);
        setIntField(term45600, term45600.getClass(), "_quad1", 0);
        setLongField(term45600, term45600.getClass(), "_nameInputTotal", 0L);
        setIntField(term45600, term45600.getClass(), "_nameInputRow", 0);
        setIntField(term45600, term45600.getClass(), "_nameInputCol", 0);
        setField(term45600, term45600.getClass(), "_inputStream", null);
        setField(term45600, term45600.getClass(), "_inputBuffer", null);
        setBooleanField(term45600, term45600.getClass(), "_bufferRecyclable", false);
        setField(term45602, term45602.getClass(), "_sourceRef", null);
        setField(term45602, term45602.getClass(), "_encoding", null);
        setBooleanField(term45602, term45602.getClass(), "_managedResource", false);
        setField(term45602, term45602.getClass(), "_bufferRecycler", null);
        setField(term45602, term45602.getClass(), "_readIOBuffer", null);
        setField(term45602, term45602.getClass(), "_writeEncodingBuffer", null);
        setField(term45602, term45602.getClass(), "_base64Buffer", null);
        setField(term45602, term45602.getClass(), "_tokenCBuffer", null);
        setField(term45602, term45602.getClass(), "_concatCBuffer", null);
        setField(term45602, term45602.getClass(), "_nameCopyBuffer", null);
        setField(term45600, term45600.getClass(), "_ioContext", term45602);
        setBooleanField(term45600, term45600.getClass(), "_closed", false);
        setIntField(term45600, term45600.getClass(), "_inputPtr", 0);
        setIntField(term45600, term45600.getClass(), "_inputEnd", 0);
        setLongField(term45600, term45600.getClass(), "_currInputProcessed", 0L);
        setIntField(term45600, term45600.getClass(), "_currInputRow", 1);
        setIntField(term45600, term45600.getClass(), "_currInputRowStart", 0);
        setLongField(term45600, term45600.getClass(), "_tokenInputTotal", 0L);
        setIntField(term45600, term45600.getClass(), "_tokenInputRow", 1);
        setIntField(term45600, term45600.getClass(), "_tokenInputCol", 0);
        setField(term45603, term45603.getClass(), "_parent", null);
        setField(term45603, term45603.getClass(), "_dups", null);
        setField(term45603, term45603.getClass(), "_child", null);
        setField(term45603, term45603.getClass(), "_currentName", null);
        setField(term45603, term45603.getClass(), "_currentValue", null);
        setIntField(term45603, term45603.getClass(), "_lineNr", 1);
        setIntField(term45603, term45603.getClass(), "_columnNr", 0);
        setIntField(term45603, term45603.getClass(), "_type", 0);
        setIntField(term45603, term45603.getClass(), "_index", -1);
        setField(term45600, term45600.getClass(), "_parsingContext", term45603);
        setField(term45600, term45600.getClass(), "_nextToken", null);
        setField(term45604, term45604.getClass(), "_allocator", null);
        setField(term45604, term45604.getClass(), "_inputBuffer", null);
        setIntField(term45604, term45604.getClass(), "_inputStart", 0);
        setIntField(term45604, term45604.getClass(), "_inputLen", 0);
        setField(term45604, term45604.getClass(), "_segments", null);
        setBooleanField(term45604, term45604.getClass(), "_hasSegments", false);
        setIntField(term45604, term45604.getClass(), "_segmentSize", 0);
        setField(term45604, term45604.getClass(), "_currentSegment", null);
        setIntField(term45604, term45604.getClass(), "_currentSize", 0);
        setField(term45604, term45604.getClass(), "_resultString", null);
        setField(term45604, term45604.getClass(), "_resultArray", null);
        setField(term45600, term45600.getClass(), "_textBuffer", term45604);
        setField(term45600, term45600.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term45600, term45600.getClass(), "_nameCopied", false);
        setField(term45600, term45600.getClass(), "_byteArrayBuilder", null);
        setField(term45600, term45600.getClass(), "_binaryValue", null);
        setIntField(term45600, term45600.getClass(), "_numTypesValid", 0);
        setIntField(term45600, term45600.getClass(), "_numberInt", 0);
        setLongField(term45600, term45600.getClass(), "_numberLong", 0L);
        setDoubleField(term45600, term45600.getClass(), "_numberDouble", 0.0);
        setField(term45600, term45600.getClass(), "_numberBigInt", null);
        setField(term45600, term45600.getClass(), "_numberBigDecimal", null);
        setBooleanField(term45600, term45600.getClass(), "_numberNegative", false);
        setIntField(term45600, term45600.getClass(), "_intLength", 0);
        setIntField(term45600, term45600.getClass(), "_fractLength", 0);
        setIntField(term45600, term45600.getClass(), "_expLength", 0);
        setField(term45600, term45600.getClass(), "_currToken", null);
        setField(term45600, term45600.getClass(), "_lastClearedToken", null);
        setIntField(term45600, term45600.getClass(), "_features", 0);
        term45605 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term45605, term45605.getClass(), "_sourceRef", null);
        setField(term45605, term45605.getClass(), "_encoding", null);
        setBooleanField(term45605, term45605.getClass(), "_managedResource", false);
        setField(term45605, term45605.getClass(), "_bufferRecycler", null);
        setField(term45605, term45605.getClass(), "_readIOBuffer", null);
        setField(term45605, term45605.getClass(), "_writeEncodingBuffer", null);
        setField(term45605, term45605.getClass(), "_base64Buffer", null);
        setField(term45605, term45605.getClass(), "_tokenCBuffer", null);
        setField(term45605, term45605.getClass(), "_concatCBuffer", null);
        setField(term45605, term45605.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.InputStream");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        argTypes[5] = Array.newInstance(byte.class, 0).getClass();
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term45238;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45600));
        assertTrue(recursiveEquals(term45238, 0));
    }

};


