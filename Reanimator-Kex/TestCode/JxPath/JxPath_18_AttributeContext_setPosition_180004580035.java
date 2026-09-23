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

public class AttributeContext_setPosition_180004580035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9459;
     Object term9618;

    public AttributeContext_setPosition_180004580035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term9587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        setIntField(term9459, term9459.getClass(), "position", -2147483648);
        setBooleanField(term9459, term9459.getClass(), "setStarted", true);
        setField(term9459, term9459.getClass(), "iterator", term9587);
        term9618 = newInstance(Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext"));
        Object term9619 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespaceIterator"));
        setField(term9618, term9618.getClass(), "nodeTest", null);
        setBooleanField(term9618, term9618.getClass(), "setStarted", true);
        setField(term9619, term9619.getClass(), "parent", null);
        setField(term9619, term9619.getClass(), "namespaces", null);
        setField(term9619, term9619.getClass(), "prefixes", null);
        setIntField(term9619, term9619.getClass(), "position", 0);
        setField(term9618, term9618.getClass(), "iterator", term9619);
        setField(term9618, term9618.getClass(), "currentNodePointer", null);
        setField(term9618, term9618.getClass(), "parentContext", null);
        setField(term9618, term9618.getClass(), "rootContext", null);
        setIntField(term9618, term9618.getClass(), "position", -2147483647);
        setBooleanField(term9618, term9618.getClass(), "startedSetIteration", false);
        setBooleanField(term9618, term9618.getClass(), "done", false);
        setBooleanField(term9618, term9618.getClass(), "hasPerformedIteratorStep", false);
        setField(term9618, term9618.getClass(), "pointerIterator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.axes.AttributeContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2147483647;
        Object retValue = callMethod(klass, "setPosition", argTypes, term9459, args);
        assertTrue(recursiveEquals(term9459, term9618));
        assertTrue(recursiveEquals(retValue, false));
    }

};


