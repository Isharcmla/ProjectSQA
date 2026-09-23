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

public class DOMNodePointer_childIterator_100704081453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;
     Object term475;
     Object term5179;
     Object term5175;

    public DOMNodePointer_childIterator_100704081453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term398 = new HashMap();
        HashMap term432 = new HashMap();
        HashMap term437 = new HashMap();
        HashMap term443 = new HashMap();
        HashMap term448 = new HashMap();
        HashMap term454 = new HashMap();
        HashMap term459 = new HashMap();
        HashMap term469 = new HashMap();
        term397 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term428 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term429 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term430 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term467 = newInstance(Class.forName("java.lang.Object"));
        Object term468 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term397, term397.getClass(), "node", null);
        setField(term397, term397.getClass(), "namespaces", term398);
        setField(term397, term397.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term397, term397.getClass(), "id", "NRdvgJlhkX");
        setField(term430, term430.getClass(), "parent", null);
        setField(term430, term430.getClass(), "namespaceMap", null);
        setField(term430, term430.getClass(), "reverseMap", null);
        setField(term430, term430.getClass(), "pointer", null);
        setBooleanField(term430, term430.getClass(), "sealed", false);
        setField(term429, term429.getClass(), "parent", term430);
        setField(term429, term429.getClass(), "namespaceMap", term432);
        setField(term429, term429.getClass(), "reverseMap", term437);
        setField(term429, term429.getClass(), "pointer", null);
        setBooleanField(term429, term429.getClass(), "sealed", false);
        setField(term428, term428.getClass(), "parent", term429);
        setField(term428, term428.getClass(), "namespaceMap", term443);
        setField(term428, term428.getClass(), "reverseMap", term448);
        setField(term428, term428.getClass(), "pointer", null);
        setBooleanField(term428, term428.getClass(), "sealed", false);
        setField(term427, term427.getClass(), "parent", term428);
        setField(term427, term427.getClass(), "namespaceMap", term454);
        setField(term427, term427.getClass(), "reverseMap", term459);
        setField(term427, term427.getClass(), "pointer", null);
        setBooleanField(term427, term427.getClass(), "sealed", false);
        setField(term397, term397.getClass(), "localNamespaceResolver", term427);
        setIntField(term397, term397.getClass(), "index", 391863371);
        setBooleanField(term397, term397.getClass(), "attribute", false);
        setField(term397, term397.getClass(), "rootNode", term467);
        setField(term468, term468.getClass(), "parent", null);
        setField(term468, term468.getClass(), "namespaceMap", term469);
        setField(term468, term468.getClass(), "reverseMap", null);
        setField(term468, term468.getClass(), "pointer", null);
        setBooleanField(term468, term468.getClass(), "sealed", false);
        setField(term397, term397.getClass(), "namespaceResolver", term468);
        setField(term397, term397.getClass(), "parent", null);
        setField(term397, term397.getClass(), "locale", null);
        term475 = new Boolean(true);
        HashMap term5180 = new HashMap();
        HashMap term5188 = new HashMap();
        HashMap term5189 = new HashMap();
        HashMap term5190 = new HashMap();
        HashMap term5191 = new HashMap();
        HashMap term5194 = new HashMap();
        term5179 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term5185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5187 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5192 = newInstance(Class.forName("java.lang.Object"));
        Object term5193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term5179, term5179.getClass(), "node", null);
        setField(term5179, term5179.getClass(), "namespaces", term5180);
        setField(term5179, term5179.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term5179, term5179.getClass(), "id", "NRdvgJlhkX");
        setField(term5187, term5187.getClass(), "parent", null);
        setField(term5187, term5187.getClass(), "namespaceMap", null);
        setField(term5187, term5187.getClass(), "reverseMap", null);
        setField(term5187, term5187.getClass(), "pointer", null);
        setBooleanField(term5187, term5187.getClass(), "sealed", false);
        setField(term5186, term5186.getClass(), "parent", term5187);
        setField(term5186, term5186.getClass(), "namespaceMap", term5188);
        setField(term5186, term5186.getClass(), "reverseMap", term5189);
        setField(term5186, term5186.getClass(), "pointer", null);
        setBooleanField(term5186, term5186.getClass(), "sealed", false);
        setField(term5185, term5185.getClass(), "parent", term5186);
        setField(term5185, term5185.getClass(), "namespaceMap", term5190);
        setField(term5185, term5185.getClass(), "reverseMap", term5191);
        setField(term5185, term5185.getClass(), "pointer", null);
        setBooleanField(term5185, term5185.getClass(), "sealed", false);
        setField(term5179, term5179.getClass(), "localNamespaceResolver", term5185);
        setIntField(term5179, term5179.getClass(), "index", 391863371);
        setBooleanField(term5179, term5179.getClass(), "attribute", false);
        setField(term5179, term5179.getClass(), "rootNode", term5192);
        setField(term5193, term5193.getClass(), "parent", null);
        setField(term5193, term5193.getClass(), "namespaceMap", term5194);
        setField(term5193, term5193.getClass(), "reverseMap", null);
        setField(term5193, term5193.getClass(), "pointer", null);
        setBooleanField(term5193, term5193.getClass(), "sealed", false);
        setField(term5179, term5179.getClass(), "namespaceResolver", term5193);
        setField(term5179, term5179.getClass(), "parent", null);
        setField(term5179, term5179.getClass(), "locale", null);
        HashMap term4952 = new HashMap();
        HashMap term4985 = new HashMap();
        HashMap term4990 = new HashMap();
        HashMap term4996 = new HashMap();
        HashMap term5001 = new HashMap();
        HashMap term5011 = new HashMap();
        term5175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator"));
        Object term4951 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term4981 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4982 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term4983 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term5009 = newInstance(Class.forName("java.lang.Object"));
        Object term5010 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term4951, term4951.getClass(), "node", null);
        setField(term4951, term4951.getClass(), "namespaces", term4952);
        setField(term4951, term4951.getClass(), "defaultNamespace", "RMFIsYGgne");
        setField(term4951, term4951.getClass(), "id", "NRdvgJlhkX");
        setField(term4983, term4983.getClass(), "parent", null);
        setField(term4983, term4983.getClass(), "namespaceMap", null);
        setField(term4983, term4983.getClass(), "reverseMap", null);
        setField(term4983, term4983.getClass(), "pointer", null);
        setBooleanField(term4983, term4983.getClass(), "sealed", false);
        setField(term4982, term4982.getClass(), "parent", term4983);
        setField(term4982, term4982.getClass(), "namespaceMap", term4985);
        setField(term4982, term4982.getClass(), "reverseMap", term4990);
        setField(term4982, term4982.getClass(), "pointer", null);
        setBooleanField(term4982, term4982.getClass(), "sealed", false);
        setField(term4981, term4981.getClass(), "parent", term4982);
        setField(term4981, term4981.getClass(), "namespaceMap", term4996);
        setField(term4981, term4981.getClass(), "reverseMap", term5001);
        setField(term4981, term4981.getClass(), "pointer", null);
        setBooleanField(term4981, term4981.getClass(), "sealed", false);
        setField(term4951, term4951.getClass(), "localNamespaceResolver", term4981);
        setIntField(term4951, term4951.getClass(), "index", 391863371);
        setBooleanField(term4951, term4951.getClass(), "attribute", false);
        setField(term4951, term4951.getClass(), "rootNode", term5009);
        setField(term5010, term5010.getClass(), "parent", null);
        setField(term5010, term5010.getClass(), "namespaceMap", term5011);
        setField(term5010, term5010.getClass(), "reverseMap", null);
        setField(term5010, term5010.getClass(), "pointer", null);
        setBooleanField(term5010, term5010.getClass(), "sealed", false);
        setField(term4951, term4951.getClass(), "namespaceResolver", term5010);
        setField(term4951, term4951.getClass(), "parent", null);
        setField(term4951, term4951.getClass(), "locale", null);
        setField(term5175, term5175.getClass(), "parent", term4951);
        setField(term5175, term5175.getClass(), "nodeTest", null);
        setField(term5175, term5175.getClass(), "node", null);
        setField(term5175, term5175.getClass(), "child", null);
        setBooleanField(term5175, term5175.getClass(), "reverse", true);
        setIntField(term5175, term5175.getClass(), "position", 0);
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
        args[1] = term475;
        args[2] = null;
        Object retValue = callMethod(klass, "childIterator", argTypes, term397, args);
        assertTrue(recursiveEquals(term397, term5179));
        assertTrue(recursiveEquals(term475, true));
        assertTrue(recursiveEquals(retValue, term5175));
    }

};


