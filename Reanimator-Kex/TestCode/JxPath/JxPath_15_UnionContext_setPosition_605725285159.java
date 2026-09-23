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

public class UnionContext_setPosition_605725285159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47269;

    public UnionContext_setPosition_605725285159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext"));
        Object[] term47128 = (Object[]) newArray("org.apache.commons.jxpath.ri.EvalContext", 2);
        Object term47375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.NamespaceContext"));
        Object term47477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.InitialContext"));
        Object term47581 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AncestorContext"));
        setBooleanField(term47269, term47269.getClass(), "prepared", false);
        setField(term47269, term47269.getClass(), "nodeSet", null);
        setBooleanField(term47375, term47375.getClass(), "setStarted", false);
        setField(term47375, term47375.getClass(), "iterator", null);
        setIntField(term47375, term47375.getClass(), "position", 0);
        setBooleanField(term47375, term47375.getClass(), "startedSetIteration", false);
        setField(term47375, term47375.getClass(), "parentContext", term47477);
        setElement(term47128, 0, term47375);
        setElement(term47128, 1, term47581);
        setField(term47269, term47269.getClass(), "contexts", term47128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.UnionContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "setPosition", argTypes, term47269, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


