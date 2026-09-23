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

public class ReaderBasedJsonParser_init_1237508164187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214581;
     Object term214795;
     Object term238913;
     Object term238922;
     Object term238926;

    public ReaderBasedJsonParser_init_1237508164187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term214497 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term214497, term214497.getClass(), "_features", 0);
        setIntField(term214497, term214497.getClass(), "_currInputRow", 0);
        setIntField(term214497, term214497.getClass(), "_tokenInputRow", 0);
        setIntField(term214497, term214497.getClass(), "_numTypesValid", 0);
        setField(term214497, term214497.getClass(), "_ioContext", null);
        setField(term214497, term214497.getClass(), "_textBuffer", null);
        setField(term214497, term214497.getClass(), "_parsingContext", null);
        setField(term214497, term214497.getClass(), "_reader", null);
        setField(term214497, term214497.getClass(), "_inputBuffer", null);
        setIntField(term214497, term214497.getClass(), "_inputPtr", 0);
        setIntField(term214497, term214497.getClass(), "_inputEnd", 0);
        setField(term214497, term214497.getClass(), "_objectCodec", null);
        setField(term214497, term214497.getClass(), "_symbols", null);
        term214581 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term214679 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term214257 = (Object[]) newArray("[C", 32);
        setField(term214679, term214679.getClass(), "_charBuffers", term214257);
        setField(term214581, term214581.getClass(), "_bufferRecycler", term214679);
        setField(term214581, term214581.getClass(), "_tokenCBuffer", null);
        term214795 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        term238913 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term238914 = (char[]) newCharArray(4000);
        Object term238915 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        Object term238916 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term238917 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term238918 = (Object[]) newArray("[C", 32);
        char[] term238919 = (char[]) newCharArray(4000);
        Object term238920 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term238921 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setField(term238913, term238913.getClass(), "_reader", null);
        setField(term238913, term238913.getClass(), "_inputBuffer", term238914);
        setBooleanField(term238913, term238913.getClass(), "_bufferRecyclable", true);
        setField(term238913, term238913.getClass(), "_objectCodec", null);
        setField(term238915, term238915.getClass(), "_parent", null);
        setIntField(term238915, term238915.getClass(), "_hashSeed", 0);
        setIntField(term238915, term238915.getClass(), "_flags", 0);
        setBooleanField(term238915, term238915.getClass(), "_canonicalize", false);
        setField(term238915, term238915.getClass(), "_symbols", null);
        setField(term238915, term238915.getClass(), "_buckets", null);
        setIntField(term238915, term238915.getClass(), "_size", 0);
        setIntField(term238915, term238915.getClass(), "_sizeThreshold", 0);
        setIntField(term238915, term238915.getClass(), "_indexMask", 0);
        setIntField(term238915, term238915.getClass(), "_longestCollisionList", 0);
        setBooleanField(term238915, term238915.getClass(), "_dirty", false);
        setField(term238915, term238915.getClass(), "_overflows", null);
        setField(term238913, term238913.getClass(), "_symbols", term238915);
        setIntField(term238913, term238913.getClass(), "_hashSeed", 0);
        setBooleanField(term238913, term238913.getClass(), "_tokenIncomplete", false);
        setLongField(term238913, term238913.getClass(), "_nameStartOffset", 0L);
        setIntField(term238913, term238913.getClass(), "_nameStartRow", 0);
        setIntField(term238913, term238913.getClass(), "_nameStartCol", 0);
        setField(term238916, term238916.getClass(), "_sourceRef", null);
        setField(term238916, term238916.getClass(), "_encoding", null);
        setBooleanField(term238916, term238916.getClass(), "_managedResource", false);
        setField(term238917, term238917.getClass(), "_byteBuffers", null);
        setField(term238917, term238917.getClass(), "_charBuffers", term238918);
        setField(term238916, term238916.getClass(), "_bufferRecycler", term238917);
        setField(term238916, term238916.getClass(), "_readIOBuffer", null);
        setField(term238916, term238916.getClass(), "_writeEncodingBuffer", null);
        setField(term238916, term238916.getClass(), "_base64Buffer", null);
        setField(term238916, term238916.getClass(), "_tokenCBuffer", term238919);
        setField(term238916, term238916.getClass(), "_concatCBuffer", null);
        setField(term238916, term238916.getClass(), "_nameCopyBuffer", null);
        setField(term238913, term238913.getClass(), "_ioContext", term238916);
        setBooleanField(term238913, term238913.getClass(), "_closed", false);
        setIntField(term238913, term238913.getClass(), "_inputPtr", 0);
        setIntField(term238913, term238913.getClass(), "_inputEnd", 0);
        setLongField(term238913, term238913.getClass(), "_currInputProcessed", 0L);
        setIntField(term238913, term238913.getClass(), "_currInputRow", 1);
        setIntField(term238913, term238913.getClass(), "_currInputRowStart", 0);
        setLongField(term238913, term238913.getClass(), "_tokenInputTotal", 0L);
        setIntField(term238913, term238913.getClass(), "_tokenInputRow", 1);
        setIntField(term238913, term238913.getClass(), "_tokenInputCol", 0);
        setField(term238920, term238920.getClass(), "_parent", null);
        setField(term238920, term238920.getClass(), "_dups", null);
        setField(term238920, term238920.getClass(), "_child", null);
        setField(term238920, term238920.getClass(), "_currentName", null);
        setField(term238920, term238920.getClass(), "_currentValue", null);
        setIntField(term238920, term238920.getClass(), "_lineNr", 1);
        setIntField(term238920, term238920.getClass(), "_columnNr", 0);
        setIntField(term238920, term238920.getClass(), "_type", 0);
        setIntField(term238920, term238920.getClass(), "_index", -1);
        setField(term238913, term238913.getClass(), "_parsingContext", term238920);
        setField(term238913, term238913.getClass(), "_nextToken", null);
        setField(term238921, term238921.getClass(), "_allocator", term238917);
        setField(term238921, term238921.getClass(), "_inputBuffer", null);
        setIntField(term238921, term238921.getClass(), "_inputStart", 0);
        setIntField(term238921, term238921.getClass(), "_inputLen", 0);
        setField(term238921, term238921.getClass(), "_segments", null);
        setBooleanField(term238921, term238921.getClass(), "_hasSegments", false);
        setIntField(term238921, term238921.getClass(), "_segmentSize", 0);
        setField(term238921, term238921.getClass(), "_currentSegment", null);
        setIntField(term238921, term238921.getClass(), "_currentSize", 0);
        setField(term238921, term238921.getClass(), "_resultString", null);
        setField(term238921, term238921.getClass(), "_resultArray", null);
        setField(term238913, term238913.getClass(), "_textBuffer", term238921);
        setField(term238913, term238913.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term238913, term238913.getClass(), "_nameCopied", false);
        setField(term238913, term238913.getClass(), "_byteArrayBuilder", null);
        setField(term238913, term238913.getClass(), "_binaryValue", null);
        setIntField(term238913, term238913.getClass(), "_numTypesValid", 0);
        setIntField(term238913, term238913.getClass(), "_numberInt", 0);
        setLongField(term238913, term238913.getClass(), "_numberLong", 0L);
        setDoubleField(term238913, term238913.getClass(), "_numberDouble", 0.0);
        setField(term238913, term238913.getClass(), "_numberBigInt", null);
        setField(term238913, term238913.getClass(), "_numberBigDecimal", null);
        setBooleanField(term238913, term238913.getClass(), "_numberNegative", false);
        setIntField(term238913, term238913.getClass(), "_intLength", 0);
        setIntField(term238913, term238913.getClass(), "_fractLength", 0);
        setIntField(term238913, term238913.getClass(), "_expLength", 0);
        setField(term238913, term238913.getClass(), "_currToken", null);
        setField(term238913, term238913.getClass(), "_lastClearedToken", null);
        setIntField(term238913, term238913.getClass(), "_features", 0);
        term238922 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term238923 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term238924 = (Object[]) newArray("[C", 32);
        char[] term238925 = (char[]) newCharArray(4000);
        setField(term238922, term238922.getClass(), "_sourceRef", null);
        setField(term238922, term238922.getClass(), "_encoding", null);
        setBooleanField(term238922, term238922.getClass(), "_managedResource", false);
        setField(term238923, term238923.getClass(), "_byteBuffers", null);
        setField(term238923, term238923.getClass(), "_charBuffers", term238924);
        setField(term238922, term238922.getClass(), "_bufferRecycler", term238923);
        setField(term238922, term238922.getClass(), "_readIOBuffer", null);
        setField(term238922, term238922.getClass(), "_writeEncodingBuffer", null);
        setField(term238922, term238922.getClass(), "_base64Buffer", null);
        setField(term238922, term238922.getClass(), "_tokenCBuffer", term238925);
        setField(term238922, term238922.getClass(), "_concatCBuffer", null);
        setField(term238922, term238922.getClass(), "_nameCopyBuffer", null);
        term238926 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        setField(term238926, term238926.getClass(), "_parent", null);
        setIntField(term238926, term238926.getClass(), "_hashSeed", 0);
        setIntField(term238926, term238926.getClass(), "_flags", 0);
        setBooleanField(term238926, term238926.getClass(), "_canonicalize", false);
        setField(term238926, term238926.getClass(), "_symbols", null);
        setField(term238926, term238926.getClass(), "_buckets", null);
        setIntField(term238926, term238926.getClass(), "_size", 0);
        setIntField(term238926, term238926.getClass(), "_sizeThreshold", 0);
        setIntField(term238926, term238926.getClass(), "_indexMask", 0);
        setIntField(term238926, term238926.getClass(), "_longestCollisionList", 0);
        setBooleanField(term238926, term238926.getClass(), "_dirty", false);
        setField(term238926, term238926.getClass(), "_overflows", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Reader");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer");
        Object[] args = new Object[5];
        args[0] = term214581;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = term214795;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term238913));
        assertTrue(recursiveEquals(term214581, 0));
        assertTrue(recursiveEquals(term214795, null));
    }

};


