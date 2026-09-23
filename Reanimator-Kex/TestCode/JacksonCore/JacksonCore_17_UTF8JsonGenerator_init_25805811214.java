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

public class UTF8JsonGenerator_init_25805811214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89793;
     Object term87360;
     Object term89963;
     Object term87362;

    public UTF8JsonGenerator_init_25805811214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89355 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term88108 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term89457 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term89555 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term89639 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term89709 = newInstance(Class.forName("java.util.Base64$EncOutputStream"));
        byte[] term88129 = (byte[]) newByteArray(0);
        setIntField(term89355, term89355.getClass(), "_features", 0);
        setField(term89355, term89355.getClass(), "_objectCodec", term88108);
        setField(term89355, term89355.getClass(), "_writeContext", term89457);
        setBooleanField(term89355, term89355.getClass(), "_cfgNumbersAsStrings", false);
        setField(term89355, term89355.getClass(), "_outputEscapes", null);
        setField(term89355, term89355.getClass(), "_rootValueSeparator", term89555);
        setField(term89355, term89355.getClass(), "_ioContext", term89639);
        setIntField(term89355, term89355.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term89355, term89355.getClass(), "_cfgUnqNames", false);
        setField(term89355, term89355.getClass(), "_outputStream", term89709);
        setBooleanField(term89355, term89355.getClass(), "_bufferRecyclable", false);
        setIntField(term89355, term89355.getClass(), "_outputTail", 0);
        setField(term89355, term89355.getClass(), "_outputBuffer", term88129);
        setIntField(term89355, term89355.getClass(), "_outputEnd", 0);
        setIntField(term89355, term89355.getClass(), "_outputMaxContiguous", 0);
        term89793 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term89891 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term89793, term89793.getClass(), "_concatCBuffer", null);
        setField(term89793, term89793.getClass(), "_bufferRecycler", term89891);
        term87360 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term89963 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        term87362 = (byte[]) newByteArray(489);
        setByteElement(term87362, 1, (byte) 1);
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
        args[0] = term89793;
        args[1] = -1;
        args[2] = term87360;
        args[3] = term89963;
        args[4] = term87362;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


