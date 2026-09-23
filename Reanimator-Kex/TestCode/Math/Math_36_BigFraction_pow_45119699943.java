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
import java.lang.Object;
import java.lang.Long;

public class BigFraction_pow_45119699943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264;
     Object term1287;

    public BigFraction_pow_45119699943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1264 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1267 = (int[]) newIntArray(4);
        Object term1276 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1278 = (int[]) newIntArray(4);
        setIntField(term1265, term1265.getClass(), "signum", 1);
        setIntElement(term1267, 0, 1928656263);
        setIntElement(term1267, 1, 1022329378);
        setIntElement(term1267, 2, -332006246);
        setIntElement(term1267, 3, 1679255383);
        setField(term1265, term1265.getClass(), "mag", term1267);
        setIntField(term1265, term1265.getClass(), "bitCountPlusOne", 0);
        setIntField(term1265, term1265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1265, term1265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1265, term1265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1264, term1264.getClass(), "numerator", term1265);
        setIntField(term1276, term1276.getClass(), "signum", 1);
        setIntElement(term1278, 0, -682515990);
        setIntElement(term1278, 1, -1173758355);
        setIntElement(term1278, 2, -67705288);
        setIntElement(term1278, 3, 1998811311);
        setField(term1276, term1276.getClass(), "mag", term1278);
        setIntField(term1276, term1276.getClass(), "bitCountPlusOne", 0);
        setIntField(term1276, term1276.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1276, term1276.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1276, term1276.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1264, term1264.getClass(), "denominator", term1276);
        term1287 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1287;
        callMethod(klass, "pow", argTypes, term1264, args);
    }

};


