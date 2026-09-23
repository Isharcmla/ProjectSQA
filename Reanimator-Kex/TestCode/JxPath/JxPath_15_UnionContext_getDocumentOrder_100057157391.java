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

public class UnionContext_getDocumentOrder_100057157391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23148;
     Object term23284;

    public UnionContext_getDocumentOrder_100057157391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23148 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term23034 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term23254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        setField(term23148, term23148.getClass(), "contexts", term23034);
        setField(term23148, term23148.getClass(), "parentContext", term23254);
        term23284 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term23285 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term23286 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        setField(term23284, term23284.getClass(), "contexts", term23285);
        setBooleanField(term23284, term23284.getClass(), "prepared", false);
        setBooleanField(term23284, term23284.getClass(), "startedSet", false);
        setField(term23284, term23284.getClass(), "nodeSet", null);
        setField(term23286, term23286.getClass(), "nodeTest", null);
        setBooleanField(term23286, term23286.getClass(), "setStarted", false);
        setField(term23286, term23286.getClass(), "iterator", null);
        setField(term23286, term23286.getClass(), "currentNodePointer", null);
        setField(term23286, term23286.getClass(), "parentContext", null);
        setField(term23286, term23286.getClass(), "rootContext", null);
        setIntField(term23286, term23286.getClass(), "position", 0);
        setBooleanField(term23286, term23286.getClass(), "startedSetIteration", false);
        setBooleanField(term23286, term23286.getClass(), "done", false);
        setBooleanField(term23286, term23286.getClass(), "hasPerformedIteratorStep", false);
        setField(term23286, term23286.getClass(), "pointerIterator", null);
        setField(term23284, term23284.getClass(), "parentContext", term23286);
        setField(term23284, term23284.getClass(), "rootContext", null);
        setIntField(term23284, term23284.getClass(), "position", 0);
        setBooleanField(term23284, term23284.getClass(), "startedSetIteration", false);
        setBooleanField(term23284, term23284.getClass(), "done", false);
        setBooleanField(term23284, term23284.getClass(), "hasPerformedIteratorStep", false);
        setField(term23284, term23284.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocumentOrder", argTypes, term23148, args);
        assertTrue(recursiveEquals(term23148, term23284));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


