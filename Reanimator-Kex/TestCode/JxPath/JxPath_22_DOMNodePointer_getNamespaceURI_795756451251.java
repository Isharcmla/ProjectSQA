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

public class DOMNodePointer_getNamespaceURI_795756451251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61782;
     Object term62386;

    public DOMNodePointer_getNamespaceURI_795756451251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61782 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term61864 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term61936 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term61782, term61782.getClass(), "defaultNamespace", null);
        setShortField(term61864, term61864.getClass(), "flags", (short) 0);
        setField(term61864, term61864.getClass(), "docElement", term61936);
        setField(term61782, term61782.getClass(), "node", term61864);
        term62386 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term62387 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term62388 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term62387, term62387.getClass(), "iterators", null);
        setField(term62387, term62387.getClass(), "ranges", null);
        setField(term62387, term62387.getClass(), "eventListeners", null);
        setBooleanField(term62387, term62387.getClass(), "mutationEvents", false);
        setField(term62387, term62387.getClass(), "savedEnclosingAttr", null);
        setField(term62387, term62387.getClass(), "docType", null);
        setField(term62388, term62388.getClass(), "name", null);
        setField(term62388, term62388.getClass(), "attributes", null);
        setField(term62388, term62388.getClass(), "ownerDocument", null);
        setField(term62388, term62388.getClass(), "firstChild", null);
        setField(term62388, term62388.getClass(), "fNodeListCache", null);
        setField(term62388, term62388.getClass(), "previousSibling", null);
        setField(term62388, term62388.getClass(), "nextSibling", null);
        setField(term62388, term62388.getClass(), "ownerNode", null);
        setShortField(term62388, term62388.getClass(), "flags", (short) 0);
        setField(term62387, term62387.getClass(), "docElement", term62388);
        setField(term62387, term62387.getClass(), "fFreeNLCache", null);
        setField(term62387, term62387.getClass(), "encoding", null);
        setField(term62387, term62387.getClass(), "actualEncoding", null);
        setField(term62387, term62387.getClass(), "version", null);
        setBooleanField(term62387, term62387.getClass(), "standalone", false);
        setField(term62387, term62387.getClass(), "fDocumentURI", null);
        setField(term62387, term62387.getClass(), "userData", null);
        setField(term62387, term62387.getClass(), "identifiers", null);
        setField(term62387, term62387.getClass(), "domNormalizer", null);
        setField(term62387, term62387.getClass(), "fConfiguration", null);
        setIntField(term62387, term62387.getClass(), "changes", 0);
        setBooleanField(term62387, term62387.getClass(), "allowGrammarAccess", false);
        setBooleanField(term62387, term62387.getClass(), "errorChecking", false);
        setIntField(term62387, term62387.getClass(), "documentNumber", 0);
        setIntField(term62387, term62387.getClass(), "nodeCounter", 0);
        setField(term62387, term62387.getClass(), "nodeTable", null);
        setField(term62387, term62387.getClass(), "ownerDocument", null);
        setField(term62387, term62387.getClass(), "firstChild", null);
        setField(term62387, term62387.getClass(), "fNodeListCache", null);
        setField(term62387, term62387.getClass(), "previousSibling", null);
        setField(term62387, term62387.getClass(), "nextSibling", null);
        setField(term62387, term62387.getClass(), "ownerNode", null);
        setShortField(term62387, term62387.getClass(), "flags", (short) 0);
        setField(term62386, term62386.getClass(), "node", term62387);
        setField(term62386, term62386.getClass(), "namespaces", null);
        setField(term62386, term62386.getClass(), "defaultNamespace", "");
        setField(term62386, term62386.getClass(), "id", null);
        setField(term62386, term62386.getClass(), "localNamespaceResolver", null);
        setIntField(term62386, term62386.getClass(), "index", 0);
        setBooleanField(term62386, term62386.getClass(), "attribute", false);
        setField(term62386, term62386.getClass(), "namespaceResolver", null);
        setField(term62386, term62386.getClass(), "exceptionHandler", null);
        setField(term62386, term62386.getClass(), "rootNode", null);
        setField(term62386, term62386.getClass(), "parent", null);
        setField(term62386, term62386.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term61782, args);
        assertTrue(recursiveEquals(term61782, term62386));
        assertTrue(recursiveEquals(retValue, null));
    }

};


