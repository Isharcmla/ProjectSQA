package org.apache.commons.jxpath.ri.model.jdom;

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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_remove_166943352472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public JDOMNodePointer_remove_166943352472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1917 = new HashMap();
        HashMap term1922 = new HashMap();
        HashMap term1928 = new HashMap();
        HashMap term1933 = new HashMap();
        HashMap term1939 = new HashMap();
        HashMap term1944 = new HashMap();
        term1895 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term1896 = newInstance(Class.forName("java.lang.Object"));
        Object term1911 = newInstance(Class.forName("java.lang.Object"));
        Object term1912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1913 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1914 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1915 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1895, term1895.getClass(), "node", term1896);
        setField(term1895, term1895.getClass(), "id", "wSQxaModmm");
        setIntField(term1895, term1895.getClass(), "index", -1007160944);
        setBooleanField(term1895, term1895.getClass(), "attribute", true);
        setField(term1895, term1895.getClass(), "rootNode", term1911);
        setField(term1915, term1915.getClass(), "parent", null);
        setField(term1915, term1915.getClass(), "namespaceMap", null);
        setField(term1915, term1915.getClass(), "reverseMap", null);
        setField(term1915, term1915.getClass(), "pointer", null);
        setField(term1915, term1915.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1915, term1915.getClass(), "sealed", false);
        setField(term1914, term1914.getClass(), "parent", term1915);
        setField(term1914, term1914.getClass(), "namespaceMap", term1917);
        setField(term1914, term1914.getClass(), "reverseMap", term1922);
        setField(term1914, term1914.getClass(), "pointer", null);
        setField(term1914, term1914.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1914, term1914.getClass(), "sealed", false);
        setField(term1913, term1913.getClass(), "parent", term1914);
        setField(term1913, term1913.getClass(), "namespaceMap", term1928);
        setField(term1913, term1913.getClass(), "reverseMap", term1933);
        setField(term1913, term1913.getClass(), "pointer", null);
        setField(term1913, term1913.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1913, term1913.getClass(), "sealed", false);
        setField(term1912, term1912.getClass(), "parent", term1913);
        setField(term1912, term1912.getClass(), "namespaceMap", term1939);
        setField(term1912, term1912.getClass(), "reverseMap", term1944);
        setField(term1912, term1912.getClass(), "pointer", null);
        setField(term1912, term1912.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1912, term1912.getClass(), "sealed", false);
        setField(term1895, term1895.getClass(), "namespaceResolver", term1912);
        setField(term1895, term1895.getClass(), "parent", null);
        setField(term1895, term1895.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term1895, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


