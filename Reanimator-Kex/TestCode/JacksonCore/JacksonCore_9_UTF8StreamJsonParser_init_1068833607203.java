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

public class UTF8StreamJsonParser_init_1068833607203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44996;
     Object term45102;
     Object term45107;

    public UTF8StreamJsonParser_init_1068833607203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44726 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term44828 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term44912 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term44726, term44726.getClass(), "_features", 0);
        setIntField(term44726, term44726.getClass(), "_inputPtr", 0);
        setIntField(term44726, term44726.getClass(), "_inputEnd", 0);
        setLongField(term44726, term44726.getClass(), "_currInputProcessed", 0L);
        setIntField(term44726, term44726.getClass(), "_currInputRow", 0);
        setIntField(term44726, term44726.getClass(), "_currInputRowStart", 0);
        setLongField(term44726, term44726.getClass(), "_tokenInputTotal", 0L);
        setIntField(term44726, term44726.getClass(), "_tokenInputRow", 0);
        setIntField(term44726, term44726.getClass(), "_tokenInputCol", 0);
        setField(term44726, term44726.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term44726, term44726.getClass(), "_nameCopied", false);
        setField(term44726, term44726.getClass(), "_byteArrayBuilder", term44828);
        setIntField(term44726, term44726.getClass(), "_numTypesValid", 0);
        setField(term44726, term44726.getClass(), "_ioContext", term44912);
        term44996 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term45102 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term45103 = (int[]) newIntArray(16);
        Object term45104 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term45105 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term45106 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term45102, term45102.getClass(), "_objectCodec", null);
        setField(term45102, term45102.getClass(), "_symbols", null);
        setField(term45102, term45102.getClass(), "_quadBuffer", term45103);
        setBooleanField(term45102, term45102.getClass(), "_tokenIncomplete", false);
        setIntField(term45102, term45102.getClass(), "_quad1", 0);
        setField(term45102, term45102.getClass(), "_inputStream", null);
        setField(term45102, term45102.getClass(), "_inputBuffer", null);
        setBooleanField(term45102, term45102.getClass(), "_bufferRecyclable", false);
        setField(term45104, term45104.getClass(), "_sourceRef", null);
        setField(term45104, term45104.getClass(), "_encoding", null);
        setBooleanField(term45104, term45104.getClass(), "_managedResource", false);
        setField(term45104, term45104.getClass(), "_bufferRecycler", null);
        setField(term45104, term45104.getClass(), "_readIOBuffer", null);
        setField(term45104, term45104.getClass(), "_writeEncodingBuffer", null);
        setField(term45104, term45104.getClass(), "_base64Buffer", null);
        setField(term45104, term45104.getClass(), "_tokenCBuffer", null);
        setField(term45104, term45104.getClass(), "_concatCBuffer", null);
        setField(term45104, term45104.getClass(), "_nameCopyBuffer", null);
        setField(term45102, term45102.getClass(), "_ioContext", term45104);
        setBooleanField(term45102, term45102.getClass(), "_closed", false);
        setIntField(term45102, term45102.getClass(), "_inputPtr", 0);
        setIntField(term45102, term45102.getClass(), "_inputEnd", 0);
        setLongField(term45102, term45102.getClass(), "_currInputProcessed", 0L);
        setIntField(term45102, term45102.getClass(), "_currInputRow", 1);
        setIntField(term45102, term45102.getClass(), "_currInputRowStart", 0);
        setLongField(term45102, term45102.getClass(), "_tokenInputTotal", 0L);
        setIntField(term45102, term45102.getClass(), "_tokenInputRow", 1);
        setIntField(term45102, term45102.getClass(), "_tokenInputCol", 0);
        setField(term45105, term45105.getClass(), "_parent", null);
        setField(term45105, term45105.getClass(), "_dups", null);
        setField(term45105, term45105.getClass(), "_child", null);
        setField(term45105, term45105.getClass(), "_currentName", null);
        setField(term45105, term45105.getClass(), "_currentValue", null);
        setIntField(term45105, term45105.getClass(), "_lineNr", 1);
        setIntField(term45105, term45105.getClass(), "_columnNr", 0);
        setIntField(term45105, term45105.getClass(), "_type", 0);
        setIntField(term45105, term45105.getClass(), "_index", -1);
        setField(term45102, term45102.getClass(), "_parsingContext", term45105);
        setField(term45102, term45102.getClass(), "_nextToken", null);
        setField(term45106, term45106.getClass(), "_allocator", null);
        setField(term45106, term45106.getClass(), "_inputBuffer", null);
        setIntField(term45106, term45106.getClass(), "_inputStart", 0);
        setIntField(term45106, term45106.getClass(), "_inputLen", 0);
        setField(term45106, term45106.getClass(), "_segments", null);
        setBooleanField(term45106, term45106.getClass(), "_hasSegments", false);
        setIntField(term45106, term45106.getClass(), "_segmentSize", 0);
        setField(term45106, term45106.getClass(), "_currentSegment", null);
        setIntField(term45106, term45106.getClass(), "_currentSize", 0);
        setField(term45106, term45106.getClass(), "_resultString", null);
        setField(term45106, term45106.getClass(), "_resultArray", null);
        setField(term45102, term45102.getClass(), "_textBuffer", term45106);
        setField(term45102, term45102.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term45102, term45102.getClass(), "_nameCopied", false);
        setField(term45102, term45102.getClass(), "_byteArrayBuilder", null);
        setField(term45102, term45102.getClass(), "_binaryValue", null);
        setIntField(term45102, term45102.getClass(), "_numTypesValid", 0);
        setIntField(term45102, term45102.getClass(), "_numberInt", 0);
        setLongField(term45102, term45102.getClass(), "_numberLong", 0L);
        setDoubleField(term45102, term45102.getClass(), "_numberDouble", 0.0);
        setField(term45102, term45102.getClass(), "_numberBigInt", null);
        setField(term45102, term45102.getClass(), "_numberBigDecimal", null);
        setBooleanField(term45102, term45102.getClass(), "_numberNegative", false);
        setIntField(term45102, term45102.getClass(), "_intLength", 0);
        setIntField(term45102, term45102.getClass(), "_fractLength", 0);
        setIntField(term45102, term45102.getClass(), "_expLength", 0);
        setField(term45102, term45102.getClass(), "_currToken", null);
        setField(term45102, term45102.getClass(), "_lastClearedToken", null);
        setIntField(term45102, term45102.getClass(), "_features", 0);
        term45107 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term45107, term45107.getClass(), "_sourceRef", null);
        setField(term45107, term45107.getClass(), "_encoding", null);
        setBooleanField(term45107, term45107.getClass(), "_managedResource", false);
        setField(term45107, term45107.getClass(), "_bufferRecycler", null);
        setField(term45107, term45107.getClass(), "_readIOBuffer", null);
        setField(term45107, term45107.getClass(), "_writeEncodingBuffer", null);
        setField(term45107, term45107.getClass(), "_base64Buffer", null);
        setField(term45107, term45107.getClass(), "_tokenCBuffer", null);
        setField(term45107, term45107.getClass(), "_concatCBuffer", null);
        setField(term45107, term45107.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term44996;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term45102));
        assertTrue(recursiveEquals(term44996, 0));
    }

};


