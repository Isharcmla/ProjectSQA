package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.fraction.EqualityUtils.*;
import java.lang.Object;

public class BigFraction_getNumeratorAsInt_78198013885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840;
     Object term7564;

    public BigFraction_getNumeratorAsInt_78198013885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7564 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7565 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7566 = (int[]) newIntArray(4);
        Object term7567 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7568 = (int[]) newIntArray(4);
        setIntField(term7565, term7565.getClass(), "signum", 1);
        setIntElement(term7566, 0, -595426672);
        setIntElement(term7566, 1, 1740761777);
        setIntElement(term7566, 2, -1048016766);
        setIntElement(term7566, 3, 665122013);
        setField(term7565, term7565.getClass(), "mag", term7566);
        setIntField(term7565, term7565.getClass(), "bitCountPlusOne", 0);
        setIntField(term7565, term7565.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7565, term7565.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7565, term7565.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7564, term7564.getClass(), "numerator", term7565);
        setIntField(term7567, term7567.getClass(), "signum", 1);
        setIntElement(term7568, 0, -900530926);
        setIntElement(term7568, 1, 156639734);
        setIntElement(term7568, 2, 334540975);
        setIntElement(term7568, 3, -1716710608);
        setField(term7567, term7567.getClass(), "mag", term7568);
        setIntField(term7567, term7567.getClass(), "bitCountPlusOne", 0);
        setIntField(term7567, term7567.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7567, term7567.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7567, term7567.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7564, term7564.getClass(), "denominator", term7567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumeratorAsInt", argTypes, term840, args);
        assertTrue(recursiveEquals(term840, term7564));
        assertTrue(recursiveEquals(retValue, 665122013));
    }

};


