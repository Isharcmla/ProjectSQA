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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_createAttribute_14964584070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;
     Object term2646;

    public DOMNodePointer_createAttribute_14964584070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2564 = new HashMap();
        HashMap term2598 = new HashMap();
        HashMap term2603 = new HashMap();
        HashMap term2609 = new HashMap();
        HashMap term2614 = new HashMap();
        HashMap term2620 = new HashMap();
        HashMap term2625 = new HashMap();
        HashMap term2634 = new HashMap();
        HashMap term2639 = new HashMap();
        term2563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2594 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2595 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2645 = newInstance(Class.forName("java.lang.Object"));
        setField(term2563, term2563.getClass(), "node", null);
        setField(term2563, term2563.getClass(), "namespaces", term2564);
        setField(term2563, term2563.getClass(), "defaultNamespace", "ytSBIKXogI");
        setField(term2563, term2563.getClass(), "id", "nHXjMycHlU");
        setField(term2596, term2596.getClass(), "parent", null);
        setField(term2596, term2596.getClass(), "namespaceMap", null);
        setField(term2596, term2596.getClass(), "reverseMap", null);
        setField(term2596, term2596.getClass(), "pointer", null);
        setBooleanField(term2596, term2596.getClass(), "sealed", false);
        setField(term2595, term2595.getClass(), "parent", term2596);
        setField(term2595, term2595.getClass(), "namespaceMap", term2598);
        setField(term2595, term2595.getClass(), "reverseMap", term2603);
        setField(term2595, term2595.getClass(), "pointer", null);
        setBooleanField(term2595, term2595.getClass(), "sealed", false);
        setField(term2594, term2594.getClass(), "parent", term2595);
        setField(term2594, term2594.getClass(), "namespaceMap", term2609);
        setField(term2594, term2594.getClass(), "reverseMap", term2614);
        setField(term2594, term2594.getClass(), "pointer", null);
        setBooleanField(term2594, term2594.getClass(), "sealed", false);
        setField(term2593, term2593.getClass(), "parent", term2594);
        setField(term2593, term2593.getClass(), "namespaceMap", term2620);
        setField(term2593, term2593.getClass(), "reverseMap", term2625);
        setField(term2593, term2593.getClass(), "pointer", null);
        setBooleanField(term2593, term2593.getClass(), "sealed", false);
        setField(term2563, term2563.getClass(), "localNamespaceResolver", term2593);
        setIntField(term2563, term2563.getClass(), "index", -117576464);
        setBooleanField(term2563, term2563.getClass(), "attribute", true);
        setField(term2633, term2633.getClass(), "parent", null);
        setField(term2633, term2633.getClass(), "namespaceMap", term2634);
        setField(term2633, term2633.getClass(), "reverseMap", term2639);
        setField(term2633, term2633.getClass(), "pointer", null);
        setBooleanField(term2633, term2633.getClass(), "sealed", false);
        setField(term2563, term2563.getClass(), "namespaceResolver", term2633);
        setField(term2563, term2563.getClass(), "rootNode", term2645);
        setField(term2563, term2563.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "locale", null);
        term2646 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2646, term2646.getClass(), "prefix", "ieCtQFdkii");
        setField(term2646, term2646.getClass(), "name", "dEnhdmILtU");
        setField(term2646, term2646.getClass(), "qualifiedName", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2646;
        try {
            callMethod(klass, "createAttribute", argTypes, term2563, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


