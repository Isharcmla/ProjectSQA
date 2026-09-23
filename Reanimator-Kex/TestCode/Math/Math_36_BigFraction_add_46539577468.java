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

public class BigFraction_add_46539577468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term215;
     Object term4839;
     Object term4813;

    public BigFraction_add_46539577468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term193 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term195 = (int[]) newIntArray(4);
        Object term204 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term206 = (int[]) newIntArray(4);
        setIntField(term193, term193.getClass(), "signum", 1);
        setIntElement(term195, 0, 1871116404);
        setIntElement(term195, 1, 1664795693);
        setIntElement(term195, 2, -187884068);
        setIntElement(term195, 3, -1009608970);
        setField(term193, term193.getClass(), "mag", term195);
        setIntField(term193, term193.getClass(), "bitCountPlusOne", 0);
        setIntField(term193, term193.getClass(), "bitLengthPlusOne", 0);
        setIntField(term193, term193.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term193, term193.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term192, term192.getClass(), "numerator", term193);
        setIntField(term204, term204.getClass(), "signum", 1);
        setIntElement(term206, 0, -1424172433);
        setIntElement(term206, 1, -368227377);
        setIntElement(term206, 2, 1566796227);
        setIntElement(term206, 3, 1170646410);
        setField(term204, term204.getClass(), "mag", term206);
        setIntField(term204, term204.getClass(), "bitCountPlusOne", 0);
        setIntField(term204, term204.getClass(), "bitLengthPlusOne", 0);
        setIntField(term204, term204.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term204, term204.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term192, term192.getClass(), "denominator", term204);
        term215 = new Long(-8400487765614892086L);
        term4839 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4840 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4841 = (int[]) newIntArray(4);
        Object term4842 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4843 = (int[]) newIntArray(4);
        setIntField(term4840, term4840.getClass(), "signum", 1);
        setIntElement(term4841, 0, 1871116404);
        setIntElement(term4841, 1, 1664795693);
        setIntElement(term4841, 2, -187884068);
        setIntElement(term4841, 3, -1009608970);
        setField(term4840, term4840.getClass(), "mag", term4841);
        setIntField(term4840, term4840.getClass(), "bitCountPlusOne", 0);
        setIntField(term4840, term4840.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4840, term4840.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4840, term4840.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4839, term4839.getClass(), "numerator", term4840);
        setIntField(term4842, term4842.getClass(), "signum", 1);
        setIntElement(term4843, 0, -1424172433);
        setIntElement(term4843, 1, -368227377);
        setIntElement(term4843, 2, 1566796227);
        setIntElement(term4843, 3, 1170646410);
        setField(term4842, term4842.getClass(), "mag", term4843);
        setIntField(term4842, term4842.getClass(), "bitCountPlusOne", 0);
        setIntField(term4842, term4842.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4842, term4842.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4842, term4842.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4839, term4839.getClass(), "denominator", term4842);
        term4813 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4814 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4816 = (int[]) newIntArray(6);
        Object term4827 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4829 = (int[]) newIntArray(4);
        setIntField(term4814, term4814.getClass(), "signum", -1);
        setIntElement(term4816, 0, 653667580);
        setIntElement(term4816, 1, 1958073925);
        setIntElement(term4816, 2, 451292406);
        setIntElement(term4816, 3, 707493997);
        setIntElement(term4816, 4, 102517060);
        setIntElement(term4816, 5, -317387245);
        setField(term4814, term4814.getClass(), "mag", term4816);
        setIntField(term4814, term4814.getClass(), "bitCountPlusOne", 0);
        setIntField(term4814, term4814.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4814, term4814.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4814, term4814.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4813, term4813.getClass(), "numerator", term4814);
        setIntField(term4827, term4827.getClass(), "signum", 1);
        setIntElement(term4829, 0, 1435397431);
        setIntElement(term4829, 1, -184113689);
        setIntElement(term4829, 2, -1364085535);
        setIntElement(term4829, 3, -1562160443);
        setField(term4827, term4827.getClass(), "mag", term4829);
        setIntField(term4827, term4827.getClass(), "bitCountPlusOne", 0);
        setIntField(term4827, term4827.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4827, term4827.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4827, term4827.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4813, term4813.getClass(), "denominator", term4827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term215;
        Object retValue = callMethod(klass, "add", argTypes, term192, args);
        assertTrue(recursiveEquals(term192, term4839));
        assertTrue(recursiveEquals(term215, -8400487765614892086L));
        assertTrue(recursiveEquals(retValue, term4813));
    }

};


