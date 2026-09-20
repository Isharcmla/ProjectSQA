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
import java.lang.Object;

public class BigFraction_subtract_104280777348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1438;
     Object term1461;

    public BigFraction_subtract_104280777348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1438 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1439 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1441 = (int[]) newIntArray(4);
        Object term1450 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1452 = (int[]) newIntArray(4);
        setIntField(term1439, term1439.getClass(), "signum", 1);
        setIntElement(term1441, 0, 1740781121);
        setIntElement(term1441, 1, -1060089550);
        setIntElement(term1441, 2, -1794577666);
        setIntElement(term1441, 3, 2005592979);
        setField(term1439, term1439.getClass(), "mag", term1441);
        setIntField(term1439, term1439.getClass(), "bitCountPlusOne", 0);
        setIntField(term1439, term1439.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1439, term1439.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1439, term1439.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1438, term1438.getClass(), "numerator", term1439);
        setIntField(term1450, term1450.getClass(), "signum", 1);
        setIntElement(term1452, 0, -1827216086);
        setIntElement(term1452, 1, 1467716773);
        setIntElement(term1452, 2, 1634580968);
        setIntElement(term1452, 3, 859544732);
        setField(term1450, term1450.getClass(), "mag", term1452);
        setIntField(term1450, term1450.getClass(), "bitCountPlusOne", 0);
        setIntField(term1450, term1450.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1450, term1450.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1450, term1450.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1438, term1438.getClass(), "denominator", term1450);
        term1461 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1463 = (int[]) newIntArray(4);
        setIntField(term1461, term1461.getClass(), "signum", 1);
        setIntElement(term1463, 0, 412912962);
        setIntElement(term1463, 1, -230631481);
        setIntElement(term1463, 2, 1249841096);
        setIntElement(term1463, 3, 951783754);
        setField(term1461, term1461.getClass(), "mag", term1463);
        setIntField(term1461, term1461.getClass(), "bitCountPlusOne", 0);
        setIntField(term1461, term1461.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1461, term1461.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1461, term1461.getClass(), "firstNonzeroIntNumPlusTwo", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term1461;
        callMethod(klass, "subtract", argTypes, term1438, args);
    }

};
