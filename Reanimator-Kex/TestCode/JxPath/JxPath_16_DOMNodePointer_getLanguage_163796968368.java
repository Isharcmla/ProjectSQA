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

public class DOMNodePointer_getLanguage_163796968368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1926;
     Object term8558;

    public DOMNodePointer_getLanguage_163796968368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1927 = new HashMap();
        HashMap term1961 = new HashMap();
        HashMap term1966 = new HashMap();
        HashMap term1972 = new HashMap();
        HashMap term1977 = new HashMap();
        HashMap term1983 = new HashMap();
        HashMap term1988 = new HashMap();
        HashMap term1998 = new HashMap();
        term1926 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1956 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1957 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1958 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1959 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1996 = newInstance(Class.forName("java.lang.Object"));
        Object term1997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1926, term1926.getClass(), "node", null);
        setField(term1926, term1926.getClass(), "namespaces", term1927);
        setField(term1926, term1926.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term1926, term1926.getClass(), "id", "GzFkzHGYFt");
        setField(term1959, term1959.getClass(), "parent", null);
        setField(term1959, term1959.getClass(), "namespaceMap", null);
        setField(term1959, term1959.getClass(), "reverseMap", null);
        setField(term1959, term1959.getClass(), "pointer", null);
        setBooleanField(term1959, term1959.getClass(), "sealed", false);
        setField(term1958, term1958.getClass(), "parent", term1959);
        setField(term1958, term1958.getClass(), "namespaceMap", term1961);
        setField(term1958, term1958.getClass(), "reverseMap", term1966);
        setField(term1958, term1958.getClass(), "pointer", null);
        setBooleanField(term1958, term1958.getClass(), "sealed", false);
        setField(term1957, term1957.getClass(), "parent", term1958);
        setField(term1957, term1957.getClass(), "namespaceMap", term1972);
        setField(term1957, term1957.getClass(), "reverseMap", term1977);
        setField(term1957, term1957.getClass(), "pointer", null);
        setBooleanField(term1957, term1957.getClass(), "sealed", false);
        setField(term1956, term1956.getClass(), "parent", term1957);
        setField(term1956, term1956.getClass(), "namespaceMap", term1983);
        setField(term1956, term1956.getClass(), "reverseMap", term1988);
        setField(term1956, term1956.getClass(), "pointer", null);
        setBooleanField(term1956, term1956.getClass(), "sealed", false);
        setField(term1926, term1926.getClass(), "localNamespaceResolver", term1956);
        setIntField(term1926, term1926.getClass(), "index", -1456670397);
        setBooleanField(term1926, term1926.getClass(), "attribute", false);
        setField(term1926, term1926.getClass(), "rootNode", term1996);
        setField(term1997, term1997.getClass(), "parent", null);
        setField(term1997, term1997.getClass(), "namespaceMap", term1998);
        setField(term1997, term1997.getClass(), "reverseMap", null);
        setField(term1997, term1997.getClass(), "pointer", null);
        setBooleanField(term1997, term1997.getClass(), "sealed", false);
        setField(term1926, term1926.getClass(), "namespaceResolver", term1997);
        setField(term1926, term1926.getClass(), "parent", null);
        setField(term1926, term1926.getClass(), "locale", null);
        HashMap term8559 = new HashMap();
        HashMap term8568 = new HashMap();
        HashMap term8569 = new HashMap();
        HashMap term8570 = new HashMap();
        HashMap term8571 = new HashMap();
        HashMap term8572 = new HashMap();
        HashMap term8573 = new HashMap();
        HashMap term8576 = new HashMap();
        term8558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term8564 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8565 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8566 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8567 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8574 = newInstance(Class.forName("java.lang.Object"));
        Object term8575 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8558, term8558.getClass(), "node", null);
        setField(term8558, term8558.getClass(), "namespaces", term8559);
        setField(term8558, term8558.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term8558, term8558.getClass(), "id", "GzFkzHGYFt");
        setField(term8567, term8567.getClass(), "parent", null);
        setField(term8567, term8567.getClass(), "namespaceMap", null);
        setField(term8567, term8567.getClass(), "reverseMap", null);
        setField(term8567, term8567.getClass(), "pointer", null);
        setBooleanField(term8567, term8567.getClass(), "sealed", false);
        setField(term8566, term8566.getClass(), "parent", term8567);
        setField(term8566, term8566.getClass(), "namespaceMap", term8568);
        setField(term8566, term8566.getClass(), "reverseMap", term8569);
        setField(term8566, term8566.getClass(), "pointer", null);
        setBooleanField(term8566, term8566.getClass(), "sealed", false);
        setField(term8565, term8565.getClass(), "parent", term8566);
        setField(term8565, term8565.getClass(), "namespaceMap", term8570);
        setField(term8565, term8565.getClass(), "reverseMap", term8571);
        setField(term8565, term8565.getClass(), "pointer", null);
        setBooleanField(term8565, term8565.getClass(), "sealed", false);
        setField(term8564, term8564.getClass(), "parent", term8565);
        setField(term8564, term8564.getClass(), "namespaceMap", term8572);
        setField(term8564, term8564.getClass(), "reverseMap", term8573);
        setField(term8564, term8564.getClass(), "pointer", null);
        setBooleanField(term8564, term8564.getClass(), "sealed", false);
        setField(term8558, term8558.getClass(), "localNamespaceResolver", term8564);
        setIntField(term8558, term8558.getClass(), "index", -1456670397);
        setBooleanField(term8558, term8558.getClass(), "attribute", false);
        setField(term8558, term8558.getClass(), "rootNode", term8574);
        setField(term8575, term8575.getClass(), "parent", null);
        setField(term8575, term8575.getClass(), "namespaceMap", term8576);
        setField(term8575, term8575.getClass(), "reverseMap", null);
        setField(term8575, term8575.getClass(), "pointer", null);
        setBooleanField(term8575, term8575.getClass(), "sealed", false);
        setField(term8558, term8558.getClass(), "namespaceResolver", term8575);
        setField(term8558, term8558.getClass(), "parent", null);
        setField(term8558, term8558.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1926, args);
        assertTrue(recursiveEquals(term1926, term8558));
        assertTrue(recursiveEquals(retValue, null));
    }

};


