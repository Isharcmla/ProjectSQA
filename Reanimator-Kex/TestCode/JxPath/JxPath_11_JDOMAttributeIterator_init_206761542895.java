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

public class JDOMAttributeIterator_init_206761542895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33377;
     Object term33539;
     Object term33678;
     Object term33685;
     Object term33689;

    public JDOMAttributeIterator_init_206761542895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term33257 = new ArrayList();
        Object term33205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term33205, term33205.getClass(), "position", 0);
        setField(term33205, term33205.getClass(), "parent", null);
        setField(term33205, term33205.getClass(), "attributes", term33257);
        term33377 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term33415 = newInstance(Class.forName("org.jdom.Element"));
        Object term33465 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term33006 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term33465, term33465.getClass(), "elementData", term33006);
        setField(term33415, term33415.getClass(), "attributes", term33465);
        setField(term33377, term33377.getClass(), "value", term33415);
        term33539 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term33539, term33539.getClass(), "prefix", null);
        setField(term33539, term33539.getClass(), "name", "  ");
        ArrayList term33683 = new ArrayList();
        term33678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term33679 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term33680 = newInstance(Class.forName("org.jdom.Element"));
        Object term33681 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term33682 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term33679, term33679.getClass(), "name", null);
        setField(term33679, term33679.getClass(), "bean", null);
        setField(term33679, term33679.getClass(), "handler", null);
        setField(term33680, term33680.getClass(), "name", null);
        setField(term33680, term33680.getClass(), "namespace", null);
        setField(term33680, term33680.getClass(), "additionalNamespaces", null);
        setField(term33681, term33681.getClass(), "elementData", term33682);
        setIntField(term33681, term33681.getClass(), "size", 0);
        setField(term33681, term33681.getClass(), "parent", null);
        setIntField(term33681, term33681.getClass(), "modCount", 0);
        setField(term33680, term33680.getClass(), "attributes", term33681);
        setField(term33680, term33680.getClass(), "content", null);
        setField(term33680, term33680.getClass(), "parent", null);
        setField(term33679, term33679.getClass(), "value", term33680);
        setIntField(term33679, term33679.getClass(), "index", 0);
        setBooleanField(term33679, term33679.getClass(), "attribute", false);
        setField(term33679, term33679.getClass(), "rootNode", null);
        setField(term33679, term33679.getClass(), "namespaceResolver", null);
        setField(term33679, term33679.getClass(), "parent", null);
        setField(term33679, term33679.getClass(), "locale", null);
        setField(term33678, term33678.getClass(), "parent", term33679);
        setField(term33678, term33678.getClass(), "attributes", term33683);
        setIntField(term33678, term33678.getClass(), "position", 0);
        term33685 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer"));
        Object term33686 = newInstance(Class.forName("org.jdom.Element"));
        Object term33687 = newInstance(Class.forName("org.jdom.AttributeList"));
        Object[] term33688 = (Object[]) newArray("org.jdom.Attribute", 0);
        setField(term33685, term33685.getClass(), "name", null);
        setField(term33685, term33685.getClass(), "bean", null);
        setField(term33685, term33685.getClass(), "handler", null);
        setField(term33686, term33686.getClass(), "name", null);
        setField(term33686, term33686.getClass(), "namespace", null);
        setField(term33686, term33686.getClass(), "additionalNamespaces", null);
        setField(term33687, term33687.getClass(), "elementData", term33688);
        setIntField(term33687, term33687.getClass(), "size", 0);
        setField(term33687, term33687.getClass(), "parent", null);
        setIntField(term33687, term33687.getClass(), "modCount", 0);
        setField(term33686, term33686.getClass(), "attributes", term33687);
        setField(term33686, term33686.getClass(), "content", null);
        setField(term33686, term33686.getClass(), "parent", null);
        setField(term33685, term33685.getClass(), "value", term33686);
        setIntField(term33685, term33685.getClass(), "index", 0);
        setBooleanField(term33685, term33685.getClass(), "attribute", false);
        setField(term33685, term33685.getClass(), "rootNode", null);
        setField(term33685, term33685.getClass(), "namespaceResolver", null);
        setField(term33685, term33685.getClass(), "parent", null);
        setField(term33685, term33685.getClass(), "locale", null);
        term33689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term33689, term33689.getClass(), "prefix", null);
        setField(term33689, term33689.getClass(), "name", "  ");
        setField(term33689, term33689.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term33377;
        args[1] = term33539;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33678));
        assertTrue(recursiveEquals(term33377, term33685));
        assertTrue(recursiveEquals(term33539, term33689));
    }

};


