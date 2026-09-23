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

public class UnionContext_setPosition_60572528544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8926;

    public UnionContext_setPosition_60572528544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term8785 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term9032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term9128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.SelfContext"));
        setBooleanField(term8926, term8926.getClass(), "prepared", false);
        setField(term8926, term8926.getClass(), "nodeSet", null);
        setBooleanField(term9032, term9032.getClass(), "setStarted", false);
        setField(term9032, term9032.getClass(), "iterator", null);
        setIntField(term9032, term9032.getClass(), "position", 0);
        setBooleanField(term9032, term9032.getClass(), "startedSetIteration", false);
        setField(term9032, term9032.getClass(), "parentContext", term9128);
        setElement(term8785, 0, term9032);
        setField(term8926, term8926.getClass(), "contexts", term8785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term8926, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


