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

public class DOMNodePointer_getRelativePositionOfElement_110568450073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2742;

    public DOMNodePointer_getRelativePositionOfElement_110568450073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2743 = new HashMap();
        HashMap term2780 = new HashMap();
        HashMap term2785 = new HashMap();
        HashMap term2791 = new HashMap();
        HashMap term2796 = new HashMap();
        HashMap term2802 = new HashMap();
        HashMap term2807 = new HashMap();
        term2742 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2774 = newInstance(Class.forName("java.lang.Object"));
        Object term2775 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2776 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2777 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2778 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2742, term2742.getClass(), "node", null);
        setField(term2742, term2742.getClass(), "namespaces", term2743);
        setField(term2742, term2742.getClass(), "defaultNamespace", "bLPjGVBhlX");
        setField(term2742, term2742.getClass(), "id", "whBvTVIIlC");
        setIntField(term2742, term2742.getClass(), "index", 865208305);
        setBooleanField(term2742, term2742.getClass(), "attribute", false);
        setField(term2742, term2742.getClass(), "rootNode", term2774);
        setField(term2778, term2778.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "namespaceMap", null);
        setField(term2778, term2778.getClass(), "reverseMap", null);
        setField(term2778, term2778.getClass(), "pointer", null);
        setField(term2778, term2778.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2778, term2778.getClass(), "sealed", false);
        setField(term2777, term2777.getClass(), "parent", term2778);
        setField(term2777, term2777.getClass(), "namespaceMap", term2780);
        setField(term2777, term2777.getClass(), "reverseMap", term2785);
        setField(term2777, term2777.getClass(), "pointer", null);
        setField(term2777, term2777.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2777, term2777.getClass(), "sealed", false);
        setField(term2776, term2776.getClass(), "parent", term2777);
        setField(term2776, term2776.getClass(), "namespaceMap", term2791);
        setField(term2776, term2776.getClass(), "reverseMap", term2796);
        setField(term2776, term2776.getClass(), "pointer", null);
        setField(term2776, term2776.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2776, term2776.getClass(), "sealed", false);
        setField(term2775, term2775.getClass(), "parent", term2776);
        setField(term2775, term2775.getClass(), "namespaceMap", term2802);
        setField(term2775, term2775.getClass(), "reverseMap", term2807);
        setField(term2775, term2775.getClass(), "pointer", null);
        setField(term2775, term2775.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2775, term2775.getClass(), "sealed", false);
        setField(term2742, term2742.getClass(), "namespaceResolver", term2775);
        setField(term2742, term2742.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term2742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


