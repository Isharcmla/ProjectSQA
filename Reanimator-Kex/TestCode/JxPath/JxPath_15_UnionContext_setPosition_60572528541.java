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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnionContext_setPosition_60572528541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8284;

    public UnionContext_setPosition_60572528541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8284 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term8143 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 1);
        Object term8390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term8486 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.RootContext"));
        setBooleanField(term8284, term8284.getClass(), "prepared", false);
        setField(term8284, term8284.getClass(), "nodeSet", null);
        setBooleanField(term8390, term8390.getClass(), "setStarted", false);
        setField(term8390, term8390.getClass(), "iterator", null);
        setIntField(term8390, term8390.getClass(), "position", 0);
        setBooleanField(term8390, term8390.getClass(), "startedSetIteration", false);
        setField(term8390, term8390.getClass(), "parentContext", term8486);
        setElement(term8143, 0, term8390);
        setField(term8284, term8284.getClass(), "contexts", term8143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term8284, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


