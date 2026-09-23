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

public class UTF8JsonGenerator_init_1882684473234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407482;
     Object term406136;

    public UTF8JsonGenerator_init_1882684473234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term407326 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term406391 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term407398 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        setIntField(term407326, term407326.getClass(), "_features", 0);
        setField(term407326, term407326.getClass(), "_objectCodec", term406391);
        setField(term407326, term407326.getClass(), "_writeContext", null);
        setBooleanField(term407326, term407326.getClass(), "_cfgNumbersAsStrings", false);
        setField(term407326, term407326.getClass(), "_outputEscapes", null);
        setField(term407326, term407326.getClass(), "_rootValueSeparator", null);
        setField(term407326, term407326.getClass(), "_ioContext", null);
        setIntField(term407326, term407326.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term407326, term407326.getClass(), "_cfgUnqNames", false);
        setField(term407326, term407326.getClass(), "_outputStream", term407398);
        setBooleanField(term407326, term407326.getClass(), "_bufferRecyclable", false);
        setField(term407326, term407326.getClass(), "_outputBuffer", null);
        setIntField(term407326, term407326.getClass(), "_outputEnd", 0);
        setIntField(term407326, term407326.getClass(), "_outputMaxContiguous", 0);
        term407482 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term407580 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term406538 = (Object[]) newArray("[B", 2);
        byte[] term406539 = (byte[]) newByteArray(0);
        setField(term407482, term407482.getClass(), "_writeEncodingBuffer", null);
        setElement(term406538, 1, term406539);
        setField(term407580, term407580.getClass(), "_byteBuffers", term406538);
        setField(term407482, term407482.getClass(), "_bufferRecycler", term407580);
        setField(term407482, term407482.getClass(), "_concatCBuffer", null);
        term406136 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term407482;
        args[1] = -1;
        args[2] = term406136;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


