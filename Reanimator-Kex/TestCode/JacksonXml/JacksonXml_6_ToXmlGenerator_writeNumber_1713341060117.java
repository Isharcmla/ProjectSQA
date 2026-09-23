package com.fasterxml.jackson.dataformat.xml.ser;

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
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ToXmlGenerator_writeNumber_1713341060117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;

    public ToXmlGenerator_writeNumber_1713341060117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term725 = (int[]) newIntArray(4);
        setIntField(term723, term723.getClass(), "signum", 1);
        setIntElement(term725, 0, 791012385);
        setIntElement(term725, 1, 819285061);
        setIntElement(term725, 2, 1509521496);
        setIntElement(term725, 3, 1264343831);
        setField(term723, term723.getClass(), "mag", term725);
        setIntField(term723, term723.getClass(), "bitCountPlusOne", 0);
        setIntField(term723, term723.getClass(), "bitLengthPlusOne", 0);
        setIntField(term723, term723.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term723, term723.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term723;
        try {
            callMethod(klass, "writeNumber", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


