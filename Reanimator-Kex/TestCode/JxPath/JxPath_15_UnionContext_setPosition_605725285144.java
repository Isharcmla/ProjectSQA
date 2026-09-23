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

public class UnionContext_setPosition_605725285144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41904;

    public UnionContext_setPosition_605725285144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41904 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term41734 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term42002 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term42084 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term41744 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term42180 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        Object term42276 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term41904, term41904.getClass(), "prepared", false);
        setField(term41904, term41904.getClass(), "nodeSet", null);
        setBooleanField(term42002, term42002.getClass(), "startedSet", false);
        setIntField(term42002, term42002.getClass(), "position", 0);
        setBooleanField(term42002, term42002.getClass(), "prepared", false);
        setField(term42002, term42002.getClass(), "nodeSet", term42084);
        setIntField(term42180, term42180.getClass(), "position", 0);
        setBooleanField(term42180, term42180.getClass(), "startedSet", false);
        setBooleanField(term42180, term42180.getClass(), "startedSetIteration", false);
        setField(term42180, term42180.getClass(), "parentContext", term42276);
        setElement(term41744, 0, term42180);
        setField(term42002, term42002.getClass(), "contexts", term41744);
        setElement(term41734, 0, term42002);
        setField(term41904, term41904.getClass(), "contexts", term41734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term41904, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


