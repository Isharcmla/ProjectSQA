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

public class UnionContext_setPosition_60572528562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13665;
     Object term13924;

    public UnionContext_setPosition_60572528562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13665 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term13665, term13665.getClass(), "prepared", true);
        setIntField(term13665, term13665.getClass(), "position", 0);
        term13924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setField(term13924, term13924.getClass(), "contexts", null);
        setBooleanField(term13924, term13924.getClass(), "prepared", true);
        setBooleanField(term13924, term13924.getClass(), "startedSet", false);
        setField(term13924, term13924.getClass(), "nodeSet", null);
        setField(term13924, term13924.getClass(), "parentContext", null);
        setField(term13924, term13924.getClass(), "rootContext", null);
        setIntField(term13924, term13924.getClass(), "position", 0);
        setBooleanField(term13924, term13924.getClass(), "startedSetIteration", false);
        setBooleanField(term13924, term13924.getClass(), "done", false);
        setBooleanField(term13924, term13924.getClass(), "hasPerformedIteratorStep", false);
        setField(term13924, term13924.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        callMethod(klass, "setPosition", argTypes, term13665, args);
        assertTrue(recursiveEquals(term13665, term13924));
    }

};


