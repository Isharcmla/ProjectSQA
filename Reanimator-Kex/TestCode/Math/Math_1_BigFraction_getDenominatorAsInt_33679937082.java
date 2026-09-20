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

public class BigFraction_getDenominatorAsInt_33679937082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term9308;

    public BigFraction_getDenominatorAsInt_33679937082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term748 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term750 = (int[]) newIntArray(4);
        Object term759 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term761 = (int[]) newIntArray(4);
        setIntField(term748, term748.getClass(), "signum", 1);
        setIntElement(term750, 0, -410725284);
        setIntElement(term750, 1, -584036954);
        setIntElement(term750, 2, 51969616);
        setIntElement(term750, 3, -152693189);
        setField(term748, term748.getClass(), "mag", term750);
        setIntField(term748, term748.getClass(), "bitCountPlusOne", 0);
        setIntField(term748, term748.getClass(), "bitLengthPlusOne", 0);
        setIntField(term748, term748.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term748, term748.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term747, term747.getClass(), "numerator", term748);
        setIntField(term759, term759.getClass(), "signum", 1);
        setIntElement(term761, 0, -1771124511);
        setIntElement(term761, 1, -2065579551);
        setIntElement(term761, 2, -1186493046);
        setIntElement(term761, 3, 1905653646);
        setField(term759, term759.getClass(), "mag", term761);
        setIntField(term759, term759.getClass(), "bitCountPlusOne", 0);
        setIntField(term759, term759.getClass(), "bitLengthPlusOne", 0);
        setIntField(term759, term759.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term759, term759.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term747, term747.getClass(), "denominator", term759);
        term9308 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9309 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9310 = (int[]) newIntArray(4);
        Object term9311 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9312 = (int[]) newIntArray(4);
        setIntField(term9309, term9309.getClass(), "signum", 1);
        setIntElement(term9310, 0, -410725284);
        setIntElement(term9310, 1, -584036954);
        setIntElement(term9310, 2, 51969616);
        setIntElement(term9310, 3, -152693189);
        setField(term9309, term9309.getClass(), "mag", term9310);
        setIntField(term9309, term9309.getClass(), "bitCountPlusOne", 0);
        setIntField(term9309, term9309.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9309, term9309.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9309, term9309.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9308, term9308.getClass(), "numerator", term9309);
        setIntField(term9311, term9311.getClass(), "signum", 1);
        setIntElement(term9312, 0, -1771124511);
        setIntElement(term9312, 1, -2065579551);
        setIntElement(term9312, 2, -1186493046);
        setIntElement(term9312, 3, 1905653646);
        setField(term9311, term9311.getClass(), "mag", term9312);
        setIntField(term9311, term9311.getClass(), "bitCountPlusOne", 0);
        setIntField(term9311, term9311.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9311, term9311.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9311, term9311.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9308, term9308.getClass(), "denominator", term9311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorAsInt", argTypes, term747, args);
        assertTrue(recursiveEquals(term747, term9308));
        assertTrue(recursiveEquals(retValue, 1905653646));
    }

};
