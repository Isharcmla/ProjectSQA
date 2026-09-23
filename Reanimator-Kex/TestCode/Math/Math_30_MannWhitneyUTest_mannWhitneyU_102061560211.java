package org.apache.commons.math3.stat.inference;

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
import static org.apache.commons.math3.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.stat.inference.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MannWhitneyUTest_mannWhitneyU_102061560211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1845;
     Object term1868;
     Object term1870;
     Object term8597;
     Object term8606;
     Object term8607;
     Object term8608;
     Object term8609;

    public MannWhitneyUTest_mannWhitneyU_102061560211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8611 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term8610 = ((Class) term8611).getDeclaredField((String) "FIXED");
        ((Field) term8610).setAccessible(true);
        Object enum28 = ((Field) term8610).get((Object) null);
        Class<? extends Object> term8878 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term8877 = ((Class) term8878).getDeclaredField((String) "AVERAGE");
        ((Field) term8877).setAccessible(true);
        Object enum29 = ((Field) term8877).get((Object) null);
        term1845 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term1846 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term1867 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term1846, term1846.getClass(), "nanStrategy", enum28);
        setField(term1846, term1846.getClass(), "tiesStrategy", enum29);
        setField(term1867, term1867.getClass(), "rand", null);
        setField(term1867, term1867.getClass(), "secRand", null);
        setField(term1846, term1846.getClass(), "randomData", term1867);
        setField(term1845, term1845.getClass(), "naturalRanking", term1846);
        term1868 = (double[]) newDoubleArray(1);
        setDoubleElement(term1868, 0, 0.9828442029246764);
        term1870 = (double[]) newDoubleArray(6);
        setDoubleElement(term1870, 0, 0.2779719046761513);
        setDoubleElement(term1870, 1, 0.6436713023569729);
        setDoubleElement(term1870, 2, 0.7332741045694002);
        setDoubleElement(term1870, 3, 0.4569171842750229);
        setDoubleElement(term1870, 4, 0.8598297828918529);
        setDoubleElement(term1870, 5, 0.43692187681405226);
        Class<? extends Object> term9163 = Class.forName((String) "org.apache.commons.math3.stat.ranking.NaNStrategy");
        Field term9162 = ((Class) term9163).getDeclaredField((String) "FIXED");
        ((Field) term9162).setAccessible(true);
        Object enum30 = ((Field) term9162).get((Object) null);
        Class<? extends Object> term9430 = Class.forName((String) "org.apache.commons.math3.stat.ranking.TiesStrategy");
        Field term9429 = ((Class) term9430).getDeclaredField((String) "AVERAGE");
        ((Field) term9429).setAccessible(true);
        Object enum31 = ((Field) term9429).get((Object) null);
        term8597 = newInstance(Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest"));
        Object term8598 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking"));
        Object term8605 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        setField(term8598, term8598.getClass(), "nanStrategy", enum30);
        setField(term8598, term8598.getClass(), "tiesStrategy", enum31);
        setField(term8605, term8605.getClass(), "rand", null);
        setField(term8605, term8605.getClass(), "secRand", null);
        setField(term8598, term8598.getClass(), "randomData", term8605);
        setField(term8597, term8597.getClass(), "naturalRanking", term8598);
        term8606 = (double[]) newDoubleArray(1);
        setDoubleElement(term8606, 0, 0.9828442029246764);
        term8607 = (double[]) newDoubleArray(6);
        setDoubleElement(term8607, 0, 0.2779719046761513);
        setDoubleElement(term8607, 1, 0.6436713023569729);
        setDoubleElement(term8607, 2, 0.7332741045694002);
        setDoubleElement(term8607, 3, 0.4569171842750229);
        setDoubleElement(term8607, 4, 0.8598297828918529);
        setDoubleElement(term8607, 5, 0.43692187681405226);
        term8608 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking$IntDoublePair"));
        setDoubleField(term8608, term8608.getClass(), "value", 0.2779719046761513);
        setIntField(term8608, term8608.getClass(), "position", 1);
        term8609 = newInstance(Class.forName("org.apache.commons.math3.stat.ranking.NaturalRanking$IntDoublePair"));
        setDoubleField(term8609, term8609.getClass(), "value", 0.2779719046761513);
        setIntField(term8609, term8609.getClass(), "position", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.stat.inference.MannWhitneyUTest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1868;
        args[1] = term1870;
        Object retValue = callMethod(klass, "mannWhitneyU", argTypes, term1845, args);
        assertTrue(recursiveEquals(term1845, term8597));
        assertTrue(recursiveEquals(term1868, term8606));
        assertTrue(recursiveEquals(term1870, term8607));
        assertTrue(recursiveEquals(retValue, 6.0));
    }

};


