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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_25805811160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28554;
     Object term28610;
     Object term26784;

    public UTF8JsonGenerator_init_25805811160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28276 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term27530 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term28374 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term28554 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term28512 = newInstance(Class.forName("java.io.FileOutputStream"));
        byte[] term27547 = (byte[]) newByteArray(0);
        setIntField(term28276, term28276.getClass(), "_features", 0);
        setField(term28276, term28276.getClass(), "_objectCodec", term27530);
        setField(term28276, term28276.getClass(), "_writeContext", null);
        setBooleanField(term28276, term28276.getClass(), "_cfgNumbersAsStrings", false);
        setField(term28276, term28276.getClass(), "_outputEscapes", null);
        setField(term28276, term28276.getClass(), "_rootValueSeparator", term28374);
        setField(term28276, term28276.getClass(), "_ioContext", term28554);
        setBooleanField(term28276, term28276.getClass(), "_cfgUnqNames", false);
        setField(term28276, term28276.getClass(), "_outputStream", term28512);
        setBooleanField(term28276, term28276.getClass(), "_bufferRecyclable", false);
        setIntField(term28276, term28276.getClass(), "_outputTail", 0);
        setField(term28276, term28276.getClass(), "_outputBuffer", term27547);
        setIntField(term28276, term28276.getClass(), "_outputEnd", 0);
        setIntField(term28276, term28276.getClass(), "_outputMaxContiguous", 0);
        term28610 = newInstance(Class.forName("java.io.PipedOutputStream"));
        term26784 = (byte[]) newByteArray(489);
        setByteElement(term26784, 0, (byte) 70);
        setByteElement(term26784, 1, (byte) 76);
        setByteElement(term26784, 2, (byte) 85);
        setByteElement(term26784, 3, (byte) 83);
        setByteElement(term26784, 4, (byte) 72);
        setByteElement(term26784, 5, (byte) 95);
        setByteElement(term26784, 6, (byte) 80);
        setByteElement(term26784, 7, (byte) 65);
        setByteElement(term26784, 8, (byte) 83);
        setByteElement(term26784, 9, (byte) 83);
        setByteElement(term26784, 10, (byte) 69);
        setByteElement(term26784, 11, (byte) 68);
        setByteElement(term26784, 12, (byte) 95);
        setByteElement(term26784, 13, (byte) 84);
        setByteElement(term26784, 14, (byte) 79);
        setByteElement(term26784, 15, (byte) 95);
        setByteElement(term26784, 16, (byte) 83);
        setByteElement(term26784, 17, (byte) 84);
        setByteElement(term26784, 18, (byte) 82);
        setByteElement(term26784, 19, (byte) 69);
        setByteElement(term26784, 20, (byte) 65);
        setByteElement(term26784, 21, (byte) 77);
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
        args[0] = term28554;
        args[1] = 2147483647;
        args[2] = null;
        args[3] = term28610;
        args[4] = term26784;
        args[5] = 0;
        args[6] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


