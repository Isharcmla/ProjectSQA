package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DOMAttributeIterator_init_7810902369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9649378;
     Object term9649634;

    public DOMAttributeIterator_init_7810902369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9649184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term9649258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term9649184, term9649184.getClass(), "position", 0);
        setField(term9649184, term9649184.getClass(), "parent", null);
        setField(term9649184, term9649184.getClass(), "name", term9649258);
        setField(term9649184, term9649184.getClass(), "attributes", null);
        term9649378 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term9649462 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        Object term9649560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term9649378, term9649378.getClass(), "value", term9649462);
        setField(term9649378, term9649378.getClass(), "namespaceResolver", term9649560);
        term9649634 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term9649634, term9649634.getClass(), "name", "");
        setField(term9649634, term9649634.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term9649378;
        args[1] = term9649634;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


