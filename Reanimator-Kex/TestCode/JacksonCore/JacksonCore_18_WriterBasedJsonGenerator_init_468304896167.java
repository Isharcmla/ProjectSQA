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

public class WriterBasedJsonGenerator_init_468304896167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108745;
     Object term133926;
     Object term133940;

    public WriterBasedJsonGenerator_init_468304896167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term108461 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term108563 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term107666 = (int[]) newIntArray(0);
        Object term108661 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term108461, term108461.getClass(), "_features", 0);
        setField(term108461, term108461.getClass(), "_objectCodec", null);
        setField(term108461, term108461.getClass(), "_writeContext", term108563);
        setBooleanField(term108461, term108461.getClass(), "_cfgNumbersAsStrings", false);
        setField(term108461, term108461.getClass(), "_outputEscapes", term107666);
        setField(term108461, term108461.getClass(), "_rootValueSeparator", term108661);
        setField(term108461, term108461.getClass(), "_ioContext", null);
        setIntField(term108461, term108461.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term108461, term108461.getClass(), "_cfgUnqNames", false);
        setField(term108461, term108461.getClass(), "_writer", null);
        term108745 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term108843 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term107679 = (Object[]) newArray("[C", 2);
        char[] term107680 = (char[]) newCharArray(0);
        char[] term107681 = (char[]) newCharArray(256);
        setField(term108745, term108745.getClass(), "_concatCBuffer", null);
        setElement(term107679, 0, term107680);
        setElement(term107679, 1, term107681);
        setField(term108843, term108843.getClass(), "_charBuffers", term107679);
        setField(term108745, term108745.getClass(), "_bufferRecycler", term108843);
        term133926 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] term133927 = (char[]) newCharArray(4000);
        Object term133928 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term133929 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term133930 = (Object[]) newArray("[C", 2);
        char[] term133931 = (char[]) newCharArray(0);
        char[] term133932 = (char[]) newCharArray(256);
        char[] term133933 = (char[]) newCharArray(4000);
        int[] term133934 = (int[]) newIntArray(128);
        Object term133935 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term133938 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term133939 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term133926, term133926.getClass(), "_writer", null);
        setField(term133926, term133926.getClass(), "_outputBuffer", term133927);
        setIntField(term133926, term133926.getClass(), "_outputHead", 0);
        setIntField(term133926, term133926.getClass(), "_outputTail", 0);
        setIntField(term133926, term133926.getClass(), "_outputEnd", 4000);
        setField(term133926, term133926.getClass(), "_entityBuffer", null);
        setField(term133926, term133926.getClass(), "_currentEscape", null);
        setField(term133928, term133928.getClass(), "_sourceRef", null);
        setField(term133928, term133928.getClass(), "_encoding", null);
        setBooleanField(term133928, term133928.getClass(), "_managedResource", false);
        setField(term133929, term133929.getClass(), "_byteBuffers", null);
        setElement(term133930, 0, term133931);
        setElement(term133930, 1, term133932);
        setField(term133929, term133929.getClass(), "_charBuffers", term133930);
        setField(term133928, term133928.getClass(), "_bufferRecycler", term133929);
        setField(term133928, term133928.getClass(), "_readIOBuffer", null);
        setField(term133928, term133928.getClass(), "_writeEncodingBuffer", null);
        setField(term133928, term133928.getClass(), "_base64Buffer", null);
        setField(term133928, term133928.getClass(), "_tokenCBuffer", null);
        setField(term133928, term133928.getClass(), "_concatCBuffer", term133933);
        setField(term133928, term133928.getClass(), "_nameCopyBuffer", null);
        setField(term133926, term133926.getClass(), "_ioContext", term133928);
        setIntElement(term133934, 0, -1);
        setIntElement(term133934, 1, -1);
        setIntElement(term133934, 2, -1);
        setIntElement(term133934, 3, -1);
        setIntElement(term133934, 4, -1);
        setIntElement(term133934, 5, -1);
        setIntElement(term133934, 6, -1);
        setIntElement(term133934, 7, -1);
        setIntElement(term133934, 8, 98);
        setIntElement(term133934, 9, 116);
        setIntElement(term133934, 10, 110);
        setIntElement(term133934, 11, -1);
        setIntElement(term133934, 12, 102);
        setIntElement(term133934, 13, 114);
        setIntElement(term133934, 14, -1);
        setIntElement(term133934, 15, -1);
        setIntElement(term133934, 16, -1);
        setIntElement(term133934, 17, -1);
        setIntElement(term133934, 18, -1);
        setIntElement(term133934, 19, -1);
        setIntElement(term133934, 20, -1);
        setIntElement(term133934, 21, -1);
        setIntElement(term133934, 22, -1);
        setIntElement(term133934, 23, -1);
        setIntElement(term133934, 24, -1);
        setIntElement(term133934, 25, -1);
        setIntElement(term133934, 26, -1);
        setIntElement(term133934, 27, -1);
        setIntElement(term133934, 28, -1);
        setIntElement(term133934, 29, -1);
        setIntElement(term133934, 30, -1);
        setIntElement(term133934, 31, -1);
        setIntElement(term133934, 34, 34);
        setIntElement(term133934, 92, 92);
        setField(term133926, term133926.getClass(), "_outputEscapes", term133934);
        setIntField(term133926, term133926.getClass(), "_maximumNonEscapedChar", 127);
        setField(term133926, term133926.getClass(), "_characterEscapes", null);
        setField(term133935, term133935.getClass(), "_value", " ");
        setField(term133935, term133935.getClass(), "_quotedUTF8Ref", null);
        setField(term133935, term133935.getClass(), "_unquotedUTF8Ref", null);
        setField(term133935, term133935.getClass(), "_quotedChars", null);
        setField(term133935, term133935.getClass(), "_jdkSerializeValue", null);
        setField(term133926, term133926.getClass(), "_rootValueSeparator", term133935);
        setBooleanField(term133926, term133926.getClass(), "_cfgUnqNames", false);
        setField(term133926, term133926.getClass(), "_objectCodec", null);
        setIntField(term133926, term133926.getClass(), "_features", -1);
        setBooleanField(term133926, term133926.getClass(), "_cfgNumbersAsStrings", true);
        setField(term133938, term133938.getClass(), "_parent", null);
        setField(term133939, term133939.getClass(), "_source", term133926);
        setField(term133939, term133939.getClass(), "_firstName", null);
        setField(term133939, term133939.getClass(), "_secondName", null);
        setField(term133939, term133939.getClass(), "_seen", null);
        setField(term133938, term133938.getClass(), "_dups", term133939);
        setField(term133938, term133938.getClass(), "_child", null);
        setField(term133938, term133938.getClass(), "_currentName", null);
        setField(term133938, term133938.getClass(), "_currentValue", null);
        setBooleanField(term133938, term133938.getClass(), "_gotName", false);
        setIntField(term133938, term133938.getClass(), "_type", 0);
        setIntField(term133938, term133938.getClass(), "_index", -1);
        setField(term133926, term133926.getClass(), "_writeContext", term133938);
        setBooleanField(term133926, term133926.getClass(), "_closed", false);
        setField(term133926, term133926.getClass(), "_cfgPrettyPrinter", null);
        term133940 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term133941 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term133942 = (Object[]) newArray("[C", 2);
        char[] term133943 = (char[]) newCharArray(0);
        char[] term133944 = (char[]) newCharArray(256);
        char[] term133945 = (char[]) newCharArray(4000);
        setField(term133940, term133940.getClass(), "_sourceRef", null);
        setField(term133940, term133940.getClass(), "_encoding", null);
        setBooleanField(term133940, term133940.getClass(), "_managedResource", false);
        setField(term133941, term133941.getClass(), "_byteBuffers", null);
        setElement(term133942, 0, term133943);
        setElement(term133942, 1, term133944);
        setField(term133941, term133941.getClass(), "_charBuffers", term133942);
        setField(term133940, term133940.getClass(), "_bufferRecycler", term133941);
        setField(term133940, term133940.getClass(), "_readIOBuffer", null);
        setField(term133940, term133940.getClass(), "_writeEncodingBuffer", null);
        setField(term133940, term133940.getClass(), "_base64Buffer", null);
        setField(term133940, term133940.getClass(), "_tokenCBuffer", null);
        setField(term133940, term133940.getClass(), "_concatCBuffer", term133945);
        setField(term133940, term133940.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term108745;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term133926));
        assertTrue(recursiveEquals(term108745, -1));
    }

};


