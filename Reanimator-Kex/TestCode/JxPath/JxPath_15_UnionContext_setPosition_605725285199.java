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

public class UnionContext_setPosition_605725285199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113025;
     Object term113041;

    public UnionContext_setPosition_605725285199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term112852 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term113025, term113025.getClass(), "prepared", false);
        setField(term113025, term113025.getClass(), "nodeSet", null);
        setField(term113025, term113025.getClass(), "contexts", term112852);
        setBooleanField(term113025, term113025.getClass(), "startedSet", false);
        setIntField(term113025, term113025.getClass(), "position", -1);
        term113041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term113042 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setField(term113041, term113041.getClass(), "contexts", term113042);
        setBooleanField(term113041, term113041.getClass(), "prepared", true);
        setBooleanField(term113041, term113041.getClass(), "startedSet", false);
        setField(term113041, term113041.getClass(), "nodeSet", null);
        setField(term113041, term113041.getClass(), "parentContext", null);
        setField(term113041, term113041.getClass(), "rootContext", null);
        setIntField(term113041, term113041.getClass(), "position", 0);
        setBooleanField(term113041, term113041.getClass(), "startedSetIteration", false);
        setBooleanField(term113041, term113041.getClass(), "done", false);
        setBooleanField(term113041, term113041.getClass(), "hasPerformedIteratorStep", false);
        setField(term113041, term113041.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term113025, args);
        assertTrue(recursiveEquals(term113025, term113041));
    }

};


