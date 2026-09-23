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

public class JDOMAttributeIterator_init_206761542889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30247;
     Object term30409;
     Object term31175;
     Object term31181;
     Object term31184;

    public JDOMAttributeIterator_init_206761542889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30127 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term30127, term30127.getClass(), "position", 0);
        setField(term30127, term30127.getClass(), "parent", null);
        setField(term30127, term30127.getClass(), "attributes", null);
        term30247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term30285 = newInstance(Class.forName("org.jdom.Element"));
        Object term30335 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term30285, term30285.getClass(), "attributes", term30335);
        setField(term30247, term30247.getClass(), "value", term30285);
        term30409 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term30409, term30409.getClass(), "prefix", "xml");
        setField(term30409, term30409.getClass(), "name", "*");
        ArrayList term31179 = new ArrayList();
        term31175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term31176 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term31177 = newInstance(Class.forName("org.jdom.Element"));
        Object term31178 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term31176, term31176.getClass(), "name", null);
        setField(term31176, term31176.getClass(), "bean", null);
        setField(term31176, term31176.getClass(), "handler", null);
        setField(term31177, term31177.getClass(), "name", null);
        setField(term31177, term31177.getClass(), "namespace", null);
        setField(term31177, term31177.getClass(), "additionalNamespaces", null);
        setField(term31178, term31178.getClass(), "elementData", null);
        setIntField(term31178, term31178.getClass(), "size", 0);
        setField(term31178, term31178.getClass(), "parent", null);
        setIntField(term31178, term31178.getClass(), "modCount", 0);
        setField(term31177, term31177.getClass(), "attributes", term31178);
        setField(term31177, term31177.getClass(), "content", null);
        setField(term31177, term31177.getClass(), "parent", null);
        setField(term31176, term31176.getClass(), "value", term31177);
        setIntField(term31176, term31176.getClass(), "index", 0);
        setBooleanField(term31176, term31176.getClass(), "attribute", false);
        setField(term31176, term31176.getClass(), "rootNode", null);
        setField(term31176, term31176.getClass(), "namespaceResolver", null);
        setField(term31176, term31176.getClass(), "parent", null);
        setField(term31176, term31176.getClass(), "locale", null);
        setField(term31175, term31175.getClass(), "parent", term31176);
        setField(term31175, term31175.getClass(), "attributes", term31179);
        setIntField(term31175, term31175.getClass(), "position", 0);
        term31181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term31182 = newInstance(Class.forName("org.jdom.Element"));
        Object term31183 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term31181, term31181.getClass(), "name", null);
        setField(term31181, term31181.getClass(), "bean", null);
        setField(term31181, term31181.getClass(), "handler", null);
        setField(term31182, term31182.getClass(), "name", null);
        setField(term31182, term31182.getClass(), "namespace", null);
        setField(term31182, term31182.getClass(), "additionalNamespaces", null);
        setField(term31183, term31183.getClass(), "elementData", null);
        setIntField(term31183, term31183.getClass(), "size", 0);
        setField(term31183, term31183.getClass(), "parent", null);
        setIntField(term31183, term31183.getClass(), "modCount", 0);
        setField(term31182, term31182.getClass(), "attributes", term31183);
        setField(term31182, term31182.getClass(), "content", null);
        setField(term31182, term31182.getClass(), "parent", null);
        setField(term31181, term31181.getClass(), "value", term31182);
        setIntField(term31181, term31181.getClass(), "index", 0);
        setBooleanField(term31181, term31181.getClass(), "attribute", false);
        setField(term31181, term31181.getClass(), "rootNode", null);
        setField(term31181, term31181.getClass(), "namespaceResolver", null);
        setField(term31181, term31181.getClass(), "parent", null);
        setField(term31181, term31181.getClass(), "locale", null);
        term31184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term31184, term31184.getClass(), "prefix", "xml");
        setField(term31184, term31184.getClass(), "name", "*");
        setField(term31184, term31184.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term30247;
        args[1] = term30409;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31175));
        assertTrue(recursiveEquals(term30247, term31181));
        assertTrue(recursiveEquals(term30409, term31184));
    }

};


