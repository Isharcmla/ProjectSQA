package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_addAll_83571505310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532;
     Object term1541;
     Object term15292;
     Object term15293;
     Object term15259;

    public ArrayUtils_addAll_83571505310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1532 = (double[]) newDoubleArray(8);
        setDoubleElement(term1532, 0, 0.1544348383112728);
        setDoubleElement(term1532, 1, 0.5187846213101265);
        setDoubleElement(term1532, 2, 0.045893173090043815);
        setDoubleElement(term1532, 3, 0.3626177854778667);
        setDoubleElement(term1532, 4, 0.3163771663728089);
        setDoubleElement(term1532, 5, 0.8819646072665548);
        setDoubleElement(term1532, 6, 0.5412182593116958);
        setDoubleElement(term1532, 7, 0.16988691727397487);
        term1541 = (double[]) newDoubleArray(7);
        setDoubleElement(term1541, 0, 0.39286935532362843);
        setDoubleElement(term1541, 1, 0.11577948268926874);
        setDoubleElement(term1541, 2, 0.5617009352394552);
        setDoubleElement(term1541, 3, 0.09067063848644474);
        setDoubleElement(term1541, 4, 0.268304014379393);
        setDoubleElement(term1541, 5, 0.7171972879282721);
        setDoubleElement(term1541, 6, 0.9006361024877096);
        term15292 = (double[]) newDoubleArray(8);
        setDoubleElement(term15292, 0, 0.1544348383112728);
        setDoubleElement(term15292, 1, 0.5187846213101265);
        setDoubleElement(term15292, 2, 0.045893173090043815);
        setDoubleElement(term15292, 3, 0.3626177854778667);
        setDoubleElement(term15292, 4, 0.3163771663728089);
        setDoubleElement(term15292, 5, 0.8819646072665548);
        setDoubleElement(term15292, 6, 0.5412182593116958);
        setDoubleElement(term15292, 7, 0.16988691727397487);
        term15293 = (double[]) newDoubleArray(7);
        setDoubleElement(term15293, 0, 0.39286935532362843);
        setDoubleElement(term15293, 1, 0.11577948268926874);
        setDoubleElement(term15293, 2, 0.5617009352394552);
        setDoubleElement(term15293, 3, 0.09067063848644474);
        setDoubleElement(term15293, 4, 0.268304014379393);
        setDoubleElement(term15293, 5, 0.7171972879282721);
        setDoubleElement(term15293, 6, 0.9006361024877096);
        term15259 = (double[]) newDoubleArray(15);
        setDoubleElement(term15259, 0, 0.1544348383112728);
        setDoubleElement(term15259, 1, 0.5187846213101265);
        setDoubleElement(term15259, 2, 0.045893173090043815);
        setDoubleElement(term15259, 3, 0.3626177854778667);
        setDoubleElement(term15259, 4, 0.3163771663728089);
        setDoubleElement(term15259, 5, 0.8819646072665548);
        setDoubleElement(term15259, 6, 0.5412182593116958);
        setDoubleElement(term15259, 7, 0.16988691727397487);
        setDoubleElement(term15259, 8, 0.39286935532362843);
        setDoubleElement(term15259, 9, 0.11577948268926874);
        setDoubleElement(term15259, 10, 0.5617009352394552);
        setDoubleElement(term15259, 11, 0.09067063848644474);
        setDoubleElement(term15259, 12, 0.268304014379393);
        setDoubleElement(term15259, 13, 0.7171972879282721);
        setDoubleElement(term15259, 14, 0.9006361024877096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1532;
        args[1] = term1541;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1532, term15292));
        assertTrue(recursiveEquals(term1541, term15293));
        assertTrue(recursiveEquals(retValue, term15259));
    }

};


