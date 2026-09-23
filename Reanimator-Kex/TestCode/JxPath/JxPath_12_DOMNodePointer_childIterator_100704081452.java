package org.apache.commons.jxpath.ri.model.dom;

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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class DOMNodePointer_childIterator_100704081452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term447;
     Object term4828;
     Object term4824;

    public DOMNodePointer_childIterator_100704081452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term377 = new HashMap();
        HashMap term414 = new HashMap();
        HashMap term419 = new HashMap();
        HashMap term425 = new HashMap();
        HashMap term430 = new HashMap();
        HashMap term436 = new HashMap();
        HashMap term441 = new HashMap();
        term376 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term408 = newInstance(Class.forName("java.lang.Object"));
        Object term409 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term410 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term411 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term412 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term376, term376.getClass(), "node", null);
        setField(term376, term376.getClass(), "namespaces", term377);
        setField(term376, term376.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term376, term376.getClass(), "id", "NRdvgJlhkX");
        setIntField(term376, term376.getClass(), "index", 391863371);
        setBooleanField(term376, term376.getClass(), "attribute", false);
        setField(term376, term376.getClass(), "rootNode", term408);
        setField(term412, term412.getClass(), "parent", null);
        setField(term412, term412.getClass(), "namespaceMap", null);
        setField(term412, term412.getClass(), "reverseMap", null);
        setField(term412, term412.getClass(), "pointer", null);
        setBooleanField(term412, term412.getClass(), "sealed", false);
        setField(term411, term411.getClass(), "parent", term412);
        setField(term411, term411.getClass(), "namespaceMap", term414);
        setField(term411, term411.getClass(), "reverseMap", term419);
        setField(term411, term411.getClass(), "pointer", null);
        setBooleanField(term411, term411.getClass(), "sealed", false);
        setField(term410, term410.getClass(), "parent", term411);
        setField(term410, term410.getClass(), "namespaceMap", term425);
        setField(term410, term410.getClass(), "reverseMap", term430);
        setField(term410, term410.getClass(), "pointer", null);
        setBooleanField(term410, term410.getClass(), "sealed", false);
        setField(term409, term409.getClass(), "parent", term410);
        setField(term409, term409.getClass(), "namespaceMap", term436);
        setField(term409, term409.getClass(), "reverseMap", term441);
        setField(term409, term409.getClass(), "pointer", null);
        setBooleanField(term409, term409.getClass(), "sealed", false);
        setField(term376, term376.getClass(), "namespaceResolver", term409);
        setField(term376, term376.getClass(), "parent", null);
        setField(term376, term376.getClass(), "locale", null);
        term447 = new Boolean(true);
        HashMap term4829 = new HashMap();
        HashMap term4838 = new HashMap();
        HashMap term4839 = new HashMap();
        HashMap term4840 = new HashMap();
        HashMap term4841 = new HashMap();
        term4828 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4834 = newInstance(Class.forName("java.lang.Object"));
        Object term4835 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4836 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4837 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4828, term4828.getClass(), "node", null);
        setField(term4828, term4828.getClass(), "namespaces", term4829);
        setField(term4828, term4828.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term4828, term4828.getClass(), "id", "NRdvgJlhkX");
        setIntField(term4828, term4828.getClass(), "index", 391863371);
        setBooleanField(term4828, term4828.getClass(), "attribute", false);
        setField(term4828, term4828.getClass(), "rootNode", term4834);
        setField(term4837, term4837.getClass(), "parent", null);
        setField(term4837, term4837.getClass(), "namespaceMap", null);
        setField(term4837, term4837.getClass(), "reverseMap", null);
        setField(term4837, term4837.getClass(), "pointer", null);
        setBooleanField(term4837, term4837.getClass(), "sealed", false);
        setField(term4836, term4836.getClass(), "parent", term4837);
        setField(term4836, term4836.getClass(), "namespaceMap", term4838);
        setField(term4836, term4836.getClass(), "reverseMap", term4839);
        setField(term4836, term4836.getClass(), "pointer", null);
        setBooleanField(term4836, term4836.getClass(), "sealed", false);
        setField(term4835, term4835.getClass(), "parent", term4836);
        setField(term4835, term4835.getClass(), "namespaceMap", term4840);
        setField(term4835, term4835.getClass(), "reverseMap", term4841);
        setField(term4835, term4835.getClass(), "pointer", null);
        setBooleanField(term4835, term4835.getClass(), "sealed", false);
        setField(term4828, term4828.getClass(), "namespaceResolver", term4835);
        setField(term4828, term4828.getClass(), "parent", null);
        setField(term4828, term4828.getClass(), "locale", null);
        HashMap term4622 = new HashMap();
        HashMap term4658 = new HashMap();
        HashMap term4663 = new HashMap();
        HashMap term4669 = new HashMap();
        HashMap term4674 = new HashMap();
        term4824 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        Object term4621 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4653 = newInstance(Class.forName("java.lang.Object"));
        Object term4654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4655 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4621, term4621.getClass(), "node", null);
        setField(term4621, term4621.getClass(), "namespaces", term4622);
        setField(term4621, term4621.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term4621, term4621.getClass(), "id", "NRdvgJlhkX");
        setIntField(term4621, term4621.getClass(), "index", 391863371);
        setBooleanField(term4621, term4621.getClass(), "attribute", false);
        setField(term4621, term4621.getClass(), "rootNode", term4653);
        setField(term4656, term4656.getClass(), "parent", null);
        setField(term4656, term4656.getClass(), "namespaceMap", null);
        setField(term4656, term4656.getClass(), "reverseMap", null);
        setField(term4656, term4656.getClass(), "pointer", null);
        setBooleanField(term4656, term4656.getClass(), "sealed", false);
        setField(term4655, term4655.getClass(), "parent", term4656);
        setField(term4655, term4655.getClass(), "namespaceMap", term4658);
        setField(term4655, term4655.getClass(), "reverseMap", term4663);
        setField(term4655, term4655.getClass(), "pointer", null);
        setBooleanField(term4655, term4655.getClass(), "sealed", false);
        setField(term4654, term4654.getClass(), "parent", term4655);
        setField(term4654, term4654.getClass(), "namespaceMap", term4669);
        setField(term4654, term4654.getClass(), "reverseMap", term4674);
        setField(term4654, term4654.getClass(), "pointer", null);
        setBooleanField(term4654, term4654.getClass(), "sealed", false);
        setField(term4621, term4621.getClass(), "namespaceResolver", term4654);
        setField(term4621, term4621.getClass(), "parent", null);
        setField(term4621, term4621.getClass(), "locale", null);
        setField(term4824, term4824.getClass(), "parent", term4621);
        setField(term4824, term4824.getClass(), "nodeTest", null);
        setField(term4824, term4824.getClass(), "node", null);
        setField(term4824, term4824.getClass(), "child", null);
        setBooleanField(term4824, term4824.getClass(), "reverse", true);
        setIntField(term4824, term4824.getClass(), "position", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.apache.commons.jxpath.ri.model.NodePointer");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term447;
        args[2] = null;
        Object retValue = callMethod(klass, "childIterator", argTypes, term376, args);
        assertTrue(recursiveEquals(term376, term4828));
        assertTrue(recursiveEquals(term447, true));
        assertTrue(recursiveEquals(retValue, term4824));
    }

};


