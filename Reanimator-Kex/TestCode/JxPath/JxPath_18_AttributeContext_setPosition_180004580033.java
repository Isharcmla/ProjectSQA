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

public class AttributeContext_setPosition_180004580033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7027;
     Object term9322;

    public AttributeContext_setPosition_180004580033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setIntField(term7027, term7027.getClass(), "position", -2147483648);
        setBooleanField(term7027, term7027.getClass(), "setStarted", true);
        term9322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term9322, term9322.getClass(), "nodeTest", null);
        setBooleanField(term9322, term9322.getClass(), "setStarted", true);
        setField(term9322, term9322.getClass(), "iterator", null);
        setField(term9322, term9322.getClass(), "currentNodePointer", null);
        setField(term9322, term9322.getClass(), "parentContext", null);
        setField(term9322, term9322.getClass(), "rootContext", null);
        setIntField(term9322, term9322.getClass(), "position", -2147483647);
        setBooleanField(term9322, term9322.getClass(), "startedSetIteration", false);
        setBooleanField(term9322, term9322.getClass(), "done", false);
        setBooleanField(term9322, term9322.getClass(), "hasPerformedIteratorStep", false);
        setField(term9322, term9322.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "setPosition", argTypes, term7027, args);
        assertTrue(recursiveEquals(term7027, term9322));
        assertTrue(recursiveEquals(retValue, false));
    }

};


