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

public class BigFraction_multiply_206838094790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;
     Object term1018;
     Object term9795;
     Object term9800;
     Object term9734;

    public BigFraction_multiply_206838094790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term996 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term998 = (int[]) newIntArray(4);
        Object term1007 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1009 = (int[]) newIntArray(4);
        setIntField(term996, term996.getClass(), "signum", 1);
        setIntElement(term998, 0, -521240333);
        setIntElement(term998, 1, -855804132);
        setIntElement(term998, 2, 905776399);
        setIntElement(term998, 3, 749103107);
        setField(term996, term996.getClass(), "mag", term998);
        setIntField(term996, term996.getClass(), "bitCountPlusOne", 0);
        setIntField(term996, term996.getClass(), "bitLengthPlusOne", 0);
        setIntField(term996, term996.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term996, term996.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term995, term995.getClass(), "numerator", term996);
        setIntField(term1007, term1007.getClass(), "signum", 1);
        setIntElement(term1009, 0, 836374615);
        setIntElement(term1009, 1, 1920919399);
        setIntElement(term1009, 2, -1347207886);
        setIntElement(term1009, 3, 2132153916);
        setField(term1007, term1007.getClass(), "mag", term1009);
        setIntField(term1007, term1007.getClass(), "bitCountPlusOne", 0);
        setIntField(term1007, term1007.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1007, term1007.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1007, term1007.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term995, term995.getClass(), "denominator", term1007);
        term1018 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1020 = (int[]) newIntArray(4);
        setIntField(term1018, term1018.getClass(), "signum", 1);
        setIntElement(term1020, 0, -393387917);
        setIntElement(term1020, 1, -1491020711);
        setIntElement(term1020, 2, -577756177);
        setIntElement(term1020, 3, -982288455);
        setField(term1018, term1018.getClass(), "mag", term1020);
        setIntField(term1018, term1018.getClass(), "bitCountPlusOne", 0);
        setIntField(term1018, term1018.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1018, term1018.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1018, term1018.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term9795 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9796 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9797 = (int[]) newIntArray(4);
        Object term9798 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9799 = (int[]) newIntArray(4);
        setIntField(term9796, term9796.getClass(), "signum", 1);
        setIntElement(term9797, 0, -521240333);
        setIntElement(term9797, 1, -855804132);
        setIntElement(term9797, 2, 905776399);
        setIntElement(term9797, 3, 749103107);
        setField(term9796, term9796.getClass(), "mag", term9797);
        setIntField(term9796, term9796.getClass(), "bitCountPlusOne", 0);
        setIntField(term9796, term9796.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9796, term9796.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9796, term9796.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9795, term9795.getClass(), "numerator", term9796);
        setIntField(term9798, term9798.getClass(), "signum", 1);
        setIntElement(term9799, 0, 836374615);
        setIntElement(term9799, 1, 1920919399);
        setIntElement(term9799, 2, -1347207886);
        setIntElement(term9799, 3, 2132153916);
        setField(term9798, term9798.getClass(), "mag", term9799);
        setIntField(term9798, term9798.getClass(), "bitCountPlusOne", 0);
        setIntField(term9798, term9798.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9798, term9798.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9798, term9798.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9795, term9795.getClass(), "denominator", term9798);
        term9800 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9801 = (int[]) newIntArray(4);
        setIntField(term9800, term9800.getClass(), "signum", 1);
        setIntElement(term9801, 0, -393387917);
        setIntElement(term9801, 1, -1491020711);
        setIntElement(term9801, 2, -577756177);
        setIntElement(term9801, 3, -982288455);
        setField(term9800, term9800.getClass(), "mag", term9801);
        setIntField(term9800, term9800.getClass(), "bitCountPlusOne", 0);
        setIntField(term9800, term9800.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9800, term9800.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9800, term9800.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term9734 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term9735 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9737 = (int[]) newIntArray(8);
        Object term9750 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term9752 = (int[]) newIntArray(4);
        setIntField(term9735, term9735.getClass(), "signum", 1);
        setIntElement(term9737, 0, 489725841);
        setIntElement(term9737, 1, 1242463248);
        setIntElement(term9737, 2, -1880074384);
        setIntElement(term9737, 3, -714750766);
        setIntElement(term9737, 4, 407883175);
        setIntElement(term9737, 5, 1783729404);
        setIntElement(term9737, 6, -171656400);
        setIntElement(term9737, 7, 400139965);
        setField(term9735, term9735.getClass(), "mag", term9737);
        setIntField(term9735, term9735.getClass(), "bitCountPlusOne", 0);
        setIntField(term9735, term9735.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9735, term9735.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9735, term9735.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9734, term9734.getClass(), "numerator", term9735);
        setIntField(term9750, term9750.getClass(), "signum", 1);
        setIntElement(term9752, 0, 119482087);
        setIntElement(term9752, 1, -339149700);
        setIntElement(term9752, 2, -2033158540);
        setIntElement(term9752, 3, -308973340);
        setField(term9750, term9750.getClass(), "mag", term9752);
        setIntField(term9750, term9750.getClass(), "bitCountPlusOne", 0);
        setIntField(term9750, term9750.getClass(), "bitLengthPlusOne", 0);
        setIntField(term9750, term9750.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term9750, term9750.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term9734, term9734.getClass(), "denominator", term9750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term1018;
        Object retValue = callMethod(klass, "multiply", argTypes, term995, args);
        assertTrue(recursiveEquals(term995, term9795));
        assertTrue(recursiveEquals(term1018, term9800));
        assertTrue(recursiveEquals(retValue, term9734));
    }

};
