package org.apache.commons.jxpath.ri.model.beans;

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
import static org.apache.commons.jxpath.ri.model.beans.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.beans.EqualityUtils.*;
import java.lang.Object;

public class NullPropertyPointer_init_42838933324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1739;

    public NullPropertyPointer_init_42838933324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1739 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"));
        Object term1742 = newInstance(Class.forName("java.lang.Object"));
        setField(term1739, term1739.getClass(), "propertyName", "*");
        setBooleanField(term1739, term1739.getClass(), "byNameAttribute", false);
        setIntField(term1739, term1739.getClass(), "propertyIndex", -2147483648);
        setField(term1739, term1739.getClass(), "bean", null);
        setField(term1739, term1739.getClass(), "value", term1742);
        setIntField(term1739, term1739.getClass(), "index", -2147483648);
        setBooleanField(term1739, term1739.getClass(), "attribute", false);
        setField(term1739, term1739.getClass(), "rootNode", null);
        setField(term1739, term1739.getClass(), "namespaceResolver", null);
        setField(term1739, term1739.getClass(), "parent", null);
        setField(term1739, term1739.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1739));
    }

};


