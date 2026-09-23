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

public class DOMNodePointer_setValue_9683547667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1807;
     Object term1878;

    public DOMNodePointer_setValue_9683547667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1808 = new HashMap();
        HashMap term1845 = new HashMap();
        HashMap term1850 = new HashMap();
        HashMap term1856 = new HashMap();
        HashMap term1861 = new HashMap();
        HashMap term1867 = new HashMap();
        HashMap term1872 = new HashMap();
        term1807 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1839 = newInstance(Class.forName("java.lang.Object"));
        Object term1840 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1841 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1842 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1843 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1807, term1807.getClass(), "node", null);
        setField(term1807, term1807.getClass(), "namespaces", term1808);
        setField(term1807, term1807.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term1807, term1807.getClass(), "id", "GzFkzHGYFt");
        setIntField(term1807, term1807.getClass(), "index", -1456670397);
        setBooleanField(term1807, term1807.getClass(), "attribute", false);
        setField(term1807, term1807.getClass(), "rootNode", term1839);
        setField(term1843, term1843.getClass(), "parent", null);
        setField(term1843, term1843.getClass(), "namespaceMap", null);
        setField(term1843, term1843.getClass(), "reverseMap", null);
        setField(term1843, term1843.getClass(), "pointer", null);
        setBooleanField(term1843, term1843.getClass(), "sealed", false);
        setField(term1842, term1842.getClass(), "parent", term1843);
        setField(term1842, term1842.getClass(), "namespaceMap", term1845);
        setField(term1842, term1842.getClass(), "reverseMap", term1850);
        setField(term1842, term1842.getClass(), "pointer", null);
        setBooleanField(term1842, term1842.getClass(), "sealed", false);
        setField(term1841, term1841.getClass(), "parent", term1842);
        setField(term1841, term1841.getClass(), "namespaceMap", term1856);
        setField(term1841, term1841.getClass(), "reverseMap", term1861);
        setField(term1841, term1841.getClass(), "pointer", null);
        setBooleanField(term1841, term1841.getClass(), "sealed", false);
        setField(term1840, term1840.getClass(), "parent", term1841);
        setField(term1840, term1840.getClass(), "namespaceMap", term1867);
        setField(term1840, term1840.getClass(), "reverseMap", term1872);
        setField(term1840, term1840.getClass(), "pointer", null);
        setBooleanField(term1840, term1840.getClass(), "sealed", false);
        setField(term1807, term1807.getClass(), "namespaceResolver", term1840);
        setField(term1807, term1807.getClass(), "parent", null);
        setField(term1807, term1807.getClass(), "locale", null);
        term1878 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1878;
        try {
            callMethod(klass, "setValue", argTypes, term1807, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


