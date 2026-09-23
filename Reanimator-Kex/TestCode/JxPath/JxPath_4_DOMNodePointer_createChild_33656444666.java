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
import java.lang.Integer;

public class DOMNodePointer_createChild_33656444666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1877;
     Object term1948;
     Object term1985;

    public DOMNodePointer_createChild_33656444666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1878 = new HashMap();
        HashMap term1915 = new HashMap();
        HashMap term1920 = new HashMap();
        HashMap term1926 = new HashMap();
        HashMap term1931 = new HashMap();
        HashMap term1937 = new HashMap();
        HashMap term1942 = new HashMap();
        term1877 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1909 = newInstance(Class.forName("java.lang.Object"));
        Object term1910 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1911 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1913 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1877, term1877.getClass(), "node", null);
        setField(term1877, term1877.getClass(), "namespaces", term1878);
        setField(term1877, term1877.getClass(), "defaultNamespace", "GzFkzHGYFt");
        setField(term1877, term1877.getClass(), "id", "tShwQLRGNe");
        setIntField(term1877, term1877.getClass(), "index", 1622346318);
        setBooleanField(term1877, term1877.getClass(), "attribute", false);
        setField(term1877, term1877.getClass(), "rootNode", term1909);
        setField(term1913, term1913.getClass(), "parent", null);
        setField(term1913, term1913.getClass(), "namespaceMap", null);
        setField(term1913, term1913.getClass(), "reverseMap", null);
        setField(term1913, term1913.getClass(), "pointer", null);
        setField(term1913, term1913.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1913, term1913.getClass(), "sealed", false);
        setField(term1912, term1912.getClass(), "parent", term1913);
        setField(term1912, term1912.getClass(), "namespaceMap", term1915);
        setField(term1912, term1912.getClass(), "reverseMap", term1920);
        setField(term1912, term1912.getClass(), "pointer", null);
        setField(term1912, term1912.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1912, term1912.getClass(), "sealed", false);
        setField(term1911, term1911.getClass(), "parent", term1912);
        setField(term1911, term1911.getClass(), "namespaceMap", term1926);
        setField(term1911, term1911.getClass(), "reverseMap", term1931);
        setField(term1911, term1911.getClass(), "pointer", null);
        setField(term1911, term1911.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1911, term1911.getClass(), "sealed", false);
        setField(term1910, term1910.getClass(), "parent", term1911);
        setField(term1910, term1910.getClass(), "namespaceMap", term1937);
        setField(term1910, term1910.getClass(), "reverseMap", term1942);
        setField(term1910, term1910.getClass(), "pointer", null);
        setField(term1910, term1910.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1910, term1910.getClass(), "sealed", false);
        setField(term1877, term1877.getClass(), "namespaceResolver", term1910);
        setField(term1877, term1877.getClass(), "parent", null);
        setField(term1877, term1877.getClass(), "locale", null);
        term1948 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1948, term1948.getClass(), "prefix", "LvtrsXUliU");
        setField(term1948, term1948.getClass(), "name", "xLbjWUgOIL");
        setField(term1948, term1948.getClass(), "qualifiedName", "jDtqGUpnZN");
        term1985 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1948;
        args[2] = term1985;
        try {
            callMethod(klass, "createChild", argTypes, term1877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


