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
import java.lang.Object;
import java.lang.Long;

public class ArrayUtils_toPrimitive_1697245092271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1149;
     Object term1160;
     Object term14212;
     Object term14194;

    public ArrayUtils_toPrimitive_1697245092271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1150 = new Long(4872422362414183754L);
        Long term1152 = new Long(6811161968424632369L);
        Long term1154 = new Long(-7237588299778557629L);
        Long term1156 = new Long(6967924379644551255L);
        Long term1158 = new Long(-2813493605142626659L);
        term1149 = (Object[]) newArray("java.lang.Long", 5);
        setElement(term1149, 0, term1150);
        setElement(term1149, 1, term1152);
        setElement(term1149, 2, term1154);
        setElement(term1149, 3, term1156);
        setElement(term1149, 4, term1158);
        term1160 = new Long(4784595517102746672L);
        Long term14213 = new Long(4872422362414183754L);
        Long term14214 = new Long(6811161968424632369L);
        Long term14215 = new Long(-7237588299778557629L);
        Long term14216 = new Long(6967924379644551255L);
        Long term14217 = new Long(-2813493605142626659L);
        term14212 = (Object[]) newArray("java.lang.Long", 5);
        setElement(term14212, 0, term14213);
        setElement(term14212, 1, term14214);
        setElement(term14212, 2, term14215);
        setElement(term14212, 3, term14216);
        setElement(term14212, 4, term14217);
        term14194 = (long[]) newLongArray(5);
        setLongElement(term14194, 0, 4872422362414183754L);
        setLongElement(term14194, 1, 6811161968424632369L);
        setLongElement(term14194, 2, -7237588299778557629L);
        setLongElement(term14194, 3, 6967924379644551255L);
        setLongElement(term14194, 4, -2813493605142626659L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Long"), 0).getClass();
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term1149;
        args[1] = term1160;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1149, term14212));
        assertTrue(recursiveEquals(term1160, 4784595517102746672L));
        assertTrue(recursiveEquals(retValue, term14194));
    }

};


