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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_1882684473241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485910;

    public UTF8JsonGenerator_init_1882684473241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term485690 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term485226 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term485788 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] term485271 = (byte[]) newByteArray(0);
        setIntField(term485690, term485690.getClass(), "_features", 0);
        setField(term485690, term485690.getClass(), "_objectCodec", term485226);
        setField(term485690, term485690.getClass(), "_writeContext", null);
        setBooleanField(term485690, term485690.getClass(), "_cfgNumbersAsStrings", false);
        setField(term485690, term485690.getClass(), "_outputEscapes", null);
        setField(term485788, term485788.getClass(), "_value", " ");
        setField(term485788, term485788.getClass(), "_quotedUTF8Ref", null);
        setField(term485788, term485788.getClass(), "_unquotedUTF8Ref", null);
        setField(term485788, term485788.getClass(), "_quotedChars", null);
        setField(term485788, term485788.getClass(), "_jdkSerializeValue", null);
        setField(term485690, term485690.getClass(), "_rootValueSeparator", term485788);
        setField(term485690, term485690.getClass(), "_ioContext", null);
        setIntField(term485690, term485690.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term485690, term485690.getClass(), "_cfgUnqNames", false);
        setField(term485690, term485690.getClass(), "_outputStream", null);
        setBooleanField(term485690, term485690.getClass(), "_bufferRecyclable", false);
        setField(term485690, term485690.getClass(), "_outputBuffer", term485271);
        setIntField(term485690, term485690.getClass(), "_outputEnd", 0);
        setIntField(term485690, term485690.getClass(), "_outputMaxContiguous", 0);
        term485910 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term486008 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term485252 = (Object[]) newArray("[B", 2);
        byte[] term485253 = (byte[]) newByteArray(0);
        Object[] term485420 = (Object[]) newArray("[C", 0);
        setField(term485910, term485910.getClass(), "_writeEncodingBuffer", null);
        setElement(term485252, 1, term485253);
        setField(term486008, term486008.getClass(), "_byteBuffers", term485252);
        setField(term486008, term486008.getClass(), "_charBuffers", term485420);
        setField(term485910, term485910.getClass(), "_bufferRecycler", term486008);
        setField(term485910, term485910.getClass(), "_concatCBuffer", null);
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
        args[0] = term485910;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


