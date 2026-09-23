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

public class BigFraction_add_40181741866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term136;
     Object term4445;
     Object term4450;
     Object term4406;

    public BigFraction_add_40181741866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
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
        term4445 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4446 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4447 = (int[]) newIntArray(4);
        Object term4448 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4449 = (int[]) newIntArray(4);
        setIntField(term4446, term4446.getClass(), "signum", 1);
        setIntElement(term4447, 0, 2037839064);
        setIntElement(term4447, 1, -1644256257);
        setIntElement(term4447, 2, -32263804);
        setIntElement(term4447, 3, -252903944);
        setField(term4446, term4446.getClass(), "mag", term4447);
        setIntField(term4446, term4446.getClass(), "bitCountPlusOne", 0);
        setIntField(term4446, term4446.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4446, term4446.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4446, term4446.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4445, term4445.getClass(), "numerator", term4446);
        setIntField(term4448, term4448.getClass(), "signum", 1);
        setIntElement(term4449, 0, -1863190589);
        setIntElement(term4449, 1, -1847873469);
        setIntElement(term4449, 2, 390017059);
        setIntElement(term4449, 3, -251162061);
        setField(term4448, term4448.getClass(), "mag", term4449);
        setIntField(term4448, term4448.getClass(), "bitCountPlusOne", 0);
        setIntField(term4448, term4448.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4448, term4448.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4448, term4448.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4445, term4445.getClass(), "denominator", term4448);
        term4450 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4451 = (int[]) newIntArray(4);
        setIntField(term4450, term4450.getClass(), "signum", 1);
        setIntElement(term4451, 0, 610795187);
        setIntElement(term4451, 1, 1979806705);
        setIntElement(term4451, 2, 1795089907);
        setIntElement(term4451, 3, 1645000889);
        setField(term4450, term4450.getClass(), "mag", term4451);
        setIntField(term4450, term4450.getClass(), "bitCountPlusOne", 0);
        setIntField(term4450, term4450.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4450, term4450.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4450, term4450.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        term4406 = newInstance(Class.forName("org.apache.commons.math.fraction.BigFraction"));
        Object term4407 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4409 = (int[]) newIntArray(8);
        Object term4422 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4424 = (int[]) newIntArray(4);
        setIntField(term4407, term4407.getClass(), "signum", 1);
        setIntElement(term4409, 0, 345827431);
        setIntElement(term4409, 1, -536397969);
        setIntElement(term4409, 2, -814973243);
        setIntElement(term4409, 3, 176835269);
        setIntElement(term4409, 4, 1342621972);
        setIntElement(term4409, 5, 2113810525);
        setIntElement(term4409, 6, -170071946);
        setIntElement(term4409, 7, -253866797);
        setField(term4407, term4407.getClass(), "mag", term4409);
        setIntField(term4407, term4407.getClass(), "bitCountPlusOne", 0);
        setIntField(term4407, term4407.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4407, term4407.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4407, term4407.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4406, term4406.getClass(), "numerator", term4407);
        setIntField(term4422, term4422.getClass(), "signum", 1);
        setIntElement(term4424, 0, -1863190589);
        setIntElement(term4424, 1, -1847873469);
        setIntElement(term4424, 2, 390017059);
        setIntElement(term4424, 3, -251162061);
        setField(term4422, term4422.getClass(), "mag", term4424);
        setIntField(term4422, term4422.getClass(), "bitCountPlusOne", 0);
        setIntField(term4422, term4422.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4422, term4422.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4422, term4422.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4406, term4406.getClass(), "denominator", term4422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.BigFraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigInteger");
        Object[] args = new Object[1];
        args[0] = term136;
        Object retValue = callMethod(klass, "add", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term4445));
        assertTrue(recursiveEquals(term136, term4450));
        assertTrue(recursiveEquals(retValue, term4406));
    }

};


