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

public class BigFraction_getDenominatorAsInt_123718913982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term7426;

    public BigFraction_getDenominatorAsInt_123718913982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7426 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7427 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7428 = (int[]) newIntArray(4);
        Object term7429 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7430 = (int[]) newIntArray(4);
        setIntField(term7427, term7427.getClass(), "signum", 1);
        setIntElement(term7428, 0, -410725284);
        setIntElement(term7428, 1, -584036954);
        setIntElement(term7428, 2, 51969616);
        setIntElement(term7428, 3, -152693189);
        setField(term7427, term7427.getClass(), "mag", term7428);
        setIntField(term7427, term7427.getClass(), "bitCountPlusOne", 0);
        setIntField(term7427, term7427.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7427, term7427.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7427, term7427.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7426, term7426.getClass(), "numerator", term7427);
        setIntField(term7429, term7429.getClass(), "signum", 1);
        setIntElement(term7430, 0, -1771124511);
        setIntElement(term7430, 1, -2065579551);
        setIntElement(term7430, 2, -1186493046);
        setIntElement(term7430, 3, 1905653646);
        setField(term7429, term7429.getClass(), "mag", term7430);
        setIntField(term7429, term7429.getClass(), "bitCountPlusOne", 0);
        setIntField(term7429, term7429.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7429, term7429.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7429, term7429.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7426, term7426.getClass(), "denominator", term7429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDenominatorAsInt", argTypes, term747, args);
        assertTrue(recursiveEquals(term747, term7426));
        assertTrue(recursiveEquals(retValue, 1905653646));
    }

};


