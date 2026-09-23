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

public class DOMNodePointer_createChild_29927644569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2059;
     Object term2130;
     Object term2167;
     Object term2169;

    public DOMNodePointer_createChild_29927644569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2060 = new HashMap();
        HashMap term2097 = new HashMap();
        HashMap term2102 = new HashMap();
        HashMap term2108 = new HashMap();
        HashMap term2113 = new HashMap();
        HashMap term2119 = new HashMap();
        HashMap term2124 = new HashMap();
        term2059 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2091 = newInstance(Class.forName("java.lang.Object"));
        Object term2092 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2093 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2094 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2095 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2059, term2059.getClass(), "node", null);
        setField(term2059, term2059.getClass(), "namespaces", term2060);
        setField(term2059, term2059.getClass(), "defaultNamespace", "UiUYnPrcCi");
        setField(term2059, term2059.getClass(), "id", "UoYtihxVaS");
        setIntField(term2059, term2059.getClass(), "index", -655067527);
        setBooleanField(term2059, term2059.getClass(), "attribute", true);
        setField(term2059, term2059.getClass(), "rootNode", term2091);
        setField(term2095, term2095.getClass(), "parent", null);
        setField(term2095, term2095.getClass(), "namespaceMap", null);
        setField(term2095, term2095.getClass(), "reverseMap", null);
        setField(term2095, term2095.getClass(), "pointer", null);
        setBooleanField(term2095, term2095.getClass(), "sealed", false);
        setField(term2094, term2094.getClass(), "parent", term2095);
        setField(term2094, term2094.getClass(), "namespaceMap", term2097);
        setField(term2094, term2094.getClass(), "reverseMap", term2102);
        setField(term2094, term2094.getClass(), "pointer", null);
        setBooleanField(term2094, term2094.getClass(), "sealed", false);
        setField(term2093, term2093.getClass(), "parent", term2094);
        setField(term2093, term2093.getClass(), "namespaceMap", term2108);
        setField(term2093, term2093.getClass(), "reverseMap", term2113);
        setField(term2093, term2093.getClass(), "pointer", null);
        setBooleanField(term2093, term2093.getClass(), "sealed", false);
        setField(term2092, term2092.getClass(), "parent", term2093);
        setField(term2092, term2092.getClass(), "namespaceMap", term2119);
        setField(term2092, term2092.getClass(), "reverseMap", term2124);
        setField(term2092, term2092.getClass(), "pointer", null);
        setBooleanField(term2092, term2092.getClass(), "sealed", false);
        setField(term2059, term2059.getClass(), "namespaceResolver", term2092);
        setField(term2059, term2059.getClass(), "parent", null);
        setField(term2059, term2059.getClass(), "locale", null);
        term2130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2130, term2130.getClass(), "prefix", "JDswTTCZHV");
        setField(term2130, term2130.getClass(), "name", "onpbIeEKoi");
        setField(term2130, term2130.getClass(), "qualifiedName", "YRHGsAkhxb");
        term2167 = new Integer(-6029667);
        term2169 = newInstance(Class.forName("java.lang.Object"));
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
        args[1] = term2130;
        args[2] = term2167;
        args[3] = term2169;
        try {
            callMethod(klass, "createChild", argTypes, term2059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


