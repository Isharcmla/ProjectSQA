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

public class DOMNodePointer_getNamespaceURI_795756451236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51486;
     Object term52177;

    public DOMNodePointer_getNamespaceURI_795756451236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51486 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51576 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term51648 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term51486, term51486.getClass(), "defaultNamespace", null);
        setShortField(term51576, term51576.getClass(), "flags", (short) 0);
        setField(term51576, term51576.getClass(), "docElement", term51648);
        setField(term51486, term51486.getClass(), "node", term51576);
        term52177 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52178 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term52179 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term52178, term52178.getClass(), "fNodePool", null);
        setField(term52178, term52178.getClass(), "docType", null);
        setField(term52179, term52179.getClass(), "name", null);
        setField(term52179, term52179.getClass(), "attributes", null);
        setField(term52179, term52179.getClass(), "ownerDocument", null);
        setField(term52179, term52179.getClass(), "firstChild", null);
        setField(term52179, term52179.getClass(), "fNodeListCache", null);
        setField(term52179, term52179.getClass(), "previousSibling", null);
        setField(term52179, term52179.getClass(), "nextSibling", null);
        setField(term52179, term52179.getClass(), "ownerNode", null);
        setShortField(term52179, term52179.getClass(), "flags", (short) 0);
        setField(term52178, term52178.getClass(), "docElement", term52179);
        setField(term52178, term52178.getClass(), "fFreeNLCache", null);
        setField(term52178, term52178.getClass(), "encoding", null);
        setField(term52178, term52178.getClass(), "actualEncoding", null);
        setField(term52178, term52178.getClass(), "version", null);
        setBooleanField(term52178, term52178.getClass(), "standalone", false);
        setField(term52178, term52178.getClass(), "fDocumentURI", null);
        setField(term52178, term52178.getClass(), "userData", null);
        setField(term52178, term52178.getClass(), "identifiers", null);
        setField(term52178, term52178.getClass(), "domNormalizer", null);
        setField(term52178, term52178.getClass(), "fConfiguration", null);
        setIntField(term52178, term52178.getClass(), "changes", 0);
        setBooleanField(term52178, term52178.getClass(), "allowGrammarAccess", false);
        setBooleanField(term52178, term52178.getClass(), "errorChecking", false);
        setIntField(term52178, term52178.getClass(), "documentNumber", 0);
        setIntField(term52178, term52178.getClass(), "nodeCounter", 0);
        setField(term52178, term52178.getClass(), "nodeTable", null);
        setField(term52178, term52178.getClass(), "ownerDocument", null);
        setField(term52178, term52178.getClass(), "firstChild", null);
        setField(term52178, term52178.getClass(), "fNodeListCache", null);
        setField(term52178, term52178.getClass(), "previousSibling", null);
        setField(term52178, term52178.getClass(), "nextSibling", null);
        setField(term52178, term52178.getClass(), "ownerNode", null);
        setShortField(term52178, term52178.getClass(), "flags", (short) 0);
        setField(term52177, term52177.getClass(), "node", term52178);
        setField(term52177, term52177.getClass(), "namespaces", null);
        setField(term52177, term52177.getClass(), "defaultNamespace", "");
        setField(term52177, term52177.getClass(), "id", null);
        setField(term52177, term52177.getClass(), "localNamespaceResolver", null);
        setIntField(term52177, term52177.getClass(), "index", 0);
        setBooleanField(term52177, term52177.getClass(), "attribute", false);
        setField(term52177, term52177.getClass(), "namespaceResolver", null);
        setField(term52177, term52177.getClass(), "rootNode", null);
        setField(term52177, term52177.getClass(), "parent", null);
        setField(term52177, term52177.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term51486, args);
        assertTrue(recursiveEquals(term51486, term52177));
        assertTrue(recursiveEquals(retValue, null));
    }

};


