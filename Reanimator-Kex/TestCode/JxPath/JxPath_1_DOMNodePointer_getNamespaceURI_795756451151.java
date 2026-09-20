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

public class DOMNodePointer_getNamespaceURI_795756451151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26556;
     Object term26873;

    public DOMNodePointer_getNamespaceURI_795756451151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26556 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term26873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term26873, term26873.getClass(), "node", null);
        setField(term26873, term26873.getClass(), "namespaces", null);
        setField(term26873, term26873.getClass(), "defaultNamespace", null);
        setField(term26873, term26873.getClass(), "id", null);
        setIntField(term26873, term26873.getClass(), "index", 0);
        setBooleanField(term26873, term26873.getClass(), "attribute", false);
        setField(term26873, term26873.getClass(), "rootNode", null);
        setField(term26873, term26873.getClass(), "namespaceResolver", null);
        setField(term26873, term26873.getClass(), "parent", null);
        setField(term26873, term26873.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xmlns";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term26556, args);
        assertTrue(recursiveEquals(term26556, term26873));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/2000/xmlns/"));
    }

};
