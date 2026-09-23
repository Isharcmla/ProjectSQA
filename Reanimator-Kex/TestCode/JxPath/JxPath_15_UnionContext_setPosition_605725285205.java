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

public class UnionContext_setPosition_605725285205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114491;

    public UnionContext_setPosition_605725285205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114491 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term114324 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term114597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term114699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term114807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.DescendantContext"));
        setBooleanField(term114491, term114491.getClass(), "prepared", false);
        setField(term114491, term114491.getClass(), "nodeSet", null);
        setBooleanField(term114597, term114597.getClass(), "setStarted", false);
        setField(term114597, term114597.getClass(), "iterator", null);
        setIntField(term114597, term114597.getClass(), "position", 1073741824);
        setBooleanField(term114597, term114597.getClass(), "startedSetIteration", false);
        setBooleanField(term114699, term114699.getClass(), "startedSet", false);
        setIntField(term114699, term114699.getClass(), "position", -639972529);
        setField(term114597, term114597.getClass(), "parentContext", term114699);
        setElement(term114324, 0, term114597);
        setElement(term114324, 1, term114807);
        setField(term114491, term114491.getClass(), "contexts", term114324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term114491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


