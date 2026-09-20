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

public class BigFraction_compareTo_111250661373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;
     Object term409;
     Object term8056;
     Object term8061;

    public BigFraction_compareTo_111250661373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term387 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term389 = (int[]) newIntArray(4);
        Object term398 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term400 = (int[]) newIntArray(4);
        setIntField(term387, term387.getClass(), "signum", 1);
        setIntElement(term389, 0, 1179412034);
        setIntElement(term389, 1, 820827614);
        setIntElement(term389, 2, -758556010);
        setIntElement(term389, 3, -2132082799);
        setField(term387, term387.getClass(), "mag", term389);
        setIntField(term387, term387.getClass(), "bitCountPlusOne", 0);
        setIntField(term387, term387.getClass(), "bitLengthPlusOne", 0);
        setIntField(term387, term387.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term387, term387.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term386, term386.getClass(), "numerator", term387);
        setIntField(term398, term398.getClass(), "signum", 1);
        setIntElement(term400, 0, 1117380577);
        setIntElement(term400, 1, -1877052693);
        setIntElement(term400, 2, 1366433848);
        setIntElement(term400, 3, 1096447770);
        setField(term398, term398.getClass(), "mag", term400);
        setIntField(term398, term398.getClass(), "bitCountPlusOne", 0);
        setIntField(term398, term398.getClass(), "bitLengthPlusOne", 0);
        setIntField(term398, term398.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term398, term398.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term386, term386.getClass(), "denominator", term398);
        term409 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term410 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412 = (int[]) newIntArray(4);
        Object term421 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term423 = (int[]) newIntArray(4);
        setIntField(term410, term410.getClass(), "signum", 1);
        setIntElement(term412, 0, -726640958);
        setIntElement(term412, 1, 560379572);
        setIntElement(term412, 2, -1232687926);
        setIntElement(term412, 3, -1400821230);
        setField(term410, term410.getClass(), "mag", term412);
        setIntField(term410, term410.getClass(), "bitCountPlusOne", 0);
        setIntField(term410, term410.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410, term410.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410, term410.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409, term409.getClass(), "numerator", term410);
        setIntField(term421, term421.getClass(), "signum", 1);
        setIntElement(term423, 0, -884953937);
        setIntElement(term423, 1, -1552322929);
        setIntElement(term423, 2, 1391116072);
        setIntElement(term423, 3, -1488444321);
        setField(term421, term421.getClass(), "mag", term423);
        setIntField(term421, term421.getClass(), "bitCountPlusOne", 0);
        setIntField(term421, term421.getClass(), "bitLengthPlusOne", 0);
        setIntField(term421, term421.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term421, term421.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409, term409.getClass(), "denominator", term421);
        term8056 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8057 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8058 = (int[]) newIntArray(4);
        Object term8059 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8060 = (int[]) newIntArray(4);
        setIntField(term8057, term8057.getClass(), "signum", 1);
        setIntElement(term8058, 0, 1179412034);
        setIntElement(term8058, 1, 820827614);
        setIntElement(term8058, 2, -758556010);
        setIntElement(term8058, 3, -2132082799);
        setField(term8057, term8057.getClass(), "mag", term8058);
        setIntField(term8057, term8057.getClass(), "bitCountPlusOne", 0);
        setIntField(term8057, term8057.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8057, term8057.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8057, term8057.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8056, term8056.getClass(), "numerator", term8057);
        setIntField(term8059, term8059.getClass(), "signum", 1);
        setIntElement(term8060, 0, 1117380577);
        setIntElement(term8060, 1, -1877052693);
        setIntElement(term8060, 2, 1366433848);
        setIntElement(term8060, 3, 1096447770);
        setField(term8059, term8059.getClass(), "mag", term8060);
        setIntField(term8059, term8059.getClass(), "bitCountPlusOne", 0);
        setIntField(term8059, term8059.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8059, term8059.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8059, term8059.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8056, term8056.getClass(), "denominator", term8059);
        term8061 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term8062 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8063 = (int[]) newIntArray(4);
        Object term8064 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8065 = (int[]) newIntArray(4);
        setIntField(term8062, term8062.getClass(), "signum", 1);
        setIntElement(term8063, 0, -726640958);
        setIntElement(term8063, 1, 560379572);
        setIntElement(term8063, 2, -1232687926);
        setIntElement(term8063, 3, -1400821230);
        setField(term8062, term8062.getClass(), "mag", term8063);
        setIntField(term8062, term8062.getClass(), "bitCountPlusOne", 0);
        setIntField(term8062, term8062.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8062, term8062.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8062, term8062.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8061, term8061.getClass(), "numerator", term8062);
        setIntField(term8064, term8064.getClass(), "signum", 1);
        setIntElement(term8065, 0, -884953937);
        setIntElement(term8065, 1, -1552322929);
        setIntElement(term8065, 2, 1391116072);
        setIntElement(term8065, 3, -1488444321);
        setField(term8064, term8064.getClass(), "mag", term8065);
        setIntField(term8064, term8064.getClass(), "bitCountPlusOne", 0);
        setIntField(term8064, term8064.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8064, term8064.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8064, term8064.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8061, term8061.getClass(), "denominator", term8064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term409;
        Object retValue = callMethod(klass, "compareTo", argTypes, term386, args);
        assertTrue(recursiveEquals(term386, term8056));
        assertTrue(recursiveEquals(term409, term8061));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
