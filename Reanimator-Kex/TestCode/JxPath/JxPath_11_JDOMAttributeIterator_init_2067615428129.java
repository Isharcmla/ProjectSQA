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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMAttributeIterator_init_2067615428129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58823;
     Object term59258;
     Object term59263;

    public JDOMAttributeIterator_init_2067615428129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58681 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term58681, term58681.getClass(), "position", 0);
        setField(term58681, term58681.getClass(), "parent", null);
        term58823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term58959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term58959, term58959.getClass(), "parent", null);
        setField(term58823, term58823.getClass(), "parent", term58959);
        setField(term58823, term58823.getClass(), "name", "*");
        term59258 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term59259 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term59262 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term59259, term59259.getClass(), "dynaBean", null);
        setField(term59259, term59259.getClass(), "name", "*");
        setField(term59259, term59259.getClass(), "names", null);
        setIntField(term59259, term59259.getClass(), "propertyIndex", 0);
        setField(term59259, term59259.getClass(), "bean", null);
        setField(term59259, term59259.getClass(), "value", null);
        setIntField(term59259, term59259.getClass(), "index", 0);
        setBooleanField(term59259, term59259.getClass(), "attribute", false);
        setField(term59259, term59259.getClass(), "rootNode", null);
        setField(term59259, term59259.getClass(), "namespaceResolver", null);
        setField(term59262, term59262.getClass(), "handler", null);
        setField(term59262, term59262.getClass(), "name", null);
        setField(term59262, term59262.getClass(), "names", null);
        setField(term59262, term59262.getClass(), "requiredPropertyName", null);
        setIntField(term59262, term59262.getClass(), "propertyIndex", 0);
        setField(term59262, term59262.getClass(), "bean", null);
        setField(term59262, term59262.getClass(), "value", null);
        setIntField(term59262, term59262.getClass(), "index", 0);
        setBooleanField(term59262, term59262.getClass(), "attribute", false);
        setField(term59262, term59262.getClass(), "rootNode", null);
        setField(term59262, term59262.getClass(), "namespaceResolver", null);
        setField(term59262, term59262.getClass(), "parent", null);
        setField(term59262, term59262.getClass(), "locale", null);
        setField(term59259, term59259.getClass(), "parent", term59262);
        setField(term59259, term59259.getClass(), "locale", null);
        setField(term59258, term59258.getClass(), "parent", term59259);
        setField(term59258, term59258.getClass(), "attributes", null);
        setIntField(term59258, term59258.getClass(), "position", 0);
        term59263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term59266 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setField(term59263, term59263.getClass(), "dynaBean", null);
        setField(term59263, term59263.getClass(), "name", "*");
        setField(term59263, term59263.getClass(), "names", null);
        setIntField(term59263, term59263.getClass(), "propertyIndex", 0);
        setField(term59263, term59263.getClass(), "bean", null);
        setField(term59263, term59263.getClass(), "value", null);
        setIntField(term59263, term59263.getClass(), "index", 0);
        setBooleanField(term59263, term59263.getClass(), "attribute", false);
        setField(term59263, term59263.getClass(), "rootNode", null);
        setField(term59263, term59263.getClass(), "namespaceResolver", null);
        setField(term59266, term59266.getClass(), "handler", null);
        setField(term59266, term59266.getClass(), "name", null);
        setField(term59266, term59266.getClass(), "names", null);
        setField(term59266, term59266.getClass(), "requiredPropertyName", null);
        setIntField(term59266, term59266.getClass(), "propertyIndex", 0);
        setField(term59266, term59266.getClass(), "bean", null);
        setField(term59266, term59266.getClass(), "value", null);
        setIntField(term59266, term59266.getClass(), "index", 0);
        setBooleanField(term59266, term59266.getClass(), "attribute", false);
        setField(term59266, term59266.getClass(), "rootNode", null);
        setField(term59266, term59266.getClass(), "namespaceResolver", null);
        setField(term59266, term59266.getClass(), "parent", null);
        setField(term59266, term59266.getClass(), "locale", null);
        setField(term59263, term59263.getClass(), "parent", term59266);
        setField(term59263, term59263.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term58823;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term59258));
        assertTrue(recursiveEquals(term58823, term59263));
    }

};


