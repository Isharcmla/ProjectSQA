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
     Object term2132;
     Object term2203;

    public DOMNodePointer_createAttribute_14964584068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2133 = new HashMap();
        HashMap term2170 = new HashMap();
        HashMap term2175 = new HashMap();
        HashMap term2181 = new HashMap();
        HashMap term2186 = new HashMap();
        HashMap term2192 = new HashMap();
        HashMap term2197 = new HashMap();
        term2132 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term2164 = newInstance(Class.forName("java.lang.Object"));
        Object term2165 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2166 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term2168 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term2132, term2132.getClass(), "node", null);
        setField(term2132, term2132.getClass(), "namespaces", term2133);
        setField(term2132, term2132.getClass(), "defaultNamespace", "UoYtihxVaS");
        setField(term2132, term2132.getClass(), "id", "JDswTTCZHV");
        setIntField(term2132, term2132.getClass(), "index", -2068769794);
        setBooleanField(term2132, term2132.getClass(), "attribute", true);
        setField(term2132, term2132.getClass(), "rootNode", term2164);
        setField(term2168, term2168.getClass(), "parent", null);
        setField(term2168, term2168.getClass(), "namespaceMap", null);
        setField(term2168, term2168.getClass(), "reverseMap", null);
        setField(term2168, term2168.getClass(), "pointer", null);
        setField(term2168, term2168.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2168, term2168.getClass(), "sealed", false);
        setField(term2167, term2167.getClass(), "parent", term2168);
        setField(term2167, term2167.getClass(), "namespaceMap", term2170);
        setField(term2167, term2167.getClass(), "reverseMap", term2175);
        setField(term2167, term2167.getClass(), "pointer", null);
        setField(term2167, term2167.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2167, term2167.getClass(), "sealed", false);
        setField(term2166, term2166.getClass(), "parent", term2167);
        setField(term2166, term2166.getClass(), "namespaceMap", term2181);
        setField(term2166, term2166.getClass(), "reverseMap", term2186);
        setField(term2166, term2166.getClass(), "pointer", null);
        setField(term2166, term2166.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2166, term2166.getClass(), "sealed", false);
        setField(term2165, term2165.getClass(), "parent", term2166);
        setField(term2165, term2165.getClass(), "namespaceMap", term2192);
        setField(term2165, term2165.getClass(), "reverseMap", term2197);
        setField(term2165, term2165.getClass(), "pointer", null);
        setField(term2165, term2165.getClass(), "defaultNamespaceURI", null);
        setBooleanField(term2165, term2165.getClass(), "sealed", false);
        setField(term2132, term2132.getClass(), "namespaceResolver", term2165);
        setField(term2132, term2132.getClass(), "parent", null);
        setField(term2132, term2132.getClass(), "locale", null);
        term2203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term2203, term2203.getClass(), "prefix", "onpbIeEKoi");
        setField(term2203, term2203.getClass(), "name", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2203;
        try {
            callMethod(klass, "createAttribute", argTypes, term2132, args);
            assertTrue(false);
        }
        catch (JXPathException e) {
        }

    }

};
