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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66222;
     Object term67989;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66222 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66304 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term66376 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term66222, term66222.getClass(), "defaultNamespace", null);
        setShortField(term66304, term66304.getClass(), "flags", (short) 0);
        setField(term66304, term66304.getClass(), "docElement", term66376);
        setField(term66222, term66222.getClass(), "node", term66304);
        term67989 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term67990 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term67991 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term67990, term67990.getClass(), "iterators", null);
        setField(term67990, term67990.getClass(), "ranges", null);
        setField(term67990, term67990.getClass(), "eventListeners", null);
        setBooleanField(term67990, term67990.getClass(), "mutationEvents", false);
        setField(term67990, term67990.getClass(), "savedEnclosingAttr", null);
        setField(term67990, term67990.getClass(), "docType", null);
        setField(term67991, term67991.getClass(), "name", null);
        setField(term67991, term67991.getClass(), "attributes", null);
        setField(term67991, term67991.getClass(), "ownerDocument", null);
        setField(term67991, term67991.getClass(), "firstChild", null);
        setField(term67991, term67991.getClass(), "fNodeListCache", null);
        setField(term67991, term67991.getClass(), "previousSibling", null);
        setField(term67991, term67991.getClass(), "nextSibling", null);
        setField(term67991, term67991.getClass(), "ownerNode", null);
        setShortField(term67991, term67991.getClass(), "flags", (short) 0);
        setField(term67990, term67990.getClass(), "docElement", term67991);
        setField(term67990, term67990.getClass(), "fFreeNLCache", null);
        setField(term67990, term67990.getClass(), "encoding", null);
        setField(term67990, term67990.getClass(), "actualEncoding", null);
        setField(term67990, term67990.getClass(), "version", null);
        setBooleanField(term67990, term67990.getClass(), "standalone", false);
        setField(term67990, term67990.getClass(), "fDocumentURI", null);
        setField(term67990, term67990.getClass(), "userData", null);
        setField(term67990, term67990.getClass(), "identifiers", null);
        setField(term67990, term67990.getClass(), "domNormalizer", null);
        setField(term67990, term67990.getClass(), "fConfiguration", null);
        setIntField(term67990, term67990.getClass(), "changes", 0);
        setBooleanField(term67990, term67990.getClass(), "allowGrammarAccess", false);
        setBooleanField(term67990, term67990.getClass(), "errorChecking", false);
        setIntField(term67990, term67990.getClass(), "documentNumber", 0);
        setIntField(term67990, term67990.getClass(), "nodeCounter", 0);
        setField(term67990, term67990.getClass(), "nodeTable", null);
        setField(term67990, term67990.getClass(), "ownerDocument", null);
        setField(term67990, term67990.getClass(), "firstChild", null);
        setField(term67990, term67990.getClass(), "fNodeListCache", null);
        setField(term67990, term67990.getClass(), "previousSibling", null);
        setField(term67990, term67990.getClass(), "nextSibling", null);
        setField(term67990, term67990.getClass(), "ownerNode", null);
        setShortField(term67990, term67990.getClass(), "flags", (short) 0);
        setField(term67989, term67989.getClass(), "node", term67990);
        setField(term67989, term67989.getClass(), "namespaces", null);
        setField(term67989, term67989.getClass(), "defaultNamespace", "");
        setField(term67989, term67989.getClass(), "id", null);
        setField(term67989, term67989.getClass(), "localNamespaceResolver", null);
        setIntField(term67989, term67989.getClass(), "index", 0);
        setBooleanField(term67989, term67989.getClass(), "attribute", false);
        setField(term67989, term67989.getClass(), "namespaceResolver", null);
        setField(term67989, term67989.getClass(), "exceptionHandler", null);
        setField(term67989, term67989.getClass(), "rootNode", null);
        setField(term67989, term67989.getClass(), "parent", null);
        setField(term67989, term67989.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term66222, args);
        assertTrue(recursiveEquals(term66222, term67989));
        assertTrue(recursiveEquals(retValue, null));
    }

};


