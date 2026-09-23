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

public class UnionContext_setPosition_605725285169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50680;

    public UnionContext_setPosition_605725285169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50680 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term50484 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term50778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term50493 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 4);
        Object term50884 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        Object term50982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term51064 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term50508 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term51170 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PredicateContext"));
        setBooleanField(term50680, term50680.getClass(), "prepared", false);
        setField(term50680, term50680.getClass(), "nodeSet", null);
        setBooleanField(term50778, term50778.getClass(), "startedSet", false);
        setIntField(term50778, term50778.getClass(), "position", 0);
        setBooleanField(term50778, term50778.getClass(), "prepared", false);
        setField(term50778, term50778.getClass(), "nodeSet", null);
        setIntField(term50884, term50884.getClass(), "position", 0);
        setIntField(term50982, term50982.getClass(), "position", 0);
        setBooleanField(term50982, term50982.getClass(), "startedSet", false);
        setBooleanField(term50982, term50982.getClass(), "prepared", false);
        setField(term50982, term50982.getClass(), "nodeSet", term51064);
        setField(term50982, term50982.getClass(), "contexts", term50508);
        setField(term50884, term50884.getClass(), "parentContext", term50982);
        setBooleanField(term50884, term50884.getClass(), "done", false);
        setElement(term50493, 0, term50884);
        setElement(term50493, 1, term51170);
        setElement(term50493, 2, term50778);
        setElement(term50493, 3, term50778);
        setField(term50778, term50778.getClass(), "contexts", term50493);
        setElement(term50484, 0, term50778);
        setField(term50680, term50680.getClass(), "contexts", term50484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term50680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


