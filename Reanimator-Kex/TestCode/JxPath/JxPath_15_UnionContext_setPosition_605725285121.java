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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_605725285121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32263;

    public UnionContext_setPosition_605725285121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term32105 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term32369 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term32467 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ChildContext"));
        setBooleanField(term32263, term32263.getClass(), "prepared", false);
        setField(term32263, term32263.getClass(), "nodeSet", null);
        setBooleanField(term32369, term32369.getClass(), "setStarted", false);
        setField(term32369, term32369.getClass(), "iterator", null);
        setIntField(term32369, term32369.getClass(), "position", 0);
        setBooleanField(term32369, term32369.getClass(), "startedSetIteration", false);
        setField(term32369, term32369.getClass(), "parentContext", term32467);
        setElement(term32105, 0, term32369);
        setField(term32263, term32263.getClass(), "contexts", term32105);
        setBooleanField(term32263, term32263.getClass(), "startedSet", false);
        setIntField(term32263, term32263.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term32263, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


