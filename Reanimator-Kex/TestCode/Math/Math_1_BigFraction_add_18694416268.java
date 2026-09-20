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
import java.lang.Long;

public class BigFraction_add_18694416268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192;
     Object term215;
     Object term6716;
     Object term6690;

    public BigFraction_add_18694416268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
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
        term6716 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6717 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6718 = (int[]) newIntArray(4);
        Object term6719 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6720 = (int[]) newIntArray(4);
        setIntField(term6717, term6717.getClass(), "signum", 1);
        setIntElement(term6718, 0, 1871116404);
        setIntElement(term6718, 1, 1664795693);
        setIntElement(term6718, 2, -187884068);
        setIntElement(term6718, 3, -1009608970);
        setField(term6717, term6717.getClass(), "mag", term6718);
        setIntField(term6717, term6717.getClass(), "bitCountPlusOne", 0);
        setIntField(term6717, term6717.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6717, term6717.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6717, term6717.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6716, term6716.getClass(), "numerator", term6717);
        setIntField(term6719, term6719.getClass(), "signum", 1);
        setIntElement(term6720, 0, -1424172433);
        setIntElement(term6720, 1, -368227377);
        setIntElement(term6720, 2, 1566796227);
        setIntElement(term6720, 3, 1170646410);
        setField(term6719, term6719.getClass(), "mag", term6720);
        setIntField(term6719, term6719.getClass(), "bitCountPlusOne", 0);
        setIntField(term6719, term6719.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6719, term6719.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6719, term6719.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6716, term6716.getClass(), "denominator", term6719);
        term6690 = newInstance(Class.forName("org.apache.commons.math3.fraction.BigFraction"));
        Object term6691 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6693 = (int[]) newIntArray(6);
        Object term6704 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6706 = (int[]) newIntArray(4);
        setIntField(term6691, term6691.getClass(), "signum", -1);
        setIntElement(term6693, 0, 653667580);
        setIntElement(term6693, 1, 1958073925);
        setIntElement(term6693, 2, 451292406);
        setIntElement(term6693, 3, 707493997);
        setIntElement(term6693, 4, 102517060);
        setIntElement(term6693, 5, -317387245);
        setField(term6691, term6691.getClass(), "mag", term6693);
        setIntField(term6691, term6691.getClass(), "bitCountPlusOne", 0);
        setIntField(term6691, term6691.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6691, term6691.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6691, term6691.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6690, term6690.getClass(), "numerator", term6691);
        setIntField(term6704, term6704.getClass(), "signum", 1);
        setIntElement(term6706, 0, 1435397431);
        setIntElement(term6706, 1, -184113689);
        setIntElement(term6706, 2, -1364085535);
        setIntElement(term6706, 3, -1562160443);
        setField(term6704, term6704.getClass(), "mag", term6706);
        setIntField(term6704, term6704.getClass(), "bitCountPlusOne", 0);
        setIntField(term6704, term6704.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6704, term6704.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6704, term6704.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6690, term6690.getClass(), "denominator", term6704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term215;
        Object retValue = callMethod(klass, "add", argTypes, term192, args);
        assertTrue(recursiveEquals(term192, term6716));
        assertTrue(recursiveEquals(term215, -8400487765614892086L));
        assertTrue(recursiveEquals(retValue, term6690));
    }

};
