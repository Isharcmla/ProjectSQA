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

public class JDOMAttributeIterator_init_2067615428317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216042;
     Object term217231;
     Object term217236;

    public JDOMAttributeIterator_init_2067615428317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term215764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term215900 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer"));
        setIntField(term215764, term215764.getClass(), "position", 0);
        setField(term215764, term215764.getClass(), "parent", term215900);
        term216042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term216168 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term216168, term216168.getClass(), "parent", null);
        setField(term216042, term216042.getClass(), "parent", term216168);
        setField(term216042, term216042.getClass(), "name", "*");
        Object[] term215630 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term216342 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term216460 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term216582 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term216724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term216846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term216980 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term215630, 0, term216342);
        setElement(term215630, 1, term216460);
        setElement(term215630, 2, term216582);
        setElement(term215630, 3, term216724);
        setElement(term215630, 4, term216846);
        setElement(term215630, 5, term216980);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term215630);
        term217231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term217232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term217235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term217232, term217232.getClass(), "dynaBean", null);
        setField(term217232, term217232.getClass(), "name", "*");
        setField(term217232, term217232.getClass(), "names", null);
        setIntField(term217232, term217232.getClass(), "propertyIndex", 0);
        setField(term217232, term217232.getClass(), "bean", null);
        setField(term217232, term217232.getClass(), "value", null);
        setIntField(term217232, term217232.getClass(), "index", 0);
        setBooleanField(term217232, term217232.getClass(), "attribute", false);
        setField(term217232, term217232.getClass(), "rootNode", null);
        setField(term217232, term217232.getClass(), "namespaceResolver", null);
        setField(term217235, term217235.getClass(), "attr", null);
        setIntField(term217235, term217235.getClass(), "index", 0);
        setBooleanField(term217235, term217235.getClass(), "attribute", false);
        setField(term217235, term217235.getClass(), "rootNode", null);
        setField(term217235, term217235.getClass(), "namespaceResolver", null);
        setField(term217235, term217235.getClass(), "parent", null);
        setField(term217235, term217235.getClass(), "locale", null);
        setField(term217232, term217232.getClass(), "parent", term217235);
        setField(term217232, term217232.getClass(), "locale", null);
        setField(term217231, term217231.getClass(), "parent", term217232);
        setField(term217231, term217231.getClass(), "attributes", null);
        setIntField(term217231, term217231.getClass(), "position", 0);
        term217236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term217239 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term217236, term217236.getClass(), "dynaBean", null);
        setField(term217236, term217236.getClass(), "name", "*");
        setField(term217236, term217236.getClass(), "names", null);
        setIntField(term217236, term217236.getClass(), "propertyIndex", 0);
        setField(term217236, term217236.getClass(), "bean", null);
        setField(term217236, term217236.getClass(), "value", null);
        setIntField(term217236, term217236.getClass(), "index", 0);
        setBooleanField(term217236, term217236.getClass(), "attribute", false);
        setField(term217236, term217236.getClass(), "rootNode", null);
        setField(term217236, term217236.getClass(), "namespaceResolver", null);
        setField(term217239, term217239.getClass(), "attr", null);
        setIntField(term217239, term217239.getClass(), "index", 0);
        setBooleanField(term217239, term217239.getClass(), "attribute", false);
        setField(term217239, term217239.getClass(), "rootNode", null);
        setField(term217239, term217239.getClass(), "namespaceResolver", null);
        setField(term217239, term217239.getClass(), "parent", null);
        setField(term217239, term217239.getClass(), "locale", null);
        setField(term217236, term217236.getClass(), "parent", term217239);
        setField(term217236, term217236.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term216042;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term217231));
        assertTrue(recursiveEquals(term216042, term217236));
    }

};


