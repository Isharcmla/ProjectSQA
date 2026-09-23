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
import java.lang.Integer;
import java.lang.Object;

public class BigFraction_getReducedFraction_132782474564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term80;
     Object term4236;

    public BigFraction_getReducedFraction_132782474564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = new Integer(-2038273078);
        term80 = new Integer(1227103734);
        term4236 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4237 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4239 = (int[]) newIntArray(1);
        Object term4245 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4247 = (int[]) newIntArray(1);
        setIntField(term4237, term4237.getClass(), "signum", -1);
        setIntElement(term4239, 0, 1019136539);
        setField(term4237, term4237.getClass(), "mag", term4239);
        setIntField(term4237, term4237.getClass(), "bitCountPlusOne", 0);
        setIntField(term4237, term4237.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4237, term4237.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4237, term4237.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4236, term4236.getClass(), "numerator", term4237);
        setIntField(term4245, term4245.getClass(), "signum", 1);
        setIntElement(term4247, 0, 613551867);
        setField(term4245, term4245.getClass(), "mag", term4247);
        setIntField(term4245, term4245.getClass(), "bitCountPlusOne", 0);
        setIntField(term4245, term4245.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4245, term4245.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4245, term4245.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4236, term4236.getClass(), "denominator", term4245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term78;
        args[1] = term80;
        Object retValue = callMethod(klass, "getReducedFraction", argTypes, null, args);
        assertTrue(recursiveEquals(term78, -2038273078));
        assertTrue(recursiveEquals(term80, 1227103734));
        assertTrue(recursiveEquals(retValue, term4236));
    }

};


