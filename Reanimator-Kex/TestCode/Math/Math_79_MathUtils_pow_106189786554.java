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

public class MathUtils_pow_106189786554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;
     Object term274;

    public MathUtils_pow_106189786554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term265 = (int[]) newIntArray(4);
        setIntField(term263, term263.getClass(), "signum", 1);
        setIntElement(term265, 0, -165862327);
        setIntElement(term265, 1, 1335502000);
        setIntElement(term265, 2, -1994335642);
        setIntElement(term265, 3, -1099245088);
        setField(term263, term263.getClass(), "mag", term265);
        setIntField(term263, term263.getClass(), "bitCountPlusOne", 0);
        setIntField(term263, term263.getClass(), "bitLengthPlusOne", 0);
        setIntField(term263, term263.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term263, term263.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term274 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term276 = (int[]) newIntArray(4);
        setIntField(term274, term274.getClass(), "signum", 1);
        setIntElement(term276, 0, 1397923395);
        setIntElement(term276, 1, 1257594315);
        setIntElement(term276, 2, -1189378466);
        setIntElement(term276, 3, 834705699);
        setField(term274, term274.getClass(), "mag", term276);
        setIntField(term274, term274.getClass(), "bitCountPlusOne", 0);
        setIntField(term274, term274.getClass(), "bitLengthPlusOne", 0);
        setIntField(term274, term274.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term274, term274.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.math.BigInteger");
        argTypes[1] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[2];
        args[0] = term263;
        args[1] = term274;
        callMethod(klass, "pow", argTypes, null, args);
    }

};


