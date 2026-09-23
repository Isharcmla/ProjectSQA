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

public class UnionContext_setPosition_605725285189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97298;

    public UnionContext_setPosition_605725285189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97298 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term97151 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term97398 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term97500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        Object term97582 = newInstance(Class.forName("org.apache.commons.jxpath.BasicNodeSet"));
        setBooleanField(term97298, term97298.getClass(), "prepared", false);
        setField(term97298, term97298.getClass(), "nodeSet", null);
        setIntField(term97398, term97398.getClass(), "position", 1073741824);
        setBooleanField(term97398, term97398.getClass(), "setStarted", false);
        setBooleanField(term97398, term97398.getClass(), "startedSetIteration", true);
        setIntField(term97500, term97500.getClass(), "position", 0);
        setField(term97500, term97500.getClass(), "nodeSet", term97582);
        setField(term97398, term97398.getClass(), "parentContext", term97500);
        setElement(term97151, 0, term97398);
        setField(term97298, term97298.getClass(), "contexts", term97151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term97298, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


