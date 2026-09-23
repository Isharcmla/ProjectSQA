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

public class DOMNodePointer_isLanguage_153304781565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1848;

    public DOMNodePointer_isLanguage_153304781565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1849 = new HashMap();
        HashMap term1883 = new HashMap();
        HashMap term1888 = new HashMap();
        HashMap term1894 = new HashMap();
        HashMap term1899 = new HashMap();
        HashMap term1905 = new HashMap();
        HashMap term1910 = new HashMap();
        HashMap term1919 = new HashMap();
        HashMap term1924 = new HashMap();
        term1848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1878 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1879 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1880 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1881 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1918 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1848, term1848.getClass(), "node", null);
        setField(term1848, term1848.getClass(), "namespaces", term1849);
        setField(term1848, term1848.getClass(), "defaultNamespace", "wSQxaModmm");
        setField(term1848, term1848.getClass(), "id", "UlajhuVLaP");
        setField(term1881, term1881.getClass(), "parent", null);
        setField(term1881, term1881.getClass(), "namespaceMap", null);
        setField(term1881, term1881.getClass(), "reverseMap", null);
        setField(term1881, term1881.getClass(), "pointer", null);
        setBooleanField(term1881, term1881.getClass(), "sealed", false);
        setField(term1880, term1880.getClass(), "parent", term1881);
        setField(term1880, term1880.getClass(), "namespaceMap", term1883);
        setField(term1880, term1880.getClass(), "reverseMap", term1888);
        setField(term1880, term1880.getClass(), "pointer", null);
        setBooleanField(term1880, term1880.getClass(), "sealed", false);
        setField(term1879, term1879.getClass(), "parent", term1880);
        setField(term1879, term1879.getClass(), "namespaceMap", term1894);
        setField(term1879, term1879.getClass(), "reverseMap", term1899);
        setField(term1879, term1879.getClass(), "pointer", null);
        setBooleanField(term1879, term1879.getClass(), "sealed", false);
        setField(term1878, term1878.getClass(), "parent", term1879);
        setField(term1878, term1878.getClass(), "namespaceMap", term1905);
        setField(term1878, term1878.getClass(), "reverseMap", term1910);
        setField(term1878, term1878.getClass(), "pointer", null);
        setBooleanField(term1878, term1878.getClass(), "sealed", false);
        setField(term1848, term1848.getClass(), "localNamespaceResolver", term1878);
        setIntField(term1848, term1848.getClass(), "index", -1685132342);
        setBooleanField(term1848, term1848.getClass(), "attribute", true);
        setField(term1918, term1918.getClass(), "parent", null);
        setField(term1918, term1918.getClass(), "namespaceMap", term1919);
        setField(term1918, term1918.getClass(), "reverseMap", term1924);
        setField(term1918, term1918.getClass(), "pointer", null);
        setBooleanField(term1918, term1918.getClass(), "sealed", false);
        setField(term1848, term1848.getClass(), "namespaceResolver", term1918);
        setField(term1848, term1848.getClass(), "exceptionHandler", null);
        setField(term1848, term1848.getClass(), "rootNode", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1848, term1848.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        try {
            callMethod(klass, "isLanguage", argTypes, term1848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


