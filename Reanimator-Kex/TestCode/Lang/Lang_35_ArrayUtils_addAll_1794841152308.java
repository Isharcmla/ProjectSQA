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

public class ArrayUtils_addAll_1794841152308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1506;
     Object term1510;
     Object term15203;
     Object term15204;
     Object term15190;

    public ArrayUtils_addAll_1794841152308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1506 = (long[]) newLongArray(3);
        setLongElement(term1506, 0, -4443169559037975007L);
        setLongElement(term1506, 1, -3842548265506930260L);
        setLongElement(term1506, 2, -5788180182343976541L);
        term1510 = (long[]) newLongArray(2);
        setLongElement(term1510, 0, 2936323121573284007L);
        setLongElement(term1510, 1, -1154553077993834885L);
        term15203 = (long[]) newLongArray(3);
        setLongElement(term15203, 0, -4443169559037975007L);
        setLongElement(term15203, 1, -3842548265506930260L);
        setLongElement(term15203, 2, -5788180182343976541L);
        term15204 = (long[]) newLongArray(2);
        setLongElement(term15204, 0, 2936323121573284007L);
        setLongElement(term15204, 1, -1154553077993834885L);
        term15190 = (long[]) newLongArray(5);
        setLongElement(term15190, 0, -4443169559037975007L);
        setLongElement(term15190, 1, -3842548265506930260L);
        setLongElement(term15190, 2, -5788180182343976541L);
        setLongElement(term15190, 3, 2936323121573284007L);
        setLongElement(term15190, 4, -1154553077993834885L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1506;
        args[1] = term1510;
        Object retValue = callMethod(klass, "addAll", argTypes, null, args);
        assertTrue(recursiveEquals(term1506, term15203));
        assertTrue(recursiveEquals(term1510, term15204));
        assertTrue(recursiveEquals(retValue, term15190));
    }

};


