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

public class UTF8JsonGenerator_init_25805811219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96672;
     Object term96832;
     Object term95086;

    public UTF8JsonGenerator_init_25805811219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term96588 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        byte[] term95847 = (byte[]) newByteArray(0);
        setIntField(term96588, term96588.getClass(), "_features", 0);
        setField(term96588, term96588.getClass(), "_objectCodec", null);
        setField(term96588, term96588.getClass(), "_writeContext", null);
        setBooleanField(term96588, term96588.getClass(), "_cfgNumbersAsStrings", false);
        setField(term96588, term96588.getClass(), "_outputEscapes", null);
        setField(term96588, term96588.getClass(), "_rootValueSeparator", null);
        setField(term96588, term96588.getClass(), "_ioContext", null);
        setIntField(term96588, term96588.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term96588, term96588.getClass(), "_cfgUnqNames", false);
        setField(term96588, term96588.getClass(), "_outputStream", null);
        setBooleanField(term96588, term96588.getClass(), "_bufferRecyclable", false);
        setIntField(term96588, term96588.getClass(), "_outputTail", 0);
        setField(term96588, term96588.getClass(), "_outputBuffer", term95847);
        setIntField(term96588, term96588.getClass(), "_outputEnd", 0);
        setIntField(term96588, term96588.getClass(), "_outputMaxContiguous", 0);
        term96672 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term96770 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term96672, term96672.getClass(), "_concatCBuffer", null);
        setField(term96672, term96672.getClass(), "_bufferRecycler", term96770);
        term96832 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        term95086 = (byte[]) newByteArray(489);
        setByteElement(term95086, 0, (byte) 81);
        setByteElement(term95086, 1, (byte) 85);
        setByteElement(term95086, 2, (byte) 79);
        setByteElement(term95086, 3, (byte) 84);
        setByteElement(term95086, 4, (byte) 69);
        setByteElement(term95086, 5, (byte) 95);
        setByteElement(term95086, 6, (byte) 70);
        setByteElement(term95086, 7, (byte) 73);
        setByteElement(term95086, 8, (byte) 69);
        setByteElement(term95086, 9, (byte) 76);
        setByteElement(term95086, 10, (byte) 68);
        setByteElement(term95086, 11, (byte) 95);
        setByteElement(term95086, 12, (byte) 78);
        setByteElement(term95086, 13, (byte) 65);
        setByteElement(term95086, 14, (byte) 77);
        setByteElement(term95086, 15, (byte) 69);
        setByteElement(term95086, 16, (byte) 83);
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
        args[0] = term96672;
        args[1] = -1;
        args[2] = null;
        args[3] = term96832;
        args[4] = term95086;
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


