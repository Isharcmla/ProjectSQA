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

public class WriterBasedJsonGenerator_init_468304896171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149266;
     Object term173676;
     Object term173689;

    public WriterBasedJsonGenerator_init_468304896171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149182 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setIntField(term149182, term149182.getClass(), "_features", 0);
        setField(term149182, term149182.getClass(), "_objectCodec", null);
        setField(term149182, term149182.getClass(), "_writeContext", null);
        setBooleanField(term149182, term149182.getClass(), "_cfgNumbersAsStrings", false);
        setField(term149182, term149182.getClass(), "_outputEscapes", null);
        setField(term149182, term149182.getClass(), "_rootValueSeparator", null);
        setField(term149182, term149182.getClass(), "_ioContext", null);
        setIntField(term149182, term149182.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term149182, term149182.getClass(), "_cfgUnqNames", false);
        setField(term149182, term149182.getClass(), "_writer", null);
        term149266 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term149364 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term148914 = (Object[]) newArray("[C", 2);
        char[] term148915 = (char[]) newCharArray(0);
        setField(term149266, term149266.getClass(), "_concatCBuffer", null);
        setElement(term148914, 0, term148915);
        setField(term149364, term149364.getClass(), "_charBuffers", term148914);
        setField(term149266, term149266.getClass(), "_bufferRecycler", term149364);
        term173676 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] term173677 = (char[]) newCharArray(4000);
        Object term173678 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term173679 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term173680 = (Object[]) newArray("[C", 2);
        char[] term173681 = (char[]) newCharArray(0);
        char[] term173682 = (char[]) newCharArray(4000);
        int[] term173683 = (int[]) newIntArray(128);
        Object term173684 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term173687 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term173688 = newInstance(Class.forName("com.fasterxml.jackson.core.json.DupDetector"));
        setField(term173676, term173676.getClass(), "_writer", null);
        setField(term173676, term173676.getClass(), "_outputBuffer", term173677);
        setIntField(term173676, term173676.getClass(), "_outputHead", 0);
        setIntField(term173676, term173676.getClass(), "_outputTail", 0);
        setIntField(term173676, term173676.getClass(), "_outputEnd", 4000);
        setField(term173676, term173676.getClass(), "_entityBuffer", null);
        setField(term173676, term173676.getClass(), "_currentEscape", null);
        setField(term173678, term173678.getClass(), "_sourceRef", null);
        setField(term173678, term173678.getClass(), "_encoding", null);
        setBooleanField(term173678, term173678.getClass(), "_managedResource", false);
        setField(term173679, term173679.getClass(), "_byteBuffers", null);
        setElement(term173680, 0, term173681);
        setField(term173679, term173679.getClass(), "_charBuffers", term173680);
        setField(term173678, term173678.getClass(), "_bufferRecycler", term173679);
        setField(term173678, term173678.getClass(), "_readIOBuffer", null);
        setField(term173678, term173678.getClass(), "_writeEncodingBuffer", null);
        setField(term173678, term173678.getClass(), "_base64Buffer", null);
        setField(term173678, term173678.getClass(), "_tokenCBuffer", null);
        setField(term173678, term173678.getClass(), "_concatCBuffer", term173682);
        setField(term173678, term173678.getClass(), "_nameCopyBuffer", null);
        setField(term173676, term173676.getClass(), "_ioContext", term173678);
        setIntElement(term173683, 0, -1);
        setIntElement(term173683, 1, -1);
        setIntElement(term173683, 2, -1);
        setIntElement(term173683, 3, -1);
        setIntElement(term173683, 4, -1);
        setIntElement(term173683, 5, -1);
        setIntElement(term173683, 6, -1);
        setIntElement(term173683, 7, -1);
        setIntElement(term173683, 8, 98);
        setIntElement(term173683, 9, 116);
        setIntElement(term173683, 10, 110);
        setIntElement(term173683, 11, -1);
        setIntElement(term173683, 12, 102);
        setIntElement(term173683, 13, 114);
        setIntElement(term173683, 14, -1);
        setIntElement(term173683, 15, -1);
        setIntElement(term173683, 16, -1);
        setIntElement(term173683, 17, -1);
        setIntElement(term173683, 18, -1);
        setIntElement(term173683, 19, -1);
        setIntElement(term173683, 20, -1);
        setIntElement(term173683, 21, -1);
        setIntElement(term173683, 22, -1);
        setIntElement(term173683, 23, -1);
        setIntElement(term173683, 24, -1);
        setIntElement(term173683, 25, -1);
        setIntElement(term173683, 26, -1);
        setIntElement(term173683, 27, -1);
        setIntElement(term173683, 28, -1);
        setIntElement(term173683, 29, -1);
        setIntElement(term173683, 30, -1);
        setIntElement(term173683, 31, -1);
        setIntElement(term173683, 34, 34);
        setIntElement(term173683, 92, 92);
        setField(term173676, term173676.getClass(), "_outputEscapes", term173683);
        setIntField(term173676, term173676.getClass(), "_maximumNonEscapedChar", 127);
        setField(term173676, term173676.getClass(), "_characterEscapes", null);
        setField(term173684, term173684.getClass(), "_value", " ");
        setField(term173684, term173684.getClass(), "_quotedUTF8Ref", null);
        setField(term173684, term173684.getClass(), "_unquotedUTF8Ref", null);
        setField(term173684, term173684.getClass(), "_quotedChars", null);
        setField(term173684, term173684.getClass(), "_jdkSerializeValue", null);
        setField(term173676, term173676.getClass(), "_rootValueSeparator", term173684);
        setBooleanField(term173676, term173676.getClass(), "_cfgUnqNames", false);
        setField(term173676, term173676.getClass(), "_objectCodec", null);
        setIntField(term173676, term173676.getClass(), "_features", -1);
        setBooleanField(term173676, term173676.getClass(), "_cfgNumbersAsStrings", true);
        setField(term173687, term173687.getClass(), "_parent", null);
        setField(term173688, term173688.getClass(), "_source", term173676);
        setField(term173688, term173688.getClass(), "_firstName", null);
        setField(term173688, term173688.getClass(), "_secondName", null);
        setField(term173688, term173688.getClass(), "_seen", null);
        setField(term173687, term173687.getClass(), "_dups", term173688);
        setField(term173687, term173687.getClass(), "_child", null);
        setField(term173687, term173687.getClass(), "_currentName", null);
        setField(term173687, term173687.getClass(), "_currentValue", null);
        setBooleanField(term173687, term173687.getClass(), "_gotName", false);
        setIntField(term173687, term173687.getClass(), "_type", 0);
        setIntField(term173687, term173687.getClass(), "_index", -1);
        setField(term173676, term173676.getClass(), "_writeContext", term173687);
        setBooleanField(term173676, term173676.getClass(), "_closed", false);
        setField(term173676, term173676.getClass(), "_cfgPrettyPrinter", null);
        term173689 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term173690 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term173691 = (Object[]) newArray("[C", 2);
        char[] term173692 = (char[]) newCharArray(0);
        char[] term173693 = (char[]) newCharArray(4000);
        setField(term173689, term173689.getClass(), "_sourceRef", null);
        setField(term173689, term173689.getClass(), "_encoding", null);
        setBooleanField(term173689, term173689.getClass(), "_managedResource", false);
        setField(term173690, term173690.getClass(), "_byteBuffers", null);
        setElement(term173691, 0, term173692);
        setField(term173690, term173690.getClass(), "_charBuffers", term173691);
        setField(term173689, term173689.getClass(), "_bufferRecycler", term173690);
        setField(term173689, term173689.getClass(), "_readIOBuffer", null);
        setField(term173689, term173689.getClass(), "_writeEncodingBuffer", null);
        setField(term173689, term173689.getClass(), "_base64Buffer", null);
        setField(term173689, term173689.getClass(), "_tokenCBuffer", null);
        setField(term173689, term173689.getClass(), "_concatCBuffer", term173693);
        setField(term173689, term173689.getClass(), "_nameCopyBuffer", null);
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
        args[0] = term149266;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term173676));
        assertTrue(recursiveEquals(term149266, -1));
    }

};


