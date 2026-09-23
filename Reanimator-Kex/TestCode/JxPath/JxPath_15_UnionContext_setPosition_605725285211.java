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

public class UnionContext_setPosition_605725285211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119960;

    public UnionContext_setPosition_605725285211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119960 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term119811 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term120060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.ParentContext"));
        Object term120158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        setBooleanField(term119960, term119960.getClass(), "prepared", false);
        setField(term119960, term119960.getClass(), "nodeSet", null);
        setIntField(term120060, term120060.getClass(), "position", 1073741824);
        setBooleanField(term120060, term120060.getClass(), "setStarted", false);
        setBooleanField(term120060, term120060.getClass(), "startedSetIteration", true);
        setIntField(term120158, term120158.getClass(), "position", -1203257633);
        setField(term120060, term120060.getClass(), "parentContext", term120158);
        setElement(term119811, 0, term120060);
        setField(term119960, term119960.getClass(), "contexts", term119811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term119960, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


