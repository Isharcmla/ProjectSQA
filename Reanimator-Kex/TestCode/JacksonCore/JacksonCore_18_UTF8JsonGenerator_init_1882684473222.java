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

public class UTF8JsonGenerator_init_1882684473222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98071;
     Object term97380;
     Object term98227;

    public UTF8JsonGenerator_init_1882684473222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97903 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term97987 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term97903, term97903.getClass(), "_features", 0);
        setField(term97903, term97903.getClass(), "_objectCodec", null);
        setField(term97903, term97903.getClass(), "_writeContext", null);
        setBooleanField(term97903, term97903.getClass(), "_cfgNumbersAsStrings", false);
        setField(term97903, term97903.getClass(), "_outputEscapes", null);
        setField(term97903, term97903.getClass(), "_rootValueSeparator", null);
        setField(term97903, term97903.getClass(), "_ioContext", term97987);
        setIntField(term97903, term97903.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term97903, term97903.getClass(), "_cfgUnqNames", false);
        setField(term97903, term97903.getClass(), "_outputStream", null);
        setBooleanField(term97903, term97903.getClass(), "_bufferRecyclable", false);
        term98071 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term98169 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term97670 = (Object[]) newArray("[B", 32);
        setField(term98071, term98071.getClass(), "_writeEncodingBuffer", null);
        setField(term98169, term98169.getClass(), "_byteBuffers", term97670);
        setField(term98071, term98071.getClass(), "_bufferRecycler", term98169);
        term97380 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term98227 = newInstance(Class.forName("java.io.FilterOutputStream"));
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
        args[0] = term98071;
        args[1] = -1;
        args[2] = term97380;
        args[3] = term98227;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


