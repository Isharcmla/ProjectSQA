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
     Object term2220;
     Object term2291;

    public DOMNodePointer_createAttribute_14964584070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2221 = new HashMap();
        HashMap term2258 = new HashMap();
        HashMap term2263 = new HashMap();
        HashMap term2269 = new HashMap();
        HashMap term2274 = new HashMap();
        HashMap term2280 = new HashMap();
        HashMap term2285 = new HashMap();
        term2220 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2252 = newInstance(Class.forName("java.lang.Object"));
        Object term2253 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2254 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2255 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2256 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2220, term2220.getClass(), "node", null);
        setField(term2220, term2220.getClass(), "namespaces", term2221);
        setField(term2220, term2220.getClass(), "defaultNamespace", "ffYhPOzlUs");
        setField(term2220, term2220.getClass(), "id", "MLqYREekMl");
        setIntField(term2220, term2220.getClass(), "index", -2068769794);
        setBooleanField(term2220, term2220.getClass(), "attribute", true);
        setField(term2220, term2220.getClass(), "rootNode", term2252);
        setField(term2256, term2256.getClass(), "parent", null);
        setField(term2256, term2256.getClass(), "namespaceMap", null);
        setField(term2256, term2256.getClass(), "reverseMap", null);
        setField(term2256, term2256.getClass(), "pointer", null);
        setBooleanField(term2256, term2256.getClass(), "sealed", false);
        setField(term2255, term2255.getClass(), "parent", term2256);
        setField(term2255, term2255.getClass(), "namespaceMap", term2258);
        setField(term2255, term2255.getClass(), "reverseMap", term2263);
        setField(term2255, term2255.getClass(), "pointer", null);
        setBooleanField(term2255, term2255.getClass(), "sealed", false);
        setField(term2254, term2254.getClass(), "parent", term2255);
        setField(term2254, term2254.getClass(), "namespaceMap", term2269);
        setField(term2254, term2254.getClass(), "reverseMap", term2274);
        setField(term2254, term2254.getClass(), "pointer", null);
        setBooleanField(term2254, term2254.getClass(), "sealed", false);
        setField(term2253, term2253.getClass(), "parent", term2254);
        setField(term2253, term2253.getClass(), "namespaceMap", term2280);
        setField(term2253, term2253.getClass(), "reverseMap", term2285);
        setField(term2253, term2253.getClass(), "pointer", null);
        setBooleanField(term2253, term2253.getClass(), "sealed", false);
        setField(term2220, term2220.getClass(), "namespaceResolver", term2253);
        setField(term2220, term2220.getClass(), "parent", null);
        setField(term2220, term2220.getClass(), "locale", null);
        term2291 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2291, term2291.getClass(), "prefix", "ytSBIKXogI");
        setField(term2291, term2291.getClass(), "name", "nHXjMycHlU");
        setField(term2291, term2291.getClass(), "qualifiedName", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2291;
        try {
            callMethod(klass, "createAttribute", argTypes, term2220, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


