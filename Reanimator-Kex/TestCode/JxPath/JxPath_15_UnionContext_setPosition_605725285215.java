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

public class UnionContext_setPosition_605725285215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121310;
     Object term121571;

    public UnionContext_setPosition_605725285215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121310 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term121133 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term121408 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term121143 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term121506 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term121310, term121310.getClass(), "prepared", false);
        setField(term121310, term121310.getClass(), "nodeSet", null);
        setBooleanField(term121408, term121408.getClass(), "startedSet", false);
        setIntField(term121408, term121408.getClass(), "position", -1);
        setBooleanField(term121408, term121408.getClass(), "prepared", false);
        setField(term121408, term121408.getClass(), "nodeSet", null);
        setField(term121408, term121408.getClass(), "contexts", term121143);
        setElement(term121133, 0, term121408);
        setBooleanField(term121506, term121506.getClass(), "startedSet", true);
        setElement(term121133, 1, term121506);
        setField(term121310, term121310.getClass(), "contexts", term121133);
        term121571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term121572 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term121573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term121574 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term121575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term121573, term121573.getClass(), "contexts", term121574);
        setBooleanField(term121573, term121573.getClass(), "prepared", true);
        setBooleanField(term121573, term121573.getClass(), "startedSet", true);
        setField(term121573, term121573.getClass(), "nodeSet", null);
        setField(term121573, term121573.getClass(), "parentContext", null);
        setField(term121573, term121573.getClass(), "rootContext", null);
        setIntField(term121573, term121573.getClass(), "position", 0);
        setBooleanField(term121573, term121573.getClass(), "startedSetIteration", false);
        setBooleanField(term121573, term121573.getClass(), "done", false);
        setBooleanField(term121573, term121573.getClass(), "hasPerformedIteratorStep", false);
        setField(term121573, term121573.getClass(), "pointerIterator", null);
        setElement(term121572, 0, term121573);
        setField(term121575, term121575.getClass(), "contexts", null);
        setBooleanField(term121575, term121575.getClass(), "prepared", false);
        setBooleanField(term121575, term121575.getClass(), "startedSet", true);
        setField(term121575, term121575.getClass(), "nodeSet", null);
        setField(term121575, term121575.getClass(), "parentContext", null);
        setField(term121575, term121575.getClass(), "rootContext", null);
        setIntField(term121575, term121575.getClass(), "position", 0);
        setBooleanField(term121575, term121575.getClass(), "startedSetIteration", false);
        setBooleanField(term121575, term121575.getClass(), "done", false);
        setBooleanField(term121575, term121575.getClass(), "hasPerformedIteratorStep", false);
        setField(term121575, term121575.getClass(), "pointerIterator", null);
        setElement(term121572, 1, term121575);
        setField(term121571, term121571.getClass(), "contexts", term121572);
        setBooleanField(term121571, term121571.getClass(), "prepared", true);
        setBooleanField(term121571, term121571.getClass(), "startedSet", false);
        setField(term121571, term121571.getClass(), "nodeSet", null);
        setField(term121571, term121571.getClass(), "parentContext", null);
        setField(term121571, term121571.getClass(), "rootContext", null);
        setIntField(term121571, term121571.getClass(), "position", 0);
        setBooleanField(term121571, term121571.getClass(), "startedSetIteration", false);
        setBooleanField(term121571, term121571.getClass(), "done", false);
        setBooleanField(term121571, term121571.getClass(), "hasPerformedIteratorStep", false);
        setField(term121571, term121571.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term121310, args);
        assertTrue(recursiveEquals(term121310, term121571));
    }

};


