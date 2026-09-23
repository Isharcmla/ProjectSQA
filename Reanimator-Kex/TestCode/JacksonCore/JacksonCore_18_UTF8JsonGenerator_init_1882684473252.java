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

public class UTF8JsonGenerator_init_1882684473252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term712718;
     Object term711941;

    public UTF8JsonGenerator_init_1882684473252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term712498 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term712596 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term712498, term712498.getClass(), "_features", 0);
        setField(term712498, term712498.getClass(), "_objectCodec", null);
        setField(term712498, term712498.getClass(), "_writeContext", null);
        setBooleanField(term712498, term712498.getClass(), "_cfgNumbersAsStrings", false);
        setField(term712498, term712498.getClass(), "_outputEscapes", null);
        setField(term712596, term712596.getClass(), "_value", " ");
        setField(term712596, term712596.getClass(), "_quotedUTF8Ref", null);
        setField(term712596, term712596.getClass(), "_unquotedUTF8Ref", null);
        setField(term712596, term712596.getClass(), "_quotedChars", null);
        setField(term712596, term712596.getClass(), "_jdkSerializeValue", null);
        setField(term712498, term712498.getClass(), "_rootValueSeparator", term712596);
        setField(term712498, term712498.getClass(), "_ioContext", null);
        setIntField(term712498, term712498.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term712498, term712498.getClass(), "_cfgUnqNames", false);
        setField(term712498, term712498.getClass(), "_outputStream", null);
        setBooleanField(term712498, term712498.getClass(), "_bufferRecyclable", false);
        setField(term712498, term712498.getClass(), "_outputBuffer", null);
        setIntField(term712498, term712498.getClass(), "_outputEnd", 0);
        setIntField(term712498, term712498.getClass(), "_outputMaxContiguous", 0);
        term712718 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term712816 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term712215 = (Object[]) newArray("[B", 8);
        byte[] term712216 = (byte[]) newByteArray(0);
        Object[] term712231 = (Object[]) newArray("[C", 2);
        char[] term712232 = (char[]) newCharArray(0);
        char[] term712233 = (char[]) newCharArray(0);
        setField(term712718, term712718.getClass(), "_writeEncodingBuffer", null);
        setElement(term712215, 0, term712216);
        setField(term712816, term712816.getClass(), "_byteBuffers", term712215);
        setElement(term712231, 0, term712232);
        setElement(term712231, 1, term712233);
        setField(term712816, term712816.getClass(), "_charBuffers", term712231);
        setField(term712718, term712718.getClass(), "_bufferRecycler", term712816);
        setField(term712718, term712718.getClass(), "_concatCBuffer", null);
        term711941 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term712718;
        args[1] = -1;
        args[2] = term711941;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


