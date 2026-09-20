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

public class BigFraction_floatValue_131949181480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term9215;

    public BigFraction_floatValue_131949181480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term686 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term688 = (int[]) newIntArray(4);
        Object term697 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term699 = (int[]) newIntArray(4);
        setIntField(term686, term686.getClass(), "signum", 1);
        setIntElement(term688, 0, -789677596);
        setIntElement(term688, 1, 2125233649);
        setIntElement(term688, 2, -30111918);
        setIntElement(term688, 3, 1728725444);
        setField(term686, term686.getClass(), "mag", term688);
        setIntField(term686, term686.getClass(), "bitCountPlusOne", 0);
        setIntField(term686, term686.getClass(), "bitLengthPlusOne", 0);
        setIntField(term686, term686.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term686, term686.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term685, term685.getClass(), "numerator", term686);
        setIntField(term697, term697.getClass(), "signum", 1);
        setIntElement(term699, 0, 386067591);
        setIntElement(term699, 1, 1611550029);
        setIntElement(term699, 2, -1165460443);
        setIntElement(term699, 3, -1219032652);
        setField(term697, term697.getClass(), "mag", term699);
        setIntField(term697, term697.getClass(), "bitCountPlusOne", 0);
        setIntField(term697, term697.getClass(), "bitLengthPlusOne", 0);
        setIntField(term697, term697.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term697, term697.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term685, term685.getClass(), "denominator", term697);
        term9215 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9216 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9217 = (int[]) newIntArray(4);
        Object term9218 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9219 = (int[]) newIntArray(4);
        setIntField(term9216, term9216.getClass(), "signum", 1);
        setIntElement(term9217, 0, -789677596);
        setIntElement(term9217, 1, 2125233649);
        setIntElement(term9217, 2, -30111918);
        setIntElement(term9217, 3, 1728725444);
        setField(term9216, term9216.getClass(), "mag", term9217);
        setIntField(term9216, term9216.getClass(), "bitCountPlusOne", 0);
        setIntField(term9216, term9216.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9216, term9216.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9216, term9216.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9215, term9215.getClass(), "numerator", term9216);
        setIntField(term9218, term9218.getClass(), "signum", 1);
        setIntElement(term9219, 0, 386067591);
        setIntElement(term9219, 1, 1611550029);
        setIntElement(term9219, 2, -1165460443);
        setIntElement(term9219, 3, -1219032652);
        setField(term9218, term9218.getClass(), "mag", term9219);
        setIntField(term9218, term9218.getClass(), "bitCountPlusOne", 0);
        setIntField(term9218, term9218.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9218, term9218.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9218, term9218.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9215, term9215.getClass(), "denominator", term9218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "floatValue", argTypes, term685, args);
        assertTrue(recursiveEquals(term685, term9215));
        assertTrue(recursiveEquals(retValue, 9.079472F));
    }

};
