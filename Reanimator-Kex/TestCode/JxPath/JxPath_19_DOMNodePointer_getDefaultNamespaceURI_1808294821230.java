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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50884;
     Object term51213;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50884 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term50966 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term50884, term50884.getClass(), "defaultNamespace", null);
        setField(term50884, term50884.getClass(), "node", term50966);
        term51213 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term51214 = newInstance(Class.forName("org.apache.xerces.dom.CoreDocumentImpl"));
        setField(term51214, term51214.getClass(), "docType", null);
        setField(term51214, term51214.getClass(), "docElement", null);
        setField(term51214, term51214.getClass(), "fFreeNLCache", null);
        setField(term51214, term51214.getClass(), "encoding", null);
        setField(term51214, term51214.getClass(), "actualEncoding", null);
        setField(term51214, term51214.getClass(), "version", null);
        setBooleanField(term51214, term51214.getClass(), "standalone", false);
        setField(term51214, term51214.getClass(), "fDocumentURI", null);
        setField(term51214, term51214.getClass(), "userData", null);
        setField(term51214, term51214.getClass(), "identifiers", null);
        setField(term51214, term51214.getClass(), "domNormalizer", null);
        setField(term51214, term51214.getClass(), "fConfiguration", null);
        setIntField(term51214, term51214.getClass(), "changes", 0);
        setBooleanField(term51214, term51214.getClass(), "allowGrammarAccess", false);
        setBooleanField(term51214, term51214.getClass(), "errorChecking", false);
        setIntField(term51214, term51214.getClass(), "documentNumber", 0);
        setIntField(term51214, term51214.getClass(), "nodeCounter", 0);
        setField(term51214, term51214.getClass(), "nodeTable", null);
        setField(term51214, term51214.getClass(), "ownerDocument", null);
        setField(term51214, term51214.getClass(), "firstChild", null);
        setField(term51214, term51214.getClass(), "fNodeListCache", null);
        setField(term51214, term51214.getClass(), "previousSibling", null);
        setField(term51214, term51214.getClass(), "nextSibling", null);
        setField(term51214, term51214.getClass(), "ownerNode", null);
        setShortField(term51214, term51214.getClass(), "flags", (short) 0);
        setField(term51213, term51213.getClass(), "node", term51214);
        setField(term51213, term51213.getClass(), "namespaces", null);
        setField(term51213, term51213.getClass(), "defaultNamespace", "");
        setField(term51213, term51213.getClass(), "id", null);
        setField(term51213, term51213.getClass(), "localNamespaceResolver", null);
        setIntField(term51213, term51213.getClass(), "index", 0);
        setBooleanField(term51213, term51213.getClass(), "attribute", false);
        setField(term51213, term51213.getClass(), "namespaceResolver", null);
        setField(term51213, term51213.getClass(), "rootNode", null);
        setField(term51213, term51213.getClass(), "parent", null);
        setField(term51213, term51213.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term50884, args);
        assertTrue(recursiveEquals(term50884, term51213));
        assertTrue(recursiveEquals(retValue, null));
    }

};


