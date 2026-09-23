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

public class JDOMAttributeIterator_init_206761542835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8247;
     Object term15819;
     Object term15823;

    public JDOMAttributeIterator_init_206761542835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7993 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term8119 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNamespacePointer"));
        setIntField(term7993, term7993.getClass(), "position", 0);
        setField(term7993, term7993.getClass(), "parent", term8119);
        term8247 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term8375 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        setField(term8375, term8375.getClass(), "valuePointer", null);
        setField(term8375, term8375.getClass(), "container", null);
        setIntField(term8375, term8375.getClass(), "index", 0);
        setField(term8247, term8247.getClass(), "valuePointer", term8375);
        Object[] term7858 = (Object[]) newArray("org.apache.commons.jxpath.ri.model.NodePointerFactory", 6);
        Object term8511 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory"));
        Object term8629 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory"));
        Object term8751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory"));
        Object term8893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory"));
        Object term9033 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory"));
        Object term9167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory"));
        setElement(term7858, 0, term8511);
        setElement(term7858, 1, term8629);
        setElement(term7858, 2, term8751);
        setElement(term7858, 3, term8893);
        setElement(term7858, 4, term9033);
        setElement(term7858, 5, term9167);
        setField(null, Class.forName("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl"), "nodeFactoryArray", term7858);
        term15819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator"));
        Object term15820 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term15821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term15822 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term15820, term15820.getClass(), "container", null);
        setField(term15821, term15821.getClass(), "container", null);
        setField(term15822, term15822.getClass(), "name", null);
        setField(term15822, term15822.getClass(), "id", null);
        setField(term15822, term15822.getClass(), "value", null);
        setIntField(term15822, term15822.getClass(), "index", -2147483648);
        setBooleanField(term15822, term15822.getClass(), "attribute", false);
        setField(term15822, term15822.getClass(), "rootNode", null);
        setField(term15822, term15822.getClass(), "namespaceResolver", null);
        setField(term15822, term15822.getClass(), "parent", term15821);
        setField(term15822, term15822.getClass(), "locale", null);
        setField(term15821, term15821.getClass(), "valuePointer", term15822);
        setIntField(term15821, term15821.getClass(), "index", 0);
        setBooleanField(term15821, term15821.getClass(), "attribute", false);
        setField(term15821, term15821.getClass(), "rootNode", null);
        setField(term15821, term15821.getClass(), "namespaceResolver", null);
        setField(term15821, term15821.getClass(), "parent", null);
        setField(term15821, term15821.getClass(), "locale", null);
        setField(term15820, term15820.getClass(), "valuePointer", term15821);
        setIntField(term15820, term15820.getClass(), "index", 0);
        setBooleanField(term15820, term15820.getClass(), "attribute", false);
        setField(term15820, term15820.getClass(), "rootNode", null);
        setField(term15820, term15820.getClass(), "namespaceResolver", null);
        setField(term15820, term15820.getClass(), "parent", null);
        setField(term15820, term15820.getClass(), "locale", null);
        setField(term15819, term15819.getClass(), "parent", term15820);
        setField(term15819, term15819.getClass(), "attributes", null);
        setIntField(term15819, term15819.getClass(), "position", 0);
        term15823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term15824 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.container.ContainerPointer"));
        Object term15825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        setField(term15823, term15823.getClass(), "container", null);
        setField(term15824, term15824.getClass(), "container", null);
        setField(term15825, term15825.getClass(), "name", null);
        setField(term15825, term15825.getClass(), "id", null);
        setField(term15825, term15825.getClass(), "value", null);
        setIntField(term15825, term15825.getClass(), "index", -2147483648);
        setBooleanField(term15825, term15825.getClass(), "attribute", false);
        setField(term15825, term15825.getClass(), "rootNode", null);
        setField(term15825, term15825.getClass(), "namespaceResolver", null);
        setField(term15825, term15825.getClass(), "parent", term15824);
        setField(term15825, term15825.getClass(), "locale", null);
        setField(term15824, term15824.getClass(), "valuePointer", term15825);
        setIntField(term15824, term15824.getClass(), "index", 0);
        setBooleanField(term15824, term15824.getClass(), "attribute", false);
        setField(term15824, term15824.getClass(), "rootNode", null);
        setField(term15824, term15824.getClass(), "namespaceResolver", null);
        setField(term15824, term15824.getClass(), "parent", null);
        setField(term15824, term15824.getClass(), "locale", null);
        setField(term15823, term15823.getClass(), "valuePointer", term15824);
        setIntField(term15823, term15823.getClass(), "index", 0);
        setBooleanField(term15823, term15823.getClass(), "attribute", false);
        setField(term15823, term15823.getClass(), "rootNode", null);
        setField(term15823, term15823.getClass(), "namespaceResolver", null);
        setField(term15823, term15823.getClass(), "parent", null);
        setField(term15823, term15823.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = term8247;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15819));
        assertTrue(recursiveEquals(term8247, term15823));
    }

};


