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

public class TypeInference_traverseAdd_838817955371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813406;
     Object term813476;

    public TypeInference_traverseAdd_838817955371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813406 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term813476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term814876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term813546, term813546.getClass(), "next", term813616);
        setIntField(term813546, term813546.getClass(), "type", 14);
        setIntField(term813686, term813686.getClass(), "type", 14);
        setIntField(term813756, term813756.getClass(), "type", 14);
        setIntField(term813826, term813826.getClass(), "type", 14);
        setIntField(term813896, term813896.getClass(), "type", 14);
        setIntField(term813966, term813966.getClass(), "type", 14);
        setIntField(term814036, term814036.getClass(), "type", 14);
        setIntField(term814106, term814106.getClass(), "type", 14);
        setIntField(term814176, term814176.getClass(), "type", 14);
        setIntField(term814246, term814246.getClass(), "type", 14);
        setIntField(term814316, term814316.getClass(), "type", 14);
        setIntField(term814386, term814386.getClass(), "type", 14);
        setIntField(term814456, term814456.getClass(), "type", 14);
        setIntField(term814526, term814526.getClass(), "type", 14);
        setIntField(term814596, term814596.getClass(), "type", 14);
        setIntField(term814666, term814666.getClass(), "type", 14);
        setIntField(term814736, term814736.getClass(), "type", 14);
        setIntField(term814806, term814806.getClass(), "type", 14);
        setIntField(term814876, term814876.getClass(), "type", 126);
        setField(term814806, term814806.getClass(), "first", term814876);
        setField(term814736, term814736.getClass(), "first", term814806);
        setField(term814666, term814666.getClass(), "first", term814736);
        setField(term814596, term814596.getClass(), "first", term814666);
        setField(term814526, term814526.getClass(), "first", term814596);
        setField(term814456, term814456.getClass(), "first", term814526);
        setField(term814386, term814386.getClass(), "first", term814456);
        setField(term814316, term814316.getClass(), "first", term814386);
        setField(term814246, term814246.getClass(), "first", term814316);
        setField(term814176, term814176.getClass(), "first", term814246);
        setField(term814106, term814106.getClass(), "first", term814176);
        setField(term814036, term814036.getClass(), "first", term814106);
        setField(term813966, term813966.getClass(), "first", term814036);
        setField(term813896, term813896.getClass(), "first", term813966);
        setField(term813826, term813826.getClass(), "first", term813896);
        setField(term813756, term813756.getClass(), "first", term813826);
        setField(term813686, term813686.getClass(), "first", term813756);
        setField(term813546, term813546.getClass(), "first", term813686);
        setField(term813476, term813476.getClass(), "first", term813546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term813476;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term813406, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


