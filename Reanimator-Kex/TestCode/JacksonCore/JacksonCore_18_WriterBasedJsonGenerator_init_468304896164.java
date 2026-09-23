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

public class WriterBasedJsonGenerator_init_468304896164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82871;
     Object term82054;

    public WriterBasedJsonGenerator_init_468304896164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82607 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term82705 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term82787 = newInstance(Class.forName("java.io.PrintWriter"));
        setIntField(term82607, term82607.getClass(), "_features", 0);
        setField(term82607, term82607.getClass(), "_objectCodec", null);
        setField(term82607, term82607.getClass(), "_writeContext", null);
        setBooleanField(term82607, term82607.getClass(), "_cfgNumbersAsStrings", false);
        setField(term82607, term82607.getClass(), "_outputEscapes", null);
        setField(term82705, term82705.getClass(), "_value", " ");
        setField(term82705, term82705.getClass(), "_quotedUTF8Ref", null);
        setField(term82705, term82705.getClass(), "_unquotedUTF8Ref", null);
        setField(term82705, term82705.getClass(), "_quotedChars", null);
        setField(term82705, term82705.getClass(), "_jdkSerializeValue", null);
        setField(term82607, term82607.getClass(), "_rootValueSeparator", term82705);
        setField(term82607, term82607.getClass(), "_ioContext", null);
        setIntField(term82607, term82607.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term82607, term82607.getClass(), "_cfgUnqNames", false);
        setField(term82607, term82607.getClass(), "_writer", term82787);
        term82871 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term82969 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term82342 = (Object[]) newArray("[C", 2);
        char[] term82343 = (char[]) newCharArray(0);
        char[] term82344 = (char[]) newCharArray(0);
        setField(term82871, term82871.getClass(), "_concatCBuffer", null);
        setElement(term82342, 0, term82343);
        setElement(term82342, 1, term82344);
        setField(term82969, term82969.getClass(), "_charBuffers", term82342);
        setField(term82871, term82871.getClass(), "_bufferRecycler", term82969);
        term82054 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term82871;
        args[1] = -1;
        args[2] = term82054;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


