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
     Object term2654;

    public DOMNodePointer_getRelativePositionOfElement_110568450073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2655 = new HashMap();
        HashMap term2692 = new HashMap();
        HashMap term2697 = new HashMap();
        HashMap term2703 = new HashMap();
        HashMap term2708 = new HashMap();
        HashMap term2714 = new HashMap();
        HashMap term2719 = new HashMap();
        term2654 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2686 = newInstance(Class.forName("java.lang.Object"));
        Object term2687 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2688 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2689 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2690 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2654, term2654.getClass(), "node", null);
        setField(term2654, term2654.getClass(), "namespaces", term2655);
        setField(term2654, term2654.getClass(), "defaultNamespace", "uWHnvSvaPl");
        setField(term2654, term2654.getClass(), "id", "kBdSllIBVz");
        setIntField(term2654, term2654.getClass(), "index", 865208305);
        setBooleanField(term2654, term2654.getClass(), "attribute", false);
        setField(term2654, term2654.getClass(), "rootNode", term2686);
        setField(term2690, term2690.getClass(), "parent", null);
        setField(term2690, term2690.getClass(), "namespaceMap", null);
        setField(term2690, term2690.getClass(), "reverseMap", null);
        setField(term2690, term2690.getClass(), "pointer", null);
        setField(term2690, term2690.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2690, term2690.getClass(), "sealed", false);
        setField(term2689, term2689.getClass(), "parent", term2690);
        setField(term2689, term2689.getClass(), "namespaceMap", term2692);
        setField(term2689, term2689.getClass(), "reverseMap", term2697);
        setField(term2689, term2689.getClass(), "pointer", null);
        setField(term2689, term2689.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2689, term2689.getClass(), "sealed", false);
        setField(term2688, term2688.getClass(), "parent", term2689);
        setField(term2688, term2688.getClass(), "namespaceMap", term2703);
        setField(term2688, term2688.getClass(), "reverseMap", term2708);
        setField(term2688, term2688.getClass(), "pointer", null);
        setField(term2688, term2688.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2688, term2688.getClass(), "sealed", false);
        setField(term2687, term2687.getClass(), "parent", term2688);
        setField(term2687, term2687.getClass(), "namespaceMap", term2714);
        setField(term2687, term2687.getClass(), "reverseMap", term2719);
        setField(term2687, term2687.getClass(), "pointer", null);
        setField(term2687, term2687.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2687, term2687.getClass(), "sealed", false);
        setField(term2654, term2654.getClass(), "namespaceResolver", term2687);
        setField(term2654, term2654.getClass(), "parent", null);
        setField(term2654, term2654.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term2654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
