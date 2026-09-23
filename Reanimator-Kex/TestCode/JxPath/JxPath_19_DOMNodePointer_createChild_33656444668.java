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
     Object term2218;
     Object term2301;
     Object term2338;

    public DOMNodePointer_createChild_33656444668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2219 = new HashMap();
        HashMap term2253 = new HashMap();
        HashMap term2258 = new HashMap();
        HashMap term2264 = new HashMap();
        HashMap term2269 = new HashMap();
        HashMap term2275 = new HashMap();
        HashMap term2280 = new HashMap();
        HashMap term2289 = new HashMap();
        HashMap term2294 = new HashMap();
        term2218 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2248 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2249 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2250 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2251 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2288 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2300 = newInstance(Class.forName("java.lang.Object"));
        setField(term2218, term2218.getClass(), "node", null);
        setField(term2218, term2218.getClass(), "namespaces", term2219);
        setField(term2218, term2218.getClass(), "defaultNamespace", "xLbjWUgOIL");
        setField(term2218, term2218.getClass(), "id", "jDtqGUpnZN");
        setField(term2251, term2251.getClass(), "parent", null);
        setField(term2251, term2251.getClass(), "namespaceMap", null);
        setField(term2251, term2251.getClass(), "reverseMap", null);
        setField(term2251, term2251.getClass(), "pointer", null);
        setBooleanField(term2251, term2251.getClass(), "sealed", false);
        setField(term2250, term2250.getClass(), "parent", term2251);
        setField(term2250, term2250.getClass(), "namespaceMap", term2253);
        setField(term2250, term2250.getClass(), "reverseMap", term2258);
        setField(term2250, term2250.getClass(), "pointer", null);
        setBooleanField(term2250, term2250.getClass(), "sealed", false);
        setField(term2249, term2249.getClass(), "parent", term2250);
        setField(term2249, term2249.getClass(), "namespaceMap", term2264);
        setField(term2249, term2249.getClass(), "reverseMap", term2269);
        setField(term2249, term2249.getClass(), "pointer", null);
        setBooleanField(term2249, term2249.getClass(), "sealed", false);
        setField(term2248, term2248.getClass(), "parent", term2249);
        setField(term2248, term2248.getClass(), "namespaceMap", term2275);
        setField(term2248, term2248.getClass(), "reverseMap", term2280);
        setField(term2248, term2248.getClass(), "pointer", null);
        setBooleanField(term2248, term2248.getClass(), "sealed", false);
        setField(term2218, term2218.getClass(), "localNamespaceResolver", term2248);
        setIntField(term2218, term2218.getClass(), "index", 1048535127);
        setBooleanField(term2218, term2218.getClass(), "attribute", true);
        setField(term2288, term2288.getClass(), "parent", null);
        setField(term2288, term2288.getClass(), "namespaceMap", term2289);
        setField(term2288, term2288.getClass(), "reverseMap", term2294);
        setField(term2288, term2288.getClass(), "pointer", null);
        setBooleanField(term2288, term2288.getClass(), "sealed", false);
        setField(term2218, term2218.getClass(), "namespaceResolver", term2288);
        setField(term2218, term2218.getClass(), "rootNode", term2300);
        setField(term2218, term2218.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "locale", null);
        term2301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2301, term2301.getClass(), "prefix", "nGKItKLYNC");
        setField(term2301, term2301.getClass(), "name", "UiUYnPrcCi");
        setField(term2301, term2301.getClass(), "qualifiedName", "UoYtihxVaS");
        term2338 = new Integer(-655067527);
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
        args[1] = term2301;
        args[2] = term2338;
        try {
            callMethod(klass, "createChild", argTypes, term2218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


