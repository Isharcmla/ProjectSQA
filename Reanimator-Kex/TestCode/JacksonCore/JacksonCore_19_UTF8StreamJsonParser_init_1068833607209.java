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

public class UTF8StreamJsonParser_init_1068833607209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46174;
     Object term46354;
     Object term46360;

    public UTF8StreamJsonParser_init_1068833607209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46090 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setIntField(term46090, term46090.getClass(), "_features", 0);
        setIntField(term46090, term46090.getClass(), "_currInputRow", 0);
        setIntField(term46090, term46090.getClass(), "_tokenInputRow", 0);
        setIntField(term46090, term46090.getClass(), "_numTypesValid", 0);
        setField(term46090, term46090.getClass(), "_ioContext", null);
        setField(term46090, term46090.getClass(), "_textBuffer", null);
        term46174 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term46174, term46174.getClass(), "_bufferRecycler", null);
        term46354 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term46355 = (int[]) newIntArray(16);
        Object term46356 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term46357 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term46358 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        Object term46359 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term46354, term46354.getClass(), "_objectCodec", null);
        setField(term46354, term46354.getClass(), "_symbols", null);
        setField(term46354, term46354.getClass(), "_quadBuffer", term46355);
        setBooleanField(term46354, term46354.getClass(), "_tokenIncomplete", false);
        setIntField(term46354, term46354.getClass(), "_quad1", 0);
        setIntField(term46354, term46354.getClass(), "_nameStartOffset", 0);
        setIntField(term46354, term46354.getClass(), "_nameStartRow", 0);
        setIntField(term46354, term46354.getClass(), "_nameStartCol", 0);
        setField(term46354, term46354.getClass(), "_inputStream", null);
        setField(term46354, term46354.getClass(), "_inputBuffer", null);
        setBooleanField(term46354, term46354.getClass(), "_bufferRecyclable", false);
        setField(term46356, term46356.getClass(), "_sourceRef", null);
        setField(term46356, term46356.getClass(), "_encoding", null);
        setBooleanField(term46356, term46356.getClass(), "_managedResource", false);
        setField(term46356, term46356.getClass(), "_bufferRecycler", null);
        setField(term46356, term46356.getClass(), "_readIOBuffer", null);
        setField(term46356, term46356.getClass(), "_writeEncodingBuffer", null);
        setField(term46356, term46356.getClass(), "_base64Buffer", null);
        setField(term46356, term46356.getClass(), "_tokenCBuffer", null);
        setField(term46356, term46356.getClass(), "_concatCBuffer", null);
        setField(term46356, term46356.getClass(), "_nameCopyBuffer", null);
        setField(term46354, term46354.getClass(), "_ioContext", term46356);
        setBooleanField(term46354, term46354.getClass(), "_closed", false);
        setIntField(term46354, term46354.getClass(), "_inputPtr", 0);
        setIntField(term46354, term46354.getClass(), "_inputEnd", 0);
        setLongField(term46354, term46354.getClass(), "_currInputProcessed", 0L);
        setIntField(term46354, term46354.getClass(), "_currInputRow", 1);
        setIntField(term46354, term46354.getClass(), "_currInputRowStart", 0);
        setLongField(term46354, term46354.getClass(), "_tokenInputTotal", 0L);
        setIntField(term46354, term46354.getClass(), "_tokenInputRow", 1);
        setIntField(term46354, term46354.getClass(), "_tokenInputCol", 0);
        setField(term46357, term46357.getClass(), "_parent", null);
        setField(term46358, term46358.getClass(), "_source", term46354);
        setField(term46358, term46358.getClass(), "_firstName", null);
        setField(term46358, term46358.getClass(), "_secondName", null);
        setField(term46358, term46358.getClass(), "_seen", null);
        setField(term46357, term46357.getClass(), "_dups", term46358);
        setField(term46357, term46357.getClass(), "_child", null);
        setField(term46357, term46357.getClass(), "_currentName", null);
        setField(term46357, term46357.getClass(), "_currentValue", null);
        setIntField(term46357, term46357.getClass(), "_lineNr", 1);
        setIntField(term46357, term46357.getClass(), "_columnNr", 0);
        setIntField(term46357, term46357.getClass(), "_type", 0);
        setIntField(term46357, term46357.getClass(), "_index", -1);
        setField(term46354, term46354.getClass(), "_parsingContext", term46357);
        setField(term46354, term46354.getClass(), "_nextToken", null);
        setField(term46359, term46359.getClass(), "_allocator", null);
        setField(term46359, term46359.getClass(), "_inputBuffer", null);
        setIntField(term46359, term46359.getClass(), "_inputStart", 0);
        setIntField(term46359, term46359.getClass(), "_inputLen", 0);
        setField(term46359, term46359.getClass(), "_segments", null);
        setBooleanField(term46359, term46359.getClass(), "_hasSegments", false);
        setIntField(term46359, term46359.getClass(), "_segmentSize", 0);
        setField(term46359, term46359.getClass(), "_currentSegment", null);
        setIntField(term46359, term46359.getClass(), "_currentSize", 0);
        setField(term46359, term46359.getClass(), "_resultString", null);
        setField(term46359, term46359.getClass(), "_resultArray", null);
        setField(term46354, term46354.getClass(), "_textBuffer", term46359);
        setField(term46354, term46354.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term46354, term46354.getClass(), "_nameCopied", false);
        setField(term46354, term46354.getClass(), "_byteArrayBuilder", null);
        setField(term46354, term46354.getClass(), "_binaryValue", null);
        setIntField(term46354, term46354.getClass(), "_numTypesValid", 0);
        setIntField(term46354, term46354.getClass(), "_numberInt", 0);
        setLongField(term46354, term46354.getClass(), "_numberLong", 0L);
        setDoubleField(term46354, term46354.getClass(), "_numberDouble", 0.0);
        setField(term46354, term46354.getClass(), "_numberBigInt", null);
        setField(term46354, term46354.getClass(), "_numberBigDecimal", null);
        setBooleanField(term46354, term46354.getClass(), "_numberNegative", false);
        setIntField(term46354, term46354.getClass(), "_intLength", 0);
        setIntField(term46354, term46354.getClass(), "_fractLength", 0);
        setIntField(term46354, term46354.getClass(), "_expLength", 0);
        setField(term46354, term46354.getClass(), "_currToken", null);
        setField(term46354, term46354.getClass(), "_lastClearedToken", null);
        setIntField(term46354, term46354.getClass(), "_features", -1);
        term46360 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term46360, term46360.getClass(), "_sourceRef", null);
        setField(term46360, term46360.getClass(), "_encoding", null);
        setBooleanField(term46360, term46360.getClass(), "_managedResource", false);
        setField(term46360, term46360.getClass(), "_bufferRecycler", null);
        setField(term46360, term46360.getClass(), "_readIOBuffer", null);
        setField(term46360, term46360.getClass(), "_writeEncodingBuffer", null);
        setField(term46360, term46360.getClass(), "_base64Buffer", null);
        setField(term46360, term46360.getClass(), "_tokenCBuffer", null);
        setField(term46360, term46360.getClass(), "_concatCBuffer", null);
        setField(term46360, term46360.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term46174;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46354));
        assertTrue(recursiveEquals(term46174, -1));
    }

};


