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

public class DOMNodePointer_getNamespaceURI_795756451259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69184;
     Object term69446;

    public DOMNodePointer_getNamespaceURI_795756451259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69184 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69274 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term69346 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term69184, term69184.getClass(), "defaultNamespace", null);
        setShortField(term69274, term69274.getClass(), "flags", (short) 0);
        setField(term69274, term69274.getClass(), "docElement", term69346);
        setField(term69184, term69184.getClass(), "node", term69274);
        term69446 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term69447 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term69448 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term69447, term69447.getClass(), "fNodePool", null);
        setField(term69447, term69447.getClass(), "docType", null);
        setField(term69448, term69448.getClass(), "name", null);
        setField(term69448, term69448.getClass(), "attributes", null);
        setField(term69448, term69448.getClass(), "ownerDocument", null);
        setField(term69448, term69448.getClass(), "firstChild", null);
        setField(term69448, term69448.getClass(), "fNodeListCache", null);
        setField(term69448, term69448.getClass(), "previousSibling", null);
        setField(term69448, term69448.getClass(), "nextSibling", null);
        setField(term69448, term69448.getClass(), "ownerNode", null);
        setShortField(term69448, term69448.getClass(), "flags", (short) 0);
        setField(term69447, term69447.getClass(), "docElement", term69448);
        setField(term69447, term69447.getClass(), "fFreeNLCache", null);
        setField(term69447, term69447.getClass(), "encoding", null);
        setField(term69447, term69447.getClass(), "actualEncoding", null);
        setField(term69447, term69447.getClass(), "version", null);
        setBooleanField(term69447, term69447.getClass(), "standalone", false);
        setField(term69447, term69447.getClass(), "fDocumentURI", null);
        setField(term69447, term69447.getClass(), "userData", null);
        setField(term69447, term69447.getClass(), "identifiers", null);
        setField(term69447, term69447.getClass(), "domNormalizer", null);
        setField(term69447, term69447.getClass(), "fConfiguration", null);
        setIntField(term69447, term69447.getClass(), "changes", 0);
        setBooleanField(term69447, term69447.getClass(), "allowGrammarAccess", false);
        setBooleanField(term69447, term69447.getClass(), "errorChecking", false);
        setIntField(term69447, term69447.getClass(), "documentNumber", 0);
        setIntField(term69447, term69447.getClass(), "nodeCounter", 0);
        setField(term69447, term69447.getClass(), "nodeTable", null);
        setField(term69447, term69447.getClass(), "ownerDocument", null);
        setField(term69447, term69447.getClass(), "firstChild", null);
        setField(term69447, term69447.getClass(), "fNodeListCache", null);
        setField(term69447, term69447.getClass(), "previousSibling", null);
        setField(term69447, term69447.getClass(), "nextSibling", null);
        setField(term69447, term69447.getClass(), "ownerNode", null);
        setShortField(term69447, term69447.getClass(), "flags", (short) 0);
        setField(term69446, term69446.getClass(), "node", term69447);
        setField(term69446, term69446.getClass(), "namespaces", null);
        setField(term69446, term69446.getClass(), "defaultNamespace", "");
        setField(term69446, term69446.getClass(), "id", null);
        setIntField(term69446, term69446.getClass(), "index", 0);
        setBooleanField(term69446, term69446.getClass(), "attribute", false);
        setField(term69446, term69446.getClass(), "rootNode", null);
        setField(term69446, term69446.getClass(), "namespaceResolver", null);
        setField(term69446, term69446.getClass(), "parent", null);
        setField(term69446, term69446.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term69184, args);
        assertTrue(recursiveEquals(term69184, term69446));
        assertTrue(recursiveEquals(retValue, null));
    }

};


