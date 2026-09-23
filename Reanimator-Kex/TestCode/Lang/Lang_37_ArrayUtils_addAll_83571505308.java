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

public class ArrayUtils_addAll_83571505308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1524;
     Object term1533;
     Object term15253;
     Object term15254;
     Object term15220;

    public ArrayUtils_addAll_83571505308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1524 = (double[]) newDoubleArray(8);
        setDoubleElement(term1524, 0, 0.1544348383112728);
        setDoubleElement(term1524, 1, 0.5187846213101265);
        setDoubleElement(term1524, 2, 0.045893173090043815);
        setDoubleElement(term1524, 3, 0.3626177854778667);
        setDoubleElement(term1524, 4, 0.3163771663728089);
        setDoubleElement(term1524, 5, 0.8819646072665548);
        setDoubleElement(term1524, 6, 0.5412182593116958);
        setDoubleElement(term1524, 7, 0.16988691727397487);
        term1533 = (double[]) newDoubleArray(7);
        setDoubleElement(term1533, 0, 0.39286935532362843);
        setDoubleElement(term1533, 1, 0.11577948268926874);
        setDoubleElement(term1533, 2, 0.5617009352394552);
        setDoubleElement(term1533, 3, 0.09067063848644474);
        setDoubleElement(term1533, 4, 0.268304014379393);
        setDoubleElement(term1533, 5, 0.7171972879282721);
        setDoubleElement(term1533, 6, 0.9006361024877096);
        term15253 = (double[]) newDoubleArray(8);
        setDoubleElement(term15253, 0, 0.1544348383112728);
        setDoubleElement(term15253, 1, 0.5187846213101265);
        setDoubleElement(term15253, 2, 0.045893173090043815);
        setDoubleElement(term15253, 3, 0.3626177854778667);
        setDoubleElement(term15253, 4, 0.3163771663728089);
        setDoubleElement(term15253, 5, 0.8819646072665548);
        setDoubleElement(term15253, 6, 0.5412182593116958);
        setDoubleElement(term15253, 7, 0.16988691727397487);
        term15254 = (double[]) newDoubleArray(7);
        setDoubleElement(term15254, 0, 0.39286935532362843);
        setDoubleElement(term15254, 1, 0.11577948268926874);
        setDoubleElement(term15254, 2, 0.5617009352394552);
        setDoubleElement(term15254, 3, 0.09067063848644474);
        setDoubleElement(term15254, 4, 0.268304014379393);
        setDoubleElement(term15254, 5, 0.7171972879282721);
        setDoubleElement(term15254, 6, 0.9006361024877096);
        term15220 = (double[]) newDoubleArray(15);
        setDoubleElement(term15220, 0, 0.1544348383112728);
        setDoubleElement(term15220, 1, 0.5187846213101265);
        setDoubleElement(term15220, 2, 0.045893173090043815);
        setDoubleElement(term15220, 3, 0.3626177854778667);
        setDoubleElement(term15220, 4, 0.3163771663728089);
        setDoubleElement(term15220, 5, 0.8819646072665548);
        setDoubleElement(term15220, 6, 0.5412182593116958);
        setDoubleElement(term15220, 7, 0.16988691727397487);
        setDoubleElement(term15220, 8, 0.39286935532362843);
        setDoubleElement(term15220, 9, 0.11577948268926874);
        setDoubleElement(term15220, 10, 0.5617009352394552);
        setDoubleElement(term15220, 11, 0.09067063848644474);
        setDoubleElement(term15220, 12, 0.268304014379393);
        setDoubleElement(term15220, 13, 0.7171972879282721);
        setDoubleElement(term15220, 14, 0.9006361024877096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1524;
        args[1] = term1533;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1524, term15253));
        assertTrue(recursiveEquals(term1533, term15254));
        assertTrue(recursiveEquals(retValue, term15220));
    }

};


