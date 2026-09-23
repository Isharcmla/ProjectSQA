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
import java.util.HashMap;

public class JDOMNodePointer_equals_50897049480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2459;
     Object term2514;
     Object term10520;
     Object term10535;

    public JDOMNodePointer_equals_50897049480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2481 = new HashMap();
        HashMap term2486 = new HashMap();
        HashMap term2492 = new HashMap();
        HashMap term2497 = new HashMap();
        HashMap term2503 = new HashMap();
        HashMap term2508 = new HashMap();
        term2459 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2460 = newInstance(Class.forName("java.lang.Object"));
        Object term2475 = newInstance(Class.forName("java.lang.Object"));
        Object term2476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2477 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2478 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2459, term2459.getClass(), "node", term2460);
        setField(term2459, term2459.getClass(), "id", "nGKItKLYNC");
        setIntField(term2459, term2459.getClass(), "index", -73683645);
        setBooleanField(term2459, term2459.getClass(), "attribute", true);
        setField(term2459, term2459.getClass(), "rootNode", term2475);
        setField(term2479, term2479.getClass(), "parent", null);
        setField(term2479, term2479.getClass(), "namespaceMap", null);
        setField(term2479, term2479.getClass(), "reverseMap", null);
        setField(term2479, term2479.getClass(), "pointer", null);
        setField(term2479, term2479.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2479, term2479.getClass(), "sealed", false);
        setField(term2478, term2478.getClass(), "parent", term2479);
        setField(term2478, term2478.getClass(), "namespaceMap", term2481);
        setField(term2478, term2478.getClass(), "reverseMap", term2486);
        setField(term2478, term2478.getClass(), "pointer", null);
        setField(term2478, term2478.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2478, term2478.getClass(), "sealed", false);
        setField(term2477, term2477.getClass(), "parent", term2478);
        setField(term2477, term2477.getClass(), "namespaceMap", term2492);
        setField(term2477, term2477.getClass(), "reverseMap", term2497);
        setField(term2477, term2477.getClass(), "pointer", null);
        setField(term2477, term2477.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2477, term2477.getClass(), "sealed", false);
        setField(term2476, term2476.getClass(), "parent", term2477);
        setField(term2476, term2476.getClass(), "namespaceMap", term2503);
        setField(term2476, term2476.getClass(), "reverseMap", term2508);
        setField(term2476, term2476.getClass(), "pointer", null);
        setField(term2476, term2476.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2476, term2476.getClass(), "sealed", false);
        setField(term2459, term2459.getClass(), "namespaceResolver", term2476);
        setField(term2459, term2459.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "locale", null);
        term2514 = newInstance(Class.forName("java.lang.Object"));
        HashMap term10529 = new HashMap();
        HashMap term10530 = new HashMap();
        HashMap term10531 = new HashMap();
        HashMap term10532 = new HashMap();
        HashMap term10533 = new HashMap();
        HashMap term10534 = new HashMap();
        term10520 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term10521 = newInstance(Class.forName("java.lang.Object"));
        Object term10524 = newInstance(Class.forName("java.lang.Object"));
        Object term10525 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10526 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10527 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10528 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10520, term10520.getClass(), "node", term10521);
        setField(term10520, term10520.getClass(), "id", "nGKItKLYNC");
        setIntField(term10520, term10520.getClass(), "index", -73683645);
        setBooleanField(term10520, term10520.getClass(), "attribute", true);
        setField(term10520, term10520.getClass(), "rootNode", term10524);
        setField(term10528, term10528.getClass(), "parent", null);
        setField(term10528, term10528.getClass(), "namespaceMap", null);
        setField(term10528, term10528.getClass(), "reverseMap", null);
        setField(term10528, term10528.getClass(), "pointer", null);
        setField(term10528, term10528.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10528, term10528.getClass(), "sealed", false);
        setField(term10527, term10527.getClass(), "parent", term10528);
        setField(term10527, term10527.getClass(), "namespaceMap", term10529);
        setField(term10527, term10527.getClass(), "reverseMap", term10530);
        setField(term10527, term10527.getClass(), "pointer", null);
        setField(term10527, term10527.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10527, term10527.getClass(), "sealed", false);
        setField(term10526, term10526.getClass(), "parent", term10527);
        setField(term10526, term10526.getClass(), "namespaceMap", term10531);
        setField(term10526, term10526.getClass(), "reverseMap", term10532);
        setField(term10526, term10526.getClass(), "pointer", null);
        setField(term10526, term10526.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10526, term10526.getClass(), "sealed", false);
        setField(term10525, term10525.getClass(), "parent", term10526);
        setField(term10525, term10525.getClass(), "namespaceMap", term10533);
        setField(term10525, term10525.getClass(), "reverseMap", term10534);
        setField(term10525, term10525.getClass(), "pointer", null);
        setField(term10525, term10525.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10525, term10525.getClass(), "sealed", false);
        setField(term10520, term10520.getClass(), "namespaceResolver", term10525);
        setField(term10520, term10520.getClass(), "parent", null);
        setField(term10520, term10520.getClass(), "locale", null);
        term10535 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2514;
        Object retValue = callMethod(klass, "equals", argTypes, term2459, args);
        assertTrue(recursiveEquals(term2459, term10520));
        assertTrue(recursiveEquals(term2514, term10535));
        assertTrue(recursiveEquals(retValue, false));
    }

};


