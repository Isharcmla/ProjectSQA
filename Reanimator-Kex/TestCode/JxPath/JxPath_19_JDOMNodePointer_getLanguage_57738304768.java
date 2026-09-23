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

public class JDOMNodePointer_getLanguage_57738304768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2177;
     Object term8582;

    public JDOMNodePointer_getLanguage_57738304768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2196 = new HashMap();
        HashMap term2201 = new HashMap();
        HashMap term2207 = new HashMap();
        HashMap term2212 = new HashMap();
        HashMap term2218 = new HashMap();
        HashMap term2223 = new HashMap();
        HashMap term2234 = new HashMap();
        HashMap term2239 = new HashMap();
        HashMap term2245 = new HashMap();
        HashMap term2250 = new HashMap();
        HashMap term2256 = new HashMap();
        HashMap term2261 = new HashMap();
        term2177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term2178 = newInstance(Class.forName("java.lang.Object"));
        Object term2191 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2192 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2193 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2194 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2267 = newInstance(Class.forName("java.lang.Object"));
        setField(term2177, term2177.getClass(), "node", term2178);
        setField(term2177, term2177.getClass(), "id", "IoAlmYsBwc");
        setField(term2194, term2194.getClass(), "parent", null);
        setField(term2194, term2194.getClass(), "namespaceMap", null);
        setField(term2194, term2194.getClass(), "reverseMap", null);
        setField(term2194, term2194.getClass(), "pointer", null);
        setBooleanField(term2194, term2194.getClass(), "sealed", false);
        setField(term2193, term2193.getClass(), "parent", term2194);
        setField(term2193, term2193.getClass(), "namespaceMap", term2196);
        setField(term2193, term2193.getClass(), "reverseMap", term2201);
        setField(term2193, term2193.getClass(), "pointer", null);
        setBooleanField(term2193, term2193.getClass(), "sealed", false);
        setField(term2192, term2192.getClass(), "parent", term2193);
        setField(term2192, term2192.getClass(), "namespaceMap", term2207);
        setField(term2192, term2192.getClass(), "reverseMap", term2212);
        setField(term2192, term2192.getClass(), "pointer", null);
        setBooleanField(term2192, term2192.getClass(), "sealed", false);
        setField(term2191, term2191.getClass(), "parent", term2192);
        setField(term2191, term2191.getClass(), "namespaceMap", term2218);
        setField(term2191, term2191.getClass(), "reverseMap", term2223);
        setField(term2191, term2191.getClass(), "pointer", null);
        setBooleanField(term2191, term2191.getClass(), "sealed", false);
        setField(term2177, term2177.getClass(), "localNamespaceResolver", term2191);
        setIntField(term2177, term2177.getClass(), "index", 1048535127);
        setBooleanField(term2177, term2177.getClass(), "attribute", true);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2233, term2233.getClass(), "namespaceMap", term2234);
        setField(term2233, term2233.getClass(), "reverseMap", term2239);
        setField(term2233, term2233.getClass(), "pointer", null);
        setBooleanField(term2233, term2233.getClass(), "sealed", false);
        setField(term2232, term2232.getClass(), "parent", term2233);
        setField(term2232, term2232.getClass(), "namespaceMap", term2245);
        setField(term2232, term2232.getClass(), "reverseMap", term2250);
        setField(term2232, term2232.getClass(), "pointer", null);
        setBooleanField(term2232, term2232.getClass(), "sealed", false);
        setField(term2231, term2231.getClass(), "parent", term2232);
        setField(term2231, term2231.getClass(), "namespaceMap", term2256);
        setField(term2231, term2231.getClass(), "reverseMap", term2261);
        setField(term2231, term2231.getClass(), "pointer", null);
        setBooleanField(term2231, term2231.getClass(), "sealed", false);
        setField(term2177, term2177.getClass(), "namespaceResolver", term2231);
        setField(term2177, term2177.getClass(), "rootNode", term2267);
        setField(term2177, term2177.getClass(), "parent", null);
        setField(term2177, term2177.getClass(), "locale", null);
        HashMap term8590 = new HashMap();
        HashMap term8591 = new HashMap();
        HashMap term8592 = new HashMap();
        HashMap term8593 = new HashMap();
        HashMap term8594 = new HashMap();
        HashMap term8595 = new HashMap();
        HashMap term8599 = new HashMap();
        HashMap term8600 = new HashMap();
        HashMap term8601 = new HashMap();
        HashMap term8602 = new HashMap();
        HashMap term8603 = new HashMap();
        HashMap term8604 = new HashMap();
        term8582 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term8583 = newInstance(Class.forName("java.lang.Object"));
        Object term8586 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8587 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8588 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8589 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8598 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8605 = newInstance(Class.forName("java.lang.Object"));
        setField(term8582, term8582.getClass(), "node", term8583);
        setField(term8582, term8582.getClass(), "id", "IoAlmYsBwc");
        setField(term8589, term8589.getClass(), "parent", null);
        setField(term8589, term8589.getClass(), "namespaceMap", null);
        setField(term8589, term8589.getClass(), "reverseMap", null);
        setField(term8589, term8589.getClass(), "pointer", null);
        setBooleanField(term8589, term8589.getClass(), "sealed", false);
        setField(term8588, term8588.getClass(), "parent", term8589);
        setField(term8588, term8588.getClass(), "namespaceMap", term8590);
        setField(term8588, term8588.getClass(), "reverseMap", term8591);
        setField(term8588, term8588.getClass(), "pointer", null);
        setBooleanField(term8588, term8588.getClass(), "sealed", false);
        setField(term8587, term8587.getClass(), "parent", term8588);
        setField(term8587, term8587.getClass(), "namespaceMap", term8592);
        setField(term8587, term8587.getClass(), "reverseMap", term8593);
        setField(term8587, term8587.getClass(), "pointer", null);
        setBooleanField(term8587, term8587.getClass(), "sealed", false);
        setField(term8586, term8586.getClass(), "parent", term8587);
        setField(term8586, term8586.getClass(), "namespaceMap", term8594);
        setField(term8586, term8586.getClass(), "reverseMap", term8595);
        setField(term8586, term8586.getClass(), "pointer", null);
        setBooleanField(term8586, term8586.getClass(), "sealed", false);
        setField(term8582, term8582.getClass(), "localNamespaceResolver", term8586);
        setIntField(term8582, term8582.getClass(), "index", 1048535127);
        setBooleanField(term8582, term8582.getClass(), "attribute", true);
        setField(term8598, term8598.getClass(), "parent", null);
        setField(term8598, term8598.getClass(), "namespaceMap", term8599);
        setField(term8598, term8598.getClass(), "reverseMap", term8600);
        setField(term8598, term8598.getClass(), "pointer", null);
        setBooleanField(term8598, term8598.getClass(), "sealed", false);
        setField(term8597, term8597.getClass(), "parent", term8598);
        setField(term8597, term8597.getClass(), "namespaceMap", term8601);
        setField(term8597, term8597.getClass(), "reverseMap", term8602);
        setField(term8597, term8597.getClass(), "pointer", null);
        setBooleanField(term8597, term8597.getClass(), "sealed", false);
        setField(term8596, term8596.getClass(), "parent", term8597);
        setField(term8596, term8596.getClass(), "namespaceMap", term8603);
        setField(term8596, term8596.getClass(), "reverseMap", term8604);
        setField(term8596, term8596.getClass(), "pointer", null);
        setBooleanField(term8596, term8596.getClass(), "sealed", false);
        setField(term8582, term8582.getClass(), "namespaceResolver", term8596);
        setField(term8582, term8582.getClass(), "rootNode", term8605);
        setField(term8582, term8582.getClass(), "parent", null);
        setField(term8582, term8582.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term2177, args);
        assertTrue(recursiveEquals(term2177, term8582));
        assertTrue(recursiveEquals(retValue, null));
    }

};


