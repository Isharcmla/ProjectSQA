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
import java.lang.Integer;

public class BigFraction_divide_19378746275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;
     Object term517;
     Object term6565;
     Object term6540;

    public BigFraction_divide_19378746275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term495 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term497 = (int[]) newIntArray(4);
        Object term506 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term508 = (int[]) newIntArray(4);
        setIntField(term495, term495.getClass(), "signum", 1);
        setIntElement(term497, 0, -2141012790);
        setIntElement(term497, 1, 1180498058);
        setIntElement(term497, 2, -466025674);
        setIntElement(term497, 3, 1937134398);
        setField(term495, term495.getClass(), "mag", term497);
        setIntField(term495, term495.getClass(), "bitCountPlusOne", 0);
        setIntField(term495, term495.getClass(), "bitLengthPlusOne", 0);
        setIntField(term495, term495.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term495, term495.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term494, term494.getClass(), "numerator", term495);
        setIntField(term506, term506.getClass(), "signum", 1);
        setIntElement(term508, 0, 1621794386);
        setIntElement(term508, 1, 864216383);
        setIntElement(term508, 2, -881266322);
        setIntElement(term508, 3, -126622889);
        setField(term506, term506.getClass(), "mag", term508);
        setIntField(term506, term506.getClass(), "bitCountPlusOne", 0);
        setIntField(term506, term506.getClass(), "bitLengthPlusOne", 0);
        setIntField(term506, term506.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term506, term506.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term494, term494.getClass(), "denominator", term506);
        term517 = new Integer(-883034806);
        term6565 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6566 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6567 = (int[]) newIntArray(4);
        Object term6568 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6569 = (int[]) newIntArray(4);
        setIntField(term6566, term6566.getClass(), "signum", 1);
        setIntElement(term6567, 0, -2141012790);
        setIntElement(term6567, 1, 1180498058);
        setIntElement(term6567, 2, -466025674);
        setIntElement(term6567, 3, 1937134398);
        setField(term6566, term6566.getClass(), "mag", term6567);
        setIntField(term6566, term6566.getClass(), "bitCountPlusOne", 0);
        setIntField(term6566, term6566.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6566, term6566.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6566, term6566.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6565, term6565.getClass(), "numerator", term6566);
        setIntField(term6568, term6568.getClass(), "signum", 1);
        setIntElement(term6569, 0, 1621794386);
        setIntElement(term6569, 1, 864216383);
        setIntElement(term6569, 2, -881266322);
        setIntElement(term6569, 3, -126622889);
        setField(term6568, term6568.getClass(), "mag", term6569);
        setIntField(term6568, term6568.getClass(), "bitCountPlusOne", 0);
        setIntField(term6568, term6568.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6568, term6568.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6568, term6568.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6565, term6565.getClass(), "denominator", term6568);
        term6540 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6541 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6543 = (int[]) newIntArray(4);
        Object term6552 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6554 = (int[]) newIntArray(5);
        setIntField(term6541, term6541.getClass(), "signum", -1);
        setIntElement(term6543, 0, 1076977253);
        setIntElement(term6543, 1, 590249029);
        setIntElement(term6543, 2, 1914470811);
        setIntElement(term6543, 3, 968567199);
        setField(term6541, term6541.getClass(), "mag", term6543);
        setIntField(term6541, term6541.getClass(), "bitCountPlusOne", 0);
        setIntField(term6541, term6541.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6541, term6541.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6541, term6541.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6540, term6540.getClass(), "numerator", term6541);
        setIntField(term6552, term6552.getClass(), "signum", 1);
        setIntElement(term6554, 0, 166718486);
        setIntElement(term6554, 1, 586906092);
        setIntElement(term6554, 2, -505715088);
        setIntElement(term6554, 3, 1510825742);
        setIntElement(term6554, 4, 1495892717);
        setField(term6552, term6552.getClass(), "mag", term6554);
        setIntField(term6552, term6552.getClass(), "bitCountPlusOne", 0);
        setIntField(term6552, term6552.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6552, term6552.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6552, term6552.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6540, term6540.getClass(), "denominator", term6552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term517;
        Object retValue = callMethod(klass, "divide", argTypes, term494, args);
        assertTrue(recursiveEquals(term494, term6565));
        assertTrue(recursiveEquals(term517, -883034806));
        assertTrue(recursiveEquals(retValue, term6540));
    }

};


