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

public class UTF8JsonGenerator_init_1882684473183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54828;

    public UTF8JsonGenerator_init_1882684473183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54478 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term54580 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term54243 = (int[]) newIntArray(0);
        Object term54678 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term54744 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setIntField(term54478, term54478.getClass(), "_features", 0);
        setField(term54478, term54478.getClass(), "_objectCodec", null);
        setField(term54478, term54478.getClass(), "_writeContext", term54580);
        setBooleanField(term54478, term54478.getClass(), "_cfgNumbersAsStrings", false);
        setField(term54478, term54478.getClass(), "_outputEscapes", term54243);
        setField(term54478, term54478.getClass(), "_rootValueSeparator", term54678);
        setField(term54478, term54478.getClass(), "_ioContext", null);
        setBooleanField(term54478, term54478.getClass(), "_cfgUnqNames", false);
        setField(term54478, term54478.getClass(), "_outputStream", term54744);
        setBooleanField(term54478, term54478.getClass(), "_bufferRecyclable", false);
        term54828 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term54828;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


