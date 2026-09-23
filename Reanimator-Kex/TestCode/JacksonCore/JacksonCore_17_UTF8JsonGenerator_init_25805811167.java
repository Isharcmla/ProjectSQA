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

public class UTF8JsonGenerator_init_25805811167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36612;
     Object term36662;
     Object term34842;

    public UTF8JsonGenerator_init_25805811167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36334 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term35588 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term36432 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term36612 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term36570 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term35605 = (byte[]) newByteArray(0);
        setIntField(term36334, term36334.getClass(), "_features", 0);
        setField(term36334, term36334.getClass(), "_objectCodec", term35588);
        setField(term36334, term36334.getClass(), "_writeContext", null);
        setBooleanField(term36334, term36334.getClass(), "_cfgNumbersAsStrings", false);
        setField(term36334, term36334.getClass(), "_outputEscapes", null);
        setField(term36334, term36334.getClass(), "_rootValueSeparator", term36432);
        setField(term36334, term36334.getClass(), "_ioContext", term36612);
        setBooleanField(term36334, term36334.getClass(), "_cfgUnqNames", false);
        setField(term36334, term36334.getClass(), "_outputStream", term36570);
        setBooleanField(term36334, term36334.getClass(), "_bufferRecyclable", false);
        setIntField(term36334, term36334.getClass(), "_outputTail", 0);
        setField(term36334, term36334.getClass(), "_outputBuffer", term35605);
        setIntField(term36334, term36334.getClass(), "_outputEnd", 0);
        setIntField(term36334, term36334.getClass(), "_outputMaxContiguous", 0);
        term36662 = newInstance(Class.forName("java.io.OutputStream$1"));
        term34842 = (byte[]) newByteArray(489);
        setByteElement(term34842, 0, (byte) 70);
        setByteElement(term34842, 1, (byte) 76);
        setByteElement(term34842, 2, (byte) 85);
        setByteElement(term34842, 3, (byte) 83);
        setByteElement(term34842, 4, (byte) 72);
        setByteElement(term34842, 5, (byte) 95);
        setByteElement(term34842, 6, (byte) 80);
        setByteElement(term34842, 7, (byte) 65);
        setByteElement(term34842, 8, (byte) 83);
        setByteElement(term34842, 9, (byte) 83);
        setByteElement(term34842, 10, (byte) 69);
        setByteElement(term34842, 11, (byte) 68);
        setByteElement(term34842, 12, (byte) 95);
        setByteElement(term34842, 13, (byte) 84);
        setByteElement(term34842, 14, (byte) 79);
        setByteElement(term34842, 15, (byte) 95);
        setByteElement(term34842, 16, (byte) 83);
        setByteElement(term34842, 17, (byte) 84);
        setByteElement(term34842, 18, (byte) 82);
        setByteElement(term34842, 19, (byte) 69);
        setByteElement(term34842, 20, (byte) 65);
        setByteElement(term34842, 21, (byte) 77);
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
        args[0] = term36612;
        args[1] = 2147483647;
        args[2] = null;
        args[3] = term36662;
        args[4] = term34842;
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


