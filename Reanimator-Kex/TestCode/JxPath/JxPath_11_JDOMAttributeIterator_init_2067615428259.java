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

public class JDOMAttributeIterator_init_2067615428259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164558;
     Object term165380;
     Object term165385;

    public JDOMAttributeIterator_init_2067615428259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term164181 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        term164558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term164621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setIntField(term164181, term164181.getClass(), "position", 0);
        setField(term164621, term164621.getClass(), "parent", null);
        setField(term164558, term164558.getClass(), "parent", term164621);
        setField(term164558, term164558.getClass(), "name", "*");
        setField(term164181, term164181.getClass(), "parent", term164558);
        Object[] term164049 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 4);
        Object term164776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term164894 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term165016 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term165140 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term164049, 0, term164776);
        setElement(term164049, 1, term164894);
        setElement(term164049, 2, term165016);
        setElement(term164049, 3, term165140);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term164049);
        term165380 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term165381 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term165384 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term165381, term165381.getClass(), "dynaBean", null);
        setField(term165381, term165381.getClass(), "name", "*");
        setField(term165381, term165381.getClass(), "names", null);
        setIntField(term165381, term165381.getClass(), "propertyIndex", 0);
        setField(term165381, term165381.getClass(), "bean", null);
        setField(term165381, term165381.getClass(), "value", null);
        setIntField(term165381, term165381.getClass(), "index", 0);
        setBooleanField(term165381, term165381.getClass(), "attribute", false);
        setField(term165381, term165381.getClass(), "rootNode", null);
        setField(term165381, term165381.getClass(), "namespaceResolver", null);
        setField(term165384, term165384.getClass(), "attr", null);
        setIntField(term165384, term165384.getClass(), "index", 0);
        setBooleanField(term165384, term165384.getClass(), "attribute", false);
        setField(term165384, term165384.getClass(), "rootNode", null);
        setField(term165384, term165384.getClass(), "namespaceResolver", null);
        setField(term165384, term165384.getClass(), "parent", null);
        setField(term165384, term165384.getClass(), "locale", null);
        setField(term165381, term165381.getClass(), "parent", term165384);
        setField(term165381, term165381.getClass(), "locale", null);
        setField(term165380, term165380.getClass(), "parent", term165381);
        setField(term165380, term165380.getClass(), "attributes", null);
        setIntField(term165380, term165380.getClass(), "position", 0);
        term165385 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term165388 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term165385, term165385.getClass(), "dynaBean", null);
        setField(term165385, term165385.getClass(), "name", "*");
        setField(term165385, term165385.getClass(), "names", null);
        setIntField(term165385, term165385.getClass(), "propertyIndex", 0);
        setField(term165385, term165385.getClass(), "bean", null);
        setField(term165385, term165385.getClass(), "value", null);
        setIntField(term165385, term165385.getClass(), "index", 0);
        setBooleanField(term165385, term165385.getClass(), "attribute", false);
        setField(term165385, term165385.getClass(), "rootNode", null);
        setField(term165385, term165385.getClass(), "namespaceResolver", null);
        setField(term165388, term165388.getClass(), "attr", null);
        setIntField(term165388, term165388.getClass(), "index", 0);
        setBooleanField(term165388, term165388.getClass(), "attribute", false);
        setField(term165388, term165388.getClass(), "rootNode", null);
        setField(term165388, term165388.getClass(), "namespaceResolver", null);
        setField(term165388, term165388.getClass(), "parent", null);
        setField(term165388, term165388.getClass(), "locale", null);
        setField(term165385, term165385.getClass(), "parent", term165388);
        setField(term165385, term165385.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term164558;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term165380));
        assertTrue(recursiveEquals(term164558, term165385));
    }

};


