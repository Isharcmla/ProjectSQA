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

public class DOMNodePointer_childIterator_100704081451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term447;
     Object term4806;
     Object term4802;

    public DOMNodePointer_childIterator_100704081451() {
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
        setField(term412, term412.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term412, term412.getClass(), "sealed", false);
        setField(term411, term411.getClass(), "parent", term412);
        setField(term411, term411.getClass(), "namespaceMap", term414);
        setField(term411, term411.getClass(), "reverseMap", term419);
        setField(term411, term411.getClass(), "pointer", null);
        setField(term411, term411.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term411, term411.getClass(), "sealed", false);
        setField(term410, term410.getClass(), "parent", term411);
        setField(term410, term410.getClass(), "namespaceMap", term425);
        setField(term410, term410.getClass(), "reverseMap", term430);
        setField(term410, term410.getClass(), "pointer", null);
        setField(term410, term410.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term410, term410.getClass(), "sealed", false);
        setField(term409, term409.getClass(), "parent", term410);
        setField(term409, term409.getClass(), "namespaceMap", term436);
        setField(term409, term409.getClass(), "reverseMap", term441);
        setField(term409, term409.getClass(), "pointer", null);
        setField(term409, term409.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term409, term409.getClass(), "sealed", false);
        setField(term376, term376.getClass(), "namespaceResolver", term409);
        setField(term376, term376.getClass(), "parent", null);
        setField(term376, term376.getClass(), "locale", null);
        term447 = new Boolean(true);
        HashMap term4807 = new HashMap();
        HashMap term4816 = new HashMap();
        HashMap term4817 = new HashMap();
        HashMap term4818 = new HashMap();
        HashMap term4819 = new HashMap();
        term4806 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4812 = newInstance(Class.forName("java.lang.Object"));
        Object term4813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4806, term4806.getClass(), "node", null);
        setField(term4806, term4806.getClass(), "namespaces", term4807);
        setField(term4806, term4806.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term4806, term4806.getClass(), "id", "NRdvgJlhkX");
        setIntField(term4806, term4806.getClass(), "index", 391863371);
        setBooleanField(term4806, term4806.getClass(), "attribute", false);
        setField(term4806, term4806.getClass(), "rootNode", term4812);
        setField(term4815, term4815.getClass(), "parent", null);
        setField(term4815, term4815.getClass(), "namespaceMap", null);
        setField(term4815, term4815.getClass(), "reverseMap", null);
        setField(term4815, term4815.getClass(), "pointer", null);
        setField(term4815, term4815.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4815, term4815.getClass(), "sealed", false);
        setField(term4814, term4814.getClass(), "parent", term4815);
        setField(term4814, term4814.getClass(), "namespaceMap", term4816);
        setField(term4814, term4814.getClass(), "reverseMap", term4817);
        setField(term4814, term4814.getClass(), "pointer", null);
        setField(term4814, term4814.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4814, term4814.getClass(), "sealed", false);
        setField(term4813, term4813.getClass(), "parent", term4814);
        setField(term4813, term4813.getClass(), "namespaceMap", term4818);
        setField(term4813, term4813.getClass(), "reverseMap", term4819);
        setField(term4813, term4813.getClass(), "pointer", null);
        setField(term4813, term4813.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4813, term4813.getClass(), "sealed", false);
        setField(term4806, term4806.getClass(), "namespaceResolver", term4813);
        setField(term4806, term4806.getClass(), "parent", null);
        setField(term4806, term4806.getClass(), "locale", null);
        HashMap term4600 = new HashMap();
        HashMap term4636 = new HashMap();
        HashMap term4641 = new HashMap();
        HashMap term4647 = new HashMap();
        HashMap term4652 = new HashMap();
        term4802 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        Object term4599 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4631 = newInstance(Class.forName("java.lang.Object"));
        Object term4632 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4634 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4599, term4599.getClass(), "node", null);
        setField(term4599, term4599.getClass(), "namespaces", term4600);
        setField(term4599, term4599.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term4599, term4599.getClass(), "id", "NRdvgJlhkX");
        setIntField(term4599, term4599.getClass(), "index", 391863371);
        setBooleanField(term4599, term4599.getClass(), "attribute", false);
        setField(term4599, term4599.getClass(), "rootNode", term4631);
        setField(term4634, term4634.getClass(), "parent", null);
        setField(term4634, term4634.getClass(), "namespaceMap", null);
        setField(term4634, term4634.getClass(), "reverseMap", null);
        setField(term4634, term4634.getClass(), "pointer", null);
        setField(term4634, term4634.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4634, term4634.getClass(), "sealed", false);
        setField(term4633, term4633.getClass(), "parent", term4634);
        setField(term4633, term4633.getClass(), "namespaceMap", term4636);
        setField(term4633, term4633.getClass(), "reverseMap", term4641);
        setField(term4633, term4633.getClass(), "pointer", null);
        setField(term4633, term4633.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4633, term4633.getClass(), "sealed", false);
        setField(term4632, term4632.getClass(), "parent", term4633);
        setField(term4632, term4632.getClass(), "namespaceMap", term4647);
        setField(term4632, term4632.getClass(), "reverseMap", term4652);
        setField(term4632, term4632.getClass(), "pointer", null);
        setField(term4632, term4632.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term4632, term4632.getClass(), "sealed", false);
        setField(term4599, term4599.getClass(), "namespaceResolver", term4632);
        setField(term4599, term4599.getClass(), "parent", null);
        setField(term4599, term4599.getClass(), "locale", null);
        setField(term4802, term4802.getClass(), "parent", term4599);
        setField(term4802, term4802.getClass(), "nodeTest", null);
        setField(term4802, term4802.getClass(), "node", null);
        setField(term4802, term4802.getClass(), "child", null);
        setBooleanField(term4802, term4802.getClass(), "reverse", true);
        setIntField(term4802, term4802.getClass(), "position", 0);
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
        assertTrue(recursiveEquals(term376, term4806));
        assertTrue(recursiveEquals(term447, true));
        assertTrue(recursiveEquals(retValue, term4802));
    }

};


