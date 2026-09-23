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

public class ArrayUtils_addAll_1794872928305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;
     Object term1484;
     Object term15114;
     Object term15115;
     Object term15089;

    public ArrayUtils_addAll_1794872928305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1474 = (int[]) newIntArray(9);
        setIntElement(term1474, 0, -1772434990);
        setIntElement(term1474, 1, -1845499264);
        setIntElement(term1474, 2, -505439934);
        setIntElement(term1474, 3, -344842608);
        setIntElement(term1474, 4, 941650513);
        setIntElement(term1474, 5, 444029505);
        setIntElement(term1474, 6, -1034506028);
        setIntElement(term1474, 7, -1263114719);
        setIntElement(term1474, 8, -894662986);
        term1484 = (int[]) newIntArray(2);
        setIntElement(term1484, 0, 304775596);
        setIntElement(term1484, 1, -1347665717);
        term15114 = (int[]) newIntArray(9);
        setIntElement(term15114, 0, -1772434990);
        setIntElement(term15114, 1, -1845499264);
        setIntElement(term15114, 2, -505439934);
        setIntElement(term15114, 3, -344842608);
        setIntElement(term15114, 4, 941650513);
        setIntElement(term15114, 5, 444029505);
        setIntElement(term15114, 6, -1034506028);
        setIntElement(term15114, 7, -1263114719);
        setIntElement(term15114, 8, -894662986);
        term15115 = (int[]) newIntArray(2);
        setIntElement(term15115, 0, 304775596);
        setIntElement(term15115, 1, -1347665717);
        term15089 = (int[]) newIntArray(11);
        setIntElement(term15089, 0, -1772434990);
        setIntElement(term15089, 1, -1845499264);
        setIntElement(term15089, 2, -505439934);
        setIntElement(term15089, 3, -344842608);
        setIntElement(term15089, 4, 941650513);
        setIntElement(term15089, 5, 444029505);
        setIntElement(term15089, 6, -1034506028);
        setIntElement(term15089, 7, -1263114719);
        setIntElement(term15089, 8, -894662986);
        setIntElement(term15089, 9, 304775596);
        setIntElement(term15089, 10, -1347665717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1474;
        args[1] = term1484;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1474, term15114));
        assertTrue(recursiveEquals(term1484, term15115));
        assertTrue(recursiveEquals(retValue, term15089));
    }

};


