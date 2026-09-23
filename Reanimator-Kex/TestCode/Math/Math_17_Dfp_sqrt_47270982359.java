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

public class Dfp_sqrt_47270982359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42811;

    public Dfp_sqrt_47270982359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42903 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term42902 = ((Class) term42903).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term42902).setAccessible(true);
        Object enum123 = ((Field) term42902).get((Object) null);
        Class<? extends Object> term43190 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term43189 = ((Class) term43190).getDeclaredField((String) "ROUND_HALF_EVEN");
        ((Field) term43189).setAccessible(true);
        Object enum124 = ((Field) term43189).get((Object) null);
        term42811 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term42812 = (int[]) newIntArray(0);
        Object term42816 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term42818 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term42819 = (int[]) newIntArray(6);
        Object term42829 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term42831 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term42835 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term42839 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term42843 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object term42844 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term42848 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term42852 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object[] term42853 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 2);
        Object[] term42854 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term42855 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 0);
        Object term42859 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term42863 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term42864 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term42868 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term42872 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term42873 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 7);
        Object[] term42874 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        Object[] term42875 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        setField(term42811, term42811.getClass(), "mant", term42812);
        setByteField(term42811, term42811.getClass(), "sign", (byte) 22);
        setIntField(term42811, term42811.getClass(), "exp", 1471619998);
        setByteField(term42811, term42811.getClass(), "nans", (byte) -98);
        setIntField(term42816, term42816.getClass(), "radixDigits", -1623489521);
        setIntElement(term42819, 0, 1179937517);
        setIntElement(term42819, 1, 200150950);
        setIntElement(term42819, 2, -366198044);
        setIntElement(term42819, 3, -1350380769);
        setIntElement(term42819, 4, -1432215030);
        setIntElement(term42819, 5, 1233186320);
        setField(term42818, term42818.getClass(), "mant", term42819);
        setByteField(term42818, term42818.getClass(), "sign", (byte) -1);
        setIntField(term42818, term42818.getClass(), "exp", -1303269101);
        setByteField(term42818, term42818.getClass(), "nans", (byte) -84);
        setIntField(term42829, term42829.getClass(), "radixDigits", 1435572720);
        setField(term42831, term42831.getClass(), "mant", null);
        setByteField(term42831, term42831.getClass(), "sign", (byte) -125);
        setIntField(term42831, term42831.getClass(), "exp", -545275970);
        setByteField(term42831, term42831.getClass(), "nans", (byte) 11);
        setField(term42831, term42831.getClass(), "field", null);
        setField(term42829, term42829.getClass(), "zero", term42831);
        setField(term42835, term42835.getClass(), "mant", null);
        setByteField(term42835, term42835.getClass(), "sign", (byte) 0);
        setIntField(term42835, term42835.getClass(), "exp", 0);
        setByteField(term42835, term42835.getClass(), "nans", (byte) 0);
        setField(term42835, term42835.getClass(), "field", null);
        setField(term42829, term42829.getClass(), "one", term42835);
        setField(term42839, term42839.getClass(), "mant", null);
        setByteField(term42839, term42839.getClass(), "sign", (byte) 0);
        setIntField(term42839, term42839.getClass(), "exp", 0);
        setByteField(term42839, term42839.getClass(), "nans", (byte) 0);
        setField(term42839, term42839.getClass(), "field", null);
        setField(term42829, term42829.getClass(), "two", term42839);
        setField(term42829, term42829.getClass(), "sqr2", term42839);
        setElement(term42843, 2, term42818);
        setElement(term42843, 4, term42839);
        setField(term42829, term42829.getClass(), "sqr2Split", term42843);
        setField(term42844, term42844.getClass(), "mant", null);
        setByteField(term42844, term42844.getClass(), "sign", (byte) 0);
        setIntField(term42844, term42844.getClass(), "exp", 0);
        setByteField(term42844, term42844.getClass(), "nans", (byte) 0);
        setField(term42844, term42844.getClass(), "field", null);
        setField(term42829, term42829.getClass(), "sqr2Reciprocal", term42844);
        setField(term42829, term42829.getClass(), "sqr3", term42818);
        setField(term42848, term42848.getClass(), "mant", null);
        setByteField(term42848, term42848.getClass(), "sign", (byte) 0);
        setIntField(term42848, term42848.getClass(), "exp", 0);
        setByteField(term42848, term42848.getClass(), "nans", (byte) 0);
        setField(term42848, term42848.getClass(), "field", null);
        setField(term42829, term42829.getClass(), "sqr3Reciprocal", term42848);
        setField(term42829, term42829.getClass(), "pi", term42839);
        setElement(term42852, 0, term42818);
        setField(term42829, term42829.getClass(), "piSplit", term42852);
        setField(term42829, term42829.getClass(), "e", term42835);
        setElement(term42853, 1, term42831);
        setField(term42829, term42829.getClass(), "eSplit", term42853);
        setField(term42829, term42829.getClass(), "ln2", term42818);
        setElement(term42854, 2, term42811);
        setElement(term42854, 3, term42844);
        setElement(term42854, 5, term42848);
        setField(term42829, term42829.getClass(), "ln2Split", term42854);
        setField(term42829, term42829.getClass(), "ln5", term42831);
        setField(term42829, term42829.getClass(), "ln5Split", term42855);
        setField(term42829, term42829.getClass(), "ln10", term42839);
        setField(term42829, term42829.getClass(), "rMode", enum123);
        setIntField(term42829, term42829.getClass(), "ieeeFlags", -575810668);
        setField(term42818, term42818.getClass(), "field", term42829);
        setField(term42816, term42816.getClass(), "zero", term42818);
        setField(term42859, term42859.getClass(), "mant", null);
        setByteField(term42859, term42859.getClass(), "sign", (byte) 0);
        setIntField(term42859, term42859.getClass(), "exp", 0);
        setByteField(term42859, term42859.getClass(), "nans", (byte) 0);
        setField(term42859, term42859.getClass(), "field", null);
        setField(term42816, term42816.getClass(), "one", term42859);
        setField(term42816, term42816.getClass(), "two", term42835);
        setField(term42816, term42816.getClass(), "sqr2", term42818);
        setField(term42864, term42864.getClass(), "mant", null);
        setByteField(term42864, term42864.getClass(), "sign", (byte) 0);
        setIntField(term42864, term42864.getClass(), "exp", 0);
        setByteField(term42864, term42864.getClass(), "nans", (byte) 0);
        setField(term42864, term42864.getClass(), "field", null);
        setElement(term42863, 0, term42864);
        setElement(term42863, 1, term42818);
        setField(term42868, term42868.getClass(), "mant", null);
        setByteField(term42868, term42868.getClass(), "sign", (byte) 0);
        setIntField(term42868, term42868.getClass(), "exp", 0);
        setByteField(term42868, term42868.getClass(), "nans", (byte) 0);
        setField(term42868, term42868.getClass(), "field", null);
        setElement(term42863, 2, term42868);
        setField(term42816, term42816.getClass(), "sqr2Split", term42863);
        setField(term42816, term42816.getClass(), "sqr2Reciprocal", term42848);
        setField(term42816, term42816.getClass(), "sqr3", term42835);
        setField(term42816, term42816.getClass(), "sqr3Reciprocal", term42848);
        setField(term42816, term42816.getClass(), "pi", term42859);
        setElement(term42872, 0, term42859);
        setElement(term42872, 1, term42844);
        setElement(term42872, 2, term42811);
        setField(term42816, term42816.getClass(), "piSplit", term42872);
        setField(term42816, term42816.getClass(), "e", term42811);
        setElement(term42873, 0, term42831);
        setElement(term42873, 1, term42818);
        setElement(term42873, 2, term42859);
        setElement(term42873, 3, term42818);
        setElement(term42873, 4, term42839);
        setElement(term42873, 5, term42844);
        setElement(term42873, 6, term42839);
        setField(term42816, term42816.getClass(), "eSplit", term42873);
        setField(term42816, term42816.getClass(), "ln2", term42835);
        setElement(term42874, 0, term42844);
        setElement(term42874, 1, term42868);
        setElement(term42874, 2, term42835);
        setElement(term42874, 3, term42868);
        setElement(term42874, 4, term42848);
        setElement(term42874, 5, term42868);
        setField(term42816, term42816.getClass(), "ln2Split", term42874);
        setField(term42816, term42816.getClass(), "ln5", term42835);
        setElement(term42875, 0, term42831);
        setElement(term42875, 1, term42864);
        setElement(term42875, 2, term42859);
        setElement(term42875, 3, term42818);
        setField(term42816, term42816.getClass(), "ln5Split", term42875);
        setField(term42816, term42816.getClass(), "ln10", term42848);
        setField(term42816, term42816.getClass(), "rMode", enum124);
        setIntField(term42816, term42816.getClass(), "ieeeFlags", 256028547);
        setField(term42811, term42811.getClass(), "field", term42816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sqrt", argTypes, term42811, args);
    }

};


