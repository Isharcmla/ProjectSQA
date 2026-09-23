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
import java.lang.Object;
import org.mockito.Mockito;

public class WriterBasedJsonGenerator_init_468304896172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186637;
     Object term185866;

    public WriterBasedJsonGenerator_init_468304896172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186417 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term186515 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term186417, term186417.getClass(), "_features", 0);
        setField(term186417, term186417.getClass(), "_objectCodec", null);
        setField(term186417, term186417.getClass(), "_writeContext", null);
        setBooleanField(term186417, term186417.getClass(), "_cfgNumbersAsStrings", false);
        setField(term186417, term186417.getClass(), "_outputEscapes", null);
        setField(term186515, term186515.getClass(), "_value", " ");
        setField(term186515, term186515.getClass(), "_quotedUTF8Ref", null);
        setField(term186515, term186515.getClass(), "_unquotedUTF8Ref", null);
        setField(term186515, term186515.getClass(), "_quotedChars", null);
        setField(term186515, term186515.getClass(), "_jdkSerializeValue", null);
        setField(term186417, term186417.getClass(), "_rootValueSeparator", term186515);
        setField(term186417, term186417.getClass(), "_ioContext", null);
        setIntField(term186417, term186417.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term186417, term186417.getClass(), "_cfgUnqNames", false);
        setField(term186417, term186417.getClass(), "_writer", null);
        term186637 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term186735 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term186145 = (Object[]) newArray("[C", 9);
        char[] term186146 = (char[]) newCharArray(0);
        setField(term186637, term186637.getClass(), "_concatCBuffer", null);
        setElement(term186145, 1, term186146);
        setField(term186735, term186735.getClass(), "_charBuffers", term186145);
        setField(term186637, term186637.getClass(), "_bufferRecycler", term186735);
        term185866 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term186637;
        args[1] = -1;
        args[2] = term185866;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


