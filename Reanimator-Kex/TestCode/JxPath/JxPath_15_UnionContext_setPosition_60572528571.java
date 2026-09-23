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

public class UnionContext_setPosition_60572528571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16302;

    public UnionContext_setPosition_60572528571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term16163 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term16402 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term16504 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NodeSetContext"));
        setBooleanField(term16302, term16302.getClass(), "prepared", false);
        setField(term16302, term16302.getClass(), "nodeSet", null);
        setIntField(term16402, term16402.getClass(), "position", 0);
        setBooleanField(term16402, term16402.getClass(), "setStarted", false);
        setBooleanField(term16402, term16402.getClass(), "startedSetIteration", true);
        setField(term16402, term16402.getClass(), "parentContext", term16504);
        setElement(term16163, 0, term16402);
        setField(term16302, term16302.getClass(), "contexts", term16163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term16302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


