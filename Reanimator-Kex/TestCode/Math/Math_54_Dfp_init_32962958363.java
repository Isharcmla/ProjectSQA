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

public class Dfp_init_32962958363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799;
     Object term865;

    public Dfp_init_32962958363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69708 = Class.forName((String) "org.apache.commons.math.dfp.DfpField$RoundingMode");
        Field term69707 = ((Class) term69708).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term69707).setAccessible(true);
        Object enum144 = ((Field) term69707).get((Object) null);
        term799 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term801 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term802 = (int[]) newIntArray(1);
        Object term807 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term809 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        int[] term810 = (int[]) newIntArray(1);
        Object term815 = newInstance(Class.forName("org.apache.commons.math.dfp.DfpField"));
        Object term818 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term822 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term826 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object term827 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term831 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term835 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term839 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object term840 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term844 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 8);
        Object term845 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object term849 = newInstance(Class.forName("org.apache.commons.math.dfp.Dfp"));
        Object[] term853 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term854 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        Object[] term859 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 1);
        Object[] term860 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 5);
        Object[] term861 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term862 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 4);
        Object[] term863 = (Object[]) newArray("org.apache.commons.math.dfp.Dfp", 0);
        setIntField(term799, term799.getClass(), "radixDigits", -117576464);
        setIntElement(term802, 0, -1007160944);
        setField(term801, term801.getClass(), "mant", term802);
        setByteField(term801, term801.getClass(), "sign", (byte) -119);
        setIntField(term801, term801.getClass(), "exp", 1135664017);
        setByteField(term801, term801.getClass(), "nans", (byte) -66);
        setIntField(term807, term807.getClass(), "radixDigits", 590364439);
        setIntElement(term810, 0, 865208305);
        setField(term809, term809.getClass(), "mant", term810);
        setByteField(term809, term809.getClass(), "sign", (byte) 74);
        setIntField(term809, term809.getClass(), "exp", -1275173084);
        setByteField(term809, term809.getClass(), "nans", (byte) -71);
        setIntField(term815, term815.getClass(), "radixDigits", -244121226);
        setField(term815, term815.getClass(), "zero", null);
        setField(term815, term815.getClass(), "one", null);
        setField(term815, term815.getClass(), "two", null);
        setField(term815, term815.getClass(), "sqr2", null);
        setField(term815, term815.getClass(), "sqr2Split", null);
        setField(term815, term815.getClass(), "sqr2Reciprocal", term809);
        setField(term815, term815.getClass(), "sqr3", null);
        setField(term815, term815.getClass(), "sqr3Reciprocal", null);
        setField(term815, term815.getClass(), "pi", null);
        setField(term815, term815.getClass(), "piSplit", null);
        setField(term815, term815.getClass(), "e", term809);
        setField(term815, term815.getClass(), "eSplit", null);
        setField(term815, term815.getClass(), "ln2", null);
        setField(term815, term815.getClass(), "ln2Split", null);
        setField(term815, term815.getClass(), "ln5", null);
        setField(term815, term815.getClass(), "ln5Split", null);
        setField(term815, term815.getClass(), "ln10", term809);
        setField(term815, term815.getClass(), "rMode", null);
        setIntField(term815, term815.getClass(), "ieeeFlags", -1087774327);
        setField(term809, term809.getClass(), "field", term815);
        setField(term807, term807.getClass(), "zero", term809);
        setField(term818, term818.getClass(), "mant", null);
        setByteField(term818, term818.getClass(), "sign", (byte) 0);
        setIntField(term818, term818.getClass(), "exp", 0);
        setByteField(term818, term818.getClass(), "nans", (byte) 0);
        setField(term818, term818.getClass(), "field", null);
        setField(term807, term807.getClass(), "one", term818);
        setField(term807, term807.getClass(), "two", term809);
        setField(term822, term822.getClass(), "mant", null);
        setByteField(term822, term822.getClass(), "sign", (byte) 0);
        setIntField(term822, term822.getClass(), "exp", 0);
        setByteField(term822, term822.getClass(), "nans", (byte) 0);
        setField(term822, term822.getClass(), "field", null);
        setField(term807, term807.getClass(), "sqr2", term822);
        setField(term827, term827.getClass(), "mant", null);
        setByteField(term827, term827.getClass(), "sign", (byte) 0);
        setIntField(term827, term827.getClass(), "exp", 0);
        setByteField(term827, term827.getClass(), "nans", (byte) 0);
        setField(term827, term827.getClass(), "field", null);
        setElement(term826, 0, term827);
        setField(term807, term807.getClass(), "sqr2Split", term826);
        setField(term831, term831.getClass(), "mant", null);
        setByteField(term831, term831.getClass(), "sign", (byte) 0);
        setIntField(term831, term831.getClass(), "exp", 0);
        setByteField(term831, term831.getClass(), "nans", (byte) 0);
        setField(term831, term831.getClass(), "field", null);
        setField(term807, term807.getClass(), "sqr2Reciprocal", term831);
        setField(term807, term807.getClass(), "sqr3", term827);
        setField(term835, term835.getClass(), "mant", null);
        setByteField(term835, term835.getClass(), "sign", (byte) 0);
        setIntField(term835, term835.getClass(), "exp", 0);
        setByteField(term835, term835.getClass(), "nans", (byte) 0);
        setField(term835, term835.getClass(), "field", null);
        setField(term807, term807.getClass(), "sqr3Reciprocal", term835);
        setField(term807, term807.getClass(), "pi", term835);
        setField(term807, term807.getClass(), "piSplit", term839);
        setField(term840, term840.getClass(), "mant", null);
        setByteField(term840, term840.getClass(), "sign", (byte) 0);
        setIntField(term840, term840.getClass(), "exp", 0);
        setByteField(term840, term840.getClass(), "nans", (byte) 0);
        setField(term840, term840.getClass(), "field", null);
        setField(term807, term807.getClass(), "e", term840);
        setElement(term844, 0, term801);
        setElement(term844, 1, term801);
        setField(term845, term845.getClass(), "mant", null);
        setByteField(term845, term845.getClass(), "sign", (byte) -54);
        setIntField(term845, term845.getClass(), "exp", -73683645);
        setByteField(term845, term845.getClass(), "nans", (byte) 67);
        setField(term845, term845.getClass(), "field", null);
        setElement(term844, 2, term845);
        setElement(term844, 3, term809);
        setElement(term844, 4, term835);
        setElement(term844, 5, term809);
        setField(term849, term849.getClass(), "mant", null);
        setByteField(term849, term849.getClass(), "sign", (byte) 0);
        setIntField(term849, term849.getClass(), "exp", 0);
        setByteField(term849, term849.getClass(), "nans", (byte) 0);
        setField(term849, term849.getClass(), "field", null);
        setElement(term844, 6, term849);
        setElement(term844, 7, term840);
        setField(term807, term807.getClass(), "eSplit", term844);
        setField(term807, term807.getClass(), "ln2", term849);
        setField(term807, term807.getClass(), "ln2Split", term853);
        setField(term807, term807.getClass(), "ln5", term831);
        setField(term807, term807.getClass(), "ln5Split", term854);
        setField(term807, term807.getClass(), "ln10", term840);
        setField(term807, term807.getClass(), "rMode", enum144);
        setIntField(term807, term807.getClass(), "ieeeFlags", -1530420153);
        setField(term801, term801.getClass(), "field", term807);
        setField(term799, term799.getClass(), "zero", term801);
        setField(term799, term799.getClass(), "one", term822);
        setField(term799, term799.getClass(), "two", term831);
        setField(term799, term799.getClass(), "sqr2", term822);
        setElement(term859, 0, term827);
        setField(term799, term799.getClass(), "sqr2Split", term859);
        setField(term799, term799.getClass(), "sqr2Reciprocal", term822);
        setField(term799, term799.getClass(), "sqr3", term831);
        setField(term799, term799.getClass(), "sqr3Reciprocal", term845);
        setField(term799, term799.getClass(), "pi", term818);
        setElement(term860, 0, term835);
        setElement(term860, 1, term809);
        setElement(term860, 2, term827);
        setElement(term860, 3, term835);
        setElement(term860, 4, term845);
        setField(term799, term799.getClass(), "piSplit", term860);
        setField(term799, term799.getClass(), "e", term827);
        setElement(term861, 0, term822);
        setElement(term861, 1, term849);
        setElement(term861, 2, term822);
        setElement(term861, 3, term840);
        setField(term799, term799.getClass(), "eSplit", term861);
        setField(term799, term799.getClass(), "ln2", term818);
        setElement(term862, 0, term809);
        setElement(term862, 1, term831);
        setElement(term862, 2, term801);
        setElement(term862, 3, term818);
        setField(term799, term799.getClass(), "ln2Split", term862);
        setField(term799, term799.getClass(), "ln5", term849);
        setField(term799, term799.getClass(), "ln5Split", term863);
        setField(term799, term799.getClass(), "ln10", term849);
        setField(term799, term799.getClass(), "rMode", enum144);
        setIntField(term799, term799.getClass(), "ieeeFlags", -469968304);
        term865 = new Byte((byte) 78);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.dfp.DfpField");
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term799;
        args[1] = term865;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


