package com.google.javascript.jscomp;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_1142297770330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745979;
     Object term746049;

    public TypeInference_traverseReturn_1142297770330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745979 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term746049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term746959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term747939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term749969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term746119, term746119.getClass(), "type", 29);
        setIntField(term746189, term746189.getClass(), "type", 29);
        setIntField(term746259, term746259.getClass(), "type", 29);
        setIntField(term746329, term746329.getClass(), "type", 29);
        setIntField(term746399, term746399.getClass(), "type", 29);
        setIntField(term746469, term746469.getClass(), "type", 29);
        setIntField(term746539, term746539.getClass(), "type", 29);
        setIntField(term746609, term746609.getClass(), "type", 29);
        setIntField(term746679, term746679.getClass(), "type", 29);
        setIntField(term746749, term746749.getClass(), "type", 29);
        setIntField(term746819, term746819.getClass(), "type", 29);
        setIntField(term746889, term746889.getClass(), "type", 29);
        setIntField(term746959, term746959.getClass(), "type", 29);
        setIntField(term747029, term747029.getClass(), "type", 29);
        setIntField(term747099, term747099.getClass(), "type", 29);
        setIntField(term747169, term747169.getClass(), "type", 29);
        setIntField(term747239, term747239.getClass(), "type", 29);
        setIntField(term747309, term747309.getClass(), "type", 29);
        setIntField(term747379, term747379.getClass(), "type", 29);
        setIntField(term747449, term747449.getClass(), "type", 29);
        setIntField(term747519, term747519.getClass(), "type", 29);
        setIntField(term747589, term747589.getClass(), "type", 29);
        setIntField(term747659, term747659.getClass(), "type", 29);
        setIntField(term747729, term747729.getClass(), "type", 29);
        setIntField(term747799, term747799.getClass(), "type", 29);
        setIntField(term747869, term747869.getClass(), "type", 29);
        setIntField(term747939, term747939.getClass(), "type", 29);
        setIntField(term748009, term748009.getClass(), "type", 29);
        setIntField(term748079, term748079.getClass(), "type", 29);
        setIntField(term748149, term748149.getClass(), "type", 29);
        setIntField(term748219, term748219.getClass(), "type", 29);
        setIntField(term748289, term748289.getClass(), "type", 29);
        setIntField(term748359, term748359.getClass(), "type", 29);
        setIntField(term748429, term748429.getClass(), "type", 29);
        setIntField(term748499, term748499.getClass(), "type", 29);
        setIntField(term748569, term748569.getClass(), "type", 29);
        setIntField(term748639, term748639.getClass(), "type", 29);
        setIntField(term748709, term748709.getClass(), "type", 29);
        setIntField(term748779, term748779.getClass(), "type", 29);
        setIntField(term748849, term748849.getClass(), "type", 29);
        setIntField(term748919, term748919.getClass(), "type", 29);
        setIntField(term748989, term748989.getClass(), "type", 29);
        setIntField(term749059, term749059.getClass(), "type", 29);
        setIntField(term749129, term749129.getClass(), "type", 29);
        setIntField(term749199, term749199.getClass(), "type", 29);
        setIntField(term749269, term749269.getClass(), "type", 29);
        setIntField(term749339, term749339.getClass(), "type", 29);
        setIntField(term749409, term749409.getClass(), "type", 29);
        setIntField(term749479, term749479.getClass(), "type", 29);
        setIntField(term749549, term749549.getClass(), "type", 29);
        setIntField(term749619, term749619.getClass(), "type", 29);
        setIntField(term749689, term749689.getClass(), "type", 29);
        setIntField(term749759, term749759.getClass(), "type", 29);
        setIntField(term749829, term749829.getClass(), "type", 29);
        setIntField(term749899, term749899.getClass(), "type", 29);
        setIntField(term749969, term749969.getClass(), "type", 29);
        setIntField(term750039, term750039.getClass(), "type", 29);
        setIntField(term750109, term750109.getClass(), "type", 127);
        setField(term750039, term750039.getClass(), "first", term750109);
        setField(term749969, term749969.getClass(), "first", term750039);
        setField(term749899, term749899.getClass(), "first", term749969);
        setField(term749829, term749829.getClass(), "first", term749899);
        setField(term749759, term749759.getClass(), "first", term749829);
        setField(term749689, term749689.getClass(), "first", term749759);
        setField(term749619, term749619.getClass(), "first", term749689);
        setField(term749549, term749549.getClass(), "first", term749619);
        setField(term749479, term749479.getClass(), "first", term749549);
        setField(term749409, term749409.getClass(), "first", term749479);
        setField(term749339, term749339.getClass(), "first", term749409);
        setField(term749269, term749269.getClass(), "first", term749339);
        setField(term749199, term749199.getClass(), "first", term749269);
        setField(term749129, term749129.getClass(), "first", term749199);
        setField(term749059, term749059.getClass(), "first", term749129);
        setField(term748989, term748989.getClass(), "first", term749059);
        setField(term748919, term748919.getClass(), "first", term748989);
        setField(term748849, term748849.getClass(), "first", term748919);
        setField(term748779, term748779.getClass(), "first", term748849);
        setField(term748709, term748709.getClass(), "first", term748779);
        setField(term748639, term748639.getClass(), "first", term748709);
        setField(term748569, term748569.getClass(), "first", term748639);
        setField(term748499, term748499.getClass(), "first", term748569);
        setField(term748429, term748429.getClass(), "first", term748499);
        setField(term748359, term748359.getClass(), "first", term748429);
        setField(term748289, term748289.getClass(), "first", term748359);
        setField(term748219, term748219.getClass(), "first", term748289);
        setField(term748149, term748149.getClass(), "first", term748219);
        setField(term748079, term748079.getClass(), "first", term748149);
        setField(term748009, term748009.getClass(), "first", term748079);
        setField(term747939, term747939.getClass(), "first", term748009);
        setField(term747869, term747869.getClass(), "first", term747939);
        setField(term747799, term747799.getClass(), "first", term747869);
        setField(term747729, term747729.getClass(), "first", term747799);
        setField(term747659, term747659.getClass(), "first", term747729);
        setField(term747589, term747589.getClass(), "first", term747659);
        setField(term747519, term747519.getClass(), "first", term747589);
        setField(term747449, term747449.getClass(), "first", term747519);
        setField(term747379, term747379.getClass(), "first", term747449);
        setField(term747309, term747309.getClass(), "first", term747379);
        setField(term747239, term747239.getClass(), "first", term747309);
        setField(term747169, term747169.getClass(), "first", term747239);
        setField(term747099, term747099.getClass(), "first", term747169);
        setField(term747029, term747029.getClass(), "first", term747099);
        setField(term746959, term746959.getClass(), "first", term747029);
        setField(term746889, term746889.getClass(), "first", term746959);
        setField(term746819, term746819.getClass(), "first", term746889);
        setField(term746749, term746749.getClass(), "first", term746819);
        setField(term746679, term746679.getClass(), "first", term746749);
        setField(term746609, term746609.getClass(), "first", term746679);
        setField(term746539, term746539.getClass(), "first", term746609);
        setField(term746469, term746469.getClass(), "first", term746539);
        setField(term746399, term746399.getClass(), "first", term746469);
        setField(term746329, term746329.getClass(), "first", term746399);
        setField(term746259, term746259.getClass(), "first", term746329);
        setField(term746189, term746189.getClass(), "first", term746259);
        setField(term746119, term746119.getClass(), "first", term746189);
        setField(term746049, term746049.getClass(), "first", term746119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term746049;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term745979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


