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

public class BigFraction_doubleValue_36926016678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;
     Object term9119;

    public BigFraction_doubleValue_36926016678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term9119 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9120 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9121 = (int[]) newIntArray(4);
        Object term9122 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9123 = (int[]) newIntArray(4);
        setIntField(term9120, term9120.getClass(), "signum", 1);
        setIntElement(term9121, 0, 1966569481);
        setIntElement(term9121, 1, 728259814);
        setIntElement(term9121, 2, -444215654);
        setIntElement(term9121, 3, 577824005);
        setField(term9120, term9120.getClass(), "mag", term9121);
        setIntField(term9120, term9120.getClass(), "bitCountPlusOne", 0);
        setIntField(term9120, term9120.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9120, term9120.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9120, term9120.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9119, term9119.getClass(), "numerator", term9120);
        setIntField(term9122, term9122.getClass(), "signum", 1);
        setIntElement(term9123, 0, -2103755347);
        setIntElement(term9123, 1, 215069094);
        setIntElement(term9123, 2, -1244457347);
        setIntElement(term9123, 3, 1161055583);
        setField(term9122, term9122.getClass(), "mag", term9123);
        setIntField(term9122, term9122.getClass(), "bitCountPlusOne", 0);
        setIntField(term9122, term9122.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9122, term9122.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9122, term9122.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9119, term9119.getClass(), "denominator", term9122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "doubleValue", argTypes, term622, args);
        assertTrue(recursiveEquals(term622, term9119));
        assertTrue(recursiveEquals(retValue, 0.897480265212181));
    }

};
