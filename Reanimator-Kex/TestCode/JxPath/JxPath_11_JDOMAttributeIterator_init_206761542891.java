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
import java.util.ArrayList;

public class JDOMAttributeIterator_init_206761542891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31819;
     Object term31981;
     Object term32239;
     Object term32246;
     Object term32250;

    public JDOMAttributeIterator_init_206761542891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31583 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term31699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setIntField(term31583, term31583.getClass(), "position", 0);
        setField(term31583, term31583.getClass(), "parent", term31699);
        setField(term31583, term31583.getClass(), "attributes", null);
        term31819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term31857 = newInstance(Class.forName("org.jdom.Element"));
        Object term31907 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term31313 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term31907, term31907.getClass(), "elementData", term31313);
        setField(term31857, term31857.getClass(), "attributes", term31907);
        setField(term31819, term31819.getClass(), "value", term31857);
        term31981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term31981, term31981.getClass(), "prefix", "xml");
        setField(term31981, term31981.getClass(), "name", "");
        ArrayList term32244 = new ArrayList();
        term32239 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term32240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term32241 = newInstance(Class.forName("org.jdom.Element"));
        Object term32242 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term32243 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term32240, term32240.getClass(), "name", null);
        setField(term32240, term32240.getClass(), "bean", null);
        setField(term32240, term32240.getClass(), "handler", null);
        setField(term32241, term32241.getClass(), "name", null);
        setField(term32241, term32241.getClass(), "namespace", null);
        setField(term32241, term32241.getClass(), "additionalNamespaces", null);
        setField(term32242, term32242.getClass(), "elementData", term32243);
        setIntField(term32242, term32242.getClass(), "size", 0);
        setField(term32242, term32242.getClass(), "parent", null);
        setIntField(term32242, term32242.getClass(), "modCount", 0);
        setField(term32241, term32241.getClass(), "attributes", term32242);
        setField(term32241, term32241.getClass(), "content", null);
        setField(term32241, term32241.getClass(), "parent", null);
        setField(term32240, term32240.getClass(), "value", term32241);
        setIntField(term32240, term32240.getClass(), "index", 0);
        setBooleanField(term32240, term32240.getClass(), "attribute", false);
        setField(term32240, term32240.getClass(), "rootNode", null);
        setField(term32240, term32240.getClass(), "namespaceResolver", null);
        setField(term32240, term32240.getClass(), "parent", null);
        setField(term32240, term32240.getClass(), "locale", null);
        setField(term32239, term32239.getClass(), "parent", term32240);
        setField(term32239, term32239.getClass(), "attributes", term32244);
        setIntField(term32239, term32239.getClass(), "position", 0);
        term32246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term32247 = newInstance(Class.forName("org.jdom.Element"));
        Object term32248 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term32249 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term32246, term32246.getClass(), "name", null);
        setField(term32246, term32246.getClass(), "bean", null);
        setField(term32246, term32246.getClass(), "handler", null);
        setField(term32247, term32247.getClass(), "name", null);
        setField(term32247, term32247.getClass(), "namespace", null);
        setField(term32247, term32247.getClass(), "additionalNamespaces", null);
        setField(term32248, term32248.getClass(), "elementData", term32249);
        setIntField(term32248, term32248.getClass(), "size", 0);
        setField(term32248, term32248.getClass(), "parent", null);
        setIntField(term32248, term32248.getClass(), "modCount", 0);
        setField(term32247, term32247.getClass(), "attributes", term32248);
        setField(term32247, term32247.getClass(), "content", null);
        setField(term32247, term32247.getClass(), "parent", null);
        setField(term32246, term32246.getClass(), "value", term32247);
        setIntField(term32246, term32246.getClass(), "index", 0);
        setBooleanField(term32246, term32246.getClass(), "attribute", false);
        setField(term32246, term32246.getClass(), "rootNode", null);
        setField(term32246, term32246.getClass(), "namespaceResolver", null);
        setField(term32246, term32246.getClass(), "parent", null);
        setField(term32246, term32246.getClass(), "locale", null);
        term32250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term32250, term32250.getClass(), "prefix", "xml");
        setField(term32250, term32250.getClass(), "name", "");
        setField(term32250, term32250.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term31819;
        args[1] = term31981;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32239));
        assertTrue(recursiveEquals(term31819, term32246));
        assertTrue(recursiveEquals(term31981, term32250));
    }

};


