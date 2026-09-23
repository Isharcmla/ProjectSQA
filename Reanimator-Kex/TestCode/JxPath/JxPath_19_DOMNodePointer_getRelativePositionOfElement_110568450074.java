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

public class DOMNodePointer_getRelativePositionOfElement_110568450074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3042;

    public DOMNodePointer_getRelativePositionOfElement_110568450074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3043 = new HashMap();
        HashMap term3077 = new HashMap();
        HashMap term3082 = new HashMap();
        HashMap term3088 = new HashMap();
        HashMap term3093 = new HashMap();
        HashMap term3099 = new HashMap();
        HashMap term3104 = new HashMap();
        HashMap term3113 = new HashMap();
        HashMap term3118 = new HashMap();
        term3042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3112 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3124 = newInstance(Class.forName("java.lang.Object"));
        setField(term3042, term3042.getClass(), "node", null);
        setField(term3042, term3042.getClass(), "namespaces", term3043);
        setField(term3042, term3042.getClass(), "defaultNamespace", "bLPjGVBhlX");
        setField(term3042, term3042.getClass(), "id", "whBvTVIIlC");
        setField(term3075, term3075.getClass(), "parent", null);
        setField(term3075, term3075.getClass(), "namespaceMap", null);
        setField(term3075, term3075.getClass(), "reverseMap", null);
        setField(term3075, term3075.getClass(), "pointer", null);
        setBooleanField(term3075, term3075.getClass(), "sealed", false);
        setField(term3074, term3074.getClass(), "parent", term3075);
        setField(term3074, term3074.getClass(), "namespaceMap", term3077);
        setField(term3074, term3074.getClass(), "reverseMap", term3082);
        setField(term3074, term3074.getClass(), "pointer", null);
        setBooleanField(term3074, term3074.getClass(), "sealed", false);
        setField(term3073, term3073.getClass(), "parent", term3074);
        setField(term3073, term3073.getClass(), "namespaceMap", term3088);
        setField(term3073, term3073.getClass(), "reverseMap", term3093);
        setField(term3073, term3073.getClass(), "pointer", null);
        setBooleanField(term3073, term3073.getClass(), "sealed", false);
        setField(term3072, term3072.getClass(), "parent", term3073);
        setField(term3072, term3072.getClass(), "namespaceMap", term3099);
        setField(term3072, term3072.getClass(), "reverseMap", term3104);
        setField(term3072, term3072.getClass(), "pointer", null);
        setBooleanField(term3072, term3072.getClass(), "sealed", false);
        setField(term3042, term3042.getClass(), "localNamespaceResolver", term3072);
        setIntField(term3042, term3042.getClass(), "index", 865208305);
        setBooleanField(term3042, term3042.getClass(), "attribute", false);
        setField(term3112, term3112.getClass(), "parent", null);
        setField(term3112, term3112.getClass(), "namespaceMap", term3113);
        setField(term3112, term3112.getClass(), "reverseMap", term3118);
        setField(term3112, term3112.getClass(), "pointer", null);
        setBooleanField(term3112, term3112.getClass(), "sealed", false);
        setField(term3042, term3042.getClass(), "namespaceResolver", term3112);
        setField(term3042, term3042.getClass(), "rootNode", term3124);
        setField(term3042, term3042.getClass(), "parent", null);
        setField(term3042, term3042.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term3042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


