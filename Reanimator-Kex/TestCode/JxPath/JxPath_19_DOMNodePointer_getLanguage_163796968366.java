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
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.dom.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_getLanguage_163796968366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2011;
     Object term8629;

    public DOMNodePointer_getLanguage_163796968366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2012 = new HashMap();
        HashMap term2046 = new HashMap();
        HashMap term2051 = new HashMap();
        HashMap term2057 = new HashMap();
        HashMap term2062 = new HashMap();
        HashMap term2068 = new HashMap();
        HashMap term2073 = new HashMap();
        HashMap term2082 = new HashMap();
        HashMap term2087 = new HashMap();
        term2011 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2041 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2042 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2043 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2044 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2081 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2093 = newInstance(Class.forName("java.lang.Object"));
        setField(term2011, term2011.getClass(), "node", null);
        setField(term2011, term2011.getClass(), "namespaces", term2012);
        setField(term2011, term2011.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term2011, term2011.getClass(), "id", "GzFkzHGYFt");
        setField(term2044, term2044.getClass(), "parent", null);
        setField(term2044, term2044.getClass(), "namespaceMap", null);
        setField(term2044, term2044.getClass(), "reverseMap", null);
        setField(term2044, term2044.getClass(), "pointer", null);
        setBooleanField(term2044, term2044.getClass(), "sealed", false);
        setField(term2043, term2043.getClass(), "parent", term2044);
        setField(term2043, term2043.getClass(), "namespaceMap", term2046);
        setField(term2043, term2043.getClass(), "reverseMap", term2051);
        setField(term2043, term2043.getClass(), "pointer", null);
        setBooleanField(term2043, term2043.getClass(), "sealed", false);
        setField(term2042, term2042.getClass(), "parent", term2043);
        setField(term2042, term2042.getClass(), "namespaceMap", term2057);
        setField(term2042, term2042.getClass(), "reverseMap", term2062);
        setField(term2042, term2042.getClass(), "pointer", null);
        setBooleanField(term2042, term2042.getClass(), "sealed", false);
        setField(term2041, term2041.getClass(), "parent", term2042);
        setField(term2041, term2041.getClass(), "namespaceMap", term2068);
        setField(term2041, term2041.getClass(), "reverseMap", term2073);
        setField(term2041, term2041.getClass(), "pointer", null);
        setBooleanField(term2041, term2041.getClass(), "sealed", false);
        setField(term2011, term2011.getClass(), "localNamespaceResolver", term2041);
        setIntField(term2011, term2011.getClass(), "index", -1456670397);
        setBooleanField(term2011, term2011.getClass(), "attribute", false);
        setField(term2081, term2081.getClass(), "parent", null);
        setField(term2081, term2081.getClass(), "namespaceMap", term2082);
        setField(term2081, term2081.getClass(), "reverseMap", term2087);
        setField(term2081, term2081.getClass(), "pointer", null);
        setBooleanField(term2081, term2081.getClass(), "sealed", false);
        setField(term2011, term2011.getClass(), "namespaceResolver", term2081);
        setField(term2011, term2011.getClass(), "rootNode", term2093);
        setField(term2011, term2011.getClass(), "parent", null);
        setField(term2011, term2011.getClass(), "locale", null);
        HashMap term8630 = new HashMap();
        HashMap term8639 = new HashMap();
        HashMap term8640 = new HashMap();
        HashMap term8641 = new HashMap();
        HashMap term8642 = new HashMap();
        HashMap term8643 = new HashMap();
        HashMap term8644 = new HashMap();
        HashMap term8646 = new HashMap();
        HashMap term8647 = new HashMap();
        term8629 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term8635 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8636 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8637 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8638 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8645 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8648 = newInstance(Class.forName("java.lang.Object"));
        setField(term8629, term8629.getClass(), "node", null);
        setField(term8629, term8629.getClass(), "namespaces", term8630);
        setField(term8629, term8629.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term8629, term8629.getClass(), "id", "GzFkzHGYFt");
        setField(term8638, term8638.getClass(), "parent", null);
        setField(term8638, term8638.getClass(), "namespaceMap", null);
        setField(term8638, term8638.getClass(), "reverseMap", null);
        setField(term8638, term8638.getClass(), "pointer", null);
        setBooleanField(term8638, term8638.getClass(), "sealed", false);
        setField(term8637, term8637.getClass(), "parent", term8638);
        setField(term8637, term8637.getClass(), "namespaceMap", term8639);
        setField(term8637, term8637.getClass(), "reverseMap", term8640);
        setField(term8637, term8637.getClass(), "pointer", null);
        setBooleanField(term8637, term8637.getClass(), "sealed", false);
        setField(term8636, term8636.getClass(), "parent", term8637);
        setField(term8636, term8636.getClass(), "namespaceMap", term8641);
        setField(term8636, term8636.getClass(), "reverseMap", term8642);
        setField(term8636, term8636.getClass(), "pointer", null);
        setBooleanField(term8636, term8636.getClass(), "sealed", false);
        setField(term8635, term8635.getClass(), "parent", term8636);
        setField(term8635, term8635.getClass(), "namespaceMap", term8643);
        setField(term8635, term8635.getClass(), "reverseMap", term8644);
        setField(term8635, term8635.getClass(), "pointer", null);
        setBooleanField(term8635, term8635.getClass(), "sealed", false);
        setField(term8629, term8629.getClass(), "localNamespaceResolver", term8635);
        setIntField(term8629, term8629.getClass(), "index", -1456670397);
        setBooleanField(term8629, term8629.getClass(), "attribute", false);
        setField(term8645, term8645.getClass(), "parent", null);
        setField(term8645, term8645.getClass(), "namespaceMap", term8646);
        setField(term8645, term8645.getClass(), "reverseMap", term8647);
        setField(term8645, term8645.getClass(), "pointer", null);
        setBooleanField(term8645, term8645.getClass(), "sealed", false);
        setField(term8629, term8629.getClass(), "namespaceResolver", term8645);
        setField(term8629, term8629.getClass(), "rootNode", term8648);
        setField(term8629, term8629.getClass(), "parent", null);
        setField(term8629, term8629.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term2011, args);
        assertTrue(recursiveEquals(term2011, term8629));
        assertTrue(recursiveEquals(retValue, null));
    }

};


