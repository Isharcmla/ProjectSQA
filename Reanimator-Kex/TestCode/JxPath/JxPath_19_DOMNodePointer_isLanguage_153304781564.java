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

public class DOMNodePointer_isLanguage_153304781564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1864;

    public DOMNodePointer_isLanguage_153304781564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1865 = new HashMap();
        HashMap term1899 = new HashMap();
        HashMap term1904 = new HashMap();
        HashMap term1910 = new HashMap();
        HashMap term1915 = new HashMap();
        HashMap term1921 = new HashMap();
        HashMap term1926 = new HashMap();
        HashMap term1935 = new HashMap();
        HashMap term1940 = new HashMap();
        term1864 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1894 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1896 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1897 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1946 = newInstance(Class.forName("java.lang.Object"));
        setField(term1864, term1864.getClass(), "node", null);
        setField(term1864, term1864.getClass(), "namespaces", term1865);
        setField(term1864, term1864.getClass(), "defaultNamespace", "wSQxaModmm");
        setField(term1864, term1864.getClass(), "id", "UlajhuVLaP");
        setField(term1897, term1897.getClass(), "parent", null);
        setField(term1897, term1897.getClass(), "namespaceMap", null);
        setField(term1897, term1897.getClass(), "reverseMap", null);
        setField(term1897, term1897.getClass(), "pointer", null);
        setBooleanField(term1897, term1897.getClass(), "sealed", false);
        setField(term1896, term1896.getClass(), "parent", term1897);
        setField(term1896, term1896.getClass(), "namespaceMap", term1899);
        setField(term1896, term1896.getClass(), "reverseMap", term1904);
        setField(term1896, term1896.getClass(), "pointer", null);
        setBooleanField(term1896, term1896.getClass(), "sealed", false);
        setField(term1895, term1895.getClass(), "parent", term1896);
        setField(term1895, term1895.getClass(), "namespaceMap", term1910);
        setField(term1895, term1895.getClass(), "reverseMap", term1915);
        setField(term1895, term1895.getClass(), "pointer", null);
        setBooleanField(term1895, term1895.getClass(), "sealed", false);
        setField(term1894, term1894.getClass(), "parent", term1895);
        setField(term1894, term1894.getClass(), "namespaceMap", term1921);
        setField(term1894, term1894.getClass(), "reverseMap", term1926);
        setField(term1894, term1894.getClass(), "pointer", null);
        setBooleanField(term1894, term1894.getClass(), "sealed", false);
        setField(term1864, term1864.getClass(), "localNamespaceResolver", term1894);
        setIntField(term1864, term1864.getClass(), "index", -1685132342);
        setBooleanField(term1864, term1864.getClass(), "attribute", true);
        setField(term1934, term1934.getClass(), "parent", null);
        setField(term1934, term1934.getClass(), "namespaceMap", term1935);
        setField(term1934, term1934.getClass(), "reverseMap", term1940);
        setField(term1934, term1934.getClass(), "pointer", null);
        setBooleanField(term1934, term1934.getClass(), "sealed", false);
        setField(term1864, term1864.getClass(), "namespaceResolver", term1934);
        setField(term1864, term1864.getClass(), "rootNode", term1946);
        setField(term1864, term1864.getClass(), "parent", null);
        setField(term1864, term1864.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gGSMzuGICf";
        try {
            callMethod(klass, "isLanguage", argTypes, term1864, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


