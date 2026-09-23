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

public class UnionContext_setPosition_60572528589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22248;

    public UnionContext_setPosition_60572528589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term22092 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term22346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term22428 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term22102 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term22248, term22248.getClass(), "prepared", false);
        setField(term22248, term22248.getClass(), "nodeSet", null);
        setBooleanField(term22346, term22346.getClass(), "startedSet", false);
        setIntField(term22346, term22346.getClass(), "position", 0);
        setBooleanField(term22346, term22346.getClass(), "prepared", false);
        setField(term22346, term22346.getClass(), "nodeSet", term22428);
        setField(term22346, term22346.getClass(), "contexts", term22102);
        setElement(term22092, 0, term22346);
        setField(term22248, term22248.getClass(), "contexts", term22092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term22248, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


