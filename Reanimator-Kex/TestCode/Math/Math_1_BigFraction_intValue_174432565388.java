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

public class BigFraction_intValue_174432565388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933;
     Object term9581;

    public BigFraction_intValue_174432565388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term9581 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9582 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9583 = (int[]) newIntArray(4);
        Object term9584 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9585 = (int[]) newIntArray(4);
        setIntField(term9582, term9582.getClass(), "signum", 1);
        setIntElement(term9583, 0, -1758331737);
        setIntElement(term9583, 1, 567655499);
        setIntElement(term9583, 2, 1829742523);
        setIntElement(term9583, 3, -898778164);
        setField(term9582, term9582.getClass(), "mag", term9583);
        setIntField(term9582, term9582.getClass(), "bitCountPlusOne", 0);
        setIntField(term9582, term9582.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9582, term9582.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9582, term9582.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9581, term9581.getClass(), "numerator", term9582);
        setIntField(term9584, term9584.getClass(), "signum", 1);
        setIntElement(term9585, 0, -1419311421);
        setIntElement(term9585, 1, 1372082494);
        setIntElement(term9585, 2, -1892543811);
        setIntElement(term9585, 3, 1524410079);
        setField(term9584, term9584.getClass(), "mag", term9585);
        setIntField(term9584, term9584.getClass(), "bitCountPlusOne", 0);
        setIntField(term9584, term9584.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9584, term9584.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9584, term9584.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9581, term9581.getClass(), "denominator", term9584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "intValue", argTypes, term933, args);
        assertTrue(recursiveEquals(term933, term9581));
        assertTrue(recursiveEquals(retValue, 0));
    }

};
