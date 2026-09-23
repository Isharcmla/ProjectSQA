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

public class JDOMAttributeIterator_init_206761542864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18541;
     Object term18703;

    public JDOMAttributeIterator_init_206761542864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18299 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term18421 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointer"));
        setIntField(term18299, term18299.getClass(), "position", 0);
        setField(term18299, term18299.getClass(), "parent", term18421);
        setField(term18299, term18299.getClass(), "attributes", null);
        term18541 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term18579 = newInstance(Class.forName("org.jdom.Element"));
        Object term18629 = newInstance(Class.forName("org.jdom.AttributeList"));
        setIntField(term18629, term18629.getClass(), "size", 1);
        setField(term18579, term18579.getClass(), "attributes", term18629);
        setField(term18541, term18541.getClass(), "value", term18579);
        term18703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term18703, term18703.getClass(), "prefix", null);
        setField(term18703, term18703.getClass(), "name", "*");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term18541;
        args[1] = term18703;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


