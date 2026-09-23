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

public class JDOMAttributeIterator_init_206761542823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term4224;
     Object term4227;

    public JDOMAttributeIterator_init_206761542823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term3198, term3198.getClass(), "position", 0);
        setField(term3198, term3198.getClass(), "parent", null);
        term3326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term3326, term3326.getClass(), "valuePointer", null);
        setField(term3326, term3326.getClass(), "container", null);
        setIntField(term3326, term3326.getClass(), "index", 0);
        Object[] term3064 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 14);
        Object term3462 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term3580 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term3702 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term3844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term3984 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term4118 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term3064, 0, term3462);
        setElement(term3064, 1, term3580);
        setElement(term3064, 2, term3702);
        setElement(term3064, 3, term3844);
        setElement(term3064, 4, term3984);
        setElement(term3064, 5, term4118);
        setElement(term3064, 6, term4118);
        setElement(term3064, 7, term4118);
        setElement(term3064, 8, term4118);
        setElement(term3064, 9, term4118);
        setElement(term3064, 10, term4118);
        setElement(term3064, 11, term4118);
        setElement(term3064, 12, term4118);
        setElement(term3064, 13, term4118);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term3064);
        term4224 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term4225 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4226 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term4225, term4225.getClass(), "container", null);
        setField(term4226, term4226.getClass(), "name", null);
        setField(term4226, term4226.getClass(), "id", null);
        setField(term4226, term4226.getClass(), "value", null);
        setIntField(term4226, term4226.getClass(), "index", -2147483648);
        setBooleanField(term4226, term4226.getClass(), "attribute", false);
        setField(term4226, term4226.getClass(), "rootNode", null);
        setField(term4226, term4226.getClass(), "namespaceResolver", null);
        setField(term4226, term4226.getClass(), "parent", term4225);
        setField(term4226, term4226.getClass(), "locale", null);
        setField(term4225, term4225.getClass(), "valuePointer", term4226);
        setIntField(term4225, term4225.getClass(), "index", 0);
        setBooleanField(term4225, term4225.getClass(), "attribute", false);
        setField(term4225, term4225.getClass(), "rootNode", null);
        setField(term4225, term4225.getClass(), "namespaceResolver", null);
        setField(term4225, term4225.getClass(), "parent", null);
        setField(term4225, term4225.getClass(), "locale", null);
        setField(term4224, term4224.getClass(), "parent", term4225);
        setField(term4224, term4224.getClass(), "attributes", null);
        setIntField(term4224, term4224.getClass(), "position", 0);
        term4227 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4228 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term4227, term4227.getClass(), "container", null);
        setField(term4228, term4228.getClass(), "name", null);
        setField(term4228, term4228.getClass(), "id", null);
        setField(term4228, term4228.getClass(), "value", null);
        setIntField(term4228, term4228.getClass(), "index", -2147483648);
        setBooleanField(term4228, term4228.getClass(), "attribute", false);
        setField(term4228, term4228.getClass(), "rootNode", null);
        setField(term4228, term4228.getClass(), "namespaceResolver", null);
        setField(term4228, term4228.getClass(), "parent", term4227);
        setField(term4228, term4228.getClass(), "locale", null);
        setField(term4227, term4227.getClass(), "valuePointer", term4228);
        setIntField(term4227, term4227.getClass(), "index", 0);
        setBooleanField(term4227, term4227.getClass(), "attribute", false);
        setField(term4227, term4227.getClass(), "rootNode", null);
        setField(term4227, term4227.getClass(), "namespaceResolver", null);
        setField(term4227, term4227.getClass(), "parent", null);
        setField(term4227, term4227.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term3326;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4224));
        assertTrue(recursiveEquals(term3326, term4227));
    }

};


