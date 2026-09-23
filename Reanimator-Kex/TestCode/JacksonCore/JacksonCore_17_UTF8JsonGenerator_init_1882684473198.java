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

public class UTF8JsonGenerator_init_1882684473198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67809;

    public UTF8JsonGenerator_init_1882684473198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67493 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term66754 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term67595 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term67679 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term67753 = newInstance(Class.forName("java.util.zip.InflaterOutputStream"));
        setIntField(term67493, term67493.getClass(), "_features", 0);
        setField(term67493, term67493.getClass(), "_objectCodec", term66754);
        setIntField(term67595, term67595.getClass(), "_type", 0);
        setField(term67595, term67595.getClass(), "_parent", null);
        setField(term67595, term67595.getClass(), "_dups", null);
        setIntField(term67595, term67595.getClass(), "_index", 0);
        setField(term67493, term67493.getClass(), "_writeContext", term67595);
        setBooleanField(term67493, term67493.getClass(), "_cfgNumbersAsStrings", false);
        setField(term67493, term67493.getClass(), "_outputEscapes", null);
        setField(term67493, term67493.getClass(), "_rootValueSeparator", null);
        setField(term67493, term67493.getClass(), "_ioContext", term67679);
        setIntField(term67493, term67493.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term67493, term67493.getClass(), "_cfgUnqNames", false);
        setField(term67493, term67493.getClass(), "_outputStream", term67753);
        setBooleanField(term67493, term67493.getClass(), "_bufferRecyclable", false);
        term67809 = newInstance(Class.forName("java.io.PipedOutputStream"));
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
        args[0] = null;
        args[1] = -1;
        args[2] = null;
        args[3] = term67809;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


