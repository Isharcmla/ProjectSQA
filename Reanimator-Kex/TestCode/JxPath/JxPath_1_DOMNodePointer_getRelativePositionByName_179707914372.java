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

public class DOMNodePointer_getRelativePositionByName_179707914372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2563;

    public DOMNodePointer_getRelativePositionByName_179707914372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2564 = new HashMap();
        HashMap term2601 = new HashMap();
        HashMap term2606 = new HashMap();
        HashMap term2612 = new HashMap();
        HashMap term2617 = new HashMap();
        HashMap term2623 = new HashMap();
        HashMap term2628 = new HashMap();
        term2563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2595 = newInstance(Class.forName("java.lang.Object"));
        Object term2596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2598 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2599 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2563, term2563.getClass(), "node", null);
        setField(term2563, term2563.getClass(), "namespaces", term2564);
        setField(term2563, term2563.getClass(), "defaultNamespace", "eqJfYWRaEL");
        setField(term2563, term2563.getClass(), "id", "fhkbdRViHi");
        setIntField(term2563, term2563.getClass(), "index", 590364439);
        setBooleanField(term2563, term2563.getClass(), "attribute", false);
        setField(term2563, term2563.getClass(), "rootNode", term2595);
        setField(term2599, term2599.getClass(), "parent", null);
        setField(term2599, term2599.getClass(), "namespaceMap", null);
        setField(term2599, term2599.getClass(), "reverseMap", null);
        setField(term2599, term2599.getClass(), "pointer", null);
        setField(term2599, term2599.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2599, term2599.getClass(), "sealed", false);
        setField(term2598, term2598.getClass(), "parent", term2599);
        setField(term2598, term2598.getClass(), "namespaceMap", term2601);
        setField(term2598, term2598.getClass(), "reverseMap", term2606);
        setField(term2598, term2598.getClass(), "pointer", null);
        setField(term2598, term2598.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2598, term2598.getClass(), "sealed", false);
        setField(term2597, term2597.getClass(), "parent", term2598);
        setField(term2597, term2597.getClass(), "namespaceMap", term2612);
        setField(term2597, term2597.getClass(), "reverseMap", term2617);
        setField(term2597, term2597.getClass(), "pointer", null);
        setField(term2597, term2597.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2597, term2597.getClass(), "sealed", false);
        setField(term2596, term2596.getClass(), "parent", term2597);
        setField(term2596, term2596.getClass(), "namespaceMap", term2623);
        setField(term2596, term2596.getClass(), "reverseMap", term2628);
        setField(term2596, term2596.getClass(), "pointer", null);
        setField(term2596, term2596.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2596, term2596.getClass(), "sealed", false);
        setField(term2563, term2563.getClass(), "namespaceResolver", term2596);
        setField(term2563, term2563.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionByName", argTypes, term2563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
