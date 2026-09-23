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

public class UnionContext_setPosition_605725285118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31156;
     Object term31764;

    public UnionContext_setPosition_605725285118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31156 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term31023 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term31254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term31156, term31156.getClass(), "prepared", false);
        setField(term31156, term31156.getClass(), "nodeSet", null);
        setBooleanField(term31254, term31254.getClass(), "startedSet", true);
        setElement(term31023, 0, term31254);
        setField(term31156, term31156.getClass(), "contexts", term31023);
        term31764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term31765 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term31766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term31766, term31766.getClass(), "contexts", null);
        setBooleanField(term31766, term31766.getClass(), "prepared", false);
        setBooleanField(term31766, term31766.getClass(), "startedSet", true);
        setField(term31766, term31766.getClass(), "nodeSet", null);
        setField(term31766, term31766.getClass(), "parentContext", null);
        setField(term31766, term31766.getClass(), "rootContext", null);
        setIntField(term31766, term31766.getClass(), "position", 0);
        setBooleanField(term31766, term31766.getClass(), "startedSetIteration", false);
        setBooleanField(term31766, term31766.getClass(), "done", false);
        setBooleanField(term31766, term31766.getClass(), "hasPerformedIteratorStep", false);
        setField(term31766, term31766.getClass(), "pointerIterator", null);
        setElement(term31765, 0, term31766);
        setField(term31764, term31764.getClass(), "contexts", term31765);
        setBooleanField(term31764, term31764.getClass(), "prepared", true);
        setBooleanField(term31764, term31764.getClass(), "startedSet", false);
        setField(term31764, term31764.getClass(), "nodeSet", null);
        setField(term31764, term31764.getClass(), "parentContext", null);
        setField(term31764, term31764.getClass(), "rootContext", null);
        setIntField(term31764, term31764.getClass(), "position", 0);
        setBooleanField(term31764, term31764.getClass(), "startedSetIteration", false);
        setBooleanField(term31764, term31764.getClass(), "done", false);
        setBooleanField(term31764, term31764.getClass(), "hasPerformedIteratorStep", false);
        setField(term31764, term31764.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term31156, args);
        assertTrue(recursiveEquals(term31156, term31764));
    }

};


