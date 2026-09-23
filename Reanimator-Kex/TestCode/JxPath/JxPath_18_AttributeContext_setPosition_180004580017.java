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

public class AttributeContext_setPosition_180004580017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;
     Object term1882;

    public AttributeContext_setPosition_180004580017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setIntField(term1590, term1590.getClass(), "position", 2147483647);
        term1882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term1882, term1882.getClass(), "nodeTest", null);
        setBooleanField(term1882, term1882.getClass(), "setStarted", false);
        setField(term1882, term1882.getClass(), "iterator", null);
        setField(term1882, term1882.getClass(), "currentNodePointer", null);
        setField(term1882, term1882.getClass(), "parentContext", null);
        setField(term1882, term1882.getClass(), "rootContext", null);
        setIntField(term1882, term1882.getClass(), "position", 2147483647);
        setBooleanField(term1882, term1882.getClass(), "startedSetIteration", false);
        setBooleanField(term1882, term1882.getClass(), "done", false);
        setBooleanField(term1882, term1882.getClass(), "hasPerformedIteratorStep", false);
        setField(term1882, term1882.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "setPosition", argTypes, term1590, args);
        assertTrue(recursiveEquals(term1590, term1882));
        assertTrue(recursiveEquals(retValue, true));
    }

};


