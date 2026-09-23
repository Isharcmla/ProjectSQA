package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathUtils_pow_106189786559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term288;

    public MathUtils_pow_106189786559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term279 = (int[]) newIntArray(4);
        setIntField(term277, term277.getClass(), "signum", 1);
        setIntElement(term279, 0, -165862327);
        setIntElement(term279, 1, 1335502000);
        setIntElement(term279, 2, -1994335642);
        setIntElement(term279, 3, -1099245088);
        setField(term277, term277.getClass(), "mag", term279);
        setIntField(term277, term277.getClass(), "bitCountPlusOne", 0);
        setIntField(term277, term277.getClass(), "bitLengthPlusOne", 0);
        setIntField(term277, term277.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term277, term277.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term288 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term290 = (int[]) newIntArray(4);
        setIntField(term288, term288.getClass(), "signum", 1);
        setIntElement(term290, 0, 1397923395);
        setIntElement(term290, 1, 1257594315);
        setIntElement(term290, 2, -1189378466);
        setIntElement(term290, 3, 834705699);
        setField(term288, term288.getClass(), "mag", term290);
        setIntField(term288, term288.getClass(), "bitCountPlusOne", 0);
        setIntField(term288, term288.getClass(), "bitLengthPlusOne", 0);
        setIntField(term288, term288.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term288, term288.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[2];
        args[0] = term277;
        args[1] = term288;
        callMethod(klass, "pow", argTypes, null, args);
    }

};


