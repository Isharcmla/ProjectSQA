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

public class Dfp_init_186354659171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;
     Object term875;

    public Dfp_init_186354659171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75020 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term75019 = ((Class) term75020).getDeclaredField((String) "ROUND_HALF_UP");
        ((Field) term75019).setAccessible(true);
        Object enum157 = ((Field) term75019).get((Object) null);
        term809 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term811 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term812 = (int[]) newIntArray(1);
        Object term817 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term819 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term820 = (int[]) newIntArray(1);
        Object term825 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term828 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term832 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term836 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term837 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term841 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term845 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term849 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term850 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term854 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object term855 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term859 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term863 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term864 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object[] term869 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term870 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term871 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term872 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object[] term873 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        setIntField(term809, term809.getClass(), "radixDigits", -117576464);
        setIntElement(term812, 0, -1007160944);
        setField(term811, term811.getClass(), "mant", term812);
        setByteField(term811, term811.getClass(), "sign", (byte) -119);
        setIntField(term811, term811.getClass(), "exp", 1135664017);
        setByteField(term811, term811.getClass(), "nans", (byte) -66);
        setIntField(term817, term817.getClass(), "radixDigits", 590364439);
        setIntElement(term820, 0, 865208305);
        setField(term819, term819.getClass(), "mant", term820);
        setByteField(term819, term819.getClass(), "sign", (byte) 74);
        setIntField(term819, term819.getClass(), "exp", -1275173084);
        setByteField(term819, term819.getClass(), "nans", (byte) -71);
        setIntField(term825, term825.getClass(), "radixDigits", -244121226);
        setField(term825, term825.getClass(), "zero", null);
        setField(term825, term825.getClass(), "one", null);
        setField(term825, term825.getClass(), "two", null);
        setField(term825, term825.getClass(), "sqr2", null);
        setField(term825, term825.getClass(), "sqr2Split", null);
        setField(term825, term825.getClass(), "sqr2Reciprocal", term819);
        setField(term825, term825.getClass(), "sqr3", null);
        setField(term825, term825.getClass(), "sqr3Reciprocal", null);
        setField(term825, term825.getClass(), "pi", null);
        setField(term825, term825.getClass(), "piSplit", null);
        setField(term825, term825.getClass(), "e", term819);
        setField(term825, term825.getClass(), "eSplit", null);
        setField(term825, term825.getClass(), "ln2", null);
        setField(term825, term825.getClass(), "ln2Split", null);
        setField(term825, term825.getClass(), "ln5", null);
        setField(term825, term825.getClass(), "ln5Split", null);
        setField(term825, term825.getClass(), "ln10", term819);
        setField(term825, term825.getClass(), "rMode", null);
        setIntField(term825, term825.getClass(), "ieeeFlags", -1087774327);
        setField(term819, term819.getClass(), "field", term825);
        setField(term817, term817.getClass(), "zero", term819);
        setField(term828, term828.getClass(), "mant", null);
        setByteField(term828, term828.getClass(), "sign", (byte) 0);
        setIntField(term828, term828.getClass(), "exp", 0);
        setByteField(term828, term828.getClass(), "nans", (byte) 0);
        setField(term828, term828.getClass(), "field", null);
        setField(term817, term817.getClass(), "one", term828);
        setField(term817, term817.getClass(), "two", term819);
        setField(term832, term832.getClass(), "mant", null);
        setByteField(term832, term832.getClass(), "sign", (byte) 0);
        setIntField(term832, term832.getClass(), "exp", 0);
        setByteField(term832, term832.getClass(), "nans", (byte) 0);
        setField(term832, term832.getClass(), "field", null);
        setField(term817, term817.getClass(), "sqr2", term832);
        setField(term837, term837.getClass(), "mant", null);
        setByteField(term837, term837.getClass(), "sign", (byte) 0);
        setIntField(term837, term837.getClass(), "exp", 0);
        setByteField(term837, term837.getClass(), "nans", (byte) 0);
        setField(term837, term837.getClass(), "field", null);
        setElement(term836, 0, term837);
        setField(term817, term817.getClass(), "sqr2Split", term836);
        setField(term841, term841.getClass(), "mant", null);
        setByteField(term841, term841.getClass(), "sign", (byte) 0);
        setIntField(term841, term841.getClass(), "exp", 0);
        setByteField(term841, term841.getClass(), "nans", (byte) 0);
        setField(term841, term841.getClass(), "field", null);
        setField(term817, term817.getClass(), "sqr2Reciprocal", term841);
        setField(term817, term817.getClass(), "sqr3", term837);
        setField(term845, term845.getClass(), "mant", null);
        setByteField(term845, term845.getClass(), "sign", (byte) 0);
        setIntField(term845, term845.getClass(), "exp", 0);
        setByteField(term845, term845.getClass(), "nans", (byte) 0);
        setField(term845, term845.getClass(), "field", null);
        setField(term817, term817.getClass(), "sqr3Reciprocal", term845);
        setField(term817, term817.getClass(), "pi", term845);
        setField(term817, term817.getClass(), "piSplit", term849);
        setField(term850, term850.getClass(), "mant", null);
        setByteField(term850, term850.getClass(), "sign", (byte) 0);
        setIntField(term850, term850.getClass(), "exp", 0);
        setByteField(term850, term850.getClass(), "nans", (byte) 0);
        setField(term850, term850.getClass(), "field", null);
        setField(term817, term817.getClass(), "e", term850);
        setElement(term854, 0, term811);
        setElement(term854, 1, term811);
        setField(term855, term855.getClass(), "mant", null);
        setByteField(term855, term855.getClass(), "sign", (byte) -54);
        setIntField(term855, term855.getClass(), "exp", -73683645);
        setByteField(term855, term855.getClass(), "nans", (byte) 67);
        setField(term855, term855.getClass(), "field", null);
        setElement(term854, 2, term855);
        setElement(term854, 3, term819);
        setElement(term854, 4, term845);
        setElement(term854, 5, term819);
        setField(term859, term859.getClass(), "mant", null);
        setByteField(term859, term859.getClass(), "sign", (byte) 0);
        setIntField(term859, term859.getClass(), "exp", 0);
        setByteField(term859, term859.getClass(), "nans", (byte) 0);
        setField(term859, term859.getClass(), "field", null);
        setElement(term854, 6, term859);
        setElement(term854, 7, term850);
        setField(term817, term817.getClass(), "eSplit", term854);
        setField(term817, term817.getClass(), "ln2", term859);
        setField(term817, term817.getClass(), "ln2Split", term863);
        setField(term817, term817.getClass(), "ln5", term841);
        setField(term817, term817.getClass(), "ln5Split", term864);
        setField(term817, term817.getClass(), "ln10", term850);
        setField(term817, term817.getClass(), "rMode", enum157);
        setIntField(term817, term817.getClass(), "ieeeFlags", -1530420153);
        setField(term811, term811.getClass(), "field", term817);
        setField(term809, term809.getClass(), "zero", term811);
        setField(term809, term809.getClass(), "one", term832);
        setField(term809, term809.getClass(), "two", term841);
        setField(term809, term809.getClass(), "sqr2", term832);
        setElement(term869, 0, term837);
        setField(term809, term809.getClass(), "sqr2Split", term869);
        setField(term809, term809.getClass(), "sqr2Reciprocal", term832);
        setField(term809, term809.getClass(), "sqr3", term841);
        setField(term809, term809.getClass(), "sqr3Reciprocal", term855);
        setField(term809, term809.getClass(), "pi", term828);
        setElement(term870, 0, term845);
        setElement(term870, 1, term819);
        setElement(term870, 2, term837);
        setElement(term870, 3, term845);
        setElement(term870, 4, term855);
        setField(term809, term809.getClass(), "piSplit", term870);
        setField(term809, term809.getClass(), "e", term837);
        setElement(term871, 0, term832);
        setElement(term871, 1, term859);
        setElement(term871, 2, term832);
        setElement(term871, 3, term850);
        setField(term809, term809.getClass(), "eSplit", term871);
        setField(term809, term809.getClass(), "ln2", term828);
        setElement(term872, 0, term819);
        setElement(term872, 1, term841);
        setElement(term872, 2, term811);
        setElement(term872, 3, term828);
        setField(term809, term809.getClass(), "ln2Split", term872);
        setField(term809, term809.getClass(), "ln5", term859);
        setField(term809, term809.getClass(), "ln5Split", term873);
        setField(term809, term809.getClass(), "ln10", term859);
        setField(term809, term809.getClass(), "rMode", enum157);
        setIntField(term809, term809.getClass(), "ieeeFlags", -469968304);
        term875 = new Byte((byte) 78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.dfp.DfpField");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term809;
        args[1] = term875;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


