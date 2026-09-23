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

public class JDOMAttributeIterator_init_2067615428127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57320;
     Object term58366;
     Object term58370;

    public JDOMAttributeIterator_init_2067615428127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term57052 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term57178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setIntField(term57052, term57052.getClass(), "position", 0);
        setField(term57052, term57052.getClass(), "parent", term57178);
        term57320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term57320, term57320.getClass(), "parent", null);
        setField(term57320, term57320.getClass(), "name", "*");
        Object[] term56917 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term57494 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term57612 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term57734 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term57876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term58016 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term58150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term56917, 0, term57494);
        setElement(term56917, 1, term57612);
        setElement(term56917, 2, term57734);
        setElement(term56917, 3, term57876);
        setElement(term56917, 4, term58016);
        setElement(term56917, 5, term58150);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term56917);
        term58366 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term58367 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term58367, term58367.getClass(), "dynaBean", null);
        setField(term58367, term58367.getClass(), "name", "*");
        setField(term58367, term58367.getClass(), "names", null);
        setIntField(term58367, term58367.getClass(), "propertyIndex", 0);
        setField(term58367, term58367.getClass(), "bean", null);
        setField(term58367, term58367.getClass(), "value", null);
        setIntField(term58367, term58367.getClass(), "index", 0);
        setBooleanField(term58367, term58367.getClass(), "attribute", false);
        setField(term58367, term58367.getClass(), "rootNode", null);
        setField(term58367, term58367.getClass(), "namespaceResolver", null);
        setField(term58367, term58367.getClass(), "parent", null);
        setField(term58367, term58367.getClass(), "locale", null);
        setField(term58366, term58366.getClass(), "parent", term58367);
        setField(term58366, term58366.getClass(), "attributes", null);
        setIntField(term58366, term58366.getClass(), "position", 0);
        term58370 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        setField(term58370, term58370.getClass(), "dynaBean", null);
        setField(term58370, term58370.getClass(), "name", "*");
        setField(term58370, term58370.getClass(), "names", null);
        setIntField(term58370, term58370.getClass(), "propertyIndex", 0);
        setField(term58370, term58370.getClass(), "bean", null);
        setField(term58370, term58370.getClass(), "value", null);
        setIntField(term58370, term58370.getClass(), "index", 0);
        setBooleanField(term58370, term58370.getClass(), "attribute", false);
        setField(term58370, term58370.getClass(), "rootNode", null);
        setField(term58370, term58370.getClass(), "namespaceResolver", null);
        setField(term58370, term58370.getClass(), "parent", null);
        setField(term58370, term58370.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term57320;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58366));
        assertTrue(recursiveEquals(term57320, term58370));
    }

};


