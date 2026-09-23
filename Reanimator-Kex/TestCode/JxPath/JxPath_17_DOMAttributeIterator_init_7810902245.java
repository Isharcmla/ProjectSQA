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

public class DOMAttributeIterator_init_7810902245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133103;
     Object term133389;

    public DOMAttributeIterator_init_7810902245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        setIntField(term132983, term132983.getClass(), "position", 0);
        setField(term132983, term132983.getClass(), "parent", null);
        setField(term132983, term132983.getClass(), "name", null);
        setField(term132983, term132983.getClass(), "attributes", null);
        term133103 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term133189 = newInstance(Class.forName("org.apache.html.dom.HTMLDListElementImpl"));
        Object term133315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setField(term133103, term133103.getClass(), "value", term133189);
        setField(term133103, term133103.getClass(), "namespaceResolver", null);
        setField(term133103, term133103.getClass(), "parent", term133315);
        term133389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term133389, term133389.getClass(), "name", "          ");
        setField(term133389, term133389.getClass(), "prefix", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term133103;
        args[1] = term133389;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


