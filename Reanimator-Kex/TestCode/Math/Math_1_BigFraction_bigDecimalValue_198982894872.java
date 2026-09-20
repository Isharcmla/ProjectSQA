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

public class BigFraction_bigDecimalValue_198982894872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351;
     Object term374;
     Object term376;

    public BigFraction_bigDecimalValue_198982894872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term352 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term354 = (int[]) newIntArray(4);
        Object term363 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term365 = (int[]) newIntArray(4);
        setIntField(term352, term352.getClass(), "signum", 1);
        setIntElement(term354, 0, 1120468025);
        setIntElement(term354, 1, 2073146210);
        setIntElement(term354, 2, -77640477);
        setIntElement(term354, 3, 1423636041);
        setField(term352, term352.getClass(), "mag", term354);
        setIntField(term352, term352.getClass(), "bitCountPlusOne", 0);
        setIntField(term352, term352.getClass(), "bitLengthPlusOne", 0);
        setIntField(term352, term352.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term352, term352.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term351, term351.getClass(), "numerator", term352);
        setIntField(term363, term363.getClass(), "signum", 1);
        setIntElement(term365, 0, -1621774936);
        setIntElement(term365, 1, -394264255);
        setIntElement(term365, 2, 1489618083);
        setIntElement(term365, 3, 1621161301);
        setField(term363, term363.getClass(), "mag", term365);
        setIntField(term363, term363.getClass(), "bitCountPlusOne", 0);
        setIntField(term363, term363.getClass(), "bitLengthPlusOne", 0);
        setIntField(term363, term363.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term363, term363.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term351, term351.getClass(), "denominator", term363);
        term374 = new Integer(-522618178);
        term376 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term374;
        args[1] = term376;
        try {
            callMethod(klass, "bigDecimalValue", argTypes, term351, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
