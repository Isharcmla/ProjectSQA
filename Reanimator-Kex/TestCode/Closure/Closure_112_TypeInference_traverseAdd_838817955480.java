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

public class TypeInference_traverseAdd_838817955480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2591019;
     Object term2591089;

    public TypeInference_traverseAdd_838817955480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2591019 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2591089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2591999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2592909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2591159, term2591159.getClass(), "next", term2591229);
        setIntField(term2591159, term2591159.getClass(), "type", 14);
        setIntField(term2591299, term2591299.getClass(), "type", 14);
        setIntField(term2591369, term2591369.getClass(), "type", 14);
        setIntField(term2591439, term2591439.getClass(), "type", 14);
        setIntField(term2591509, term2591509.getClass(), "type", 14);
        setIntField(term2591579, term2591579.getClass(), "type", 14);
        setIntField(term2591649, term2591649.getClass(), "type", 14);
        setIntField(term2591719, term2591719.getClass(), "type", 14);
        setIntField(term2591789, term2591789.getClass(), "type", 14);
        setIntField(term2591859, term2591859.getClass(), "type", 14);
        setIntField(term2591929, term2591929.getClass(), "type", 14);
        setIntField(term2591999, term2591999.getClass(), "type", 14);
        setIntField(term2592069, term2592069.getClass(), "type", 14);
        setIntField(term2592139, term2592139.getClass(), "type", 14);
        setIntField(term2592209, term2592209.getClass(), "type", 14);
        setIntField(term2592279, term2592279.getClass(), "type", 14);
        setIntField(term2592349, term2592349.getClass(), "type", 14);
        setIntField(term2592419, term2592419.getClass(), "type", 14);
        setIntField(term2592489, term2592489.getClass(), "type", 14);
        setIntField(term2592559, term2592559.getClass(), "type", 14);
        setIntField(term2592629, term2592629.getClass(), "type", 14);
        setIntField(term2592699, term2592699.getClass(), "type", 14);
        setIntField(term2592769, term2592769.getClass(), "type", 14);
        setIntField(term2592839, term2592839.getClass(), "type", 14);
        setIntField(term2592909, term2592909.getClass(), "type", 74);
        setField(term2592839, term2592839.getClass(), "first", term2592909);
        setField(term2592769, term2592769.getClass(), "first", term2592839);
        setField(term2592699, term2592699.getClass(), "first", term2592769);
        setField(term2592629, term2592629.getClass(), "first", term2592699);
        setField(term2592559, term2592559.getClass(), "first", term2592629);
        setField(term2592489, term2592489.getClass(), "first", term2592559);
        setField(term2592419, term2592419.getClass(), "first", term2592489);
        setField(term2592349, term2592349.getClass(), "first", term2592419);
        setField(term2592279, term2592279.getClass(), "first", term2592349);
        setField(term2592209, term2592209.getClass(), "first", term2592279);
        setField(term2592139, term2592139.getClass(), "first", term2592209);
        setField(term2592069, term2592069.getClass(), "first", term2592139);
        setField(term2591999, term2591999.getClass(), "first", term2592069);
        setField(term2591929, term2591929.getClass(), "first", term2591999);
        setField(term2591859, term2591859.getClass(), "first", term2591929);
        setField(term2591789, term2591789.getClass(), "first", term2591859);
        setField(term2591719, term2591719.getClass(), "first", term2591789);
        setField(term2591649, term2591649.getClass(), "first", term2591719);
        setField(term2591579, term2591579.getClass(), "first", term2591649);
        setField(term2591509, term2591509.getClass(), "first", term2591579);
        setField(term2591439, term2591439.getClass(), "first", term2591509);
        setField(term2591369, term2591369.getClass(), "first", term2591439);
        setField(term2591299, term2591299.getClass(), "first", term2591369);
        setField(term2591159, term2591159.getClass(), "first", term2591299);
        setField(term2591089, term2591089.getClass(), "first", term2591159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2591089;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term2591019, args);
    }

};


