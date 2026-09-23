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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math3.dfp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Byte;

public class Dfp_newInstance_117797393879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5417;
     Object term5486;

    public Dfp_newInstance_117797393879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85389 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term85388 = ((Class) term85389).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term85388).setAccessible(true);
        Object enum180 = ((Field) term85388).get((Object) null);
        term5417 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5418 = (int[]) newIntArray(2);
        Object term5424 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5426 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term5427 = (int[]) newIntArray(7);
        Object term5438 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term5440 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5444 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5448 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5452 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object term5453 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term5457 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5461 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term5462 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term5463 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object[] term5464 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term5465 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5472 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term5473 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5477 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term5478 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object term5479 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term5483 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term5484 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        setIntElement(term5418, 0, -1022990421);
        setIntElement(term5418, 1, 1045547089);
        setField(term5417, term5417.getClass(), "mant", term5418);
        setByteField(term5417, term5417.getClass(), "sign", (byte) 96);
        setIntField(term5417, term5417.getClass(), "exp", -1122880881);
        setByteField(term5417, term5417.getClass(), "nans", (byte) 70);
        setIntField(term5424, term5424.getClass(), "radixDigits", -542712742);
        setIntElement(term5427, 0, -1254072822);
        setIntElement(term5427, 1, -1111249833);
        setIntElement(term5427, 2, -1692331299);
        setIntElement(term5427, 3, 479531250);
        setIntElement(term5427, 4, 1320570890);
        setIntElement(term5427, 5, -130649791);
        setIntElement(term5427, 6, 534834644);
        setField(term5426, term5426.getClass(), "mant", term5427);
        setByteField(term5426, term5426.getClass(), "sign", (byte) -46);
        setIntField(term5426, term5426.getClass(), "exp", 1959097203);
        setByteField(term5426, term5426.getClass(), "nans", (byte) -128);
        setIntField(term5438, term5438.getClass(), "radixDigits", -209654048);
        setField(term5440, term5440.getClass(), "mant", null);
        setByteField(term5440, term5440.getClass(), "sign", (byte) -112);
        setIntField(term5440, term5440.getClass(), "exp", 1460722225);
        setByteField(term5440, term5440.getClass(), "nans", (byte) 81);
        setField(term5440, term5440.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "zero", term5440);
        setField(term5444, term5444.getClass(), "mant", null);
        setByteField(term5444, term5444.getClass(), "sign", (byte) 0);
        setIntField(term5444, term5444.getClass(), "exp", 0);
        setByteField(term5444, term5444.getClass(), "nans", (byte) 0);
        setField(term5444, term5444.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "one", term5444);
        setField(term5448, term5448.getClass(), "mant", null);
        setByteField(term5448, term5448.getClass(), "sign", (byte) 0);
        setIntField(term5448, term5448.getClass(), "exp", 0);
        setByteField(term5448, term5448.getClass(), "nans", (byte) 0);
        setField(term5448, term5448.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "two", term5448);
        setField(term5438, term5438.getClass(), "sqr2", term5448);
        setField(term5438, term5438.getClass(), "sqr2Split", term5452);
        setField(term5438, term5438.getClass(), "sqr2Reciprocal", term5426);
        setField(term5453, term5453.getClass(), "mant", null);
        setByteField(term5453, term5453.getClass(), "sign", (byte) 0);
        setIntField(term5453, term5453.getClass(), "exp", 0);
        setByteField(term5453, term5453.getClass(), "nans", (byte) 0);
        setField(term5453, term5453.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "sqr3", term5453);
        setField(term5438, term5438.getClass(), "sqr3Reciprocal", term5448);
        setField(term5457, term5457.getClass(), "mant", null);
        setByteField(term5457, term5457.getClass(), "sign", (byte) 0);
        setIntField(term5457, term5457.getClass(), "exp", 0);
        setByteField(term5457, term5457.getClass(), "nans", (byte) 0);
        setField(term5457, term5457.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "pi", term5457);
        setElement(term5461, 1, term5426);
        setElement(term5461, 3, term5448);
        setElement(term5461, 4, term5426);
        setField(term5438, term5438.getClass(), "piSplit", term5461);
        setField(term5438, term5438.getClass(), "e", term5444);
        setElement(term5462, 0, term5457);
        setElement(term5462, 1, term5440);
        setElement(term5462, 2, term5426);
        setElement(term5462, 3, term5457);
        setField(term5438, term5438.getClass(), "eSplit", term5462);
        setField(term5438, term5438.getClass(), "ln2", term5453);
        setElement(term5463, 0, term5417);
        setElement(term5463, 6, term5457);
        setField(term5438, term5438.getClass(), "ln2Split", term5463);
        setField(term5438, term5438.getClass(), "ln5", term5440);
        setElement(term5464, 0, term5448);
        setElement(term5464, 1, term5453);
        setElement(term5464, 2, term5444);
        setElement(term5464, 3, term5426);
        setElement(term5464, 5, term5426);
        setElement(term5464, 6, term5457);
        setField(term5438, term5438.getClass(), "ln5Split", term5464);
        setField(term5465, term5465.getClass(), "mant", null);
        setByteField(term5465, term5465.getClass(), "sign", (byte) 0);
        setIntField(term5465, term5465.getClass(), "exp", 0);
        setByteField(term5465, term5465.getClass(), "nans", (byte) 0);
        setField(term5465, term5465.getClass(), "field", null);
        setField(term5438, term5438.getClass(), "ln10", term5465);
        setField(term5438, term5438.getClass(), "rMode", enum180);
        setIntField(term5438, term5438.getClass(), "ieeeFlags", 1008080511);
        setField(term5426, term5426.getClass(), "field", term5438);
        setField(term5424, term5424.getClass(), "zero", term5426);
        setField(term5424, term5424.getClass(), "one", term5444);
        setField(term5424, term5424.getClass(), "two", term5465);
        setField(term5424, term5424.getClass(), "sqr2", term5453);
        setElement(term5472, 0, term5453);
        setField(term5473, term5473.getClass(), "mant", null);
        setByteField(term5473, term5473.getClass(), "sign", (byte) 0);
        setIntField(term5473, term5473.getClass(), "exp", 0);
        setByteField(term5473, term5473.getClass(), "nans", (byte) 0);
        setField(term5473, term5473.getClass(), "field", null);
        setElement(term5472, 1, term5473);
        setElement(term5472, 2, term5417);
        setElement(term5472, 3, term5417);
        setElement(term5472, 4, term5440);
        setField(term5424, term5424.getClass(), "sqr2Split", term5472);
        setField(term5424, term5424.getClass(), "sqr2Reciprocal", term5426);
        setField(term5424, term5424.getClass(), "sqr3", term5453);
        setField(term5424, term5424.getClass(), "sqr3Reciprocal", term5426);
        setField(term5424, term5424.getClass(), "pi", term5448);
        setElement(term5477, 0, term5473);
        setElement(term5477, 1, term5448);
        setElement(term5477, 2, term5444);
        setElement(term5477, 3, term5473);
        setElement(term5477, 4, term5457);
        setElement(term5477, 5, term5444);
        setElement(term5477, 6, term5457);
        setElement(term5477, 7, term5465);
        setField(term5424, term5424.getClass(), "piSplit", term5477);
        setField(term5424, term5424.getClass(), "e", term5457);
        setElement(term5478, 0, term5444);
        setElement(term5478, 1, term5440);
        setField(term5479, term5479.getClass(), "mant", null);
        setByteField(term5479, term5479.getClass(), "sign", (byte) 0);
        setIntField(term5479, term5479.getClass(), "exp", 0);
        setByteField(term5479, term5479.getClass(), "nans", (byte) 0);
        setField(term5479, term5479.getClass(), "field", null);
        setElement(term5478, 2, term5479);
        setElement(term5478, 3, term5453);
        setElement(term5478, 4, term5426);
        setElement(term5478, 5, term5465);
        setElement(term5478, 6, term5453);
        setField(term5424, term5424.getClass(), "eSplit", term5478);
        setField(term5424, term5424.getClass(), "ln2", term5440);
        setElement(term5483, 0, term5465);
        setElement(term5483, 1, term5457);
        setElement(term5483, 2, term5448);
        setElement(term5483, 3, term5457);
        setElement(term5483, 4, term5473);
        setElement(term5483, 5, term5479);
        setElement(term5483, 6, term5426);
        setElement(term5483, 7, term5444);
        setField(term5424, term5424.getClass(), "ln2Split", term5483);
        setField(term5424, term5424.getClass(), "ln5", term5417);
        setElement(term5484, 0, term5479);
        setElement(term5484, 1, term5448);
        setElement(term5484, 2, term5448);
        setField(term5424, term5424.getClass(), "ln5Split", term5484);
        setField(term5424, term5424.getClass(), "ln10", term5417);
        setField(term5424, term5424.getClass(), "rMode", enum180);
        setIntField(term5424, term5424.getClass(), "ieeeFlags", 1935707624);
        setField(term5417, term5417.getClass(), "field", term5424);
        term5486 = new Byte((byte) -44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term5486;
        try {
            callMethod(klass, "newInstance", argTypes, term5417, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


