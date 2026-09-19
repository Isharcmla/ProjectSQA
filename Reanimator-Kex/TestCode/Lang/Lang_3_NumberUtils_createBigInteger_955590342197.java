package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_createBigInteger_955590342197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139211;

    public NumberUtils_createBigInteger_955590342197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139211 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term139213 = (int[]) newIntArray(0);
        setIntField(term139211, term139211.getClass(), "signum", 0);
        setField(term139211, term139211.getClass(), "mag", term139213);
        setIntField(term139211, term139211.getClass(), "bitCountPlusOne", 0);
        setIntField(term139211, term139211.getClass(), "bitLengthPlusOne", 0);
        setIntField(term139211, term139211.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term139211, term139211.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "0";
        Object retValue = callMethod(klass, "createBigInteger", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term139211));
    }

};


