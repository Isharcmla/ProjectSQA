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

public class JDOMAttributeIterator_init_2067615428253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161031;
     Object term161935;
     Object term161940;

    public JDOMAttributeIterator_init_2067615428253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term160889, term160889.getClass(), "position", 0);
        setField(term160889, term160889.getClass(), "parent", null);
        term161031 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term161157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term161157, term161157.getClass(), "parent", null);
        setField(term161031, term161031.getClass(), "parent", term161157);
        setField(term161031, term161031.getClass(), "name", "*");
        Object[] term160757 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 4);
        Object term161331 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term161449 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term161571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term161695 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term160757, 0, term161331);
        setElement(term160757, 1, term161449);
        setElement(term160757, 2, term161571);
        setElement(term160757, 3, term161695);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term160757);
        term161935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term161936 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term161939 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term161936, term161936.getClass(), "dynaBean", null);
        setField(term161936, term161936.getClass(), "name", "*");
        setField(term161936, term161936.getClass(), "names", null);
        setIntField(term161936, term161936.getClass(), "propertyIndex", 0);
        setField(term161936, term161936.getClass(), "bean", null);
        setField(term161936, term161936.getClass(), "value", null);
        setIntField(term161936, term161936.getClass(), "index", 0);
        setBooleanField(term161936, term161936.getClass(), "attribute", false);
        setField(term161936, term161936.getClass(), "rootNode", null);
        setField(term161936, term161936.getClass(), "namespaceResolver", null);
        setField(term161939, term161939.getClass(), "attr", null);
        setIntField(term161939, term161939.getClass(), "index", 0);
        setBooleanField(term161939, term161939.getClass(), "attribute", false);
        setField(term161939, term161939.getClass(), "rootNode", null);
        setField(term161939, term161939.getClass(), "namespaceResolver", null);
        setField(term161939, term161939.getClass(), "parent", null);
        setField(term161939, term161939.getClass(), "locale", null);
        setField(term161936, term161936.getClass(), "parent", term161939);
        setField(term161936, term161936.getClass(), "locale", null);
        setField(term161935, term161935.getClass(), "parent", term161936);
        setField(term161935, term161935.getClass(), "attributes", null);
        setIntField(term161935, term161935.getClass(), "position", 0);
        term161940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term161943 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term161940, term161940.getClass(), "dynaBean", null);
        setField(term161940, term161940.getClass(), "name", "*");
        setField(term161940, term161940.getClass(), "names", null);
        setIntField(term161940, term161940.getClass(), "propertyIndex", 0);
        setField(term161940, term161940.getClass(), "bean", null);
        setField(term161940, term161940.getClass(), "value", null);
        setIntField(term161940, term161940.getClass(), "index", 0);
        setBooleanField(term161940, term161940.getClass(), "attribute", false);
        setField(term161940, term161940.getClass(), "rootNode", null);
        setField(term161940, term161940.getClass(), "namespaceResolver", null);
        setField(term161943, term161943.getClass(), "attr", null);
        setIntField(term161943, term161943.getClass(), "index", 0);
        setBooleanField(term161943, term161943.getClass(), "attribute", false);
        setField(term161943, term161943.getClass(), "rootNode", null);
        setField(term161943, term161943.getClass(), "namespaceResolver", null);
        setField(term161943, term161943.getClass(), "parent", null);
        setField(term161943, term161943.getClass(), "locale", null);
        setField(term161940, term161940.getClass(), "parent", term161943);
        setField(term161940, term161940.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term161031;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term161935));
        assertTrue(recursiveEquals(term161031, term161940));
    }

};


