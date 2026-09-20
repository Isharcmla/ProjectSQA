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

public class DOMNodePointer_createChild_29927644567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1993;
     Object term2064;
     Object term2089;
     Object term2091;

    public DOMNodePointer_createChild_29927644567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1994 = new HashMap();
        HashMap term2031 = new HashMap();
        HashMap term2036 = new HashMap();
        HashMap term2042 = new HashMap();
        HashMap term2047 = new HashMap();
        HashMap term2053 = new HashMap();
        HashMap term2058 = new HashMap();
        term1993 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2025 = newInstance(Class.forName("java.lang.Object"));
        Object term2026 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2028 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2029 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1993, term1993.getClass(), "node", null);
        setField(term1993, term1993.getClass(), "namespaces", term1994);
        setField(term1993, term1993.getClass(), "defaultNamespace", "xLbjWUgOIL");
        setField(term1993, term1993.getClass(), "id", "jDtqGUpnZN");
        setIntField(term1993, term1993.getClass(), "index", -655067527);
        setBooleanField(term1993, term1993.getClass(), "attribute", true);
        setField(term1993, term1993.getClass(), "rootNode", term2025);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "namespaceMap", null);
        setField(term2029, term2029.getClass(), "reverseMap", null);
        setField(term2029, term2029.getClass(), "pointer", null);
        setField(term2029, term2029.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2029, term2029.getClass(), "sealed", false);
        setField(term2028, term2028.getClass(), "parent", term2029);
        setField(term2028, term2028.getClass(), "namespaceMap", term2031);
        setField(term2028, term2028.getClass(), "reverseMap", term2036);
        setField(term2028, term2028.getClass(), "pointer", null);
        setField(term2028, term2028.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2028, term2028.getClass(), "sealed", false);
        setField(term2027, term2027.getClass(), "parent", term2028);
        setField(term2027, term2027.getClass(), "namespaceMap", term2042);
        setField(term2027, term2027.getClass(), "reverseMap", term2047);
        setField(term2027, term2027.getClass(), "pointer", null);
        setField(term2027, term2027.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2027, term2027.getClass(), "sealed", false);
        setField(term2026, term2026.getClass(), "parent", term2027);
        setField(term2026, term2026.getClass(), "namespaceMap", term2053);
        setField(term2026, term2026.getClass(), "reverseMap", term2058);
        setField(term2026, term2026.getClass(), "pointer", null);
        setField(term2026, term2026.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2026, term2026.getClass(), "sealed", false);
        setField(term1993, term1993.getClass(), "namespaceResolver", term2026);
        setField(term1993, term1993.getClass(), "parent", null);
        setField(term1993, term1993.getClass(), "locale", null);
        term2064 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2064, term2064.getClass(), "prefix", "nGKItKLYNC");
        setField(term2064, term2064.getClass(), "name", "UiUYnPrcCi");
        term2089 = new Integer(-6029667);
        term2091 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2064;
        args[2] = term2089;
        args[3] = term2091;
        try {
            callMethod(klass, "createChild", argTypes, term1993, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
