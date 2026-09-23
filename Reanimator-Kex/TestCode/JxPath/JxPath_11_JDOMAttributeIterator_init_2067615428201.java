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

public class JDOMAttributeIterator_init_2067615428201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114823;
     Object term115476;
     Object term115481;

    public JDOMAttributeIterator_init_2067615428201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114681 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term114681, term114681.getClass(), "position", 0);
        setField(term114681, term114681.getClass(), "parent", null);
        term114823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term114949 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term114949, term114949.getClass(), "parent", null);
        setField(term114823, term114823.getClass(), "parent", term114949);
        setField(term114823, term114823.getClass(), "name", "*");
        Object[] term114551 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 492);
        Object term115123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term115247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term114551, 0, term115123);
        setElement(term114551, 1, term115247);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term114551);
        term115476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term115477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term115480 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term115477, term115477.getClass(), "dynaBean", null);
        setField(term115477, term115477.getClass(), "name", "*");
        setField(term115477, term115477.getClass(), "names", null);
        setIntField(term115477, term115477.getClass(), "propertyIndex", 0);
        setField(term115477, term115477.getClass(), "bean", null);
        setField(term115477, term115477.getClass(), "value", null);
        setIntField(term115477, term115477.getClass(), "index", 0);
        setBooleanField(term115477, term115477.getClass(), "attribute", false);
        setField(term115477, term115477.getClass(), "rootNode", null);
        setField(term115477, term115477.getClass(), "namespaceResolver", null);
        setField(term115480, term115480.getClass(), "attr", null);
        setIntField(term115480, term115480.getClass(), "index", 0);
        setBooleanField(term115480, term115480.getClass(), "attribute", false);
        setField(term115480, term115480.getClass(), "rootNode", null);
        setField(term115480, term115480.getClass(), "namespaceResolver", null);
        setField(term115480, term115480.getClass(), "parent", null);
        setField(term115480, term115480.getClass(), "locale", null);
        setField(term115477, term115477.getClass(), "parent", term115480);
        setField(term115477, term115477.getClass(), "locale", null);
        setField(term115476, term115476.getClass(), "parent", term115477);
        setField(term115476, term115476.getClass(), "attributes", null);
        setIntField(term115476, term115476.getClass(), "position", 0);
        term115481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term115484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term115481, term115481.getClass(), "dynaBean", null);
        setField(term115481, term115481.getClass(), "name", "*");
        setField(term115481, term115481.getClass(), "names", null);
        setIntField(term115481, term115481.getClass(), "propertyIndex", 0);
        setField(term115481, term115481.getClass(), "bean", null);
        setField(term115481, term115481.getClass(), "value", null);
        setIntField(term115481, term115481.getClass(), "index", 0);
        setBooleanField(term115481, term115481.getClass(), "attribute", false);
        setField(term115481, term115481.getClass(), "rootNode", null);
        setField(term115481, term115481.getClass(), "namespaceResolver", null);
        setField(term115484, term115484.getClass(), "attr", null);
        setIntField(term115484, term115484.getClass(), "index", 0);
        setBooleanField(term115484, term115484.getClass(), "attribute", false);
        setField(term115484, term115484.getClass(), "rootNode", null);
        setField(term115484, term115484.getClass(), "namespaceResolver", null);
        setField(term115484, term115484.getClass(), "parent", null);
        setField(term115484, term115484.getClass(), "locale", null);
        setField(term115481, term115481.getClass(), "parent", term115484);
        setField(term115481, term115481.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term114823;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term115476));
        assertTrue(recursiveEquals(term114823, term115481));
    }

};


