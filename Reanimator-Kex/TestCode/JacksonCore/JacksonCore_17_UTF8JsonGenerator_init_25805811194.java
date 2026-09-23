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

public class UTF8JsonGenerator_init_25805811194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65458;
     Object term64004;
     Object term64005;

    public UTF8JsonGenerator_init_25805811194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65104 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term64559 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term64568 = (int[]) newIntArray(0);
        Object term65202 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term65286 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term65374 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        byte[] term64577 = (byte[]) newByteArray(0);
        setIntField(term65104, term65104.getClass(), "_features", 0);
        setField(term65104, term65104.getClass(), "_objectCodec", term64559);
        setField(term65104, term65104.getClass(), "_writeContext", null);
        setBooleanField(term65104, term65104.getClass(), "_cfgNumbersAsStrings", false);
        setField(term65104, term65104.getClass(), "_outputEscapes", term64568);
        setField(term65104, term65104.getClass(), "_rootValueSeparator", term65202);
        setField(term65104, term65104.getClass(), "_ioContext", term65286);
        setBooleanField(term65104, term65104.getClass(), "_cfgUnqNames", false);
        setField(term65104, term65104.getClass(), "_outputStream", term65374);
        setBooleanField(term65104, term65104.getClass(), "_bufferRecyclable", false);
        setIntField(term65104, term65104.getClass(), "_outputTail", 0);
        setField(term65104, term65104.getClass(), "_outputBuffer", term64577);
        term65458 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term64004 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term64005 = (byte[]) newByteArray(297);
        setByteElement(term64005, 0, (byte) 65);
        setByteElement(term64005, 1, (byte) 85);
        setByteElement(term64005, 2, (byte) 84);
        setByteElement(term64005, 3, (byte) 79);
        setByteElement(term64005, 4, (byte) 95);
        setByteElement(term64005, 5, (byte) 67);
        setByteElement(term64005, 6, (byte) 76);
        setByteElement(term64005, 7, (byte) 79);
        setByteElement(term64005, 8, (byte) 83);
        setByteElement(term64005, 9, (byte) 69);
        setByteElement(term64005, 10, (byte) 95);
        setByteElement(term64005, 11, (byte) 74);
        setByteElement(term64005, 12, (byte) 83);
        setByteElement(term64005, 13, (byte) 79);
        setByteElement(term64005, 14, (byte) 78);
        setByteElement(term64005, 15, (byte) 95);
        setByteElement(term64005, 16, (byte) 67);
        setByteElement(term64005, 17, (byte) 79);
        setByteElement(term64005, 18, (byte) 78);
        setByteElement(term64005, 19, (byte) 84);
        setByteElement(term64005, 20, (byte) 69);
        setByteElement(term64005, 21, (byte) 78);
        setByteElement(term64005, 22, (byte) 84);
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
        args[0] = term65458;
        args[1] = 2147483629;
        args[2] = term64004;
        args[3] = null;
        args[4] = term64005;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


