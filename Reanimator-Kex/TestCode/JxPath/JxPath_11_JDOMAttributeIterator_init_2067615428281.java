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

public class JDOMAttributeIterator_init_2067615428281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185590;
     Object term187055;
     Object term187060;

    public JDOMAttributeIterator_init_2067615428281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term185338 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term185448 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointer"));
        setIntField(term185338, term185338.getClass(), "position", 0);
        setField(term185338, term185338.getClass(), "parent", term185448);
        term185590 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term185716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term185716, term185716.getClass(), "parent", null);
        setField(term185590, term185590.getClass(), "parent", term185716);
        setField(term185590, term185590.getClass(), "name", "*");
        Object[] term185202 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 8);
        Object term185890 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term186008 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term186130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term186272 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term186394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term186534 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term186658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        Object term186798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        setElement(term185202, 0, term185890);
        setElement(term185202, 1, term186008);
        setElement(term185202, 2, term186130);
        setElement(term185202, 3, term186272);
        setElement(term185202, 4, term186394);
        setElement(term185202, 5, term186534);
        setElement(term185202, 6, term186658);
        setElement(term185202, 7, term186798);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term185202);
        term187055 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term187056 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term187059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term187056, term187056.getClass(), "dynaBean", null);
        setField(term187056, term187056.getClass(), "name", "*");
        setField(term187056, term187056.getClass(), "names", null);
        setIntField(term187056, term187056.getClass(), "propertyIndex", 0);
        setField(term187056, term187056.getClass(), "bean", null);
        setField(term187056, term187056.getClass(), "value", null);
        setIntField(term187056, term187056.getClass(), "index", 0);
        setBooleanField(term187056, term187056.getClass(), "attribute", false);
        setField(term187056, term187056.getClass(), "rootNode", null);
        setField(term187056, term187056.getClass(), "namespaceResolver", null);
        setField(term187059, term187059.getClass(), "attr", null);
        setIntField(term187059, term187059.getClass(), "index", 0);
        setBooleanField(term187059, term187059.getClass(), "attribute", false);
        setField(term187059, term187059.getClass(), "rootNode", null);
        setField(term187059, term187059.getClass(), "namespaceResolver", null);
        setField(term187059, term187059.getClass(), "parent", null);
        setField(term187059, term187059.getClass(), "locale", null);
        setField(term187056, term187056.getClass(), "parent", term187059);
        setField(term187056, term187056.getClass(), "locale", null);
        setField(term187055, term187055.getClass(), "parent", term187056);
        setField(term187055, term187055.getClass(), "attributes", null);
        setIntField(term187055, term187055.getClass(), "position", 0);
        term187060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term187063 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term187060, term187060.getClass(), "dynaBean", null);
        setField(term187060, term187060.getClass(), "name", "*");
        setField(term187060, term187060.getClass(), "names", null);
        setIntField(term187060, term187060.getClass(), "propertyIndex", 0);
        setField(term187060, term187060.getClass(), "bean", null);
        setField(term187060, term187060.getClass(), "value", null);
        setIntField(term187060, term187060.getClass(), "index", 0);
        setBooleanField(term187060, term187060.getClass(), "attribute", false);
        setField(term187060, term187060.getClass(), "rootNode", null);
        setField(term187060, term187060.getClass(), "namespaceResolver", null);
        setField(term187063, term187063.getClass(), "attr", null);
        setIntField(term187063, term187063.getClass(), "index", 0);
        setBooleanField(term187063, term187063.getClass(), "attribute", false);
        setField(term187063, term187063.getClass(), "rootNode", null);
        setField(term187063, term187063.getClass(), "namespaceResolver", null);
        setField(term187063, term187063.getClass(), "parent", null);
        setField(term187063, term187063.getClass(), "locale", null);
        setField(term187060, term187060.getClass(), "parent", term187063);
        setField(term187060, term187060.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term185590;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term187055));
        assertTrue(recursiveEquals(term185590, term187060));
    }

};


