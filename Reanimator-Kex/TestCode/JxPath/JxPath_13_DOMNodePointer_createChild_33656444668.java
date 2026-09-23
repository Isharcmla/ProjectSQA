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

public class DOMNodePointer_createChild_33656444668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1899;
     Object term1970;
     Object term2007;

    public DOMNodePointer_createChild_33656444668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1900 = new HashMap();
        HashMap term1937 = new HashMap();
        HashMap term1942 = new HashMap();
        HashMap term1948 = new HashMap();
        HashMap term1953 = new HashMap();
        HashMap term1959 = new HashMap();
        HashMap term1964 = new HashMap();
        term1899 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1931 = newInstance(Class.forName("java.lang.Object"));
        Object term1932 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1899, term1899.getClass(), "node", null);
        setField(term1899, term1899.getClass(), "namespaces", term1900);
        setField(term1899, term1899.getClass(), "defaultNamespace", "tShwQLRGNe");
        setField(term1899, term1899.getClass(), "id", "LvtrsXUliU");
        setIntField(term1899, term1899.getClass(), "index", 1622346318);
        setBooleanField(term1899, term1899.getClass(), "attribute", false);
        setField(term1899, term1899.getClass(), "rootNode", term1931);
        setField(term1935, term1935.getClass(), "parent", null);
        setField(term1935, term1935.getClass(), "namespaceMap", null);
        setField(term1935, term1935.getClass(), "reverseMap", null);
        setField(term1935, term1935.getClass(), "pointer", null);
        setBooleanField(term1935, term1935.getClass(), "sealed", false);
        setField(term1934, term1934.getClass(), "parent", term1935);
        setField(term1934, term1934.getClass(), "namespaceMap", term1937);
        setField(term1934, term1934.getClass(), "reverseMap", term1942);
        setField(term1934, term1934.getClass(), "pointer", null);
        setBooleanField(term1934, term1934.getClass(), "sealed", false);
        setField(term1933, term1933.getClass(), "parent", term1934);
        setField(term1933, term1933.getClass(), "namespaceMap", term1948);
        setField(term1933, term1933.getClass(), "reverseMap", term1953);
        setField(term1933, term1933.getClass(), "pointer", null);
        setBooleanField(term1933, term1933.getClass(), "sealed", false);
        setField(term1932, term1932.getClass(), "parent", term1933);
        setField(term1932, term1932.getClass(), "namespaceMap", term1959);
        setField(term1932, term1932.getClass(), "reverseMap", term1964);
        setField(term1932, term1932.getClass(), "pointer", null);
        setBooleanField(term1932, term1932.getClass(), "sealed", false);
        setField(term1899, term1899.getClass(), "namespaceResolver", term1932);
        setField(term1899, term1899.getClass(), "parent", null);
        setField(term1899, term1899.getClass(), "locale", null);
        term1970 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term1970, term1970.getClass(), "prefix", "xLbjWUgOIL");
        setField(term1970, term1970.getClass(), "name", "jDtqGUpnZN");
        setField(term1970, term1970.getClass(), "qualifiedName", "nGKItKLYNC");
        term2007 = new Integer(1048535127);
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
        args[1] = term1970;
        args[2] = term2007;
        try {
            callMethod(klass, "createChild", argTypes, term1899, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


