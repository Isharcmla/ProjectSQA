package org.apache.commons.math.linear;

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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BigMatrixImpl_solve_1890319327110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22454;

    public BigMatrixImpl_solve_1890319327110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22454 = newInstance(Class.forName("org.apache.commons.math.linear.BigMatrixImpl"));
        Object[] term22455 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 0);
        Object[] term22456 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.math.BigDecimal"), 0).getClass(), 2);
        Object[] term22457 = (Object[]) newArray("java.math.BigDecimal", 0);
        Object[] term22458 = (Object[]) newArray("java.math.BigDecimal", 4);
        Object term22459 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22460 = newInstance(Class.forName("java.math.BigInteger"));
        Object term22469 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22470 = newInstance(Class.forName("java.math.BigInteger"));
        Object term22479 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22480 = newInstance(Class.forName("java.math.BigInteger"));
        Object term22489 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term22490 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term22499 = (int[]) newIntArray(4);
        setField(term22454, term22454.getClass(), "data", term22455);
        setElement(term22456, 0, term22457);
        setIntField(term22460, term22460.getClass(), "signum", 1);
        setField(term22460, term22460.getClass(), "mag", null);
        setIntField(term22460, term22460.getClass(), "bitCountPlusOne", 0);
        setIntField(term22460, term22460.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22460, term22460.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22460, term22460.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22459, term22459.getClass(), "intVal", term22460);
        setIntField(term22459, term22459.getClass(), "scale", 52);
        setIntField(term22459, term22459.getClass(), "precision", 0);
        setField(term22459, term22459.getClass(), "stringCache", null);
        setLongField(term22459, term22459.getClass(), "intCompact", -9223372036854775808L);
        setElement(term22458, 0, term22459);
        setIntField(term22470, term22470.getClass(), "signum", 1);
        setField(term22470, term22470.getClass(), "mag", null);
        setIntField(term22470, term22470.getClass(), "bitCountPlusOne", 0);
        setIntField(term22470, term22470.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22470, term22470.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22470, term22470.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22469, term22469.getClass(), "intVal", term22470);
        setIntField(term22469, term22469.getClass(), "scale", 53);
        setIntField(term22469, term22469.getClass(), "precision", 0);
        setField(term22469, term22469.getClass(), "stringCache", null);
        setLongField(term22469, term22469.getClass(), "intCompact", -9223372036854775808L);
        setElement(term22458, 1, term22469);
        setIntField(term22480, term22480.getClass(), "signum", 1);
        setField(term22480, term22480.getClass(), "mag", null);
        setIntField(term22480, term22480.getClass(), "bitCountPlusOne", 0);
        setIntField(term22480, term22480.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22480, term22480.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22480, term22480.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22479, term22479.getClass(), "intVal", term22480);
        setIntField(term22479, term22479.getClass(), "scale", 52);
        setIntField(term22479, term22479.getClass(), "precision", 0);
        setField(term22479, term22479.getClass(), "stringCache", null);
        setLongField(term22479, term22479.getClass(), "intCompact", -9223372036854775808L);
        setElement(term22458, 2, term22479);
        setIntField(term22490, term22490.getClass(), "signum", 1);
        setField(term22490, term22490.getClass(), "mag", null);
        setIntField(term22490, term22490.getClass(), "bitCountPlusOne", 0);
        setIntField(term22490, term22490.getClass(), "bitLengthPlusOne", 0);
        setIntField(term22490, term22490.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term22490, term22490.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term22489, term22489.getClass(), "intVal", term22490);
        setIntField(term22489, term22489.getClass(), "scale", 53);
        setIntField(term22489, term22489.getClass(), "precision", 0);
        setField(term22489, term22489.getClass(), "stringCache", null);
        setLongField(term22489, term22489.getClass(), "intCompact", -9223372036854775808L);
        setElement(term22458, 3, term22489);
        setElement(term22456, 1, term22458);
        setField(term22454, term22454.getClass(), "lu", term22456);
        setIntElement(term22499, 0, 1959097203);
        setIntElement(term22499, 1, -209654048);
        setIntElement(term22499, 2, 477625804);
        setIntElement(term22499, 3, 252575029);
        setField(term22454, term22454.getClass(), "permutation", term22499);
        setIntField(term22454, term22454.getClass(), "parity", 1);
        setIntField(term22454, term22454.getClass(), "roundingMode", 4);
        setIntField(term22454, term22454.getClass(), "scale", 64);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.BigMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "solve", argTypes, term22454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


