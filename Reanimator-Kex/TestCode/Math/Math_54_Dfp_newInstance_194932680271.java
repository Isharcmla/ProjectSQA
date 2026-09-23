package org.apache.commons.math.dfp;

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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Byte;

public class Dfp_newInstance_194932680271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5342;
     Object term5411;

    public Dfp_newInstance_194932680271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79950 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term79949 = ((Class) term79950).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term79949).setAccessible(true);
        Object enum167 = ((Field) term79949).get((Object) null);
        term5342 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term5343 = (int[]) newIntArray(2);
        Object term5349 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term5351 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term5352 = (int[]) newIntArray(7);
        Object term5363 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term5365 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5369 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5373 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5377 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 2);
        Object term5378 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term5382 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5386 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term5387 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term5388 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object[] term5389 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term5390 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5397 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object term5398 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5402 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term5403 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 7);
        Object term5404 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term5408 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object[] term5409 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 3);
        setIntElement(term5343, 0, -1022990421);
        setIntElement(term5343, 1, 1045547089);
        setField(term5342, term5342.getClass(), "mant", term5343);
        setByteField(term5342, term5342.getClass(), "sign", (byte) 96);
        setIntField(term5342, term5342.getClass(), "exp", -1122880881);
        setByteField(term5342, term5342.getClass(), "nans", (byte) 70);
        setIntField(term5349, term5349.getClass(), "radixDigits", -542712742);
        setIntElement(term5352, 0, -1254072822);
        setIntElement(term5352, 1, -1111249833);
        setIntElement(term5352, 2, -1692331299);
        setIntElement(term5352, 3, 479531250);
        setIntElement(term5352, 4, 1320570890);
        setIntElement(term5352, 5, -130649791);
        setIntElement(term5352, 6, 534834644);
        setField(term5351, term5351.getClass(), "mant", term5352);
        setByteField(term5351, term5351.getClass(), "sign", (byte) -46);
        setIntField(term5351, term5351.getClass(), "exp", 1959097203);
        setByteField(term5351, term5351.getClass(), "nans", (byte) -128);
        setIntField(term5363, term5363.getClass(), "radixDigits", -209654048);
        setField(term5365, term5365.getClass(), "mant", null);
        setByteField(term5365, term5365.getClass(), "sign", (byte) -112);
        setIntField(term5365, term5365.getClass(), "exp", 1460722225);
        setByteField(term5365, term5365.getClass(), "nans", (byte) 81);
        setField(term5365, term5365.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "zero", term5365);
        setField(term5369, term5369.getClass(), "mant", null);
        setByteField(term5369, term5369.getClass(), "sign", (byte) 0);
        setIntField(term5369, term5369.getClass(), "exp", 0);
        setByteField(term5369, term5369.getClass(), "nans", (byte) 0);
        setField(term5369, term5369.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "one", term5369);
        setField(term5373, term5373.getClass(), "mant", null);
        setByteField(term5373, term5373.getClass(), "sign", (byte) 0);
        setIntField(term5373, term5373.getClass(), "exp", 0);
        setByteField(term5373, term5373.getClass(), "nans", (byte) 0);
        setField(term5373, term5373.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "two", term5373);
        setField(term5363, term5363.getClass(), "sqr2", term5373);
        setField(term5363, term5363.getClass(), "sqr2Split", term5377);
        setField(term5363, term5363.getClass(), "sqr2Reciprocal", term5351);
        setField(term5378, term5378.getClass(), "mant", null);
        setByteField(term5378, term5378.getClass(), "sign", (byte) 0);
        setIntField(term5378, term5378.getClass(), "exp", 0);
        setByteField(term5378, term5378.getClass(), "nans", (byte) 0);
        setField(term5378, term5378.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "sqr3", term5378);
        setField(term5363, term5363.getClass(), "sqr3Reciprocal", term5373);
        setField(term5382, term5382.getClass(), "mant", null);
        setByteField(term5382, term5382.getClass(), "sign", (byte) 0);
        setIntField(term5382, term5382.getClass(), "exp", 0);
        setByteField(term5382, term5382.getClass(), "nans", (byte) 0);
        setField(term5382, term5382.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "pi", term5382);
        setElement(term5386, 1, term5351);
        setElement(term5386, 3, term5373);
        setElement(term5386, 4, term5351);
        setField(term5363, term5363.getClass(), "piSplit", term5386);
        setField(term5363, term5363.getClass(), "e", term5369);
        setElement(term5387, 0, term5382);
        setElement(term5387, 1, term5365);
        setElement(term5387, 2, term5351);
        setElement(term5387, 3, term5382);
        setField(term5363, term5363.getClass(), "eSplit", term5387);
        setField(term5363, term5363.getClass(), "ln2", term5378);
        setElement(term5388, 0, term5342);
        setElement(term5388, 6, term5382);
        setField(term5363, term5363.getClass(), "ln2Split", term5388);
        setField(term5363, term5363.getClass(), "ln5", term5365);
        setElement(term5389, 0, term5373);
        setElement(term5389, 1, term5378);
        setElement(term5389, 2, term5369);
        setElement(term5389, 3, term5351);
        setElement(term5389, 5, term5351);
        setElement(term5389, 6, term5382);
        setField(term5363, term5363.getClass(), "ln5Split", term5389);
        setField(term5390, term5390.getClass(), "mant", null);
        setByteField(term5390, term5390.getClass(), "sign", (byte) 0);
        setIntField(term5390, term5390.getClass(), "exp", 0);
        setByteField(term5390, term5390.getClass(), "nans", (byte) 0);
        setField(term5390, term5390.getClass(), "field", null);
        setField(term5363, term5363.getClass(), "ln10", term5390);
        setField(term5363, term5363.getClass(), "rMode", enum167);
        setIntField(term5363, term5363.getClass(), "ieeeFlags", 1008080511);
        setField(term5351, term5351.getClass(), "field", term5363);
        setField(term5349, term5349.getClass(), "zero", term5351);
        setField(term5349, term5349.getClass(), "one", term5369);
        setField(term5349, term5349.getClass(), "two", term5390);
        setField(term5349, term5349.getClass(), "sqr2", term5378);
        setElement(term5397, 0, term5378);
        setField(term5398, term5398.getClass(), "mant", null);
        setByteField(term5398, term5398.getClass(), "sign", (byte) 0);
        setIntField(term5398, term5398.getClass(), "exp", 0);
        setByteField(term5398, term5398.getClass(), "nans", (byte) 0);
        setField(term5398, term5398.getClass(), "field", null);
        setElement(term5397, 1, term5398);
        setElement(term5397, 2, term5342);
        setElement(term5397, 3, term5342);
        setElement(term5397, 4, term5365);
        setField(term5349, term5349.getClass(), "sqr2Split", term5397);
        setField(term5349, term5349.getClass(), "sqr2Reciprocal", term5351);
        setField(term5349, term5349.getClass(), "sqr3", term5378);
        setField(term5349, term5349.getClass(), "sqr3Reciprocal", term5351);
        setField(term5349, term5349.getClass(), "pi", term5373);
        setElement(term5402, 0, term5398);
        setElement(term5402, 1, term5373);
        setElement(term5402, 2, term5369);
        setElement(term5402, 3, term5398);
        setElement(term5402, 4, term5382);
        setElement(term5402, 5, term5369);
        setElement(term5402, 6, term5382);
        setElement(term5402, 7, term5390);
        setField(term5349, term5349.getClass(), "piSplit", term5402);
        setField(term5349, term5349.getClass(), "e", term5382);
        setElement(term5403, 0, term5369);
        setElement(term5403, 1, term5365);
        setField(term5404, term5404.getClass(), "mant", null);
        setByteField(term5404, term5404.getClass(), "sign", (byte) 0);
        setIntField(term5404, term5404.getClass(), "exp", 0);
        setByteField(term5404, term5404.getClass(), "nans", (byte) 0);
        setField(term5404, term5404.getClass(), "field", null);
        setElement(term5403, 2, term5404);
        setElement(term5403, 3, term5378);
        setElement(term5403, 4, term5351);
        setElement(term5403, 5, term5390);
        setElement(term5403, 6, term5378);
        setField(term5349, term5349.getClass(), "eSplit", term5403);
        setField(term5349, term5349.getClass(), "ln2", term5365);
        setElement(term5408, 0, term5390);
        setElement(term5408, 1, term5382);
        setElement(term5408, 2, term5373);
        setElement(term5408, 3, term5382);
        setElement(term5408, 4, term5398);
        setElement(term5408, 5, term5404);
        setElement(term5408, 6, term5351);
        setElement(term5408, 7, term5369);
        setField(term5349, term5349.getClass(), "ln2Split", term5408);
        setField(term5349, term5349.getClass(), "ln5", term5342);
        setElement(term5409, 0, term5404);
        setElement(term5409, 1, term5373);
        setElement(term5409, 2, term5373);
        setField(term5349, term5349.getClass(), "ln5Split", term5409);
        setField(term5349, term5349.getClass(), "ln10", term5342);
        setField(term5349, term5349.getClass(), "rMode", enum167);
        setIntField(term5349, term5349.getClass(), "ieeeFlags", 1935707624);
        setField(term5342, term5342.getClass(), "field", term5349);
        term5411 = new Byte((byte) -44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term5411;
        try {
            callMethod(klass, "newInstance", argTypes, term5342, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


