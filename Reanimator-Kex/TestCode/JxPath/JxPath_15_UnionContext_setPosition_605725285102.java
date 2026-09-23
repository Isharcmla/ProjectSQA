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

public class UnionContext_setPosition_605725285102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26134;
     Object term26985;

    public UnionContext_setPosition_605725285102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term25982 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term26234 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term26336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term26134, term26134.getClass(), "prepared", false);
        setField(term26134, term26134.getClass(), "nodeSet", null);
        setIntField(term26234, term26234.getClass(), "position", 268435456);
        setBooleanField(term26234, term26234.getClass(), "setStarted", false);
        setBooleanField(term26234, term26234.getClass(), "startedSetIteration", false);
        setBooleanField(term26336, term26336.getClass(), "startedSet", false);
        setIntField(term26336, term26336.getClass(), "position", -1555933479);
        setField(term26234, term26234.getClass(), "parentContext", term26336);
        setElement(term25982, 0, term26234);
        setField(term26134, term26134.getClass(), "contexts", term25982);
        term26985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term26986 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term26987 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term26988 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setField(term26987, term26987.getClass(), "nodeTest", null);
        setBooleanField(term26987, term26987.getClass(), "setStarted", false);
        setField(term26987, term26987.getClass(), "currentNodePointer", null);
        setBooleanField(term26988, term26988.getClass(), "startedSet", true);
        setField(term26988, term26988.getClass(), "nodeSet", null);
        setField(term26988, term26988.getClass(), "parentContext", null);
        setField(term26988, term26988.getClass(), "rootContext", null);
        setIntField(term26988, term26988.getClass(), "position", -1555933478);
        setBooleanField(term26988, term26988.getClass(), "startedSetIteration", false);
        setBooleanField(term26988, term26988.getClass(), "done", false);
        setBooleanField(term26988, term26988.getClass(), "hasPerformedIteratorStep", false);
        setField(term26988, term26988.getClass(), "pointerIterator", null);
        setField(term26987, term26987.getClass(), "parentContext", term26988);
        setField(term26987, term26987.getClass(), "rootContext", null);
        setIntField(term26987, term26987.getClass(), "position", 0);
        setBooleanField(term26987, term26987.getClass(), "startedSetIteration", true);
        setBooleanField(term26987, term26987.getClass(), "done", false);
        setBooleanField(term26987, term26987.getClass(), "hasPerformedIteratorStep", false);
        setField(term26987, term26987.getClass(), "pointerIterator", null);
        setElement(term26986, 0, term26987);
        setField(term26985, term26985.getClass(), "contexts", term26986);
        setBooleanField(term26985, term26985.getClass(), "prepared", true);
        setBooleanField(term26985, term26985.getClass(), "startedSet", false);
        setField(term26985, term26985.getClass(), "nodeSet", null);
        setField(term26985, term26985.getClass(), "parentContext", null);
        setField(term26985, term26985.getClass(), "rootContext", null);
        setIntField(term26985, term26985.getClass(), "position", 0);
        setBooleanField(term26985, term26985.getClass(), "startedSetIteration", false);
        setBooleanField(term26985, term26985.getClass(), "done", false);
        setBooleanField(term26985, term26985.getClass(), "hasPerformedIteratorStep", false);
        setField(term26985, term26985.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term26134, args);
        assertTrue(recursiveEquals(term26134, term26985));
    }

};


