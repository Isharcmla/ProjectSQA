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

public class UnionContext_setPosition_605725285171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52131;
     Object term52379;

    public UnionContext_setPosition_605725285171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term51983 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term52229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term52327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term52131, term52131.getClass(), "prepared", false);
        setField(term52131, term52131.getClass(), "nodeSet", null);
        setBooleanField(term52229, term52229.getClass(), "startedSet", true);
        setElement(term51983, 0, term52229);
        setBooleanField(term52327, term52327.getClass(), "startedSet", true);
        setElement(term51983, 1, term52327);
        setField(term52131, term52131.getClass(), "contexts", term51983);
        term52379 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term52380 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term52381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term52382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term52381, term52381.getClass(), "contexts", null);
        setBooleanField(term52381, term52381.getClass(), "prepared", false);
        setBooleanField(term52381, term52381.getClass(), "startedSet", true);
        setField(term52381, term52381.getClass(), "nodeSet", null);
        setField(term52381, term52381.getClass(), "parentContext", null);
        setField(term52381, term52381.getClass(), "rootContext", null);
        setIntField(term52381, term52381.getClass(), "position", 0);
        setBooleanField(term52381, term52381.getClass(), "startedSetIteration", false);
        setBooleanField(term52381, term52381.getClass(), "done", false);
        setBooleanField(term52381, term52381.getClass(), "hasPerformedIteratorStep", false);
        setField(term52381, term52381.getClass(), "pointerIterator", null);
        setElement(term52380, 0, term52381);
        setField(term52382, term52382.getClass(), "contexts", null);
        setBooleanField(term52382, term52382.getClass(), "prepared", false);
        setBooleanField(term52382, term52382.getClass(), "startedSet", true);
        setField(term52382, term52382.getClass(), "nodeSet", null);
        setField(term52382, term52382.getClass(), "parentContext", null);
        setField(term52382, term52382.getClass(), "rootContext", null);
        setIntField(term52382, term52382.getClass(), "position", 0);
        setBooleanField(term52382, term52382.getClass(), "startedSetIteration", false);
        setBooleanField(term52382, term52382.getClass(), "done", false);
        setBooleanField(term52382, term52382.getClass(), "hasPerformedIteratorStep", false);
        setField(term52382, term52382.getClass(), "pointerIterator", null);
        setElement(term52380, 1, term52382);
        setField(term52379, term52379.getClass(), "contexts", term52380);
        setBooleanField(term52379, term52379.getClass(), "prepared", true);
        setBooleanField(term52379, term52379.getClass(), "startedSet", false);
        setField(term52379, term52379.getClass(), "nodeSet", null);
        setField(term52379, term52379.getClass(), "parentContext", null);
        setField(term52379, term52379.getClass(), "rootContext", null);
        setIntField(term52379, term52379.getClass(), "position", 0);
        setBooleanField(term52379, term52379.getClass(), "startedSetIteration", false);
        setBooleanField(term52379, term52379.getClass(), "done", false);
        setBooleanField(term52379, term52379.getClass(), "hasPerformedIteratorStep", false);
        setField(term52379, term52379.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term52131, args);
        assertTrue(recursiveEquals(term52131, term52379));
    }

};


