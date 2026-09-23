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

public class JDOMAttributeIterator_init_206761542856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15185;
     Object term15347;
     Object term16006;
     Object term16012;
     Object term16015;

    public JDOMAttributeIterator_init_206761542856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term15065 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer"));
        setIntField(term14959, term14959.getClass(), "position", 0);
        setField(term14959, term14959.getClass(), "parent", term15065);
        setField(term14959, term14959.getClass(), "attributes", null);
        term15185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term15223 = newInstance(Class.forName("org.jdom.Element"));
        Object term15273 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term15223, term15223.getClass(), "attributes", term15273);
        setField(term15185, term15185.getClass(), "value", term15223);
        term15347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term15347, term15347.getClass(), "prefix", null);
        setField(term15347, term15347.getClass(), "name", "");
        ArrayList term16010 = new ArrayList();
        term16006 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term16007 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term16008 = newInstance(Class.forName("org.jdom.Element"));
        Object term16009 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term16007, term16007.getClass(), "name", null);
        setField(term16007, term16007.getClass(), "bean", null);
        setField(term16007, term16007.getClass(), "handler", null);
        setField(term16008, term16008.getClass(), "name", null);
        setField(term16008, term16008.getClass(), "namespace", null);
        setField(term16008, term16008.getClass(), "additionalNamespaces", null);
        setField(term16009, term16009.getClass(), "elementData", null);
        setIntField(term16009, term16009.getClass(), "size", 0);
        setField(term16009, term16009.getClass(), "parent", null);
        setIntField(term16009, term16009.getClass(), "modCount", 0);
        setField(term16008, term16008.getClass(), "attributes", term16009);
        setField(term16008, term16008.getClass(), "content", null);
        setField(term16008, term16008.getClass(), "parent", null);
        setField(term16007, term16007.getClass(), "value", term16008);
        setIntField(term16007, term16007.getClass(), "index", 0);
        setBooleanField(term16007, term16007.getClass(), "attribute", false);
        setField(term16007, term16007.getClass(), "rootNode", null);
        setField(term16007, term16007.getClass(), "namespaceResolver", null);
        setField(term16007, term16007.getClass(), "parent", null);
        setField(term16007, term16007.getClass(), "locale", null);
        setField(term16006, term16006.getClass(), "parent", term16007);
        setField(term16006, term16006.getClass(), "attributes", term16010);
        setIntField(term16006, term16006.getClass(), "position", 0);
        term16012 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term16013 = newInstance(Class.forName("org.jdom.Element"));
        Object term16014 = newInstance(Class.forName("org.jdom.AttributeList"));
        setField(term16012, term16012.getClass(), "name", null);
        setField(term16012, term16012.getClass(), "bean", null);
        setField(term16012, term16012.getClass(), "handler", null);
        setField(term16013, term16013.getClass(), "name", null);
        setField(term16013, term16013.getClass(), "namespace", null);
        setField(term16013, term16013.getClass(), "additionalNamespaces", null);
        setField(term16014, term16014.getClass(), "elementData", null);
        setIntField(term16014, term16014.getClass(), "size", 0);
        setField(term16014, term16014.getClass(), "parent", null);
        setIntField(term16014, term16014.getClass(), "modCount", 0);
        setField(term16013, term16013.getClass(), "attributes", term16014);
        setField(term16013, term16013.getClass(), "content", null);
        setField(term16013, term16013.getClass(), "parent", null);
        setField(term16012, term16012.getClass(), "value", term16013);
        setIntField(term16012, term16012.getClass(), "index", 0);
        setBooleanField(term16012, term16012.getClass(), "attribute", false);
        setField(term16012, term16012.getClass(), "rootNode", null);
        setField(term16012, term16012.getClass(), "namespaceResolver", null);
        setField(term16012, term16012.getClass(), "parent", null);
        setField(term16012, term16012.getClass(), "locale", null);
        term16015 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term16015, term16015.getClass(), "prefix", null);
        setField(term16015, term16015.getClass(), "name", "");
        setField(term16015, term16015.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term15185;
        args[1] = term15347;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16006));
        assertTrue(recursiveEquals(term15185, term16012));
        assertTrue(recursiveEquals(term15347, term16015));
    }

};


