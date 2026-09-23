package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DSCompiler_expm1_16215322889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14050;
     Object term14116;
     Object term14123;
     Object term14125;
     Object term14128;

    public DSCompiler_expm1_16215322889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14050 = newInstance(Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        Object[] term14053 = (Object[]) newArray("[I", 4);
        int[] term14054 = (int[]) newIntArray(5);
        int[] term14060 = (int[]) newIntArray(1);
        int[] term14062 = (int[]) newIntArray(1);
        int[] term14064 = (int[]) newIntArray(3);
        Object[] term14068 = (Object[]) newArray("[I", 3);
        int[] term14069 = (int[]) newIntArray(3);
        int[] term14073 = (int[]) newIntArray(4);
        int[] term14078 = (int[]) newIntArray(0);
        int[] term14079 = (int[]) newIntArray(5);
        Object[] term14085 = (Object[]) newArray("[[I", 2);
        Object[] term14086 = (Object[]) newArray("[I", 3);
        int[] term14087 = (int[]) newIntArray(6);
        int[] term14094 = (int[]) newIntArray(1);
        int[] term14096 = (int[]) newIntArray(5);
        Object[] term14102 = (Object[]) newArray("[I", 3);
        int[] term14103 = (int[]) newIntArray(2);
        int[] term14106 = (int[]) newIntArray(3);
        int[] term14110 = (int[]) newIntArray(4);
        Object[] term14115 = (Object[]) newArray("[[I", 0);
        setIntField(term14050, term14050.getClass(), "parameters", 452190809);
        setIntField(term14050, term14050.getClass(), "order", -868819495);
        setIntElement(term14054, 0, -1011591867);
        setIntElement(term14054, 1, 709949296);
        setIntElement(term14054, 2, 1078431447);
        setIntElement(term14054, 3, -894257039);
        setIntElement(term14054, 4, 1586412497);
        setElement(term14053, 0, term14054);
        setIntElement(term14060, 0, 719020316);
        setElement(term14053, 1, term14060);
        setIntElement(term14062, 0, 1522532191);
        setElement(term14053, 2, term14062);
        setIntElement(term14064, 0, 137516958);
        setIntElement(term14064, 1, -1233770688);
        setIntElement(term14064, 2, 722935077);
        setElement(term14053, 3, term14064);
        setField(term14050, term14050.getClass(), "sizes", term14053);
        setIntElement(term14069, 0, -304660297);
        setIntElement(term14069, 1, 1530655970);
        setIntElement(term14069, 2, -154857398);
        setElement(term14068, 0, term14069);
        setIntElement(term14073, 0, 385239631);
        setIntElement(term14073, 1, 836211088);
        setIntElement(term14073, 2, -365730201);
        setIntElement(term14073, 3, -1218078298);
        setElement(term14068, 1, term14073);
        setElement(term14068, 2, term14078);
        setField(term14050, term14050.getClass(), "derivativesIndirection", term14068);
        setIntElement(term14079, 0, -1186533450);
        setIntElement(term14079, 1, 1385418235);
        setIntElement(term14079, 2, 928651112);
        setIntElement(term14079, 3, -970446181);
        setIntElement(term14079, 4, 484689354);
        setField(term14050, term14050.getClass(), "lowerIndirection", term14079);
        setIntElement(term14087, 0, 1836490268);
        setIntElement(term14087, 1, 388735696);
        setIntElement(term14087, 2, 105946838);
        setIntElement(term14087, 3, -2076570725);
        setIntElement(term14087, 4, -976659428);
        setIntElement(term14087, 5, 974582816);
        setElement(term14086, 0, term14087);
        setIntElement(term14094, 0, 1915101054);
        setElement(term14086, 1, term14094);
        setIntElement(term14096, 0, -956240810);
        setIntElement(term14096, 1, 2125391204);
        setIntElement(term14096, 2, -1473375595);
        setIntElement(term14096, 3, 847182213);
        setIntElement(term14096, 4, 1757624590);
        setElement(term14086, 2, term14096);
        setElement(term14085, 0, term14086);
        setIntElement(term14103, 0, 694012679);
        setIntElement(term14103, 1, -630916471);
        setElement(term14102, 0, term14103);
        setIntElement(term14106, 0, -167574207);
        setIntElement(term14106, 1, 1034189504);
        setIntElement(term14106, 2, 250123647);
        setElement(term14102, 1, term14106);
        setIntElement(term14110, 0, -1818613479);
        setIntElement(term14110, 1, -93031622);
        setIntElement(term14110, 2, 1909891216);
        setIntElement(term14110, 3, -1231417445);
        setElement(term14102, 2, term14110);
        setElement(term14085, 1, term14102);
        setField(term14050, term14050.getClass(), "multIndirection", term14085);
        setField(term14050, term14050.getClass(), "compIndirection", term14115);
        term14116 = (double[]) newDoubleArray(6);
        setDoubleElement(term14116, 0, 0.5597136413549945);
        setDoubleElement(term14116, 1, 0.28292420012823627);
        setDoubleElement(term14116, 2, 0.5407563152320285);
        setDoubleElement(term14116, 3, 0.9485929668765458);
        setDoubleElement(term14116, 4, 0.5179319342588155);
        setDoubleElement(term14116, 5, 0.25025774487844066);
        term14123 = new Integer(-1305887225);
        term14125 = (double[]) newDoubleArray(2);
        setDoubleElement(term14125, 0, 0.1858089882752998);
        setDoubleElement(term14125, 1, 0.2440697646709713);
        term14128 = new Integer(1861751365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term14116;
        args[1] = term14123;
        args[2] = term14125;
        args[3] = term14128;
        try {
            callMethod(klass, "expm1", argTypes, term14050, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


