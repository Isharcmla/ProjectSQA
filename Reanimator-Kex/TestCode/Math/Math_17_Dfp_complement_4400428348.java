package org.apache.commons.math3.dfp;

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
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Dfp_complement_4400428348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33427;
     Object term33505;

    public Dfp_complement_4400428348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33518 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term33517 = ((Class) term33518).getDeclaredField((String) "ROUND_HALF_DOWN");
        ((Field) term33517).setAccessible(true);
        Object enum96 = ((Field) term33517).get((Object) null);
        Class<? extends Object> term33820 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term33819 = ((Class) term33820).getDeclaredField((String) "ROUND_UP");
        ((Field) term33819).setAccessible(true);
        Object enum97 = ((Field) term33819).get((Object) null);
        term33427 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term33428 = (int[]) newIntArray(1);
        Object term33433 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term33435 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term33436 = (int[]) newIntArray(9);
        Object term33449 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term33451 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term33455 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term33459 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term33463 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term33464 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term33468 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term33472 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term33473 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term33477 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term33478 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term33479 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term33483 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term33484 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term33488 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term33489 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term33490 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term33491 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        setIntElement(term33428, 0, -147055177);
        setField(term33427, term33427.getClass(), "mant", term33428);
        setByteField(term33427, term33427.getClass(), "sign", (byte) -40);
        setIntField(term33427, term33427.getClass(), "exp", 1979044375);
        setByteField(term33427, term33427.getClass(), "nans", (byte) 79);
        setIntField(term33433, term33433.getClass(), "radixDigits", 961252909);
        setIntElement(term33436, 0, 1455842357);
        setIntElement(term33436, 1, 1349806561);
        setIntElement(term33436, 2, 923905351);
        setIntElement(term33436, 3, 428360161);
        setIntElement(term33436, 4, 631528579);
        setIntElement(term33436, 5, -1652091834);
        setIntElement(term33436, 6, -282021579);
        setIntElement(term33436, 7, -1652588127);
        setIntElement(term33436, 8, -1902823385);
        setField(term33435, term33435.getClass(), "mant", term33436);
        setByteField(term33435, term33435.getClass(), "sign", (byte) 55);
        setIntField(term33435, term33435.getClass(), "exp", -784924879);
        setByteField(term33435, term33435.getClass(), "nans", (byte) -63);
        setIntField(term33449, term33449.getClass(), "radixDigits", -1062027102);
        setField(term33451, term33451.getClass(), "mant", null);
        setByteField(term33451, term33451.getClass(), "sign", (byte) -87);
        setIntField(term33451, term33451.getClass(), "exp", -2017073245);
        setByteField(term33451, term33451.getClass(), "nans", (byte) 108);
        setField(term33451, term33451.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "zero", term33451);
        setField(term33449, term33449.getClass(), "one", term33435);
        setField(term33455, term33455.getClass(), "mant", null);
        setByteField(term33455, term33455.getClass(), "sign", (byte) 0);
        setIntField(term33455, term33455.getClass(), "exp", 0);
        setByteField(term33455, term33455.getClass(), "nans", (byte) 0);
        setField(term33455, term33455.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "two", term33455);
        setField(term33459, term33459.getClass(), "mant", null);
        setByteField(term33459, term33459.getClass(), "sign", (byte) 0);
        setIntField(term33459, term33459.getClass(), "exp", 0);
        setByteField(term33459, term33459.getClass(), "nans", (byte) 0);
        setField(term33459, term33459.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "sqr2", term33459);
        setElement(term33463, 2, term33435);
        setField(term33449, term33449.getClass(), "sqr2Split", term33463);
        setField(term33449, term33449.getClass(), "sqr2Reciprocal", term33459);
        setField(term33449, term33449.getClass(), "sqr3", term33435);
        setField(term33464, term33464.getClass(), "mant", null);
        setByteField(term33464, term33464.getClass(), "sign", (byte) 0);
        setIntField(term33464, term33464.getClass(), "exp", 0);
        setByteField(term33464, term33464.getClass(), "nans", (byte) 0);
        setField(term33464, term33464.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "sqr3Reciprocal", term33464);
        setField(term33468, term33468.getClass(), "mant", null);
        setByteField(term33468, term33468.getClass(), "sign", (byte) 0);
        setIntField(term33468, term33468.getClass(), "exp", 0);
        setByteField(term33468, term33468.getClass(), "nans", (byte) 0);
        setField(term33468, term33468.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "pi", term33468);
        setElement(term33472, 0, term33451);
        setElement(term33472, 1, term33435);
        setElement(term33472, 2, term33468);
        setElement(term33472, 3, term33455);
        setElement(term33472, 4, term33427);
        setField(term33449, term33449.getClass(), "piSplit", term33472);
        setField(term33473, term33473.getClass(), "mant", null);
        setByteField(term33473, term33473.getClass(), "sign", (byte) 0);
        setIntField(term33473, term33473.getClass(), "exp", 0);
        setByteField(term33473, term33473.getClass(), "nans", (byte) 0);
        setField(term33473, term33473.getClass(), "field", null);
        setField(term33449, term33449.getClass(), "e", term33473);
        setElement(term33477, 2, term33468);
        setElement(term33477, 3, term33451);
        setField(term33449, term33449.getClass(), "eSplit", term33477);
        setField(term33449, term33449.getClass(), "ln2", term33459);
        setField(term33449, term33449.getClass(), "ln2Split", term33478);
        setField(term33449, term33449.getClass(), "ln5", term33455);
        setElement(term33479, 0, term33464);
        setElement(term33479, 1, term33435);
        setElement(term33479, 3, term33435);
        setField(term33449, term33449.getClass(), "ln5Split", term33479);
        setField(term33449, term33449.getClass(), "ln10", term33468);
        setField(term33449, term33449.getClass(), "rMode", enum96);
        setIntField(term33449, term33449.getClass(), "ieeeFlags", 82353584);
        setField(term33435, term33435.getClass(), "field", term33449);
        setField(term33433, term33433.getClass(), "zero", term33435);
        setField(term33433, term33433.getClass(), "one", term33473);
        setField(term33433, term33433.getClass(), "two", term33464);
        setField(term33433, term33433.getClass(), "sqr2", term33473);
        setElement(term33483, 0, term33455);
        setElement(term33483, 1, term33455);
        setField(term33484, term33484.getClass(), "mant", null);
        setByteField(term33484, term33484.getClass(), "sign", (byte) 0);
        setIntField(term33484, term33484.getClass(), "exp", 0);
        setByteField(term33484, term33484.getClass(), "nans", (byte) 0);
        setField(term33484, term33484.getClass(), "field", null);
        setElement(term33483, 2, term33484);
        setField(term33433, term33433.getClass(), "sqr2Split", term33483);
        setField(term33433, term33433.getClass(), "sqr2Reciprocal", term33427);
        setField(term33433, term33433.getClass(), "sqr3", term33427);
        setField(term33433, term33433.getClass(), "sqr3Reciprocal", term33451);
        setField(term33433, term33433.getClass(), "pi", term33435);
        setField(term33433, term33433.getClass(), "piSplit", term33488);
        setField(term33433, term33433.getClass(), "e", term33455);
        setField(term33433, term33433.getClass(), "eSplit", term33489);
        setField(term33433, term33433.getClass(), "ln2", term33435);
        setElement(term33490, 0, term33459);
        setElement(term33490, 1, term33484);
        setElement(term33490, 2, term33459);
        setField(term33433, term33433.getClass(), "ln2Split", term33490);
        setField(term33433, term33433.getClass(), "ln5", term33464);
        setElement(term33491, 0, term33484);
        setElement(term33491, 1, term33468);
        setElement(term33491, 2, term33464);
        setElement(term33491, 3, term33468);
        setElement(term33491, 4, term33473);
        setElement(term33491, 5, term33468);
        setElement(term33491, 6, term33464);
        setField(term33433, term33433.getClass(), "ln5Split", term33491);
        setField(term33433, term33433.getClass(), "ln10", term33451);
        setField(term33433, term33433.getClass(), "rMode", enum97);
        setIntField(term33433, term33433.getClass(), "ieeeFlags", -758778797);
        setField(term33427, term33427.getClass(), "field", term33433);
        term33505 = new Integer(765680355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33505;
        callMethod(klass, "complement", argTypes, term33427, args);
    }

};


