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

public class UTF8JsonGenerator_init_25805811197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65237;
     Object term63538;
     Object term63539;

    public UTF8JsonGenerator_init_25805811197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65051 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term65153 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term64303 = (int[]) newIntArray(0);
        byte[] term64310 = (byte[]) newByteArray(0);
        setIntField(term65051, term65051.getClass(), "_features", 0);
        setField(term65051, term65051.getClass(), "_objectCodec", null);
        setField(term65051, term65051.getClass(), "_writeContext", term65153);
        setBooleanField(term65051, term65051.getClass(), "_cfgNumbersAsStrings", false);
        setField(term65051, term65051.getClass(), "_outputEscapes", term64303);
        setField(term65051, term65051.getClass(), "_rootValueSeparator", null);
        setField(term65051, term65051.getClass(), "_ioContext", null);
        setIntField(term65051, term65051.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term65051, term65051.getClass(), "_cfgUnqNames", false);
        setField(term65051, term65051.getClass(), "_outputStream", null);
        setBooleanField(term65051, term65051.getClass(), "_bufferRecyclable", false);
        setIntField(term65051, term65051.getClass(), "_outputTail", 0);
        setField(term65051, term65051.getClass(), "_outputBuffer", term64310);
        setIntField(term65051, term65051.getClass(), "_outputEnd", 0);
        setIntField(term65051, term65051.getClass(), "_outputMaxContiguous", 0);
        term65237 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term65335 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term65237, term65237.getClass(), "_concatCBuffer", null);
        setField(term65237, term65237.getClass(), "_bufferRecycler", term65335);
        term63538 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term63539 = (byte[]) newByteArray(497);
        setByteElement(term63539, 0, (byte) 65);
        setByteElement(term63539, 1, (byte) 85);
        setByteElement(term63539, 2, (byte) 84);
        setByteElement(term63539, 3, (byte) 79);
        setByteElement(term63539, 4, (byte) 95);
        setByteElement(term63539, 5, (byte) 67);
        setByteElement(term63539, 6, (byte) 76);
        setByteElement(term63539, 7, (byte) 79);
        setByteElement(term63539, 8, (byte) 83);
        setByteElement(term63539, 9, (byte) 69);
        setByteElement(term63539, 10, (byte) 95);
        setByteElement(term63539, 11, (byte) 74);
        setByteElement(term63539, 12, (byte) 83);
        setByteElement(term63539, 13, (byte) 79);
        setByteElement(term63539, 14, (byte) 78);
        setByteElement(term63539, 15, (byte) 95);
        setByteElement(term63539, 16, (byte) 67);
        setByteElement(term63539, 17, (byte) 79);
        setByteElement(term63539, 18, (byte) 78);
        setByteElement(term63539, 19, (byte) 84);
        setByteElement(term63539, 20, (byte) 69);
        setByteElement(term63539, 21, (byte) 78);
        setByteElement(term63539, 22, (byte) 84);
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
        args[0] = term65237;
        args[1] = -1;
        args[2] = term63538;
        args[3] = null;
        args[4] = term63539;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


