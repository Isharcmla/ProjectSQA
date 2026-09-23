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

public class UTF8JsonGenerator_init_25805811202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72160;

    public UTF8JsonGenerator_init_25805811202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73157 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term72417 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term72916 = (int[]) newIntArray(0);
        Object term73255 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] term72924 = (byte[]) newByteArray(0);
        setIntField(term73157, term73157.getClass(), "_features", 0);
        setField(term73157, term73157.getClass(), "_objectCodec", term72417);
        setField(term73157, term73157.getClass(), "_writeContext", null);
        setBooleanField(term73157, term73157.getClass(), "_cfgNumbersAsStrings", false);
        setField(term73157, term73157.getClass(), "_outputEscapes", term72916);
        setField(term73157, term73157.getClass(), "_rootValueSeparator", term73255);
        setField(term73157, term73157.getClass(), "_ioContext", null);
        setIntField(term73157, term73157.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term73157, term73157.getClass(), "_cfgUnqNames", false);
        setField(term73157, term73157.getClass(), "_outputStream", null);
        setBooleanField(term73157, term73157.getClass(), "_bufferRecyclable", false);
        setIntField(term73157, term73157.getClass(), "_outputTail", 0);
        setField(term73157, term73157.getClass(), "_outputBuffer", term72924);
        term72160 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = -1;
        args[2] = term72160;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


