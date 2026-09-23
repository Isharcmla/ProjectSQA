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

public class DOMNodePointer_remove_41018104273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2623;

    public DOMNodePointer_remove_41018104273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2624 = new HashMap();
        HashMap term2658 = new HashMap();
        HashMap term2663 = new HashMap();
        HashMap term2669 = new HashMap();
        HashMap term2674 = new HashMap();
        HashMap term2680 = new HashMap();
        HashMap term2685 = new HashMap();
        HashMap term2695 = new HashMap();
        term2623 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2655 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2693 = newInstance(Class.forName("java.lang.Object"));
        Object term2694 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2623, term2623.getClass(), "node", null);
        setField(term2623, term2623.getClass(), "namespaces", term2624);
        setField(term2623, term2623.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term2623, term2623.getClass(), "id", "fhkbdRViHi");
        setField(term2656, term2656.getClass(), "parent", null);
        setField(term2656, term2656.getClass(), "namespaceMap", null);
        setField(term2656, term2656.getClass(), "reverseMap", null);
        setField(term2656, term2656.getClass(), "pointer", null);
        setBooleanField(term2656, term2656.getClass(), "sealed", false);
        setField(term2655, term2655.getClass(), "parent", term2656);
        setField(term2655, term2655.getClass(), "namespaceMap", term2658);
        setField(term2655, term2655.getClass(), "reverseMap", term2663);
        setField(term2655, term2655.getClass(), "pointer", null);
        setBooleanField(term2655, term2655.getClass(), "sealed", false);
        setField(term2654, term2654.getClass(), "parent", term2655);
        setField(term2654, term2654.getClass(), "namespaceMap", term2669);
        setField(term2654, term2654.getClass(), "reverseMap", term2674);
        setField(term2654, term2654.getClass(), "pointer", null);
        setBooleanField(term2654, term2654.getClass(), "sealed", false);
        setField(term2653, term2653.getClass(), "parent", term2654);
        setField(term2653, term2653.getClass(), "namespaceMap", term2680);
        setField(term2653, term2653.getClass(), "reverseMap", term2685);
        setField(term2653, term2653.getClass(), "pointer", null);
        setBooleanField(term2653, term2653.getClass(), "sealed", false);
        setField(term2623, term2623.getClass(), "localNamespaceResolver", term2653);
        setIntField(term2623, term2623.getClass(), "index", -1007160944);
        setBooleanField(term2623, term2623.getClass(), "attribute", true);
        setField(term2623, term2623.getClass(), "rootNode", term2693);
        setField(term2694, term2694.getClass(), "parent", null);
        setField(term2694, term2694.getClass(), "namespaceMap", term2695);
        setField(term2694, term2694.getClass(), "reverseMap", null);
        setField(term2694, term2694.getClass(), "pointer", null);
        setBooleanField(term2694, term2694.getClass(), "sealed", false);
        setField(term2623, term2623.getClass(), "namespaceResolver", term2694);
        setField(term2623, term2623.getClass(), "parent", null);
        setField(term2623, term2623.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2623, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


