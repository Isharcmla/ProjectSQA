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

public class BigFraction_negate_36304857794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169;
     Object term8736;
     Object term8690;

    public BigFraction_negate_36304857794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1169 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term1170 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1172 = (int[]) newIntArray(4);
        Object term1181 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1183 = (int[]) newIntArray(4);
        setIntField(term1170, term1170.getClass(), "signum", 1);
        setIntElement(term1172, 0, 409506724);
        setIntElement(term1172, 1, -637557256);
        setIntElement(term1172, 2, 519933352);
        setIntElement(term1172, 3, -1992186344);
        setField(term1170, term1170.getClass(), "mag", term1172);
        setIntField(term1170, term1170.getClass(), "bitCountPlusOne", 0);
        setIntField(term1170, term1170.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1170, term1170.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1170, term1170.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1169, term1169.getClass(), "numerator", term1170);
        setIntField(term1181, term1181.getClass(), "signum", 1);
        setIntElement(term1183, 0, 1590449009);
        setIntElement(term1183, 1, -862614971);
        setIntElement(term1183, 2, -552718144);
        setIntElement(term1183, 3, 276806312);
        setField(term1181, term1181.getClass(), "mag", term1183);
        setIntField(term1181, term1181.getClass(), "bitCountPlusOne", 0);
        setIntField(term1181, term1181.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1181, term1181.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1181, term1181.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1169, term1169.getClass(), "denominator", term1181);
        term8736 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8737 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8738 = (int[]) newIntArray(4);
        Object term8739 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8740 = (int[]) newIntArray(4);
        setIntField(term8737, term8737.getClass(), "signum", 1);
        setIntElement(term8738, 0, 409506724);
        setIntElement(term8738, 1, -637557256);
        setIntElement(term8738, 2, 519933352);
        setIntElement(term8738, 3, -1992186344);
        setField(term8737, term8737.getClass(), "mag", term8738);
        setIntField(term8737, term8737.getClass(), "bitCountPlusOne", 0);
        setIntField(term8737, term8737.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8737, term8737.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8737, term8737.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8736, term8736.getClass(), "numerator", term8737);
        setIntField(term8739, term8739.getClass(), "signum", 1);
        setIntElement(term8740, 0, 1590449009);
        setIntElement(term8740, 1, -862614971);
        setIntElement(term8740, 2, -552718144);
        setIntElement(term8740, 3, 276806312);
        setField(term8739, term8739.getClass(), "mag", term8740);
        setIntField(term8739, term8739.getClass(), "bitCountPlusOne", 0);
        setIntField(term8739, term8739.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8739, term8739.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8739, term8739.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8736, term8736.getClass(), "denominator", term8739);
        term8690 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term8691 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8693 = (int[]) newIntArray(4);
        Object term8702 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term8704 = (int[]) newIntArray(4);
        setIntField(term8691, term8691.getClass(), "signum", -1);
        setIntElement(term8693, 0, 51188340);
        setIntElement(term8693, 1, -1690307393);
        setIntElement(term8693, 2, 64991669);
        setIntElement(term8693, 3, 287847619);
        setField(term8691, term8691.getClass(), "mag", term8693);
        setIntField(term8691, term8691.getClass(), "bitCountPlusOne", 0);
        setIntField(term8691, term8691.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8691, term8691.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8691, term8691.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8690, term8690.getClass(), "numerator", term8691);
        setIntField(term8702, term8702.getClass(), "signum", 1);
        setIntElement(term8704, 0, 198806126);
        setIntElement(term8704, 1, 965914952);
        setIntElement(term8704, 2, -1142831592);
        setIntElement(term8704, 3, 34600789);
        setField(term8702, term8702.getClass(), "mag", term8704);
        setIntField(term8702, term8702.getClass(), "bitCountPlusOne", 0);
        setIntField(term8702, term8702.getClass(), "bitLengthPlusOne", 0);
        setIntField(term8702, term8702.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term8702, term8702.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term8690, term8690.getClass(), "denominator", term8702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "negate", argTypes, term1169, args);
        assertTrue(recursiveEquals(term1169, term8736));
        assertTrue(recursiveEquals(retValue, term8690));
    }

};


