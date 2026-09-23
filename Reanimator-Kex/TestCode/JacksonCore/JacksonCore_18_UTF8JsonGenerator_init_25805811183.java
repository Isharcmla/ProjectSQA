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

public class UTF8JsonGenerator_init_25805811183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50973;
     Object term49563;
     Object term49564;

    public UTF8JsonGenerator_init_25805811183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term50663 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term50118 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term50127 = (int[]) newIntArray(0);
        Object term50761 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term50845 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term50889 = newInstance(Class.forName("java.io.PrintStream"));
        byte[] term50136 = (byte[]) newByteArray(0);
        setIntField(term50663, term50663.getClass(), "_features", 0);
        setField(term50663, term50663.getClass(), "_objectCodec", term50118);
        setField(term50663, term50663.getClass(), "_writeContext", null);
        setBooleanField(term50663, term50663.getClass(), "_cfgNumbersAsStrings", false);
        setField(term50663, term50663.getClass(), "_outputEscapes", term50127);
        setField(term50663, term50663.getClass(), "_rootValueSeparator", term50761);
        setField(term50663, term50663.getClass(), "_ioContext", term50845);
        setBooleanField(term50663, term50663.getClass(), "_cfgUnqNames", false);
        setField(term50663, term50663.getClass(), "_outputStream", term50889);
        setBooleanField(term50663, term50663.getClass(), "_bufferRecyclable", false);
        setIntField(term50663, term50663.getClass(), "_outputTail", 0);
        setField(term50663, term50663.getClass(), "_outputBuffer", term50136);
        term50973 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term49563 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term49564 = (byte[]) newByteArray(297);
        setByteElement(term49564, 0, (byte) 65);
        setByteElement(term49564, 1, (byte) 85);
        setByteElement(term49564, 2, (byte) 84);
        setByteElement(term49564, 3, (byte) 79);
        setByteElement(term49564, 4, (byte) 95);
        setByteElement(term49564, 5, (byte) 67);
        setByteElement(term49564, 6, (byte) 76);
        setByteElement(term49564, 7, (byte) 79);
        setByteElement(term49564, 8, (byte) 83);
        setByteElement(term49564, 9, (byte) 69);
        setByteElement(term49564, 10, (byte) 95);
        setByteElement(term49564, 11, (byte) 74);
        setByteElement(term49564, 12, (byte) 83);
        setByteElement(term49564, 13, (byte) 79);
        setByteElement(term49564, 14, (byte) 78);
        setByteElement(term49564, 15, (byte) 95);
        setByteElement(term49564, 16, (byte) 67);
        setByteElement(term49564, 17, (byte) 79);
        setByteElement(term49564, 18, (byte) 78);
        setByteElement(term49564, 19, (byte) 84);
        setByteElement(term49564, 20, (byte) 69);
        setByteElement(term49564, 21, (byte) 78);
        setByteElement(term49564, 22, (byte) 84);
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
        args[0] = term50973;
        args[1] = 2147483629;
        args[2] = term49563;
        args[3] = null;
        args[4] = term49564;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


