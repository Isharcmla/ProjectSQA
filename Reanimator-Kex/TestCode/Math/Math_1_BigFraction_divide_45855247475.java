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
import java.lang.Integer;

public class BigFraction_divide_45855247475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;
     Object term517;
     Object term8444;
     Object term8419;

    public BigFraction_divide_45855247475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term8444 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8445 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8446 = (int[]) newIntArray(4);
        Object term8447 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8448 = (int[]) newIntArray(4);
        setIntField(term8445, term8445.getClass(), "signum", 1);
        setIntElement(term8446, 0, -2141012790);
        setIntElement(term8446, 1, 1180498058);
        setIntElement(term8446, 2, -466025674);
        setIntElement(term8446, 3, 1937134398);
        setField(term8445, term8445.getClass(), "mag", term8446);
        setIntField(term8445, term8445.getClass(), "bitCountPlusOne", 0);
        setIntField(term8445, term8445.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8445, term8445.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8445, term8445.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8444, term8444.getClass(), "numerator", term8445);
        setIntField(term8447, term8447.getClass(), "signum", 1);
        setIntElement(term8448, 0, 1621794386);
        setIntElement(term8448, 1, 864216383);
        setIntElement(term8448, 2, -881266322);
        setIntElement(term8448, 3, -126622889);
        setField(term8447, term8447.getClass(), "mag", term8448);
        setIntField(term8447, term8447.getClass(), "bitCountPlusOne", 0);
        setIntField(term8447, term8447.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8447, term8447.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8447, term8447.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8444, term8444.getClass(), "denominator", term8447);
        term8419 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8420 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8422 = (int[]) newIntArray(4);
        Object term8431 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8433 = (int[]) newIntArray(5);
        setIntField(term8420, term8420.getClass(), "signum", -1);
        setIntElement(term8422, 0, 1076977253);
        setIntElement(term8422, 1, 590249029);
        setIntElement(term8422, 2, 1914470811);
        setIntElement(term8422, 3, 968567199);
        setField(term8420, term8420.getClass(), "mag", term8422);
        setIntField(term8420, term8420.getClass(), "bitCountPlusOne", 0);
        setIntField(term8420, term8420.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8420, term8420.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8420, term8420.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8419, term8419.getClass(), "numerator", term8420);
        setIntField(term8431, term8431.getClass(), "signum", 1);
        setIntElement(term8433, 0, 166718486);
        setIntElement(term8433, 1, 586906092);
        setIntElement(term8433, 2, -505715088);
        setIntElement(term8433, 3, 1510825742);
        setIntElement(term8433, 4, 1495892717);
        setField(term8431, term8431.getClass(), "mag", term8433);
        setIntField(term8431, term8431.getClass(), "bitCountPlusOne", 0);
        setIntField(term8431, term8431.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8431, term8431.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8431, term8431.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8419, term8419.getClass(), "denominator", term8431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term517;
        Object retValue = callMethod(klass, "divide", argTypes, term494, args);
        assertTrue(recursiveEquals(term494, term8444));
        assertTrue(recursiveEquals(term517, -883034806));
        assertTrue(recursiveEquals(retValue, term8419));
    }

};
