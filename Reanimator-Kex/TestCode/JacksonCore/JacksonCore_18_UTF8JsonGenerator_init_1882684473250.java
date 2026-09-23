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

public class UTF8JsonGenerator_init_1882684473250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670975;
     Object term669972;
     Object term671129;

    public UTF8JsonGenerator_init_1882684473250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term670755 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term670853 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term670755, term670755.getClass(), "_features", 0);
        setField(term670755, term670755.getClass(), "_objectCodec", null);
        setField(term670755, term670755.getClass(), "_writeContext", null);
        setBooleanField(term670755, term670755.getClass(), "_cfgNumbersAsStrings", false);
        setField(term670755, term670755.getClass(), "_outputEscapes", null);
        setField(term670853, term670853.getClass(), "_value", " ");
        setField(term670853, term670853.getClass(), "_quotedUTF8Ref", null);
        setField(term670853, term670853.getClass(), "_unquotedUTF8Ref", null);
        setField(term670853, term670853.getClass(), "_quotedChars", null);
        setField(term670853, term670853.getClass(), "_jdkSerializeValue", null);
        setField(term670755, term670755.getClass(), "_rootValueSeparator", term670853);
        setField(term670755, term670755.getClass(), "_ioContext", null);
        setIntField(term670755, term670755.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term670755, term670755.getClass(), "_cfgUnqNames", false);
        setField(term670755, term670755.getClass(), "_outputStream", null);
        setBooleanField(term670755, term670755.getClass(), "_bufferRecyclable", false);
        term670975 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term671073 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term670501 = (Object[]) newArray("[B", 128);
        setField(term670975, term670975.getClass(), "_writeEncodingBuffer", null);
        setField(term671073, term671073.getClass(), "_byteBuffers", term670501);
        setField(term670975, term670975.getClass(), "_bufferRecycler", term671073);
        term669972 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term671129 = newInstance(Class.forName("java.io.PipedOutputStream"));
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
        args[0] = term670975;
        args[1] = -1;
        args[2] = term669972;
        args[3] = term671129;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


