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

public class DOMNodePointer_getName_133421023851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public DOMNodePointer_getName_133421023851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term202 = new HashMap();
        HashMap term236 = new HashMap();
        HashMap term241 = new HashMap();
        HashMap term247 = new HashMap();
        HashMap term252 = new HashMap();
        HashMap term258 = new HashMap();
        HashMap term263 = new HashMap();
        HashMap term273 = new HashMap();
        term201 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term231 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term232 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term233 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term234 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term271 = newInstance(Class.forName("java.lang.Object"));
        Object term272 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term201, term201.getClass(), "node", null);
        setField(term201, term201.getClass(), "namespaces", term202);
        setField(term201, term201.getClass(), "defaultNamespace", "EGtDIRbSSb");
        setField(term201, term201.getClass(), "id", "SzjVpOQTyS");
        setField(term234, term234.getClass(), "parent", null);
        setField(term234, term234.getClass(), "namespaceMap", null);
        setField(term234, term234.getClass(), "reverseMap", null);
        setField(term234, term234.getClass(), "pointer", null);
        setBooleanField(term234, term234.getClass(), "sealed", false);
        setField(term233, term233.getClass(), "parent", term234);
        setField(term233, term233.getClass(), "namespaceMap", term236);
        setField(term233, term233.getClass(), "reverseMap", term241);
        setField(term233, term233.getClass(), "pointer", null);
        setBooleanField(term233, term233.getClass(), "sealed", false);
        setField(term232, term232.getClass(), "parent", term233);
        setField(term232, term232.getClass(), "namespaceMap", term247);
        setField(term232, term232.getClass(), "reverseMap", term252);
        setField(term232, term232.getClass(), "pointer", null);
        setBooleanField(term232, term232.getClass(), "sealed", false);
        setField(term231, term231.getClass(), "parent", term232);
        setField(term231, term231.getClass(), "namespaceMap", term258);
        setField(term231, term231.getClass(), "reverseMap", term263);
        setField(term231, term231.getClass(), "pointer", null);
        setBooleanField(term231, term231.getClass(), "sealed", false);
        setField(term201, term201.getClass(), "localNamespaceResolver", term231);
        setIntField(term201, term201.getClass(), "index", 1162663216);
        setBooleanField(term201, term201.getClass(), "attribute", false);
        setField(term201, term201.getClass(), "rootNode", term271);
        setField(term272, term272.getClass(), "parent", null);
        setField(term272, term272.getClass(), "namespaceMap", term273);
        setField(term272, term272.getClass(), "reverseMap", null);
        setField(term272, term272.getClass(), "pointer", null);
        setBooleanField(term272, term272.getClass(), "sealed", false);
        setField(term201, term201.getClass(), "namespaceResolver", term272);
        setField(term201, term201.getClass(), "parent", null);
        setField(term201, term201.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getName", argTypes, term201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


