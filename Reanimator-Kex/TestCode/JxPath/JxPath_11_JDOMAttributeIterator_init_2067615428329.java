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

public class JDOMAttributeIterator_init_2067615428329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229326;
     Object term229544;
     Object term229548;

    public JDOMAttributeIterator_init_2067615428329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term229206 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term229206, term229206.getClass(), "position", 0);
        setField(term229206, term229206.getClass(), "parent", null);
        term229326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term229424 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term229522 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term229326, term229326.getClass(), "value", term229424);
        setIntField(term229326, term229326.getClass(), "index", -2147483648);
        setField(term229326, term229326.getClass(), "bean", term229522);
        term229544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term229545 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term229546 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term229547 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term229545, term229545.getClass(), "name", null);
        setField(term229546, term229546.getClass(), "delegate", null);
        setField(term229546, term229546.getClass(), "document", null);
        setField(term229546, term229546.getClass(), "xmlURL", null);
        setField(term229546, term229546.getClass(), "source", null);
        setField(term229545, term229545.getClass(), "bean", term229546);
        setField(term229545, term229545.getClass(), "handler", null);
        setField(term229547, term229547.getClass(), "delegate", null);
        setField(term229547, term229547.getClass(), "document", null);
        setField(term229547, term229547.getClass(), "xmlURL", null);
        setField(term229547, term229547.getClass(), "source", null);
        setField(term229545, term229545.getClass(), "value", term229547);
        setIntField(term229545, term229545.getClass(), "index", -2147483648);
        setBooleanField(term229545, term229545.getClass(), "attribute", false);
        setField(term229545, term229545.getClass(), "rootNode", null);
        setField(term229545, term229545.getClass(), "namespaceResolver", null);
        setField(term229545, term229545.getClass(), "parent", null);
        setField(term229545, term229545.getClass(), "locale", null);
        setField(term229544, term229544.getClass(), "parent", term229545);
        setField(term229544, term229544.getClass(), "attributes", null);
        setIntField(term229544, term229544.getClass(), "position", 0);
        term229548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term229549 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        Object term229550 = newInstance(Class.forName("org.apache.commons.jxpath.XMLDocumentContainer"));
        setField(term229548, term229548.getClass(), "name", null);
        setField(term229549, term229549.getClass(), "delegate", null);
        setField(term229549, term229549.getClass(), "document", null);
        setField(term229549, term229549.getClass(), "xmlURL", null);
        setField(term229549, term229549.getClass(), "source", null);
        setField(term229548, term229548.getClass(), "bean", term229549);
        setField(term229548, term229548.getClass(), "handler", null);
        setField(term229550, term229550.getClass(), "delegate", null);
        setField(term229550, term229550.getClass(), "document", null);
        setField(term229550, term229550.getClass(), "xmlURL", null);
        setField(term229550, term229550.getClass(), "source", null);
        setField(term229548, term229548.getClass(), "value", term229550);
        setIntField(term229548, term229548.getClass(), "index", -2147483648);
        setBooleanField(term229548, term229548.getClass(), "attribute", false);
        setField(term229548, term229548.getClass(), "rootNode", null);
        setField(term229548, term229548.getClass(), "namespaceResolver", null);
        setField(term229548, term229548.getClass(), "parent", null);
        setField(term229548, term229548.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term229326;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term229544));
        assertTrue(recursiveEquals(term229326, term229548));
    }

};


