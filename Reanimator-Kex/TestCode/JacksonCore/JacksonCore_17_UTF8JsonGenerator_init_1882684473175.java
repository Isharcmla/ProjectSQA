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

public class UTF8JsonGenerator_init_1882684473175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47356;
     Object term47463;

    public UTF8JsonGenerator_init_1882684473175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46862 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term46607 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term46964 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term46618 = (int[]) newIntArray(0);
        Object term47062 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term47356 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term47405 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term47314 = newInstance(Class.forName("java.util.Base64$EncOutputStream"));
        setIntField(term46862, term46862.getClass(), "_features", 0);
        setField(term46862, term46862.getClass(), "_objectCodec", term46607);
        setField(term46862, term46862.getClass(), "_writeContext", term46964);
        setBooleanField(term46862, term46862.getClass(), "_cfgNumbersAsStrings", false);
        setField(term46862, term46862.getClass(), "_outputEscapes", term46618);
        setField(term46862, term46862.getClass(), "_rootValueSeparator", term47062);
        setField(term47356, term47356.getClass(), "_writeEncodingBuffer", null);
        setField(term47356, term47356.getClass(), "_bufferRecycler", term47405);
        setField(term46862, term46862.getClass(), "_ioContext", term47356);
        setIntField(term46862, term46862.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term46862, term46862.getClass(), "_cfgUnqNames", false);
        setField(term46862, term46862.getClass(), "_outputStream", term47314);
        setBooleanField(term46862, term46862.getClass(), "_bufferRecyclable", false);
        term47463 = newInstance(Class.forName("java.io.FilterOutputStream"));
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
        args[0] = term47356;
        args[1] = -1;
        args[2] = null;
        args[3] = term47463;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


