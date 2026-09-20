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

public class BigFraction_multiply_135937216591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;
     Object term1064;
     Object term10002;
     Object term9977;

    public BigFraction_multiply_135937216591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1042 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1044 = (int[]) newIntArray(4);
        Object term1053 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1055 = (int[]) newIntArray(4);
        setIntField(term1042, term1042.getClass(), "signum", 1);
        setIntElement(term1044, 0, 1239021286);
        setIntElement(term1044, 1, 1589572879);
        setIntElement(term1044, 2, 1925233318);
        setIntElement(term1044, 3, 1848703490);
        setField(term1042, term1042.getClass(), "mag", term1044);
        setIntField(term1042, term1042.getClass(), "bitCountPlusOne", 0);
        setIntField(term1042, term1042.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1042, term1042.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1042, term1042.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1041, term1041.getClass(), "numerator", term1042);
        setIntField(term1053, term1053.getClass(), "signum", 1);
        setIntElement(term1055, 0, 1177792992);
        setIntElement(term1055, 1, -767703544);
        setIntElement(term1055, 2, -1292366590);
        setIntElement(term1055, 3, 1836168570);
        setField(term1053, term1053.getClass(), "mag", term1055);
        setIntField(term1053, term1053.getClass(), "bitCountPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1053, term1053.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1053, term1053.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1041, term1041.getClass(), "denominator", term1053);
        term1064 = new Integer(1585847225);
        term10002 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10003 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10004 = (int[]) newIntArray(4);
        Object term10005 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10006 = (int[]) newIntArray(4);
        setIntField(term10003, term10003.getClass(), "signum", 1);
        setIntElement(term10004, 0, 1239021286);
        setIntElement(term10004, 1, 1589572879);
        setIntElement(term10004, 2, 1925233318);
        setIntElement(term10004, 3, 1848703490);
        setField(term10003, term10003.getClass(), "mag", term10004);
        setIntField(term10003, term10003.getClass(), "bitCountPlusOne", 0);
        setIntField(term10003, term10003.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10003, term10003.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10003, term10003.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10002, term10002.getClass(), "numerator", term10003);
        setIntField(term10005, term10005.getClass(), "signum", 1);
        setIntElement(term10006, 0, 1177792992);
        setIntElement(term10006, 1, -767703544);
        setIntElement(term10006, 2, -1292366590);
        setIntElement(term10006, 3, 1836168570);
        setField(term10005, term10005.getClass(), "mag", term10006);
        setIntField(term10005, term10005.getClass(), "bitCountPlusOne", 0);
        setIntField(term10005, term10005.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10005, term10005.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10005, term10005.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10002, term10002.getClass(), "denominator", term10005);
        term9977 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9978 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9980 = (int[]) newIntArray(5);
        Object term9990 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9992 = (int[]) newIntArray(4);
        setIntField(term9978, term9978.getClass(), "signum", 1);
        setIntElement(term9980, 0, 45748857);
        setIntElement(term9980, 1, -2068752425);
        setIntElement(term9980, 2, 1097338436);
        setIntElement(term9980, 3, -1260741598);
        setIntElement(term9980, 4, 169127973);
        setField(term9978, term9978.getClass(), "mag", term9980);
        setIntField(term9978, term9978.getClass(), "bitCountPlusOne", 0);
        setIntField(term9978, term9978.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9978, term9978.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9978, term9978.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9977, term9977.getClass(), "numerator", term9978);
        setIntField(term9990, term9990.getClass(), "signum", 1);
        setIntElement(term9992, 0, 117779299);
        setIntElement(term9992, 1, 1211719834);
        setIntElement(term9992, 2, 2018246989);
        setIntElement(term9992, 3, 183616857);
        setField(term9990, term9990.getClass(), "mag", term9992);
        setIntField(term9990, term9990.getClass(), "bitCountPlusOne", 0);
        setIntField(term9990, term9990.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9990, term9990.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9990, term9990.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9977, term9977.getClass(), "denominator", term9990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1064;
        Object retValue = callMethod(klass, "multiply", argTypes, term1041, args);
        assertTrue(recursiveEquals(term1041, term10002));
        assertTrue(recursiveEquals(term1064, 1585847225));
        assertTrue(recursiveEquals(retValue, term9977));
    }

};
