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

public class UTF8JsonGenerator_init_1882684473244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577750;
     Object term576720;

    public UTF8JsonGenerator_init_1882684473244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term577474 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term576975 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term577572 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term577666 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setIntField(term577474, term577474.getClass(), "_features", 0);
        setField(term577474, term577474.getClass(), "_objectCodec", term576975);
        setField(term577474, term577474.getClass(), "_writeContext", null);
        setBooleanField(term577474, term577474.getClass(), "_cfgNumbersAsStrings", false);
        setField(term577474, term577474.getClass(), "_outputEscapes", null);
        setField(term577572, term577572.getClass(), "_value", " ");
        setField(term577572, term577572.getClass(), "_quotedUTF8Ref", null);
        setField(term577572, term577572.getClass(), "_unquotedUTF8Ref", null);
        setField(term577572, term577572.getClass(), "_quotedChars", null);
        setField(term577572, term577572.getClass(), "_jdkSerializeValue", null);
        setField(term577474, term577474.getClass(), "_rootValueSeparator", term577572);
        setField(term577474, term577474.getClass(), "_ioContext", null);
        setIntField(term577474, term577474.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term577474, term577474.getClass(), "_cfgUnqNames", false);
        setField(term577474, term577474.getClass(), "_outputStream", term577666);
        setBooleanField(term577474, term577474.getClass(), "_bufferRecyclable", false);
        term577750 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term577848 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term577002 = (Object[]) newArray("[B", 2);
        byte[] term577003 = (byte[]) newByteArray(108);
        setField(term577750, term577750.getClass(), "_writeEncodingBuffer", null);
        setElement(term577002, 1, term577003);
        setField(term577848, term577848.getClass(), "_byteBuffers", term577002);
        setField(term577750, term577750.getClass(), "_bufferRecycler", term577848);
        term576720 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term577750;
        args[1] = -1;
        args[2] = term576720;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


