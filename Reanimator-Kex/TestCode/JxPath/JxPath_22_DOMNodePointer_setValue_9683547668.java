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

public class DOMNodePointer_setValue_9683547668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2096;
     Object term2178;

    public DOMNodePointer_setValue_9683547668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2097 = new HashMap();
        HashMap term2131 = new HashMap();
        HashMap term2136 = new HashMap();
        HashMap term2142 = new HashMap();
        HashMap term2147 = new HashMap();
        HashMap term2153 = new HashMap();
        HashMap term2158 = new HashMap();
        HashMap term2167 = new HashMap();
        HashMap term2172 = new HashMap();
        term2096 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2126 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2127 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2128 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2129 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2166 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2096, term2096.getClass(), "node", null);
        setField(term2096, term2096.getClass(), "namespaces", term2097);
        setField(term2096, term2096.getClass(), "defaultNamespace", "tShwQLRGNe");
        setField(term2096, term2096.getClass(), "id", "LvtrsXUliU");
        setField(term2129, term2129.getClass(), "parent", null);
        setField(term2129, term2129.getClass(), "namespaceMap", null);
        setField(term2129, term2129.getClass(), "reverseMap", null);
        setField(term2129, term2129.getClass(), "pointer", null);
        setBooleanField(term2129, term2129.getClass(), "sealed", false);
        setField(term2128, term2128.getClass(), "parent", term2129);
        setField(term2128, term2128.getClass(), "namespaceMap", term2131);
        setField(term2128, term2128.getClass(), "reverseMap", term2136);
        setField(term2128, term2128.getClass(), "pointer", null);
        setBooleanField(term2128, term2128.getClass(), "sealed", false);
        setField(term2127, term2127.getClass(), "parent", term2128);
        setField(term2127, term2127.getClass(), "namespaceMap", term2142);
        setField(term2127, term2127.getClass(), "reverseMap", term2147);
        setField(term2127, term2127.getClass(), "pointer", null);
        setBooleanField(term2127, term2127.getClass(), "sealed", false);
        setField(term2126, term2126.getClass(), "parent", term2127);
        setField(term2126, term2126.getClass(), "namespaceMap", term2153);
        setField(term2126, term2126.getClass(), "reverseMap", term2158);
        setField(term2126, term2126.getClass(), "pointer", null);
        setBooleanField(term2126, term2126.getClass(), "sealed", false);
        setField(term2096, term2096.getClass(), "localNamespaceResolver", term2126);
        setIntField(term2096, term2096.getClass(), "index", 1622346318);
        setBooleanField(term2096, term2096.getClass(), "attribute", false);
        setField(term2166, term2166.getClass(), "parent", null);
        setField(term2166, term2166.getClass(), "namespaceMap", term2167);
        setField(term2166, term2166.getClass(), "reverseMap", term2172);
        setField(term2166, term2166.getClass(), "pointer", null);
        setBooleanField(term2166, term2166.getClass(), "sealed", false);
        setField(term2096, term2096.getClass(), "namespaceResolver", term2166);
        setField(term2096, term2096.getClass(), "exceptionHandler", null);
        setField(term2096, term2096.getClass(), "rootNode", null);
        setField(term2096, term2096.getClass(), "parent", null);
        setField(term2096, term2096.getClass(), "locale", null);
        term2178 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2178;
        try {
            callMethod(klass, "setValue", argTypes, term2096, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


