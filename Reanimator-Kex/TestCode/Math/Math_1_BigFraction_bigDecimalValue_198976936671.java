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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BigFraction_bigDecimalValue_198976936671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;
     Object term341;

    public BigFraction_bigDecimalValue_198976936671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term319 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term321 = (int[]) newIntArray(4);
        Object term330 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term332 = (int[]) newIntArray(4);
        setIntField(term319, term319.getClass(), "signum", 1);
        setIntElement(term321, 0, 763680091);
        setIntElement(term321, 1, -647074485);
        setIntElement(term321, 2, -328599277);
        setIntElement(term321, 3, 182874972);
        setField(term319, term319.getClass(), "mag", term321);
        setIntField(term319, term319.getClass(), "bitCountPlusOne", 0);
        setIntField(term319, term319.getClass(), "bitLengthPlusOne", 0);
        setIntField(term319, term319.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term319, term319.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term318, term318.getClass(), "numerator", term319);
        setIntField(term330, term330.getClass(), "signum", 1);
        setIntElement(term332, 0, 1296639623);
        setIntElement(term332, 1, 243556927);
        setIntElement(term332, 2, -1679623855);
        setIntElement(term332, 3, 592478179);
        setField(term330, term330.getClass(), "mag", term332);
        setIntField(term330, term330.getClass(), "bitCountPlusOne", 0);
        setIntField(term330, term330.getClass(), "bitLengthPlusOne", 0);
        setIntField(term330, term330.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term330, term330.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term318, term318.getClass(), "denominator", term330);
        term341 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term341;
        try {
            callMethod(klass, "bigDecimalValue", argTypes, term318, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
