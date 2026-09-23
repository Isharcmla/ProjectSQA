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

public class DOMNodePointer_setValue_9683547667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2114;
     Object term2197;

    public DOMNodePointer_setValue_9683547667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2115 = new HashMap();
        HashMap term2149 = new HashMap();
        HashMap term2154 = new HashMap();
        HashMap term2160 = new HashMap();
        HashMap term2165 = new HashMap();
        HashMap term2171 = new HashMap();
        HashMap term2176 = new HashMap();
        HashMap term2185 = new HashMap();
        HashMap term2190 = new HashMap();
        term2114 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2144 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2145 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2146 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2147 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2196 = newInstance(Class.forName("java.lang.Object"));
        setField(term2114, term2114.getClass(), "node", null);
        setField(term2114, term2114.getClass(), "namespaces", term2115);
        setField(term2114, term2114.getClass(), "defaultNamespace", "tShwQLRGNe");
        setField(term2114, term2114.getClass(), "id", "LvtrsXUliU");
        setField(term2147, term2147.getClass(), "parent", null);
        setField(term2147, term2147.getClass(), "namespaceMap", null);
        setField(term2147, term2147.getClass(), "reverseMap", null);
        setField(term2147, term2147.getClass(), "pointer", null);
        setBooleanField(term2147, term2147.getClass(), "sealed", false);
        setField(term2146, term2146.getClass(), "parent", term2147);
        setField(term2146, term2146.getClass(), "namespaceMap", term2149);
        setField(term2146, term2146.getClass(), "reverseMap", term2154);
        setField(term2146, term2146.getClass(), "pointer", null);
        setBooleanField(term2146, term2146.getClass(), "sealed", false);
        setField(term2145, term2145.getClass(), "parent", term2146);
        setField(term2145, term2145.getClass(), "namespaceMap", term2160);
        setField(term2145, term2145.getClass(), "reverseMap", term2165);
        setField(term2145, term2145.getClass(), "pointer", null);
        setBooleanField(term2145, term2145.getClass(), "sealed", false);
        setField(term2144, term2144.getClass(), "parent", term2145);
        setField(term2144, term2144.getClass(), "namespaceMap", term2171);
        setField(term2144, term2144.getClass(), "reverseMap", term2176);
        setField(term2144, term2144.getClass(), "pointer", null);
        setBooleanField(term2144, term2144.getClass(), "sealed", false);
        setField(term2114, term2114.getClass(), "localNamespaceResolver", term2144);
        setIntField(term2114, term2114.getClass(), "index", 1622346318);
        setBooleanField(term2114, term2114.getClass(), "attribute", false);
        setField(term2184, term2184.getClass(), "parent", null);
        setField(term2184, term2184.getClass(), "namespaceMap", term2185);
        setField(term2184, term2184.getClass(), "reverseMap", term2190);
        setField(term2184, term2184.getClass(), "pointer", null);
        setBooleanField(term2184, term2184.getClass(), "sealed", false);
        setField(term2114, term2114.getClass(), "namespaceResolver", term2184);
        setField(term2114, term2114.getClass(), "rootNode", term2196);
        setField(term2114, term2114.getClass(), "parent", null);
        setField(term2114, term2114.getClass(), "locale", null);
        term2197 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2197;
        try {
            callMethod(klass, "setValue", argTypes, term2114, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


