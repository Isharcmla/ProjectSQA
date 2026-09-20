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

public class BigFraction_add_105415735466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term136;
     Object term6322;
     Object term6327;
     Object term6283;

    public BigFraction_add_105415735466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term114 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term116 = (int[]) newIntArray(4);
        Object term125 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term127 = (int[]) newIntArray(4);
        setIntField(term114, term114.getClass(), "signum", 1);
        setIntElement(term116, 0, 2037839064);
        setIntElement(term116, 1, -1644256257);
        setIntElement(term116, 2, -32263804);
        setIntElement(term116, 3, -252903944);
        setField(term114, term114.getClass(), "mag", term116);
        setIntField(term114, term114.getClass(), "bitCountPlusOne", 0);
        setIntField(term114, term114.getClass(), "bitLengthPlusOne", 0);
        setIntField(term114, term114.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term114, term114.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term113, term113.getClass(), "numerator", term114);
        setIntField(term125, term125.getClass(), "signum", 1);
        setIntElement(term127, 0, -1863190589);
        setIntElement(term127, 1, -1847873469);
        setIntElement(term127, 2, 390017059);
        setIntElement(term127, 3, -251162061);
        setField(term125, term125.getClass(), "mag", term127);
        setIntField(term125, term125.getClass(), "bitCountPlusOne", 0);
        setIntField(term125, term125.getClass(), "bitLengthPlusOne", 0);
        setIntField(term125, term125.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term125, term125.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term113, term113.getClass(), "denominator", term125);
        term136 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term138 = (int[]) newIntArray(4);
        setIntField(term136, term136.getClass(), "signum", 1);
        setIntElement(term138, 0, 610795187);
        setIntElement(term138, 1, 1979806705);
        setIntElement(term138, 2, 1795089907);
        setIntElement(term138, 3, 1645000889);
        setField(term136, term136.getClass(), "mag", term138);
        setIntField(term136, term136.getClass(), "bitCountPlusOne", 0);
        setIntField(term136, term136.getClass(), "bitLengthPlusOne", 0);
        setIntField(term136, term136.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term136, term136.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term6322 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6323 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6324 = (int[]) newIntArray(4);
        Object term6325 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6326 = (int[]) newIntArray(4);
        setIntField(term6323, term6323.getClass(), "signum", 1);
        setIntElement(term6324, 0, 2037839064);
        setIntElement(term6324, 1, -1644256257);
        setIntElement(term6324, 2, -32263804);
        setIntElement(term6324, 3, -252903944);
        setField(term6323, term6323.getClass(), "mag", term6324);
        setIntField(term6323, term6323.getClass(), "bitCountPlusOne", 0);
        setIntField(term6323, term6323.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6323, term6323.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6323, term6323.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6322, term6322.getClass(), "numerator", term6323);
        setIntField(term6325, term6325.getClass(), "signum", 1);
        setIntElement(term6326, 0, -1863190589);
        setIntElement(term6326, 1, -1847873469);
        setIntElement(term6326, 2, 390017059);
        setIntElement(term6326, 3, -251162061);
        setField(term6325, term6325.getClass(), "mag", term6326);
        setIntField(term6325, term6325.getClass(), "bitCountPlusOne", 0);
        setIntField(term6325, term6325.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6325, term6325.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6325, term6325.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6322, term6322.getClass(), "denominator", term6325);
        term6327 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6328 = (int[]) newIntArray(4);
        setIntField(term6327, term6327.getClass(), "signum", 1);
        setIntElement(term6328, 0, 610795187);
        setIntElement(term6328, 1, 1979806705);
        setIntElement(term6328, 2, 1795089907);
        setIntElement(term6328, 3, 1645000889);
        setField(term6327, term6327.getClass(), "mag", term6328);
        setIntField(term6327, term6327.getClass(), "bitCountPlusOne", 0);
        setIntField(term6327, term6327.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6327, term6327.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6327, term6327.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term6283 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6284 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6286 = (int[]) newIntArray(8);
        Object term6299 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6301 = (int[]) newIntArray(4);
        setIntField(term6284, term6284.getClass(), "signum", 1);
        setIntElement(term6286, 0, 345827431);
        setIntElement(term6286, 1, -536397969);
        setIntElement(term6286, 2, -814973243);
        setIntElement(term6286, 3, 176835269);
        setIntElement(term6286, 4, 1342621972);
        setIntElement(term6286, 5, 2113810525);
        setIntElement(term6286, 6, -170071946);
        setIntElement(term6286, 7, -253866797);
        setField(term6284, term6284.getClass(), "mag", term6286);
        setIntField(term6284, term6284.getClass(), "bitCountPlusOne", 0);
        setIntField(term6284, term6284.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6284, term6284.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6284, term6284.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6283, term6283.getClass(), "numerator", term6284);
        setIntField(term6299, term6299.getClass(), "signum", 1);
        setIntElement(term6301, 0, -1863190589);
        setIntElement(term6301, 1, -1847873469);
        setIntElement(term6301, 2, 390017059);
        setIntElement(term6301, 3, -251162061);
        setField(term6299, term6299.getClass(), "mag", term6301);
        setIntField(term6299, term6299.getClass(), "bitCountPlusOne", 0);
        setIntField(term6299, term6299.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6299, term6299.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6299, term6299.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6283, term6283.getClass(), "denominator", term6299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "add", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term6322));
        assertTrue(recursiveEquals(term136, term6327));
        assertTrue(recursiveEquals(retValue, term6283));
    }

};
