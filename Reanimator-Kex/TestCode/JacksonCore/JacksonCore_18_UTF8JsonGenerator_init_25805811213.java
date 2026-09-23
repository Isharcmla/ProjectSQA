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

public class UTF8JsonGenerator_init_25805811213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86322;
     Object term83905;
     Object term86482;
     Object term83907;

    public UTF8JsonGenerator_init_25805811213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term85900 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term84653 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term86002 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term86100 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term86184 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term86238 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term84674 = (byte[]) newByteArray(0);
        setIntField(term85900, term85900.getClass(), "_features", 0);
        setField(term85900, term85900.getClass(), "_objectCodec", term84653);
        setField(term85900, term85900.getClass(), "_writeContext", term86002);
        setBooleanField(term85900, term85900.getClass(), "_cfgNumbersAsStrings", false);
        setField(term85900, term85900.getClass(), "_outputEscapes", null);
        setField(term85900, term85900.getClass(), "_rootValueSeparator", term86100);
        setField(term85900, term85900.getClass(), "_ioContext", term86184);
        setIntField(term85900, term85900.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term85900, term85900.getClass(), "_cfgUnqNames", false);
        setField(term85900, term85900.getClass(), "_outputStream", term86238);
        setBooleanField(term85900, term85900.getClass(), "_bufferRecyclable", false);
        setIntField(term85900, term85900.getClass(), "_outputTail", 0);
        setField(term85900, term85900.getClass(), "_outputBuffer", term84674);
        setIntField(term85900, term85900.getClass(), "_outputEnd", 0);
        setIntField(term85900, term85900.getClass(), "_outputMaxContiguous", 0);
        term86322 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term86420 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term86322, term86322.getClass(), "_concatCBuffer", null);
        setField(term86322, term86322.getClass(), "_bufferRecycler", term86420);
        term83905 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term86482 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        term83907 = (byte[]) newByteArray(489);
        setByteElement(term83907, 1, (byte) 1);
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
        args[0] = term86322;
        args[1] = -1;
        args[2] = term83905;
        args[3] = term86482;
        args[4] = term83907;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


