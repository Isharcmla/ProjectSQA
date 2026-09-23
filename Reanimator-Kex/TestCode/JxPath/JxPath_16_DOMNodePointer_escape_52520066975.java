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

public class DOMNodePointer_escape_52520066975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2819;
     Object term11114;

    public DOMNodePointer_escape_52520066975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2820 = new HashMap();
        HashMap term2854 = new HashMap();
        HashMap term2859 = new HashMap();
        HashMap term2865 = new HashMap();
        HashMap term2870 = new HashMap();
        HashMap term2876 = new HashMap();
        HashMap term2881 = new HashMap();
        HashMap term2891 = new HashMap();
        term2819 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2849 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2850 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2851 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2852 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2889 = newInstance(Class.forName("java.lang.Object"));
        Object term2890 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2819, term2819.getClass(), "node", null);
        setField(term2819, term2819.getClass(), "namespaces", term2820);
        setField(term2819, term2819.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term2819, term2819.getClass(), "id", "tPlsykYBqO");
        setField(term2852, term2852.getClass(), "parent", null);
        setField(term2852, term2852.getClass(), "namespaceMap", null);
        setField(term2852, term2852.getClass(), "reverseMap", null);
        setField(term2852, term2852.getClass(), "pointer", null);
        setBooleanField(term2852, term2852.getClass(), "sealed", false);
        setField(term2851, term2851.getClass(), "parent", term2852);
        setField(term2851, term2851.getClass(), "namespaceMap", term2854);
        setField(term2851, term2851.getClass(), "reverseMap", term2859);
        setField(term2851, term2851.getClass(), "pointer", null);
        setBooleanField(term2851, term2851.getClass(), "sealed", false);
        setField(term2850, term2850.getClass(), "parent", term2851);
        setField(term2850, term2850.getClass(), "namespaceMap", term2865);
        setField(term2850, term2850.getClass(), "reverseMap", term2870);
        setField(term2850, term2850.getClass(), "pointer", null);
        setBooleanField(term2850, term2850.getClass(), "sealed", false);
        setField(term2849, term2849.getClass(), "parent", term2850);
        setField(term2849, term2849.getClass(), "namespaceMap", term2876);
        setField(term2849, term2849.getClass(), "reverseMap", term2881);
        setField(term2849, term2849.getClass(), "pointer", null);
        setBooleanField(term2849, term2849.getClass(), "sealed", false);
        setField(term2819, term2819.getClass(), "localNamespaceResolver", term2849);
        setIntField(term2819, term2819.getClass(), "index", 590364439);
        setBooleanField(term2819, term2819.getClass(), "attribute", false);
        setField(term2819, term2819.getClass(), "rootNode", term2889);
        setField(term2890, term2890.getClass(), "parent", null);
        setField(term2890, term2890.getClass(), "namespaceMap", term2891);
        setField(term2890, term2890.getClass(), "reverseMap", null);
        setField(term2890, term2890.getClass(), "pointer", null);
        setBooleanField(term2890, term2890.getClass(), "sealed", false);
        setField(term2819, term2819.getClass(), "namespaceResolver", term2890);
        setField(term2819, term2819.getClass(), "parent", null);
        setField(term2819, term2819.getClass(), "locale", null);
        HashMap term11115 = new HashMap();
        HashMap term11124 = new HashMap();
        HashMap term11125 = new HashMap();
        HashMap term11126 = new HashMap();
        HashMap term11127 = new HashMap();
        HashMap term11128 = new HashMap();
        HashMap term11129 = new HashMap();
        HashMap term11132 = new HashMap();
        term11114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11120 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11121 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11122 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11130 = newInstance(Class.forName("java.lang.Object"));
        Object term11131 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11114, term11114.getClass(), "node", null);
        setField(term11114, term11114.getClass(), "namespaces", term11115);
        setField(term11114, term11114.getClass(), "defaultNamespace", "TJmVBGfTML");
        setField(term11114, term11114.getClass(), "id", "tPlsykYBqO");
        setField(term11123, term11123.getClass(), "parent", null);
        setField(term11123, term11123.getClass(), "namespaceMap", null);
        setField(term11123, term11123.getClass(), "reverseMap", null);
        setField(term11123, term11123.getClass(), "pointer", null);
        setBooleanField(term11123, term11123.getClass(), "sealed", false);
        setField(term11122, term11122.getClass(), "parent", term11123);
        setField(term11122, term11122.getClass(), "namespaceMap", term11124);
        setField(term11122, term11122.getClass(), "reverseMap", term11125);
        setField(term11122, term11122.getClass(), "pointer", null);
        setBooleanField(term11122, term11122.getClass(), "sealed", false);
        setField(term11121, term11121.getClass(), "parent", term11122);
        setField(term11121, term11121.getClass(), "namespaceMap", term11126);
        setField(term11121, term11121.getClass(), "reverseMap", term11127);
        setField(term11121, term11121.getClass(), "pointer", null);
        setBooleanField(term11121, term11121.getClass(), "sealed", false);
        setField(term11120, term11120.getClass(), "parent", term11121);
        setField(term11120, term11120.getClass(), "namespaceMap", term11128);
        setField(term11120, term11120.getClass(), "reverseMap", term11129);
        setField(term11120, term11120.getClass(), "pointer", null);
        setBooleanField(term11120, term11120.getClass(), "sealed", false);
        setField(term11114, term11114.getClass(), "localNamespaceResolver", term11120);
        setIntField(term11114, term11114.getClass(), "index", 590364439);
        setBooleanField(term11114, term11114.getClass(), "attribute", false);
        setField(term11114, term11114.getClass(), "rootNode", term11130);
        setField(term11131, term11131.getClass(), "parent", null);
        setField(term11131, term11131.getClass(), "namespaceMap", term11132);
        setField(term11131, term11131.getClass(), "reverseMap", null);
        setField(term11131, term11131.getClass(), "pointer", null);
        setBooleanField(term11131, term11131.getClass(), "sealed", false);
        setField(term11114, term11114.getClass(), "namespaceResolver", term11131);
        setField(term11114, term11114.getClass(), "parent", null);
        setField(term11114, term11114.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bLPjGVBhlX";
        Object retValue = callMethod(klass, "escape", argTypes, term2819, args);
        assertTrue(recursiveEquals(term2819, term11114));
        assertTrue(recursiveEquals(retValue, "bLPjGVBhlX"));
    }

};


