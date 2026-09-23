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

public class UnionContext_setPosition_605725285125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33426;

    public UnionContext_setPosition_605725285125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33426 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term33270 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term33524 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term33606 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term33280 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term33702 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term33426, term33426.getClass(), "prepared", false);
        setField(term33426, term33426.getClass(), "nodeSet", null);
        setBooleanField(term33524, term33524.getClass(), "startedSet", false);
        setIntField(term33524, term33524.getClass(), "position", 0);
        setBooleanField(term33524, term33524.getClass(), "prepared", false);
        setField(term33524, term33524.getClass(), "nodeSet", term33606);
        setElement(term33280, 0, term33702);
        setElement(term33280, 1, term33524);
        setField(term33524, term33524.getClass(), "contexts", term33280);
        setElement(term33270, 0, term33524);
        setField(term33426, term33426.getClass(), "contexts", term33270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term33426, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


