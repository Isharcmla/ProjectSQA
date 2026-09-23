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
     Object term2037;
     Object term2108;
     Object term2145;
     Object term2147;

    public DOMNodePointer_createChild_29927644567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2038 = new HashMap();
        HashMap term2075 = new HashMap();
        HashMap term2080 = new HashMap();
        HashMap term2086 = new HashMap();
        HashMap term2091 = new HashMap();
        HashMap term2097 = new HashMap();
        HashMap term2102 = new HashMap();
        term2037 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2069 = newInstance(Class.forName("java.lang.Object"));
        Object term2070 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2071 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2072 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2073 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2037, term2037.getClass(), "node", null);
        setField(term2037, term2037.getClass(), "namespaces", term2038);
        setField(term2037, term2037.getClass(), "defaultNamespace", "nGKItKLYNC");
        setField(term2037, term2037.getClass(), "id", "UiUYnPrcCi");
        setIntField(term2037, term2037.getClass(), "index", -655067527);
        setBooleanField(term2037, term2037.getClass(), "attribute", true);
        setField(term2037, term2037.getClass(), "rootNode", term2069);
        setField(term2073, term2073.getClass(), "parent", null);
        setField(term2073, term2073.getClass(), "namespaceMap", null);
        setField(term2073, term2073.getClass(), "reverseMap", null);
        setField(term2073, term2073.getClass(), "pointer", null);
        setField(term2073, term2073.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2073, term2073.getClass(), "sealed", false);
        setField(term2072, term2072.getClass(), "parent", term2073);
        setField(term2072, term2072.getClass(), "namespaceMap", term2075);
        setField(term2072, term2072.getClass(), "reverseMap", term2080);
        setField(term2072, term2072.getClass(), "pointer", null);
        setField(term2072, term2072.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2072, term2072.getClass(), "sealed", false);
        setField(term2071, term2071.getClass(), "parent", term2072);
        setField(term2071, term2071.getClass(), "namespaceMap", term2086);
        setField(term2071, term2071.getClass(), "reverseMap", term2091);
        setField(term2071, term2071.getClass(), "pointer", null);
        setField(term2071, term2071.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2071, term2071.getClass(), "sealed", false);
        setField(term2070, term2070.getClass(), "parent", term2071);
        setField(term2070, term2070.getClass(), "namespaceMap", term2097);
        setField(term2070, term2070.getClass(), "reverseMap", term2102);
        setField(term2070, term2070.getClass(), "pointer", null);
        setField(term2070, term2070.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2070, term2070.getClass(), "sealed", false);
        setField(term2037, term2037.getClass(), "namespaceResolver", term2070);
        setField(term2037, term2037.getClass(), "parent", null);
        setField(term2037, term2037.getClass(), "locale", null);
        term2108 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2108, term2108.getClass(), "prefix", "UoYtihxVaS");
        setField(term2108, term2108.getClass(), "name", "JDswTTCZHV");
        setField(term2108, term2108.getClass(), "qualifiedName", "onpbIeEKoi");
        term2145 = new Integer(-6029667);
        term2147 = newInstance(Class.forName("java.lang.Object"));
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
        args[1] = term2108;
        args[2] = term2145;
        args[3] = term2147;
        try {
            callMethod(klass, "createChild", argTypes, term2037, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


