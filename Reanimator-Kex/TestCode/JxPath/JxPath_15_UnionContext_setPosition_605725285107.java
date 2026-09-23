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

public class UnionContext_setPosition_605725285107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28235;
     Object term28377;

    public UnionContext_setPosition_605725285107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term28091 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term28333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term28235, term28235.getClass(), "prepared", false);
        setField(term28235, term28235.getClass(), "nodeSet", null);
        setBooleanField(term28333, term28333.getClass(), "startedSet", false);
        setIntField(term28333, term28333.getClass(), "position", -1);
        setBooleanField(term28333, term28333.getClass(), "prepared", true);
        setElement(term28091, 0, term28333);
        setField(term28235, term28235.getClass(), "contexts", term28091);
        term28377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term28378 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term28379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term28379, term28379.getClass(), "contexts", null);
        setBooleanField(term28379, term28379.getClass(), "prepared", true);
        setBooleanField(term28379, term28379.getClass(), "startedSet", true);
        setField(term28379, term28379.getClass(), "nodeSet", null);
        setField(term28379, term28379.getClass(), "parentContext", null);
        setField(term28379, term28379.getClass(), "rootContext", null);
        setIntField(term28379, term28379.getClass(), "position", 0);
        setBooleanField(term28379, term28379.getClass(), "startedSetIteration", false);
        setBooleanField(term28379, term28379.getClass(), "done", false);
        setBooleanField(term28379, term28379.getClass(), "hasPerformedIteratorStep", false);
        setField(term28379, term28379.getClass(), "pointerIterator", null);
        setElement(term28378, 0, term28379);
        setField(term28377, term28377.getClass(), "contexts", term28378);
        setBooleanField(term28377, term28377.getClass(), "prepared", true);
        setBooleanField(term28377, term28377.getClass(), "startedSet", false);
        setField(term28377, term28377.getClass(), "nodeSet", null);
        setField(term28377, term28377.getClass(), "parentContext", null);
        setField(term28377, term28377.getClass(), "rootContext", null);
        setIntField(term28377, term28377.getClass(), "position", 0);
        setBooleanField(term28377, term28377.getClass(), "startedSetIteration", false);
        setBooleanField(term28377, term28377.getClass(), "done", false);
        setBooleanField(term28377, term28377.getClass(), "hasPerformedIteratorStep", false);
        setField(term28377, term28377.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term28235, args);
        assertTrue(recursiveEquals(term28235, term28377));
    }

};


