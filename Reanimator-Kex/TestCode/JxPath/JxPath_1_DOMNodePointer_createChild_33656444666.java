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
     Object term1855;
     Object term1926;
     Object term1951;

    public DOMNodePointer_createChild_33656444666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1856 = new HashMap();
        HashMap term1893 = new HashMap();
        HashMap term1898 = new HashMap();
        HashMap term1904 = new HashMap();
        HashMap term1909 = new HashMap();
        HashMap term1915 = new HashMap();
        HashMap term1920 = new HashMap();
        term1855 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1887 = newInstance(Class.forName("java.lang.Object"));
        Object term1888 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1889 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1890 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1891 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1855, term1855.getClass(), "node", null);
        setField(term1855, term1855.getClass(), "namespaces", term1856);
        setField(term1855, term1855.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term1855, term1855.getClass(), "id", "GzFkzHGYFt");
        setIntField(term1855, term1855.getClass(), "index", 1622346318);
        setBooleanField(term1855, term1855.getClass(), "attribute", false);
        setField(term1855, term1855.getClass(), "rootNode", term1887);
        setField(term1891, term1891.getClass(), "parent", null);
        setField(term1891, term1891.getClass(), "namespaceMap", null);
        setField(term1891, term1891.getClass(), "reverseMap", null);
        setField(term1891, term1891.getClass(), "pointer", null);
        setField(term1891, term1891.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1891, term1891.getClass(), "sealed", false);
        setField(term1890, term1890.getClass(), "parent", term1891);
        setField(term1890, term1890.getClass(), "namespaceMap", term1893);
        setField(term1890, term1890.getClass(), "reverseMap", term1898);
        setField(term1890, term1890.getClass(), "pointer", null);
        setField(term1890, term1890.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1890, term1890.getClass(), "sealed", false);
        setField(term1889, term1889.getClass(), "parent", term1890);
        setField(term1889, term1889.getClass(), "namespaceMap", term1904);
        setField(term1889, term1889.getClass(), "reverseMap", term1909);
        setField(term1889, term1889.getClass(), "pointer", null);
        setField(term1889, term1889.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1889, term1889.getClass(), "sealed", false);
        setField(term1888, term1888.getClass(), "parent", term1889);
        setField(term1888, term1888.getClass(), "namespaceMap", term1915);
        setField(term1888, term1888.getClass(), "reverseMap", term1920);
        setField(term1888, term1888.getClass(), "pointer", null);
        setField(term1888, term1888.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term1888, term1888.getClass(), "sealed", false);
        setField(term1855, term1855.getClass(), "namespaceResolver", term1888);
        setField(term1855, term1855.getClass(), "parent", null);
        setField(term1855, term1855.getClass(), "locale", null);
        term1926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1926, term1926.getClass(), "prefix", "tShwQLRGNe");
        setField(term1926, term1926.getClass(), "name", "LvtrsXUliU");
        term1951 = new Integer(1048535127);
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
        args[1] = term1926;
        args[2] = term1951;
        try {
            callMethod(klass, "createChild", argTypes, term1855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
