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
import java.lang.Integer;

public class BigFraction_add_18694317067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term182;
     Object term6518;
     Object term6504;

    public BigFraction_add_18694317067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term160 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term162 = (int[]) newIntArray(4);
        Object term171 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term173 = (int[]) newIntArray(4);
        setIntField(term160, term160.getClass(), "signum", 1);
        setIntElement(term162, 0, 1135451131);
        setIntElement(term162, 1, 1118470130);
        setIntElement(term162, 2, -2027280057);
        setIntElement(term162, 3, -1981732417);
        setField(term160, term160.getClass(), "mag", term162);
        setIntField(term160, term160.getClass(), "bitCountPlusOne", 0);
        setIntField(term160, term160.getClass(), "bitLengthPlusOne", 0);
        setIntField(term160, term160.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term160, term160.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term159, term159.getClass(), "numerator", term160);
        setIntField(term171, term171.getClass(), "signum", 1);
        setIntElement(term173, 0, 1201981348);
        setIntElement(term173, 1, 1356528867);
        setIntElement(term173, 2, 718976955);
        setIntElement(term173, 3, 1214022696);
        setField(term171, term171.getClass(), "mag", term173);
        setIntField(term171, term171.getClass(), "bitCountPlusOne", 0);
        setIntField(term171, term171.getClass(), "bitLengthPlusOne", 0);
        setIntField(term171, term171.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term171, term171.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term159, term159.getClass(), "denominator", term171);
        term182 = new Integer(-1339778481);
        term6518 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6519 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6520 = (int[]) newIntArray(4);
        Object term6521 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6522 = (int[]) newIntArray(4);
        setIntField(term6519, term6519.getClass(), "signum", 1);
        setIntElement(term6520, 0, 1135451131);
        setIntElement(term6520, 1, 1118470130);
        setIntElement(term6520, 2, -2027280057);
        setIntElement(term6520, 3, -1981732417);
        setField(term6519, term6519.getClass(), "mag", term6520);
        setIntField(term6519, term6519.getClass(), "bitCountPlusOne", 0);
        setIntField(term6519, term6519.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6519, term6519.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6519, term6519.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6518, term6518.getClass(), "numerator", term6519);
        setIntField(term6521, term6521.getClass(), "signum", 1);
        setIntElement(term6522, 0, 1201981348);
        setIntElement(term6522, 1, 1356528867);
        setIntElement(term6522, 2, 718976955);
        setIntElement(term6522, 3, 1214022696);
        setField(term6521, term6521.getClass(), "mag", term6522);
        setIntField(term6521, term6521.getClass(), "bitCountPlusOne", 0);
        setIntField(term6521, term6521.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6521, term6521.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6521, term6521.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6518, term6518.getClass(), "denominator", term6521);
        term6504 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6505 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6507 = (int[]) newIntArray(5);
        Object term6493 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6495 = (int[]) newIntArray(4);
        setIntField(term6505, term6505.getClass(), "signum", -1);
        setIntElement(term6507, 0, 374947847);
        setIntElement(term6507, 1, -964100121);
        setIntElement(term6507, 2, 2064851156);
        setIntElement(term6507, 3, 1561802415);
        setIntElement(term6507, 4, 1685192169);
        setField(term6505, term6505.getClass(), "mag", term6507);
        setIntField(term6505, term6505.getClass(), "bitCountPlusOne", 0);
        setIntField(term6505, term6505.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6505, term6505.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6505, term6505.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6504, term6504.getClass(), "numerator", term6505);
        setIntField(term6493, term6493.getClass(), "signum", 1);
        setIntElement(term6495, 0, 1201981348);
        setIntElement(term6495, 1, 1356528867);
        setIntElement(term6495, 2, 718976955);
        setIntElement(term6495, 3, 1214022696);
        setField(term6493, term6493.getClass(), "mag", term6495);
        setIntField(term6493, term6493.getClass(), "bitCountPlusOne", 0);
        setIntField(term6493, term6493.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6493, term6493.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6493, term6493.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6504, term6504.getClass(), "denominator", term6493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term182;
        Object retValue = callMethod(klass, "add", argTypes, term159, args);
        assertTrue(recursiveEquals(term159, term6518));
        assertTrue(recursiveEquals(term182, -1339778481));
        assertTrue(recursiveEquals(retValue, term6504));
    }

};
