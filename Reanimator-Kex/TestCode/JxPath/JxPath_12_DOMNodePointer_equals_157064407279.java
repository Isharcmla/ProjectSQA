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
     Object term11816;
     Object term11833;

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
        HashMap term11817 = new HashMap();
        HashMap term11827 = new HashMap();
        HashMap term11828 = new HashMap();
        HashMap term11829 = new HashMap();
        HashMap term11830 = new HashMap();
        HashMap term11831 = new HashMap();
        HashMap term11832 = new HashMap();
        term11816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term11822 = newInstance(Class.forName("java.lang.Object"));
        Object term11823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11824 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11825 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term11826 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term11816, term11816.getClass(), "node", null);
        setField(term11816, term11816.getClass(), "namespaces", term11817);
        setField(term11816, term11816.getClass(), "defaultNamespace", "wGmYcqUkgE");
        setField(term11816, term11816.getClass(), "id", "idgaQsnJpQ");
        setIntField(term11816, term11816.getClass(), "index", -1179120542);
        setBooleanField(term11816, term11816.getClass(), "attribute", true);
        setField(term11816, term11816.getClass(), "rootNode", term11822);
        setField(term11826, term11826.getClass(), "parent", null);
        setField(term11826, term11826.getClass(), "namespaceMap", null);
        setField(term11826, term11826.getClass(), "reverseMap", null);
        setField(term11826, term11826.getClass(), "pointer", null);
        setBooleanField(term11826, term11826.getClass(), "sealed", false);
        setField(term11825, term11825.getClass(), "parent", term11826);
        setField(term11825, term11825.getClass(), "namespaceMap", term11827);
        setField(term11825, term11825.getClass(), "reverseMap", term11828);
        setField(term11825, term11825.getClass(), "pointer", null);
        setBooleanField(term11825, term11825.getClass(), "sealed", false);
        setField(term11824, term11824.getClass(), "parent", term11825);
        setField(term11824, term11824.getClass(), "namespaceMap", term11829);
        setField(term11824, term11824.getClass(), "reverseMap", term11830);
        setField(term11824, term11824.getClass(), "pointer", null);
        setBooleanField(term11824, term11824.getClass(), "sealed", false);
        setField(term11823, term11823.getClass(), "parent", term11824);
        setField(term11823, term11823.getClass(), "namespaceMap", term11831);
        setField(term11823, term11823.getClass(), "reverseMap", term11832);
        setField(term11823, term11823.getClass(), "pointer", null);
        setBooleanField(term11823, term11823.getClass(), "sealed", false);
        setField(term11816, term11816.getClass(), "namespaceResolver", term11823);
        setField(term11816, term11816.getClass(), "parent", null);
        setField(term11816, term11816.getClass(), "locale", null);
        term11833 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3221;
        Object retValue = callMethod(klass, "equals", argTypes, term3150, args);
        assertTrue(recursiveEquals(term3150, term11816));
        assertTrue(recursiveEquals(term3221, term11833));
        assertTrue(recursiveEquals(retValue, false));
    }

};


