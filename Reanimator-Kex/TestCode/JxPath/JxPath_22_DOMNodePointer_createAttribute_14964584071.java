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

public class DOMNodePointer_createAttribute_14964584071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2542;
     Object term2624;

    public DOMNodePointer_createAttribute_14964584071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2543 = new HashMap();
        HashMap term2577 = new HashMap();
        HashMap term2582 = new HashMap();
        HashMap term2588 = new HashMap();
        HashMap term2593 = new HashMap();
        HashMap term2599 = new HashMap();
        HashMap term2604 = new HashMap();
        HashMap term2613 = new HashMap();
        HashMap term2618 = new HashMap();
        term2542 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2574 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2612 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2542, term2542.getClass(), "node", null);
        setField(term2542, term2542.getClass(), "namespaces", term2543);
        setField(term2542, term2542.getClass(), "defaultNamespace", "ytSBIKXogI");
        setField(term2542, term2542.getClass(), "id", "nHXjMycHlU");
        setField(term2575, term2575.getClass(), "parent", null);
        setField(term2575, term2575.getClass(), "namespaceMap", null);
        setField(term2575, term2575.getClass(), "reverseMap", null);
        setField(term2575, term2575.getClass(), "pointer", null);
        setBooleanField(term2575, term2575.getClass(), "sealed", false);
        setField(term2574, term2574.getClass(), "parent", term2575);
        setField(term2574, term2574.getClass(), "namespaceMap", term2577);
        setField(term2574, term2574.getClass(), "reverseMap", term2582);
        setField(term2574, term2574.getClass(), "pointer", null);
        setBooleanField(term2574, term2574.getClass(), "sealed", false);
        setField(term2573, term2573.getClass(), "parent", term2574);
        setField(term2573, term2573.getClass(), "namespaceMap", term2588);
        setField(term2573, term2573.getClass(), "reverseMap", term2593);
        setField(term2573, term2573.getClass(), "pointer", null);
        setBooleanField(term2573, term2573.getClass(), "sealed", false);
        setField(term2572, term2572.getClass(), "parent", term2573);
        setField(term2572, term2572.getClass(), "namespaceMap", term2599);
        setField(term2572, term2572.getClass(), "reverseMap", term2604);
        setField(term2572, term2572.getClass(), "pointer", null);
        setBooleanField(term2572, term2572.getClass(), "sealed", false);
        setField(term2542, term2542.getClass(), "localNamespaceResolver", term2572);
        setIntField(term2542, term2542.getClass(), "index", -117576464);
        setBooleanField(term2542, term2542.getClass(), "attribute", true);
        setField(term2612, term2612.getClass(), "parent", null);
        setField(term2612, term2612.getClass(), "namespaceMap", term2613);
        setField(term2612, term2612.getClass(), "reverseMap", term2618);
        setField(term2612, term2612.getClass(), "pointer", null);
        setBooleanField(term2612, term2612.getClass(), "sealed", false);
        setField(term2542, term2542.getClass(), "namespaceResolver", term2612);
        setField(term2542, term2542.getClass(), "exceptionHandler", null);
        setField(term2542, term2542.getClass(), "rootNode", null);
        setField(term2542, term2542.getClass(), "parent", null);
        setField(term2542, term2542.getClass(), "locale", null);
        term2624 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2624, term2624.getClass(), "prefix", "ieCtQFdkii");
        setField(term2624, term2624.getClass(), "name", "dEnhdmILtU");
        setField(term2624, term2624.getClass(), "qualifiedName", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2624;
        try {
            callMethod(klass, "createAttribute", argTypes, term2542, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


