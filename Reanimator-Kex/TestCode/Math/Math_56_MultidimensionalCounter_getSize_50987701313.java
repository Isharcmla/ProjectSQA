package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.util.EqualityUtils.*;

public class MultidimensionalCounter_getSize_50987701313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term2257;

    public MultidimensionalCounter_getSize_50987701313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term109 = (int[]) newIntArray(6);
        int[] term116 = (int[]) newIntArray(5);
        setIntField(term107, term107.getClass(), "dimension", -1786399638);
        setIntElement(term109, 0, 2055867847);
        setIntElement(term109, 1, -1048298087);
        setIntElement(term109, 2, 292681826);
        setIntElement(term109, 3, 458147407);
        setIntElement(term109, 4, -184153539);
        setIntElement(term109, 5, 493620644);
        setField(term107, term107.getClass(), "uniCounterOffset", term109);
        setIntElement(term116, 0, 1328271830);
        setIntElement(term116, 1, 1596070772);
        setIntElement(term116, 2, 97029295);
        setIntElement(term116, 3, -1371869594);
        setIntElement(term116, 4, -2095575670);
        setField(term107, term107.getClass(), "size", term116);
        setIntField(term107, term107.getClass(), "totalSize", 1225272962);
        setIntField(term107, term107.getClass(), "last", 1324040357);
        term2257 = newInstance(Class.forName("org.apache.commons.math.util.MultidimensionalCounter"));
        int[] term2258 = (int[]) newIntArray(6);
        int[] term2259 = (int[]) newIntArray(5);
        setIntField(term2257, term2257.getClass(), "dimension", -1786399638);
        setIntElement(term2258, 0, 2055867847);
        setIntElement(term2258, 1, -1048298087);
        setIntElement(term2258, 2, 292681826);
        setIntElement(term2258, 3, 458147407);
        setIntElement(term2258, 4, -184153539);
        setIntElement(term2258, 5, 493620644);
        setField(term2257, term2257.getClass(), "uniCounterOffset", term2258);
        setIntElement(term2259, 0, 1328271830);
        setIntElement(term2259, 1, 1596070772);
        setIntElement(term2259, 2, 97029295);
        setIntElement(term2259, 3, -1371869594);
        setIntElement(term2259, 4, -2095575670);
        setField(term2257, term2257.getClass(), "size", term2259);
        setIntField(term2257, term2257.getClass(), "totalSize", 1225272962);
        setIntField(term2257, term2257.getClass(), "last", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MultidimensionalCounter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSize", argTypes, term107, args);
        assertTrue(recursiveEquals(term107, term2257));
        assertTrue(recursiveEquals(retValue, 1225272962));
    }

};


