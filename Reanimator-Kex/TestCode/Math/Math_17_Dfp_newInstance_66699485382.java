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
import java.lang.Double;

public class Dfp_newInstance_66699485382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7140;
     Object term7224;

    public Dfp_newInstance_66699485382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89169 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term89168 = ((Class) term89169).getDeclaredField((String) "ROUND_FLOOR");
        ((Field) term89168).setAccessible(true);
        Object enum189 = ((Field) term89168).get((Object) null);
        Class<? extends Object> term89459 = Class.forName((String) "org.apache.commons.math3.dfp.DfpField$RoundingMode");
        Field term89458 = ((Class) term89459).getDeclaredField((String) "ROUND_CEIL");
        ((Field) term89458).setAccessible(true);
        Object enum190 = ((Field) term89458).get((Object) null);
        term7140 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term7141 = (int[]) newIntArray(5);
        Object term7150 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term7152 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        int[] term7153 = (int[]) newIntArray(5);
        Object term7162 = newInstance(Class.forName("org.apache.commons.math3.dfp.DfpField"));
        Object term7164 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term7168 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object term7172 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7176 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term7177 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7181 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 4);
        Object term7182 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7186 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 9);
        Object[] term7187 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object term7188 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7192 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 1);
        Object term7196 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7200 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object term7201 = newInstance(Class.forName("org.apache.commons.math3.dfp.Dfp"));
        Object[] term7205 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 5);
        Object[] term7206 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 8);
        Object[] term7207 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 3);
        Object[] term7208 = (Object[]) newArray("org.apache.commons.math3.dfp.Dfp", 6);
        setIntElement(term7141, 0, 32185364);
        setIntElement(term7141, 1, 1768204942);
        setIntElement(term7141, 2, 1252951645);
        setIntElement(term7141, 3, 574481092);
        setIntElement(term7141, 4, -310528004);
        setField(term7140, term7140.getClass(), "mant", term7141);
        setByteField(term7140, term7140.getClass(), "sign", (byte) -28);
        setIntField(term7140, term7140.getClass(), "exp", -634976996);
        setByteField(term7140, term7140.getClass(), "nans", (byte) 115);
        setIntField(term7150, term7150.getClass(), "radixDigits", -1015274146);
        setIntElement(term7153, 0, -49052672);
        setIntElement(term7153, 1, 339372704);
        setIntElement(term7153, 2, -851097944);
        setIntElement(term7153, 3, 803925431);
        setIntElement(term7153, 4, 76929641);
        setField(term7152, term7152.getClass(), "mant", term7153);
        setByteField(term7152, term7152.getClass(), "sign", (byte) 51);
        setIntField(term7152, term7152.getClass(), "exp", -2003192918);
        setByteField(term7152, term7152.getClass(), "nans", (byte) -53);
        setIntField(term7162, term7162.getClass(), "radixDigits", -1362856620);
        setField(term7164, term7164.getClass(), "mant", null);
        setByteField(term7164, term7164.getClass(), "sign", (byte) -9);
        setIntField(term7164, term7164.getClass(), "exp", -1694747156);
        setByteField(term7164, term7164.getClass(), "nans", (byte) 97);
        setField(term7164, term7164.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "zero", term7164);
        setField(term7168, term7168.getClass(), "mant", null);
        setByteField(term7168, term7168.getClass(), "sign", (byte) 0);
        setIntField(term7168, term7168.getClass(), "exp", 0);
        setByteField(term7168, term7168.getClass(), "nans", (byte) 0);
        setField(term7168, term7168.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "one", term7168);
        setField(term7172, term7172.getClass(), "mant", null);
        setByteField(term7172, term7172.getClass(), "sign", (byte) 0);
        setIntField(term7172, term7172.getClass(), "exp", 0);
        setByteField(term7172, term7172.getClass(), "nans", (byte) 0);
        setField(term7172, term7172.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "two", term7172);
        setField(term7162, term7162.getClass(), "sqr2", term7152);
        setElement(term7176, 3, term7168);
        setField(term7162, term7162.getClass(), "sqr2Split", term7176);
        setField(term7162, term7162.getClass(), "sqr2Reciprocal", term7152);
        setField(term7162, term7162.getClass(), "sqr3", term7172);
        setField(term7177, term7177.getClass(), "mant", null);
        setByteField(term7177, term7177.getClass(), "sign", (byte) 0);
        setIntField(term7177, term7177.getClass(), "exp", 0);
        setByteField(term7177, term7177.getClass(), "nans", (byte) 0);
        setField(term7177, term7177.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "sqr3Reciprocal", term7177);
        setField(term7162, term7162.getClass(), "pi", term7152);
        setElement(term7181, 2, term7164);
        setElement(term7181, 3, term7152);
        setField(term7162, term7162.getClass(), "piSplit", term7181);
        setField(term7182, term7182.getClass(), "mant", null);
        setByteField(term7182, term7182.getClass(), "sign", (byte) 0);
        setIntField(term7182, term7182.getClass(), "exp", 0);
        setByteField(term7182, term7182.getClass(), "nans", (byte) 0);
        setField(term7182, term7182.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "e", term7182);
        setElement(term7186, 1, term7140);
        setElement(term7186, 2, term7168);
        setElement(term7186, 4, term7172);
        setElement(term7186, 7, term7182);
        setElement(term7186, 8, term7164);
        setField(term7162, term7162.getClass(), "eSplit", term7186);
        setField(term7162, term7162.getClass(), "ln2", term7177);
        setElement(term7187, 2, term7152);
        setField(term7162, term7162.getClass(), "ln2Split", term7187);
        setField(term7188, term7188.getClass(), "mant", null);
        setByteField(term7188, term7188.getClass(), "sign", (byte) 0);
        setIntField(term7188, term7188.getClass(), "exp", 0);
        setByteField(term7188, term7188.getClass(), "nans", (byte) 0);
        setField(term7188, term7188.getClass(), "field", null);
        setField(term7162, term7162.getClass(), "ln5", term7188);
        setElement(term7192, 0, term7152);
        setField(term7162, term7162.getClass(), "ln5Split", term7192);
        setField(term7162, term7162.getClass(), "ln10", term7182);
        setField(term7162, term7162.getClass(), "rMode", enum189);
        setIntField(term7162, term7162.getClass(), "ieeeFlags", 1843268026);
        setField(term7152, term7152.getClass(), "field", term7162);
        setField(term7150, term7150.getClass(), "zero", term7152);
        setField(term7150, term7150.getClass(), "one", term7172);
        setField(term7196, term7196.getClass(), "mant", null);
        setByteField(term7196, term7196.getClass(), "sign", (byte) 0);
        setIntField(term7196, term7196.getClass(), "exp", 0);
        setByteField(term7196, term7196.getClass(), "nans", (byte) 0);
        setField(term7196, term7196.getClass(), "field", null);
        setField(term7150, term7150.getClass(), "two", term7196);
        setField(term7150, term7150.getClass(), "sqr2", term7172);
        setField(term7201, term7201.getClass(), "mant", null);
        setByteField(term7201, term7201.getClass(), "sign", (byte) 0);
        setIntField(term7201, term7201.getClass(), "exp", 0);
        setByteField(term7201, term7201.getClass(), "nans", (byte) 0);
        setField(term7201, term7201.getClass(), "field", null);
        setElement(term7200, 0, term7201);
        setElement(term7200, 1, term7201);
        setElement(term7200, 2, term7168);
        setElement(term7200, 3, term7140);
        setElement(term7200, 4, term7140);
        setField(term7150, term7150.getClass(), "sqr2Split", term7200);
        setField(term7150, term7150.getClass(), "sqr2Reciprocal", term7164);
        setField(term7150, term7150.getClass(), "sqr3", term7152);
        setField(term7150, term7150.getClass(), "sqr3Reciprocal", term7201);
        setField(term7150, term7150.getClass(), "pi", term7152);
        setElement(term7205, 0, term7177);
        setElement(term7205, 1, term7168);
        setElement(term7205, 2, term7177);
        setElement(term7205, 3, term7196);
        setElement(term7205, 4, term7168);
        setField(term7150, term7150.getClass(), "piSplit", term7205);
        setField(term7150, term7150.getClass(), "e", term7182);
        setElement(term7206, 0, term7196);
        setElement(term7206, 1, term7182);
        setElement(term7206, 2, term7172);
        setElement(term7206, 3, term7182);
        setElement(term7206, 4, term7196);
        setElement(term7206, 5, term7164);
        setElement(term7206, 6, term7188);
        setElement(term7206, 7, term7201);
        setField(term7150, term7150.getClass(), "eSplit", term7206);
        setField(term7150, term7150.getClass(), "ln2", term7152);
        setElement(term7207, 0, term7172);
        setElement(term7207, 1, term7201);
        setElement(term7207, 2, term7164);
        setField(term7150, term7150.getClass(), "ln2Split", term7207);
        setField(term7150, term7150.getClass(), "ln5", term7172);
        setElement(term7208, 0, term7182);
        setElement(term7208, 1, term7177);
        setElement(term7208, 2, term7182);
        setElement(term7208, 3, term7168);
        setElement(term7208, 4, term7188);
        setElement(term7208, 5, term7152);
        setField(term7150, term7150.getClass(), "ln5Split", term7208);
        setField(term7150, term7150.getClass(), "ln10", term7196);
        setField(term7150, term7150.getClass(), "rMode", enum190);
        setIntField(term7150, term7150.getClass(), "ieeeFlags", 954660603);
        setField(term7140, term7140.getClass(), "field", term7150);
        term7224 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.dfp.Dfp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7224;
        try {
            callMethod(klass, "newInstance", argTypes, term7140, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


