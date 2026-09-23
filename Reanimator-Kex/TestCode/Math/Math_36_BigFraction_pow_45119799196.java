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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class BigFraction_pow_45119799196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;
     Object term1254;

    public BigFraction_pow_45119799196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1231 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1232 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1234 = (int[]) newIntArray(4);
        Object term1243 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1245 = (int[]) newIntArray(4);
        setIntField(term1232, term1232.getClass(), "signum", 1);
        setIntElement(term1234, 0, -1603651052);
        setIntElement(term1234, 1, -1471789619);
        setIntElement(term1234, 2, -1209144785);
        setIntElement(term1234, 3, 1775932676);
        setField(term1232, term1232.getClass(), "mag", term1234);
        setIntField(term1232, term1232.getClass(), "bitCountPlusOne", 0);
        setIntField(term1232, term1232.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1232, term1232.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1232, term1232.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1231, term1231.getClass(), "numerator", term1232);
        setIntField(term1243, term1243.getClass(), "signum", 1);
        setIntElement(term1245, 0, -1431070328);
        setIntElement(term1245, 1, 1417004206);
        setIntElement(term1245, 2, -1169255534);
        setIntElement(term1245, 3, 1414548396);
        setField(term1243, term1243.getClass(), "mag", term1245);
        setIntField(term1243, term1243.getClass(), "bitCountPlusOne", 0);
        setIntField(term1243, term1243.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1243, term1243.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1243, term1243.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1231, term1231.getClass(), "denominator", term1243);
        term1254 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1254;
        try {
            callMethod(klass, "pow", argTypes, term1231, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


