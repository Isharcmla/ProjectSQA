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
import java.lang.Object;

public class AttributeContext_setPosition_180004580013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term906;
     Object term1050;

    public AttributeContext_setPosition_180004580013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term906 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term1030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term906, term906.getClass(), "position", 131073);
        setBooleanField(term906, term906.getClass(), "setStarted", false);
        setField(term906, term906.getClass(), "iterator", term1030);
        term1050 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        setField(term1050, term1050.getClass(), "nodeTest", null);
        setBooleanField(term1050, term1050.getClass(), "setStarted", true);
        setField(term1050, term1050.getClass(), "iterator", null);
        setField(term1050, term1050.getClass(), "currentNodePointer", null);
        setField(term1050, term1050.getClass(), "parentContext", null);
        setField(term1050, term1050.getClass(), "rootContext", null);
        setIntField(term1050, term1050.getClass(), "position", 1);
        setBooleanField(term1050, term1050.getClass(), "startedSetIteration", false);
        setBooleanField(term1050, term1050.getClass(), "done", false);
        setBooleanField(term1050, term1050.getClass(), "hasPerformedIteratorStep", false);
        setField(term1050, term1050.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 131072;
        Object retValue = callMethod(klass, "setPosition", argTypes, term906, args);
        assertTrue(recursiveEquals(term906, term1050));
        assertTrue(recursiveEquals(retValue, false));
    }

};


