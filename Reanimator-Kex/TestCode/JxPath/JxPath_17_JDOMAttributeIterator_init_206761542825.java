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

public class JDOMAttributeIterator_init_206761542825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4628;
     Object term4877;
     Object term4881;

    public JDOMAttributeIterator_init_206761542825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4374 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term4500 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer"));
        setIntField(term4374, term4374.getClass(), "position", 0);
        setField(term4374, term4374.getClass(), "parent", term4500);
        term4628 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4756 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term4628, term4628.getClass(), "valuePointer", term4756);
        term4877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term4878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4880 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term4878, term4878.getClass(), "container", null);
        setField(term4879, term4879.getClass(), "container", null);
        setField(term4880, term4880.getClass(), "name", null);
        setField(term4880, term4880.getClass(), "id", null);
        setField(term4880, term4880.getClass(), "value", null);
        setIntField(term4880, term4880.getClass(), "index", -2147483648);
        setBooleanField(term4880, term4880.getClass(), "attribute", false);
        setField(term4880, term4880.getClass(), "rootNode", null);
        setField(term4880, term4880.getClass(), "namespaceResolver", null);
        setField(term4880, term4880.getClass(), "parent", term4879);
        setField(term4880, term4880.getClass(), "locale", null);
        setField(term4879, term4879.getClass(), "valuePointer", term4880);
        setIntField(term4879, term4879.getClass(), "index", 0);
        setBooleanField(term4879, term4879.getClass(), "attribute", false);
        setField(term4879, term4879.getClass(), "rootNode", null);
        setField(term4879, term4879.getClass(), "namespaceResolver", null);
        setField(term4879, term4879.getClass(), "parent", null);
        setField(term4879, term4879.getClass(), "locale", null);
        setField(term4878, term4878.getClass(), "valuePointer", term4879);
        setIntField(term4878, term4878.getClass(), "index", 0);
        setBooleanField(term4878, term4878.getClass(), "attribute", false);
        setField(term4878, term4878.getClass(), "rootNode", null);
        setField(term4878, term4878.getClass(), "namespaceResolver", null);
        setField(term4878, term4878.getClass(), "parent", null);
        setField(term4878, term4878.getClass(), "locale", null);
        setField(term4877, term4877.getClass(), "parent", term4878);
        setField(term4877, term4877.getClass(), "attributes", null);
        setIntField(term4877, term4877.getClass(), "position", 0);
        term4881 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4882 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term4883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term4881, term4881.getClass(), "container", null);
        setField(term4882, term4882.getClass(), "container", null);
        setField(term4883, term4883.getClass(), "name", null);
        setField(term4883, term4883.getClass(), "id", null);
        setField(term4883, term4883.getClass(), "value", null);
        setIntField(term4883, term4883.getClass(), "index", -2147483648);
        setBooleanField(term4883, term4883.getClass(), "attribute", false);
        setField(term4883, term4883.getClass(), "rootNode", null);
        setField(term4883, term4883.getClass(), "namespaceResolver", null);
        setField(term4883, term4883.getClass(), "parent", term4882);
        setField(term4883, term4883.getClass(), "locale", null);
        setField(term4882, term4882.getClass(), "valuePointer", term4883);
        setIntField(term4882, term4882.getClass(), "index", 0);
        setBooleanField(term4882, term4882.getClass(), "attribute", false);
        setField(term4882, term4882.getClass(), "rootNode", null);
        setField(term4882, term4882.getClass(), "namespaceResolver", null);
        setField(term4882, term4882.getClass(), "parent", null);
        setField(term4882, term4882.getClass(), "locale", null);
        setField(term4881, term4881.getClass(), "valuePointer", term4882);
        setIntField(term4881, term4881.getClass(), "index", 0);
        setBooleanField(term4881, term4881.getClass(), "attribute", false);
        setField(term4881, term4881.getClass(), "rootNode", null);
        setField(term4881, term4881.getClass(), "namespaceResolver", null);
        setField(term4881, term4881.getClass(), "parent", null);
        setField(term4881, term4881.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term4628;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4877));
        assertTrue(recursiveEquals(term4628, term4881));
    }

};


