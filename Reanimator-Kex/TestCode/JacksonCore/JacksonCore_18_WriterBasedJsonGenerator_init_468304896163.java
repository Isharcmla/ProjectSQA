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
import org.mockito.Mockito;

public class WriterBasedJsonGenerator_init_468304896163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45478;
     Object term69886;
     Object term69898;

    public WriterBasedJsonGenerator_init_468304896163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45296 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term44523 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term45394 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term45296, term45296.getClass(), "_features", 0);
        setField(term45296, term45296.getClass(), "_objectCodec", term44523);
        setField(term45296, term45296.getClass(), "_writeContext", null);
        setBooleanField(term45296, term45296.getClass(), "_cfgNumbersAsStrings", false);
        setField(term45296, term45296.getClass(), "_outputEscapes", null);
        setField(term45296, term45296.getClass(), "_rootValueSeparator", term45394);
        setField(term45296, term45296.getClass(), "_ioContext", null);
        setIntField(term45296, term45296.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term45296, term45296.getClass(), "_cfgUnqNames", false);
        setField(term45296, term45296.getClass(), "_writer", null);
        term45478 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term45576 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term45033 = (Object[]) newArray("[C", 2);
        setField(term45478, term45478.getClass(), "_concatCBuffer", null);
        setField(term45576, term45576.getClass(), "_charBuffers", term45033);
        setField(term45478, term45478.getClass(), "_bufferRecycler", term45576);
        term69886 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] term69887 = (char[]) newCharArray(4000);
        Object term69888 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term69889 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term69890 = (Object[]) newArray("[C", 2);
        char[] term69891 = (char[]) newCharArray(4000);
        int[] term69892 = (int[]) newIntArray(128);
        Object term69893 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term69896 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term69897 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term69886, term69886.getClass(), "_writer", null);
        setField(term69886, term69886.getClass(), "_outputBuffer", term69887);
        setIntField(term69886, term69886.getClass(), "_outputHead", 0);
        setIntField(term69886, term69886.getClass(), "_outputTail", 0);
        setIntField(term69886, term69886.getClass(), "_outputEnd", 4000);
        setField(term69886, term69886.getClass(), "_entityBuffer", null);
        setField(term69886, term69886.getClass(), "_currentEscape", null);
        setField(term69888, term69888.getClass(), "_sourceRef", null);
        setField(term69888, term69888.getClass(), "_encoding", null);
        setBooleanField(term69888, term69888.getClass(), "_managedResource", false);
        setField(term69889, term69889.getClass(), "_byteBuffers", null);
        setField(term69889, term69889.getClass(), "_charBuffers", term69890);
        setField(term69888, term69888.getClass(), "_bufferRecycler", term69889);
        setField(term69888, term69888.getClass(), "_readIOBuffer", null);
        setField(term69888, term69888.getClass(), "_writeEncodingBuffer", null);
        setField(term69888, term69888.getClass(), "_base64Buffer", null);
        setField(term69888, term69888.getClass(), "_tokenCBuffer", null);
        setField(term69888, term69888.getClass(), "_concatCBuffer", term69891);
        setField(term69888, term69888.getClass(), "_nameCopyBuffer", null);
        setField(term69886, term69886.getClass(), "_ioContext", term69888);
        setIntElement(term69892, 0, -1);
        setIntElement(term69892, 1, -1);
        setIntElement(term69892, 2, -1);
        setIntElement(term69892, 3, -1);
        setIntElement(term69892, 4, -1);
        setIntElement(term69892, 5, -1);
        setIntElement(term69892, 6, -1);
        setIntElement(term69892, 7, -1);
        setIntElement(term69892, 8, 98);
        setIntElement(term69892, 9, 116);
        setIntElement(term69892, 10, 110);
        setIntElement(term69892, 11, -1);
        setIntElement(term69892, 12, 102);
        setIntElement(term69892, 13, 114);
        setIntElement(term69892, 14, -1);
        setIntElement(term69892, 15, -1);
        setIntElement(term69892, 16, -1);
        setIntElement(term69892, 17, -1);
        setIntElement(term69892, 18, -1);
        setIntElement(term69892, 19, -1);
        setIntElement(term69892, 20, -1);
        setIntElement(term69892, 21, -1);
        setIntElement(term69892, 22, -1);
        setIntElement(term69892, 23, -1);
        setIntElement(term69892, 24, -1);
        setIntElement(term69892, 25, -1);
        setIntElement(term69892, 26, -1);
        setIntElement(term69892, 27, -1);
        setIntElement(term69892, 28, -1);
        setIntElement(term69892, 29, -1);
        setIntElement(term69892, 30, -1);
        setIntElement(term69892, 31, -1);
        setIntElement(term69892, 34, 34);
        setIntElement(term69892, 92, 92);
        setField(term69886, term69886.getClass(), "_outputEscapes", term69892);
        setIntField(term69886, term69886.getClass(), "_maximumNonEscapedChar", 127);
        setField(term69886, term69886.getClass(), "_characterEscapes", null);
        setField(term69893, term69893.getClass(), "_value", " ");
        setField(term69893, term69893.getClass(), "_quotedUTF8Ref", null);
        setField(term69893, term69893.getClass(), "_unquotedUTF8Ref", null);
        setField(term69893, term69893.getClass(), "_quotedChars", null);
        setField(term69893, term69893.getClass(), "_jdkSerializeValue", null);
        setField(term69886, term69886.getClass(), "_rootValueSeparator", term69893);
        setBooleanField(term69886, term69886.getClass(), "_cfgUnqNames", false);
        setField(term69886, term69886.getClass(), "_objectCodec", null);
        setIntField(term69886, term69886.getClass(), "_features", -1);
        setBooleanField(term69886, term69886.getClass(), "_cfgNumbersAsStrings", true);
        setField(term69896, term69896.getClass(), "_parent", null);
        setField(term69897, term69897.getClass(), "_source", term69886);
        setField(term69897, term69897.getClass(), "_firstName", null);
        setField(term69897, term69897.getClass(), "_secondName", null);
        setField(term69897, term69897.getClass(), "_seen", null);
        setField(term69896, term69896.getClass(), "_dups", term69897);
        setField(term69896, term69896.getClass(), "_child", null);
        setField(term69896, term69896.getClass(), "_currentName", null);
        setField(term69896, term69896.getClass(), "_currentValue", null);
        setBooleanField(term69896, term69896.getClass(), "_gotName", false);
        setIntField(term69896, term69896.getClass(), "_type", 0);
        setIntField(term69896, term69896.getClass(), "_index", -1);
        setField(term69886, term69886.getClass(), "_writeContext", term69896);
        setBooleanField(term69886, term69886.getClass(), "_closed", false);
        setField(term69886, term69886.getClass(), "_cfgPrettyPrinter", null);
        term69898 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term69899 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term69900 = (Object[]) newArray("[C", 2);
        char[] term69901 = (char[]) newCharArray(4000);
        setField(term69898, term69898.getClass(), "_sourceRef", null);
        setField(term69898, term69898.getClass(), "_encoding", null);
        setBooleanField(term69898, term69898.getClass(), "_managedResource", false);
        setField(term69899, term69899.getClass(), "_byteBuffers", null);
        setField(term69899, term69899.getClass(), "_charBuffers", term69900);
        setField(term69898, term69898.getClass(), "_bufferRecycler", term69899);
        setField(term69898, term69898.getClass(), "_readIOBuffer", null);
        setField(term69898, term69898.getClass(), "_writeEncodingBuffer", null);
        setField(term69898, term69898.getClass(), "_base64Buffer", null);
        setField(term69898, term69898.getClass(), "_tokenCBuffer", null);
        setField(term69898, term69898.getClass(), "_concatCBuffer", term69901);
        setField(term69898, term69898.getClass(), "_nameCopyBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.Writer");
        Object[] args = new Object[4];
        args[0] = term45478;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69886));
        assertTrue(recursiveEquals(term45478, -1));
    }

};


