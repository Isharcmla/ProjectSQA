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
     Object term1716;
     Object term7933;

    public DOMNodePointer_getLanguage_163796968366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1717 = new HashMap();
        HashMap term1754 = new HashMap();
        HashMap term1759 = new HashMap();
        HashMap term1765 = new HashMap();
        HashMap term1770 = new HashMap();
        HashMap term1776 = new HashMap();
        HashMap term1781 = new HashMap();
        term1716 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term1748 = newInstance(Class.forName("java.lang.Object"));
        Object term1749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1750 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1751 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term1752 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term1716, term1716.getClass(), "node", null);
        setField(term1716, term1716.getClass(), "namespaces", term1717);
        setField(term1716, term1716.getClass(), "defaultNamespace", "gGSMzuGICf");
        setField(term1716, term1716.getClass(), "id", "hxCBltsObl");
        setIntField(term1716, term1716.getClass(), "index", -1685132342);
        setBooleanField(term1716, term1716.getClass(), "attribute", true);
        setField(term1716, term1716.getClass(), "rootNode", term1748);
        setField(term1752, term1752.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "namespaceMap", null);
        setField(term1752, term1752.getClass(), "reverseMap", null);
        setField(term1752, term1752.getClass(), "pointer", null);
        setBooleanField(term1752, term1752.getClass(), "sealed", false);
        setField(term1751, term1751.getClass(), "parent", term1752);
        setField(term1751, term1751.getClass(), "namespaceMap", term1754);
        setField(term1751, term1751.getClass(), "reverseMap", term1759);
        setField(term1751, term1751.getClass(), "pointer", null);
        setBooleanField(term1751, term1751.getClass(), "sealed", false);
        setField(term1750, term1750.getClass(), "parent", term1751);
        setField(term1750, term1750.getClass(), "namespaceMap", term1765);
        setField(term1750, term1750.getClass(), "reverseMap", term1770);
        setField(term1750, term1750.getClass(), "pointer", null);
        setBooleanField(term1750, term1750.getClass(), "sealed", false);
        setField(term1749, term1749.getClass(), "parent", term1750);
        setField(term1749, term1749.getClass(), "namespaceMap", term1776);
        setField(term1749, term1749.getClass(), "reverseMap", term1781);
        setField(term1749, term1749.getClass(), "pointer", null);
        setBooleanField(term1749, term1749.getClass(), "sealed", false);
        setField(term1716, term1716.getClass(), "namespaceResolver", term1749);
        setField(term1716, term1716.getClass(), "parent", null);
        setField(term1716, term1716.getClass(), "locale", null);
        HashMap term7934 = new HashMap();
        HashMap term7944 = new HashMap();
        HashMap term7945 = new HashMap();
        HashMap term7946 = new HashMap();
        HashMap term7947 = new HashMap();
        HashMap term7948 = new HashMap();
        HashMap term7949 = new HashMap();
        term7933 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term7939 = newInstance(Class.forName("java.lang.Object"));
        Object term7940 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7942 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term7943 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term7933, term7933.getClass(), "node", null);
        setField(term7933, term7933.getClass(), "namespaces", term7934);
        setField(term7933, term7933.getClass(), "defaultNamespace", "gGSMzuGICf");
        setField(term7933, term7933.getClass(), "id", "hxCBltsObl");
        setIntField(term7933, term7933.getClass(), "index", -1685132342);
        setBooleanField(term7933, term7933.getClass(), "attribute", true);
        setField(term7933, term7933.getClass(), "rootNode", term7939);
        setField(term7943, term7943.getClass(), "parent", null);
        setField(term7943, term7943.getClass(), "namespaceMap", null);
        setField(term7943, term7943.getClass(), "reverseMap", null);
        setField(term7943, term7943.getClass(), "pointer", null);
        setBooleanField(term7943, term7943.getClass(), "sealed", false);
        setField(term7942, term7942.getClass(), "parent", term7943);
        setField(term7942, term7942.getClass(), "namespaceMap", term7944);
        setField(term7942, term7942.getClass(), "reverseMap", term7945);
        setField(term7942, term7942.getClass(), "pointer", null);
        setBooleanField(term7942, term7942.getClass(), "sealed", false);
        setField(term7941, term7941.getClass(), "parent", term7942);
        setField(term7941, term7941.getClass(), "namespaceMap", term7946);
        setField(term7941, term7941.getClass(), "reverseMap", term7947);
        setField(term7941, term7941.getClass(), "pointer", null);
        setBooleanField(term7941, term7941.getClass(), "sealed", false);
        setField(term7940, term7940.getClass(), "parent", term7941);
        setField(term7940, term7940.getClass(), "namespaceMap", term7948);
        setField(term7940, term7940.getClass(), "reverseMap", term7949);
        setField(term7940, term7940.getClass(), "pointer", null);
        setBooleanField(term7940, term7940.getClass(), "sealed", false);
        setField(term7933, term7933.getClass(), "namespaceResolver", term7940);
        setField(term7933, term7933.getClass(), "parent", null);
        setField(term7933, term7933.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term1716, args);
        assertTrue(recursiveEquals(term1716, term7933));
        assertTrue(recursiveEquals(retValue, null));
    }

};


