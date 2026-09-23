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

public class TypeInference_traverseAdd_838817955484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963069;
     Object term1963139;

    public TypeInference_traverseAdd_838817955484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1963069 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1963139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1963979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1964959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965239 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1965799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1963209, term1963209.getClass(), "next", null);
        setIntField(term1963209, term1963209.getClass(), "type", 14);
        setIntField(term1963279, term1963279.getClass(), "type", 14);
        setIntField(term1963349, term1963349.getClass(), "type", 14);
        setIntField(term1963419, term1963419.getClass(), "type", 14);
        setIntField(term1963489, term1963489.getClass(), "type", 14);
        setIntField(term1963559, term1963559.getClass(), "type", 14);
        setIntField(term1963629, term1963629.getClass(), "type", 14);
        setIntField(term1963699, term1963699.getClass(), "type", 14);
        setIntField(term1963769, term1963769.getClass(), "type", 14);
        setIntField(term1963839, term1963839.getClass(), "type", 14);
        setIntField(term1963909, term1963909.getClass(), "type", 14);
        setIntField(term1963979, term1963979.getClass(), "type", 14);
        setIntField(term1964049, term1964049.getClass(), "type", 14);
        setIntField(term1964119, term1964119.getClass(), "type", 14);
        setIntField(term1964189, term1964189.getClass(), "type", 14);
        setIntField(term1964259, term1964259.getClass(), "type", 14);
        setIntField(term1964329, term1964329.getClass(), "type", 14);
        setIntField(term1964399, term1964399.getClass(), "type", 14);
        setIntField(term1964469, term1964469.getClass(), "type", 14);
        setIntField(term1964539, term1964539.getClass(), "type", 14);
        setIntField(term1964609, term1964609.getClass(), "type", 14);
        setIntField(term1964679, term1964679.getClass(), "type", 14);
        setIntField(term1964749, term1964749.getClass(), "type", 14);
        setIntField(term1964819, term1964819.getClass(), "type", 14);
        setIntField(term1964889, term1964889.getClass(), "type", 14);
        setIntField(term1964959, term1964959.getClass(), "type", 14);
        setIntField(term1965029, term1965029.getClass(), "type", 14);
        setIntField(term1965099, term1965099.getClass(), "type", 14);
        setIntField(term1965169, term1965169.getClass(), "type", 14);
        setIntField(term1965239, term1965239.getClass(), "type", 14);
        setIntField(term1965309, term1965309.getClass(), "type", 14);
        setIntField(term1965379, term1965379.getClass(), "type", 14);
        setIntField(term1965449, term1965449.getClass(), "type", 14);
        setIntField(term1965519, term1965519.getClass(), "type", 14);
        setIntField(term1965589, term1965589.getClass(), "type", 14);
        setIntField(term1965659, term1965659.getClass(), "type", 14);
        setIntField(term1965729, term1965729.getClass(), "type", 14);
        setIntField(term1965799, term1965799.getClass(), "type", 99);
        setField(term1965729, term1965729.getClass(), "first", term1965799);
        setField(term1965659, term1965659.getClass(), "first", term1965729);
        setField(term1965589, term1965589.getClass(), "first", term1965659);
        setField(term1965519, term1965519.getClass(), "first", term1965589);
        setField(term1965449, term1965449.getClass(), "first", term1965519);
        setField(term1965379, term1965379.getClass(), "first", term1965449);
        setField(term1965309, term1965309.getClass(), "first", term1965379);
        setField(term1965239, term1965239.getClass(), "first", term1965309);
        setField(term1965169, term1965169.getClass(), "first", term1965239);
        setField(term1965099, term1965099.getClass(), "first", term1965169);
        setField(term1965029, term1965029.getClass(), "first", term1965099);
        setField(term1964959, term1964959.getClass(), "first", term1965029);
        setField(term1964889, term1964889.getClass(), "first", term1964959);
        setField(term1964819, term1964819.getClass(), "first", term1964889);
        setField(term1964749, term1964749.getClass(), "first", term1964819);
        setField(term1964679, term1964679.getClass(), "first", term1964749);
        setField(term1964609, term1964609.getClass(), "first", term1964679);
        setField(term1964539, term1964539.getClass(), "first", term1964609);
        setField(term1964469, term1964469.getClass(), "first", term1964539);
        setField(term1964399, term1964399.getClass(), "first", term1964469);
        setField(term1964329, term1964329.getClass(), "first", term1964399);
        setField(term1964259, term1964259.getClass(), "first", term1964329);
        setField(term1964189, term1964189.getClass(), "first", term1964259);
        setField(term1964119, term1964119.getClass(), "first", term1964189);
        setField(term1964049, term1964049.getClass(), "first", term1964119);
        setField(term1963979, term1963979.getClass(), "first", term1964049);
        setField(term1963909, term1963909.getClass(), "first", term1963979);
        setField(term1963839, term1963839.getClass(), "first", term1963909);
        setField(term1963769, term1963769.getClass(), "first", term1963839);
        setField(term1963699, term1963699.getClass(), "first", term1963769);
        setField(term1963629, term1963629.getClass(), "first", term1963699);
        setField(term1963559, term1963559.getClass(), "first", term1963629);
        setField(term1963489, term1963489.getClass(), "first", term1963559);
        setField(term1963419, term1963419.getClass(), "first", term1963489);
        setField(term1963349, term1963349.getClass(), "first", term1963419);
        setField(term1963279, term1963279.getClass(), "first", term1963349);
        setField(term1963209, term1963209.getClass(), "first", term1963279);
        setField(term1963139, term1963139.getClass(), "first", term1963209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1963139;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term1963069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


