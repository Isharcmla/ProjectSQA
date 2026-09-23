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

public class UTF8JsonGenerator_init_25805811246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620203;
     Object term619187;
     Object term619188;

    public UTF8JsonGenerator_init_25805811246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term619983 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term620081 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term619983, term619983.getClass(), "_features", 0);
        setField(term619983, term619983.getClass(), "_objectCodec", null);
        setField(term619983, term619983.getClass(), "_writeContext", null);
        setBooleanField(term619983, term619983.getClass(), "_cfgNumbersAsStrings", false);
        setField(term619983, term619983.getClass(), "_outputEscapes", null);
        setField(term620081, term620081.getClass(), "_value", " ");
        setField(term620081, term620081.getClass(), "_quotedUTF8Ref", null);
        setField(term620081, term620081.getClass(), "_unquotedUTF8Ref", null);
        setField(term620081, term620081.getClass(), "_quotedChars", null);
        setField(term620081, term620081.getClass(), "_jdkSerializeValue", null);
        setField(term619983, term619983.getClass(), "_rootValueSeparator", term620081);
        setField(term619983, term619983.getClass(), "_ioContext", null);
        setIntField(term619983, term619983.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term619983, term619983.getClass(), "_cfgUnqNames", false);
        setField(term619983, term619983.getClass(), "_outputStream", null);
        setBooleanField(term619983, term619983.getClass(), "_bufferRecyclable", false);
        setIntField(term619983, term619983.getClass(), "_outputTail", 0);
        setField(term619983, term619983.getClass(), "_outputBuffer", null);
        setIntField(term619983, term619983.getClass(), "_outputEnd", 0);
        setIntField(term619983, term619983.getClass(), "_outputMaxContiguous", 0);
        term620203 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term620301 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term619721 = (Object[]) newArray("[C", 4);
        char[] term619722 = (char[]) newCharArray(0);
        setField(term620203, term620203.getClass(), "_concatCBuffer", null);
        setElement(term619721, 1, term619722);
        setField(term620301, term620301.getClass(), "_charBuffers", term619721);
        setField(term620203, term620203.getClass(), "_bufferRecycler", term620301);
        term619187 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term619188 = (byte[]) newByteArray(0);
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
        args[0] = term620203;
        args[1] = -1;
        args[2] = term619187;
        args[3] = null;
        args[4] = term619188;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


