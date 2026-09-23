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

public class DOMNodePointer_createChild_33656444670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;
     Object term2201;
     Object term2238;

    public DOMNodePointer_createChild_33656444670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2124 = new HashMap();
        HashMap term2158 = new HashMap();
        HashMap term2163 = new HashMap();
        HashMap term2169 = new HashMap();
        HashMap term2174 = new HashMap();
        HashMap term2180 = new HashMap();
        HashMap term2185 = new HashMap();
        HashMap term2195 = new HashMap();
        term2123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2153 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2156 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2193 = newInstance(Class.forName("java.lang.Object"));
        Object term2194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2123, term2123.getClass(), "node", null);
        setField(term2123, term2123.getClass(), "namespaces", term2124);
        setField(term2123, term2123.getClass(), "defaultNamespace", "xLbjWUgOIL");
        setField(term2123, term2123.getClass(), "id", "jDtqGUpnZN");
        setField(term2156, term2156.getClass(), "parent", null);
        setField(term2156, term2156.getClass(), "namespaceMap", null);
        setField(term2156, term2156.getClass(), "reverseMap", null);
        setField(term2156, term2156.getClass(), "pointer", null);
        setBooleanField(term2156, term2156.getClass(), "sealed", false);
        setField(term2155, term2155.getClass(), "parent", term2156);
        setField(term2155, term2155.getClass(), "namespaceMap", term2158);
        setField(term2155, term2155.getClass(), "reverseMap", term2163);
        setField(term2155, term2155.getClass(), "pointer", null);
        setBooleanField(term2155, term2155.getClass(), "sealed", false);
        setField(term2154, term2154.getClass(), "parent", term2155);
        setField(term2154, term2154.getClass(), "namespaceMap", term2169);
        setField(term2154, term2154.getClass(), "reverseMap", term2174);
        setField(term2154, term2154.getClass(), "pointer", null);
        setBooleanField(term2154, term2154.getClass(), "sealed", false);
        setField(term2153, term2153.getClass(), "parent", term2154);
        setField(term2153, term2153.getClass(), "namespaceMap", term2180);
        setField(term2153, term2153.getClass(), "reverseMap", term2185);
        setField(term2153, term2153.getClass(), "pointer", null);
        setBooleanField(term2153, term2153.getClass(), "sealed", false);
        setField(term2123, term2123.getClass(), "localNamespaceResolver", term2153);
        setIntField(term2123, term2123.getClass(), "index", 1048535127);
        setBooleanField(term2123, term2123.getClass(), "attribute", true);
        setField(term2123, term2123.getClass(), "rootNode", term2193);
        setField(term2194, term2194.getClass(), "parent", null);
        setField(term2194, term2194.getClass(), "namespaceMap", term2195);
        setField(term2194, term2194.getClass(), "reverseMap", null);
        setField(term2194, term2194.getClass(), "pointer", null);
        setBooleanField(term2194, term2194.getClass(), "sealed", false);
        setField(term2123, term2123.getClass(), "namespaceResolver", term2194);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2123, term2123.getClass(), "locale", null);
        term2201 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2201, term2201.getClass(), "prefix", "nGKItKLYNC");
        setField(term2201, term2201.getClass(), "name", "UiUYnPrcCi");
        setField(term2201, term2201.getClass(), "qualifiedName", "UoYtihxVaS");
        term2238 = new Integer(-655067527);
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
        args[1] = term2201;
        args[2] = term2238;
        try {
            callMethod(klass, "createChild", argTypes, term2123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


