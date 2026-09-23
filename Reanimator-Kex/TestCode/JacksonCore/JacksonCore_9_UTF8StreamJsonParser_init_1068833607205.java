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

public class UTF8StreamJsonParser_init_1068833607205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45764;
     Object term45935;
     Object term45941;

    public UTF8StreamJsonParser_init_1068833607205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45680 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setIntField(term45680, term45680.getClass(), "_features", 0);
        setIntField(term45680, term45680.getClass(), "_inputPtr", 0);
        setIntField(term45680, term45680.getClass(), "_inputEnd", 0);
        setLongField(term45680, term45680.getClass(), "_currInputProcessed", 0L);
        setIntField(term45680, term45680.getClass(), "_currInputRow", 0);
        setIntField(term45680, term45680.getClass(), "_currInputRowStart", 0);
        setLongField(term45680, term45680.getClass(), "_tokenInputTotal", 0L);
        setIntField(term45680, term45680.getClass(), "_tokenInputRow", 0);
        setIntField(term45680, term45680.getClass(), "_tokenInputCol", 0);
        setField(term45680, term45680.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term45680, term45680.getClass(), "_nameCopied", false);
        setField(term45680, term45680.getClass(), "_byteArrayBuilder", null);
        setIntField(term45680, term45680.getClass(), "_numTypesValid", 0);
        setField(term45680, term45680.getClass(), "_ioContext", null);
        setField(term45680, term45680.getClass(), "_textBuffer", null);
        term45764 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term45764, term45764.getClass(), "_bufferRecycler", null);
        term45935 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term45936 = (int[]) newIntArray(16);
        Object term45937 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term45938 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term45939 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        Object term45940 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term45935, term45935.getClass(), "_objectCodec", null);
        setField(term45935, term45935.getClass(), "_symbols", null);
        setField(term45935, term45935.getClass(), "_quadBuffer", term45936);
        setBooleanField(term45935, term45935.getClass(), "_tokenIncomplete", false);
        setIntField(term45935, term45935.getClass(), "_quad1", 0);
        setField(term45935, term45935.getClass(), "_inputStream", null);
        setField(term45935, term45935.getClass(), "_inputBuffer", null);
        setBooleanField(term45935, term45935.getClass(), "_bufferRecyclable", false);
        setField(term45937, term45937.getClass(), "_sourceRef", null);
        setField(term45937, term45937.getClass(), "_encoding", null);
        setBooleanField(term45937, term45937.getClass(), "_managedResource", false);
        setField(term45937, term45937.getClass(), "_bufferRecycler", null);
        setField(term45937, term45937.getClass(), "_readIOBuffer", null);
        setField(term45937, term45937.getClass(), "_writeEncodingBuffer", null);
        setField(term45937, term45937.getClass(), "_base64Buffer", null);
        setField(term45937, term45937.getClass(), "_tokenCBuffer", null);
        setField(term45937, term45937.getClass(), "_concatCBuffer", null);
        setField(term45937, term45937.getClass(), "_nameCopyBuffer", null);
        setField(term45935, term45935.getClass(), "_ioContext", term45937);
        setBooleanField(term45935, term45935.getClass(), "_closed", false);
        setIntField(term45935, term45935.getClass(), "_inputPtr", 0);
        setIntField(term45935, term45935.getClass(), "_inputEnd", 0);
        setLongField(term45935, term45935.getClass(), "_currInputProcessed", 0L);
        setIntField(term45935, term45935.getClass(), "_currInputRow", 1);
        setIntField(term45935, term45935.getClass(), "_currInputRowStart", 0);
        setLongField(term45935, term45935.getClass(), "_tokenInputTotal", 0L);
        setIntField(term45935, term45935.getClass(), "_tokenInputRow", 1);
        setIntField(term45935, term45935.getClass(), "_tokenInputCol", 0);
        setField(term45938, term45938.getClass(), "_parent", null);
        setField(term45939, term45939.getClass(), "_source", term45935);
        setField(term45939, term45939.getClass(), "_firstName", null);
        setField(term45939, term45939.getClass(), "_secondName", null);
        setField(term45939, term45939.getClass(), "_seen", null);
        setField(term45938, term45938.getClass(), "_dups", term45939);
        setField(term45938, term45938.getClass(), "_child", null);
        setField(term45938, term45938.getClass(), "_currentName", null);
        setField(term45938, term45938.getClass(), "_currentValue", null);
        setIntField(term45938, term45938.getClass(), "_lineNr", 1);
        setIntField(term45938, term45938.getClass(), "_columnNr", 0);
        setIntField(term45938, term45938.getClass(), "_type", 0);
        setIntField(term45938, term45938.getClass(), "_index", -1);
        setField(term45935, term45935.getClass(), "_parsingContext", term45938);
        setField(term45935, term45935.getClass(), "_nextToken", null);
        setField(term45940, term45940.getClass(), "_allocator", null);
        setField(term45940, term45940.getClass(), "_inputBuffer", null);
        setIntField(term45940, term45940.getClass(), "_inputStart", 0);
        setIntField(term45940, term45940.getClass(), "_inputLen", 0);
        setField(term45940, term45940.getClass(), "_segments", null);
        setBooleanField(term45940, term45940.getClass(), "_hasSegments", false);
        setIntField(term45940, term45940.getClass(), "_segmentSize", 0);
        setField(term45940, term45940.getClass(), "_currentSegment", null);
        setIntField(term45940, term45940.getClass(), "_currentSize", 0);
        setField(term45940, term45940.getClass(), "_resultString", null);
        setField(term45940, term45940.getClass(), "_resultArray", null);
        setField(term45935, term45935.getClass(), "_textBuffer", term45940);
        setField(term45935, term45935.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term45935, term45935.getClass(), "_nameCopied", false);
        setField(term45935, term45935.getClass(), "_byteArrayBuilder", null);
        setField(term45935, term45935.getClass(), "_binaryValue", null);
        setIntField(term45935, term45935.getClass(), "_numTypesValid", 0);
        setIntField(term45935, term45935.getClass(), "_numberInt", 0);
        setLongField(term45935, term45935.getClass(), "_numberLong", 0L);
        setDoubleField(term45935, term45935.getClass(), "_numberDouble", 0.0);
        setField(term45935, term45935.getClass(), "_numberBigInt", null);
        setField(term45935, term45935.getClass(), "_numberBigDecimal", null);
        setBooleanField(term45935, term45935.getClass(), "_numberNegative", false);
        setIntField(term45935, term45935.getClass(), "_intLength", 0);
        setIntField(term45935, term45935.getClass(), "_fractLength", 0);
        setIntField(term45935, term45935.getClass(), "_expLength", 0);
        setField(term45935, term45935.getClass(), "_currToken", null);
        setField(term45935, term45935.getClass(), "_lastClearedToken", null);
        setIntField(term45935, term45935.getClass(), "_features", -1);
        term45941 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term45941, term45941.getClass(), "_sourceRef", null);
        setField(term45941, term45941.getClass(), "_encoding", null);
        setBooleanField(term45941, term45941.getClass(), "_managedResource", false);
        setField(term45941, term45941.getClass(), "_bufferRecycler", null);
        setField(term45941, term45941.getClass(), "_readIOBuffer", null);
        setField(term45941, term45941.getClass(), "_writeEncodingBuffer", null);
        setField(term45941, term45941.getClass(), "_base64Buffer", null);
        setField(term45941, term45941.getClass(), "_tokenCBuffer", null);
        setField(term45941, term45941.getClass(), "_concatCBuffer", null);
        setField(term45941, term45941.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term45764;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45935));
        assertTrue(recursiveEquals(term45764, -1));
    }

};


