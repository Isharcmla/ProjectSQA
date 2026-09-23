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
import java.lang.ClassCastException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87529;
     Object term87687;

    public DOMAttributeIterator_init_7810902165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term87409 = new ArrayList();
        Object term87283 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term87357 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setIntField(term87283, term87283.getClass(), "position", 0);
        setField(term87283, term87283.getClass(), "parent", null);
        setField(term87283, term87283.getClass(), "name", term87357);
        setField(term87283, term87283.getClass(), "attributes", term87409);
        term87529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term87613 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setShortField(term87613, term87613.getClass(), "nodeType", (short) 1);
        setField(term87529, term87529.getClass(), "value", term87613);
        term87687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term87687, term87687.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term87529;
        args[1] = term87687;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


