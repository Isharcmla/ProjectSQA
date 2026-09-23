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

public class BigFraction_floatValue_207508571380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;
     Object term7405;

    public BigFraction_floatValue_207508571380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term685 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7405 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7406 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7407 = (int[]) newIntArray(4);
        Object term7408 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7409 = (int[]) newIntArray(4);
        setIntField(term7406, term7406.getClass(), "signum", 1);
        setIntElement(term7407, 0, -789677596);
        setIntElement(term7407, 1, 2125233649);
        setIntElement(term7407, 2, -30111918);
        setIntElement(term7407, 3, 1728725444);
        setField(term7406, term7406.getClass(), "mag", term7407);
        setIntField(term7406, term7406.getClass(), "bitCountPlusOne", 0);
        setIntField(term7406, term7406.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7406, term7406.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7406, term7406.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7405, term7405.getClass(), "numerator", term7406);
        setIntField(term7408, term7408.getClass(), "signum", 1);
        setIntElement(term7409, 0, 386067591);
        setIntElement(term7409, 1, 1611550029);
        setIntElement(term7409, 2, -1165460443);
        setIntElement(term7409, 3, -1219032652);
        setField(term7408, term7408.getClass(), "mag", term7409);
        setIntField(term7408, term7408.getClass(), "bitCountPlusOne", 0);
        setIntField(term7408, term7408.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7408, term7408.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7408, term7408.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7405, term7405.getClass(), "denominator", term7408);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "floatValue", argTypes, term685, args);
        assertTrue(recursiveEquals(term685, term7405));
        assertTrue(recursiveEquals(retValue, 9.079472F));
    }

};


