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

public class DOMNodePointer_getName_1334210238239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59473;
     Object term59653;
     Object term59639;

    public DOMNodePointer_getName_1334210238239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59473 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59567 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setShortField(term59567, term59567.getClass(), "flags", (short) 0);
        setField(term59567, term59567.getClass(), "name", "");
        setField(term59473, term59473.getClass(), "node", term59567);
        term59653 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59654 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setField(term59654, term59654.getClass(), "name", "");
        setField(term59654, term59654.getClass(), "attributes", null);
        setField(term59654, term59654.getClass(), "ownerDocument", null);
        setField(term59654, term59654.getClass(), "firstChild", null);
        setField(term59654, term59654.getClass(), "fNodeListCache", null);
        setField(term59654, term59654.getClass(), "previousSibling", null);
        setField(term59654, term59654.getClass(), "nextSibling", null);
        setField(term59654, term59654.getClass(), "ownerNode", null);
        setShortField(term59654, term59654.getClass(), "flags", (short) 0);
        setField(term59653, term59653.getClass(), "node", term59654);
        setField(term59653, term59653.getClass(), "namespaces", null);
        setField(term59653, term59653.getClass(), "defaultNamespace", null);
        setField(term59653, term59653.getClass(), "id", null);
        setField(term59653, term59653.getClass(), "localNamespaceResolver", null);
        setIntField(term59653, term59653.getClass(), "index", 0);
        setBooleanField(term59653, term59653.getClass(), "attribute", false);
        setField(term59653, term59653.getClass(), "namespaceResolver", null);
        setField(term59653, term59653.getClass(), "exceptionHandler", null);
        setField(term59653, term59653.getClass(), "rootNode", null);
        setField(term59653, term59653.getClass(), "parent", null);
        setField(term59653, term59653.getClass(), "locale", null);
        term59639 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term59639, term59639.getClass(), "prefix", null);
        setField(term59639, term59639.getClass(), "name", "");
        setField(term59639, term59639.getClass(), "qualifiedName", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term59473, args);
        assertTrue(recursiveEquals(term59473, term59653));
        assertTrue(recursiveEquals(retValue, term59639));
    }

};


