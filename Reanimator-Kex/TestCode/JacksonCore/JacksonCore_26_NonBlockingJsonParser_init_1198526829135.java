package com.fasterxml.jackson.core.json.async;

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
import static com.fasterxml.jackson.core.json.async.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.json.async.EqualityUtils.*;
import java.lang.Object;

public class NonBlockingJsonParser_init_1198526829135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17946;
     Object term18246;
     Object term18254;

    public NonBlockingJsonParser_init_1198526829135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17778 = newInstance(Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        Object term17862 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term17778, term17778.getClass(), "_features", 0);
        setIntField(term17778, term17778.getClass(), "_currInputRow", 0);
        setIntField(term17778, term17778.getClass(), "_tokenInputRow", 0);
        setIntField(term17778, term17778.getClass(), "_numTypesValid", 0);
        setField(term17778, term17778.getClass(), "_ioContext", term17862);
        setField(term17778, term17778.getClass(), "_textBuffer", null);
        term17946 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term18044 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term17946, term17946.getClass(), "_bufferRecycler", term18044);
        term18246 = newInstance(Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        byte[] term18247 = (byte[]) newByteArray(0);
        int[] term18248 = (int[]) newIntArray(8);
        Object term18249 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term18250 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term18251 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term18252 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        Object term18253 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term18246, term18246.getClass(), "_inputBuffer", term18247);
        setIntField(term18246, term18246.getClass(), "_origBufferLen", 0);
        setField(term18246, term18246.getClass(), "_symbols", null);
        setField(term18246, term18246.getClass(), "_quadBuffer", term18248);
        setIntField(term18246, term18246.getClass(), "_quadLength", 0);
        setIntField(term18246, term18246.getClass(), "_quad1", 0);
        setIntField(term18246, term18246.getClass(), "_pending32", 0);
        setIntField(term18246, term18246.getClass(), "_pendingBytes", 0);
        setIntField(term18246, term18246.getClass(), "_quoted32", 0);
        setIntField(term18246, term18246.getClass(), "_quotedDigits", 0);
        setIntField(term18246, term18246.getClass(), "_majorState", 0);
        setIntField(term18246, term18246.getClass(), "_majorStateAfterValue", 1);
        setIntField(term18246, term18246.getClass(), "_minorState", 0);
        setIntField(term18246, term18246.getClass(), "_minorStateAfterSplit", 0);
        setBooleanField(term18246, term18246.getClass(), "_endOfInput", false);
        setIntField(term18246, term18246.getClass(), "_nonStdTokenType", 0);
        setIntField(term18246, term18246.getClass(), "_currBufferStart", 0);
        setIntField(term18246, term18246.getClass(), "_currInputRowAlt", 1);
        setField(term18249, term18249.getClass(), "_sourceRef", null);
        setField(term18249, term18249.getClass(), "_encoding", null);
        setBooleanField(term18249, term18249.getClass(), "_managedResource", false);
        setField(term18250, term18250.getClass(), "_byteBuffers", null);
        setField(term18250, term18250.getClass(), "_charBuffers", null);
        setField(term18249, term18249.getClass(), "_bufferRecycler", term18250);
        setField(term18249, term18249.getClass(), "_readIOBuffer", null);
        setField(term18249, term18249.getClass(), "_writeEncodingBuffer", null);
        setField(term18249, term18249.getClass(), "_base64Buffer", null);
        setField(term18249, term18249.getClass(), "_tokenCBuffer", null);
        setField(term18249, term18249.getClass(), "_concatCBuffer", null);
        setField(term18249, term18249.getClass(), "_nameCopyBuffer", null);
        setField(term18246, term18246.getClass(), "_ioContext", term18249);
        setBooleanField(term18246, term18246.getClass(), "_closed", false);
        setIntField(term18246, term18246.getClass(), "_inputPtr", 0);
        setIntField(term18246, term18246.getClass(), "_inputEnd", 0);
        setLongField(term18246, term18246.getClass(), "_currInputProcessed", 0L);
        setIntField(term18246, term18246.getClass(), "_currInputRow", 1);
        setIntField(term18246, term18246.getClass(), "_currInputRowStart", 0);
        setLongField(term18246, term18246.getClass(), "_tokenInputTotal", 0L);
        setIntField(term18246, term18246.getClass(), "_tokenInputRow", 1);
        setIntField(term18246, term18246.getClass(), "_tokenInputCol", 0);
        setField(term18251, term18251.getClass(), "_parent", null);
        setField(term18252, term18252.getClass(), "_source", term18246);
        setField(term18252, term18252.getClass(), "_firstName", null);
        setField(term18252, term18252.getClass(), "_secondName", null);
        setField(term18252, term18252.getClass(), "_seen", null);
        setField(term18251, term18251.getClass(), "_dups", term18252);
        setField(term18251, term18251.getClass(), "_child", null);
        setField(term18251, term18251.getClass(), "_currentName", null);
        setField(term18251, term18251.getClass(), "_currentValue", null);
        setIntField(term18251, term18251.getClass(), "_lineNr", 1);
        setIntField(term18251, term18251.getClass(), "_columnNr", 0);
        setIntField(term18251, term18251.getClass(), "_type", 0);
        setIntField(term18251, term18251.getClass(), "_index", -1);
        setField(term18246, term18246.getClass(), "_parsingContext", term18251);
        setField(term18246, term18246.getClass(), "_nextToken", null);
        setField(term18253, term18253.getClass(), "_allocator", term18250);
        setField(term18253, term18253.getClass(), "_inputBuffer", null);
        setIntField(term18253, term18253.getClass(), "_inputStart", 0);
        setIntField(term18253, term18253.getClass(), "_inputLen", 0);
        setField(term18253, term18253.getClass(), "_segments", null);
        setBooleanField(term18253, term18253.getClass(), "_hasSegments", false);
        setIntField(term18253, term18253.getClass(), "_segmentSize", 0);
        setField(term18253, term18253.getClass(), "_currentSegment", null);
        setIntField(term18253, term18253.getClass(), "_currentSize", 0);
        setField(term18253, term18253.getClass(), "_resultString", null);
        setField(term18253, term18253.getClass(), "_resultArray", null);
        setField(term18246, term18246.getClass(), "_textBuffer", term18253);
        setField(term18246, term18246.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term18246, term18246.getClass(), "_nameCopied", false);
        setField(term18246, term18246.getClass(), "_byteArrayBuilder", null);
        setField(term18246, term18246.getClass(), "_binaryValue", null);
        setIntField(term18246, term18246.getClass(), "_numTypesValid", 0);
        setIntField(term18246, term18246.getClass(), "_numberInt", 0);
        setLongField(term18246, term18246.getClass(), "_numberLong", 0L);
        setDoubleField(term18246, term18246.getClass(), "_numberDouble", 0.0);
        setField(term18246, term18246.getClass(), "_numberBigInt", null);
        setField(term18246, term18246.getClass(), "_numberBigDecimal", null);
        setBooleanField(term18246, term18246.getClass(), "_numberNegative", false);
        setIntField(term18246, term18246.getClass(), "_intLength", 0);
        setIntField(term18246, term18246.getClass(), "_fractLength", 0);
        setIntField(term18246, term18246.getClass(), "_expLength", 0);
        setField(term18246, term18246.getClass(), "_currToken", null);
        setField(term18246, term18246.getClass(), "_lastClearedToken", null);
        setIntField(term18246, term18246.getClass(), "_features", -1);
        setField(term18246, term18246.getClass(), "_requestPayload", null);
        term18254 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term18255 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term18254, term18254.getClass(), "_sourceRef", null);
        setField(term18254, term18254.getClass(), "_encoding", null);
        setBooleanField(term18254, term18254.getClass(), "_managedResource", false);
        setField(term18255, term18255.getClass(), "_byteBuffers", null);
        setField(term18255, term18255.getClass(), "_charBuffers", null);
        setField(term18254, term18254.getClass(), "_bufferRecycler", term18255);
        setField(term18254, term18254.getClass(), "_readIOBuffer", null);
        setField(term18254, term18254.getClass(), "_writeEncodingBuffer", null);
        setField(term18254, term18254.getClass(), "_base64Buffer", null);
        setField(term18254, term18254.getClass(), "_tokenCBuffer", null);
        setField(term18254, term18254.getClass(), "_concatCBuffer", null);
        setField(term18254, term18254.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Object[] args = new Object[3];
        args[0] = term17946;
        args[1] = -1;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18246));
        assertTrue(recursiveEquals(term17946, -1));
    }

};


