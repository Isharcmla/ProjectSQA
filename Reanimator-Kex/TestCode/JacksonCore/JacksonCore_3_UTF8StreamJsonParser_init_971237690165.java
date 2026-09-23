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

public class UTF8StreamJsonParser_init_971237690165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21050;
     Object term21156;
     Object term21161;

    public UTF8StreamJsonParser_init_971237690165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20882 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term20966 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term20882, term20882.getClass(), "_inputPtr", 0);
        setIntField(term20882, term20882.getClass(), "_inputEnd", 0);
        setLongField(term20882, term20882.getClass(), "_currInputProcessed", 0L);
        setIntField(term20882, term20882.getClass(), "_currInputRow", 0);
        setIntField(term20882, term20882.getClass(), "_currInputRowStart", 0);
        setLongField(term20882, term20882.getClass(), "_tokenInputTotal", 0L);
        setIntField(term20882, term20882.getClass(), "_tokenInputRow", 0);
        setIntField(term20882, term20882.getClass(), "_tokenInputCol", 0);
        setField(term20882, term20882.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term20882, term20882.getClass(), "_nameCopied", false);
        setField(term20882, term20882.getClass(), "_byteArrayBuilder", null);
        setIntField(term20882, term20882.getClass(), "_numTypesValid", 0);
        setIntField(term20882, term20882.getClass(), "_features", 0);
        setField(term20882, term20882.getClass(), "_ioContext", term20966);
        term21050 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term21156 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term21157 = (int[]) newIntArray(16);
        Object term21158 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term21159 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term21160 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term21156, term21156.getClass(), "_objectCodec", null);
        setField(term21156, term21156.getClass(), "_symbols", null);
        setField(term21156, term21156.getClass(), "_quadBuffer", term21157);
        setBooleanField(term21156, term21156.getClass(), "_tokenIncomplete", false);
        setIntField(term21156, term21156.getClass(), "_quad1", 0);
        setField(term21156, term21156.getClass(), "_inputStream", null);
        setField(term21156, term21156.getClass(), "_inputBuffer", null);
        setBooleanField(term21156, term21156.getClass(), "_bufferRecyclable", false);
        setField(term21158, term21158.getClass(), "_sourceRef", null);
        setField(term21158, term21158.getClass(), "_encoding", null);
        setBooleanField(term21158, term21158.getClass(), "_managedResource", false);
        setField(term21158, term21158.getClass(), "_bufferRecycler", null);
        setField(term21158, term21158.getClass(), "_readIOBuffer", null);
        setField(term21158, term21158.getClass(), "_writeEncodingBuffer", null);
        setField(term21158, term21158.getClass(), "_base64Buffer", null);
        setField(term21158, term21158.getClass(), "_tokenCBuffer", null);
        setField(term21158, term21158.getClass(), "_concatCBuffer", null);
        setField(term21158, term21158.getClass(), "_nameCopyBuffer", null);
        setField(term21156, term21156.getClass(), "_ioContext", term21158);
        setBooleanField(term21156, term21156.getClass(), "_closed", false);
        setIntField(term21156, term21156.getClass(), "_inputPtr", 0);
        setIntField(term21156, term21156.getClass(), "_inputEnd", 0);
        setLongField(term21156, term21156.getClass(), "_currInputProcessed", 0L);
        setIntField(term21156, term21156.getClass(), "_currInputRow", 1);
        setIntField(term21156, term21156.getClass(), "_currInputRowStart", 0);
        setLongField(term21156, term21156.getClass(), "_tokenInputTotal", 0L);
        setIntField(term21156, term21156.getClass(), "_tokenInputRow", 1);
        setIntField(term21156, term21156.getClass(), "_tokenInputCol", 0);
        setField(term21159, term21159.getClass(), "_parent", null);
        setField(term21159, term21159.getClass(), "_dups", null);
        setIntField(term21159, term21159.getClass(), "_lineNr", 1);
        setIntField(term21159, term21159.getClass(), "_columnNr", 0);
        setField(term21159, term21159.getClass(), "_currentName", null);
        setField(term21159, term21159.getClass(), "_child", null);
        setIntField(term21159, term21159.getClass(), "_type", 0);
        setIntField(term21159, term21159.getClass(), "_index", -1);
        setField(term21156, term21156.getClass(), "_parsingContext", term21159);
        setField(term21156, term21156.getClass(), "_nextToken", null);
        setField(term21160, term21160.getClass(), "_allocator", null);
        setField(term21160, term21160.getClass(), "_inputBuffer", null);
        setIntField(term21160, term21160.getClass(), "_inputStart", 0);
        setIntField(term21160, term21160.getClass(), "_inputLen", 0);
        setField(term21160, term21160.getClass(), "_segments", null);
        setBooleanField(term21160, term21160.getClass(), "_hasSegments", false);
        setIntField(term21160, term21160.getClass(), "_segmentSize", 0);
        setField(term21160, term21160.getClass(), "_currentSegment", null);
        setIntField(term21160, term21160.getClass(), "_currentSize", 0);
        setField(term21160, term21160.getClass(), "_resultString", null);
        setField(term21160, term21160.getClass(), "_resultArray", null);
        setField(term21156, term21156.getClass(), "_textBuffer", term21160);
        setField(term21156, term21156.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term21156, term21156.getClass(), "_nameCopied", false);
        setField(term21156, term21156.getClass(), "_byteArrayBuilder", null);
        setField(term21156, term21156.getClass(), "_binaryValue", null);
        setIntField(term21156, term21156.getClass(), "_numTypesValid", 0);
        setIntField(term21156, term21156.getClass(), "_numberInt", 0);
        setLongField(term21156, term21156.getClass(), "_numberLong", 0L);
        setDoubleField(term21156, term21156.getClass(), "_numberDouble", 0.0);
        setField(term21156, term21156.getClass(), "_numberBigInt", null);
        setField(term21156, term21156.getClass(), "_numberBigDecimal", null);
        setBooleanField(term21156, term21156.getClass(), "_numberNegative", false);
        setIntField(term21156, term21156.getClass(), "_intLength", 0);
        setIntField(term21156, term21156.getClass(), "_fractLength", 0);
        setIntField(term21156, term21156.getClass(), "_expLength", 0);
        setField(term21156, term21156.getClass(), "_currToken", null);
        setField(term21156, term21156.getClass(), "_lastClearedToken", null);
        setIntField(term21156, term21156.getClass(), "_features", 0);
        term21161 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term21161, term21161.getClass(), "_sourceRef", null);
        setField(term21161, term21161.getClass(), "_encoding", null);
        setBooleanField(term21161, term21161.getClass(), "_managedResource", false);
        setField(term21161, term21161.getClass(), "_bufferRecycler", null);
        setField(term21161, term21161.getClass(), "_readIOBuffer", null);
        setField(term21161, term21161.getClass(), "_writeEncodingBuffer", null);
        setField(term21161, term21161.getClass(), "_base64Buffer", null);
        setField(term21161, term21161.getClass(), "_tokenCBuffer", null);
        setField(term21161, term21161.getClass(), "_concatCBuffer", null);
        setField(term21161, term21161.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term21050;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21156));
        assertTrue(recursiveEquals(term21050, term21161));
    }

};


