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

public class JDOMAttributeIterator_init_2067615428163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81998;
     Object term83244;
     Object term83249;

    public JDOMAttributeIterator_init_2067615428163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81856 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term81856, term81856.getClass(), "position", 0);
        setField(term81856, term81856.getClass(), "parent", null);
        term81998 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term81419 = (Object[]) newArray("java.lang.String", 0);
        setField(term81998, term81998.getClass(), "parent", null);
        setField(term81998, term81998.getClass(), "name", null);
        setField(term81998, term81998.getClass(), "names", term81419);
        setIntField(term81998, term81998.getClass(), "propertyIndex", 0);
        Object[] term81720 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 8);
        Object term82134 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term82252 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term82374 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term82516 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term82636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term82776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term82896 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term83030 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term81720, 0, term82134);
        setElement(term81720, 1, term82252);
        setElement(term81720, 2, term82374);
        setElement(term81720, 3, term82516);
        setElement(term81720, 4, term82636);
        setElement(term81720, 5, term82776);
        setElement(term81720, 6, term82896);
        setElement(term81720, 7, term83030);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term81720);
        term83244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term83245 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term83248 = (Object[]) newArray("java.lang.String", 0);
        setField(term83245, term83245.getClass(), "dynaBean", null);
        setField(term83245, term83245.getClass(), "name", "*");
        setField(term83245, term83245.getClass(), "names", term83248);
        setIntField(term83245, term83245.getClass(), "propertyIndex", 0);
        setField(term83245, term83245.getClass(), "bean", null);
        setField(term83245, term83245.getClass(), "value", null);
        setIntField(term83245, term83245.getClass(), "index", 0);
        setBooleanField(term83245, term83245.getClass(), "attribute", false);
        setField(term83245, term83245.getClass(), "rootNode", null);
        setField(term83245, term83245.getClass(), "namespaceResolver", null);
        setField(term83245, term83245.getClass(), "parent", null);
        setField(term83245, term83245.getClass(), "locale", null);
        setField(term83244, term83244.getClass(), "parent", term83245);
        setField(term83244, term83244.getClass(), "attributes", null);
        setIntField(term83244, term83244.getClass(), "position", 0);
        term83249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term83252 = (Object[]) newArray("java.lang.String", 0);
        setField(term83249, term83249.getClass(), "dynaBean", null);
        setField(term83249, term83249.getClass(), "name", "*");
        setField(term83249, term83249.getClass(), "names", term83252);
        setIntField(term83249, term83249.getClass(), "propertyIndex", 0);
        setField(term83249, term83249.getClass(), "bean", null);
        setField(term83249, term83249.getClass(), "value", null);
        setIntField(term83249, term83249.getClass(), "index", 0);
        setBooleanField(term83249, term83249.getClass(), "attribute", false);
        setField(term83249, term83249.getClass(), "rootNode", null);
        setField(term83249, term83249.getClass(), "namespaceResolver", null);
        setField(term83249, term83249.getClass(), "parent", null);
        setField(term83249, term83249.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term81998;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term83244));
        assertTrue(recursiveEquals(term81998, term83249));
    }

};


