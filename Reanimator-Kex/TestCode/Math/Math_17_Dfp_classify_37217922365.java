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

public class Dfp_classify_37217922365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48477;

    public Dfp_classify_37217922365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48580 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term48579 = ((Class) term48580).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term48579).setAccessible(true);
        Object enum139 = ((Field) term48579).get((Object) null);
        Class<? extends Object> term48870 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term48869 = ((Class) term48870).getDeclaredField((String) "ROUND_UP");
        ((Field) term48869).setAccessible(true);
        Object enum140 = ((Field) term48869).get((Object) null);
        term48477 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term48478 = (int[]) newIntArray(8);
        Object term48490 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term48492 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term48493 = (int[]) newIntArray(7);
        Object term48504 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term48506 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term48510 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term48514 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48518 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term48519 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48523 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term48524 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term48525 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48529 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term48530 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48534 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term48538 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48542 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term48543 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term48547 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term48548 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term48549 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object[] term48550 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        setIntElement(term48478, 0, 962385185);
        setIntElement(term48478, 1, 2146718886);
        setIntElement(term48478, 2, -985577036);
        setIntElement(term48478, 3, 802539130);
        setIntElement(term48478, 4, 2105146188);
        setIntElement(term48478, 5, -862415480);
        setIntElement(term48478, 6, 312605349);
        setIntElement(term48478, 7, -402072606);
        setField(term48477, term48477.getClass(), "mant", term48478);
        setByteField(term48477, term48477.getClass(), "sign", (byte) 61);
        setIntField(term48477, term48477.getClass(), "exp", -477355193);
        setByteField(term48477, term48477.getClass(), "nans", (byte) -45);
        setIntField(term48490, term48490.getClass(), "radixDigits", 168425089);
        setIntElement(term48493, 0, -571931590);
        setIntElement(term48493, 1, 37757400);
        setIntElement(term48493, 2, -1632221612);
        setIntElement(term48493, 3, 1545314376);
        setIntElement(term48493, 4, 437959151);
        setIntElement(term48493, 5, 27780241);
        setIntElement(term48493, 6, -683868408);
        setField(term48492, term48492.getClass(), "mant", term48493);
        setByteField(term48492, term48492.getClass(), "sign", (byte) 52);
        setIntField(term48492, term48492.getClass(), "exp", -381130069);
        setByteField(term48492, term48492.getClass(), "nans", (byte) -56);
        setIntField(term48504, term48504.getClass(), "radixDigits", 885769749);
        setField(term48506, term48506.getClass(), "mant", null);
        setByteField(term48506, term48506.getClass(), "sign", (byte) -26);
        setIntField(term48506, term48506.getClass(), "exp", 994300935);
        setByteField(term48506, term48506.getClass(), "nans", (byte) 11);
        setField(term48506, term48506.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "zero", term48506);
        setField(term48510, term48510.getClass(), "mant", null);
        setByteField(term48510, term48510.getClass(), "sign", (byte) 0);
        setIntField(term48510, term48510.getClass(), "exp", 0);
        setByteField(term48510, term48510.getClass(), "nans", (byte) 0);
        setField(term48510, term48510.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "one", term48510);
        setField(term48514, term48514.getClass(), "mant", null);
        setByteField(term48514, term48514.getClass(), "sign", (byte) 0);
        setIntField(term48514, term48514.getClass(), "exp", 0);
        setByteField(term48514, term48514.getClass(), "nans", (byte) 0);
        setField(term48514, term48514.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "two", term48514);
        setField(term48504, term48504.getClass(), "sqr2", term48514);
        setElement(term48518, 2, term48492);
        setElement(term48518, 4, term48514);
        setField(term48504, term48504.getClass(), "sqr2Split", term48518);
        setField(term48504, term48504.getClass(), "sqr2Reciprocal", term48492);
        setField(term48519, term48519.getClass(), "mant", null);
        setByteField(term48519, term48519.getClass(), "sign", (byte) 0);
        setIntField(term48519, term48519.getClass(), "exp", 0);
        setByteField(term48519, term48519.getClass(), "nans", (byte) 0);
        setField(term48519, term48519.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "sqr3", term48519);
        setField(term48504, term48504.getClass(), "sqr3Reciprocal", term48514);
        setField(term48504, term48504.getClass(), "pi", term48492);
        setField(term48504, term48504.getClass(), "piSplit", term48523);
        setField(term48504, term48504.getClass(), "e", term48510);
        setElement(term48524, 1, term48506);
        setElement(term48524, 2, term48492);
        setField(term48504, term48504.getClass(), "eSplit", term48524);
        setField(term48525, term48525.getClass(), "mant", null);
        setByteField(term48525, term48525.getClass(), "sign", (byte) 0);
        setIntField(term48525, term48525.getClass(), "exp", 0);
        setByteField(term48525, term48525.getClass(), "nans", (byte) 0);
        setField(term48525, term48525.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "ln2", term48525);
        setElement(term48529, 0, term48477);
        setElement(term48529, 3, term48519);
        setField(term48504, term48504.getClass(), "ln2Split", term48529);
        setField(term48530, term48530.getClass(), "mant", null);
        setByteField(term48530, term48530.getClass(), "sign", (byte) 0);
        setIntField(term48530, term48530.getClass(), "exp", 0);
        setByteField(term48530, term48530.getClass(), "nans", (byte) 0);
        setField(term48530, term48530.getClass(), "field", null);
        setField(term48504, term48504.getClass(), "ln5", term48530);
        setElement(term48534, 1, term48506);
        setElement(term48534, 2, term48514);
        setElement(term48534, 3, term48525);
        setElement(term48534, 4, term48510);
        setElement(term48534, 5, term48492);
        setElement(term48534, 6, term48530);
        setField(term48504, term48504.getClass(), "ln5Split", term48534);
        setField(term48504, term48504.getClass(), "ln10", term48492);
        setField(term48504, term48504.getClass(), "rMode", enum139);
        setIntField(term48504, term48504.getClass(), "ieeeFlags", 1890582085);
        setField(term48492, term48492.getClass(), "field", term48504);
        setField(term48490, term48490.getClass(), "zero", term48492);
        setField(term48538, term48538.getClass(), "mant", null);
        setByteField(term48538, term48538.getClass(), "sign", (byte) 0);
        setIntField(term48538, term48538.getClass(), "exp", 0);
        setByteField(term48538, term48538.getClass(), "nans", (byte) 0);
        setField(term48538, term48538.getClass(), "field", null);
        setField(term48490, term48490.getClass(), "one", term48538);
        setField(term48490, term48490.getClass(), "two", term48519);
        setField(term48490, term48490.getClass(), "sqr2", term48510);
        setElement(term48542, 0, term48519);
        setElement(term48542, 1, term48525);
        setElement(term48542, 2, term48525);
        setField(term48543, term48543.getClass(), "mant", null);
        setByteField(term48543, term48543.getClass(), "sign", (byte) 0);
        setIntField(term48543, term48543.getClass(), "exp", 0);
        setByteField(term48543, term48543.getClass(), "nans", (byte) 0);
        setField(term48543, term48543.getClass(), "field", null);
        setElement(term48542, 3, term48543);
        setField(term48490, term48490.getClass(), "sqr2Split", term48542);
        setField(term48490, term48490.getClass(), "sqr2Reciprocal", term48477);
        setField(term48490, term48490.getClass(), "sqr3", term48477);
        setField(term48490, term48490.getClass(), "sqr3Reciprocal", term48506);
        setField(term48490, term48490.getClass(), "pi", term48492);
        setField(term48490, term48490.getClass(), "piSplit", term48547);
        setField(term48490, term48490.getClass(), "e", term48525);
        setElement(term48548, 0, term48492);
        setField(term48490, term48490.getClass(), "eSplit", term48548);
        setField(term48490, term48490.getClass(), "ln2", term48514);
        setElement(term48549, 0, term48543);
        setElement(term48549, 1, term48514);
        setElement(term48549, 2, term48510);
        setElement(term48549, 3, term48543);
        setElement(term48549, 4, term48538);
        setElement(term48549, 5, term48510);
        setElement(term48549, 6, term48538);
        setField(term48490, term48490.getClass(), "ln2Split", term48549);
        setField(term48490, term48490.getClass(), "ln5", term48519);
        setField(term48490, term48490.getClass(), "ln5Split", term48550);
        setField(term48490, term48490.getClass(), "ln10", term48538);
        setField(term48490, term48490.getClass(), "rMode", enum140);
        setIntField(term48490, term48490.getClass(), "ieeeFlags", 2146568808);
        setField(term48477, term48477.getClass(), "field", term48490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classify", argTypes, term48477, args);
    }

};


