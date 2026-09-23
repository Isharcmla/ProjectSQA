package org.apache.commons.jxpath.ri.axes;

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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_605725285131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36152;

    public UnionContext_setPosition_605725285131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36152 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term35985 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term36252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term36354 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term36460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term36152, term36152.getClass(), "prepared", false);
        setField(term36152, term36152.getClass(), "nodeSet", null);
        setIntField(term36252, term36252.getClass(), "position", 268435456);
        setBooleanField(term36252, term36252.getClass(), "setStarted", false);
        setBooleanField(term36252, term36252.getClass(), "startedSetIteration", false);
        setBooleanField(term36354, term36354.getClass(), "startedSet", false);
        setIntField(term36354, term36354.getClass(), "position", -935740296);
        setField(term36252, term36252.getClass(), "parentContext", term36354);
        setElement(term35985, 0, term36252);
        setElement(term35985, 1, term36460);
        setField(term36152, term36152.getClass(), "contexts", term35985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term36152, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


