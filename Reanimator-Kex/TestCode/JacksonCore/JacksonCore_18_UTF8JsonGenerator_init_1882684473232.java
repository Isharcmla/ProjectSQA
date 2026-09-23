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

public class UTF8JsonGenerator_init_1882684473232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314783;
     Object term313439;

    public UTF8JsonGenerator_init_1882684473232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term314629 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term313694 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term314699 = newInstance(Class.forName("java.util.Base64$EncOutputStream"));
        setIntField(term314629, term314629.getClass(), "_features", 0);
        setField(term314629, term314629.getClass(), "_objectCodec", term313694);
        setField(term314629, term314629.getClass(), "_writeContext", null);
        setBooleanField(term314629, term314629.getClass(), "_cfgNumbersAsStrings", false);
        setField(term314629, term314629.getClass(), "_outputEscapes", null);
        setField(term314629, term314629.getClass(), "_rootValueSeparator", null);
        setField(term314629, term314629.getClass(), "_ioContext", null);
        setIntField(term314629, term314629.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term314629, term314629.getClass(), "_cfgUnqNames", false);
        setField(term314629, term314629.getClass(), "_outputStream", term314699);
        setBooleanField(term314629, term314629.getClass(), "_bufferRecyclable", false);
        setField(term314629, term314629.getClass(), "_outputBuffer", null);
        setIntField(term314629, term314629.getClass(), "_outputEnd", 0);
        setIntField(term314629, term314629.getClass(), "_outputMaxContiguous", 0);
        term314783 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term314881 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term313841 = (Object[]) newArray("[B", 2);
        byte[] term313842 = (byte[]) newByteArray(0);
        setField(term314783, term314783.getClass(), "_writeEncodingBuffer", null);
        setElement(term313841, 1, term313842);
        setField(term314881, term314881.getClass(), "_byteBuffers", term313841);
        setField(term314783, term314783.getClass(), "_bufferRecycler", term314881);
        setField(term314783, term314783.getClass(), "_concatCBuffer", null);
        term313439 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[4];
        args[0] = term314783;
        args[1] = -1;
        args[2] = term313439;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


