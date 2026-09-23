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
import static org.apache.commons.jxpath.ri.axes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.axes.EqualityUtils.*;

public class AttributeContext_init_4813036645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;

    public AttributeContext_init_4813036645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term125, term125.getClass(), "nodeTest", null);
        setBooleanField(term125, term125.getClass(), "setStarted", false);
        setField(term125, term125.getClass(), "iterator", null);
        setField(term125, term125.getClass(), "currentNodePointer", null);
        setField(term125, term125.getClass(), "parentContext", null);
        setField(term125, term125.getClass(), "rootContext", null);
        setIntField(term125, term125.getClass(), "position", 0);
        setBooleanField(term125, term125.getClass(), "startedSetIteration", false);
        setBooleanField(term125, term125.getClass(), "done", false);
        setBooleanField(term125, term125.getClass(), "hasPerformedIteratorStep", false);
        setField(term125, term125.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.EvalContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term125));
    }

};


