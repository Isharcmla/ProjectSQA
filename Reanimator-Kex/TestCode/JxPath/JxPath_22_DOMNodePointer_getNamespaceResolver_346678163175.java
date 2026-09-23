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
import java.lang.Object;
import java.util.HashMap;

public class DOMNodePointer_getNamespaceResolver_346678163175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33607;
     Object term33934;
     Object term33893;

    public DOMNodePointer_getNamespaceResolver_346678163175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term33607, term33607.getClass(), "localNamespaceResolver", null);
        HashMap term33936 = new HashMap();
        HashMap term33937 = new HashMap();
        term33934 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33935 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        setField(term33934, term33934.getClass(), "node", null);
        setField(term33934, term33934.getClass(), "namespaces", null);
        setField(term33934, term33934.getClass(), "defaultNamespace", null);
        setField(term33934, term33934.getClass(), "id", null);
        setField(term33935, term33935.getClass(), "parent", null);
        setField(term33935, term33935.getClass(), "namespaceMap", term33936);
        setField(term33935, term33935.getClass(), "reverseMap", term33937);
        setField(term33935, term33935.getClass(), "pointer", term33934);
        setBooleanField(term33935, term33935.getClass(), "sealed", false);
        setField(term33934, term33934.getClass(), "localNamespaceResolver", term33935);
        setIntField(term33934, term33934.getClass(), "index", 0);
        setBooleanField(term33934, term33934.getClass(), "attribute", false);
        setField(term33934, term33934.getClass(), "namespaceResolver", null);
        setField(term33934, term33934.getClass(), "exceptionHandler", null);
        setField(term33934, term33934.getClass(), "rootNode", null);
        setField(term33934, term33934.getClass(), "parent", null);
        setField(term33934, term33934.getClass(), "locale", null);
        HashMap term33894 = new HashMap();
        HashMap term33899 = new HashMap();
        term33893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.NamespaceResolver"));
        Object term33892 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term33893, term33893.getClass(), "parent", null);
        setField(term33893, term33893.getClass(), "namespaceMap", term33894);
        setField(term33893, term33893.getClass(), "reverseMap", term33899);
        setField(term33892, term33892.getClass(), "node", null);
        setField(term33892, term33892.getClass(), "namespaces", null);
        setField(term33892, term33892.getClass(), "defaultNamespace", null);
        setField(term33892, term33892.getClass(), "id", null);
        setField(term33892, term33892.getClass(), "localNamespaceResolver", term33893);
        setIntField(term33892, term33892.getClass(), "index", 0);
        setBooleanField(term33892, term33892.getClass(), "attribute", false);
        setField(term33892, term33892.getClass(), "namespaceResolver", null);
        setField(term33892, term33892.getClass(), "exceptionHandler", null);
        setField(term33892, term33892.getClass(), "rootNode", null);
        setField(term33892, term33892.getClass(), "parent", null);
        setField(term33892, term33892.getClass(), "locale", null);
        setField(term33893, term33893.getClass(), "pointer", term33892);
        setBooleanField(term33893, term33893.getClass(), "sealed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceResolver", argTypes, term33607, args);
        assertTrue(recursiveEquals(term33607, term33934));
        assertTrue(recursiveEquals(retValue, term33893));
    }

};


