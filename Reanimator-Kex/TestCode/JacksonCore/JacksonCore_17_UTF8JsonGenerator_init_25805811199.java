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

public class UTF8JsonGenerator_init_25805811199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72883;
     Object term71184;
     Object term71185;

    public UTF8JsonGenerator_init_25805811199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72697 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term72799 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term71949 = (int[]) newIntArray(0);
        byte[] term71956 = (byte[]) newByteArray(0);
        setIntField(term72697, term72697.getClass(), "_features", 0);
        setField(term72697, term72697.getClass(), "_objectCodec", null);
        setField(term72697, term72697.getClass(), "_writeContext", term72799);
        setBooleanField(term72697, term72697.getClass(), "_cfgNumbersAsStrings", false);
        setField(term72697, term72697.getClass(), "_outputEscapes", term71949);
        setField(term72697, term72697.getClass(), "_rootValueSeparator", null);
        setField(term72697, term72697.getClass(), "_ioContext", null);
        setIntField(term72697, term72697.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term72697, term72697.getClass(), "_cfgUnqNames", false);
        setField(term72697, term72697.getClass(), "_outputStream", null);
        setBooleanField(term72697, term72697.getClass(), "_bufferRecyclable", false);
        setIntField(term72697, term72697.getClass(), "_outputTail", 0);
        setField(term72697, term72697.getClass(), "_outputBuffer", term71956);
        setIntField(term72697, term72697.getClass(), "_outputEnd", 0);
        setIntField(term72697, term72697.getClass(), "_outputMaxContiguous", 0);
        term72883 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term72981 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term72883, term72883.getClass(), "_concatCBuffer", null);
        setField(term72883, term72883.getClass(), "_bufferRecycler", term72981);
        term71184 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term71185 = (byte[]) newByteArray(497);
        setByteElement(term71185, 0, (byte) 65);
        setByteElement(term71185, 1, (byte) 85);
        setByteElement(term71185, 2, (byte) 84);
        setByteElement(term71185, 3, (byte) 79);
        setByteElement(term71185, 4, (byte) 95);
        setByteElement(term71185, 5, (byte) 67);
        setByteElement(term71185, 6, (byte) 76);
        setByteElement(term71185, 7, (byte) 79);
        setByteElement(term71185, 8, (byte) 83);
        setByteElement(term71185, 9, (byte) 69);
        setByteElement(term71185, 10, (byte) 95);
        setByteElement(term71185, 11, (byte) 74);
        setByteElement(term71185, 12, (byte) 83);
        setByteElement(term71185, 13, (byte) 79);
        setByteElement(term71185, 14, (byte) 78);
        setByteElement(term71185, 15, (byte) 95);
        setByteElement(term71185, 16, (byte) 67);
        setByteElement(term71185, 17, (byte) 79);
        setByteElement(term71185, 18, (byte) 78);
        setByteElement(term71185, 19, (byte) 84);
        setByteElement(term71185, 20, (byte) 69);
        setByteElement(term71185, 21, (byte) 78);
        setByteElement(term71185, 22, (byte) 84);
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
        args[0] = term72883;
        args[1] = -1;
        args[2] = term71184;
        args[3] = null;
        args[4] = term71185;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


