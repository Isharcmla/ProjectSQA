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

public class DOMNodePointer_createChild_33656444669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;
     Object term2281;
     Object term2318;

    public DOMNodePointer_createChild_33656444669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2200 = new HashMap();
        HashMap term2234 = new HashMap();
        HashMap term2239 = new HashMap();
        HashMap term2245 = new HashMap();
        HashMap term2250 = new HashMap();
        HashMap term2256 = new HashMap();
        HashMap term2261 = new HashMap();
        HashMap term2270 = new HashMap();
        HashMap term2275 = new HashMap();
        term2199 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2229 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2230 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2199, term2199.getClass(), "node", null);
        setField(term2199, term2199.getClass(), "namespaces", term2200);
        setField(term2199, term2199.getClass(), "defaultNamespace", "xLbjWUgOIL");
        setField(term2199, term2199.getClass(), "id", "jDtqGUpnZN");
        setField(term2232, term2232.getClass(), "parent", null);
        setField(term2232, term2232.getClass(), "namespaceMap", null);
        setField(term2232, term2232.getClass(), "reverseMap", null);
        setField(term2232, term2232.getClass(), "pointer", null);
        setBooleanField(term2232, term2232.getClass(), "sealed", false);
        setField(term2231, term2231.getClass(), "parent", term2232);
        setField(term2231, term2231.getClass(), "namespaceMap", term2234);
        setField(term2231, term2231.getClass(), "reverseMap", term2239);
        setField(term2231, term2231.getClass(), "pointer", null);
        setBooleanField(term2231, term2231.getClass(), "sealed", false);
        setField(term2230, term2230.getClass(), "parent", term2231);
        setField(term2230, term2230.getClass(), "namespaceMap", term2245);
        setField(term2230, term2230.getClass(), "reverseMap", term2250);
        setField(term2230, term2230.getClass(), "pointer", null);
        setBooleanField(term2230, term2230.getClass(), "sealed", false);
        setField(term2229, term2229.getClass(), "parent", term2230);
        setField(term2229, term2229.getClass(), "namespaceMap", term2256);
        setField(term2229, term2229.getClass(), "reverseMap", term2261);
        setField(term2229, term2229.getClass(), "pointer", null);
        setBooleanField(term2229, term2229.getClass(), "sealed", false);
        setField(term2199, term2199.getClass(), "localNamespaceResolver", term2229);
        setIntField(term2199, term2199.getClass(), "index", 1048535127);
        setBooleanField(term2199, term2199.getClass(), "attribute", true);
        setField(term2269, term2269.getClass(), "parent", null);
        setField(term2269, term2269.getClass(), "namespaceMap", term2270);
        setField(term2269, term2269.getClass(), "reverseMap", term2275);
        setField(term2269, term2269.getClass(), "pointer", null);
        setBooleanField(term2269, term2269.getClass(), "sealed", false);
        setField(term2199, term2199.getClass(), "namespaceResolver", term2269);
        setField(term2199, term2199.getClass(), "exceptionHandler", null);
        setField(term2199, term2199.getClass(), "rootNode", null);
        setField(term2199, term2199.getClass(), "parent", null);
        setField(term2199, term2199.getClass(), "locale", null);
        term2281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2281, term2281.getClass(), "prefix", "nGKItKLYNC");
        setField(term2281, term2281.getClass(), "name", "UiUYnPrcCi");
        setField(term2281, term2281.getClass(), "qualifiedName", "UoYtihxVaS");
        term2318 = new Integer(-655067527);
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
        args[1] = term2281;
        args[2] = term2318;
        try {
            callMethod(klass, "createChild", argTypes, term2199, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


