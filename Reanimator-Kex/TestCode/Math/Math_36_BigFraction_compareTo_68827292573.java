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

public class BigFraction_compareTo_68827292573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;
     Object term409;
     Object term6179;
     Object term6184;

    public BigFraction_compareTo_68827292573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term409 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term6179 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6180 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6181 = (int[]) newIntArray(4);
        Object term6182 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6183 = (int[]) newIntArray(4);
        setIntField(term6180, term6180.getClass(), "signum", 1);
        setIntElement(term6181, 0, 1179412034);
        setIntElement(term6181, 1, 820827614);
        setIntElement(term6181, 2, -758556010);
        setIntElement(term6181, 3, -2132082799);
        setField(term6180, term6180.getClass(), "mag", term6181);
        setIntField(term6180, term6180.getClass(), "bitCountPlusOne", 0);
        setIntField(term6180, term6180.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6180, term6180.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6180, term6180.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6179, term6179.getClass(), "numerator", term6180);
        setIntField(term6182, term6182.getClass(), "signum", 1);
        setIntElement(term6183, 0, 1117380577);
        setIntElement(term6183, 1, -1877052693);
        setIntElement(term6183, 2, 1366433848);
        setIntElement(term6183, 3, 1096447770);
        setField(term6182, term6182.getClass(), "mag", term6183);
        setIntField(term6182, term6182.getClass(), "bitCountPlusOne", 0);
        setIntField(term6182, term6182.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6182, term6182.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6182, term6182.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6179, term6179.getClass(), "denominator", term6182);
        term6184 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term6185 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6186 = (int[]) newIntArray(4);
        Object term6187 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6188 = (int[]) newIntArray(4);
        setIntField(term6185, term6185.getClass(), "signum", 1);
        setIntElement(term6186, 0, -726640958);
        setIntElement(term6186, 1, 560379572);
        setIntElement(term6186, 2, -1232687926);
        setIntElement(term6186, 3, -1400821230);
        setField(term6185, term6185.getClass(), "mag", term6186);
        setIntField(term6185, term6185.getClass(), "bitCountPlusOne", 0);
        setIntField(term6185, term6185.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6185, term6185.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6185, term6185.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6184, term6184.getClass(), "numerator", term6185);
        setIntField(term6187, term6187.getClass(), "signum", 1);
        setIntElement(term6188, 0, -884953937);
        setIntElement(term6188, 1, -1552322929);
        setIntElement(term6188, 2, 1391116072);
        setIntElement(term6188, 3, -1488444321);
        setField(term6187, term6187.getClass(), "mag", term6188);
        setIntField(term6187, term6187.getClass(), "bitCountPlusOne", 0);
        setIntField(term6187, term6187.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6187, term6187.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6187, term6187.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6184, term6184.getClass(), "denominator", term6187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term409;
        Object retValue = callMethod(klass, "compareTo", argTypes, term386, args);
        assertTrue(recursiveEquals(term386, term6179));
        assertTrue(recursiveEquals(term409, term6184));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


