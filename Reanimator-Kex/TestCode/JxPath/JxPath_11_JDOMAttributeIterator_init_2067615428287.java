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

public class JDOMAttributeIterator_init_2067615428287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191703;
     Object term193319;
     Object term193327;

    public JDOMAttributeIterator_init_2067615428287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term191561 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term191561, term191561.getClass(), "position", 0);
        setField(term191561, term191561.getClass(), "parent", null);
        term191703 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term191815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object[] term191106 = (Object[]) newArray("java.lang.String", 1);
        setField(term191815, term191815.getClass(), "parent", null);
        setField(term191703, term191703.getClass(), "parent", term191815);
        setField(term191703, term191703.getClass(), "name", null);
        setElement(term191106, 0, "*");
        setField(term191703, term191703.getClass(), "names", term191106);
        setIntField(term191703, term191703.getClass(), "propertyIndex", 0);
        Object[] term191424 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 9);
        Object term191989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term192107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term192229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term192371 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term192491 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term192631 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term192773 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term192909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term193033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term191424, 0, term191989);
        setElement(term191424, 1, term192107);
        setElement(term191424, 2, term192229);
        setElement(term191424, 3, term192371);
        setElement(term191424, 4, term192491);
        setElement(term191424, 5, term192631);
        setElement(term191424, 6, term192773);
        setElement(term191424, 7, term192909);
        setElement(term191424, 8, term193033);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term191424);
        term193319 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term193320 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term193323 = (Object[]) newArray("java.lang.String", 1);
        Object term193326 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term193320, term193320.getClass(), "dynaBean", null);
        setField(term193320, term193320.getClass(), "name", "*");
        setElement(term193323, 0, "*");
        setField(term193320, term193320.getClass(), "names", term193323);
        setIntField(term193320, term193320.getClass(), "propertyIndex", 0);
        setField(term193320, term193320.getClass(), "bean", null);
        setField(term193320, term193320.getClass(), "value", null);
        setIntField(term193320, term193320.getClass(), "index", 0);
        setBooleanField(term193320, term193320.getClass(), "attribute", false);
        setField(term193320, term193320.getClass(), "rootNode", null);
        setField(term193320, term193320.getClass(), "namespaceResolver", null);
        setField(term193326, term193326.getClass(), "node", null);
        setField(term193326, term193326.getClass(), "namespaces", null);
        setField(term193326, term193326.getClass(), "defaultNamespace", null);
        setField(term193326, term193326.getClass(), "id", null);
        setIntField(term193326, term193326.getClass(), "index", 0);
        setBooleanField(term193326, term193326.getClass(), "attribute", false);
        setField(term193326, term193326.getClass(), "rootNode", null);
        setField(term193326, term193326.getClass(), "namespaceResolver", null);
        setField(term193326, term193326.getClass(), "parent", null);
        setField(term193326, term193326.getClass(), "locale", null);
        setField(term193320, term193320.getClass(), "parent", term193326);
        setField(term193320, term193320.getClass(), "locale", null);
        setField(term193319, term193319.getClass(), "parent", term193320);
        setField(term193319, term193319.getClass(), "attributes", null);
        setIntField(term193319, term193319.getClass(), "position", 0);
        term193327 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term193330 = (Object[]) newArray("java.lang.String", 1);
        Object term193333 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term193327, term193327.getClass(), "dynaBean", null);
        setField(term193327, term193327.getClass(), "name", "*");
        setElement(term193330, 0, "*");
        setField(term193327, term193327.getClass(), "names", term193330);
        setIntField(term193327, term193327.getClass(), "propertyIndex", 0);
        setField(term193327, term193327.getClass(), "bean", null);
        setField(term193327, term193327.getClass(), "value", null);
        setIntField(term193327, term193327.getClass(), "index", 0);
        setBooleanField(term193327, term193327.getClass(), "attribute", false);
        setField(term193327, term193327.getClass(), "rootNode", null);
        setField(term193327, term193327.getClass(), "namespaceResolver", null);
        setField(term193333, term193333.getClass(), "node", null);
        setField(term193333, term193333.getClass(), "namespaces", null);
        setField(term193333, term193333.getClass(), "defaultNamespace", null);
        setField(term193333, term193333.getClass(), "id", null);
        setIntField(term193333, term193333.getClass(), "index", 0);
        setBooleanField(term193333, term193333.getClass(), "attribute", false);
        setField(term193333, term193333.getClass(), "rootNode", null);
        setField(term193333, term193333.getClass(), "namespaceResolver", null);
        setField(term193333, term193333.getClass(), "parent", null);
        setField(term193333, term193333.getClass(), "locale", null);
        setField(term193327, term193327.getClass(), "parent", term193333);
        setField(term193327, term193327.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term191703;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term193319));
        assertTrue(recursiveEquals(term191703, term193327));
    }

};


