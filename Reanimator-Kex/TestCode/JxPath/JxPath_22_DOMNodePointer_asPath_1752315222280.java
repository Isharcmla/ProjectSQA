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

public class DOMNodePointer_asPath_1752315222280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69208;
     Object term69662;

    public DOMNodePointer_asPath_1752315222280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69208 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69298 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.ElementImpl"));
        setField(term69208, term69208.getClass(), "id", null);
        setField(term69208, term69208.getClass(), "parent", null);
        setShortField(term69298, term69298.getClass(), "nodeType", (short) 9);
        setField(term69208, term69208.getClass(), "node", term69298);
        term69662 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69663 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.ElementImpl"));
        setField(term69663, term69663.getClass(), "schemaDOM", null);
        setField(term69663, term69663.getClass(), "attrs", null);
        setIntField(term69663, term69663.getClass(), "row", 0);
        setIntField(term69663, term69663.getClass(), "col", 0);
        setIntField(term69663, term69663.getClass(), "parentRow", 0);
        setIntField(term69663, term69663.getClass(), "line", 0);
        setIntField(term69663, term69663.getClass(), "column", 0);
        setField(term69663, term69663.getClass(), "prefix", null);
        setField(term69663, term69663.getClass(), "localpart", null);
        setField(term69663, term69663.getClass(), "rawname", null);
        setField(term69663, term69663.getClass(), "uri", null);
        setShortField(term69663, term69663.getClass(), "nodeType", (short) 9);
        setBooleanField(term69663, term69663.getClass(), "hidden", false);
        setField(term69662, term69662.getClass(), "node", term69663);
        setField(term69662, term69662.getClass(), "namespaces", null);
        setField(term69662, term69662.getClass(), "defaultNamespace", null);
        setField(term69662, term69662.getClass(), "id", null);
        setField(term69662, term69662.getClass(), "localNamespaceResolver", null);
        setIntField(term69662, term69662.getClass(), "index", 0);
        setBooleanField(term69662, term69662.getClass(), "attribute", false);
        setField(term69662, term69662.getClass(), "namespaceResolver", null);
        setField(term69662, term69662.getClass(), "exceptionHandler", null);
        setField(term69662, term69662.getClass(), "rootNode", null);
        setField(term69662, term69662.getClass(), "parent", null);
        setField(term69662, term69662.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term69208, args);
        assertTrue(recursiveEquals(term69208, term69662));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


