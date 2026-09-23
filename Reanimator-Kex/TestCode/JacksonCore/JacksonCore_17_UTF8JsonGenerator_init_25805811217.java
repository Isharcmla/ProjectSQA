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

public class UTF8JsonGenerator_init_25805811217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93194;
     Object term93299;
     Object term91206;

    public UTF8JsonGenerator_init_25805811217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92708 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term91952 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term92810 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term91963 = (int[]) newIntArray(0);
        Object term92908 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term93194 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term93243 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term93152 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        byte[] term91972 = (byte[]) newByteArray(0);
        setIntField(term92708, term92708.getClass(), "_features", 0);
        setField(term92708, term92708.getClass(), "_objectCodec", term91952);
        setField(term92708, term92708.getClass(), "_writeContext", term92810);
        setBooleanField(term92708, term92708.getClass(), "_cfgNumbersAsStrings", false);
        setField(term92708, term92708.getClass(), "_outputEscapes", term91963);
        setField(term92708, term92708.getClass(), "_rootValueSeparator", term92908);
        setField(term93194, term93194.getClass(), "_concatCBuffer", null);
        setField(term93194, term93194.getClass(), "_bufferRecycler", term93243);
        setField(term92708, term92708.getClass(), "_ioContext", term93194);
        setIntField(term92708, term92708.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term92708, term92708.getClass(), "_cfgUnqNames", false);
        setField(term92708, term92708.getClass(), "_outputStream", term93152);
        setBooleanField(term92708, term92708.getClass(), "_bufferRecyclable", false);
        setIntField(term92708, term92708.getClass(), "_outputTail", 0);
        setField(term92708, term92708.getClass(), "_outputBuffer", term91972);
        setIntField(term92708, term92708.getClass(), "_outputEnd", 0);
        setIntField(term92708, term92708.getClass(), "_outputMaxContiguous", 0);
        term93299 = newInstance(Class.forName("java.io.PipedOutputStream"));
        term91206 = (byte[]) newByteArray(489);
        setByteElement(term91206, 0, (byte) 32);
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
        args[0] = term93194;
        args[1] = -1;
        args[2] = null;
        args[3] = term93299;
        args[4] = term91206;
        args[5] = 0;
        args[6] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


