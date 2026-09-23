package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_equals_214717460876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2313;
     Object term2321;
     Object term19609;
     Object term19610;

    public MathArrays_equals_214717460876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2313 = (double[]) newDoubleArray(7);
        setDoubleElement(term2313, 0, 0.8732511635701926);
        setDoubleElement(term2313, 1, 0.8977760608415547);
        setDoubleElement(term2313, 2, 0.3107086749915061);
        setDoubleElement(term2313, 3, 0.18330246984174836);
        setDoubleElement(term2313, 4, 0.1941255640189572);
        setDoubleElement(term2313, 5, 0.2889811903417371);
        setDoubleElement(term2313, 6, 0.7856101337088763);
        term2321 = (double[]) newDoubleArray(6);
        setDoubleElement(term2321, 0, 0.1782857269567425);
        setDoubleElement(term2321, 1, 0.17829386444171214);
        setDoubleElement(term2321, 2, 0.547995853732519);
        setDoubleElement(term2321, 3, 0.3483938514131425);
        setDoubleElement(term2321, 4, 0.0100718646868041);
        setDoubleElement(term2321, 5, 0.58265008665336);
        term19609 = (double[]) newDoubleArray(7);
        setDoubleElement(term19609, 0, 0.8732511635701926);
        setDoubleElement(term19609, 1, 0.8977760608415547);
        setDoubleElement(term19609, 2, 0.3107086749915061);
        setDoubleElement(term19609, 3, 0.18330246984174836);
        setDoubleElement(term19609, 4, 0.1941255640189572);
        setDoubleElement(term19609, 5, 0.2889811903417371);
        setDoubleElement(term19609, 6, 0.7856101337088763);
        term19610 = (double[]) newDoubleArray(6);
        setDoubleElement(term19610, 0, 0.1782857269567425);
        setDoubleElement(term19610, 1, 0.17829386444171214);
        setDoubleElement(term19610, 2, 0.547995853732519);
        setDoubleElement(term19610, 3, 0.3483938514131425);
        setDoubleElement(term19610, 4, 0.0100718646868041);
        setDoubleElement(term19610, 5, 0.58265008665336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2313;
        args[1] = term2321;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term2313, term19609));
        assertTrue(recursiveEquals(term2321, term19610));
        assertTrue(recursiveEquals(retValue, false));
    }

};


