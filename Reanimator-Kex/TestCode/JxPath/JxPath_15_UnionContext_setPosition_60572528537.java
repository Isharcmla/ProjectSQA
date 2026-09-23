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

public class UnionContext_setPosition_60572528537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7161;
     Object term7730;

    public UnionContext_setPosition_60572528537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term7020 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term7267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term7365 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term7161, term7161.getClass(), "prepared", false);
        setField(term7161, term7161.getClass(), "nodeSet", null);
        setBooleanField(term7267, term7267.getClass(), "setStarted", false);
        setField(term7267, term7267.getClass(), "iterator", null);
        setIntField(term7267, term7267.getClass(), "position", 0);
        setBooleanField(term7267, term7267.getClass(), "startedSetIteration", false);
        setBooleanField(term7365, term7365.getClass(), "startedSet", true);
        setField(term7267, term7267.getClass(), "parentContext", term7365);
        setElement(term7020, 0, term7267);
        setField(term7161, term7161.getClass(), "contexts", term7020);
        term7730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term7731 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term7732 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term7733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term7732, term7732.getClass(), "nodeTest", null);
        setBooleanField(term7732, term7732.getClass(), "setStarted", false);
        setField(term7732, term7732.getClass(), "iterator", null);
        setField(term7732, term7732.getClass(), "currentNodePointer", null);
        setField(term7733, term7733.getClass(), "contexts", null);
        setBooleanField(term7733, term7733.getClass(), "prepared", false);
        setBooleanField(term7733, term7733.getClass(), "startedSet", true);
        setField(term7733, term7733.getClass(), "nodeSet", null);
        setField(term7733, term7733.getClass(), "parentContext", null);
        setField(term7733, term7733.getClass(), "rootContext", null);
        setIntField(term7733, term7733.getClass(), "position", 0);
        setBooleanField(term7733, term7733.getClass(), "startedSetIteration", false);
        setBooleanField(term7733, term7733.getClass(), "done", false);
        setBooleanField(term7733, term7733.getClass(), "hasPerformedIteratorStep", false);
        setField(term7733, term7733.getClass(), "pointerIterator", null);
        setField(term7732, term7732.getClass(), "parentContext", term7733);
        setField(term7732, term7732.getClass(), "rootContext", null);
        setIntField(term7732, term7732.getClass(), "position", 0);
        setBooleanField(term7732, term7732.getClass(), "startedSetIteration", true);
        setBooleanField(term7732, term7732.getClass(), "done", false);
        setBooleanField(term7732, term7732.getClass(), "hasPerformedIteratorStep", false);
        setField(term7732, term7732.getClass(), "pointerIterator", null);
        setElement(term7731, 0, term7732);
        setField(term7730, term7730.getClass(), "contexts", term7731);
        setBooleanField(term7730, term7730.getClass(), "prepared", true);
        setBooleanField(term7730, term7730.getClass(), "startedSet", false);
        setField(term7730, term7730.getClass(), "nodeSet", null);
        setField(term7730, term7730.getClass(), "parentContext", null);
        setField(term7730, term7730.getClass(), "rootContext", null);
        setIntField(term7730, term7730.getClass(), "position", 0);
        setBooleanField(term7730, term7730.getClass(), "startedSetIteration", false);
        setBooleanField(term7730, term7730.getClass(), "done", false);
        setBooleanField(term7730, term7730.getClass(), "hasPerformedIteratorStep", false);
        setField(term7730, term7730.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term7161, args);
        assertTrue(recursiveEquals(term7161, term7730));
    }

};


