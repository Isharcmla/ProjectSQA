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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class DOMAttributeIterator_init_7810902137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48163;
     Object term48321;
     Object term51873;
     Object term51879;
     Object term51881;

    public DOMAttributeIterator_init_7810902137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48043 = new ArrayList();
        Object term47865 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term47991 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setIntField(term47865, term47865.getClass(), "position", 0);
        setField(term47865, term47865.getClass(), "parent", term47991);
        setField(term47865, term47865.getClass(), "name", null);
        setField(term47865, term47865.getClass(), "attributes", term48043);
        term48163 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term48247 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term48163, term48163.getClass(), "value", term48247);
        term48321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        ArrayList term51877 = new ArrayList();
        term51873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator"));
        Object term51874 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term51875 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        Object term51876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term51874, term51874.getClass(), "name", null);
        setField(term51874, term51874.getClass(), "bean", null);
        setField(term51874, term51874.getClass(), "handler", null);
        setField(term51875, term51875.getClass(), "element", null);
        setField(term51875, term51875.getClass(), "value", null);
        setField(term51875, term51875.getClass(), "prefix", null);
        setField(term51875, term51875.getClass(), "localpart", null);
        setField(term51875, term51875.getClass(), "rawname", null);
        setField(term51875, term51875.getClass(), "uri", null);
        setShortField(term51875, term51875.getClass(), "nodeType", (short) 0);
        setBooleanField(term51875, term51875.getClass(), "hidden", false);
        setField(term51874, term51874.getClass(), "value", term51875);
        setIntField(term51874, term51874.getClass(), "index", 0);
        setBooleanField(term51874, term51874.getClass(), "attribute", false);
        setField(term51874, term51874.getClass(), "rootNode", null);
        setField(term51874, term51874.getClass(), "namespaceResolver", null);
        setField(term51874, term51874.getClass(), "parent", null);
        setField(term51874, term51874.getClass(), "locale", null);
        setField(term51873, term51873.getClass(), "parent", term51874);
        setField(term51876, term51876.getClass(), "prefix", null);
        setField(term51876, term51876.getClass(), "name", null);
        setField(term51876, term51876.getClass(), "qualifiedName", null);
        setField(term51873, term51873.getClass(), "name", term51876);
        setField(term51873, term51873.getClass(), "attributes", term51877);
        setIntField(term51873, term51873.getClass(), "position", 0);
        term51879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term51880 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.AttrImpl"));
        setField(term51879, term51879.getClass(), "name", null);
        setField(term51879, term51879.getClass(), "bean", null);
        setField(term51879, term51879.getClass(), "handler", null);
        setField(term51880, term51880.getClass(), "element", null);
        setField(term51880, term51880.getClass(), "value", null);
        setField(term51880, term51880.getClass(), "prefix", null);
        setField(term51880, term51880.getClass(), "localpart", null);
        setField(term51880, term51880.getClass(), "rawname", null);
        setField(term51880, term51880.getClass(), "uri", null);
        setShortField(term51880, term51880.getClass(), "nodeType", (short) 0);
        setBooleanField(term51880, term51880.getClass(), "hidden", false);
        setField(term51879, term51879.getClass(), "value", term51880);
        setIntField(term51879, term51879.getClass(), "index", 0);
        setBooleanField(term51879, term51879.getClass(), "attribute", false);
        setField(term51879, term51879.getClass(), "rootNode", null);
        setField(term51879, term51879.getClass(), "namespaceResolver", null);
        setField(term51879, term51879.getClass(), "parent", null);
        setField(term51879, term51879.getClass(), "locale", null);
        term51881 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term51881, term51881.getClass(), "prefix", null);
        setField(term51881, term51881.getClass(), "name", null);
        setField(term51881, term51881.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term48163;
        args[1] = term48321;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51873));
        assertTrue(recursiveEquals(term48163, term51879));
        assertTrue(recursiveEquals(term48321, term51881));
    }

};


