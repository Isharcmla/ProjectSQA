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
import java.util.ArrayList;

public class JDOMAttributeIterator_init_206761542879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26352;
     Object term26514;
     Object term27172;
     Object term27178;
     Object term27181;

    public JDOMAttributeIterator_init_206761542879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term26232, term26232.getClass(), "position", 0);
        setField(term26232, term26232.getClass(), "parent", null);
        setField(term26232, term26232.getClass(), "attributes", null);
        term26352 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term26390 = newInstance(Class.forName("org.jdom.Element"));
        Object term26440 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term26390, term26390.getClass(), "attributes", term26440);
        setField(term26352, term26352.getClass(), "value", term26390);
        term26514 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term26514, term26514.getClass(), "prefix", "xml");
        setField(term26514, term26514.getClass(), "name", "");
        ArrayList term27176 = new ArrayList();
        term27172 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term27173 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term27174 = newInstance(Class.forName("org.jdom.Element"));
        Object term27175 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term27173, term27173.getClass(), "name", null);
        setField(term27173, term27173.getClass(), "bean", null);
        setField(term27173, term27173.getClass(), "handler", null);
        setField(term27174, term27174.getClass(), "name", null);
        setField(term27174, term27174.getClass(), "namespace", null);
        setField(term27174, term27174.getClass(), "additionalNamespaces", null);
        setField(term27175, term27175.getClass(), "elementData", null);
        setIntField(term27175, term27175.getClass(), "size", 0);
        setField(term27175, term27175.getClass(), "parent", null);
        setIntField(term27175, term27175.getClass(), "modCount", 0);
        setField(term27174, term27174.getClass(), "attributes", term27175);
        setField(term27174, term27174.getClass(), "content", null);
        setField(term27174, term27174.getClass(), "parent", null);
        setField(term27173, term27173.getClass(), "value", term27174);
        setIntField(term27173, term27173.getClass(), "index", 0);
        setBooleanField(term27173, term27173.getClass(), "attribute", false);
        setField(term27173, term27173.getClass(), "rootNode", null);
        setField(term27173, term27173.getClass(), "namespaceResolver", null);
        setField(term27173, term27173.getClass(), "parent", null);
        setField(term27173, term27173.getClass(), "locale", null);
        setField(term27172, term27172.getClass(), "parent", term27173);
        setField(term27172, term27172.getClass(), "attributes", term27176);
        setIntField(term27172, term27172.getClass(), "position", 0);
        term27178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term27179 = newInstance(Class.forName("org.jdom.Element"));
        Object term27180 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term27178, term27178.getClass(), "name", null);
        setField(term27178, term27178.getClass(), "bean", null);
        setField(term27178, term27178.getClass(), "handler", null);
        setField(term27179, term27179.getClass(), "name", null);
        setField(term27179, term27179.getClass(), "namespace", null);
        setField(term27179, term27179.getClass(), "additionalNamespaces", null);
        setField(term27180, term27180.getClass(), "elementData", null);
        setIntField(term27180, term27180.getClass(), "size", 0);
        setField(term27180, term27180.getClass(), "parent", null);
        setIntField(term27180, term27180.getClass(), "modCount", 0);
        setField(term27179, term27179.getClass(), "attributes", term27180);
        setField(term27179, term27179.getClass(), "content", null);
        setField(term27179, term27179.getClass(), "parent", null);
        setField(term27178, term27178.getClass(), "value", term27179);
        setIntField(term27178, term27178.getClass(), "index", 0);
        setBooleanField(term27178, term27178.getClass(), "attribute", false);
        setField(term27178, term27178.getClass(), "rootNode", null);
        setField(term27178, term27178.getClass(), "namespaceResolver", null);
        setField(term27178, term27178.getClass(), "parent", null);
        setField(term27178, term27178.getClass(), "locale", null);
        term27181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term27181, term27181.getClass(), "prefix", "xml");
        setField(term27181, term27181.getClass(), "name", "");
        setField(term27181, term27181.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term26352;
        args[1] = term26514;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27172));
        assertTrue(recursiveEquals(term26352, term27178));
        assertTrue(recursiveEquals(term26514, term27181));
    }

};


