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

public class UnionContext_setPosition_605725285147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43833;
     Object term43975;

    public UnionContext_setPosition_605725285147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43833 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term43691 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term43935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term43833, term43833.getClass(), "prepared", false);
        setField(term43833, term43833.getClass(), "nodeSet", null);
        setBooleanField(term43935, term43935.getClass(), "startedSet", false);
        setIntField(term43935, term43935.getClass(), "position", -1);
        setElement(term43691, 0, term43935);
        setField(term43833, term43833.getClass(), "contexts", term43691);
        term43975 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term43976 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term43977 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term43977, term43977.getClass(), "startedSet", true);
        setField(term43977, term43977.getClass(), "nodeSet", null);
        setField(term43977, term43977.getClass(), "parentContext", null);
        setField(term43977, term43977.getClass(), "rootContext", null);
        setIntField(term43977, term43977.getClass(), "position", 0);
        setBooleanField(term43977, term43977.getClass(), "startedSetIteration", false);
        setBooleanField(term43977, term43977.getClass(), "done", false);
        setBooleanField(term43977, term43977.getClass(), "hasPerformedIteratorStep", false);
        setField(term43977, term43977.getClass(), "pointerIterator", null);
        setElement(term43976, 0, term43977);
        setField(term43975, term43975.getClass(), "contexts", term43976);
        setBooleanField(term43975, term43975.getClass(), "prepared", true);
        setBooleanField(term43975, term43975.getClass(), "startedSet", false);
        setField(term43975, term43975.getClass(), "nodeSet", null);
        setField(term43975, term43975.getClass(), "parentContext", null);
        setField(term43975, term43975.getClass(), "rootContext", null);
        setIntField(term43975, term43975.getClass(), "position", 0);
        setBooleanField(term43975, term43975.getClass(), "startedSetIteration", false);
        setBooleanField(term43975, term43975.getClass(), "done", false);
        setBooleanField(term43975, term43975.getClass(), "hasPerformedIteratorStep", false);
        setField(term43975, term43975.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term43833, args);
        assertTrue(recursiveEquals(term43833, term43975));
    }

};


