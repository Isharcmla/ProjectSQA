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

public class AttributeContext_setPosition_180004580026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3515;
     Object term3909;

    public AttributeContext_setPosition_180004580026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3515 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setIntField(term3515, term3515.getClass(), "position", -2147483648);
        term3909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term3909, term3909.getClass(), "nodeTest", null);
        setBooleanField(term3909, term3909.getClass(), "setStarted", true);
        setField(term3909, term3909.getClass(), "iterator", null);
        setField(term3909, term3909.getClass(), "currentNodePointer", null);
        setField(term3909, term3909.getClass(), "parentContext", null);
        setField(term3909, term3909.getClass(), "rootContext", null);
        setIntField(term3909, term3909.getClass(), "position", -2147483647);
        setBooleanField(term3909, term3909.getClass(), "startedSetIteration", false);
        setBooleanField(term3909, term3909.getClass(), "done", false);
        setBooleanField(term3909, term3909.getClass(), "hasPerformedIteratorStep", false);
        setField(term3909, term3909.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "setPosition", argTypes, term3515, args);
        assertTrue(recursiveEquals(term3515, term3909));
        assertTrue(recursiveEquals(retValue, false));
    }

};


