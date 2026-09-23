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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_remove_41018104269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;

    public DOMNodePointer_remove_41018104269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2357 = new HashMap();
        HashMap term2394 = new HashMap();
        HashMap term2399 = new HashMap();
        HashMap term2405 = new HashMap();
        HashMap term2410 = new HashMap();
        HashMap term2416 = new HashMap();
        HashMap term2421 = new HashMap();
        term2356 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2388 = newInstance(Class.forName("java.lang.Object"));
        Object term2389 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2390 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2391 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2356, term2356.getClass(), "node", null);
        setField(term2356, term2356.getClass(), "namespaces", term2357);
        setField(term2356, term2356.getClass(), "defaultNamespace", "ieCtQFdkii");
        setField(term2356, term2356.getClass(), "id", "dEnhdmILtU");
        setIntField(term2356, term2356.getClass(), "index", -117576464);
        setBooleanField(term2356, term2356.getClass(), "attribute", true);
        setField(term2356, term2356.getClass(), "rootNode", term2388);
        setField(term2392, term2392.getClass(), "parent", null);
        setField(term2392, term2392.getClass(), "namespaceMap", null);
        setField(term2392, term2392.getClass(), "reverseMap", null);
        setField(term2392, term2392.getClass(), "pointer", null);
        setField(term2392, term2392.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2392, term2392.getClass(), "sealed", false);
        setField(term2391, term2391.getClass(), "parent", term2392);
        setField(term2391, term2391.getClass(), "namespaceMap", term2394);
        setField(term2391, term2391.getClass(), "reverseMap", term2399);
        setField(term2391, term2391.getClass(), "pointer", null);
        setField(term2391, term2391.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2391, term2391.getClass(), "sealed", false);
        setField(term2390, term2390.getClass(), "parent", term2391);
        setField(term2390, term2390.getClass(), "namespaceMap", term2405);
        setField(term2390, term2390.getClass(), "reverseMap", term2410);
        setField(term2390, term2390.getClass(), "pointer", null);
        setField(term2390, term2390.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2390, term2390.getClass(), "sealed", false);
        setField(term2389, term2389.getClass(), "parent", term2390);
        setField(term2389, term2389.getClass(), "namespaceMap", term2416);
        setField(term2389, term2389.getClass(), "reverseMap", term2421);
        setField(term2389, term2389.getClass(), "pointer", null);
        setField(term2389, term2389.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2389, term2389.getClass(), "sealed", false);
        setField(term2356, term2356.getClass(), "namespaceResolver", term2389);
        setField(term2356, term2356.getClass(), "parent", null);
        setField(term2356, term2356.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2356, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


