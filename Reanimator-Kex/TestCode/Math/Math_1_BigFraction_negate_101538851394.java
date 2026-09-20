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

public class BigFraction_negate_101538851394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;
     Object term10618;
     Object term10572;

    public BigFraction_negate_101538851394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1169 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1170 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1172 = (int[]) newIntArray(4);
        Object term1181 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1183 = (int[]) newIntArray(4);
        setIntField(term1170, term1170.getClass(), "signum", 1);
        setIntElement(term1172, 0, 409506724);
        setIntElement(term1172, 1, -637557256);
        setIntElement(term1172, 2, 519933352);
        setIntElement(term1172, 3, -1992186344);
        setField(term1170, term1170.getClass(), "mag", term1172);
        setIntField(term1170, term1170.getClass(), "bitCountPlusOne", 0);
        setIntField(term1170, term1170.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1170, term1170.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1170, term1170.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1169, term1169.getClass(), "numerator", term1170);
        setIntField(term1181, term1181.getClass(), "signum", 1);
        setIntElement(term1183, 0, 1590449009);
        setIntElement(term1183, 1, -862614971);
        setIntElement(term1183, 2, -552718144);
        setIntElement(term1183, 3, 276806312);
        setField(term1181, term1181.getClass(), "mag", term1183);
        setIntField(term1181, term1181.getClass(), "bitCountPlusOne", 0);
        setIntField(term1181, term1181.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1181, term1181.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1181, term1181.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1169, term1169.getClass(), "denominator", term1181);
        term10618 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10619 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10620 = (int[]) newIntArray(4);
        Object term10621 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10622 = (int[]) newIntArray(4);
        setIntField(term10619, term10619.getClass(), "signum", 1);
        setIntElement(term10620, 0, 409506724);
        setIntElement(term10620, 1, -637557256);
        setIntElement(term10620, 2, 519933352);
        setIntElement(term10620, 3, -1992186344);
        setField(term10619, term10619.getClass(), "mag", term10620);
        setIntField(term10619, term10619.getClass(), "bitCountPlusOne", 0);
        setIntField(term10619, term10619.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10619, term10619.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10619, term10619.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10618, term10618.getClass(), "numerator", term10619);
        setIntField(term10621, term10621.getClass(), "signum", 1);
        setIntElement(term10622, 0, 1590449009);
        setIntElement(term10622, 1, -862614971);
        setIntElement(term10622, 2, -552718144);
        setIntElement(term10622, 3, 276806312);
        setField(term10621, term10621.getClass(), "mag", term10622);
        setIntField(term10621, term10621.getClass(), "bitCountPlusOne", 0);
        setIntField(term10621, term10621.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10621, term10621.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10621, term10621.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10618, term10618.getClass(), "denominator", term10621);
        term10572 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term10573 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10575 = (int[]) newIntArray(4);
        Object term10584 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term10586 = (int[]) newIntArray(4);
        setIntField(term10573, term10573.getClass(), "signum", -1);
        setIntElement(term10575, 0, 51188340);
        setIntElement(term10575, 1, -1690307393);
        setIntElement(term10575, 2, 64991669);
        setIntElement(term10575, 3, 287847619);
        setField(term10573, term10573.getClass(), "mag", term10575);
        setIntField(term10573, term10573.getClass(), "bitCountPlusOne", 0);
        setIntField(term10573, term10573.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10573, term10573.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10573, term10573.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10572, term10572.getClass(), "numerator", term10573);
        setIntField(term10584, term10584.getClass(), "signum", 1);
        setIntElement(term10586, 0, 198806126);
        setIntElement(term10586, 1, 965914952);
        setIntElement(term10586, 2, -1142831592);
        setIntElement(term10586, 3, 34600789);
        setField(term10584, term10584.getClass(), "mag", term10586);
        setIntField(term10584, term10584.getClass(), "bitCountPlusOne", 0);
        setIntField(term10584, term10584.getClass(), "bitLengthPlusOne", 0);
        setIntField(term10584, term10584.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term10584, term10584.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term10572, term10572.getClass(), "denominator", term10584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term1169, args);
        assertTrue(recursiveEquals(term1169, term10618));
        assertTrue(recursiveEquals(retValue, term10572));
    }

};
