package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigFraction_reduce_67122821947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1407;

    public BigFraction_reduce_67122821947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1407 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1408 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1410 = (int[]) newIntArray(4);
        Object term1419 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1421 = (int[]) newIntArray(4);
        setIntField(term1408, term1408.getClass(), "signum", 1);
        setIntElement(term1410, 0, 923690932);
        setIntElement(term1410, 1, -69316812);
        setIntElement(term1410, 2, -52588624);
        setIntElement(term1410, 3, -1009269655);
        setField(term1408, term1408.getClass(), "mag", term1410);
        setIntField(term1408, term1408.getClass(), "bitCountPlusOne", 0);
        setIntField(term1408, term1408.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1408, term1408.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1408, term1408.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1407, term1407.getClass(), "numerator", term1408);
        setIntField(term1419, term1419.getClass(), "signum", 1);
        setIntElement(term1421, 0, -563717973);
        setIntElement(term1421, 1, 1229957761);
        setIntElement(term1421, 2, 175429963);
        setIntElement(term1421, 3, 605166664);
        setField(term1419, term1419.getClass(), "mag", term1421);
        setIntField(term1419, term1419.getClass(), "bitCountPlusOne", 0);
        setIntField(term1419, term1419.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1419, term1419.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1419, term1419.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1407, term1407.getClass(), "denominator", term1419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reduce", argTypes, term1407, args);
    }

};
