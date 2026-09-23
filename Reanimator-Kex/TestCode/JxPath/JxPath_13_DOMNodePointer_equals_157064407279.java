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

public class DOMNodePointer_equals_157064407279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3150;
     Object term3221;
     Object term12064;
     Object term12081;

    public DOMNodePointer_equals_157064407279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3151 = new HashMap();
        HashMap term3188 = new HashMap();
        HashMap term3193 = new HashMap();
        HashMap term3199 = new HashMap();
        HashMap term3204 = new HashMap();
        HashMap term3210 = new HashMap();
        HashMap term3215 = new HashMap();
        term3150 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3182 = newInstance(Class.forName("java.lang.Object"));
        Object term3183 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3185 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3186 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3150, term3150.getClass(), "node", null);
        setField(term3150, term3150.getClass(), "namespaces", term3151);
        setField(term3150, term3150.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term3150, term3150.getClass(), "id", "idgaQsnJpQ");
        setIntField(term3150, term3150.getClass(), "index", -1179120542);
        setBooleanField(term3150, term3150.getClass(), "attribute", true);
        setField(term3150, term3150.getClass(), "rootNode", term3182);
        setField(term3186, term3186.getClass(), "parent", null);
        setField(term3186, term3186.getClass(), "namespaceMap", null);
        setField(term3186, term3186.getClass(), "reverseMap", null);
        setField(term3186, term3186.getClass(), "pointer", null);
        setBooleanField(term3186, term3186.getClass(), "sealed", false);
        setField(term3185, term3185.getClass(), "parent", term3186);
        setField(term3185, term3185.getClass(), "namespaceMap", term3188);
        setField(term3185, term3185.getClass(), "reverseMap", term3193);
        setField(term3185, term3185.getClass(), "pointer", null);
        setBooleanField(term3185, term3185.getClass(), "sealed", false);
        setField(term3184, term3184.getClass(), "parent", term3185);
        setField(term3184, term3184.getClass(), "namespaceMap", term3199);
        setField(term3184, term3184.getClass(), "reverseMap", term3204);
        setField(term3184, term3184.getClass(), "pointer", null);
        setBooleanField(term3184, term3184.getClass(), "sealed", false);
        setField(term3183, term3183.getClass(), "parent", term3184);
        setField(term3183, term3183.getClass(), "namespaceMap", term3210);
        setField(term3183, term3183.getClass(), "reverseMap", term3215);
        setField(term3183, term3183.getClass(), "pointer", null);
        setBooleanField(term3183, term3183.getClass(), "sealed", false);
        setField(term3150, term3150.getClass(), "namespaceResolver", term3183);
        setField(term3150, term3150.getClass(), "parent", null);
        setField(term3150, term3150.getClass(), "locale", null);
        term3221 = newInstance(Class.forName("java.lang.Object"));
        HashMap term12065 = new HashMap();
        HashMap term12075 = new HashMap();
        HashMap term12076 = new HashMap();
        HashMap term12077 = new HashMap();
        HashMap term12078 = new HashMap();
        HashMap term12079 = new HashMap();
        HashMap term12080 = new HashMap();
        term12064 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term12070 = newInstance(Class.forName("java.lang.Object"));
        Object term12071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term12074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term12064, term12064.getClass(), "node", null);
        setField(term12064, term12064.getClass(), "namespaces", term12065);
        setField(term12064, term12064.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term12064, term12064.getClass(), "id", "idgaQsnJpQ");
        setIntField(term12064, term12064.getClass(), "index", -1179120542);
        setBooleanField(term12064, term12064.getClass(), "attribute", true);
        setField(term12064, term12064.getClass(), "rootNode", term12070);
        setField(term12074, term12074.getClass(), "parent", null);
        setField(term12074, term12074.getClass(), "namespaceMap", null);
        setField(term12074, term12074.getClass(), "reverseMap", null);
        setField(term12074, term12074.getClass(), "pointer", null);
        setBooleanField(term12074, term12074.getClass(), "sealed", false);
        setField(term12073, term12073.getClass(), "parent", term12074);
        setField(term12073, term12073.getClass(), "namespaceMap", term12075);
        setField(term12073, term12073.getClass(), "reverseMap", term12076);
        setField(term12073, term12073.getClass(), "pointer", null);
        setBooleanField(term12073, term12073.getClass(), "sealed", false);
        setField(term12072, term12072.getClass(), "parent", term12073);
        setField(term12072, term12072.getClass(), "namespaceMap", term12077);
        setField(term12072, term12072.getClass(), "reverseMap", term12078);
        setField(term12072, term12072.getClass(), "pointer", null);
        setBooleanField(term12072, term12072.getClass(), "sealed", false);
        setField(term12071, term12071.getClass(), "parent", term12072);
        setField(term12071, term12071.getClass(), "namespaceMap", term12079);
        setField(term12071, term12071.getClass(), "reverseMap", term12080);
        setField(term12071, term12071.getClass(), "pointer", null);
        setBooleanField(term12071, term12071.getClass(), "sealed", false);
        setField(term12064, term12064.getClass(), "namespaceResolver", term12071);
        setField(term12064, term12064.getClass(), "parent", null);
        setField(term12064, term12064.getClass(), "locale", null);
        term12081 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3221;
        Object retValue = callMethod(klass, "equals", argTypes, term3150, args);
        assertTrue(recursiveEquals(term3150, term12064));
        assertTrue(recursiveEquals(term3221, term12081));
        assertTrue(recursiveEquals(retValue, false));
    }

};


