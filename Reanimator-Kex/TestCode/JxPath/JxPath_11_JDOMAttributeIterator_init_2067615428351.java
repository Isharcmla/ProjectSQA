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

public class JDOMAttributeIterator_init_2067615428351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249481;
     Object term250819;
     Object term250825;

    public JDOMAttributeIterator_init_2067615428351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term249339 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term249339, term249339.getClass(), "position", 0);
        setField(term249339, term249339.getClass(), "parent", null);
        term249481 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term249607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term249733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term249733, term249733.getClass(), "parent", null);
        setField(term249607, term249607.getClass(), "parent", term249733);
        setField(term249481, term249481.getClass(), "parent", term249607);
        setField(term249481, term249481.getClass(), "name", "*");
        Object[] term249205 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term249907 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term250025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term250147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term250267 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointerFactory"));
        Object term250403 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term250527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term249205, 0, term249907);
        setElement(term249205, 1, term250025);
        setElement(term249205, 2, term250147);
        setElement(term249205, 3, term250267);
        setElement(term249205, 4, term250403);
        setElement(term249205, 5, term250527);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term249205);
        term250819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term250820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term250823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term250824 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term250820, term250820.getClass(), "dynaBean", null);
        setField(term250820, term250820.getClass(), "name", "*");
        setField(term250820, term250820.getClass(), "names", null);
        setIntField(term250820, term250820.getClass(), "propertyIndex", 0);
        setField(term250820, term250820.getClass(), "bean", null);
        setField(term250820, term250820.getClass(), "value", null);
        setIntField(term250820, term250820.getClass(), "index", 0);
        setBooleanField(term250820, term250820.getClass(), "attribute", false);
        setField(term250820, term250820.getClass(), "rootNode", null);
        setField(term250820, term250820.getClass(), "namespaceResolver", null);
        setField(term250823, term250823.getClass(), "attr", null);
        setIntField(term250823, term250823.getClass(), "index", 0);
        setBooleanField(term250823, term250823.getClass(), "attribute", false);
        setField(term250823, term250823.getClass(), "rootNode", null);
        setField(term250823, term250823.getClass(), "namespaceResolver", null);
        setField(term250824, term250824.getClass(), "attr", null);
        setIntField(term250824, term250824.getClass(), "index", 0);
        setBooleanField(term250824, term250824.getClass(), "attribute", false);
        setField(term250824, term250824.getClass(), "rootNode", null);
        setField(term250824, term250824.getClass(), "namespaceResolver", null);
        setField(term250824, term250824.getClass(), "parent", null);
        setField(term250824, term250824.getClass(), "locale", null);
        setField(term250823, term250823.getClass(), "parent", term250824);
        setField(term250823, term250823.getClass(), "locale", null);
        setField(term250820, term250820.getClass(), "parent", term250823);
        setField(term250820, term250820.getClass(), "locale", null);
        setField(term250819, term250819.getClass(), "parent", term250820);
        setField(term250819, term250819.getClass(), "attributes", null);
        setIntField(term250819, term250819.getClass(), "position", 0);
        term250825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term250828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term250829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        setField(term250825, term250825.getClass(), "dynaBean", null);
        setField(term250825, term250825.getClass(), "name", "*");
        setField(term250825, term250825.getClass(), "names", null);
        setIntField(term250825, term250825.getClass(), "propertyIndex", 0);
        setField(term250825, term250825.getClass(), "bean", null);
        setField(term250825, term250825.getClass(), "value", null);
        setIntField(term250825, term250825.getClass(), "index", 0);
        setBooleanField(term250825, term250825.getClass(), "attribute", false);
        setField(term250825, term250825.getClass(), "rootNode", null);
        setField(term250825, term250825.getClass(), "namespaceResolver", null);
        setField(term250828, term250828.getClass(), "attr", null);
        setIntField(term250828, term250828.getClass(), "index", 0);
        setBooleanField(term250828, term250828.getClass(), "attribute", false);
        setField(term250828, term250828.getClass(), "rootNode", null);
        setField(term250828, term250828.getClass(), "namespaceResolver", null);
        setField(term250829, term250829.getClass(), "attr", null);
        setIntField(term250829, term250829.getClass(), "index", 0);
        setBooleanField(term250829, term250829.getClass(), "attribute", false);
        setField(term250829, term250829.getClass(), "rootNode", null);
        setField(term250829, term250829.getClass(), "namespaceResolver", null);
        setField(term250829, term250829.getClass(), "parent", null);
        setField(term250829, term250829.getClass(), "locale", null);
        setField(term250828, term250828.getClass(), "parent", term250829);
        setField(term250828, term250828.getClass(), "locale", null);
        setField(term250825, term250825.getClass(), "parent", term250828);
        setField(term250825, term250825.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term249481;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term250819));
        assertTrue(recursiveEquals(term249481, term250825));
    }

};


