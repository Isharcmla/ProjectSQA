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

public class DOMNodePointer_remove_41018104271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733;

    public DOMNodePointer_remove_41018104271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2734 = new HashMap();
        HashMap term2768 = new HashMap();
        HashMap term2773 = new HashMap();
        HashMap term2779 = new HashMap();
        HashMap term2784 = new HashMap();
        HashMap term2790 = new HashMap();
        HashMap term2795 = new HashMap();
        HashMap term2804 = new HashMap();
        HashMap term2809 = new HashMap();
        term2733 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2763 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2765 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2766 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2815 = newInstance(Class.forName("java.lang.Object"));
        setField(term2733, term2733.getClass(), "node", null);
        setField(term2733, term2733.getClass(), "namespaces", term2734);
        setField(term2733, term2733.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term2733, term2733.getClass(), "id", "fhkbdRViHi");
        setField(term2766, term2766.getClass(), "parent", null);
        setField(term2766, term2766.getClass(), "namespaceMap", null);
        setField(term2766, term2766.getClass(), "reverseMap", null);
        setField(term2766, term2766.getClass(), "pointer", null);
        setBooleanField(term2766, term2766.getClass(), "sealed", false);
        setField(term2765, term2765.getClass(), "parent", term2766);
        setField(term2765, term2765.getClass(), "namespaceMap", term2768);
        setField(term2765, term2765.getClass(), "reverseMap", term2773);
        setField(term2765, term2765.getClass(), "pointer", null);
        setBooleanField(term2765, term2765.getClass(), "sealed", false);
        setField(term2764, term2764.getClass(), "parent", term2765);
        setField(term2764, term2764.getClass(), "namespaceMap", term2779);
        setField(term2764, term2764.getClass(), "reverseMap", term2784);
        setField(term2764, term2764.getClass(), "pointer", null);
        setBooleanField(term2764, term2764.getClass(), "sealed", false);
        setField(term2763, term2763.getClass(), "parent", term2764);
        setField(term2763, term2763.getClass(), "namespaceMap", term2790);
        setField(term2763, term2763.getClass(), "reverseMap", term2795);
        setField(term2763, term2763.getClass(), "pointer", null);
        setBooleanField(term2763, term2763.getClass(), "sealed", false);
        setField(term2733, term2733.getClass(), "localNamespaceResolver", term2763);
        setIntField(term2733, term2733.getClass(), "index", -1007160944);
        setBooleanField(term2733, term2733.getClass(), "attribute", true);
        setField(term2803, term2803.getClass(), "parent", null);
        setField(term2803, term2803.getClass(), "namespaceMap", term2804);
        setField(term2803, term2803.getClass(), "reverseMap", term2809);
        setField(term2803, term2803.getClass(), "pointer", null);
        setBooleanField(term2803, term2803.getClass(), "sealed", false);
        setField(term2733, term2733.getClass(), "namespaceResolver", term2803);
        setField(term2733, term2733.getClass(), "rootNode", term2815);
        setField(term2733, term2733.getClass(), "parent", null);
        setField(term2733, term2733.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


