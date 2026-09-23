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
import java.lang.Integer;

public class BigFraction_add_46539676667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;
     Object term182;
     Object term4641;
     Object term4627;

    public BigFraction_add_46539676667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term4641 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4642 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4643 = (int[]) newIntArray(4);
        Object term4644 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4645 = (int[]) newIntArray(4);
        setIntField(term4642, term4642.getClass(), "signum", 1);
        setIntElement(term4643, 0, 1135451131);
        setIntElement(term4643, 1, 1118470130);
        setIntElement(term4643, 2, -2027280057);
        setIntElement(term4643, 3, -1981732417);
        setField(term4642, term4642.getClass(), "mag", term4643);
        setIntField(term4642, term4642.getClass(), "bitCountPlusOne", 0);
        setIntField(term4642, term4642.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4642, term4642.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4642, term4642.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4641, term4641.getClass(), "numerator", term4642);
        setIntField(term4644, term4644.getClass(), "signum", 1);
        setIntElement(term4645, 0, 1201981348);
        setIntElement(term4645, 1, 1356528867);
        setIntElement(term4645, 2, 718976955);
        setIntElement(term4645, 3, 1214022696);
        setField(term4644, term4644.getClass(), "mag", term4645);
        setIntField(term4644, term4644.getClass(), "bitCountPlusOne", 0);
        setIntField(term4644, term4644.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4644, term4644.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4644, term4644.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4641, term4641.getClass(), "denominator", term4644);
        term4627 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4628 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4630 = (int[]) newIntArray(5);
        Object term4616 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4618 = (int[]) newIntArray(4);
        setIntField(term4628, term4628.getClass(), "signum", -1);
        setIntElement(term4630, 0, 374947847);
        setIntElement(term4630, 1, -964100121);
        setIntElement(term4630, 2, 2064851156);
        setIntElement(term4630, 3, 1561802415);
        setIntElement(term4630, 4, 1685192169);
        setField(term4628, term4628.getClass(), "mag", term4630);
        setIntField(term4628, term4628.getClass(), "bitCountPlusOne", 0);
        setIntField(term4628, term4628.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4628, term4628.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4628, term4628.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4627, term4627.getClass(), "numerator", term4628);
        setIntField(term4616, term4616.getClass(), "signum", 1);
        setIntElement(term4618, 0, 1201981348);
        setIntElement(term4618, 1, 1356528867);
        setIntElement(term4618, 2, 718976955);
        setIntElement(term4618, 3, 1214022696);
        setField(term4616, term4616.getClass(), "mag", term4618);
        setIntField(term4616, term4616.getClass(), "bitCountPlusOne", 0);
        setIntField(term4616, term4616.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4616, term4616.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4616, term4616.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4627, term4627.getClass(), "denominator", term4616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term182;
        Object retValue = callMethod(klass, "add", argTypes, term159, args);
        assertTrue(recursiveEquals(term159, term4641));
        assertTrue(recursiveEquals(term182, -1339778481));
        assertTrue(recursiveEquals(retValue, term4627));
    }

};


