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

public class DOMNodePointer_isLanguage_153304781566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1784;

    public DOMNodePointer_isLanguage_153304781566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1785 = new HashMap();
        HashMap term1819 = new HashMap();
        HashMap term1824 = new HashMap();
        HashMap term1830 = new HashMap();
        HashMap term1835 = new HashMap();
        HashMap term1841 = new HashMap();
        HashMap term1846 = new HashMap();
        HashMap term1856 = new HashMap();
        term1784 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1814 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1815 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1816 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1817 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1854 = newInstance(Class.forName("java.lang.Object"));
        Object term1855 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1784, term1784.getClass(), "node", null);
        setField(term1784, term1784.getClass(), "namespaces", term1785);
        setField(term1784, term1784.getClass(), "defaultNamespace", "wSQxaModmm");
        setField(term1784, term1784.getClass(), "id", "UlajhuVLaP");
        setField(term1817, term1817.getClass(), "parent", null);
        setField(term1817, term1817.getClass(), "namespaceMap", null);
        setField(term1817, term1817.getClass(), "reverseMap", null);
        setField(term1817, term1817.getClass(), "pointer", null);
        setBooleanField(term1817, term1817.getClass(), "sealed", false);
        setField(term1816, term1816.getClass(), "parent", term1817);
        setField(term1816, term1816.getClass(), "namespaceMap", term1819);
        setField(term1816, term1816.getClass(), "reverseMap", term1824);
        setField(term1816, term1816.getClass(), "pointer", null);
        setBooleanField(term1816, term1816.getClass(), "sealed", false);
        setField(term1815, term1815.getClass(), "parent", term1816);
        setField(term1815, term1815.getClass(), "namespaceMap", term1830);
        setField(term1815, term1815.getClass(), "reverseMap", term1835);
        setField(term1815, term1815.getClass(), "pointer", null);
        setBooleanField(term1815, term1815.getClass(), "sealed", false);
        setField(term1814, term1814.getClass(), "parent", term1815);
        setField(term1814, term1814.getClass(), "namespaceMap", term1841);
        setField(term1814, term1814.getClass(), "reverseMap", term1846);
        setField(term1814, term1814.getClass(), "pointer", null);
        setBooleanField(term1814, term1814.getClass(), "sealed", false);
        setField(term1784, term1784.getClass(), "localNamespaceResolver", term1814);
        setIntField(term1784, term1784.getClass(), "index", -1685132342);
        setBooleanField(term1784, term1784.getClass(), "attribute", true);
        setField(term1784, term1784.getClass(), "rootNode", term1854);
        setField(term1855, term1855.getClass(), "parent", null);
        setField(term1855, term1855.getClass(), "namespaceMap", term1856);
        setField(term1855, term1855.getClass(), "reverseMap", null);
        setField(term1855, term1855.getClass(), "pointer", null);
        setBooleanField(term1855, term1855.getClass(), "sealed", false);
        setField(term1784, term1784.getClass(), "namespaceResolver", term1855);
        setField(term1784, term1784.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        try {
            callMethod(klass, "isLanguage", argTypes, term1784, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


