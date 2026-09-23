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

public class JDOMAttributeIterator_init_2067615428257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163061;
     Object term163714;
     Object term163719;

    public JDOMAttributeIterator_init_2067615428257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term162919 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term162919, term162919.getClass(), "position", 0);
        setField(term162919, term162919.getClass(), "parent", null);
        term163061 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term163177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term163177, term163177.getClass(), "parent", null);
        setField(term163061, term163061.getClass(), "parent", term163177);
        setField(term163061, term163061.getClass(), "name", "*");
        Object[] term162789 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 236);
        Object term163351 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term163485 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term162789, 0, term163351);
        setElement(term162789, 1, term163485);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term162789);
        term163714 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term163715 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term163718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term163715, term163715.getClass(), "dynaBean", null);
        setField(term163715, term163715.getClass(), "name", "*");
        setField(term163715, term163715.getClass(), "names", null);
        setIntField(term163715, term163715.getClass(), "propertyIndex", 0);
        setField(term163715, term163715.getClass(), "bean", null);
        setField(term163715, term163715.getClass(), "value", null);
        setIntField(term163715, term163715.getClass(), "index", 0);
        setBooleanField(term163715, term163715.getClass(), "attribute", false);
        setField(term163715, term163715.getClass(), "rootNode", null);
        setField(term163715, term163715.getClass(), "namespaceResolver", null);
        setField(term163718, term163718.getClass(), "node", null);
        setField(term163718, term163718.getClass(), "id", null);
        setIntField(term163718, term163718.getClass(), "index", 0);
        setBooleanField(term163718, term163718.getClass(), "attribute", false);
        setField(term163718, term163718.getClass(), "rootNode", null);
        setField(term163718, term163718.getClass(), "namespaceResolver", null);
        setField(term163718, term163718.getClass(), "parent", null);
        setField(term163718, term163718.getClass(), "locale", null);
        setField(term163715, term163715.getClass(), "parent", term163718);
        setField(term163715, term163715.getClass(), "locale", null);
        setField(term163714, term163714.getClass(), "parent", term163715);
        setField(term163714, term163714.getClass(), "attributes", null);
        setIntField(term163714, term163714.getClass(), "position", 0);
        term163719 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term163722 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term163719, term163719.getClass(), "dynaBean", null);
        setField(term163719, term163719.getClass(), "name", "*");
        setField(term163719, term163719.getClass(), "names", null);
        setIntField(term163719, term163719.getClass(), "propertyIndex", 0);
        setField(term163719, term163719.getClass(), "bean", null);
        setField(term163719, term163719.getClass(), "value", null);
        setIntField(term163719, term163719.getClass(), "index", 0);
        setBooleanField(term163719, term163719.getClass(), "attribute", false);
        setField(term163719, term163719.getClass(), "rootNode", null);
        setField(term163719, term163719.getClass(), "namespaceResolver", null);
        setField(term163722, term163722.getClass(), "node", null);
        setField(term163722, term163722.getClass(), "id", null);
        setIntField(term163722, term163722.getClass(), "index", 0);
        setBooleanField(term163722, term163722.getClass(), "attribute", false);
        setField(term163722, term163722.getClass(), "rootNode", null);
        setField(term163722, term163722.getClass(), "namespaceResolver", null);
        setField(term163722, term163722.getClass(), "parent", null);
        setField(term163722, term163722.getClass(), "locale", null);
        setField(term163719, term163719.getClass(), "parent", term163722);
        setField(term163719, term163719.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term163061;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term163714));
        assertTrue(recursiveEquals(term163061, term163719));
    }

};


