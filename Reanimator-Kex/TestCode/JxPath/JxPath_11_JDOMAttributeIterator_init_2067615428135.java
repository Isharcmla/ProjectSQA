package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JDOMAttributeIterator_init_2067615428135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61823;

    public JDOMAttributeIterator_init_2067615428135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term61687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term61687, term61687.getClass(), "position", 0);
        setField(term61687, term61687.getClass(), "parent", null);
        term61823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        Object[] term61515 = (Object[]) newArray("java.lang.String", 10);
        setField(term61823, term61823.getClass(), "parent", null);
        setField(term61823, term61823.getClass(), "name", null);
        setElement(term61515, 0, "");
        setElement(term61515, 1, "");
        setElement(term61515, 2, "");
        setElement(term61515, 3, "");
        setElement(term61515, 4, "");
        setElement(term61515, 5, "");
        setElement(term61515, 6, "");
        setElement(term61515, 7, "");
        setElement(term61515, 8, "");
        setElement(term61515, 9, "");
        setField(term61823, term61823.getClass(), "names", term61515);
        setIntField(term61823, term61823.getClass(), "propertyIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term61823;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


