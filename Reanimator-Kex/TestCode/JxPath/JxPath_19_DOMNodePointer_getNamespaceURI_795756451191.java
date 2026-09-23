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
     Object term39203;
     Object term39372;

    public DOMNodePointer_getNamespaceURI_795756451191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39203 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term39293 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term39203, term39203.getClass(), "defaultNamespace", null);
        setField(term39203, term39203.getClass(), "node", term39293);
        term39372 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term39373 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term39373, term39373.getClass(), "fNodePool", null);
        setField(term39373, term39373.getClass(), "docType", null);
        setField(term39373, term39373.getClass(), "docElement", null);
        setField(term39373, term39373.getClass(), "fFreeNLCache", null);
        setField(term39373, term39373.getClass(), "encoding", null);
        setField(term39373, term39373.getClass(), "actualEncoding", null);
        setField(term39373, term39373.getClass(), "version", null);
        setBooleanField(term39373, term39373.getClass(), "standalone", false);
        setField(term39373, term39373.getClass(), "fDocumentURI", null);
        setField(term39373, term39373.getClass(), "userData", null);
        setField(term39373, term39373.getClass(), "identifiers", null);
        setField(term39373, term39373.getClass(), "domNormalizer", null);
        setField(term39373, term39373.getClass(), "fConfiguration", null);
        setIntField(term39373, term39373.getClass(), "changes", 0);
        setBooleanField(term39373, term39373.getClass(), "allowGrammarAccess", false);
        setBooleanField(term39373, term39373.getClass(), "errorChecking", false);
        setIntField(term39373, term39373.getClass(), "documentNumber", 0);
        setIntField(term39373, term39373.getClass(), "nodeCounter", 0);
        setField(term39373, term39373.getClass(), "nodeTable", null);
        setField(term39373, term39373.getClass(), "ownerDocument", null);
        setField(term39373, term39373.getClass(), "firstChild", null);
        setField(term39373, term39373.getClass(), "fNodeListCache", null);
        setField(term39373, term39373.getClass(), "previousSibling", null);
        setField(term39373, term39373.getClass(), "nextSibling", null);
        setField(term39373, term39373.getClass(), "ownerNode", null);
        setShortField(term39373, term39373.getClass(), "flags", (short) 0);
        setField(term39372, term39372.getClass(), "node", term39373);
        setField(term39372, term39372.getClass(), "namespaces", null);
        setField(term39372, term39372.getClass(), "defaultNamespace", "");
        setField(term39372, term39372.getClass(), "id", null);
        setField(term39372, term39372.getClass(), "localNamespaceResolver", null);
        setIntField(term39372, term39372.getClass(), "index", 0);
        setBooleanField(term39372, term39372.getClass(), "attribute", false);
        setField(term39372, term39372.getClass(), "namespaceResolver", null);
        setField(term39372, term39372.getClass(), "rootNode", null);
        setField(term39372, term39372.getClass(), "parent", null);
        setField(term39372, term39372.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term39203, args);
        assertTrue(recursiveEquals(term39203, term39372));
        assertTrue(recursiveEquals(retValue, null));
    }

};


