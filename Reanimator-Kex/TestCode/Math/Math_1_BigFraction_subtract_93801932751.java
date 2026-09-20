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
import java.lang.Object;

public class BigFraction_subtract_93801932751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1550;
     Object term1573;

    public BigFraction_subtract_93801932751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1550 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1551 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1553 = (int[]) newIntArray(4);
        Object term1562 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1564 = (int[]) newIntArray(4);
        setIntField(term1551, term1551.getClass(), "signum", 1);
        setIntElement(term1553, 0, -1506089390);
        setIntElement(term1553, 1, -809724210);
        setIntElement(term1553, 2, -1698771640);
        setIntElement(term1553, 3, -1230823370);
        setField(term1551, term1551.getClass(), "mag", term1553);
        setIntField(term1551, term1551.getClass(), "bitCountPlusOne", 0);
        setIntField(term1551, term1551.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1551, term1551.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1551, term1551.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1550, term1550.getClass(), "numerator", term1551);
        setIntField(term1562, term1562.getClass(), "signum", 1);
        setIntElement(term1564, 0, 686881852);
        setIntElement(term1564, 1, 1232906560);
        setIntElement(term1564, 2, 1840352410);
        setIntElement(term1564, 3, 1282126791);
        setField(term1562, term1562.getClass(), "mag", term1564);
        setIntField(term1562, term1562.getClass(), "bitCountPlusOne", 0);
        setIntField(term1562, term1562.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1562, term1562.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1562, term1562.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1550, term1550.getClass(), "denominator", term1562);
        term1573 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term1574 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1576 = (int[]) newIntArray(4);
        Object term1585 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1587 = (int[]) newIntArray(4);
        setIntField(term1574, term1574.getClass(), "signum", 1);
        setIntElement(term1576, 0, -561905029);
        setIntElement(term1576, 1, -1542661790);
        setIntElement(term1576, 2, 2095366015);
        setIntElement(term1576, 3, -1027289533);
        setField(term1574, term1574.getClass(), "mag", term1576);
        setIntField(term1574, term1574.getClass(), "bitCountPlusOne", 0);
        setIntField(term1574, term1574.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1574, term1574.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1574, term1574.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1573, term1573.getClass(), "numerator", term1574);
        setIntField(term1585, term1585.getClass(), "signum", 1);
        setIntElement(term1587, 0, -100775878);
        setIntElement(term1587, 1, -1241057519);
        setIntElement(term1587, 2, -1380612234);
        setIntElement(term1587, 3, 942943280);
        setField(term1585, term1585.getClass(), "mag", term1587);
        setIntField(term1585, term1585.getClass(), "bitCountPlusOne", 0);
        setIntField(term1585, term1585.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1585, term1585.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1585, term1585.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1573, term1573.getClass(), "denominator", term1585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term1573;
        callMethod(klass, "subtract", argTypes, term1550, args);
    }

};
