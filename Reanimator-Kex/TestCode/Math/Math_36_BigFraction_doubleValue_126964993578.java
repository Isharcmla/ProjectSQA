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

public class BigFraction_doubleValue_126964993578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;
     Object term7238;

    public BigFraction_doubleValue_126964993578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term623 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term625 = (int[]) newIntArray(4);
        Object term634 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term636 = (int[]) newIntArray(4);
        setIntField(term623, term623.getClass(), "signum", 1);
        setIntElement(term625, 0, 1966569481);
        setIntElement(term625, 1, 728259814);
        setIntElement(term625, 2, -444215654);
        setIntElement(term625, 3, 577824005);
        setField(term623, term623.getClass(), "mag", term625);
        setIntField(term623, term623.getClass(), "bitCountPlusOne", 0);
        setIntField(term623, term623.getClass(), "bitLengthPlusOne", 0);
        setIntField(term623, term623.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term623, term623.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term622, term622.getClass(), "numerator", term623);
        setIntField(term634, term634.getClass(), "signum", 1);
        setIntElement(term636, 0, -2103755347);
        setIntElement(term636, 1, 215069094);
        setIntElement(term636, 2, -1244457347);
        setIntElement(term636, 3, 1161055583);
        setField(term634, term634.getClass(), "mag", term636);
        setIntField(term634, term634.getClass(), "bitCountPlusOne", 0);
        setIntField(term634, term634.getClass(), "bitLengthPlusOne", 0);
        setIntField(term634, term634.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term634, term634.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term622, term622.getClass(), "denominator", term634);
        term7238 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7239 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7240 = (int[]) newIntArray(4);
        Object term7241 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7242 = (int[]) newIntArray(4);
        setIntField(term7239, term7239.getClass(), "signum", 1);
        setIntElement(term7240, 0, 1966569481);
        setIntElement(term7240, 1, 728259814);
        setIntElement(term7240, 2, -444215654);
        setIntElement(term7240, 3, 577824005);
        setField(term7239, term7239.getClass(), "mag", term7240);
        setIntField(term7239, term7239.getClass(), "bitCountPlusOne", 0);
        setIntField(term7239, term7239.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7239, term7239.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7239, term7239.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7238, term7238.getClass(), "numerator", term7239);
        setIntField(term7241, term7241.getClass(), "signum", 1);
        setIntElement(term7242, 0, -2103755347);
        setIntElement(term7242, 1, 215069094);
        setIntElement(term7242, 2, -1244457347);
        setIntElement(term7242, 3, 1161055583);
        setField(term7241, term7241.getClass(), "mag", term7242);
        setIntField(term7241, term7241.getClass(), "bitCountPlusOne", 0);
        setIntField(term7241, term7241.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7241, term7241.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7241, term7241.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7238, term7238.getClass(), "denominator", term7241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "doubleValue", argTypes, term622, args);
        assertTrue(recursiveEquals(term622, term7238));
        assertTrue(recursiveEquals(retValue, 0.897480265212181));
    }

};


