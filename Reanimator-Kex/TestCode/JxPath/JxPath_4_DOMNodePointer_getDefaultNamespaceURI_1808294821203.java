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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48821;
     Object term48969;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48821 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48911 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term48821, term48821.getClass(), "defaultNamespace", null);
        setField(term48821, term48821.getClass(), "node", term48911);
        term48969 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48970 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term48970, term48970.getClass(), "fNodePool", null);
        setField(term48970, term48970.getClass(), "docType", null);
        setField(term48970, term48970.getClass(), "docElement", null);
        setField(term48970, term48970.getClass(), "fFreeNLCache", null);
        setField(term48970, term48970.getClass(), "encoding", null);
        setField(term48970, term48970.getClass(), "actualEncoding", null);
        setField(term48970, term48970.getClass(), "version", null);
        setBooleanField(term48970, term48970.getClass(), "standalone", false);
        setField(term48970, term48970.getClass(), "fDocumentURI", null);
        setField(term48970, term48970.getClass(), "userData", null);
        setField(term48970, term48970.getClass(), "identifiers", null);
        setField(term48970, term48970.getClass(), "domNormalizer", null);
        setField(term48970, term48970.getClass(), "fConfiguration", null);
        setIntField(term48970, term48970.getClass(), "changes", 0);
        setBooleanField(term48970, term48970.getClass(), "allowGrammarAccess", false);
        setBooleanField(term48970, term48970.getClass(), "errorChecking", false);
        setIntField(term48970, term48970.getClass(), "documentNumber", 0);
        setIntField(term48970, term48970.getClass(), "nodeCounter", 0);
        setField(term48970, term48970.getClass(), "nodeTable", null);
        setField(term48970, term48970.getClass(), "ownerDocument", null);
        setField(term48970, term48970.getClass(), "firstChild", null);
        setField(term48970, term48970.getClass(), "fNodeListCache", null);
        setField(term48970, term48970.getClass(), "previousSibling", null);
        setField(term48970, term48970.getClass(), "nextSibling", null);
        setField(term48970, term48970.getClass(), "ownerNode", null);
        setShortField(term48970, term48970.getClass(), "flags", (short) 0);
        setField(term48969, term48969.getClass(), "node", term48970);
        setField(term48969, term48969.getClass(), "namespaces", null);
        setField(term48969, term48969.getClass(), "defaultNamespace", "");
        setField(term48969, term48969.getClass(), "id", null);
        setIntField(term48969, term48969.getClass(), "index", 0);
        setBooleanField(term48969, term48969.getClass(), "attribute", false);
        setField(term48969, term48969.getClass(), "rootNode", null);
        setField(term48969, term48969.getClass(), "namespaceResolver", null);
        setField(term48969, term48969.getClass(), "parent", null);
        setField(term48969, term48969.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term48821, args);
        assertTrue(recursiveEquals(term48821, term48969));
        assertTrue(recursiveEquals(retValue, null));
    }

};


