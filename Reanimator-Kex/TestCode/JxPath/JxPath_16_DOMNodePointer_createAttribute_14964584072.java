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

public class DOMNodePointer_createAttribute_14964584072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2458;
     Object term2536;

    public DOMNodePointer_createAttribute_14964584072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2459 = new HashMap();
        HashMap term2493 = new HashMap();
        HashMap term2498 = new HashMap();
        HashMap term2504 = new HashMap();
        HashMap term2509 = new HashMap();
        HashMap term2515 = new HashMap();
        HashMap term2520 = new HashMap();
        HashMap term2530 = new HashMap();
        term2458 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2488 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2489 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2490 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2491 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2528 = newInstance(Class.forName("java.lang.Object"));
        Object term2529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2458, term2458.getClass(), "node", null);
        setField(term2458, term2458.getClass(), "namespaces", term2459);
        setField(term2458, term2458.getClass(), "defaultNamespace", "ytSBIKXogI");
        setField(term2458, term2458.getClass(), "id", "nHXjMycHlU");
        setField(term2491, term2491.getClass(), "parent", null);
        setField(term2491, term2491.getClass(), "namespaceMap", null);
        setField(term2491, term2491.getClass(), "reverseMap", null);
        setField(term2491, term2491.getClass(), "pointer", null);
        setBooleanField(term2491, term2491.getClass(), "sealed", false);
        setField(term2490, term2490.getClass(), "parent", term2491);
        setField(term2490, term2490.getClass(), "namespaceMap", term2493);
        setField(term2490, term2490.getClass(), "reverseMap", term2498);
        setField(term2490, term2490.getClass(), "pointer", null);
        setBooleanField(term2490, term2490.getClass(), "sealed", false);
        setField(term2489, term2489.getClass(), "parent", term2490);
        setField(term2489, term2489.getClass(), "namespaceMap", term2504);
        setField(term2489, term2489.getClass(), "reverseMap", term2509);
        setField(term2489, term2489.getClass(), "pointer", null);
        setBooleanField(term2489, term2489.getClass(), "sealed", false);
        setField(term2488, term2488.getClass(), "parent", term2489);
        setField(term2488, term2488.getClass(), "namespaceMap", term2515);
        setField(term2488, term2488.getClass(), "reverseMap", term2520);
        setField(term2488, term2488.getClass(), "pointer", null);
        setBooleanField(term2488, term2488.getClass(), "sealed", false);
        setField(term2458, term2458.getClass(), "localNamespaceResolver", term2488);
        setIntField(term2458, term2458.getClass(), "index", -117576464);
        setBooleanField(term2458, term2458.getClass(), "attribute", true);
        setField(term2458, term2458.getClass(), "rootNode", term2528);
        setField(term2529, term2529.getClass(), "parent", null);
        setField(term2529, term2529.getClass(), "namespaceMap", term2530);
        setField(term2529, term2529.getClass(), "reverseMap", null);
        setField(term2529, term2529.getClass(), "pointer", null);
        setBooleanField(term2529, term2529.getClass(), "sealed", false);
        setField(term2458, term2458.getClass(), "namespaceResolver", term2529);
        setField(term2458, term2458.getClass(), "parent", null);
        setField(term2458, term2458.getClass(), "locale", null);
        term2536 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2536, term2536.getClass(), "prefix", "ieCtQFdkii");
        setField(term2536, term2536.getClass(), "name", "dEnhdmILtU");
        setField(term2536, term2536.getClass(), "qualifiedName", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2536;
        try {
            callMethod(klass, "createAttribute", argTypes, term2458, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


