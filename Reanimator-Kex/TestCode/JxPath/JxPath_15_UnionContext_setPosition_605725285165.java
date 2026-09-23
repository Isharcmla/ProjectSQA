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

public class UnionContext_setPosition_605725285165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49514;

    public UnionContext_setPosition_605725285165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term49346 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term49612 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term49355 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 0);
        setBooleanField(term49514, term49514.getClass(), "prepared", false);
        setField(term49514, term49514.getClass(), "nodeSet", null);
        setBooleanField(term49612, term49612.getClass(), "startedSet", false);
        setIntField(term49612, term49612.getClass(), "position", -1);
        setBooleanField(term49612, term49612.getClass(), "prepared", false);
        setField(term49612, term49612.getClass(), "nodeSet", null);
        setField(term49612, term49612.getClass(), "contexts", term49355);
        setElement(term49346, 0, term49612);
        setElement(term49346, 1, term49514);
        setField(term49514, term49514.getClass(), "contexts", term49346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term49514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


