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

public class BigFraction_divide_33175149377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560;
     Object term583;
     Object term7156;
     Object term7161;
     Object term7125;

    public BigFraction_divide_33175149377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term561 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term563 = (int[]) newIntArray(4);
        Object term572 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term574 = (int[]) newIntArray(4);
        setIntField(term561, term561.getClass(), "signum", 1);
        setIntElement(term563, 0, -360922875);
        setIntElement(term563, 1, -79459861);
        setIntElement(term563, 2, -2078380282);
        setIntElement(term563, 3, -1746405494);
        setField(term561, term561.getClass(), "mag", term563);
        setIntField(term561, term561.getClass(), "bitCountPlusOne", 0);
        setIntField(term561, term561.getClass(), "bitLengthPlusOne", 0);
        setIntField(term561, term561.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term561, term561.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term560, term560.getClass(), "numerator", term561);
        setIntField(term572, term572.getClass(), "signum", 1);
        setIntElement(term574, 0, 424099332);
        setIntElement(term574, 1, 278178375);
        setIntElement(term574, 2, 667870343);
        setIntElement(term574, 3, 2065826437);
        setField(term572, term572.getClass(), "mag", term574);
        setIntField(term572, term572.getClass(), "bitCountPlusOne", 0);
        setIntField(term572, term572.getClass(), "bitLengthPlusOne", 0);
        setIntField(term572, term572.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term572, term572.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term560, term560.getClass(), "denominator", term572);
        term583 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term584 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term586 = (int[]) newIntArray(4);
        Object term595 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term597 = (int[]) newIntArray(4);
        setIntField(term584, term584.getClass(), "signum", 1);
        setIntElement(term586, 0, 279652791);
        setIntElement(term586, 1, 39512956);
        setIntElement(term586, 2, -2007846750);
        setIntElement(term586, 3, 1626703124);
        setField(term584, term584.getClass(), "mag", term586);
        setIntField(term584, term584.getClass(), "bitCountPlusOne", 0);
        setIntField(term584, term584.getClass(), "bitLengthPlusOne", 0);
        setIntField(term584, term584.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term584, term584.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term583, term583.getClass(), "numerator", term584);
        setIntField(term595, term595.getClass(), "signum", 1);
        setIntElement(term597, 0, -680881152);
        setIntElement(term597, 1, -1463060226);
        setIntElement(term597, 2, 656194908);
        setIntElement(term597, 3, -11859444);
        setField(term595, term595.getClass(), "mag", term597);
        setIntField(term595, term595.getClass(), "bitCountPlusOne", 0);
        setIntField(term595, term595.getClass(), "bitLengthPlusOne", 0);
        setIntField(term595, term595.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term595, term595.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term583, term583.getClass(), "denominator", term595);
        term7156 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7157 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7158 = (int[]) newIntArray(4);
        Object term7159 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7160 = (int[]) newIntArray(4);
        setIntField(term7157, term7157.getClass(), "signum", 1);
        setIntElement(term7158, 0, -360922875);
        setIntElement(term7158, 1, -79459861);
        setIntElement(term7158, 2, -2078380282);
        setIntElement(term7158, 3, -1746405494);
        setField(term7157, term7157.getClass(), "mag", term7158);
        setIntField(term7157, term7157.getClass(), "bitCountPlusOne", 0);
        setIntField(term7157, term7157.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7157, term7157.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7157, term7157.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7156, term7156.getClass(), "numerator", term7157);
        setIntField(term7159, term7159.getClass(), "signum", 1);
        setIntElement(term7160, 0, 424099332);
        setIntElement(term7160, 1, 278178375);
        setIntElement(term7160, 2, 667870343);
        setIntElement(term7160, 3, 2065826437);
        setField(term7159, term7159.getClass(), "mag", term7160);
        setIntField(term7159, term7159.getClass(), "bitCountPlusOne", 0);
        setIntField(term7159, term7159.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7159, term7159.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7159, term7159.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7156, term7156.getClass(), "denominator", term7159);
        term7161 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7162 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7163 = (int[]) newIntArray(4);
        Object term7164 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7165 = (int[]) newIntArray(4);
        setIntField(term7162, term7162.getClass(), "signum", 1);
        setIntElement(term7163, 0, 279652791);
        setIntElement(term7163, 1, 39512956);
        setIntElement(term7163, 2, -2007846750);
        setIntElement(term7163, 3, 1626703124);
        setField(term7162, term7162.getClass(), "mag", term7163);
        setIntField(term7162, term7162.getClass(), "bitCountPlusOne", 0);
        setIntField(term7162, term7162.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7162, term7162.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7162, term7162.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7161, term7161.getClass(), "numerator", term7162);
        setIntField(term7164, term7164.getClass(), "signum", 1);
        setIntElement(term7165, 0, -680881152);
        setIntElement(term7165, 1, -1463060226);
        setIntElement(term7165, 2, 656194908);
        setIntElement(term7165, 3, -11859444);
        setField(term7164, term7164.getClass(), "mag", term7165);
        setIntField(term7164, term7164.getClass(), "bitCountPlusOne", 0);
        setIntField(term7164, term7164.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7164, term7164.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7164, term7164.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7161, term7161.getClass(), "denominator", term7164);
        term7125 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7126 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7128 = (int[]) newIntArray(8);
        Object term7141 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7143 = (int[]) newIntArray(8);
        setIntField(term7126, term7126.getClass(), "signum", 1);
        setIntElement(term7128, 0, 275865031);
        setIntElement(term7128, 1, 241453535);
        setIntElement(term7128, 2, -1714167051);
        setIntElement(term7128, 3, -2041609911);
        setIntElement(term7128, 4, 1330727121);
        setIntElement(term7128, 5, -1853124881);
        setIntElement(term7128, 6, -1638269646);
        setIntElement(term7128, 7, -2088801654);
        setField(term7126, term7126.getClass(), "mag", term7128);
        setIntField(term7126, term7126.getClass(), "bitCountPlusOne", 0);
        setIntField(term7126, term7126.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7126, term7126.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7126, term7126.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7125, term7125.getClass(), "numerator", term7126);
        setIntField(term7141, term7141.getClass(), "signum", 1);
        setIntElement(term7143, 0, 2301153);
        setIntElement(term7143, 1, -1016638757);
        setIntElement(term7143, 2, -2011843719);
        setIntElement(term7143, 3, -477117748);
        setIntElement(term7143, 4, -725447321);
        setIntElement(term7143, 5, 1277163007);
        setIntElement(term7143, 6, -1475581991);
        setIntElement(term7143, 7, -509955853);
        setField(term7141, term7141.getClass(), "mag", term7143);
        setIntField(term7141, term7141.getClass(), "bitCountPlusOne", 0);
        setIntField(term7141, term7141.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7141, term7141.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7141, term7141.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7125, term7125.getClass(), "denominator", term7141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term583;
        Object retValue = callMethod(klass, "divide", argTypes, term560, args);
        assertTrue(recursiveEquals(term560, term7156));
        assertTrue(recursiveEquals(term583, term7161));
        assertTrue(recursiveEquals(retValue, term7125));
    }

};


