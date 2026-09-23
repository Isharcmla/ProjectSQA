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

public class UnionContext_setPosition_60572528511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1045;
     Object term1061;

    public UnionContext_setPosition_60572528511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1045 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term921 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term1045, term1045.getClass(), "prepared", false);
        setField(term1045, term1045.getClass(), "nodeSet", null);
        setField(term1045, term1045.getClass(), "contexts", term921);
        term1061 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term1062 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setField(term1061, term1061.getClass(), "contexts", term1062);
        setBooleanField(term1061, term1061.getClass(), "prepared", true);
        setBooleanField(term1061, term1061.getClass(), "startedSet", false);
        setField(term1061, term1061.getClass(), "nodeSet", null);
        setField(term1061, term1061.getClass(), "parentContext", null);
        setField(term1061, term1061.getClass(), "rootContext", null);
        setIntField(term1061, term1061.getClass(), "position", 0);
        setBooleanField(term1061, term1061.getClass(), "startedSetIteration", false);
        setBooleanField(term1061, term1061.getClass(), "done", false);
        setBooleanField(term1061, term1061.getClass(), "hasPerformedIteratorStep", false);
        setField(term1061, term1061.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term1045, args);
        assertTrue(recursiveEquals(term1045, term1061));
    }

};


