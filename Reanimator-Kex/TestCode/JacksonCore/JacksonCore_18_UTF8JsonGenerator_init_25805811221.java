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

public class UTF8JsonGenerator_init_25805811221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95434;
     Object term95594;
     Object term93848;

    public UTF8JsonGenerator_init_25805811221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95350 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] term94609 = (byte[]) newByteArray(0);
        setIntField(term95350, term95350.getClass(), "_features", 0);
        setField(term95350, term95350.getClass(), "_objectCodec", null);
        setField(term95350, term95350.getClass(), "_writeContext", null);
        setBooleanField(term95350, term95350.getClass(), "_cfgNumbersAsStrings", false);
        setField(term95350, term95350.getClass(), "_outputEscapes", null);
        setField(term95350, term95350.getClass(), "_rootValueSeparator", null);
        setField(term95350, term95350.getClass(), "_ioContext", null);
        setIntField(term95350, term95350.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term95350, term95350.getClass(), "_cfgUnqNames", false);
        setField(term95350, term95350.getClass(), "_outputStream", null);
        setBooleanField(term95350, term95350.getClass(), "_bufferRecyclable", false);
        setIntField(term95350, term95350.getClass(), "_outputTail", 0);
        setField(term95350, term95350.getClass(), "_outputBuffer", term94609);
        setIntField(term95350, term95350.getClass(), "_outputEnd", 0);
        setIntField(term95350, term95350.getClass(), "_outputMaxContiguous", 0);
        term95434 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term95532 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term95434, term95434.getClass(), "_concatCBuffer", null);
        setField(term95434, term95434.getClass(), "_bufferRecycler", term95532);
        term95594 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        term93848 = (byte[]) newByteArray(489);
        setByteElement(term93848, 0, (byte) 81);
        setByteElement(term93848, 1, (byte) 85);
        setByteElement(term93848, 2, (byte) 79);
        setByteElement(term93848, 3, (byte) 84);
        setByteElement(term93848, 4, (byte) 69);
        setByteElement(term93848, 5, (byte) 95);
        setByteElement(term93848, 6, (byte) 70);
        setByteElement(term93848, 7, (byte) 73);
        setByteElement(term93848, 8, (byte) 69);
        setByteElement(term93848, 9, (byte) 76);
        setByteElement(term93848, 10, (byte) 68);
        setByteElement(term93848, 11, (byte) 95);
        setByteElement(term93848, 12, (byte) 78);
        setByteElement(term93848, 13, (byte) 65);
        setByteElement(term93848, 14, (byte) 77);
        setByteElement(term93848, 15, (byte) 69);
        setByteElement(term93848, 16, (byte) 83);
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
        args[0] = term95434;
        args[1] = -1;
        args[2] = null;
        args[3] = term95594;
        args[4] = term93848;
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


