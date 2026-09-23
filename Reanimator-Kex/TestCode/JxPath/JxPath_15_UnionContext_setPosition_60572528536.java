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

public class UnionContext_setPosition_60572528536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6810;

    public UnionContext_setPosition_60572528536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6810 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term6670 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term6910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term7012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term6810, term6810.getClass(), "prepared", false);
        setField(term6810, term6810.getClass(), "nodeSet", null);
        setIntField(term6910, term6910.getClass(), "position", 0);
        setBooleanField(term6910, term6910.getClass(), "setStarted", false);
        setBooleanField(term6910, term6910.getClass(), "startedSetIteration", false);
        setField(term6910, term6910.getClass(), "parentContext", term7012);
        setElement(term6670, 0, term6910);
        setField(term6810, term6810.getClass(), "contexts", term6670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term6810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


