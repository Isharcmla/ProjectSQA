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
import static org.apache.commons.math3.fraction.EqualityUtils.*;
import java.lang.Object;

public class BigFraction_getNumeratorAsInt_168236990785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;
     Object term9446;

    public BigFraction_getNumeratorAsInt_168236990785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term841 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term843 = (int[]) newIntArray(4);
        Object term852 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term854 = (int[]) newIntArray(4);
        setIntField(term841, term841.getClass(), "signum", 1);
        setIntElement(term843, 0, -595426672);
        setIntElement(term843, 1, 1740761777);
        setIntElement(term843, 2, -1048016766);
        setIntElement(term843, 3, 665122013);
        setField(term841, term841.getClass(), "mag", term843);
        setIntField(term841, term841.getClass(), "bitCountPlusOne", 0);
        setIntField(term841, term841.getClass(), "bitLengthPlusOne", 0);
        setIntField(term841, term841.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term841, term841.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term840, term840.getClass(), "numerator", term841);
        setIntField(term852, term852.getClass(), "signum", 1);
        setIntElement(term854, 0, -900530926);
        setIntElement(term854, 1, 156639734);
        setIntElement(term854, 2, 334540975);
        setIntElement(term854, 3, -1716710608);
        setField(term852, term852.getClass(), "mag", term854);
        setIntField(term852, term852.getClass(), "bitCountPlusOne", 0);
        setIntField(term852, term852.getClass(), "bitLengthPlusOne", 0);
        setIntField(term852, term852.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term852, term852.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term840, term840.getClass(), "denominator", term852);
        term9446 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9447 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9448 = (int[]) newIntArray(4);
        Object term9449 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9450 = (int[]) newIntArray(4);
        setIntField(term9447, term9447.getClass(), "signum", 1);
        setIntElement(term9448, 0, -595426672);
        setIntElement(term9448, 1, 1740761777);
        setIntElement(term9448, 2, -1048016766);
        setIntElement(term9448, 3, 665122013);
        setField(term9447, term9447.getClass(), "mag", term9448);
        setIntField(term9447, term9447.getClass(), "bitCountPlusOne", 0);
        setIntField(term9447, term9447.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9447, term9447.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9447, term9447.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9446, term9446.getClass(), "numerator", term9447);
        setIntField(term9449, term9449.getClass(), "signum", 1);
        setIntElement(term9450, 0, -900530926);
        setIntElement(term9450, 1, 156639734);
        setIntElement(term9450, 2, 334540975);
        setIntElement(term9450, 3, -1716710608);
        setField(term9449, term9449.getClass(), "mag", term9450);
        setIntField(term9449, term9449.getClass(), "bitCountPlusOne", 0);
        setIntField(term9449, term9449.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9449, term9449.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9449, term9449.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9446, term9446.getClass(), "denominator", term9449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumeratorAsInt", argTypes, term840, args);
        assertTrue(recursiveEquals(term840, term9446));
        assertTrue(recursiveEquals(retValue, 665122013));
    }

};
