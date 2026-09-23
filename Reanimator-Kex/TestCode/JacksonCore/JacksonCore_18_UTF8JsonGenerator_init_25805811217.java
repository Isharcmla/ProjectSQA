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
     Object term90509;
     Object term90612;
     Object term88529;

    public UTF8JsonGenerator_init_25805811217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90031 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term89275 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term90133 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term89286 = (int[]) newIntArray(0);
        Object term90231 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term90509 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term90558 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term90467 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term89295 = (byte[]) newByteArray(0);
        setIntField(term90031, term90031.getClass(), "_features", 0);
        setField(term90031, term90031.getClass(), "_objectCodec", term89275);
        setField(term90031, term90031.getClass(), "_writeContext", term90133);
        setBooleanField(term90031, term90031.getClass(), "_cfgNumbersAsStrings", false);
        setField(term90031, term90031.getClass(), "_outputEscapes", term89286);
        setField(term90031, term90031.getClass(), "_rootValueSeparator", term90231);
        setField(term90509, term90509.getClass(), "_concatCBuffer", null);
        setField(term90509, term90509.getClass(), "_bufferRecycler", term90558);
        setField(term90031, term90031.getClass(), "_ioContext", term90509);
        setIntField(term90031, term90031.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term90031, term90031.getClass(), "_cfgUnqNames", false);
        setField(term90031, term90031.getClass(), "_outputStream", term90467);
        setBooleanField(term90031, term90031.getClass(), "_bufferRecyclable", false);
        setIntField(term90031, term90031.getClass(), "_outputTail", 0);
        setField(term90031, term90031.getClass(), "_outputBuffer", term89295);
        setIntField(term90031, term90031.getClass(), "_outputEnd", 0);
        setIntField(term90031, term90031.getClass(), "_outputMaxContiguous", 0);
        term90612 = newInstance(Class.forName("java.io.FileOutputStream"));
        term88529 = (byte[]) newByteArray(489);
        setByteElement(term88529, 0, (byte) 32);
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
        args[0] = term90509;
        args[1] = -1;
        args[2] = null;
        args[3] = term90612;
        args[4] = term88529;
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


