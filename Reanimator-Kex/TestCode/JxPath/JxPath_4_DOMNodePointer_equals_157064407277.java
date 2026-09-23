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

public class DOMNodePointer_equals_157064407277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3128;
     Object term3199;
     Object term11699;
     Object term11716;

    public DOMNodePointer_equals_157064407277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3129 = new HashMap();
        HashMap term3166 = new HashMap();
        HashMap term3171 = new HashMap();
        HashMap term3177 = new HashMap();
        HashMap term3182 = new HashMap();
        HashMap term3188 = new HashMap();
        HashMap term3193 = new HashMap();
        term3128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3160 = newInstance(Class.forName("java.lang.Object"));
        Object term3161 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3162 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3163 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3164 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3128, term3128.getClass(), "node", null);
        setField(term3128, term3128.getClass(), "namespaces", term3129);
        setField(term3128, term3128.getClass(), "defaultNamespace", "OWKQODBLzb");
        setField(term3128, term3128.getClass(), "id", "wGmYcqUkgE");
        setIntField(term3128, term3128.getClass(), "index", -1179120542);
        setBooleanField(term3128, term3128.getClass(), "attribute", true);
        setField(term3128, term3128.getClass(), "rootNode", term3160);
        setField(term3164, term3164.getClass(), "parent", null);
        setField(term3164, term3164.getClass(), "namespaceMap", null);
        setField(term3164, term3164.getClass(), "reverseMap", null);
        setField(term3164, term3164.getClass(), "pointer", null);
        setField(term3164, term3164.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3164, term3164.getClass(), "sealed", false);
        setField(term3163, term3163.getClass(), "parent", term3164);
        setField(term3163, term3163.getClass(), "namespaceMap", term3166);
        setField(term3163, term3163.getClass(), "reverseMap", term3171);
        setField(term3163, term3163.getClass(), "pointer", null);
        setField(term3163, term3163.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3163, term3163.getClass(), "sealed", false);
        setField(term3162, term3162.getClass(), "parent", term3163);
        setField(term3162, term3162.getClass(), "namespaceMap", term3177);
        setField(term3162, term3162.getClass(), "reverseMap", term3182);
        setField(term3162, term3162.getClass(), "pointer", null);
        setField(term3162, term3162.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3162, term3162.getClass(), "sealed", false);
        setField(term3161, term3161.getClass(), "parent", term3162);
        setField(term3161, term3161.getClass(), "namespaceMap", term3188);
        setField(term3161, term3161.getClass(), "reverseMap", term3193);
        setField(term3161, term3161.getClass(), "pointer", null);
        setField(term3161, term3161.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3161, term3161.getClass(), "sealed", false);
        setField(term3128, term3128.getClass(), "namespaceResolver", term3161);
        setField(term3128, term3128.getClass(), "parent", null);
        setField(term3128, term3128.getClass(), "locale", null);
        term3199 = newInstance(Class.forName("java.lang.Object"));
        HashMap term11700 = new HashMap();
        HashMap term11710 = new HashMap();
        HashMap term11711 = new HashMap();
        HashMap term11712 = new HashMap();
        HashMap term11713 = new HashMap();
        HashMap term11714 = new HashMap();
        HashMap term11715 = new HashMap();
        term11699 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11705 = newInstance(Class.forName("java.lang.Object"));
        Object term11706 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11707 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11709 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11699, term11699.getClass(), "node", null);
        setField(term11699, term11699.getClass(), "namespaces", term11700);
        setField(term11699, term11699.getClass(), "defaultNamespace", "OWKQODBLzb");
        setField(term11699, term11699.getClass(), "id", "wGmYcqUkgE");
        setIntField(term11699, term11699.getClass(), "index", -1179120542);
        setBooleanField(term11699, term11699.getClass(), "attribute", true);
        setField(term11699, term11699.getClass(), "rootNode", term11705);
        setField(term11709, term11709.getClass(), "parent", null);
        setField(term11709, term11709.getClass(), "namespaceMap", null);
        setField(term11709, term11709.getClass(), "reverseMap", null);
        setField(term11709, term11709.getClass(), "pointer", null);
        setField(term11709, term11709.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11709, term11709.getClass(), "sealed", false);
        setField(term11708, term11708.getClass(), "parent", term11709);
        setField(term11708, term11708.getClass(), "namespaceMap", term11710);
        setField(term11708, term11708.getClass(), "reverseMap", term11711);
        setField(term11708, term11708.getClass(), "pointer", null);
        setField(term11708, term11708.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11708, term11708.getClass(), "sealed", false);
        setField(term11707, term11707.getClass(), "parent", term11708);
        setField(term11707, term11707.getClass(), "namespaceMap", term11712);
        setField(term11707, term11707.getClass(), "reverseMap", term11713);
        setField(term11707, term11707.getClass(), "pointer", null);
        setField(term11707, term11707.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11707, term11707.getClass(), "sealed", false);
        setField(term11706, term11706.getClass(), "parent", term11707);
        setField(term11706, term11706.getClass(), "namespaceMap", term11714);
        setField(term11706, term11706.getClass(), "reverseMap", term11715);
        setField(term11706, term11706.getClass(), "pointer", null);
        setField(term11706, term11706.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term11706, term11706.getClass(), "sealed", false);
        setField(term11699, term11699.getClass(), "namespaceResolver", term11706);
        setField(term11699, term11699.getClass(), "parent", null);
        setField(term11699, term11699.getClass(), "locale", null);
        term11716 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3199;
        Object retValue = callMethod(klass, "equals", argTypes, term3128, args);
        assertTrue(recursiveEquals(term3128, term11699));
        assertTrue(recursiveEquals(term3199, term11716));
        assertTrue(recursiveEquals(retValue, false));
    }

};


