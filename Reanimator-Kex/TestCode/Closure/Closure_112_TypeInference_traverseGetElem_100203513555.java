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

public class TypeInference_traverseGetElem_100203513555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3145399;
     Object term3145469;

    public TypeInference_traverseGetElem_100203513555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3145399 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term3145469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3145959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3147639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3145539, term3145539.getClass(), "type", 98);
        setField(term3145609, term3145609.getClass(), "next", null);
        setIntField(term3145609, term3145609.getClass(), "type", 98);
        setField(term3145679, term3145679.getClass(), "next", null);
        setIntField(term3145679, term3145679.getClass(), "type", 98);
        setField(term3145749, term3145749.getClass(), "next", null);
        setIntField(term3145749, term3145749.getClass(), "type", 98);
        setField(term3145819, term3145819.getClass(), "next", null);
        setIntField(term3145819, term3145819.getClass(), "type", 98);
        setField(term3145889, term3145889.getClass(), "next", null);
        setIntField(term3145889, term3145889.getClass(), "type", 98);
        setField(term3145959, term3145959.getClass(), "next", null);
        setIntField(term3145959, term3145959.getClass(), "type", 98);
        setField(term3146029, term3146029.getClass(), "next", null);
        setIntField(term3146029, term3146029.getClass(), "type", 98);
        setField(term3146099, term3146099.getClass(), "next", null);
        setIntField(term3146099, term3146099.getClass(), "type", 98);
        setField(term3146169, term3146169.getClass(), "next", null);
        setIntField(term3146169, term3146169.getClass(), "type", 98);
        setField(term3146239, term3146239.getClass(), "next", null);
        setIntField(term3146239, term3146239.getClass(), "type", 98);
        setField(term3146309, term3146309.getClass(), "next", null);
        setIntField(term3146309, term3146309.getClass(), "type", 98);
        setField(term3146379, term3146379.getClass(), "next", null);
        setIntField(term3146379, term3146379.getClass(), "type", 98);
        setField(term3146449, term3146449.getClass(), "next", null);
        setIntField(term3146449, term3146449.getClass(), "type", 98);
        setField(term3146519, term3146519.getClass(), "next", null);
        setIntField(term3146519, term3146519.getClass(), "type", 98);
        setField(term3146589, term3146589.getClass(), "next", null);
        setIntField(term3146589, term3146589.getClass(), "type", 98);
        setField(term3146659, term3146659.getClass(), "next", null);
        setIntField(term3146659, term3146659.getClass(), "type", 98);
        setField(term3146729, term3146729.getClass(), "next", null);
        setIntField(term3146729, term3146729.getClass(), "type", 98);
        setField(term3146799, term3146799.getClass(), "next", null);
        setIntField(term3146799, term3146799.getClass(), "type", 98);
        setField(term3146869, term3146869.getClass(), "next", null);
        setIntField(term3146869, term3146869.getClass(), "type", 98);
        setField(term3146939, term3146939.getClass(), "next", null);
        setIntField(term3146939, term3146939.getClass(), "type", 98);
        setField(term3147009, term3147009.getClass(), "next", null);
        setIntField(term3147009, term3147009.getClass(), "type", 98);
        setField(term3147079, term3147079.getClass(), "next", null);
        setIntField(term3147079, term3147079.getClass(), "type", 98);
        setField(term3147149, term3147149.getClass(), "next", null);
        setIntField(term3147149, term3147149.getClass(), "type", 98);
        setField(term3147219, term3147219.getClass(), "next", null);
        setIntField(term3147219, term3147219.getClass(), "type", 98);
        setField(term3147289, term3147289.getClass(), "next", null);
        setIntField(term3147289, term3147289.getClass(), "type", 98);
        setField(term3147359, term3147359.getClass(), "next", null);
        setIntField(term3147359, term3147359.getClass(), "type", 98);
        setField(term3147429, term3147429.getClass(), "next", null);
        setIntField(term3147429, term3147429.getClass(), "type", 98);
        setField(term3147499, term3147499.getClass(), "next", null);
        setIntField(term3147499, term3147499.getClass(), "type", 98);
        setField(term3147569, term3147569.getClass(), "next", null);
        setIntField(term3147569, term3147569.getClass(), "type", 132);
        setField(term3147499, term3147499.getClass(), "first", term3147569);
        setField(term3147499, term3147499.getClass(), "last", null);
        setField(term3147429, term3147429.getClass(), "first", term3147499);
        setField(term3147429, term3147429.getClass(), "last", null);
        setField(term3147359, term3147359.getClass(), "first", term3147429);
        setField(term3147359, term3147359.getClass(), "last", null);
        setField(term3147289, term3147289.getClass(), "first", term3147359);
        setField(term3147289, term3147289.getClass(), "last", null);
        setField(term3147219, term3147219.getClass(), "first", term3147289);
        setField(term3147219, term3147219.getClass(), "last", null);
        setField(term3147149, term3147149.getClass(), "first", term3147219);
        setField(term3147149, term3147149.getClass(), "last", null);
        setField(term3147079, term3147079.getClass(), "first", term3147149);
        setField(term3147079, term3147079.getClass(), "last", term3147639);
        setField(term3147009, term3147009.getClass(), "first", term3147079);
        setField(term3147009, term3147009.getClass(), "last", null);
        setField(term3146939, term3146939.getClass(), "first", term3147009);
        setField(term3146939, term3146939.getClass(), "last", null);
        setField(term3146869, term3146869.getClass(), "first", term3146939);
        setField(term3146869, term3146869.getClass(), "last", null);
        setField(term3146799, term3146799.getClass(), "first", term3146869);
        setField(term3146799, term3146799.getClass(), "last", null);
        setField(term3146729, term3146729.getClass(), "first", term3146799);
        setField(term3146729, term3146729.getClass(), "last", null);
        setField(term3146659, term3146659.getClass(), "first", term3146729);
        setField(term3146659, term3146659.getClass(), "last", null);
        setField(term3146589, term3146589.getClass(), "first", term3146659);
        setField(term3146589, term3146589.getClass(), "last", null);
        setField(term3146519, term3146519.getClass(), "first", term3146589);
        setField(term3146519, term3146519.getClass(), "last", null);
        setField(term3146449, term3146449.getClass(), "first", term3146519);
        setField(term3146449, term3146449.getClass(), "last", null);
        setField(term3146379, term3146379.getClass(), "first", term3146449);
        setField(term3146379, term3146379.getClass(), "last", null);
        setField(term3146309, term3146309.getClass(), "first", term3146379);
        setField(term3146309, term3146309.getClass(), "last", null);
        setField(term3146239, term3146239.getClass(), "first", term3146309);
        setField(term3146239, term3146239.getClass(), "last", null);
        setField(term3146169, term3146169.getClass(), "first", term3146239);
        setField(term3146169, term3146169.getClass(), "last", null);
        setField(term3146099, term3146099.getClass(), "first", term3146169);
        setField(term3146099, term3146099.getClass(), "last", null);
        setField(term3146029, term3146029.getClass(), "first", term3146099);
        setField(term3146029, term3146029.getClass(), "last", null);
        setField(term3145959, term3145959.getClass(), "first", term3146029);
        setField(term3145959, term3145959.getClass(), "last", null);
        setField(term3145889, term3145889.getClass(), "first", term3145959);
        setField(term3145889, term3145889.getClass(), "last", null);
        setField(term3145819, term3145819.getClass(), "first", term3145889);
        setField(term3145819, term3145819.getClass(), "last", null);
        setField(term3145749, term3145749.getClass(), "first", term3145819);
        setField(term3145749, term3145749.getClass(), "last", null);
        setField(term3145679, term3145679.getClass(), "first", term3145749);
        setField(term3145679, term3145679.getClass(), "last", null);
        setField(term3145609, term3145609.getClass(), "first", term3145679);
        setField(term3145609, term3145609.getClass(), "last", null);
        setField(term3145539, term3145539.getClass(), "first", term3145609);
        setField(term3145539, term3145539.getClass(), "last", null);
        setField(term3145469, term3145469.getClass(), "first", term3145539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3145469;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term3145399, args);
    }

};


