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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseReturn_94528842363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1396345;
     Object term1396415;

    public TypeInference_traverseReturn_94528842363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1396345 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1396415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1396975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397395 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1397955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398235 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1398725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1396485, term1396485.getClass(), "type", 9);
        setIntField(term1396555, term1396555.getClass(), "type", 9);
        setIntField(term1396625, term1396625.getClass(), "type", 9);
        setIntField(term1396695, term1396695.getClass(), "type", 9);
        setIntField(term1396765, term1396765.getClass(), "type", 9);
        setIntField(term1396835, term1396835.getClass(), "type", 9);
        setIntField(term1396905, term1396905.getClass(), "type", 9);
        setIntField(term1396975, term1396975.getClass(), "type", 9);
        setIntField(term1397045, term1397045.getClass(), "type", 9);
        setIntField(term1397115, term1397115.getClass(), "type", 9);
        setIntField(term1397185, term1397185.getClass(), "type", 9);
        setIntField(term1397255, term1397255.getClass(), "type", 9);
        setIntField(term1397325, term1397325.getClass(), "type", 9);
        setIntField(term1397395, term1397395.getClass(), "type", 9);
        setIntField(term1397465, term1397465.getClass(), "type", 9);
        setIntField(term1397535, term1397535.getClass(), "type", 9);
        setIntField(term1397605, term1397605.getClass(), "type", 9);
        setIntField(term1397675, term1397675.getClass(), "type", 9);
        setIntField(term1397745, term1397745.getClass(), "type", 9);
        setIntField(term1397815, term1397815.getClass(), "type", 9);
        setIntField(term1397885, term1397885.getClass(), "type", 9);
        setIntField(term1397955, term1397955.getClass(), "type", 9);
        setIntField(term1398025, term1398025.getClass(), "type", 9);
        setIntField(term1398095, term1398095.getClass(), "type", 9);
        setIntField(term1398165, term1398165.getClass(), "type", 9);
        setIntField(term1398235, term1398235.getClass(), "type", 9);
        setIntField(term1398305, term1398305.getClass(), "type", 9);
        setIntField(term1398375, term1398375.getClass(), "type", 9);
        setIntField(term1398445, term1398445.getClass(), "type", 9);
        setIntField(term1398515, term1398515.getClass(), "type", 9);
        setIntField(term1398585, term1398585.getClass(), "type", 9);
        setIntField(term1398655, term1398655.getClass(), "type", 9);
        setIntField(term1398725, term1398725.getClass(), "type", 104);
        setField(term1398655, term1398655.getClass(), "first", term1398725);
        setField(term1398585, term1398585.getClass(), "first", term1398655);
        setField(term1398515, term1398515.getClass(), "first", term1398585);
        setField(term1398445, term1398445.getClass(), "first", term1398515);
        setField(term1398375, term1398375.getClass(), "first", term1398445);
        setField(term1398305, term1398305.getClass(), "first", term1398375);
        setField(term1398235, term1398235.getClass(), "first", term1398305);
        setField(term1398165, term1398165.getClass(), "first", term1398235);
        setField(term1398095, term1398095.getClass(), "first", term1398165);
        setField(term1398025, term1398025.getClass(), "first", term1398095);
        setField(term1397955, term1397955.getClass(), "first", term1398025);
        setField(term1397885, term1397885.getClass(), "first", term1397955);
        setField(term1397815, term1397815.getClass(), "first", term1397885);
        setField(term1397745, term1397745.getClass(), "first", term1397815);
        setField(term1397675, term1397675.getClass(), "first", term1397745);
        setField(term1397605, term1397605.getClass(), "first", term1397675);
        setField(term1397535, term1397535.getClass(), "first", term1397605);
        setField(term1397465, term1397465.getClass(), "first", term1397535);
        setField(term1397395, term1397395.getClass(), "first", term1397465);
        setField(term1397325, term1397325.getClass(), "first", term1397395);
        setField(term1397255, term1397255.getClass(), "first", term1397325);
        setField(term1397185, term1397185.getClass(), "first", term1397255);
        setField(term1397115, term1397115.getClass(), "first", term1397185);
        setField(term1397045, term1397045.getClass(), "first", term1397115);
        setField(term1396975, term1396975.getClass(), "first", term1397045);
        setField(term1396905, term1396905.getClass(), "first", term1396975);
        setField(term1396835, term1396835.getClass(), "first", term1396905);
        setField(term1396765, term1396765.getClass(), "first", term1396835);
        setField(term1396695, term1396695.getClass(), "first", term1396765);
        setField(term1396625, term1396625.getClass(), "first", term1396695);
        setField(term1396555, term1396555.getClass(), "first", term1396625);
        setField(term1396485, term1396485.getClass(), "first", term1396555);
        setField(term1396415, term1396415.getClass(), "first", term1396485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1396415;
        args[1] = null;
        callMethod(klass, "traverseReturn", argTypes, term1396345, args);
    }

};


