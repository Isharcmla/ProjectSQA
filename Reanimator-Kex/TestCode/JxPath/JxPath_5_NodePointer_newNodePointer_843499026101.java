package org.apache.commons.jxpath.ri.model;

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
import static org.apache.commons.jxpath.ri.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.EqualityUtils.*;
import java.lang.Object;

public class NodePointer_newNodePointer_843499026101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36412;

    public NodePointer_newNodePointer_843499026101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term36413 = newInstance(Class.forName("java.lang.Object"));
        setField(term36412, term36412.getClass(), "name", null);
        setField(term36412, term36412.getClass(), "id", null);
        setField(term36412, term36412.getClass(), "value", term36413);
        setIntField(term36412, term36412.getClass(), "index", -2147483648);
        setBooleanField(term36412, term36412.getClass(), "attribute", false);
        setField(term36412, term36412.getClass(), "rootNode", null);
        setField(term36412, term36412.getClass(), "namespaceResolver", null);
        setField(term36412, term36412.getClass(), "parent", null);
        setField(term36412, term36412.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "newNodePointer", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term36412));
    }

};


