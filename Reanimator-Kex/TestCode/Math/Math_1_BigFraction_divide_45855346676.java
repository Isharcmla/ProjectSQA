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
import java.lang.Long;

public class BigFraction_divide_45855346676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;
     Object term550;
     Object term8643;
     Object term8617;

    public BigFraction_divide_45855346676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term8643 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8644 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8645 = (int[]) newIntArray(4);
        Object term8646 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8647 = (int[]) newIntArray(4);
        setIntField(term8644, term8644.getClass(), "signum", 1);
        setIntElement(term8645, 0, -141694687);
        setIntElement(term8645, 1, 1643916803);
        setIntElement(term8645, 2, -759585303);
        setIntElement(term8645, 3, 237895233);
        setField(term8644, term8644.getClass(), "mag", term8645);
        setIntField(term8644, term8644.getClass(), "bitCountPlusOne", 0);
        setIntField(term8644, term8644.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8644, term8644.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8644, term8644.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8643, term8643.getClass(), "numerator", term8644);
        setIntField(term8646, term8646.getClass(), "signum", 1);
        setIntElement(term8647, 0, 575708700);
        setIntElement(term8647, 1, 2121050859);
        setIntElement(term8647, 2, 126015623);
        setIntElement(term8647, 3, -1607592672);
        setField(term8646, term8646.getClass(), "mag", term8647);
        setIntField(term8646, term8646.getClass(), "bitCountPlusOne", 0);
        setIntField(term8646, term8646.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8646, term8646.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8646, term8646.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8643, term8643.getClass(), "denominator", term8646);
        term8617 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8618 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8620 = (int[]) newIntArray(4);
        Object term8629 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8631 = (int[]) newIntArray(6);
        setIntField(term8618, term8618.getClass(), "signum", 1);
        setIntElement(term8620, 0, 1384424203);
        setIntElement(term8620, 1, 547972267);
        setIntElement(term8620, 2, -253195101);
        setIntElement(term8620, 3, 79298411);
        setField(term8618, term8618.getClass(), "mag", term8620);
        setIntField(term8618, term8618.getClass(), "bitCountPlusOne", 0);
        setIntField(term8618, term8618.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8618, term8618.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8618, term8618.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8617, term8617.getClass(), "numerator", term8618);
        setIntField(term8629, term8629.getClass(), "signum", 1);
        setIntElement(term8631, 0, 54828069);
        setIntElement(term8631, 1, 2039734641);
        setIntElement(term8631, 2, -1048751057);
        setIntElement(term8631, 3, -1235541525);
        setIntElement(term8631, 4, 1911629554);
        setIntElement(term8631, 5, 1607418272);
        setField(term8629, term8629.getClass(), "mag", term8631);
        setIntField(term8629, term8629.getClass(), "bitCountPlusOne", 0);
        setIntField(term8629, term8629.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8629, term8629.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8629, term8629.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8617, term8617.getClass(), "denominator", term8629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term550;
        Object retValue = callMethod(klass, "divide", argTypes, term527, args);
        assertTrue(recursiveEquals(term527, term8643));
        assertTrue(recursiveEquals(term550, 5270370404989704783L));
        assertTrue(recursiveEquals(retValue, term8617));
    }

};
