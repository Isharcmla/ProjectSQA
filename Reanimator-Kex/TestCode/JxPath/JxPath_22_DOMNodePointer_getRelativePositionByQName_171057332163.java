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

public class DOMNodePointer_getRelativePositionByQName_171057332163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31826;
     Object term31923;

    public DOMNodePointer_getRelativePositionByQName_171057332163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31826 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term31908 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term31826, term31826.getClass(), "node", term31908);
        term31923 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term31924 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term31924, term31924.getClass(), "name", null);
        setField(term31924, term31924.getClass(), "entities", null);
        setField(term31924, term31924.getClass(), "notations", null);
        setField(term31924, term31924.getClass(), "elements", null);
        setField(term31924, term31924.getClass(), "publicID", null);
        setField(term31924, term31924.getClass(), "systemID", null);
        setField(term31924, term31924.getClass(), "internalSubset", null);
        setIntField(term31924, term31924.getClass(), "doctypeNumber", 0);
        setField(term31924, term31924.getClass(), "ownerDocument", null);
        setField(term31924, term31924.getClass(), "firstChild", null);
        setField(term31924, term31924.getClass(), "fNodeListCache", null);
        setField(term31924, term31924.getClass(), "previousSibling", null);
        setField(term31924, term31924.getClass(), "nextSibling", null);
        setField(term31924, term31924.getClass(), "ownerNode", null);
        setShortField(term31924, term31924.getClass(), "flags", (short) 0);
        setField(term31923, term31923.getClass(), "node", term31924);
        setField(term31923, term31923.getClass(), "namespaces", null);
        setField(term31923, term31923.getClass(), "defaultNamespace", null);
        setField(term31923, term31923.getClass(), "id", null);
        setField(term31923, term31923.getClass(), "localNamespaceResolver", null);
        setIntField(term31923, term31923.getClass(), "index", 0);
        setBooleanField(term31923, term31923.getClass(), "attribute", false);
        setField(term31923, term31923.getClass(), "namespaceResolver", null);
        setField(term31923, term31923.getClass(), "exceptionHandler", null);
        setField(term31923, term31923.getClass(), "rootNode", null);
        setField(term31923, term31923.getClass(), "parent", null);
        setField(term31923, term31923.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByQName", argTypes, term31826, args);
        assertTrue(recursiveEquals(term31826, term31923));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


