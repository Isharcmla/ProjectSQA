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

public class DOMNodePointer_getRelativePositionOfPI_35429022979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3233;

    public DOMNodePointer_getRelativePositionOfPI_35429022979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3234 = new HashMap();
        HashMap term3268 = new HashMap();
        HashMap term3273 = new HashMap();
        HashMap term3279 = new HashMap();
        HashMap term3284 = new HashMap();
        HashMap term3290 = new HashMap();
        HashMap term3295 = new HashMap();
        HashMap term3305 = new HashMap();
        term3233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3263 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3264 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3265 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3266 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3303 = newInstance(Class.forName("java.lang.Object"));
        Object term3304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3233, term3233.getClass(), "node", null);
        setField(term3233, term3233.getClass(), "namespaces", term3234);
        setField(term3233, term3233.getClass(), "defaultNamespace", "oVgzLbrsFr");
        setField(term3233, term3233.getClass(), "id", "vQVyKLdtaz");
        setField(term3266, term3266.getClass(), "parent", null);
        setField(term3266, term3266.getClass(), "namespaceMap", null);
        setField(term3266, term3266.getClass(), "reverseMap", null);
        setField(term3266, term3266.getClass(), "pointer", null);
        setBooleanField(term3266, term3266.getClass(), "sealed", false);
        setField(term3265, term3265.getClass(), "parent", term3266);
        setField(term3265, term3265.getClass(), "namespaceMap", term3268);
        setField(term3265, term3265.getClass(), "reverseMap", term3273);
        setField(term3265, term3265.getClass(), "pointer", null);
        setBooleanField(term3265, term3265.getClass(), "sealed", false);
        setField(term3264, term3264.getClass(), "parent", term3265);
        setField(term3264, term3264.getClass(), "namespaceMap", term3279);
        setField(term3264, term3264.getClass(), "reverseMap", term3284);
        setField(term3264, term3264.getClass(), "pointer", null);
        setBooleanField(term3264, term3264.getClass(), "sealed", false);
        setField(term3263, term3263.getClass(), "parent", term3264);
        setField(term3263, term3263.getClass(), "namespaceMap", term3290);
        setField(term3263, term3263.getClass(), "reverseMap", term3295);
        setField(term3263, term3263.getClass(), "pointer", null);
        setBooleanField(term3263, term3263.getClass(), "sealed", false);
        setField(term3233, term3233.getClass(), "localNamespaceResolver", term3263);
        setIntField(term3233, term3233.getClass(), "index", -203030934);
        setBooleanField(term3233, term3233.getClass(), "attribute", true);
        setField(term3233, term3233.getClass(), "rootNode", term3303);
        setField(term3304, term3304.getClass(), "parent", null);
        setField(term3304, term3304.getClass(), "namespaceMap", term3305);
        setField(term3304, term3304.getClass(), "reverseMap", null);
        setField(term3304, term3304.getClass(), "pointer", null);
        setBooleanField(term3304, term3304.getClass(), "sealed", false);
        setField(term3233, term3233.getClass(), "namespaceResolver", term3304);
        setField(term3233, term3233.getClass(), "parent", null);
        setField(term3233, term3233.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfPI", argTypes, term3233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


