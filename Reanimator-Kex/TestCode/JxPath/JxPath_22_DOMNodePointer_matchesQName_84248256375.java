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

public class DOMNodePointer_matchesQName_84248256375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3017;

    public DOMNodePointer_matchesQName_84248256375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3018 = new HashMap();
        HashMap term3052 = new HashMap();
        HashMap term3057 = new HashMap();
        HashMap term3063 = new HashMap();
        HashMap term3068 = new HashMap();
        HashMap term3074 = new HashMap();
        HashMap term3079 = new HashMap();
        HashMap term3088 = new HashMap();
        HashMap term3093 = new HashMap();
        term3017 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term3047 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3048 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3049 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3050 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term3087 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term3017, term3017.getClass(), "node", null);
        setField(term3017, term3017.getClass(), "namespaces", term3018);
        setField(term3017, term3017.getClass(), "defaultNamespace", "bLPjGVBhlX");
        setField(term3017, term3017.getClass(), "id", "whBvTVIIlC");
        setField(term3050, term3050.getClass(), "parent", null);
        setField(term3050, term3050.getClass(), "namespaceMap", null);
        setField(term3050, term3050.getClass(), "reverseMap", null);
        setField(term3050, term3050.getClass(), "pointer", null);
        setBooleanField(term3050, term3050.getClass(), "sealed", false);
        setField(term3049, term3049.getClass(), "parent", term3050);
        setField(term3049, term3049.getClass(), "namespaceMap", term3052);
        setField(term3049, term3049.getClass(), "reverseMap", term3057);
        setField(term3049, term3049.getClass(), "pointer", null);
        setBooleanField(term3049, term3049.getClass(), "sealed", false);
        setField(term3048, term3048.getClass(), "parent", term3049);
        setField(term3048, term3048.getClass(), "namespaceMap", term3063);
        setField(term3048, term3048.getClass(), "reverseMap", term3068);
        setField(term3048, term3048.getClass(), "pointer", null);
        setBooleanField(term3048, term3048.getClass(), "sealed", false);
        setField(term3047, term3047.getClass(), "parent", term3048);
        setField(term3047, term3047.getClass(), "namespaceMap", term3074);
        setField(term3047, term3047.getClass(), "reverseMap", term3079);
        setField(term3047, term3047.getClass(), "pointer", null);
        setBooleanField(term3047, term3047.getClass(), "sealed", false);
        setField(term3017, term3017.getClass(), "localNamespaceResolver", term3047);
        setIntField(term3017, term3017.getClass(), "index", 865208305);
        setBooleanField(term3017, term3017.getClass(), "attribute", false);
        setField(term3087, term3087.getClass(), "parent", null);
        setField(term3087, term3087.getClass(), "namespaceMap", term3088);
        setField(term3087, term3087.getClass(), "reverseMap", term3093);
        setField(term3087, term3087.getClass(), "pointer", null);
        setBooleanField(term3087, term3087.getClass(), "sealed", false);
        setField(term3017, term3017.getClass(), "namespaceResolver", term3087);
        setField(term3017, term3017.getClass(), "exceptionHandler", null);
        setField(term3017, term3017.getClass(), "rootNode", null);
        setField(term3017, term3017.getClass(), "parent", null);
        setField(term3017, term3017.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchesQName", argTypes, term3017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


