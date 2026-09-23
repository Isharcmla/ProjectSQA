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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class JDOMNodePointer_getLanguage_57738304770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2082;
     Object term8556;

    public JDOMNodePointer_getLanguage_57738304770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2101 = new HashMap();
        HashMap term2106 = new HashMap();
        HashMap term2112 = new HashMap();
        HashMap term2117 = new HashMap();
        HashMap term2123 = new HashMap();
        HashMap term2128 = new HashMap();
        HashMap term2140 = new HashMap();
        HashMap term2146 = new HashMap();
        HashMap term2151 = new HashMap();
        HashMap term2157 = new HashMap();
        HashMap term2162 = new HashMap();
        term2082 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2083 = newInstance(Class.forName("java.lang.Object"));
        Object term2096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2098 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2099 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2136 = newInstance(Class.forName("java.lang.Object"));
        Object term2137 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2138 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2139 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2082, term2082.getClass(), "node", term2083);
        setField(term2082, term2082.getClass(), "id", "IoAlmYsBwc");
        setField(term2099, term2099.getClass(), "parent", null);
        setField(term2099, term2099.getClass(), "namespaceMap", null);
        setField(term2099, term2099.getClass(), "reverseMap", null);
        setField(term2099, term2099.getClass(), "pointer", null);
        setBooleanField(term2099, term2099.getClass(), "sealed", false);
        setField(term2098, term2098.getClass(), "parent", term2099);
        setField(term2098, term2098.getClass(), "namespaceMap", term2101);
        setField(term2098, term2098.getClass(), "reverseMap", term2106);
        setField(term2098, term2098.getClass(), "pointer", null);
        setBooleanField(term2098, term2098.getClass(), "sealed", false);
        setField(term2097, term2097.getClass(), "parent", term2098);
        setField(term2097, term2097.getClass(), "namespaceMap", term2112);
        setField(term2097, term2097.getClass(), "reverseMap", term2117);
        setField(term2097, term2097.getClass(), "pointer", null);
        setBooleanField(term2097, term2097.getClass(), "sealed", false);
        setField(term2096, term2096.getClass(), "parent", term2097);
        setField(term2096, term2096.getClass(), "namespaceMap", term2123);
        setField(term2096, term2096.getClass(), "reverseMap", term2128);
        setField(term2096, term2096.getClass(), "pointer", null);
        setBooleanField(term2096, term2096.getClass(), "sealed", false);
        setField(term2082, term2082.getClass(), "localNamespaceResolver", term2096);
        setIntField(term2082, term2082.getClass(), "index", 1048535127);
        setBooleanField(term2082, term2082.getClass(), "attribute", true);
        setField(term2082, term2082.getClass(), "rootNode", term2136);
        setField(term2139, term2139.getClass(), "parent", null);
        setField(term2139, term2139.getClass(), "namespaceMap", term2140);
        setField(term2139, term2139.getClass(), "reverseMap", null);
        setField(term2139, term2139.getClass(), "pointer", null);
        setBooleanField(term2139, term2139.getClass(), "sealed", false);
        setField(term2138, term2138.getClass(), "parent", term2139);
        setField(term2138, term2138.getClass(), "namespaceMap", term2146);
        setField(term2138, term2138.getClass(), "reverseMap", term2151);
        setField(term2138, term2138.getClass(), "pointer", null);
        setBooleanField(term2138, term2138.getClass(), "sealed", false);
        setField(term2137, term2137.getClass(), "parent", term2138);
        setField(term2137, term2137.getClass(), "namespaceMap", term2157);
        setField(term2137, term2137.getClass(), "reverseMap", term2162);
        setField(term2137, term2137.getClass(), "pointer", null);
        setBooleanField(term2137, term2137.getClass(), "sealed", false);
        setField(term2082, term2082.getClass(), "namespaceResolver", term2137);
        setField(term2082, term2082.getClass(), "parent", null);
        setField(term2082, term2082.getClass(), "locale", null);
        HashMap term8564 = new HashMap();
        HashMap term8565 = new HashMap();
        HashMap term8566 = new HashMap();
        HashMap term8567 = new HashMap();
        HashMap term8568 = new HashMap();
        HashMap term8569 = new HashMap();
        HashMap term8574 = new HashMap();
        HashMap term8575 = new HashMap();
        HashMap term8576 = new HashMap();
        HashMap term8577 = new HashMap();
        HashMap term8578 = new HashMap();
        term8556 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term8557 = newInstance(Class.forName("java.lang.Object"));
        Object term8560 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8561 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8562 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8563 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8570 = newInstance(Class.forName("java.lang.Object"));
        Object term8571 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8572 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8573 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8556, term8556.getClass(), "node", term8557);
        setField(term8556, term8556.getClass(), "id", "IoAlmYsBwc");
        setField(term8563, term8563.getClass(), "parent", null);
        setField(term8563, term8563.getClass(), "namespaceMap", null);
        setField(term8563, term8563.getClass(), "reverseMap", null);
        setField(term8563, term8563.getClass(), "pointer", null);
        setBooleanField(term8563, term8563.getClass(), "sealed", false);
        setField(term8562, term8562.getClass(), "parent", term8563);
        setField(term8562, term8562.getClass(), "namespaceMap", term8564);
        setField(term8562, term8562.getClass(), "reverseMap", term8565);
        setField(term8562, term8562.getClass(), "pointer", null);
        setBooleanField(term8562, term8562.getClass(), "sealed", false);
        setField(term8561, term8561.getClass(), "parent", term8562);
        setField(term8561, term8561.getClass(), "namespaceMap", term8566);
        setField(term8561, term8561.getClass(), "reverseMap", term8567);
        setField(term8561, term8561.getClass(), "pointer", null);
        setBooleanField(term8561, term8561.getClass(), "sealed", false);
        setField(term8560, term8560.getClass(), "parent", term8561);
        setField(term8560, term8560.getClass(), "namespaceMap", term8568);
        setField(term8560, term8560.getClass(), "reverseMap", term8569);
        setField(term8560, term8560.getClass(), "pointer", null);
        setBooleanField(term8560, term8560.getClass(), "sealed", false);
        setField(term8556, term8556.getClass(), "localNamespaceResolver", term8560);
        setIntField(term8556, term8556.getClass(), "index", 1048535127);
        setBooleanField(term8556, term8556.getClass(), "attribute", true);
        setField(term8556, term8556.getClass(), "rootNode", term8570);
        setField(term8573, term8573.getClass(), "parent", null);
        setField(term8573, term8573.getClass(), "namespaceMap", term8574);
        setField(term8573, term8573.getClass(), "reverseMap", null);
        setField(term8573, term8573.getClass(), "pointer", null);
        setBooleanField(term8573, term8573.getClass(), "sealed", false);
        setField(term8572, term8572.getClass(), "parent", term8573);
        setField(term8572, term8572.getClass(), "namespaceMap", term8575);
        setField(term8572, term8572.getClass(), "reverseMap", term8576);
        setField(term8572, term8572.getClass(), "pointer", null);
        setBooleanField(term8572, term8572.getClass(), "sealed", false);
        setField(term8571, term8571.getClass(), "parent", term8572);
        setField(term8571, term8571.getClass(), "namespaceMap", term8577);
        setField(term8571, term8571.getClass(), "reverseMap", term8578);
        setField(term8571, term8571.getClass(), "pointer", null);
        setBooleanField(term8571, term8571.getClass(), "sealed", false);
        setField(term8556, term8556.getClass(), "namespaceResolver", term8571);
        setField(term8556, term8556.getClass(), "parent", null);
        setField(term8556, term8556.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term2082, args);
        assertTrue(recursiveEquals(term2082, term8556));
        assertTrue(recursiveEquals(retValue, null));
    }

};


