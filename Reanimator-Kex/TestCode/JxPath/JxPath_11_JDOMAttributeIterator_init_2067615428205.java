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

public class JDOMAttributeIterator_init_2067615428205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118089;
     Object term118742;
     Object term118747;

    public JDOMAttributeIterator_init_2067615428205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term117947 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term117947, term117947.getClass(), "position", 0);
        setField(term117947, term117947.getClass(), "parent", null);
        term118089 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term118215 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term118215, term118215.getClass(), "parent", null);
        setField(term118089, term118089.getClass(), "parent", term118215);
        setField(term118089, term118089.getClass(), "name", "*");
        Object[] term117816 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 2);
        Object term118389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term118513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term117816, 0, term118389);
        setElement(term117816, 1, term118513);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term117816);
        term118742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term118743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term118746 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term118743, term118743.getClass(), "dynaBean", null);
        setField(term118743, term118743.getClass(), "name", "*");
        setField(term118743, term118743.getClass(), "names", null);
        setIntField(term118743, term118743.getClass(), "propertyIndex", 0);
        setField(term118743, term118743.getClass(), "bean", null);
        setField(term118743, term118743.getClass(), "value", null);
        setIntField(term118743, term118743.getClass(), "index", 0);
        setBooleanField(term118743, term118743.getClass(), "attribute", false);
        setField(term118743, term118743.getClass(), "rootNode", null);
        setField(term118743, term118743.getClass(), "namespaceResolver", null);
        setField(term118746, term118746.getClass(), "attr", null);
        setIntField(term118746, term118746.getClass(), "index", 0);
        setBooleanField(term118746, term118746.getClass(), "attribute", false);
        setField(term118746, term118746.getClass(), "rootNode", null);
        setField(term118746, term118746.getClass(), "namespaceResolver", null);
        setField(term118746, term118746.getClass(), "parent", null);
        setField(term118746, term118746.getClass(), "locale", null);
        setField(term118743, term118743.getClass(), "parent", term118746);
        setField(term118743, term118743.getClass(), "locale", null);
        setField(term118742, term118742.getClass(), "parent", term118743);
        setField(term118742, term118742.getClass(), "attributes", null);
        setIntField(term118742, term118742.getClass(), "position", 0);
        term118747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term118750 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term118747, term118747.getClass(), "dynaBean", null);
        setField(term118747, term118747.getClass(), "name", "*");
        setField(term118747, term118747.getClass(), "names", null);
        setIntField(term118747, term118747.getClass(), "propertyIndex", 0);
        setField(term118747, term118747.getClass(), "bean", null);
        setField(term118747, term118747.getClass(), "value", null);
        setIntField(term118747, term118747.getClass(), "index", 0);
        setBooleanField(term118747, term118747.getClass(), "attribute", false);
        setField(term118747, term118747.getClass(), "rootNode", null);
        setField(term118747, term118747.getClass(), "namespaceResolver", null);
        setField(term118750, term118750.getClass(), "attr", null);
        setIntField(term118750, term118750.getClass(), "index", 0);
        setBooleanField(term118750, term118750.getClass(), "attribute", false);
        setField(term118750, term118750.getClass(), "rootNode", null);
        setField(term118750, term118750.getClass(), "namespaceResolver", null);
        setField(term118750, term118750.getClass(), "parent", null);
        setField(term118750, term118750.getClass(), "locale", null);
        setField(term118747, term118747.getClass(), "parent", term118750);
        setField(term118747, term118747.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term118089;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term118742));
        assertTrue(recursiveEquals(term118089, term118747));
    }

};


