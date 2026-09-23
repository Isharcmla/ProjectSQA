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

public class DOMNodePointer_getLanguage_163796968367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1994;
     Object term8662;

    public DOMNodePointer_getLanguage_163796968367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1995 = new HashMap();
        HashMap term2029 = new HashMap();
        HashMap term2034 = new HashMap();
        HashMap term2040 = new HashMap();
        HashMap term2045 = new HashMap();
        HashMap term2051 = new HashMap();
        HashMap term2056 = new HashMap();
        HashMap term2065 = new HashMap();
        HashMap term2070 = new HashMap();
        term1994 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2024 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2025 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2026 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2064 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1994, term1994.getClass(), "node", null);
        setField(term1994, term1994.getClass(), "namespaces", term1995);
        setField(term1994, term1994.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term1994, term1994.getClass(), "id", "GzFkzHGYFt");
        setField(term2027, term2027.getClass(), "parent", null);
        setField(term2027, term2027.getClass(), "namespaceMap", null);
        setField(term2027, term2027.getClass(), "reverseMap", null);
        setField(term2027, term2027.getClass(), "pointer", null);
        setBooleanField(term2027, term2027.getClass(), "sealed", false);
        setField(term2026, term2026.getClass(), "parent", term2027);
        setField(term2026, term2026.getClass(), "namespaceMap", term2029);
        setField(term2026, term2026.getClass(), "reverseMap", term2034);
        setField(term2026, term2026.getClass(), "pointer", null);
        setBooleanField(term2026, term2026.getClass(), "sealed", false);
        setField(term2025, term2025.getClass(), "parent", term2026);
        setField(term2025, term2025.getClass(), "namespaceMap", term2040);
        setField(term2025, term2025.getClass(), "reverseMap", term2045);
        setField(term2025, term2025.getClass(), "pointer", null);
        setBooleanField(term2025, term2025.getClass(), "sealed", false);
        setField(term2024, term2024.getClass(), "parent", term2025);
        setField(term2024, term2024.getClass(), "namespaceMap", term2051);
        setField(term2024, term2024.getClass(), "reverseMap", term2056);
        setField(term2024, term2024.getClass(), "pointer", null);
        setBooleanField(term2024, term2024.getClass(), "sealed", false);
        setField(term1994, term1994.getClass(), "localNamespaceResolver", term2024);
        setIntField(term1994, term1994.getClass(), "index", -1456670397);
        setBooleanField(term1994, term1994.getClass(), "attribute", false);
        setField(term2064, term2064.getClass(), "parent", null);
        setField(term2064, term2064.getClass(), "namespaceMap", term2065);
        setField(term2064, term2064.getClass(), "reverseMap", term2070);
        setField(term2064, term2064.getClass(), "pointer", null);
        setBooleanField(term2064, term2064.getClass(), "sealed", false);
        setField(term1994, term1994.getClass(), "namespaceResolver", term2064);
        setField(term1994, term1994.getClass(), "exceptionHandler", null);
        setField(term1994, term1994.getClass(), "rootNode", null);
        setField(term1994, term1994.getClass(), "parent", null);
        setField(term1994, term1994.getClass(), "locale", null);
        HashMap term8663 = new HashMap();
        HashMap term8672 = new HashMap();
        HashMap term8673 = new HashMap();
        HashMap term8674 = new HashMap();
        HashMap term8675 = new HashMap();
        HashMap term8676 = new HashMap();
        HashMap term8677 = new HashMap();
        HashMap term8679 = new HashMap();
        HashMap term8680 = new HashMap();
        term8662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term8668 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8670 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8671 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term8678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term8662, term8662.getClass(), "node", null);
        setField(term8662, term8662.getClass(), "namespaces", term8663);
        setField(term8662, term8662.getClass(), "defaultNamespace", "BndsHwAFMv");
        setField(term8662, term8662.getClass(), "id", "GzFkzHGYFt");
        setField(term8671, term8671.getClass(), "parent", null);
        setField(term8671, term8671.getClass(), "namespaceMap", null);
        setField(term8671, term8671.getClass(), "reverseMap", null);
        setField(term8671, term8671.getClass(), "pointer", null);
        setBooleanField(term8671, term8671.getClass(), "sealed", false);
        setField(term8670, term8670.getClass(), "parent", term8671);
        setField(term8670, term8670.getClass(), "namespaceMap", term8672);
        setField(term8670, term8670.getClass(), "reverseMap", term8673);
        setField(term8670, term8670.getClass(), "pointer", null);
        setBooleanField(term8670, term8670.getClass(), "sealed", false);
        setField(term8669, term8669.getClass(), "parent", term8670);
        setField(term8669, term8669.getClass(), "namespaceMap", term8674);
        setField(term8669, term8669.getClass(), "reverseMap", term8675);
        setField(term8669, term8669.getClass(), "pointer", null);
        setBooleanField(term8669, term8669.getClass(), "sealed", false);
        setField(term8668, term8668.getClass(), "parent", term8669);
        setField(term8668, term8668.getClass(), "namespaceMap", term8676);
        setField(term8668, term8668.getClass(), "reverseMap", term8677);
        setField(term8668, term8668.getClass(), "pointer", null);
        setBooleanField(term8668, term8668.getClass(), "sealed", false);
        setField(term8662, term8662.getClass(), "localNamespaceResolver", term8668);
        setIntField(term8662, term8662.getClass(), "index", -1456670397);
        setBooleanField(term8662, term8662.getClass(), "attribute", false);
        setField(term8678, term8678.getClass(), "parent", null);
        setField(term8678, term8678.getClass(), "namespaceMap", term8679);
        setField(term8678, term8678.getClass(), "reverseMap", term8680);
        setField(term8678, term8678.getClass(), "pointer", null);
        setBooleanField(term8678, term8678.getClass(), "sealed", false);
        setField(term8662, term8662.getClass(), "namespaceResolver", term8678);
        setField(term8662, term8662.getClass(), "exceptionHandler", null);
        setField(term8662, term8662.getClass(), "rootNode", null);
        setField(term8662, term8662.getClass(), "parent", null);
        setField(term8662, term8662.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1994, args);
        assertTrue(recursiveEquals(term1994, term8662));
        assertTrue(recursiveEquals(retValue, null));
    }

};


