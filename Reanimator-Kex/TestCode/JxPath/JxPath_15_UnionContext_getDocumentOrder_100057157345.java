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

public class UnionContext_getDocumentOrder_100057157345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9244;
     Object term9668;

    public UnionContext_getDocumentOrder_100057157345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term9130 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term9340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(term9244, term9244.getClass(), "contexts", term9130);
        setField(term9244, term9244.getClass(), "parentContext", term9340);
        term9668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term9669 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term9670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        setField(term9668, term9668.getClass(), "contexts", term9669);
        setBooleanField(term9668, term9668.getClass(), "prepared", false);
        setBooleanField(term9668, term9668.getClass(), "startedSet", false);
        setField(term9668, term9668.getClass(), "nodeSet", null);
        setField(term9670, term9670.getClass(), "jxpathContext", null);
        setField(term9670, term9670.getClass(), "pointer", null);
        setField(term9670, term9670.getClass(), "registers", null);
        setIntField(term9670, term9670.getClass(), "availableRegister", 0);
        setField(term9670, term9670.getClass(), "parentContext", null);
        setField(term9670, term9670.getClass(), "rootContext", null);
        setIntField(term9670, term9670.getClass(), "position", 0);
        setBooleanField(term9670, term9670.getClass(), "startedSetIteration", false);
        setBooleanField(term9670, term9670.getClass(), "done", false);
        setBooleanField(term9670, term9670.getClass(), "hasPerformedIteratorStep", false);
        setField(term9670, term9670.getClass(), "pointerIterator", null);
        setField(term9668, term9668.getClass(), "parentContext", term9670);
        setField(term9668, term9668.getClass(), "rootContext", null);
        setIntField(term9668, term9668.getClass(), "position", 0);
        setBooleanField(term9668, term9668.getClass(), "startedSetIteration", false);
        setBooleanField(term9668, term9668.getClass(), "done", false);
        setBooleanField(term9668, term9668.getClass(), "hasPerformedIteratorStep", false);
        setField(term9668, term9668.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term9244, args);
        assertTrue(recursiveEquals(term9244, term9668));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


