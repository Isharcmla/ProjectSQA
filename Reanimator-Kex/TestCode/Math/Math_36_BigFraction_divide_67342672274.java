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

public class BigFraction_divide_67342672274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;
     Object term471;
     Object term6358;
     Object term6363;
     Object term6308;

    public BigFraction_divide_67342672274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term448 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term6358 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6359 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6360 = (int[]) newIntArray(4);
        Object term6361 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6362 = (int[]) newIntArray(4);
        setIntField(term6359, term6359.getClass(), "signum", 1);
        setIntElement(term6360, 0, 406125295);
        setIntElement(term6360, 1, 2079774647);
        setIntElement(term6360, 2, -1679855400);
        setIntElement(term6360, 3, -1698414316);
        setField(term6359, term6359.getClass(), "mag", term6360);
        setIntField(term6359, term6359.getClass(), "bitCountPlusOne", 0);
        setIntField(term6359, term6359.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6359, term6359.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6359, term6359.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6358, term6358.getClass(), "numerator", term6359);
        setIntField(term6361, term6361.getClass(), "signum", 1);
        setIntElement(term6362, 0, -1579463205);
        setIntElement(term6362, 1, -29752152);
        setIntElement(term6362, 2, 470785771);
        setIntElement(term6362, 3, 1415994203);
        setField(term6361, term6361.getClass(), "mag", term6362);
        setIntField(term6361, term6361.getClass(), "bitCountPlusOne", 0);
        setIntField(term6361, term6361.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6361, term6361.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6361, term6361.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6358, term6358.getClass(), "denominator", term6361);
        term6363 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6364 = (int[]) newIntArray(4);
        setIntField(term6363, term6363.getClass(), "signum", 1);
        setIntElement(term6364, 0, 1431346068);
        setIntElement(term6364, 1, -283113660);
        setIntElement(term6364, 2, -1383524811);
        setIntElement(term6364, 3, 815937577);
        setField(term6363, term6363.getClass(), "mag", term6364);
        setIntField(term6363, term6363.getClass(), "bitCountPlusOne", 0);
        setIntField(term6363, term6363.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6363, term6363.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6363, term6363.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term6308 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6309 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6311 = (int[]) newIntArray(4);
        Object term6320 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6322 = (int[]) newIntArray(8);
        setIntField(term6309, term6309.getClass(), "signum", 1);
        setIntElement(term6311, 0, 406125295);
        setIntElement(term6311, 1, 2079774647);
        setIntElement(term6311, 2, -1679855400);
        setIntElement(term6311, 3, -1698414316);
        setField(term6309, term6309.getClass(), "mag", term6311);
        setIntField(term6309, term6309.getClass(), "bitCountPlusOne", 0);
        setIntField(term6309, term6309.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6309, term6309.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6309, term6309.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6308, term6308.getClass(), "numerator", term6309);
        setIntField(term6320, term6320.getClass(), "signum", 1);
        setIntElement(term6322, 0, 904972224);
        setIntElement(term6322, 1, 1380313467);
        setIntElement(term6322, 2, -383257900);
        setIntElement(term6322, 3, -286221137);
        setIntElement(term6322, 4, 469893353);
        setIntElement(term6322, 5, -1293849497);
        setIntElement(term6322, 6, 1103119332);
        setIntElement(term6322, 7, -940144237);
        setField(term6320, term6320.getClass(), "mag", term6322);
        setIntField(term6320, term6320.getClass(), "bitCountPlusOne", 0);
        setIntField(term6320, term6320.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6320, term6320.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6320, term6320.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6308, term6308.getClass(), "denominator", term6320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term471;
        Object retValue = callMethod(klass, "divide", argTypes, term448, args);
        assertTrue(recursiveEquals(term448, term6358));
        assertTrue(recursiveEquals(term471, term6363));
        assertTrue(recursiveEquals(retValue, term6308));
    }

};


