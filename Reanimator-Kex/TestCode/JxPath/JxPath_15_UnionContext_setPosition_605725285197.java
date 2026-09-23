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

public class UnionContext_setPosition_605725285197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112184;

    public UnionContext_setPosition_605725285197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term112036 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term112284 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term112386 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term112484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setBooleanField(term112184, term112184.getClass(), "prepared", false);
        setField(term112184, term112184.getClass(), "nodeSet", null);
        setIntField(term112284, term112284.getClass(), "position", 16);
        setBooleanField(term112284, term112284.getClass(), "setStarted", false);
        setBooleanField(term112284, term112284.getClass(), "startedSetIteration", true);
        setIntField(term112386, term112386.getClass(), "position", -1006633473);
        setField(term112284, term112284.getClass(), "parentContext", term112386);
        setElement(term112036, 0, term112284);
        setElement(term112036, 1, term112484);
        setField(term112184, term112184.getClass(), "contexts", term112036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term112184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


