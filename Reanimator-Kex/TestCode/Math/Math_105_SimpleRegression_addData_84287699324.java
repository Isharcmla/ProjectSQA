package org.apache.commons.math.stat.regression;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.stat.regression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimpleRegression_addData_84287699324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;
     Object term23;

    public SimpleRegression_addData_84287699324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("org.apache.commons.math.stat.regression.SimpleRegression"));
        setDoubleField(term14, term14.getClass(), "sumX", 0.37773193782763337);
        setDoubleField(term14, term14.getClass(), "sumXX", 0.8474802076607362);
        setDoubleField(term14, term14.getClass(), "sumY", 0.5183269973490326);
        setDoubleField(term14, term14.getClass(), "sumYY", 0.7655020693602768);
        setDoubleField(term14, term14.getClass(), "sumXY", 0.1374549299694151);
        setLongField(term14, term14.getClass(), "n", 6375119433582206027L);
        setDoubleField(term14, term14.getClass(), "xbar", 0.7031006357544823);
        setDoubleField(term14, term14.getClass(), "ybar", 0.9527281779865117);
        term23 = (Object[]) newArray("[D", 5);
        double[] term24 = (double[]) newDoubleArray(4);
        double[] term29 = (double[]) newDoubleArray(3);
        double[] term33 = (double[]) newDoubleArray(4);
        double[] term38 = (double[]) newDoubleArray(1);
        double[] term40 = (double[]) newDoubleArray(6);
        setDoubleElement(term24, 0, 0.9828442029246764);
        setDoubleElement(term24, 1, 0.2779719046761513);
        setDoubleElement(term24, 2, 0.6436713023569729);
        setDoubleElement(term24, 3, 0.7332741045694002);
        setElement(term23, 0, term24);
        setDoubleElement(term29, 0, 0.4569171842750229);
        setDoubleElement(term29, 1, 0.8598297828918529);
        setDoubleElement(term29, 2, 0.43692187681405226);
        setElement(term23, 1, term29);
        setDoubleElement(term33, 0, 0.7633268466829064);
        setDoubleElement(term33, 1, 0.13481025392611334);
        setDoubleElement(term33, 2, 0.3800088629986428);
        setDoubleElement(term33, 3, 0.5840714198152577);
        setElement(term23, 2, term33);
        setDoubleElement(term38, 0, 0.7559240768573477);
        setElement(term23, 3, term38);
        setDoubleElement(term40, 0, 0.10667076642995188);
        setDoubleElement(term40, 1, 0.11493000848982304);
        setDoubleElement(term40, 2, 0.37161417339133307);
        setDoubleElement(term40, 3, 0.6805867182029153);
        setDoubleElement(term40, 4, 0.2852810965221698);
        setDoubleElement(term40, 5, 0.6300849762307866);
        setElement(term23, 4, term40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.regression.SimpleRegression");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term23;
        try {
            callMethod(klass, "addData", argTypes, term14, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


