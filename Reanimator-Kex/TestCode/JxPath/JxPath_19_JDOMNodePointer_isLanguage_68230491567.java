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
import java.lang.NullPointerException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_isLanguage_68230491567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2054;

    public JDOMNodePointer_isLanguage_68230491567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2073 = new HashMap();
        HashMap term2078 = new HashMap();
        HashMap term2084 = new HashMap();
        HashMap term2089 = new HashMap();
        HashMap term2095 = new HashMap();
        HashMap term2100 = new HashMap();
        HashMap term2111 = new HashMap();
        HashMap term2116 = new HashMap();
        HashMap term2122 = new HashMap();
        HashMap term2127 = new HashMap();
        HashMap term2133 = new HashMap();
        HashMap term2138 = new HashMap();
        term2054 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2055 = newInstance(Class.forName("java.lang.Object"));
        Object term2068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2069 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2109 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2110 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2144 = newInstance(Class.forName("java.lang.Object"));
        setField(term2054, term2054.getClass(), "node", term2055);
        setField(term2054, term2054.getClass(), "id", "flxyYxBRtu");
        setField(term2071, term2071.getClass(), "parent", null);
        setField(term2071, term2071.getClass(), "namespaceMap", null);
        setField(term2071, term2071.getClass(), "reverseMap", null);
        setField(term2071, term2071.getClass(), "pointer", null);
        setBooleanField(term2071, term2071.getClass(), "sealed", false);
        setField(term2070, term2070.getClass(), "parent", term2071);
        setField(term2070, term2070.getClass(), "namespaceMap", term2073);
        setField(term2070, term2070.getClass(), "reverseMap", term2078);
        setField(term2070, term2070.getClass(), "pointer", null);
        setBooleanField(term2070, term2070.getClass(), "sealed", false);
        setField(term2069, term2069.getClass(), "parent", term2070);
        setField(term2069, term2069.getClass(), "namespaceMap", term2084);
        setField(term2069, term2069.getClass(), "reverseMap", term2089);
        setField(term2069, term2069.getClass(), "pointer", null);
        setBooleanField(term2069, term2069.getClass(), "sealed", false);
        setField(term2068, term2068.getClass(), "parent", term2069);
        setField(term2068, term2068.getClass(), "namespaceMap", term2095);
        setField(term2068, term2068.getClass(), "reverseMap", term2100);
        setField(term2068, term2068.getClass(), "pointer", null);
        setBooleanField(term2068, term2068.getClass(), "sealed", false);
        setField(term2054, term2054.getClass(), "localNamespaceResolver", term2068);
        setIntField(term2054, term2054.getClass(), "index", 1622346318);
        setBooleanField(term2054, term2054.getClass(), "attribute", false);
        setField(term2110, term2110.getClass(), "parent", null);
        setField(term2110, term2110.getClass(), "namespaceMap", term2111);
        setField(term2110, term2110.getClass(), "reverseMap", term2116);
        setField(term2110, term2110.getClass(), "pointer", null);
        setBooleanField(term2110, term2110.getClass(), "sealed", false);
        setField(term2109, term2109.getClass(), "parent", term2110);
        setField(term2109, term2109.getClass(), "namespaceMap", term2122);
        setField(term2109, term2109.getClass(), "reverseMap", term2127);
        setField(term2109, term2109.getClass(), "pointer", null);
        setBooleanField(term2109, term2109.getClass(), "sealed", false);
        setField(term2108, term2108.getClass(), "parent", term2109);
        setField(term2108, term2108.getClass(), "namespaceMap", term2133);
        setField(term2108, term2108.getClass(), "reverseMap", term2138);
        setField(term2108, term2108.getClass(), "pointer", null);
        setBooleanField(term2108, term2108.getClass(), "sealed", false);
        setField(term2054, term2054.getClass(), "namespaceResolver", term2108);
        setField(term2054, term2054.getClass(), "rootNode", term2144);
        setField(term2054, term2054.getClass(), "parent", null);
        setField(term2054, term2054.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        try {
            callMethod(klass, "isLanguage", argTypes, term2054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


