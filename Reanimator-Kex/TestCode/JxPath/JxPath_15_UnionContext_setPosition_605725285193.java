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

public class UnionContext_setPosition_605725285193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98709;

    public UnionContext_setPosition_605725285193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term98567 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term98811 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term98911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        setBooleanField(term98709, term98709.getClass(), "prepared", false);
        setField(term98709, term98709.getClass(), "nodeSet", null);
        setBooleanField(term98811, term98811.getClass(), "startedSet", true);
        setElement(term98567, 0, term98811);
        setElement(term98567, 1, term98911);
        setField(term98709, term98709.getClass(), "contexts", term98567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term98709, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


