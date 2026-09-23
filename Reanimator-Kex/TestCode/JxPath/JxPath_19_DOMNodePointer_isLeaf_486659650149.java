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

public class DOMNodePointer_isLeaf_486659650149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27803;
     Object term28678;

    public DOMNodePointer_isLeaf_486659650149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27803 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term27889 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        setField(term27803, term27803.getClass(), "node", term27889);
        term28678 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28679 = newInstance(Class.forName("org.apache.html.dom.HTMLOListElementImpl"));
        setField(term28679, term28679.getClass(), "name", null);
        setField(term28679, term28679.getClass(), "attributes", null);
        setField(term28679, term28679.getClass(), "ownerDocument", null);
        setField(term28679, term28679.getClass(), "firstChild", null);
        setField(term28679, term28679.getClass(), "fNodeListCache", null);
        setField(term28679, term28679.getClass(), "previousSibling", null);
        setField(term28679, term28679.getClass(), "nextSibling", null);
        setField(term28679, term28679.getClass(), "ownerNode", null);
        setShortField(term28679, term28679.getClass(), "flags", (short) 0);
        setField(term28678, term28678.getClass(), "node", term28679);
        setField(term28678, term28678.getClass(), "namespaces", null);
        setField(term28678, term28678.getClass(), "defaultNamespace", null);
        setField(term28678, term28678.getClass(), "id", null);
        setField(term28678, term28678.getClass(), "localNamespaceResolver", null);
        setIntField(term28678, term28678.getClass(), "index", 0);
        setBooleanField(term28678, term28678.getClass(), "attribute", false);
        setField(term28678, term28678.getClass(), "namespaceResolver", null);
        setField(term28678, term28678.getClass(), "rootNode", null);
        setField(term28678, term28678.getClass(), "parent", null);
        setField(term28678, term28678.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term27803, args);
        assertTrue(recursiveEquals(term27803, term28678));
        assertTrue(recursiveEquals(retValue, true));
    }

};


