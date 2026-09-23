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

public class UnionContext_setPosition_605725285151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44735;
     Object term44869;

    public UnionContext_setPosition_605725285151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44735 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term44602 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term44837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term44735, term44735.getClass(), "prepared", false);
        setField(term44735, term44735.getClass(), "nodeSet", null);
        setBooleanField(term44837, term44837.getClass(), "startedSet", true);
        setElement(term44602, 0, term44837);
        setField(term44735, term44735.getClass(), "contexts", term44602);
        term44869 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term44870 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term44871 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term44871, term44871.getClass(), "startedSet", true);
        setField(term44871, term44871.getClass(), "nodeSet", null);
        setField(term44871, term44871.getClass(), "parentContext", null);
        setField(term44871, term44871.getClass(), "rootContext", null);
        setIntField(term44871, term44871.getClass(), "position", 0);
        setBooleanField(term44871, term44871.getClass(), "startedSetIteration", false);
        setBooleanField(term44871, term44871.getClass(), "done", false);
        setBooleanField(term44871, term44871.getClass(), "hasPerformedIteratorStep", false);
        setField(term44871, term44871.getClass(), "pointerIterator", null);
        setElement(term44870, 0, term44871);
        setField(term44869, term44869.getClass(), "contexts", term44870);
        setBooleanField(term44869, term44869.getClass(), "prepared", true);
        setBooleanField(term44869, term44869.getClass(), "startedSet", false);
        setField(term44869, term44869.getClass(), "nodeSet", null);
        setField(term44869, term44869.getClass(), "parentContext", null);
        setField(term44869, term44869.getClass(), "rootContext", null);
        setIntField(term44869, term44869.getClass(), "position", 0);
        setBooleanField(term44869, term44869.getClass(), "startedSetIteration", false);
        setBooleanField(term44869, term44869.getClass(), "done", false);
        setBooleanField(term44869, term44869.getClass(), "hasPerformedIteratorStep", false);
        setField(term44869, term44869.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term44735, args);
        assertTrue(recursiveEquals(term44735, term44869));
    }

};


