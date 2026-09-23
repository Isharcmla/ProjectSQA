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
import org.apache.commons.jxpath.JXPathException;
import static org.apache.commons.jxpath.ri.model.dom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class DOMNodePointer_createAttribute_14964584068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2198;
     Object term2269;

    public DOMNodePointer_createAttribute_14964584068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2199 = new HashMap();
        HashMap term2236 = new HashMap();
        HashMap term2241 = new HashMap();
        HashMap term2247 = new HashMap();
        HashMap term2252 = new HashMap();
        HashMap term2258 = new HashMap();
        HashMap term2263 = new HashMap();
        term2198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2230 = newInstance(Class.forName("java.lang.Object"));
        Object term2231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2234 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2198, term2198.getClass(), "node", null);
        setField(term2198, term2198.getClass(), "namespaces", term2199);
        setField(term2198, term2198.getClass(), "defaultNamespace", "YRHGsAkhxb");
        setField(term2198, term2198.getClass(), "id", "ffYhPOzlUs");
        setIntField(term2198, term2198.getClass(), "index", -2068769794);
        setBooleanField(term2198, term2198.getClass(), "attribute", true);
        setField(term2198, term2198.getClass(), "rootNode", term2230);
        setField(term2234, term2234.getClass(), "parent", null);
        setField(term2234, term2234.getClass(), "namespaceMap", null);
        setField(term2234, term2234.getClass(), "reverseMap", null);
        setField(term2234, term2234.getClass(), "pointer", null);
        setField(term2234, term2234.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2234, term2234.getClass(), "sealed", false);
        setField(term2233, term2233.getClass(), "parent", term2234);
        setField(term2233, term2233.getClass(), "namespaceMap", term2236);
        setField(term2233, term2233.getClass(), "reverseMap", term2241);
        setField(term2233, term2233.getClass(), "pointer", null);
        setField(term2233, term2233.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2233, term2233.getClass(), "sealed", false);
        setField(term2232, term2232.getClass(), "parent", term2233);
        setField(term2232, term2232.getClass(), "namespaceMap", term2247);
        setField(term2232, term2232.getClass(), "reverseMap", term2252);
        setField(term2232, term2232.getClass(), "pointer", null);
        setField(term2232, term2232.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2232, term2232.getClass(), "sealed", false);
        setField(term2231, term2231.getClass(), "parent", term2232);
        setField(term2231, term2231.getClass(), "namespaceMap", term2258);
        setField(term2231, term2231.getClass(), "reverseMap", term2263);
        setField(term2231, term2231.getClass(), "pointer", null);
        setField(term2231, term2231.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2231, term2231.getClass(), "sealed", false);
        setField(term2198, term2198.getClass(), "namespaceResolver", term2231);
        setField(term2198, term2198.getClass(), "parent", null);
        setField(term2198, term2198.getClass(), "locale", null);
        term2269 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2269, term2269.getClass(), "prefix", "MLqYREekMl");
        setField(term2269, term2269.getClass(), "name", "ytSBIKXogI");
        setField(term2269, term2269.getClass(), "qualifiedName", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2269;
        try {
            callMethod(klass, "createAttribute", argTypes, term2198, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};


