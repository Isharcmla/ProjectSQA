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

public class UnionContext_getDocumentOrder_100057157359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13375;
     Object term13550;

    public UnionContext_getDocumentOrder_100057157359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term13261 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term13473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term13263 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 489);
        setField(term13375, term13375.getClass(), "contexts", term13261);
        setField(term13473, term13473.getClass(), "contexts", term13263);
        setField(term13375, term13375.getClass(), "parentContext", term13473);
        term13550 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term13551 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term13552 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term13553 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 489);
        setField(term13550, term13550.getClass(), "contexts", term13551);
        setBooleanField(term13550, term13550.getClass(), "prepared", false);
        setBooleanField(term13550, term13550.getClass(), "startedSet", false);
        setField(term13550, term13550.getClass(), "nodeSet", null);
        setField(term13552, term13552.getClass(), "contexts", term13553);
        setBooleanField(term13552, term13552.getClass(), "prepared", false);
        setBooleanField(term13552, term13552.getClass(), "startedSet", false);
        setField(term13552, term13552.getClass(), "nodeSet", null);
        setField(term13552, term13552.getClass(), "parentContext", null);
        setField(term13552, term13552.getClass(), "rootContext", null);
        setIntField(term13552, term13552.getClass(), "position", 0);
        setBooleanField(term13552, term13552.getClass(), "startedSetIteration", false);
        setBooleanField(term13552, term13552.getClass(), "done", false);
        setBooleanField(term13552, term13552.getClass(), "hasPerformedIteratorStep", false);
        setField(term13552, term13552.getClass(), "pointerIterator", null);
        setField(term13550, term13550.getClass(), "parentContext", term13552);
        setField(term13550, term13550.getClass(), "rootContext", null);
        setIntField(term13550, term13550.getClass(), "position", 0);
        setBooleanField(term13550, term13550.getClass(), "startedSetIteration", false);
        setBooleanField(term13550, term13550.getClass(), "done", false);
        setBooleanField(term13550, term13550.getClass(), "hasPerformedIteratorStep", false);
        setField(term13550, term13550.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term13375, args);
        assertTrue(recursiveEquals(term13375, term13550));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


