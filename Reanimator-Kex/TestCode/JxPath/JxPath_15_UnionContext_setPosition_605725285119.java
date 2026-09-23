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

public class UnionContext_setPosition_605725285119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31422;

    public UnionContext_setPosition_605725285119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31422 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term31262 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term31520 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object term31602 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        Object[] term31273 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        Object term31730 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext"));
        setBooleanField(term31422, term31422.getClass(), "prepared", false);
        setField(term31422, term31422.getClass(), "nodeSet", null);
        setBooleanField(term31520, term31520.getClass(), "startedSet", false);
        setIntField(term31520, term31520.getClass(), "position", -1);
        setBooleanField(term31520, term31520.getClass(), "prepared", false);
        setField(term31520, term31520.getClass(), "nodeSet", term31602);
        setField(term31520, term31520.getClass(), "contexts", term31273);
        setElement(term31262, 0, term31520);
        setElement(term31262, 1, term31730);
        setField(term31422, term31422.getClass(), "contexts", term31262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term31422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


