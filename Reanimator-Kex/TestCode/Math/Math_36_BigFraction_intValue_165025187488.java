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

public class BigFraction_intValue_165025187488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933;
     Object term7699;

    public BigFraction_intValue_165025187488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term934 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term936 = (int[]) newIntArray(4);
        Object term945 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term947 = (int[]) newIntArray(4);
        setIntField(term934, term934.getClass(), "signum", 1);
        setIntElement(term936, 0, -1758331737);
        setIntElement(term936, 1, 567655499);
        setIntElement(term936, 2, 1829742523);
        setIntElement(term936, 3, -898778164);
        setField(term934, term934.getClass(), "mag", term936);
        setIntField(term934, term934.getClass(), "bitCountPlusOne", 0);
        setIntField(term934, term934.getClass(), "bitLengthPlusOne", 0);
        setIntField(term934, term934.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term934, term934.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term933, term933.getClass(), "numerator", term934);
        setIntField(term945, term945.getClass(), "signum", 1);
        setIntElement(term947, 0, -1419311421);
        setIntElement(term947, 1, 1372082494);
        setIntElement(term947, 2, -1892543811);
        setIntElement(term947, 3, 1524410079);
        setField(term945, term945.getClass(), "mag", term947);
        setIntField(term945, term945.getClass(), "bitCountPlusOne", 0);
        setIntField(term945, term945.getClass(), "bitLengthPlusOne", 0);
        setIntField(term945, term945.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term945, term945.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term933, term933.getClass(), "denominator", term945);
        term7699 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7700 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7701 = (int[]) newIntArray(4);
        Object term7702 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7703 = (int[]) newIntArray(4);
        setIntField(term7700, term7700.getClass(), "signum", 1);
        setIntElement(term7701, 0, -1758331737);
        setIntElement(term7701, 1, 567655499);
        setIntElement(term7701, 2, 1829742523);
        setIntElement(term7701, 3, -898778164);
        setField(term7700, term7700.getClass(), "mag", term7701);
        setIntField(term7700, term7700.getClass(), "bitCountPlusOne", 0);
        setIntField(term7700, term7700.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7700, term7700.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7700, term7700.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7699, term7699.getClass(), "numerator", term7700);
        setIntField(term7702, term7702.getClass(), "signum", 1);
        setIntElement(term7703, 0, -1419311421);
        setIntElement(term7703, 1, 1372082494);
        setIntElement(term7703, 2, -1892543811);
        setIntElement(term7703, 3, 1524410079);
        setField(term7702, term7702.getClass(), "mag", term7703);
        setIntField(term7702, term7702.getClass(), "bitCountPlusOne", 0);
        setIntField(term7702, term7702.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7702, term7702.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7702, term7702.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7699, term7699.getClass(), "denominator", term7702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "intValue", argTypes, term933, args);
        assertTrue(recursiveEquals(term933, term7699));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


