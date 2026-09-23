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

public class JDOMAttributeIterator_init_2067615428345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245178;
     Object term245478;
     Object term245483;

    public JDOMAttributeIterator_init_2067615428345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term245036 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term245036, term245036.getClass(), "position", 0);
        setField(term245036, term245036.getClass(), "parent", null);
        term245178 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term244827 = (Object[]) newArray("java.lang.String", 0);
        setField(term245178, term245178.getClass(), "parent", null);
        setField(term245178, term245178.getClass(), "name", null);
        setField(term245178, term245178.getClass(), "names", term244827);
        setIntField(term245178, term245178.getClass(), "propertyIndex", 0);
        Object[] term244907 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 1);
        Object term245302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term244907, 0, term245302);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term244907);
        term245478 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term245479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term245482 = (Object[]) newArray("java.lang.String", 0);
        setField(term245479, term245479.getClass(), "dynaBean", null);
        setField(term245479, term245479.getClass(), "name", "*");
        setField(term245479, term245479.getClass(), "names", term245482);
        setIntField(term245479, term245479.getClass(), "propertyIndex", 0);
        setField(term245479, term245479.getClass(), "bean", null);
        setField(term245479, term245479.getClass(), "value", null);
        setIntField(term245479, term245479.getClass(), "index", 0);
        setBooleanField(term245479, term245479.getClass(), "attribute", false);
        setField(term245479, term245479.getClass(), "rootNode", null);
        setField(term245479, term245479.getClass(), "namespaceResolver", null);
        setField(term245479, term245479.getClass(), "parent", null);
        setField(term245479, term245479.getClass(), "locale", null);
        setField(term245478, term245478.getClass(), "parent", term245479);
        setField(term245478, term245478.getClass(), "attributes", null);
        setIntField(term245478, term245478.getClass(), "position", 0);
        term245483 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term245486 = (Object[]) newArray("java.lang.String", 0);
        setField(term245483, term245483.getClass(), "dynaBean", null);
        setField(term245483, term245483.getClass(), "name", "*");
        setField(term245483, term245483.getClass(), "names", term245486);
        setIntField(term245483, term245483.getClass(), "propertyIndex", 0);
        setField(term245483, term245483.getClass(), "bean", null);
        setField(term245483, term245483.getClass(), "value", null);
        setIntField(term245483, term245483.getClass(), "index", 0);
        setBooleanField(term245483, term245483.getClass(), "attribute", false);
        setField(term245483, term245483.getClass(), "rootNode", null);
        setField(term245483, term245483.getClass(), "namespaceResolver", null);
        setField(term245483, term245483.getClass(), "parent", null);
        setField(term245483, term245483.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term245178;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term245478));
        assertTrue(recursiveEquals(term245178, term245483));
    }

};


