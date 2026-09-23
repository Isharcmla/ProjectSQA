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
     Object term46262;
     Object term46442;
     Object term46448;

    public UTF8StreamJsonParser_init_1068833607209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46178 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        setIntField(term46178, term46178.getClass(), "_features", 0);
        setIntField(term46178, term46178.getClass(), "_inputPtr", 0);
        setIntField(term46178, term46178.getClass(), "_inputEnd", 0);
        setLongField(term46178, term46178.getClass(), "_currInputProcessed", 0L);
        setIntField(term46178, term46178.getClass(), "_currInputRow", 0);
        setIntField(term46178, term46178.getClass(), "_currInputRowStart", 0);
        setLongField(term46178, term46178.getClass(), "_tokenInputTotal", 0L);
        setIntField(term46178, term46178.getClass(), "_tokenInputRow", 0);
        setIntField(term46178, term46178.getClass(), "_tokenInputCol", 0);
        setField(term46178, term46178.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term46178, term46178.getClass(), "_nameCopied", false);
        setField(term46178, term46178.getClass(), "_byteArrayBuilder", null);
        setIntField(term46178, term46178.getClass(), "_numTypesValid", 0);
        setField(term46178, term46178.getClass(), "_ioContext", null);
        setField(term46178, term46178.getClass(), "_textBuffer", null);
        term46262 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term46262, term46262.getClass(), "_bufferRecycler", null);
        term46442 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        int[] term46443 = (int[]) newIntArray(16);
        Object term46444 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term46445 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term46446 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        Object term46447 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term46442, term46442.getClass(), "_objectCodec", null);
        setField(term46442, term46442.getClass(), "_symbols", null);
        setField(term46442, term46442.getClass(), "_quadBuffer", term46443);
        setBooleanField(term46442, term46442.getClass(), "_tokenIncomplete", false);
        setIntField(term46442, term46442.getClass(), "_quad1", 0);
        setLongField(term46442, term46442.getClass(), "_nameInputTotal", 0L);
        setIntField(term46442, term46442.getClass(), "_nameInputRow", 0);
        setIntField(term46442, term46442.getClass(), "_nameInputCol", 0);
        setField(term46442, term46442.getClass(), "_inputStream", null);
        setField(term46442, term46442.getClass(), "_inputBuffer", null);
        setBooleanField(term46442, term46442.getClass(), "_bufferRecyclable", false);
        setField(term46444, term46444.getClass(), "_sourceRef", null);
        setField(term46444, term46444.getClass(), "_encoding", null);
        setBooleanField(term46444, term46444.getClass(), "_managedResource", false);
        setField(term46444, term46444.getClass(), "_bufferRecycler", null);
        setField(term46444, term46444.getClass(), "_readIOBuffer", null);
        setField(term46444, term46444.getClass(), "_writeEncodingBuffer", null);
        setField(term46444, term46444.getClass(), "_base64Buffer", null);
        setField(term46444, term46444.getClass(), "_tokenCBuffer", null);
        setField(term46444, term46444.getClass(), "_concatCBuffer", null);
        setField(term46444, term46444.getClass(), "_nameCopyBuffer", null);
        setField(term46442, term46442.getClass(), "_ioContext", term46444);
        setBooleanField(term46442, term46442.getClass(), "_closed", false);
        setIntField(term46442, term46442.getClass(), "_inputPtr", 0);
        setIntField(term46442, term46442.getClass(), "_inputEnd", 0);
        setLongField(term46442, term46442.getClass(), "_currInputProcessed", 0L);
        setIntField(term46442, term46442.getClass(), "_currInputRow", 1);
        setIntField(term46442, term46442.getClass(), "_currInputRowStart", 0);
        setLongField(term46442, term46442.getClass(), "_tokenInputTotal", 0L);
        setIntField(term46442, term46442.getClass(), "_tokenInputRow", 1);
        setIntField(term46442, term46442.getClass(), "_tokenInputCol", 0);
        setField(term46445, term46445.getClass(), "_parent", null);
        setField(term46446, term46446.getClass(), "_source", term46442);
        setField(term46446, term46446.getClass(), "_firstName", null);
        setField(term46446, term46446.getClass(), "_secondName", null);
        setField(term46446, term46446.getClass(), "_seen", null);
        setField(term46445, term46445.getClass(), "_dups", term46446);
        setField(term46445, term46445.getClass(), "_child", null);
        setField(term46445, term46445.getClass(), "_currentName", null);
        setField(term46445, term46445.getClass(), "_currentValue", null);
        setIntField(term46445, term46445.getClass(), "_lineNr", 1);
        setIntField(term46445, term46445.getClass(), "_columnNr", 0);
        setIntField(term46445, term46445.getClass(), "_type", 0);
        setIntField(term46445, term46445.getClass(), "_index", -1);
        setField(term46442, term46442.getClass(), "_parsingContext", term46445);
        setField(term46442, term46442.getClass(), "_nextToken", null);
        setField(term46447, term46447.getClass(), "_allocator", null);
        setField(term46447, term46447.getClass(), "_inputBuffer", null);
        setIntField(term46447, term46447.getClass(), "_inputStart", 0);
        setIntField(term46447, term46447.getClass(), "_inputLen", 0);
        setField(term46447, term46447.getClass(), "_segments", null);
        setBooleanField(term46447, term46447.getClass(), "_hasSegments", false);
        setIntField(term46447, term46447.getClass(), "_segmentSize", 0);
        setField(term46447, term46447.getClass(), "_currentSegment", null);
        setIntField(term46447, term46447.getClass(), "_currentSize", 0);
        setField(term46447, term46447.getClass(), "_resultString", null);
        setField(term46447, term46447.getClass(), "_resultArray", null);
        setField(term46442, term46442.getClass(), "_textBuffer", term46447);
        setField(term46442, term46442.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term46442, term46442.getClass(), "_nameCopied", false);
        setField(term46442, term46442.getClass(), "_byteArrayBuilder", null);
        setField(term46442, term46442.getClass(), "_binaryValue", null);
        setIntField(term46442, term46442.getClass(), "_numTypesValid", 0);
        setIntField(term46442, term46442.getClass(), "_numberInt", 0);
        setLongField(term46442, term46442.getClass(), "_numberLong", 0L);
        setDoubleField(term46442, term46442.getClass(), "_numberDouble", 0.0);
        setField(term46442, term46442.getClass(), "_numberBigInt", null);
        setField(term46442, term46442.getClass(), "_numberBigDecimal", null);
        setBooleanField(term46442, term46442.getClass(), "_numberNegative", false);
        setIntField(term46442, term46442.getClass(), "_intLength", 0);
        setIntField(term46442, term46442.getClass(), "_fractLength", 0);
        setIntField(term46442, term46442.getClass(), "_expLength", 0);
        setField(term46442, term46442.getClass(), "_currToken", null);
        setField(term46442, term46442.getClass(), "_lastClearedToken", null);
        setIntField(term46442, term46442.getClass(), "_features", -1);
        term46448 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term46448, term46448.getClass(), "_sourceRef", null);
        setField(term46448, term46448.getClass(), "_encoding", null);
        setBooleanField(term46448, term46448.getClass(), "_managedResource", false);
        setField(term46448, term46448.getClass(), "_bufferRecycler", null);
        setField(term46448, term46448.getClass(), "_readIOBuffer", null);
        setField(term46448, term46448.getClass(), "_writeEncodingBuffer", null);
        setField(term46448, term46448.getClass(), "_base64Buffer", null);
        setField(term46448, term46448.getClass(), "_tokenCBuffer", null);
        setField(term46448, term46448.getClass(), "_concatCBuffer", null);
        setField(term46448, term46448.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term46262;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46442));
        assertTrue(recursiveEquals(term46262, -1));
    }

};


