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

public class DOMNodePointer_getNamespaceURI_795756451209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47260;
     Object term48674;

    public DOMNodePointer_getNamespaceURI_795756451209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47260 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term47342 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term47260, term47260.getClass(), "defaultNamespace", null);
        setField(term47260, term47260.getClass(), "node", term47342);
        term48674 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48675 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term48675, term48675.getClass(), "data", null);
        setField(term48675, term48675.getClass(), "previousSibling", null);
        setField(term48675, term48675.getClass(), "nextSibling", null);
        setField(term48675, term48675.getClass(), "ownerNode", null);
        setShortField(term48675, term48675.getClass(), "flags", (short) 0);
        setField(term48674, term48674.getClass(), "node", term48675);
        setField(term48674, term48674.getClass(), "namespaces", null);
        setField(term48674, term48674.getClass(), "defaultNamespace", "");
        setField(term48674, term48674.getClass(), "id", null);
        setIntField(term48674, term48674.getClass(), "index", 0);
        setBooleanField(term48674, term48674.getClass(), "attribute", false);
        setField(term48674, term48674.getClass(), "rootNode", null);
        setField(term48674, term48674.getClass(), "namespaceResolver", null);
        setField(term48674, term48674.getClass(), "parent", null);
        setField(term48674, term48674.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term47260, args);
        assertTrue(recursiveEquals(term47260, term48674));
        assertTrue(recursiveEquals(retValue, null));
    }

};


