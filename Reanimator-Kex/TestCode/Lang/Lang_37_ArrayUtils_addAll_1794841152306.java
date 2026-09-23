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

public class ArrayUtils_addAll_1794841152306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1498;
     Object term1502;
     Object term15164;
     Object term15165;
     Object term15151;

    public ArrayUtils_addAll_1794841152306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1498 = (long[]) newLongArray(3);
        setLongElement(term1498, 0, -4443169559037975007L);
        setLongElement(term1498, 1, -3842548265506930260L);
        setLongElement(term1498, 2, -5788180182343976541L);
        term1502 = (long[]) newLongArray(2);
        setLongElement(term1502, 0, 2936323121573284007L);
        setLongElement(term1502, 1, -1154553077993834885L);
        term15164 = (long[]) newLongArray(3);
        setLongElement(term15164, 0, -4443169559037975007L);
        setLongElement(term15164, 1, -3842548265506930260L);
        setLongElement(term15164, 2, -5788180182343976541L);
        term15165 = (long[]) newLongArray(2);
        setLongElement(term15165, 0, 2936323121573284007L);
        setLongElement(term15165, 1, -1154553077993834885L);
        term15151 = (long[]) newLongArray(5);
        setLongElement(term15151, 0, -4443169559037975007L);
        setLongElement(term15151, 1, -3842548265506930260L);
        setLongElement(term15151, 2, -5788180182343976541L);
        setLongElement(term15151, 3, 2936323121573284007L);
        setLongElement(term15151, 4, -1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1498;
        args[1] = term1502;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1498, term15164));
        assertTrue(recursiveEquals(term1502, term15165));
        assertTrue(recursiveEquals(retValue, term15151));
    }

};


