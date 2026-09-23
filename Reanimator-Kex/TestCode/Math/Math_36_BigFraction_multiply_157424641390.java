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

public class BigFraction_multiply_157424641390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term995;
     Object term1018;
     Object term7913;
     Object term7918;
     Object term7852;

    public BigFraction_multiply_157424641390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term995 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term7913 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7914 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7915 = (int[]) newIntArray(4);
        Object term7916 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7917 = (int[]) newIntArray(4);
        setIntField(term7914, term7914.getClass(), "signum", 1);
        setIntElement(term7915, 0, -521240333);
        setIntElement(term7915, 1, -855804132);
        setIntElement(term7915, 2, 905776399);
        setIntElement(term7915, 3, 749103107);
        setField(term7914, term7914.getClass(), "mag", term7915);
        setIntField(term7914, term7914.getClass(), "bitCountPlusOne", 0);
        setIntField(term7914, term7914.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7914, term7914.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7914, term7914.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7913, term7913.getClass(), "numerator", term7914);
        setIntField(term7916, term7916.getClass(), "signum", 1);
        setIntElement(term7917, 0, 836374615);
        setIntElement(term7917, 1, 1920919399);
        setIntElement(term7917, 2, -1347207886);
        setIntElement(term7917, 3, 2132153916);
        setField(term7916, term7916.getClass(), "mag", term7917);
        setIntField(term7916, term7916.getClass(), "bitCountPlusOne", 0);
        setIntField(term7916, term7916.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7916, term7916.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7916, term7916.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7913, term7913.getClass(), "denominator", term7916);
        term7918 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7919 = (int[]) newIntArray(4);
        setIntField(term7918, term7918.getClass(), "signum", 1);
        setIntElement(term7919, 0, -393387917);
        setIntElement(term7919, 1, -1491020711);
        setIntElement(term7919, 2, -577756177);
        setIntElement(term7919, 3, -982288455);
        setField(term7918, term7918.getClass(), "mag", term7919);
        setIntField(term7918, term7918.getClass(), "bitCountPlusOne", 0);
        setIntField(term7918, term7918.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7918, term7918.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7918, term7918.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term7852 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term7853 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7855 = (int[]) newIntArray(8);
        Object term7868 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7870 = (int[]) newIntArray(4);
        setIntField(term7853, term7853.getClass(), "signum", 1);
        setIntElement(term7855, 0, 489725841);
        setIntElement(term7855, 1, 1242463248);
        setIntElement(term7855, 2, -1880074384);
        setIntElement(term7855, 3, -714750766);
        setIntElement(term7855, 4, 407883175);
        setIntElement(term7855, 5, 1783729404);
        setIntElement(term7855, 6, -171656400);
        setIntElement(term7855, 7, 400139965);
        setField(term7853, term7853.getClass(), "mag", term7855);
        setIntField(term7853, term7853.getClass(), "bitCountPlusOne", 0);
        setIntField(term7853, term7853.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7853, term7853.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7853, term7853.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7852, term7852.getClass(), "numerator", term7853);
        setIntField(term7868, term7868.getClass(), "signum", 1);
        setIntElement(term7870, 0, 119482087);
        setIntElement(term7870, 1, -339149700);
        setIntElement(term7870, 2, -2033158540);
        setIntElement(term7870, 3, -308973340);
        setField(term7868, term7868.getClass(), "mag", term7870);
        setIntField(term7868, term7868.getClass(), "bitCountPlusOne", 0);
        setIntField(term7868, term7868.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7868, term7868.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7868, term7868.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7852, term7852.getClass(), "denominator", term7868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term1018;
        Object retValue = callMethod(klass, "multiply", argTypes, term995, args);
        assertTrue(recursiveEquals(term995, term7913));
        assertTrue(recursiveEquals(term1018, term7918));
        assertTrue(recursiveEquals(retValue, term7852));
    }

};


