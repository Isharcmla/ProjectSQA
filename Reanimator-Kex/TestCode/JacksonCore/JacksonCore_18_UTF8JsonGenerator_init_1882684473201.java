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

public class UTF8JsonGenerator_init_1882684473201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68800;
     Object term68864;

    public UTF8JsonGenerator_init_1882684473201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term68618 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term67878 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term67888 = (int[]) newIntArray(0);
        term68800 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term67895 = (byte[]) newByteArray(489);
        Object term68758 = newInstance(Class.forName("java.io.PipedOutputStream"));
        setIntField(term68618, term68618.getClass(), "_features", 0);
        setField(term68618, term68618.getClass(), "_objectCodec", term67878);
        setField(term68618, term68618.getClass(), "_writeContext", null);
        setBooleanField(term68618, term68618.getClass(), "_cfgNumbersAsStrings", false);
        setField(term68618, term68618.getClass(), "_outputEscapes", term67888);
        setField(term68618, term68618.getClass(), "_rootValueSeparator", null);
        setByteElement(term67895, 0, (byte) 73);
        setByteElement(term67895, 1, (byte) 71);
        setByteElement(term67895, 2, (byte) 78);
        setByteElement(term67895, 3, (byte) 79);
        setByteElement(term67895, 4, (byte) 82);
        setByteElement(term67895, 5, (byte) 69);
        setByteElement(term67895, 6, (byte) 95);
        setByteElement(term67895, 7, (byte) 85);
        setByteElement(term67895, 8, (byte) 78);
        setByteElement(term67895, 9, (byte) 75);
        setByteElement(term67895, 10, (byte) 78);
        setByteElement(term67895, 11, (byte) 79);
        setByteElement(term67895, 12, (byte) 87);
        setByteElement(term67895, 13, (byte) 78);
        setField(term68800, term68800.getClass(), "_writeEncodingBuffer", term67895);
        setField(term68618, term68618.getClass(), "_ioContext", term68800);
        setIntField(term68618, term68618.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term68618, term68618.getClass(), "_cfgUnqNames", false);
        setField(term68618, term68618.getClass(), "_outputStream", term68758);
        setBooleanField(term68618, term68618.getClass(), "_bufferRecyclable", false);
        term68864 = newInstance(Class.forName("java.util.jar.JarOutputStream"));
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
        args[0] = term68800;
        args[1] = -1;
        args[2] = null;
        args[3] = term68864;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


