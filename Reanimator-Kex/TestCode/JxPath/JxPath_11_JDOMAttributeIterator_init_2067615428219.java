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

public class JDOMAttributeIterator_init_2067615428219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129944;
     Object term130844;
     Object term130849;

    public JDOMAttributeIterator_init_2067615428219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term129802, term129802.getClass(), "position", 0);
        setField(term129802, term129802.getClass(), "parent", null);
        term129944 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term130056 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term130056, term130056.getClass(), "parent", null);
        setField(term129944, term129944.getClass(), "parent", term130056);
        setField(term129944, term129944.getClass(), "name", "*");
        Object[] term129670 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 4);
        Object term130230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term130348 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term130470 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term130604 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term129670, 0, term130230);
        setElement(term129670, 1, term130348);
        setElement(term129670, 2, term130470);
        setElement(term129670, 3, term130604);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term129670);
        term130844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term130845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term130848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term130845, term130845.getClass(), "dynaBean", null);
        setField(term130845, term130845.getClass(), "name", "*");
        setField(term130845, term130845.getClass(), "names", null);
        setIntField(term130845, term130845.getClass(), "propertyIndex", 0);
        setField(term130845, term130845.getClass(), "bean", null);
        setField(term130845, term130845.getClass(), "value", null);
        setIntField(term130845, term130845.getClass(), "index", 0);
        setBooleanField(term130845, term130845.getClass(), "attribute", false);
        setField(term130845, term130845.getClass(), "rootNode", null);
        setField(term130845, term130845.getClass(), "namespaceResolver", null);
        setField(term130848, term130848.getClass(), "node", null);
        setField(term130848, term130848.getClass(), "namespaces", null);
        setField(term130848, term130848.getClass(), "defaultNamespace", null);
        setField(term130848, term130848.getClass(), "id", null);
        setIntField(term130848, term130848.getClass(), "index", 0);
        setBooleanField(term130848, term130848.getClass(), "attribute", false);
        setField(term130848, term130848.getClass(), "rootNode", null);
        setField(term130848, term130848.getClass(), "namespaceResolver", null);
        setField(term130848, term130848.getClass(), "parent", null);
        setField(term130848, term130848.getClass(), "locale", null);
        setField(term130845, term130845.getClass(), "parent", term130848);
        setField(term130845, term130845.getClass(), "locale", null);
        setField(term130844, term130844.getClass(), "parent", term130845);
        setField(term130844, term130844.getClass(), "attributes", null);
        setIntField(term130844, term130844.getClass(), "position", 0);
        term130849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term130852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term130849, term130849.getClass(), "dynaBean", null);
        setField(term130849, term130849.getClass(), "name", "*");
        setField(term130849, term130849.getClass(), "names", null);
        setIntField(term130849, term130849.getClass(), "propertyIndex", 0);
        setField(term130849, term130849.getClass(), "bean", null);
        setField(term130849, term130849.getClass(), "value", null);
        setIntField(term130849, term130849.getClass(), "index", 0);
        setBooleanField(term130849, term130849.getClass(), "attribute", false);
        setField(term130849, term130849.getClass(), "rootNode", null);
        setField(term130849, term130849.getClass(), "namespaceResolver", null);
        setField(term130852, term130852.getClass(), "node", null);
        setField(term130852, term130852.getClass(), "namespaces", null);
        setField(term130852, term130852.getClass(), "defaultNamespace", null);
        setField(term130852, term130852.getClass(), "id", null);
        setIntField(term130852, term130852.getClass(), "index", 0);
        setBooleanField(term130852, term130852.getClass(), "attribute", false);
        setField(term130852, term130852.getClass(), "rootNode", null);
        setField(term130852, term130852.getClass(), "namespaceResolver", null);
        setField(term130852, term130852.getClass(), "parent", null);
        setField(term130852, term130852.getClass(), "locale", null);
        setField(term130849, term130849.getClass(), "parent", term130852);
        setField(term130849, term130849.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term129944;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term130844));
        assertTrue(recursiveEquals(term129944, term130849));
    }

};


