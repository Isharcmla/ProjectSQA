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

public class UnionContext_setPosition_605725285178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54467;
     Object term55138;

    public UnionContext_setPosition_605725285178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54467 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term54326 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term54573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term54675 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.InitialContext"));
        setBooleanField(term54467, term54467.getClass(), "prepared", false);
        setField(term54467, term54467.getClass(), "nodeSet", null);
        setBooleanField(term54573, term54573.getClass(), "setStarted", false);
        setField(term54573, term54573.getClass(), "iterator", null);
        setIntField(term54573, term54573.getClass(), "position", 0);
        setBooleanField(term54573, term54573.getClass(), "startedSetIteration", false);
        setField(term54573, term54573.getClass(), "parentContext", term54675);
        setElement(term54326, 0, term54573);
        setField(term54467, term54467.getClass(), "contexts", term54326);
        term55138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term55139 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term55140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term55141 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.InitialContext"));
        setField(term55140, term55140.getClass(), "nodeTest", null);
        setBooleanField(term55140, term55140.getClass(), "setStarted", false);
        setField(term55140, term55140.getClass(), "iterator", null);
        setField(term55140, term55140.getClass(), "currentNodePointer", null);
        setBooleanField(term55141, term55141.getClass(), "started", true);
        setBooleanField(term55141, term55141.getClass(), "collection", false);
        setField(term55141, term55141.getClass(), "nodePointer", null);
        setField(term55141, term55141.getClass(), "parentContext", null);
        setField(term55141, term55141.getClass(), "rootContext", null);
        setIntField(term55141, term55141.getClass(), "position", 2);
        setBooleanField(term55141, term55141.getClass(), "startedSetIteration", false);
        setBooleanField(term55141, term55141.getClass(), "done", false);
        setBooleanField(term55141, term55141.getClass(), "hasPerformedIteratorStep", false);
        setField(term55141, term55141.getClass(), "pointerIterator", null);
        setField(term55140, term55140.getClass(), "parentContext", term55141);
        setField(term55140, term55140.getClass(), "rootContext", null);
        setIntField(term55140, term55140.getClass(), "position", 0);
        setBooleanField(term55140, term55140.getClass(), "startedSetIteration", true);
        setBooleanField(term55140, term55140.getClass(), "done", false);
        setBooleanField(term55140, term55140.getClass(), "hasPerformedIteratorStep", false);
        setField(term55140, term55140.getClass(), "pointerIterator", null);
        setElement(term55139, 0, term55140);
        setField(term55138, term55138.getClass(), "contexts", term55139);
        setBooleanField(term55138, term55138.getClass(), "prepared", true);
        setBooleanField(term55138, term55138.getClass(), "startedSet", false);
        setField(term55138, term55138.getClass(), "nodeSet", null);
        setField(term55138, term55138.getClass(), "parentContext", null);
        setField(term55138, term55138.getClass(), "rootContext", null);
        setIntField(term55138, term55138.getClass(), "position", 0);
        setBooleanField(term55138, term55138.getClass(), "startedSetIteration", false);
        setBooleanField(term55138, term55138.getClass(), "done", false);
        setBooleanField(term55138, term55138.getClass(), "hasPerformedIteratorStep", false);
        setField(term55138, term55138.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term54467, args);
        assertTrue(recursiveEquals(term54467, term55138));
    }

};


