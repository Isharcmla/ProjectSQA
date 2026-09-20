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

public class BigFraction_divide_132576665874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term471;
     Object term8236;
     Object term8241;
     Object term8186;

    public BigFraction_divide_132576665874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term449 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term451 = (int[]) newIntArray(4);
        Object term460 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term462 = (int[]) newIntArray(4);
        setIntField(term449, term449.getClass(), "signum", 1);
        setIntElement(term451, 0, 406125295);
        setIntElement(term451, 1, 2079774647);
        setIntElement(term451, 2, -1679855400);
        setIntElement(term451, 3, -1698414316);
        setField(term449, term449.getClass(), "mag", term451);
        setIntField(term449, term449.getClass(), "bitCountPlusOne", 0);
        setIntField(term449, term449.getClass(), "bitLengthPlusOne", 0);
        setIntField(term449, term449.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term449, term449.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term448, term448.getClass(), "numerator", term449);
        setIntField(term460, term460.getClass(), "signum", 1);
        setIntElement(term462, 0, -1579463205);
        setIntElement(term462, 1, -29752152);
        setIntElement(term462, 2, 470785771);
        setIntElement(term462, 3, 1415994203);
        setField(term460, term460.getClass(), "mag", term462);
        setIntField(term460, term460.getClass(), "bitCountPlusOne", 0);
        setIntField(term460, term460.getClass(), "bitLengthPlusOne", 0);
        setIntField(term460, term460.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term460, term460.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term448, term448.getClass(), "denominator", term460);
        term471 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term473 = (int[]) newIntArray(4);
        setIntField(term471, term471.getClass(), "signum", 1);
        setIntElement(term473, 0, 1431346068);
        setIntElement(term473, 1, -283113660);
        setIntElement(term473, 2, -1383524811);
        setIntElement(term473, 3, 815937577);
        setField(term471, term471.getClass(), "mag", term473);
        setIntField(term471, term471.getClass(), "bitCountPlusOne", 0);
        setIntField(term471, term471.getClass(), "bitLengthPlusOne", 0);
        setIntField(term471, term471.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term471, term471.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term8236 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8237 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8238 = (int[]) newIntArray(4);
        Object term8239 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8240 = (int[]) newIntArray(4);
        setIntField(term8237, term8237.getClass(), "signum", 1);
        setIntElement(term8238, 0, 406125295);
        setIntElement(term8238, 1, 2079774647);
        setIntElement(term8238, 2, -1679855400);
        setIntElement(term8238, 3, -1698414316);
        setField(term8237, term8237.getClass(), "mag", term8238);
        setIntField(term8237, term8237.getClass(), "bitCountPlusOne", 0);
        setIntField(term8237, term8237.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8237, term8237.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8237, term8237.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8236, term8236.getClass(), "numerator", term8237);
        setIntField(term8239, term8239.getClass(), "signum", 1);
        setIntElement(term8240, 0, -1579463205);
        setIntElement(term8240, 1, -29752152);
        setIntElement(term8240, 2, 470785771);
        setIntElement(term8240, 3, 1415994203);
        setField(term8239, term8239.getClass(), "mag", term8240);
        setIntField(term8239, term8239.getClass(), "bitCountPlusOne", 0);
        setIntField(term8239, term8239.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8239, term8239.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8239, term8239.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8236, term8236.getClass(), "denominator", term8239);
        term8241 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8242 = (int[]) newIntArray(4);
        setIntField(term8241, term8241.getClass(), "signum", 1);
        setIntElement(term8242, 0, 1431346068);
        setIntElement(term8242, 1, -283113660);
        setIntElement(term8242, 2, -1383524811);
        setIntElement(term8242, 3, 815937577);
        setField(term8241, term8241.getClass(), "mag", term8242);
        setIntField(term8241, term8241.getClass(), "bitCountPlusOne", 0);
        setIntField(term8241, term8241.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8241, term8241.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8241, term8241.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term8186 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8187 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8189 = (int[]) newIntArray(4);
        Object term8198 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8200 = (int[]) newIntArray(8);
        setIntField(term8187, term8187.getClass(), "signum", 1);
        setIntElement(term8189, 0, 406125295);
        setIntElement(term8189, 1, 2079774647);
        setIntElement(term8189, 2, -1679855400);
        setIntElement(term8189, 3, -1698414316);
        setField(term8187, term8187.getClass(), "mag", term8189);
        setIntField(term8187, term8187.getClass(), "bitCountPlusOne", 0);
        setIntField(term8187, term8187.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8187, term8187.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8187, term8187.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8186, term8186.getClass(), "numerator", term8187);
        setIntField(term8198, term8198.getClass(), "signum", 1);
        setIntElement(term8200, 0, 904972224);
        setIntElement(term8200, 1, 1380313467);
        setIntElement(term8200, 2, -383257900);
        setIntElement(term8200, 3, -286221137);
        setIntElement(term8200, 4, 469893353);
        setIntElement(term8200, 5, -1293849497);
        setIntElement(term8200, 6, 1103119332);
        setIntElement(term8200, 7, -940144237);
        setField(term8198, term8198.getClass(), "mag", term8200);
        setIntField(term8198, term8198.getClass(), "bitCountPlusOne", 0);
        setIntField(term8198, term8198.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8198, term8198.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8198, term8198.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8186, term8186.getClass(), "denominator", term8198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term471;
        Object retValue = callMethod(klass, "divide", argTypes, term448, args);
        assertTrue(recursiveEquals(term448, term8236));
        assertTrue(recursiveEquals(term471, term8241));
        assertTrue(recursiveEquals(retValue, term8186));
    }

};
