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

public class UTF8JsonGenerator_init_1882684473190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56991;
     Object term56063;

    public UTF8JsonGenerator_init_1882684473190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56567 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term56318 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term56669 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term56329 = (int[]) newIntArray(0);
        Object term56767 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term56851 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term56907 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setIntField(term56567, term56567.getClass(), "_features", 0);
        setField(term56567, term56567.getClass(), "_objectCodec", term56318);
        setField(term56567, term56567.getClass(), "_writeContext", term56669);
        setBooleanField(term56567, term56567.getClass(), "_cfgNumbersAsStrings", false);
        setField(term56567, term56567.getClass(), "_outputEscapes", term56329);
        setField(term56567, term56567.getClass(), "_rootValueSeparator", term56767);
        setField(term56567, term56567.getClass(), "_ioContext", term56851);
        setIntField(term56567, term56567.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term56567, term56567.getClass(), "_cfgUnqNames", false);
        setField(term56567, term56567.getClass(), "_outputStream", term56907);
        setBooleanField(term56567, term56567.getClass(), "_bufferRecyclable", false);
        term56991 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term56063 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term56991;
        args[1] = -1;
        args[2] = term56063;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


