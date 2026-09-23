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

public class UTF8JsonGenerator_init_1882684473179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46127;

    public UTF8JsonGenerator_init_1882684473179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45789 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term45891 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term45554 = (int[]) newIntArray(0);
        Object term45989 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term46043 = newInstance(Class.forName("java.io.FileOutputStream"));
        setIntField(term45789, term45789.getClass(), "_features", 0);
        setField(term45789, term45789.getClass(), "_objectCodec", null);
        setField(term45789, term45789.getClass(), "_writeContext", term45891);
        setBooleanField(term45789, term45789.getClass(), "_cfgNumbersAsStrings", false);
        setField(term45789, term45789.getClass(), "_outputEscapes", term45554);
        setField(term45789, term45789.getClass(), "_rootValueSeparator", term45989);
        setField(term45789, term45789.getClass(), "_ioContext", null);
        setBooleanField(term45789, term45789.getClass(), "_cfgUnqNames", false);
        setField(term45789, term45789.getClass(), "_outputStream", term46043);
        setBooleanField(term45789, term45789.getClass(), "_bufferRecyclable", false);
        term46127 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term46127;
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


