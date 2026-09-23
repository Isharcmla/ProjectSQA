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

public class DOMNodePointer_stringValue_212917030382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3311;

    public DOMNodePointer_stringValue_212917030382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3312 = new HashMap();
        HashMap term3349 = new HashMap();
        HashMap term3354 = new HashMap();
        HashMap term3360 = new HashMap();
        HashMap term3365 = new HashMap();
        HashMap term3371 = new HashMap();
        HashMap term3376 = new HashMap();
        term3311 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3343 = newInstance(Class.forName("java.lang.Object"));
        Object term3344 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3345 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3346 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3347 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3311, term3311.getClass(), "node", null);
        setField(term3311, term3311.getClass(), "namespaces", term3312);
        setField(term3311, term3311.getClass(), "defaultNamespace", "jUbSRrkrYZ");
        setField(term3311, term3311.getClass(), "id", "bWWfajKbEX");
        setIntField(term3311, term3311.getClass(), "index", -226514366);
        setBooleanField(term3311, term3311.getClass(), "attribute", true);
        setField(term3311, term3311.getClass(), "rootNode", term3343);
        setField(term3347, term3347.getClass(), "parent", null);
        setField(term3347, term3347.getClass(), "namespaceMap", null);
        setField(term3347, term3347.getClass(), "reverseMap", null);
        setField(term3347, term3347.getClass(), "pointer", null);
        setField(term3347, term3347.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3347, term3347.getClass(), "sealed", false);
        setField(term3346, term3346.getClass(), "parent", term3347);
        setField(term3346, term3346.getClass(), "namespaceMap", term3349);
        setField(term3346, term3346.getClass(), "reverseMap", term3354);
        setField(term3346, term3346.getClass(), "pointer", null);
        setField(term3346, term3346.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3346, term3346.getClass(), "sealed", false);
        setField(term3345, term3345.getClass(), "parent", term3346);
        setField(term3345, term3345.getClass(), "namespaceMap", term3360);
        setField(term3345, term3345.getClass(), "reverseMap", term3365);
        setField(term3345, term3345.getClass(), "pointer", null);
        setField(term3345, term3345.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3345, term3345.getClass(), "sealed", false);
        setField(term3344, term3344.getClass(), "parent", term3345);
        setField(term3344, term3344.getClass(), "namespaceMap", term3371);
        setField(term3344, term3344.getClass(), "reverseMap", term3376);
        setField(term3344, term3344.getClass(), "pointer", null);
        setField(term3344, term3344.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term3344, term3344.getClass(), "sealed", false);
        setField(term3311, term3311.getClass(), "namespaceResolver", term3344);
        setField(term3311, term3311.getClass(), "parent", null);
        setField(term3311, term3311.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "stringValue", argTypes, term3311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


