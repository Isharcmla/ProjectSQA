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

public class DOMAttributeIterator_init_7810902228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122150;
     Object term122434;

    public DOMAttributeIterator_init_7810902228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term122030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term122030, term122030.getClass(), "position", 0);
        setField(term122030, term122030.getClass(), "parent", null);
        setField(term122030, term122030.getClass(), "name", null);
        setField(term122030, term122030.getClass(), "attributes", null);
        term122150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term122236 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term122360 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullElementPointer"));
        setField(term122150, term122150.getClass(), "value", term122236);
        setField(term122150, term122150.getClass(), "namespaceResolver", null);
        setField(term122150, term122150.getClass(), "parent", term122360);
        term122434 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term122434, term122434.getClass(), "name", "          ");
        setField(term122434, term122434.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term122150;
        args[1] = term122434;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


