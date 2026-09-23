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

public class UTF8JsonGenerator_init_1882684473173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42901;
     Object term42955;

    public UTF8JsonGenerator_init_1882684473173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42713 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term41973 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term41983 = (int[]) newIntArray(0);
        term42901 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term41990 = (byte[]) newByteArray(489);
        Object term42859 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setIntField(term42713, term42713.getClass(), "_features", 0);
        setField(term42713, term42713.getClass(), "_objectCodec", term41973);
        setField(term42713, term42713.getClass(), "_writeContext", null);
        setBooleanField(term42713, term42713.getClass(), "_cfgNumbersAsStrings", false);
        setField(term42713, term42713.getClass(), "_outputEscapes", term41983);
        setField(term42713, term42713.getClass(), "_rootValueSeparator", null);
        setByteElement(term41990, 0, (byte) 73);
        setByteElement(term41990, 1, (byte) 71);
        setByteElement(term41990, 2, (byte) 78);
        setByteElement(term41990, 3, (byte) 79);
        setByteElement(term41990, 4, (byte) 82);
        setByteElement(term41990, 5, (byte) 69);
        setByteElement(term41990, 6, (byte) 95);
        setByteElement(term41990, 7, (byte) 85);
        setByteElement(term41990, 8, (byte) 78);
        setByteElement(term41990, 9, (byte) 75);
        setByteElement(term41990, 10, (byte) 78);
        setByteElement(term41990, 11, (byte) 79);
        setByteElement(term41990, 12, (byte) 87);
        setByteElement(term41990, 13, (byte) 78);
        setField(term42901, term42901.getClass(), "_writeEncodingBuffer", term41990);
        setField(term42713, term42713.getClass(), "_ioContext", term42901);
        setIntField(term42713, term42713.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term42713, term42713.getClass(), "_cfgUnqNames", false);
        setField(term42713, term42713.getClass(), "_outputStream", term42859);
        setBooleanField(term42713, term42713.getClass(), "_bufferRecyclable", false);
        term42955 = newInstance(Class.forName("java.io.FileOutputStream"));
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
        args[0] = term42901;
        args[1] = -1;
        args[2] = null;
        args[3] = term42955;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


