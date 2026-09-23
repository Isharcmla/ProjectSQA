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

public class UTF8JsonGenerator_init_25805811205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75793;
     Object term73993;

    public UTF8JsonGenerator_init_25805811205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75489 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term74739 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term74749 = (int[]) newIntArray(0);
        Object term75587 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term75671 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term75721 = newInstance(Class.forName("java.io.OutputStream$1"));
        byte[] term74759 = (byte[]) newByteArray(0);
        setIntField(term75489, term75489.getClass(), "_features", 0);
        setField(term75489, term75489.getClass(), "_objectCodec", term74739);
        setField(term75489, term75489.getClass(), "_writeContext", null);
        setBooleanField(term75489, term75489.getClass(), "_cfgNumbersAsStrings", false);
        setField(term75489, term75489.getClass(), "_outputEscapes", term74749);
        setField(term75489, term75489.getClass(), "_rootValueSeparator", term75587);
        setField(term75489, term75489.getClass(), "_ioContext", term75671);
        setIntField(term75489, term75489.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term75489, term75489.getClass(), "_cfgUnqNames", false);
        setField(term75489, term75489.getClass(), "_outputStream", term75721);
        setBooleanField(term75489, term75489.getClass(), "_bufferRecyclable", false);
        setIntField(term75489, term75489.getClass(), "_outputTail", 0);
        setField(term75489, term75489.getClass(), "_outputBuffer", term74759);
        setIntField(term75489, term75489.getClass(), "_outputEnd", 0);
        setIntField(term75489, term75489.getClass(), "_outputMaxContiguous", 0);
        term75793 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        term73993 = (byte[]) newByteArray(489);
        setByteElement(term73993, 0, (byte) 73);
        setByteElement(term73993, 1, (byte) 71);
        setByteElement(term73993, 2, (byte) 78);
        setByteElement(term73993, 3, (byte) 79);
        setByteElement(term73993, 4, (byte) 82);
        setByteElement(term73993, 5, (byte) 69);
        setByteElement(term73993, 6, (byte) 95);
        setByteElement(term73993, 7, (byte) 85);
        setByteElement(term73993, 8, (byte) 78);
        setByteElement(term73993, 9, (byte) 75);
        setByteElement(term73993, 10, (byte) 78);
        setByteElement(term73993, 11, (byte) 79);
        setByteElement(term73993, 12, (byte) 87);
        setByteElement(term73993, 13, (byte) 78);
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
        args[0] = null;
        args[1] = -1;
        args[2] = null;
        args[3] = term75793;
        args[4] = term73993;
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


