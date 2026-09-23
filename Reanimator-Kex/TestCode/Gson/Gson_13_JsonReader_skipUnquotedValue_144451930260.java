package com.google.gson.stream;

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
import static com.google.gson.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonReader_skipUnquotedValue_144451930260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3397;

    public JsonReader_skipUnquotedValue_144451930260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3397 = newInstance(Class.forName("com.google.gson.stream.JsonReader"));
        char[] term3399 = (char[]) newCharArray(6);
        int[] term3425 = (int[]) newIntArray(7);
        Object[] term3434 = (Object[]) newArray("java.lang.String", 0);
        int[] term3435 = (int[]) newIntArray(9);
        setField(term3397, term3397.getClass(), "in", null);
        setBooleanField(term3397, term3397.getClass(), "lenient", true);
        setCharElement(term3399, 0, 'd');
        setCharElement(term3399, 1, 'v');
        setCharElement(term3399, 2, 'g');
        setCharElement(term3399, 3, 'J');
        setCharElement(term3399, 4, 'l');
        setCharElement(term3399, 5, 'h');
        setField(term3397, term3397.getClass(), "buffer", term3399);
        setIntField(term3397, term3397.getClass(), "pos", -1667482829);
        setIntField(term3397, term3397.getClass(), "limit", 1116576792);
        setIntField(term3397, term3397.getClass(), "lineNumber", -942194446);
        setIntField(term3397, term3397.getClass(), "lineStart", -938508470);
        setIntField(term3397, term3397.getClass(), "peeked", 1242676024);
        setLongField(term3397, term3397.getClass(), "peekedLong", -2585684163342970173L);
        setIntField(term3397, term3397.getClass(), "peekedNumberLength", -1865023308);
        setField(term3397, term3397.getClass(), "peekedString", "iNwOJRBEjp");
        setIntElement(term3425, 0, 1698510819);
        setIntElement(term3425, 1, -1553893255);
        setIntElement(term3425, 2, 1303442927);
        setIntElement(term3425, 3, 794568325);
        setIntElement(term3425, 4, -434468428);
        setIntElement(term3425, 5, 1559605714);
        setIntElement(term3425, 6, 1146601902);
        setField(term3397, term3397.getClass(), "stack", term3425);
        setIntField(term3397, term3397.getClass(), "stackSize", -1938881385);
        setField(term3397, term3397.getClass(), "pathNames", term3434);
        setIntElement(term3435, 0, -1629418973);
        setIntElement(term3435, 1, -100825168);
        setIntElement(term3435, 2, 768407648);
        setIntElement(term3435, 3, -350454594);
        setIntElement(term3435, 4, -1148142995);
        setIntElement(term3435, 5, -233024044);
        setIntElement(term3435, 6, 1820784228);
        setIntElement(term3435, 7, 1390820006);
        setIntElement(term3435, 8, -828982065);
        setField(term3397, term3397.getClass(), "pathIndices", term3435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.stream.JsonReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipUnquotedValue", argTypes, term3397, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


