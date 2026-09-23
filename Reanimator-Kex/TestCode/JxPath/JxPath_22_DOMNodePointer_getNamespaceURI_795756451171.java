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

public class DOMNodePointer_getNamespaceURI_795756451171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33110;
     Object term33163;

    public DOMNodePointer_getNamespaceURI_795756451171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33110 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term33163 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term33163, term33163.getClass(), "node", null);
        setField(term33163, term33163.getClass(), "namespaces", null);
        setField(term33163, term33163.getClass(), "defaultNamespace", "");
        setField(term33163, term33163.getClass(), "id", null);
        setField(term33163, term33163.getClass(), "localNamespaceResolver", null);
        setIntField(term33163, term33163.getClass(), "index", 0);
        setBooleanField(term33163, term33163.getClass(), "attribute", false);
        setField(term33163, term33163.getClass(), "namespaceResolver", null);
        setField(term33163, term33163.getClass(), "exceptionHandler", null);
        setField(term33163, term33163.getClass(), "rootNode", null);
        setField(term33163, term33163.getClass(), "parent", null);
        setField(term33163, term33163.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term33110, args);
        assertTrue(recursiveEquals(term33110, term33163));
        assertTrue(recursiveEquals(retValue, null));
    }

};


