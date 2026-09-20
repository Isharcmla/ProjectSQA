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

public class DOMNodePointer_remove_41018104269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;

    public DOMNodePointer_remove_41018104269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2269 = new HashMap();
        HashMap term2306 = new HashMap();
        HashMap term2311 = new HashMap();
        HashMap term2317 = new HashMap();
        HashMap term2322 = new HashMap();
        HashMap term2328 = new HashMap();
        HashMap term2333 = new HashMap();
        term2268 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2300 = newInstance(Class.forName("java.lang.Object"));
        Object term2301 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2302 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2303 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2268, term2268.getClass(), "node", null);
        setField(term2268, term2268.getClass(), "namespaces", term2269);
        setField(term2268, term2268.getClass(), "defaultNamespace", "ffYhPOzlUs");
        setField(term2268, term2268.getClass(), "id", "MLqYREekMl");
        setIntField(term2268, term2268.getClass(), "index", -117576464);
        setBooleanField(term2268, term2268.getClass(), "attribute", true);
        setField(term2268, term2268.getClass(), "rootNode", term2300);
        setField(term2304, term2304.getClass(), "parent", null);
        setField(term2304, term2304.getClass(), "namespaceMap", null);
        setField(term2304, term2304.getClass(), "reverseMap", null);
        setField(term2304, term2304.getClass(), "pointer", null);
        setField(term2304, term2304.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2304, term2304.getClass(), "sealed", false);
        setField(term2303, term2303.getClass(), "parent", term2304);
        setField(term2303, term2303.getClass(), "namespaceMap", term2306);
        setField(term2303, term2303.getClass(), "reverseMap", term2311);
        setField(term2303, term2303.getClass(), "pointer", null);
        setField(term2303, term2303.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2303, term2303.getClass(), "sealed", false);
        setField(term2302, term2302.getClass(), "parent", term2303);
        setField(term2302, term2302.getClass(), "namespaceMap", term2317);
        setField(term2302, term2302.getClass(), "reverseMap", term2322);
        setField(term2302, term2302.getClass(), "pointer", null);
        setField(term2302, term2302.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2302, term2302.getClass(), "sealed", false);
        setField(term2301, term2301.getClass(), "parent", term2302);
        setField(term2301, term2301.getClass(), "namespaceMap", term2328);
        setField(term2301, term2301.getClass(), "reverseMap", term2333);
        setField(term2301, term2301.getClass(), "pointer", null);
        setField(term2301, term2301.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2301, term2301.getClass(), "sealed", false);
        setField(term2268, term2268.getClass(), "namespaceResolver", term2301);
        setField(term2268, term2268.getClass(), "parent", null);
        setField(term2268, term2268.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "remove", argTypes, term2268, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
