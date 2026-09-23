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

public class ArrayUtils_addAll_1794872928307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;
     Object term1492;
     Object term15153;
     Object term15154;
     Object term15128;

    public ArrayUtils_addAll_1794872928307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = (int[]) newIntArray(9);
        setIntElement(term1482, 0, -1772434990);
        setIntElement(term1482, 1, -1845499264);
        setIntElement(term1482, 2, -505439934);
        setIntElement(term1482, 3, -344842608);
        setIntElement(term1482, 4, 941650513);
        setIntElement(term1482, 5, 444029505);
        setIntElement(term1482, 6, -1034506028);
        setIntElement(term1482, 7, -1263114719);
        setIntElement(term1482, 8, -894662986);
        term1492 = (int[]) newIntArray(2);
        setIntElement(term1492, 0, 304775596);
        setIntElement(term1492, 1, -1347665717);
        term15153 = (int[]) newIntArray(9);
        setIntElement(term15153, 0, -1772434990);
        setIntElement(term15153, 1, -1845499264);
        setIntElement(term15153, 2, -505439934);
        setIntElement(term15153, 3, -344842608);
        setIntElement(term15153, 4, 941650513);
        setIntElement(term15153, 5, 444029505);
        setIntElement(term15153, 6, -1034506028);
        setIntElement(term15153, 7, -1263114719);
        setIntElement(term15153, 8, -894662986);
        term15154 = (int[]) newIntArray(2);
        setIntElement(term15154, 0, 304775596);
        setIntElement(term15154, 1, -1347665717);
        term15128 = (int[]) newIntArray(11);
        setIntElement(term15128, 0, -1772434990);
        setIntElement(term15128, 1, -1845499264);
        setIntElement(term15128, 2, -505439934);
        setIntElement(term15128, 3, -344842608);
        setIntElement(term15128, 4, 941650513);
        setIntElement(term15128, 5, 444029505);
        setIntElement(term15128, 6, -1034506028);
        setIntElement(term15128, 7, -1263114719);
        setIntElement(term15128, 8, -894662986);
        setIntElement(term15128, 9, 304775596);
        setIntElement(term15128, 10, -1347665717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1482;
        args[1] = term1492;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1482, term15153));
        assertTrue(recursiveEquals(term1492, term15154));
        assertTrue(recursiveEquals(retValue, term15128));
    }

};


