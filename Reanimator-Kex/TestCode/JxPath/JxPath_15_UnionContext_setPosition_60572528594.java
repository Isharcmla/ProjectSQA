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

public class UnionContext_setPosition_60572528594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23433;

    public UnionContext_setPosition_60572528594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term23294 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term23533 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term23633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        setBooleanField(term23433, term23433.getClass(), "prepared", false);
        setField(term23433, term23433.getClass(), "nodeSet", null);
        setIntField(term23533, term23533.getClass(), "position", 0);
        setBooleanField(term23533, term23533.getClass(), "setStarted", false);
        setBooleanField(term23533, term23533.getClass(), "startedSetIteration", false);
        setField(term23533, term23533.getClass(), "parentContext", term23633);
        setElement(term23294, 0, term23533);
        setField(term23433, term23433.getClass(), "contexts", term23294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term23433, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


