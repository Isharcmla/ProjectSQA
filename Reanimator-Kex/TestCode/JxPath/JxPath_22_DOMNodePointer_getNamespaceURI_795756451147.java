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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27544;
     Object term28068;

    public DOMNodePointer_getNamespaceURI_795756451147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27592 = new HashMap();
        ((HashMap) term27592).put(" ", " ");
        term27544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27544, term27544.getClass(), "namespaces", term27592);
        HashMap term28069 = new HashMap();
        term28068 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term28068, term28068.getClass(), "node", null);
        setField(term28068, term28068.getClass(), "namespaces", term28069);
        setField(term28068, term28068.getClass(), "defaultNamespace", null);
        setField(term28068, term28068.getClass(), "id", null);
        setField(term28068, term28068.getClass(), "localNamespaceResolver", null);
        setIntField(term28068, term28068.getClass(), "index", 0);
        setBooleanField(term28068, term28068.getClass(), "attribute", false);
        setField(term28068, term28068.getClass(), "namespaceResolver", null);
        setField(term28068, term28068.getClass(), "exceptionHandler", null);
        setField(term28068, term28068.getClass(), "rootNode", null);
        setField(term28068, term28068.getClass(), "parent", null);
        setField(term28068, term28068.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term27544, args);
        assertTrue(recursiveEquals(term27544, term28068));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


