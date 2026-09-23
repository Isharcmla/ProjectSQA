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

public class BigFraction_multiply_56906819893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;
     Object term1130;
     Object term8550;
     Object term8555;
     Object term8473;

    public BigFraction_multiply_56906819893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1107 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1108 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1110 = (int[]) newIntArray(4);
        Object term1119 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1121 = (int[]) newIntArray(4);
        setIntField(term1108, term1108.getClass(), "signum", 1);
        setIntElement(term1110, 0, 1514115305);
        setIntElement(term1110, 1, -568440302);
        setIntElement(term1110, 2, -20183448);
        setIntElement(term1110, 3, 1614266231);
        setField(term1108, term1108.getClass(), "mag", term1110);
        setIntField(term1108, term1108.getClass(), "bitCountPlusOne", 0);
        setIntField(term1108, term1108.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1108, term1108.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1108, term1108.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1107, term1107.getClass(), "numerator", term1108);
        setIntField(term1119, term1119.getClass(), "signum", 1);
        setIntElement(term1121, 0, 923806330);
        setIntElement(term1121, 1, -1712411831);
        setIntElement(term1121, 2, -1721130690);
        setIntElement(term1121, 3, -1634383844);
        setField(term1119, term1119.getClass(), "mag", term1121);
        setIntField(term1119, term1119.getClass(), "bitCountPlusOne", 0);
        setIntField(term1119, term1119.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1119, term1119.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1119, term1119.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1107, term1107.getClass(), "denominator", term1119);
        term1130 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1131 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1133 = (int[]) newIntArray(4);
        Object term1142 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1144 = (int[]) newIntArray(4);
        setIntField(term1131, term1131.getClass(), "signum", 1);
        setIntElement(term1133, 0, -1980481379);
        setIntElement(term1133, 1, 2016419825);
        setIntElement(term1133, 2, -251035281);
        setIntElement(term1133, 3, 1933444065);
        setField(term1131, term1131.getClass(), "mag", term1133);
        setIntField(term1131, term1131.getClass(), "bitCountPlusOne", 0);
        setIntField(term1131, term1131.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1131, term1131.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1131, term1131.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1130, term1130.getClass(), "numerator", term1131);
        setIntField(term1142, term1142.getClass(), "signum", 1);
        setIntElement(term1144, 0, 888826327);
        setIntElement(term1144, 1, 1624596937);
        setIntElement(term1144, 2, 684798665);
        setIntElement(term1144, 3, -75601411);
        setField(term1142, term1142.getClass(), "mag", term1144);
        setIntField(term1142, term1142.getClass(), "bitCountPlusOne", 0);
        setIntField(term1142, term1142.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1142, term1142.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1142, term1142.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1130, term1130.getClass(), "denominator", term1142);
        term8550 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8551 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8552 = (int[]) newIntArray(4);
        Object term8553 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8554 = (int[]) newIntArray(4);
        setIntField(term8551, term8551.getClass(), "signum", 1);
        setIntElement(term8552, 0, 1514115305);
        setIntElement(term8552, 1, -568440302);
        setIntElement(term8552, 2, -20183448);
        setIntElement(term8552, 3, 1614266231);
        setField(term8551, term8551.getClass(), "mag", term8552);
        setIntField(term8551, term8551.getClass(), "bitCountPlusOne", 0);
        setIntField(term8551, term8551.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8551, term8551.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8551, term8551.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8550, term8550.getClass(), "numerator", term8551);
        setIntField(term8553, term8553.getClass(), "signum", 1);
        setIntElement(term8554, 0, 923806330);
        setIntElement(term8554, 1, -1712411831);
        setIntElement(term8554, 2, -1721130690);
        setIntElement(term8554, 3, -1634383844);
        setField(term8553, term8553.getClass(), "mag", term8554);
        setIntField(term8553, term8553.getClass(), "bitCountPlusOne", 0);
        setIntField(term8553, term8553.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8553, term8553.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8553, term8553.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8550, term8550.getClass(), "denominator", term8553);
        term8555 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8556 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8557 = (int[]) newIntArray(4);
        Object term8558 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8559 = (int[]) newIntArray(4);
        setIntField(term8556, term8556.getClass(), "signum", 1);
        setIntElement(term8557, 0, -1980481379);
        setIntElement(term8557, 1, 2016419825);
        setIntElement(term8557, 2, -251035281);
        setIntElement(term8557, 3, 1933444065);
        setField(term8556, term8556.getClass(), "mag", term8557);
        setIntField(term8556, term8556.getClass(), "bitCountPlusOne", 0);
        setIntField(term8556, term8556.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8556, term8556.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8556, term8556.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8555, term8555.getClass(), "numerator", term8556);
        setIntField(term8558, term8558.getClass(), "signum", 1);
        setIntElement(term8559, 0, 888826327);
        setIntElement(term8559, 1, 1624596937);
        setIntElement(term8559, 2, 684798665);
        setIntElement(term8559, 3, -75601411);
        setField(term8558, term8558.getClass(), "mag", term8559);
        setIntField(term8558, term8558.getClass(), "bitCountPlusOne", 0);
        setIntField(term8558, term8558.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8558, term8558.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8558, term8558.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8555, term8555.getClass(), "denominator", term8558);
        term8473 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8474 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8476 = (int[]) newIntArray(8);
        Object term8489 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8491 = (int[]) newIntArray(8);
        setIntField(term8474, term8474.getClass(), "signum", 1);
        setIntElement(term8476, 0, 42943756);
        setIntElement(term8476, 1, 1510263384);
        setIntElement(term8476, 2, -1729919313);
        setIntElement(term8476, 3, 85405246);
        setIntElement(term8476, 4, -1560300953);
        setIntElement(term8476, 5, -1619909943);
        setIntElement(term8476, 6, 1659824006);
        setIntElement(term8476, 7, 1593006573);
        setField(term8474, term8474.getClass(), "mag", term8476);
        setIntField(term8474, term8474.getClass(), "bitCountPlusOne", 0);
        setIntField(term8474, term8474.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8474, term8474.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8474, term8474.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8473, term8473.getClass(), "numerator", term8474);
        setIntField(term8489, term8489.getClass(), "signum", 1);
        setIntElement(term8491, 0, 10062001);
        setIntElement(term8491, 1, -1730858451);
        setIntElement(term8491, 2, -1784534167);
        setIntElement(term8491, 3, 497577683);
        setIntElement(term8491, 4, 1044133186);
        setIntElement(term8491, 5, 807008215);
        setIntElement(term8491, 6, -1217684601);
        setIntElement(term8491, 7, -249106652);
        setField(term8489, term8489.getClass(), "mag", term8491);
        setIntField(term8489, term8489.getClass(), "bitCountPlusOne", 0);
        setIntField(term8489, term8489.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8489, term8489.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8489, term8489.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8473, term8473.getClass(), "denominator", term8489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Object[] args = new Object[1];
        args[0] = term1130;
        Object retValue = callMethod(klass, "multiply", argTypes, term1107, args);
        assertTrue(recursiveEquals(term1107, term8550));
        assertTrue(recursiveEquals(term1130, term8555));
        assertTrue(recursiveEquals(retValue, term8473));
    }

};


