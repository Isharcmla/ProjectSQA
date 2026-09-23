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

public class JDOMAttributeIterator_init_2067615428179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98209;

    public JDOMAttributeIterator_init_2067615428179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term98067 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setIntField(term97939, term97939.getClass(), "position", 0);
        setField(term97939, term97939.getClass(), "parent", term98067);
        term98209 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term98335 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term98461 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term98461, term98461.getClass(), "parent", null);
        setField(term98335, term98335.getClass(), "parent", term98461);
        setField(term98209, term98209.getClass(), "parent", term98335);
        setField(term98209, term98209.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term98209;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


