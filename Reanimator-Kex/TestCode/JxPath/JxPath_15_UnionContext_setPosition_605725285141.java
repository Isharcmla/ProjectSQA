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
import java.util.ArrayList;

public class UnionContext_setPosition_605725285141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41219;
     Object term41723;

    public UnionContext_setPosition_605725285141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term41401 = new ArrayList();
        term41219 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term41349 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setBooleanField(term41219, term41219.getClass(), "prepared", true);
        setIntField(term41219, term41219.getClass(), "position", 0);
        setField(term41349, term41349.getClass(), "pointers", term41401);
        setField(term41219, term41219.getClass(), "nodeSet", term41349);
        ArrayList term41725 = new ArrayList();
        term41723 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term41724 = newInstance(Class.forName("org.apache.commons.jxpath.util.BasicTypeConverter$ValueNodeSet"));
        setField(term41723, term41723.getClass(), "contexts", null);
        setBooleanField(term41723, term41723.getClass(), "prepared", true);
        setBooleanField(term41723, term41723.getClass(), "startedSet", false);
        setField(term41724, term41724.getClass(), "values", null);
        setField(term41724, term41724.getClass(), "pointers", term41725);
        setField(term41723, term41723.getClass(), "nodeSet", term41724);
        setField(term41723, term41723.getClass(), "parentContext", null);
        setField(term41723, term41723.getClass(), "rootContext", null);
        setIntField(term41723, term41723.getClass(), "position", 1);
        setBooleanField(term41723, term41723.getClass(), "startedSetIteration", false);
        setBooleanField(term41723, term41723.getClass(), "done", false);
        setBooleanField(term41723, term41723.getClass(), "hasPerformedIteratorStep", false);
        setField(term41723, term41723.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        callMethod(klass, "setPosition", argTypes, term41219, args);
        assertTrue(recursiveEquals(term41219, term41723));
    }

};


