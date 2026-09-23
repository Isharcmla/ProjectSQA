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
import java.lang.Long;

public class BigFraction_divide_19378647076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;
     Object term550;
     Object term6763;
     Object term6737;

    public BigFraction_divide_19378647076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term528 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term530 = (int[]) newIntArray(4);
        Object term539 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term541 = (int[]) newIntArray(4);
        setIntField(term528, term528.getClass(), "signum", 1);
        setIntElement(term530, 0, -141694687);
        setIntElement(term530, 1, 1643916803);
        setIntElement(term530, 2, -759585303);
        setIntElement(term530, 3, 237895233);
        setField(term528, term528.getClass(), "mag", term530);
        setIntField(term528, term528.getClass(), "bitCountPlusOne", 0);
        setIntField(term528, term528.getClass(), "bitLengthPlusOne", 0);
        setIntField(term528, term528.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term528, term528.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term527, term527.getClass(), "numerator", term528);
        setIntField(term539, term539.getClass(), "signum", 1);
        setIntElement(term541, 0, 575708700);
        setIntElement(term541, 1, 2121050859);
        setIntElement(term541, 2, 126015623);
        setIntElement(term541, 3, -1607592672);
        setField(term539, term539.getClass(), "mag", term541);
        setIntField(term539, term539.getClass(), "bitCountPlusOne", 0);
        setIntField(term539, term539.getClass(), "bitLengthPlusOne", 0);
        setIntField(term539, term539.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term539, term539.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term527, term527.getClass(), "denominator", term539);
        term550 = new Long(5270370404989704783L);
        term6763 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6764 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6765 = (int[]) newIntArray(4);
        Object term6766 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6767 = (int[]) newIntArray(4);
        setIntField(term6764, term6764.getClass(), "signum", 1);
        setIntElement(term6765, 0, -141694687);
        setIntElement(term6765, 1, 1643916803);
        setIntElement(term6765, 2, -759585303);
        setIntElement(term6765, 3, 237895233);
        setField(term6764, term6764.getClass(), "mag", term6765);
        setIntField(term6764, term6764.getClass(), "bitCountPlusOne", 0);
        setIntField(term6764, term6764.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6764, term6764.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6764, term6764.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6763, term6763.getClass(), "numerator", term6764);
        setIntField(term6766, term6766.getClass(), "signum", 1);
        setIntElement(term6767, 0, 575708700);
        setIntElement(term6767, 1, 2121050859);
        setIntElement(term6767, 2, 126015623);
        setIntElement(term6767, 3, -1607592672);
        setField(term6766, term6766.getClass(), "mag", term6767);
        setIntField(term6766, term6766.getClass(), "bitCountPlusOne", 0);
        setIntField(term6766, term6766.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6766, term6766.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6766, term6766.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6763, term6763.getClass(), "denominator", term6766);
        term6737 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6738 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6740 = (int[]) newIntArray(4);
        Object term6749 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6751 = (int[]) newIntArray(6);
        setIntField(term6738, term6738.getClass(), "signum", 1);
        setIntElement(term6740, 0, 1384424203);
        setIntElement(term6740, 1, 547972267);
        setIntElement(term6740, 2, -253195101);
        setIntElement(term6740, 3, 79298411);
        setField(term6738, term6738.getClass(), "mag", term6740);
        setIntField(term6738, term6738.getClass(), "bitCountPlusOne", 0);
        setIntField(term6738, term6738.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6738, term6738.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6738, term6738.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6737, term6737.getClass(), "numerator", term6738);
        setIntField(term6749, term6749.getClass(), "signum", 1);
        setIntElement(term6751, 0, 54828069);
        setIntElement(term6751, 1, 2039734641);
        setIntElement(term6751, 2, -1048751057);
        setIntElement(term6751, 3, -1235541525);
        setIntElement(term6751, 4, 1911629554);
        setIntElement(term6751, 5, 1607418272);
        setField(term6749, term6749.getClass(), "mag", term6751);
        setIntField(term6749, term6749.getClass(), "bitCountPlusOne", 0);
        setIntField(term6749, term6749.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6749, term6749.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6749, term6749.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6737, term6737.getClass(), "denominator", term6749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term550;
        Object retValue = callMethod(klass, "divide", argTypes, term527, args);
        assertTrue(recursiveEquals(term527, term6763));
        assertTrue(recursiveEquals(term550, 5270370404989704783L));
        assertTrue(recursiveEquals(retValue, term6737));
    }

};


