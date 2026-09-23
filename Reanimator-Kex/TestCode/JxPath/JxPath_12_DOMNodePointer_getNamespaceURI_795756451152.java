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

public class DOMNodePointer_getNamespaceURI_795756451152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24641;
     Object term25997;

    public DOMNodePointer_getNamespaceURI_795756451152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24641 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term25997 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term25997, term25997.getClass(), "node", null);
        setField(term25997, term25997.getClass(), "namespaces", null);
        setField(term25997, term25997.getClass(), "defaultNamespace", null);
        setField(term25997, term25997.getClass(), "id", null);
        setIntField(term25997, term25997.getClass(), "index", 0);
        setBooleanField(term25997, term25997.getClass(), "attribute", false);
        setField(term25997, term25997.getClass(), "rootNode", null);
        setField(term25997, term25997.getClass(), "namespaceResolver", null);
        setField(term25997, term25997.getClass(), "parent", null);
        setField(term25997, term25997.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xmlns";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term24641, args);
        assertTrue(recursiveEquals(term24641, term25997));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/2000/xmlns/"));
    }

};


