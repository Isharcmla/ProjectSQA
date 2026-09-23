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
import java.lang.Double;

public class ArrayUtils_toPrimitive_1455459590282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1236;
     Object term14485;
     Object term14477;

    public ArrayUtils_toPrimitive_1455459590282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1237 = new Double(0.13238746331190498);
        Double term1239 = new Double(0.3455959125047594);
        term1236 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term1236, 0, term1237);
        setElement(term1236, 1, term1239);
        Double term14486 = new Double(0.13238746331190498);
        Double term14487 = new Double(0.3455959125047594);
        term14485 = (Object[]) newArray("java.lang.Double", 2);
        setElement(term14485, 0, term14486);
        setElement(term14485, 1, term14487);
        term14477 = (double[]) newDoubleArray(2);
        setDoubleElement(term14477, 0, 0.13238746331190498);
        setDoubleElement(term14477, 1, 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1236;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1236, term14485));
        assertTrue(recursiveEquals(retValue, term14477));
    }

};


