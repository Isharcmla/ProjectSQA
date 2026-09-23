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

public class DOMNodePointer_getRelativePositionOfElement_110568450075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2764;

    public DOMNodePointer_getRelativePositionOfElement_110568450075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2765 = new HashMap();
        HashMap term2802 = new HashMap();
        HashMap term2807 = new HashMap();
        HashMap term2813 = new HashMap();
        HashMap term2818 = new HashMap();
        HashMap term2824 = new HashMap();
        HashMap term2829 = new HashMap();
        term2764 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2796 = newInstance(Class.forName("java.lang.Object"));
        Object term2797 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2799 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2800 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2764, term2764.getClass(), "node", null);
        setField(term2764, term2764.getClass(), "namespaces", term2765);
        setField(term2764, term2764.getClass(), "defaultNamespace", "whBvTVIIlC");
        setField(term2764, term2764.getClass(), "id", "IgRJUzaCwW");
        setIntField(term2764, term2764.getClass(), "index", 865208305);
        setBooleanField(term2764, term2764.getClass(), "attribute", false);
        setField(term2764, term2764.getClass(), "rootNode", term2796);
        setField(term2800, term2800.getClass(), "parent", null);
        setField(term2800, term2800.getClass(), "namespaceMap", null);
        setField(term2800, term2800.getClass(), "reverseMap", null);
        setField(term2800, term2800.getClass(), "pointer", null);
        setBooleanField(term2800, term2800.getClass(), "sealed", false);
        setField(term2799, term2799.getClass(), "parent", term2800);
        setField(term2799, term2799.getClass(), "namespaceMap", term2802);
        setField(term2799, term2799.getClass(), "reverseMap", term2807);
        setField(term2799, term2799.getClass(), "pointer", null);
        setBooleanField(term2799, term2799.getClass(), "sealed", false);
        setField(term2798, term2798.getClass(), "parent", term2799);
        setField(term2798, term2798.getClass(), "namespaceMap", term2813);
        setField(term2798, term2798.getClass(), "reverseMap", term2818);
        setField(term2798, term2798.getClass(), "pointer", null);
        setBooleanField(term2798, term2798.getClass(), "sealed", false);
        setField(term2797, term2797.getClass(), "parent", term2798);
        setField(term2797, term2797.getClass(), "namespaceMap", term2824);
        setField(term2797, term2797.getClass(), "reverseMap", term2829);
        setField(term2797, term2797.getClass(), "pointer", null);
        setBooleanField(term2797, term2797.getClass(), "sealed", false);
        setField(term2764, term2764.getClass(), "namespaceResolver", term2797);
        setField(term2764, term2764.getClass(), "parent", null);
        setField(term2764, term2764.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativePositionOfElement", argTypes, term2764, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


