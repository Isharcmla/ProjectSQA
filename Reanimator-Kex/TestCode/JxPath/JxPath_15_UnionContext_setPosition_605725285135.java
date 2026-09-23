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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;
import java.lang.Object;

public class UnionContext_setPosition_605725285135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37059;
     Object term40065;

    public UnionContext_setPosition_605725285135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term37141 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term36919 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term37243 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term37059, term37059.getClass(), "prepared", false);
        setField(term37059, term37059.getClass(), "nodeSet", term37141);
        setBooleanField(term37243, term37243.getClass(), "startedSet", true);
        setElement(term36919, 0, term37243);
        setField(term37059, term37059.getClass(), "contexts", term36919);
        term40065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term40066 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term40067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term40068 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term40067, term40067.getClass(), "startedSet", true);
        setField(term40067, term40067.getClass(), "nodeSet", null);
        setField(term40067, term40067.getClass(), "parentContext", null);
        setField(term40067, term40067.getClass(), "rootContext", null);
        setIntField(term40067, term40067.getClass(), "position", 0);
        setBooleanField(term40067, term40067.getClass(), "startedSetIteration", false);
        setBooleanField(term40067, term40067.getClass(), "done", false);
        setBooleanField(term40067, term40067.getClass(), "hasPerformedIteratorStep", false);
        setField(term40067, term40067.getClass(), "pointerIterator", null);
        setElement(term40066, 0, term40067);
        setField(term40065, term40065.getClass(), "contexts", term40066);
        setBooleanField(term40065, term40065.getClass(), "prepared", true);
        setBooleanField(term40065, term40065.getClass(), "startedSet", false);
        setField(term40068, term40068.getClass(), "pointers", null);
        setField(term40068, term40068.getClass(), "readOnlyPointers", null);
        setField(term40068, term40068.getClass(), "nodes", null);
        setField(term40068, term40068.getClass(), "values", null);
        setField(term40065, term40065.getClass(), "nodeSet", term40068);
        setField(term40065, term40065.getClass(), "parentContext", null);
        setField(term40065, term40065.getClass(), "rootContext", null);
        setIntField(term40065, term40065.getClass(), "position", 0);
        setBooleanField(term40065, term40065.getClass(), "startedSetIteration", false);
        setBooleanField(term40065, term40065.getClass(), "done", false);
        setBooleanField(term40065, term40065.getClass(), "hasPerformedIteratorStep", false);
        setField(term40065, term40065.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term37059, args);
        assertTrue(recursiveEquals(term37059, term40065));
    }

};


