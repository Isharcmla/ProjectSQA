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

public class UTF8JsonGenerator_init_25805811178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49834;
     Object term49835;

    public UTF8JsonGenerator_init_25805811178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51258 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term50549 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term51356 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term51440 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term51504 = newInstance(Class.forName("java.util.jar.JarOutputStream"));
        byte[] term50568 = (byte[]) newByteArray(0);
        setIntField(term51258, term51258.getClass(), "_features", 0);
        setField(term51258, term51258.getClass(), "_objectCodec", term50549);
        setField(term51258, term51258.getClass(), "_writeContext", null);
        setBooleanField(term51258, term51258.getClass(), "_cfgNumbersAsStrings", false);
        setField(term51258, term51258.getClass(), "_outputEscapes", null);
        setField(term51258, term51258.getClass(), "_rootValueSeparator", term51356);
        setField(term51258, term51258.getClass(), "_ioContext", term51440);
        setIntField(term51258, term51258.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term51258, term51258.getClass(), "_cfgUnqNames", false);
        setField(term51258, term51258.getClass(), "_outputStream", term51504);
        setBooleanField(term51258, term51258.getClass(), "_bufferRecyclable", false);
        setIntField(term51258, term51258.getClass(), "_outputTail", 0);
        setField(term51258, term51258.getClass(), "_outputBuffer", term50568);
        term49834 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term49835 = (byte[]) newByteArray(457);
        setByteElement(term49835, 0, (byte) 70);
        setByteElement(term49835, 1, (byte) 76);
        setByteElement(term49835, 2, (byte) 85);
        setByteElement(term49835, 3, (byte) 83);
        setByteElement(term49835, 4, (byte) 72);
        setByteElement(term49835, 5, (byte) 95);
        setByteElement(term49835, 6, (byte) 80);
        setByteElement(term49835, 7, (byte) 65);
        setByteElement(term49835, 8, (byte) 83);
        setByteElement(term49835, 9, (byte) 83);
        setByteElement(term49835, 10, (byte) 69);
        setByteElement(term49835, 11, (byte) 68);
        setByteElement(term49835, 12, (byte) 95);
        setByteElement(term49835, 13, (byte) 84);
        setByteElement(term49835, 14, (byte) 79);
        setByteElement(term49835, 15, (byte) 95);
        setByteElement(term49835, 16, (byte) 83);
        setByteElement(term49835, 17, (byte) 84);
        setByteElement(term49835, 18, (byte) 82);
        setByteElement(term49835, 19, (byte) 69);
        setByteElement(term49835, 20, (byte) 65);
        setByteElement(term49835, 21, (byte) 77);
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
        args[2] = term49834;
        args[3] = null;
        args[4] = term49835;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


