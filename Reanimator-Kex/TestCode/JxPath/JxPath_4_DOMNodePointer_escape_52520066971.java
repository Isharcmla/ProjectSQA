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

public class DOMNodePointer_escape_52520066971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2538;
     Object term10364;

    public DOMNodePointer_escape_52520066971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2539 = new HashMap();
        HashMap term2576 = new HashMap();
        HashMap term2581 = new HashMap();
        HashMap term2587 = new HashMap();
        HashMap term2592 = new HashMap();
        HashMap term2598 = new HashMap();
        HashMap term2603 = new HashMap();
        term2538 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2570 = newInstance(Class.forName("java.lang.Object"));
        Object term2571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2538, term2538.getClass(), "node", null);
        setField(term2538, term2538.getClass(), "namespaces", term2539);
        setField(term2538, term2538.getClass(), "defaultNamespace", "fhkbdRViHi");
        setField(term2538, term2538.getClass(), "id", "uWHnvSvaPl");
        setIntField(term2538, term2538.getClass(), "index", 1135664017);
        setBooleanField(term2538, term2538.getClass(), "attribute", true);
        setField(term2538, term2538.getClass(), "rootNode", term2570);
        setField(term2574, term2574.getClass(), "parent", null);
        setField(term2574, term2574.getClass(), "namespaceMap", null);
        setField(term2574, term2574.getClass(), "reverseMap", null);
        setField(term2574, term2574.getClass(), "pointer", null);
        setField(term2574, term2574.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2574, term2574.getClass(), "sealed", false);
        setField(term2573, term2573.getClass(), "parent", term2574);
        setField(term2573, term2573.getClass(), "namespaceMap", term2576);
        setField(term2573, term2573.getClass(), "reverseMap", term2581);
        setField(term2573, term2573.getClass(), "pointer", null);
        setField(term2573, term2573.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2573, term2573.getClass(), "sealed", false);
        setField(term2572, term2572.getClass(), "parent", term2573);
        setField(term2572, term2572.getClass(), "namespaceMap", term2587);
        setField(term2572, term2572.getClass(), "reverseMap", term2592);
        setField(term2572, term2572.getClass(), "pointer", null);
        setField(term2572, term2572.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2572, term2572.getClass(), "sealed", false);
        setField(term2571, term2571.getClass(), "parent", term2572);
        setField(term2571, term2571.getClass(), "namespaceMap", term2598);
        setField(term2571, term2571.getClass(), "reverseMap", term2603);
        setField(term2571, term2571.getClass(), "pointer", null);
        setField(term2571, term2571.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2571, term2571.getClass(), "sealed", false);
        setField(term2538, term2538.getClass(), "namespaceResolver", term2571);
        setField(term2538, term2538.getClass(), "parent", null);
        setField(term2538, term2538.getClass(), "locale", null);
        HashMap term10365 = new HashMap();
        HashMap term10375 = new HashMap();
        HashMap term10376 = new HashMap();
        HashMap term10377 = new HashMap();
        HashMap term10378 = new HashMap();
        HashMap term10379 = new HashMap();
        HashMap term10380 = new HashMap();
        term10364 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10370 = newInstance(Class.forName("java.lang.Object"));
        Object term10371 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10372 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10373 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10374 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10364, term10364.getClass(), "node", null);
        setField(term10364, term10364.getClass(), "namespaces", term10365);
        setField(term10364, term10364.getClass(), "defaultNamespace", "fhkbdRViHi");
        setField(term10364, term10364.getClass(), "id", "uWHnvSvaPl");
        setIntField(term10364, term10364.getClass(), "index", 1135664017);
        setBooleanField(term10364, term10364.getClass(), "attribute", true);
        setField(term10364, term10364.getClass(), "rootNode", term10370);
        setField(term10374, term10374.getClass(), "parent", null);
        setField(term10374, term10374.getClass(), "namespaceMap", null);
        setField(term10374, term10374.getClass(), "reverseMap", null);
        setField(term10374, term10374.getClass(), "pointer", null);
        setField(term10374, term10374.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10374, term10374.getClass(), "sealed", false);
        setField(term10373, term10373.getClass(), "parent", term10374);
        setField(term10373, term10373.getClass(), "namespaceMap", term10375);
        setField(term10373, term10373.getClass(), "reverseMap", term10376);
        setField(term10373, term10373.getClass(), "pointer", null);
        setField(term10373, term10373.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10373, term10373.getClass(), "sealed", false);
        setField(term10372, term10372.getClass(), "parent", term10373);
        setField(term10372, term10372.getClass(), "namespaceMap", term10377);
        setField(term10372, term10372.getClass(), "reverseMap", term10378);
        setField(term10372, term10372.getClass(), "pointer", null);
        setField(term10372, term10372.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10372, term10372.getClass(), "sealed", false);
        setField(term10371, term10371.getClass(), "parent", term10372);
        setField(term10371, term10371.getClass(), "namespaceMap", term10379);
        setField(term10371, term10371.getClass(), "reverseMap", term10380);
        setField(term10371, term10371.getClass(), "pointer", null);
        setField(term10371, term10371.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10371, term10371.getClass(), "sealed", false);
        setField(term10364, term10364.getClass(), "namespaceResolver", term10371);
        setField(term10364, term10364.getClass(), "parent", null);
        setField(term10364, term10364.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        Object retValue = callMethod(klass, "escape", argTypes, term2538, args);
        assertTrue(recursiveEquals(term2538, term10364));
        assertTrue(recursiveEquals(retValue, "kBdSllIBVz"));
    }

};


