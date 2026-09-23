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

public class JDOMAttributeIterator_init_2067615428261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166132;
     Object term167032;
     Object term167037;

    public JDOMAttributeIterator_init_2067615428261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165990 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term165990, term165990.getClass(), "position", 0);
        setField(term165990, term165990.getClass(), "parent", null);
        term166132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term166244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term166244, term166244.getClass(), "parent", null);
        setField(term166132, term166132.getClass(), "parent", term166244);
        setField(term166132, term166132.getClass(), "name", "*");
        Object[] term165858 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 4);
        Object term166418 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term166536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term166658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term166792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term165858, 0, term166418);
        setElement(term165858, 1, term166536);
        setElement(term165858, 2, term166658);
        setElement(term165858, 3, term166792);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term165858);
        term167032 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term167033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term167036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term167033, term167033.getClass(), "dynaBean", null);
        setField(term167033, term167033.getClass(), "name", "*");
        setField(term167033, term167033.getClass(), "names", null);
        setIntField(term167033, term167033.getClass(), "propertyIndex", 0);
        setField(term167033, term167033.getClass(), "bean", null);
        setField(term167033, term167033.getClass(), "value", null);
        setIntField(term167033, term167033.getClass(), "index", 0);
        setBooleanField(term167033, term167033.getClass(), "attribute", false);
        setField(term167033, term167033.getClass(), "rootNode", null);
        setField(term167033, term167033.getClass(), "namespaceResolver", null);
        setField(term167036, term167036.getClass(), "node", null);
        setField(term167036, term167036.getClass(), "namespaces", null);
        setField(term167036, term167036.getClass(), "defaultNamespace", null);
        setField(term167036, term167036.getClass(), "id", null);
        setIntField(term167036, term167036.getClass(), "index", 0);
        setBooleanField(term167036, term167036.getClass(), "attribute", false);
        setField(term167036, term167036.getClass(), "rootNode", null);
        setField(term167036, term167036.getClass(), "namespaceResolver", null);
        setField(term167036, term167036.getClass(), "parent", null);
        setField(term167036, term167036.getClass(), "locale", null);
        setField(term167033, term167033.getClass(), "parent", term167036);
        setField(term167033, term167033.getClass(), "locale", null);
        setField(term167032, term167032.getClass(), "parent", term167033);
        setField(term167032, term167032.getClass(), "attributes", null);
        setIntField(term167032, term167032.getClass(), "position", 0);
        term167037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term167040 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term167037, term167037.getClass(), "dynaBean", null);
        setField(term167037, term167037.getClass(), "name", "*");
        setField(term167037, term167037.getClass(), "names", null);
        setIntField(term167037, term167037.getClass(), "propertyIndex", 0);
        setField(term167037, term167037.getClass(), "bean", null);
        setField(term167037, term167037.getClass(), "value", null);
        setIntField(term167037, term167037.getClass(), "index", 0);
        setBooleanField(term167037, term167037.getClass(), "attribute", false);
        setField(term167037, term167037.getClass(), "rootNode", null);
        setField(term167037, term167037.getClass(), "namespaceResolver", null);
        setField(term167040, term167040.getClass(), "node", null);
        setField(term167040, term167040.getClass(), "namespaces", null);
        setField(term167040, term167040.getClass(), "defaultNamespace", null);
        setField(term167040, term167040.getClass(), "id", null);
        setIntField(term167040, term167040.getClass(), "index", 0);
        setBooleanField(term167040, term167040.getClass(), "attribute", false);
        setField(term167040, term167040.getClass(), "rootNode", null);
        setField(term167040, term167040.getClass(), "namespaceResolver", null);
        setField(term167040, term167040.getClass(), "parent", null);
        setField(term167040, term167040.getClass(), "locale", null);
        setField(term167037, term167037.getClass(), "parent", term167040);
        setField(term167037, term167037.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term166132;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term167032));
        assertTrue(recursiveEquals(term166132, term167037));
    }

};


