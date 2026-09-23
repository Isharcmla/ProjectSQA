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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_605725285175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53678;

    public UnionContext_setPosition_605725285175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term53524 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term53784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term53886 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.InitialContext"));
        Object term53982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        setBooleanField(term53678, term53678.getClass(), "prepared", false);
        setField(term53678, term53678.getClass(), "nodeSet", null);
        setBooleanField(term53784, term53784.getClass(), "setStarted", false);
        setField(term53784, term53784.getClass(), "iterator", null);
        setIntField(term53784, term53784.getClass(), "position", 1073741824);
        setBooleanField(term53784, term53784.getClass(), "startedSetIteration", false);
        setBooleanField(term53886, term53886.getClass(), "started", false);
        setIntField(term53886, term53886.getClass(), "position", 1);
        setBooleanField(term53886, term53886.getClass(), "collection", false);
        setField(term53784, term53784.getClass(), "parentContext", term53886);
        setElement(term53524, 0, term53784);
        setElement(term53524, 1, term53982);
        setField(term53678, term53678.getClass(), "contexts", term53524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term53678, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


