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

public class DOMNodePointer_getNamespaceURI_795756451191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40382;
     Object term40749;

    public DOMNodePointer_getNamespaceURI_795756451191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40382 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40464 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term40382, term40382.getClass(), "defaultNamespace", null);
        setField(term40382, term40382.getClass(), "node", term40464);
        term40749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term40750 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term40750, term40750.getClass(), "docType", null);
        setField(term40750, term40750.getClass(), "docElement", null);
        setField(term40750, term40750.getClass(), "fFreeNLCache", null);
        setField(term40750, term40750.getClass(), "encoding", null);
        setField(term40750, term40750.getClass(), "actualEncoding", null);
        setField(term40750, term40750.getClass(), "version", null);
        setBooleanField(term40750, term40750.getClass(), "standalone", false);
        setField(term40750, term40750.getClass(), "fDocumentURI", null);
        setField(term40750, term40750.getClass(), "userData", null);
        setField(term40750, term40750.getClass(), "identifiers", null);
        setField(term40750, term40750.getClass(), "domNormalizer", null);
        setField(term40750, term40750.getClass(), "fConfiguration", null);
        setIntField(term40750, term40750.getClass(), "changes", 0);
        setBooleanField(term40750, term40750.getClass(), "allowGrammarAccess", false);
        setBooleanField(term40750, term40750.getClass(), "errorChecking", false);
        setIntField(term40750, term40750.getClass(), "documentNumber", 0);
        setIntField(term40750, term40750.getClass(), "nodeCounter", 0);
        setField(term40750, term40750.getClass(), "nodeTable", null);
        setField(term40750, term40750.getClass(), "ownerDocument", null);
        setField(term40750, term40750.getClass(), "firstChild", null);
        setField(term40750, term40750.getClass(), "fNodeListCache", null);
        setField(term40750, term40750.getClass(), "previousSibling", null);
        setField(term40750, term40750.getClass(), "nextSibling", null);
        setField(term40750, term40750.getClass(), "ownerNode", null);
        setShortField(term40750, term40750.getClass(), "flags", (short) 0);
        setField(term40749, term40749.getClass(), "node", term40750);
        setField(term40749, term40749.getClass(), "namespaces", null);
        setField(term40749, term40749.getClass(), "defaultNamespace", "");
        setField(term40749, term40749.getClass(), "id", null);
        setIntField(term40749, term40749.getClass(), "index", 0);
        setBooleanField(term40749, term40749.getClass(), "attribute", false);
        setField(term40749, term40749.getClass(), "rootNode", null);
        setField(term40749, term40749.getClass(), "namespaceResolver", null);
        setField(term40749, term40749.getClass(), "parent", null);
        setField(term40749, term40749.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term40382, args);
        assertTrue(recursiveEquals(term40382, term40749));
        assertTrue(recursiveEquals(retValue, null));
    }

};


