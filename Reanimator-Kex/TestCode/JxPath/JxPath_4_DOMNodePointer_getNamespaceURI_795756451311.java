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

public class DOMNodePointer_getNamespaceURI_795756451311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96476;
     Object term96597;

    public DOMNodePointer_getNamespaceURI_795756451311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96476 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96566 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term96476, term96476.getClass(), "defaultNamespace", null);
        setField(term96476, term96476.getClass(), "node", term96566);
        term96597 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term96598 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term96598, term96598.getClass(), "fNodePool", null);
        setField(term96598, term96598.getClass(), "docType", null);
        setField(term96598, term96598.getClass(), "docElement", null);
        setField(term96598, term96598.getClass(), "fFreeNLCache", null);
        setField(term96598, term96598.getClass(), "encoding", null);
        setField(term96598, term96598.getClass(), "actualEncoding", null);
        setField(term96598, term96598.getClass(), "version", null);
        setBooleanField(term96598, term96598.getClass(), "standalone", false);
        setField(term96598, term96598.getClass(), "fDocumentURI", null);
        setField(term96598, term96598.getClass(), "userData", null);
        setField(term96598, term96598.getClass(), "identifiers", null);
        setField(term96598, term96598.getClass(), "domNormalizer", null);
        setField(term96598, term96598.getClass(), "fConfiguration", null);
        setIntField(term96598, term96598.getClass(), "changes", 0);
        setBooleanField(term96598, term96598.getClass(), "allowGrammarAccess", false);
        setBooleanField(term96598, term96598.getClass(), "errorChecking", false);
        setIntField(term96598, term96598.getClass(), "documentNumber", 0);
        setIntField(term96598, term96598.getClass(), "nodeCounter", 0);
        setField(term96598, term96598.getClass(), "nodeTable", null);
        setField(term96598, term96598.getClass(), "ownerDocument", null);
        setField(term96598, term96598.getClass(), "firstChild", null);
        setField(term96598, term96598.getClass(), "fNodeListCache", null);
        setField(term96598, term96598.getClass(), "previousSibling", null);
        setField(term96598, term96598.getClass(), "nextSibling", null);
        setField(term96598, term96598.getClass(), "ownerNode", null);
        setShortField(term96598, term96598.getClass(), "flags", (short) 0);
        setField(term96597, term96597.getClass(), "node", term96598);
        setField(term96597, term96597.getClass(), "namespaces", null);
        setField(term96597, term96597.getClass(), "defaultNamespace", "");
        setField(term96597, term96597.getClass(), "id", null);
        setIntField(term96597, term96597.getClass(), "index", 0);
        setBooleanField(term96597, term96597.getClass(), "attribute", false);
        setField(term96597, term96597.getClass(), "rootNode", null);
        setField(term96597, term96597.getClass(), "namespaceResolver", null);
        setField(term96597, term96597.getClass(), "parent", null);
        setField(term96597, term96597.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term96476, args);
        assertTrue(recursiveEquals(term96476, term96597));
        assertTrue(recursiveEquals(retValue, null));
    }

};


