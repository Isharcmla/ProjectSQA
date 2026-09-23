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

public class JDOMAttributeIterator_init_2067615428263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167698;
     Object term168315;
     Object term168322;

    public JDOMAttributeIterator_init_2067615428263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term167302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term167888 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object term167951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setIntField(term167302, term167302.getClass(), "position", 0);
        setField(term167951, term167951.getClass(), "parent", null);
        setField(term167888, term167888.getClass(), "parent", term167951);
        setField(term167302, term167302.getClass(), "parent", term167888);
        term167698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term167824 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term167824, term167824.getClass(), "parent", term167888);
        setField(term167698, term167698.getClass(), "parent", term167824);
        setField(term167698, term167698.getClass(), "name", "*");
        term168315 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term168316 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term168319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term168320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object term168321 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setField(term168316, term168316.getClass(), "dynaBean", null);
        setField(term168316, term168316.getClass(), "name", "*");
        setField(term168316, term168316.getClass(), "names", null);
        setIntField(term168316, term168316.getClass(), "propertyIndex", 0);
        setField(term168316, term168316.getClass(), "bean", null);
        setField(term168316, term168316.getClass(), "value", null);
        setIntField(term168316, term168316.getClass(), "index", 0);
        setBooleanField(term168316, term168316.getClass(), "attribute", false);
        setField(term168316, term168316.getClass(), "rootNode", null);
        setField(term168316, term168316.getClass(), "namespaceResolver", null);
        setField(term168319, term168319.getClass(), "attr", null);
        setIntField(term168319, term168319.getClass(), "index", 0);
        setBooleanField(term168319, term168319.getClass(), "attribute", false);
        setField(term168319, term168319.getClass(), "rootNode", null);
        setField(term168319, term168319.getClass(), "namespaceResolver", null);
        setIntField(term168320, term168320.getClass(), "index", 0);
        setBooleanField(term168320, term168320.getClass(), "attribute", false);
        setField(term168320, term168320.getClass(), "rootNode", null);
        setField(term168320, term168320.getClass(), "namespaceResolver", null);
        setField(term168321, term168321.getClass(), "name", null);
        setField(term168321, term168321.getClass(), "dynaBean", null);
        setField(term168321, term168321.getClass(), "value", null);
        setIntField(term168321, term168321.getClass(), "index", 0);
        setBooleanField(term168321, term168321.getClass(), "attribute", false);
        setField(term168321, term168321.getClass(), "rootNode", null);
        setField(term168321, term168321.getClass(), "namespaceResolver", null);
        setField(term168321, term168321.getClass(), "parent", null);
        setField(term168321, term168321.getClass(), "locale", null);
        setField(term168320, term168320.getClass(), "parent", term168321);
        setField(term168320, term168320.getClass(), "locale", null);
        setField(term168319, term168319.getClass(), "parent", term168320);
        setField(term168319, term168319.getClass(), "locale", null);
        setField(term168316, term168316.getClass(), "parent", term168319);
        setField(term168316, term168316.getClass(), "locale", null);
        setField(term168315, term168315.getClass(), "parent", term168316);
        setField(term168315, term168315.getClass(), "attributes", null);
        setIntField(term168315, term168315.getClass(), "position", 0);
        term168322 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term168325 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term168326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.LangAttributePointer"));
        Object term168327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer"));
        setField(term168322, term168322.getClass(), "dynaBean", null);
        setField(term168322, term168322.getClass(), "name", "*");
        setField(term168322, term168322.getClass(), "names", null);
        setIntField(term168322, term168322.getClass(), "propertyIndex", 0);
        setField(term168322, term168322.getClass(), "bean", null);
        setField(term168322, term168322.getClass(), "value", null);
        setIntField(term168322, term168322.getClass(), "index", 0);
        setBooleanField(term168322, term168322.getClass(), "attribute", false);
        setField(term168322, term168322.getClass(), "rootNode", null);
        setField(term168322, term168322.getClass(), "namespaceResolver", null);
        setField(term168325, term168325.getClass(), "attr", null);
        setIntField(term168325, term168325.getClass(), "index", 0);
        setBooleanField(term168325, term168325.getClass(), "attribute", false);
        setField(term168325, term168325.getClass(), "rootNode", null);
        setField(term168325, term168325.getClass(), "namespaceResolver", null);
        setIntField(term168326, term168326.getClass(), "index", 0);
        setBooleanField(term168326, term168326.getClass(), "attribute", false);
        setField(term168326, term168326.getClass(), "rootNode", null);
        setField(term168326, term168326.getClass(), "namespaceResolver", null);
        setField(term168327, term168327.getClass(), "name", null);
        setField(term168327, term168327.getClass(), "dynaBean", null);
        setField(term168327, term168327.getClass(), "value", null);
        setIntField(term168327, term168327.getClass(), "index", 0);
        setBooleanField(term168327, term168327.getClass(), "attribute", false);
        setField(term168327, term168327.getClass(), "rootNode", null);
        setField(term168327, term168327.getClass(), "namespaceResolver", null);
        setField(term168327, term168327.getClass(), "parent", null);
        setField(term168327, term168327.getClass(), "locale", null);
        setField(term168326, term168326.getClass(), "parent", term168327);
        setField(term168326, term168326.getClass(), "locale", null);
        setField(term168325, term168325.getClass(), "parent", term168326);
        setField(term168325, term168325.getClass(), "locale", null);
        setField(term168322, term168322.getClass(), "parent", term168325);
        setField(term168322, term168322.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term167698;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term168315));
        assertTrue(recursiveEquals(term167698, term168322));
    }

};


