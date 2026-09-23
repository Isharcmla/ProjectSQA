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

public class UnionContext_setPosition_60572528549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10073;

    public UnionContext_setPosition_60572528549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term9921 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term10179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term10281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term10363 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term10073, term10073.getClass(), "prepared", false);
        setField(term10073, term10073.getClass(), "nodeSet", null);
        setBooleanField(term10179, term10179.getClass(), "setStarted", false);
        setField(term10179, term10179.getClass(), "iterator", null);
        setIntField(term10179, term10179.getClass(), "position", 8);
        setBooleanField(term10179, term10179.getClass(), "startedSetIteration", false);
        setBooleanField(term10281, term10281.getClass(), "startedSet", false);
        setIntField(term10281, term10281.getClass(), "position", 0);
        setField(term10281, term10281.getClass(), "nodeSet", term10363);
        setField(term10179, term10179.getClass(), "parentContext", term10281);
        setElement(term9921, 0, term10179);
        setField(term10073, term10073.getClass(), "contexts", term9921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term10073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


