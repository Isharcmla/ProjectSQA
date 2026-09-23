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

public class NonBlockingJsonParser_init_1198526829133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16965;
     Object term17073;
     Object term17079;

    public NonBlockingJsonParser_init_1198526829133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16797 = newInstance(Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        Object term16881 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term16797, term16797.getClass(), "_features", 0);
        setIntField(term16797, term16797.getClass(), "_currInputRow", 0);
        setIntField(term16797, term16797.getClass(), "_tokenInputRow", 0);
        setIntField(term16797, term16797.getClass(), "_numTypesValid", 0);
        setField(term16797, term16797.getClass(), "_ioContext", term16881);
        term16965 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term17073 = newInstance(Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        byte[] term17074 = (byte[]) newByteArray(0);
        int[] term17075 = (int[]) newIntArray(8);
        Object term17076 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term17077 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term17078 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term17073, term17073.getClass(), "_inputBuffer", term17074);
        setIntField(term17073, term17073.getClass(), "_origBufferLen", 0);
        setField(term17073, term17073.getClass(), "_symbols", null);
        setField(term17073, term17073.getClass(), "_quadBuffer", term17075);
        setIntField(term17073, term17073.getClass(), "_quadLength", 0);
        setIntField(term17073, term17073.getClass(), "_quad1", 0);
        setIntField(term17073, term17073.getClass(), "_pending32", 0);
        setIntField(term17073, term17073.getClass(), "_pendingBytes", 0);
        setIntField(term17073, term17073.getClass(), "_quoted32", 0);
        setIntField(term17073, term17073.getClass(), "_quotedDigits", 0);
        setIntField(term17073, term17073.getClass(), "_majorState", 0);
        setIntField(term17073, term17073.getClass(), "_majorStateAfterValue", 1);
        setIntField(term17073, term17073.getClass(), "_minorState", 0);
        setIntField(term17073, term17073.getClass(), "_minorStateAfterSplit", 0);
        setBooleanField(term17073, term17073.getClass(), "_endOfInput", false);
        setIntField(term17073, term17073.getClass(), "_nonStdTokenType", 0);
        setIntField(term17073, term17073.getClass(), "_currBufferStart", 0);
        setIntField(term17073, term17073.getClass(), "_currInputRowAlt", 1);
        setField(term17076, term17076.getClass(), "_sourceRef", null);
        setField(term17076, term17076.getClass(), "_encoding", null);
        setBooleanField(term17076, term17076.getClass(), "_managedResource", false);
        setField(term17076, term17076.getClass(), "_bufferRecycler", null);
        setField(term17076, term17076.getClass(), "_readIOBuffer", null);
        setField(term17076, term17076.getClass(), "_writeEncodingBuffer", null);
        setField(term17076, term17076.getClass(), "_base64Buffer", null);
        setField(term17076, term17076.getClass(), "_tokenCBuffer", null);
        setField(term17076, term17076.getClass(), "_concatCBuffer", null);
        setField(term17076, term17076.getClass(), "_nameCopyBuffer", null);
        setField(term17073, term17073.getClass(), "_ioContext", term17076);
        setBooleanField(term17073, term17073.getClass(), "_closed", false);
        setIntField(term17073, term17073.getClass(), "_inputPtr", 0);
        setIntField(term17073, term17073.getClass(), "_inputEnd", 0);
        setLongField(term17073, term17073.getClass(), "_currInputProcessed", 0L);
        setIntField(term17073, term17073.getClass(), "_currInputRow", 1);
        setIntField(term17073, term17073.getClass(), "_currInputRowStart", 0);
        setLongField(term17073, term17073.getClass(), "_tokenInputTotal", 0L);
        setIntField(term17073, term17073.getClass(), "_tokenInputRow", 1);
        setIntField(term17073, term17073.getClass(), "_tokenInputCol", 0);
        setField(term17077, term17077.getClass(), "_parent", null);
        setField(term17077, term17077.getClass(), "_dups", null);
        setField(term17077, term17077.getClass(), "_child", null);
        setField(term17077, term17077.getClass(), "_currentName", null);
        setField(term17077, term17077.getClass(), "_currentValue", null);
        setIntField(term17077, term17077.getClass(), "_lineNr", 1);
        setIntField(term17077, term17077.getClass(), "_columnNr", 0);
        setIntField(term17077, term17077.getClass(), "_type", 0);
        setIntField(term17077, term17077.getClass(), "_index", -1);
        setField(term17073, term17073.getClass(), "_parsingContext", term17077);
        setField(term17073, term17073.getClass(), "_nextToken", null);
        setField(term17078, term17078.getClass(), "_allocator", null);
        setField(term17078, term17078.getClass(), "_inputBuffer", null);
        setIntField(term17078, term17078.getClass(), "_inputStart", 0);
        setIntField(term17078, term17078.getClass(), "_inputLen", 0);
        setField(term17078, term17078.getClass(), "_segments", null);
        setBooleanField(term17078, term17078.getClass(), "_hasSegments", false);
        setIntField(term17078, term17078.getClass(), "_segmentSize", 0);
        setField(term17078, term17078.getClass(), "_currentSegment", null);
        setIntField(term17078, term17078.getClass(), "_currentSize", 0);
        setField(term17078, term17078.getClass(), "_resultString", null);
        setField(term17078, term17078.getClass(), "_resultArray", null);
        setField(term17073, term17073.getClass(), "_textBuffer", term17078);
        setField(term17073, term17073.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term17073, term17073.getClass(), "_nameCopied", false);
        setField(term17073, term17073.getClass(), "_byteArrayBuilder", null);
        setField(term17073, term17073.getClass(), "_binaryValue", null);
        setIntField(term17073, term17073.getClass(), "_numTypesValid", 0);
        setIntField(term17073, term17073.getClass(), "_numberInt", 0);
        setLongField(term17073, term17073.getClass(), "_numberLong", 0L);
        setDoubleField(term17073, term17073.getClass(), "_numberDouble", 0.0);
        setField(term17073, term17073.getClass(), "_numberBigInt", null);
        setField(term17073, term17073.getClass(), "_numberBigDecimal", null);
        setBooleanField(term17073, term17073.getClass(), "_numberNegative", false);
        setIntField(term17073, term17073.getClass(), "_intLength", 0);
        setIntField(term17073, term17073.getClass(), "_fractLength", 0);
        setIntField(term17073, term17073.getClass(), "_expLength", 0);
        setField(term17073, term17073.getClass(), "_currToken", null);
        setField(term17073, term17073.getClass(), "_lastClearedToken", null);
        setIntField(term17073, term17073.getClass(), "_features", 0);
        setField(term17073, term17073.getClass(), "_requestPayload", null);
        term17079 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term17079, term17079.getClass(), "_sourceRef", null);
        setField(term17079, term17079.getClass(), "_encoding", null);
        setBooleanField(term17079, term17079.getClass(), "_managedResource", false);
        setField(term17079, term17079.getClass(), "_bufferRecycler", null);
        setField(term17079, term17079.getClass(), "_readIOBuffer", null);
        setField(term17079, term17079.getClass(), "_writeEncodingBuffer", null);
        setField(term17079, term17079.getClass(), "_base64Buffer", null);
        setField(term17079, term17079.getClass(), "_tokenCBuffer", null);
        setField(term17079, term17079.getClass(), "_concatCBuffer", null);
        setField(term17079, term17079.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer");
        Object[] args = new Object[3];
        args[0] = term16965;
        args[1] = 0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17073));
        assertTrue(recursiveEquals(term16965, 0));
    }

};


