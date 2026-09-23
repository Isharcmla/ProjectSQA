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

public class DOMNodePointer_asPath_175231522273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2813;
     Object term11044;

    public DOMNodePointer_asPath_175231522273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2814 = new HashMap();
        HashMap term2848 = new HashMap();
        HashMap term2853 = new HashMap();
        HashMap term2859 = new HashMap();
        HashMap term2864 = new HashMap();
        HashMap term2870 = new HashMap();
        HashMap term2875 = new HashMap();
        HashMap term2884 = new HashMap();
        HashMap term2889 = new HashMap();
        term2813 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2844 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2845 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2846 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2883 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2813, term2813.getClass(), "node", null);
        setField(term2813, term2813.getClass(), "namespaces", term2814);
        setField(term2813, term2813.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term2813, term2813.getClass(), "id", "kBdSllIBVz");
        setField(term2846, term2846.getClass(), "parent", null);
        setField(term2846, term2846.getClass(), "namespaceMap", null);
        setField(term2846, term2846.getClass(), "reverseMap", null);
        setField(term2846, term2846.getClass(), "pointer", null);
        setBooleanField(term2846, term2846.getClass(), "sealed", false);
        setField(term2845, term2845.getClass(), "parent", term2846);
        setField(term2845, term2845.getClass(), "namespaceMap", term2848);
        setField(term2845, term2845.getClass(), "reverseMap", term2853);
        setField(term2845, term2845.getClass(), "pointer", null);
        setBooleanField(term2845, term2845.getClass(), "sealed", false);
        setField(term2844, term2844.getClass(), "parent", term2845);
        setField(term2844, term2844.getClass(), "namespaceMap", term2859);
        setField(term2844, term2844.getClass(), "reverseMap", term2864);
        setField(term2844, term2844.getClass(), "pointer", null);
        setBooleanField(term2844, term2844.getClass(), "sealed", false);
        setField(term2843, term2843.getClass(), "parent", term2844);
        setField(term2843, term2843.getClass(), "namespaceMap", term2870);
        setField(term2843, term2843.getClass(), "reverseMap", term2875);
        setField(term2843, term2843.getClass(), "pointer", null);
        setBooleanField(term2843, term2843.getClass(), "sealed", false);
        setField(term2813, term2813.getClass(), "localNamespaceResolver", term2843);
        setIntField(term2813, term2813.getClass(), "index", 1135664017);
        setBooleanField(term2813, term2813.getClass(), "attribute", true);
        setField(term2883, term2883.getClass(), "parent", null);
        setField(term2883, term2883.getClass(), "namespaceMap", term2884);
        setField(term2883, term2883.getClass(), "reverseMap", term2889);
        setField(term2883, term2883.getClass(), "pointer", null);
        setBooleanField(term2883, term2883.getClass(), "sealed", false);
        setField(term2813, term2813.getClass(), "namespaceResolver", term2883);
        setField(term2813, term2813.getClass(), "exceptionHandler", null);
        setField(term2813, term2813.getClass(), "rootNode", null);
        setField(term2813, term2813.getClass(), "parent", null);
        setField(term2813, term2813.getClass(), "locale", null);
        HashMap term11045 = new HashMap();
        HashMap term11054 = new HashMap();
        HashMap term11055 = new HashMap();
        HashMap term11056 = new HashMap();
        HashMap term11057 = new HashMap();
        HashMap term11058 = new HashMap();
        HashMap term11059 = new HashMap();
        HashMap term11061 = new HashMap();
        HashMap term11062 = new HashMap();
        term11044 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11050 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11051 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11052 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11053 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11060 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11044, term11044.getClass(), "node", null);
        setField(term11044, term11044.getClass(), "namespaces", term11045);
        setField(term11044, term11044.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term11044, term11044.getClass(), "id", "kBdSllIBVz");
        setField(term11053, term11053.getClass(), "parent", null);
        setField(term11053, term11053.getClass(), "namespaceMap", null);
        setField(term11053, term11053.getClass(), "reverseMap", null);
        setField(term11053, term11053.getClass(), "pointer", null);
        setBooleanField(term11053, term11053.getClass(), "sealed", false);
        setField(term11052, term11052.getClass(), "parent", term11053);
        setField(term11052, term11052.getClass(), "namespaceMap", term11054);
        setField(term11052, term11052.getClass(), "reverseMap", term11055);
        setField(term11052, term11052.getClass(), "pointer", null);
        setBooleanField(term11052, term11052.getClass(), "sealed", false);
        setField(term11051, term11051.getClass(), "parent", term11052);
        setField(term11051, term11051.getClass(), "namespaceMap", term11056);
        setField(term11051, term11051.getClass(), "reverseMap", term11057);
        setField(term11051, term11051.getClass(), "pointer", null);
        setBooleanField(term11051, term11051.getClass(), "sealed", false);
        setField(term11050, term11050.getClass(), "parent", term11051);
        setField(term11050, term11050.getClass(), "namespaceMap", term11058);
        setField(term11050, term11050.getClass(), "reverseMap", term11059);
        setField(term11050, term11050.getClass(), "pointer", null);
        setBooleanField(term11050, term11050.getClass(), "sealed", false);
        setField(term11044, term11044.getClass(), "localNamespaceResolver", term11050);
        setIntField(term11044, term11044.getClass(), "index", 1135664017);
        setBooleanField(term11044, term11044.getClass(), "attribute", true);
        setField(term11060, term11060.getClass(), "parent", null);
        setField(term11060, term11060.getClass(), "namespaceMap", term11061);
        setField(term11060, term11060.getClass(), "reverseMap", term11062);
        setField(term11060, term11060.getClass(), "pointer", null);
        setBooleanField(term11060, term11060.getClass(), "sealed", false);
        setField(term11044, term11044.getClass(), "namespaceResolver", term11060);
        setField(term11044, term11044.getClass(), "exceptionHandler", null);
        setField(term11044, term11044.getClass(), "rootNode", null);
        setField(term11044, term11044.getClass(), "parent", null);
        setField(term11044, term11044.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term2813, args);
        assertTrue(recursiveEquals(term2813, term11044));
        assertTrue(recursiveEquals(retValue, "id(\'kBdSllIBVz\')"));
    }

};


