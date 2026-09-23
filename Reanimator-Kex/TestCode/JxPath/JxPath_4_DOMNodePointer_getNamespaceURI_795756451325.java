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

public class DOMNodePointer_getNamespaceURI_795756451325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101471;
     Object term101633;

    public DOMNodePointer_getNamespaceURI_795756451325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101471 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term101561 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term101471, term101471.getClass(), "defaultNamespace", null);
        setField(term101471, term101471.getClass(), "node", term101561);
        term101633 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term101634 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term101634, term101634.getClass(), "fNodePool", null);
        setField(term101634, term101634.getClass(), "docType", null);
        setField(term101634, term101634.getClass(), "docElement", null);
        setField(term101634, term101634.getClass(), "fFreeNLCache", null);
        setField(term101634, term101634.getClass(), "encoding", null);
        setField(term101634, term101634.getClass(), "actualEncoding", null);
        setField(term101634, term101634.getClass(), "version", null);
        setBooleanField(term101634, term101634.getClass(), "standalone", false);
        setField(term101634, term101634.getClass(), "fDocumentURI", null);
        setField(term101634, term101634.getClass(), "userData", null);
        setField(term101634, term101634.getClass(), "identifiers", null);
        setField(term101634, term101634.getClass(), "domNormalizer", null);
        setField(term101634, term101634.getClass(), "fConfiguration", null);
        setIntField(term101634, term101634.getClass(), "changes", 0);
        setBooleanField(term101634, term101634.getClass(), "allowGrammarAccess", false);
        setBooleanField(term101634, term101634.getClass(), "errorChecking", false);
        setIntField(term101634, term101634.getClass(), "documentNumber", 0);
        setIntField(term101634, term101634.getClass(), "nodeCounter", 0);
        setField(term101634, term101634.getClass(), "nodeTable", null);
        setField(term101634, term101634.getClass(), "ownerDocument", null);
        setField(term101634, term101634.getClass(), "firstChild", null);
        setField(term101634, term101634.getClass(), "fNodeListCache", null);
        setField(term101634, term101634.getClass(), "previousSibling", null);
        setField(term101634, term101634.getClass(), "nextSibling", null);
        setField(term101634, term101634.getClass(), "ownerNode", null);
        setShortField(term101634, term101634.getClass(), "flags", (short) 0);
        setField(term101633, term101633.getClass(), "node", term101634);
        setField(term101633, term101633.getClass(), "namespaces", null);
        setField(term101633, term101633.getClass(), "defaultNamespace", "");
        setField(term101633, term101633.getClass(), "id", null);
        setIntField(term101633, term101633.getClass(), "index", 0);
        setBooleanField(term101633, term101633.getClass(), "attribute", false);
        setField(term101633, term101633.getClass(), "rootNode", null);
        setField(term101633, term101633.getClass(), "namespaceResolver", null);
        setField(term101633, term101633.getClass(), "parent", null);
        setField(term101633, term101633.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term101471, args);
        assertTrue(recursiveEquals(term101471, term101633));
        assertTrue(recursiveEquals(retValue, null));
    }

};


