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

public class DOMNodePointer_asPath_175231522270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2359;
     Object term10099;

    public DOMNodePointer_asPath_175231522270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2360 = new HashMap();
        HashMap term2397 = new HashMap();
        HashMap term2402 = new HashMap();
        HashMap term2408 = new HashMap();
        HashMap term2413 = new HashMap();
        HashMap term2419 = new HashMap();
        HashMap term2424 = new HashMap();
        term2359 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2391 = newInstance(Class.forName("java.lang.Object"));
        Object term2392 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2394 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2395 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2359, term2359.getClass(), "node", null);
        setField(term2359, term2359.getClass(), "namespaces", term2360);
        setField(term2359, term2359.getClass(), "defaultNamespace", "ytSBIKXogI");
        setField(term2359, term2359.getClass(), "id", "nHXjMycHlU");
        setIntField(term2359, term2359.getClass(), "index", -1007160944);
        setBooleanField(term2359, term2359.getClass(), "attribute", true);
        setField(term2359, term2359.getClass(), "rootNode", term2391);
        setField(term2395, term2395.getClass(), "parent", null);
        setField(term2395, term2395.getClass(), "namespaceMap", null);
        setField(term2395, term2395.getClass(), "reverseMap", null);
        setField(term2395, term2395.getClass(), "pointer", null);
        setField(term2395, term2395.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2395, term2395.getClass(), "sealed", false);
        setField(term2394, term2394.getClass(), "parent", term2395);
        setField(term2394, term2394.getClass(), "namespaceMap", term2397);
        setField(term2394, term2394.getClass(), "reverseMap", term2402);
        setField(term2394, term2394.getClass(), "pointer", null);
        setField(term2394, term2394.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2394, term2394.getClass(), "sealed", false);
        setField(term2393, term2393.getClass(), "parent", term2394);
        setField(term2393, term2393.getClass(), "namespaceMap", term2408);
        setField(term2393, term2393.getClass(), "reverseMap", term2413);
        setField(term2393, term2393.getClass(), "pointer", null);
        setField(term2393, term2393.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2393, term2393.getClass(), "sealed", false);
        setField(term2392, term2392.getClass(), "parent", term2393);
        setField(term2392, term2392.getClass(), "namespaceMap", term2419);
        setField(term2392, term2392.getClass(), "reverseMap", term2424);
        setField(term2392, term2392.getClass(), "pointer", null);
        setField(term2392, term2392.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2392, term2392.getClass(), "sealed", false);
        setField(term2359, term2359.getClass(), "namespaceResolver", term2392);
        setField(term2359, term2359.getClass(), "parent", null);
        setField(term2359, term2359.getClass(), "locale", null);
        HashMap term10100 = new HashMap();
        HashMap term10110 = new HashMap();
        HashMap term10111 = new HashMap();
        HashMap term10112 = new HashMap();
        HashMap term10113 = new HashMap();
        HashMap term10114 = new HashMap();
        HashMap term10115 = new HashMap();
        term10099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term10105 = newInstance(Class.forName("java.lang.Object"));
        Object term10106 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term10109 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term10099, term10099.getClass(), "node", null);
        setField(term10099, term10099.getClass(), "namespaces", term10100);
        setField(term10099, term10099.getClass(), "defaultNamespace", "ytSBIKXogI");
        setField(term10099, term10099.getClass(), "id", "nHXjMycHlU");
        setIntField(term10099, term10099.getClass(), "index", -1007160944);
        setBooleanField(term10099, term10099.getClass(), "attribute", true);
        setField(term10099, term10099.getClass(), "rootNode", term10105);
        setField(term10109, term10109.getClass(), "parent", null);
        setField(term10109, term10109.getClass(), "namespaceMap", null);
        setField(term10109, term10109.getClass(), "reverseMap", null);
        setField(term10109, term10109.getClass(), "pointer", null);
        setField(term10109, term10109.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10109, term10109.getClass(), "sealed", false);
        setField(term10108, term10108.getClass(), "parent", term10109);
        setField(term10108, term10108.getClass(), "namespaceMap", term10110);
        setField(term10108, term10108.getClass(), "reverseMap", term10111);
        setField(term10108, term10108.getClass(), "pointer", null);
        setField(term10108, term10108.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10108, term10108.getClass(), "sealed", false);
        setField(term10107, term10107.getClass(), "parent", term10108);
        setField(term10107, term10107.getClass(), "namespaceMap", term10112);
        setField(term10107, term10107.getClass(), "reverseMap", term10113);
        setField(term10107, term10107.getClass(), "pointer", null);
        setField(term10107, term10107.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10107, term10107.getClass(), "sealed", false);
        setField(term10106, term10106.getClass(), "parent", term10107);
        setField(term10106, term10106.getClass(), "namespaceMap", term10114);
        setField(term10106, term10106.getClass(), "reverseMap", term10115);
        setField(term10106, term10106.getClass(), "pointer", null);
        setField(term10106, term10106.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term10106, term10106.getClass(), "sealed", false);
        setField(term10099, term10099.getClass(), "namespaceResolver", term10106);
        setField(term10099, term10099.getClass(), "parent", null);
        setField(term10099, term10099.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2359, args);
        assertTrue(recursiveEquals(term2359, term10099));
        assertTrue(recursiveEquals(retValue, "id(\'nHXjMycHlU\')"));
    }

};
