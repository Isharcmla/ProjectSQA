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

public class JDOMAttributeIterator_init_2067615428295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199482;
     Object term200235;
     Object term200242;

    public JDOMAttributeIterator_init_2067615428295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term199340 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        setIntField(term199340, term199340.getClass(), "position", 0);
        setField(term199340, term199340.getClass(), "parent", null);
        term199482 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object term199608 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term199718 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        Object[] term199111 = (Object[]) newArray("java.lang.String", 0);
        setField(term199718, term199718.getClass(), "parent", null);
        setField(term199608, term199608.getClass(), "parent", term199718);
        setField(term199482, term199482.getClass(), "parent", term199608);
        setField(term199482, term199482.getClass(), "name", null);
        setField(term199482, term199482.getClass(), "names", term199111);
        setIntField(term199482, term199482.getClass(), "propertyIndex", 0);
        Object[] term199210 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 2);
        Object term199854 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term199978 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory"));
        setElement(term199210, 0, term199854);
        setElement(term199210, 1, term199978);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term199210);
        term200235 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term200236 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term200239 = (Object[]) newArray("java.lang.String", 0);
        Object term200240 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term200241 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term200236, term200236.getClass(), "dynaBean", null);
        setField(term200236, term200236.getClass(), "name", "*");
        setField(term200236, term200236.getClass(), "names", term200239);
        setIntField(term200236, term200236.getClass(), "propertyIndex", 0);
        setField(term200236, term200236.getClass(), "bean", null);
        setField(term200236, term200236.getClass(), "value", null);
        setIntField(term200236, term200236.getClass(), "index", 0);
        setBooleanField(term200236, term200236.getClass(), "attribute", false);
        setField(term200236, term200236.getClass(), "rootNode", null);
        setField(term200236, term200236.getClass(), "namespaceResolver", null);
        setField(term200240, term200240.getClass(), "attr", null);
        setIntField(term200240, term200240.getClass(), "index", 0);
        setBooleanField(term200240, term200240.getClass(), "attribute", false);
        setField(term200240, term200240.getClass(), "rootNode", null);
        setField(term200240, term200240.getClass(), "namespaceResolver", null);
        setField(term200241, term200241.getClass(), "this$0", null);
        setField(term200241, term200241.getClass(), "name", null);
        setField(term200241, term200241.getClass(), "id", null);
        setField(term200241, term200241.getClass(), "value", null);
        setIntField(term200241, term200241.getClass(), "index", 0);
        setBooleanField(term200241, term200241.getClass(), "attribute", false);
        setField(term200241, term200241.getClass(), "rootNode", null);
        setField(term200241, term200241.getClass(), "namespaceResolver", null);
        setField(term200241, term200241.getClass(), "parent", null);
        setField(term200241, term200241.getClass(), "locale", null);
        setField(term200240, term200240.getClass(), "parent", term200241);
        setField(term200240, term200240.getClass(), "locale", null);
        setField(term200236, term200236.getClass(), "parent", term200240);
        setField(term200236, term200236.getClass(), "locale", null);
        setField(term200235, term200235.getClass(), "parent", term200236);
        setField(term200235, term200235.getClass(), "attributes", null);
        setIntField(term200235, term200235.getClass(), "position", 0);
        term200242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer"));
        Object[] term200245 = (Object[]) newArray("java.lang.String", 0);
        Object term200246 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer"));
        Object term200247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.VariablePointer$1"));
        setField(term200242, term200242.getClass(), "dynaBean", null);
        setField(term200242, term200242.getClass(), "name", "*");
        setField(term200242, term200242.getClass(), "names", term200245);
        setIntField(term200242, term200242.getClass(), "propertyIndex", 0);
        setField(term200242, term200242.getClass(), "bean", null);
        setField(term200242, term200242.getClass(), "value", null);
        setIntField(term200242, term200242.getClass(), "index", 0);
        setBooleanField(term200242, term200242.getClass(), "attribute", false);
        setField(term200242, term200242.getClass(), "rootNode", null);
        setField(term200242, term200242.getClass(), "namespaceResolver", null);
        setField(term200246, term200246.getClass(), "attr", null);
        setIntField(term200246, term200246.getClass(), "index", 0);
        setBooleanField(term200246, term200246.getClass(), "attribute", false);
        setField(term200246, term200246.getClass(), "rootNode", null);
        setField(term200246, term200246.getClass(), "namespaceResolver", null);
        setField(term200247, term200247.getClass(), "this$0", null);
        setField(term200247, term200247.getClass(), "name", null);
        setField(term200247, term200247.getClass(), "id", null);
        setField(term200247, term200247.getClass(), "value", null);
        setIntField(term200247, term200247.getClass(), "index", 0);
        setBooleanField(term200247, term200247.getClass(), "attribute", false);
        setField(term200247, term200247.getClass(), "rootNode", null);
        setField(term200247, term200247.getClass(), "namespaceResolver", null);
        setField(term200247, term200247.getClass(), "parent", null);
        setField(term200247, term200247.getClass(), "locale", null);
        setField(term200246, term200246.getClass(), "parent", term200247);
        setField(term200246, term200246.getClass(), "locale", null);
        setField(term200242, term200242.getClass(), "parent", term200246);
        setField(term200242, term200242.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term199482;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term200235));
        assertTrue(recursiveEquals(term199482, term200242));
    }

};


