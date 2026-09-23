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

public class DOMNodePointer_getPointerByID_2127216393265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64924;
     Object term65158;
     Object term65154;

    public DOMNodePointer_getPointerByID_2127216393265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64924 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65016 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term65090 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        setField(term65016, term65016.getClass(), "ownerDocument", term65090);
        setField(term64924, term64924.getClass(), "node", term65016);
        term65158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65159 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term65160 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        setIntField(term65159, term65159.getClass(), "fNodeIndex", 0);
        setField(term65159, term65159.getClass(), "namespaceURI", null);
        setField(term65159, term65159.getClass(), "localName", null);
        setField(term65159, term65159.getClass(), "type", null);
        setField(term65159, term65159.getClass(), "name", null);
        setField(term65159, term65159.getClass(), "attributes", null);
        setField(term65160, term65160.getClass(), "iterators", null);
        setField(term65160, term65160.getClass(), "ranges", null);
        setField(term65160, term65160.getClass(), "eventListeners", null);
        setBooleanField(term65160, term65160.getClass(), "mutationEvents", false);
        setField(term65160, term65160.getClass(), "savedEnclosingAttr", null);
        setField(term65160, term65160.getClass(), "docType", null);
        setField(term65160, term65160.getClass(), "docElement", null);
        setField(term65160, term65160.getClass(), "fFreeNLCache", null);
        setField(term65160, term65160.getClass(), "encoding", null);
        setField(term65160, term65160.getClass(), "actualEncoding", null);
        setField(term65160, term65160.getClass(), "version", null);
        setBooleanField(term65160, term65160.getClass(), "standalone", false);
        setField(term65160, term65160.getClass(), "fDocumentURI", null);
        setField(term65160, term65160.getClass(), "userData", null);
        setField(term65160, term65160.getClass(), "identifiers", null);
        setField(term65160, term65160.getClass(), "domNormalizer", null);
        setField(term65160, term65160.getClass(), "fConfiguration", null);
        setIntField(term65160, term65160.getClass(), "changes", 0);
        setBooleanField(term65160, term65160.getClass(), "allowGrammarAccess", false);
        setBooleanField(term65160, term65160.getClass(), "errorChecking", false);
        setIntField(term65160, term65160.getClass(), "documentNumber", 0);
        setIntField(term65160, term65160.getClass(), "nodeCounter", 0);
        setField(term65160, term65160.getClass(), "nodeTable", null);
        setField(term65160, term65160.getClass(), "ownerDocument", null);
        setField(term65160, term65160.getClass(), "firstChild", null);
        setField(term65160, term65160.getClass(), "fNodeListCache", null);
        setField(term65160, term65160.getClass(), "previousSibling", null);
        setField(term65160, term65160.getClass(), "nextSibling", null);
        setField(term65160, term65160.getClass(), "ownerNode", null);
        setShortField(term65160, term65160.getClass(), "flags", (short) 0);
        setField(term65159, term65159.getClass(), "ownerDocument", term65160);
        setField(term65159, term65159.getClass(), "firstChild", null);
        setField(term65159, term65159.getClass(), "fNodeListCache", null);
        setField(term65159, term65159.getClass(), "previousSibling", null);
        setField(term65159, term65159.getClass(), "nextSibling", null);
        setField(term65159, term65159.getClass(), "ownerNode", null);
        setShortField(term65159, term65159.getClass(), "flags", (short) 0);
        setField(term65158, term65158.getClass(), "node", term65159);
        setField(term65158, term65158.getClass(), "namespaces", null);
        setField(term65158, term65158.getClass(), "defaultNamespace", null);
        setField(term65158, term65158.getClass(), "id", null);
        setField(term65158, term65158.getClass(), "localNamespaceResolver", null);
        setIntField(term65158, term65158.getClass(), "index", 0);
        setBooleanField(term65158, term65158.getClass(), "attribute", false);
        setField(term65158, term65158.getClass(), "namespaceResolver", null);
        setField(term65158, term65158.getClass(), "exceptionHandler", null);
        setField(term65158, term65158.getClass(), "rootNode", null);
        setField(term65158, term65158.getClass(), "parent", null);
        setField(term65158, term65158.getClass(), "locale", null);
        term65154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term65155 = newInstance(Class.forName("java.lang.Object"));
        setField(term65154, term65154.getClass(), "name", null);
        setField(term65154, term65154.getClass(), "id", null);
        setField(term65154, term65154.getClass(), "value", term65155);
        setIntField(term65154, term65154.getClass(), "index", -2147483648);
        setBooleanField(term65154, term65154.getClass(), "attribute", false);
        setField(term65154, term65154.getClass(), "namespaceResolver", null);
        setField(term65154, term65154.getClass(), "exceptionHandler", null);
        setField(term65154, term65154.getClass(), "rootNode", null);
        setField(term65154, term65154.getClass(), "parent", null);
        setField(term65154, term65154.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.JXPathContext");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term64924, args);
        assertTrue(recursiveEquals(term64924, term65158));
        assertTrue(recursiveEquals(retValue, term65154));
    }

};


