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

public class WriterBasedJsonGenerator_init_468304896149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32030;
     Object term31099;

    public WriterBasedJsonGenerator_init_468304896149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31616 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term31354 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term31718 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term31365 = (int[]) newIntArray(0);
        Object term31816 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term31900 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term31946 = newInstance(Class.forName("java.io.StringWriter"));
        setIntField(term31616, term31616.getClass(), "_features", 0);
        setField(term31616, term31616.getClass(), "_objectCodec", term31354);
        setField(term31616, term31616.getClass(), "_writeContext", term31718);
        setBooleanField(term31616, term31616.getClass(), "_cfgNumbersAsStrings", false);
        setField(term31616, term31616.getClass(), "_outputEscapes", term31365);
        setField(term31616, term31616.getClass(), "_rootValueSeparator", term31816);
        setField(term31616, term31616.getClass(), "_ioContext", term31900);
        setIntField(term31616, term31616.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term31616, term31616.getClass(), "_cfgUnqNames", false);
        setField(term31616, term31616.getClass(), "_writer", term31946);
        term32030 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term31099 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.Writer");
        Object[] args = new Object[4];
        args[0] = term32030;
        args[1] = -1;
        args[2] = term31099;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


