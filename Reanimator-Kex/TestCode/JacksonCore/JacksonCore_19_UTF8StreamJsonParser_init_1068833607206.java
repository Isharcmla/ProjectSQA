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

public class UTF8StreamJsonParser_init_1068833607206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25359;
     Object term25478;
     Object term25483;

    public UTF8StreamJsonParser_init_1068833607206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25191 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        Object term25275 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term25191, term25191.getClass(), "_features", 0);
        setIntField(term25191, term25191.getClass(), "_currInputRow", 0);
        setIntField(term25191, term25191.getClass(), "_tokenInputRow", 0);
        setIntField(term25191, term25191.getClass(), "_numTypesValid", 0);
        setField(term25191, term25191.getClass(), "_ioContext", term25275);
        term25359 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term25478 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term25479 = (int[]) newIntArray(16);
        Object term25480 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term25481 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term25482 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term25478, term25478.getClass(), "_objectCodec", null);
        setField(term25478, term25478.getClass(), "_symbols", null);
        setField(term25478, term25478.getClass(), "_quadBuffer", term25479);
        setBooleanField(term25478, term25478.getClass(), "_tokenIncomplete", false);
        setIntField(term25478, term25478.getClass(), "_quad1", 0);
        setIntField(term25478, term25478.getClass(), "_nameStartOffset", 0);
        setIntField(term25478, term25478.getClass(), "_nameStartRow", 0);
        setIntField(term25478, term25478.getClass(), "_nameStartCol", 0);
        setField(term25478, term25478.getClass(), "_inputStream", null);
        setField(term25478, term25478.getClass(), "_inputBuffer", null);
        setBooleanField(term25478, term25478.getClass(), "_bufferRecyclable", false);
        setField(term25480, term25480.getClass(), "_sourceRef", null);
        setField(term25480, term25480.getClass(), "_encoding", null);
        setBooleanField(term25480, term25480.getClass(), "_managedResource", false);
        setField(term25480, term25480.getClass(), "_bufferRecycler", null);
        setField(term25480, term25480.getClass(), "_readIOBuffer", null);
        setField(term25480, term25480.getClass(), "_writeEncodingBuffer", null);
        setField(term25480, term25480.getClass(), "_base64Buffer", null);
        setField(term25480, term25480.getClass(), "_tokenCBuffer", null);
        setField(term25480, term25480.getClass(), "_concatCBuffer", null);
        setField(term25480, term25480.getClass(), "_nameCopyBuffer", null);
        setField(term25478, term25478.getClass(), "_ioContext", term25480);
        setBooleanField(term25478, term25478.getClass(), "_closed", false);
        setIntField(term25478, term25478.getClass(), "_inputPtr", 0);
        setIntField(term25478, term25478.getClass(), "_inputEnd", 0);
        setLongField(term25478, term25478.getClass(), "_currInputProcessed", 0L);
        setIntField(term25478, term25478.getClass(), "_currInputRow", 1);
        setIntField(term25478, term25478.getClass(), "_currInputRowStart", 0);
        setLongField(term25478, term25478.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25478, term25478.getClass(), "_tokenInputRow", 1);
        setIntField(term25478, term25478.getClass(), "_tokenInputCol", 0);
        setField(term25481, term25481.getClass(), "_parent", null);
        setField(term25481, term25481.getClass(), "_dups", null);
        setField(term25481, term25481.getClass(), "_child", null);
        setField(term25481, term25481.getClass(), "_currentName", null);
        setField(term25481, term25481.getClass(), "_currentValue", null);
        setIntField(term25481, term25481.getClass(), "_lineNr", 1);
        setIntField(term25481, term25481.getClass(), "_columnNr", 0);
        setIntField(term25481, term25481.getClass(), "_type", 0);
        setIntField(term25481, term25481.getClass(), "_index", -1);
        setField(term25478, term25478.getClass(), "_parsingContext", term25481);
        setField(term25478, term25478.getClass(), "_nextToken", null);
        setField(term25482, term25482.getClass(), "_allocator", null);
        setField(term25482, term25482.getClass(), "_inputBuffer", null);
        setIntField(term25482, term25482.getClass(), "_inputStart", 0);
        setIntField(term25482, term25482.getClass(), "_inputLen", 0);
        setField(term25482, term25482.getClass(), "_segments", null);
        setBooleanField(term25482, term25482.getClass(), "_hasSegments", false);
        setIntField(term25482, term25482.getClass(), "_segmentSize", 0);
        setField(term25482, term25482.getClass(), "_currentSegment", null);
        setIntField(term25482, term25482.getClass(), "_currentSize", 0);
        setField(term25482, term25482.getClass(), "_resultString", null);
        setField(term25482, term25482.getClass(), "_resultArray", null);
        setField(term25478, term25478.getClass(), "_textBuffer", term25482);
        setField(term25478, term25478.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term25478, term25478.getClass(), "_nameCopied", false);
        setField(term25478, term25478.getClass(), "_byteArrayBuilder", null);
        setField(term25478, term25478.getClass(), "_binaryValue", null);
        setIntField(term25478, term25478.getClass(), "_numTypesValid", 0);
        setIntField(term25478, term25478.getClass(), "_numberInt", 0);
        setLongField(term25478, term25478.getClass(), "_numberLong", 0L);
        setDoubleField(term25478, term25478.getClass(), "_numberDouble", 0.0);
        setField(term25478, term25478.getClass(), "_numberBigInt", null);
        setField(term25478, term25478.getClass(), "_numberBigDecimal", null);
        setBooleanField(term25478, term25478.getClass(), "_numberNegative", false);
        setIntField(term25478, term25478.getClass(), "_intLength", 0);
        setIntField(term25478, term25478.getClass(), "_fractLength", 0);
        setIntField(term25478, term25478.getClass(), "_expLength", 0);
        setField(term25478, term25478.getClass(), "_currToken", null);
        setField(term25478, term25478.getClass(), "_lastClearedToken", null);
        setIntField(term25478, term25478.getClass(), "_features", 0);
        term25483 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term25483, term25483.getClass(), "_sourceRef", null);
        setField(term25483, term25483.getClass(), "_encoding", null);
        setBooleanField(term25483, term25483.getClass(), "_managedResource", false);
        setField(term25483, term25483.getClass(), "_bufferRecycler", null);
        setField(term25483, term25483.getClass(), "_readIOBuffer", null);
        setField(term25483, term25483.getClass(), "_writeEncodingBuffer", null);
        setField(term25483, term25483.getClass(), "_base64Buffer", null);
        setField(term25483, term25483.getClass(), "_tokenCBuffer", null);
        setField(term25483, term25483.getClass(), "_concatCBuffer", null);
        setField(term25483, term25483.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term25359;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25478));
        assertTrue(recursiveEquals(term25359, 0));
    }

};


