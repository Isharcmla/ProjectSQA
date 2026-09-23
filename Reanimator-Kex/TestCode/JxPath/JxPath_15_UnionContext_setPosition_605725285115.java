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

public class UnionContext_setPosition_605725285115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30867;
     Object term31012;

    public UnionContext_setPosition_605725285115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30867 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term30709 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term30965 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term30718 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term30867, term30867.getClass(), "prepared", false);
        setField(term30867, term30867.getClass(), "nodeSet", null);
        setBooleanField(term30965, term30965.getClass(), "startedSet", false);
        setIntField(term30965, term30965.getClass(), "position", -1);
        setBooleanField(term30965, term30965.getClass(), "prepared", false);
        setField(term30965, term30965.getClass(), "nodeSet", null);
        setField(term30965, term30965.getClass(), "contexts", term30718);
        setElement(term30709, 0, term30965);
        setField(term30867, term30867.getClass(), "contexts", term30709);
        term31012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term31013 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term31014 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term31015 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setField(term31014, term31014.getClass(), "contexts", term31015);
        setBooleanField(term31014, term31014.getClass(), "prepared", true);
        setBooleanField(term31014, term31014.getClass(), "startedSet", true);
        setField(term31014, term31014.getClass(), "nodeSet", null);
        setField(term31014, term31014.getClass(), "parentContext", null);
        setField(term31014, term31014.getClass(), "rootContext", null);
        setIntField(term31014, term31014.getClass(), "position", 0);
        setBooleanField(term31014, term31014.getClass(), "startedSetIteration", false);
        setBooleanField(term31014, term31014.getClass(), "done", false);
        setBooleanField(term31014, term31014.getClass(), "hasPerformedIteratorStep", false);
        setField(term31014, term31014.getClass(), "pointerIterator", null);
        setElement(term31013, 0, term31014);
        setField(term31012, term31012.getClass(), "contexts", term31013);
        setBooleanField(term31012, term31012.getClass(), "prepared", true);
        setBooleanField(term31012, term31012.getClass(), "startedSet", false);
        setField(term31012, term31012.getClass(), "nodeSet", null);
        setField(term31012, term31012.getClass(), "parentContext", null);
        setField(term31012, term31012.getClass(), "rootContext", null);
        setIntField(term31012, term31012.getClass(), "position", 0);
        setBooleanField(term31012, term31012.getClass(), "startedSetIteration", false);
        setBooleanField(term31012, term31012.getClass(), "done", false);
        setBooleanField(term31012, term31012.getClass(), "hasPerformedIteratorStep", false);
        setField(term31012, term31012.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term30867, args);
        assertTrue(recursiveEquals(term30867, term31012));
    }

};


