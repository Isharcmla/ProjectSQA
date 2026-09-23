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

public class DOMNodePointer_getPointerByID_2127216393276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68352;
     Object term68876;
     Object term68872;

    public DOMNodePointer_getPointerByID_2127216393276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68352 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68444 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term68526 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term68444, term68444.getClass(), "ownerDocument", term68526);
        setField(term68352, term68352.getClass(), "node", term68444);
        term68876 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term68877 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term68878 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setIntField(term68877, term68877.getClass(), "fNodeIndex", 0);
        setField(term68877, term68877.getClass(), "namespaceURI", null);
        setField(term68877, term68877.getClass(), "localName", null);
        setField(term68877, term68877.getClass(), "type", null);
        setField(term68877, term68877.getClass(), "name", null);
        setField(term68877, term68877.getClass(), "attributes", null);
        setField(term68878, term68878.getClass(), "iterators", null);
        setField(term68878, term68878.getClass(), "ranges", null);
        setField(term68878, term68878.getClass(), "eventListeners", null);
        setBooleanField(term68878, term68878.getClass(), "mutationEvents", false);
        setField(term68878, term68878.getClass(), "savedEnclosingAttr", null);
        setField(term68878, term68878.getClass(), "docType", null);
        setField(term68878, term68878.getClass(), "docElement", null);
        setField(term68878, term68878.getClass(), "fFreeNLCache", null);
        setField(term68878, term68878.getClass(), "encoding", null);
        setField(term68878, term68878.getClass(), "actualEncoding", null);
        setField(term68878, term68878.getClass(), "version", null);
        setBooleanField(term68878, term68878.getClass(), "standalone", false);
        setField(term68878, term68878.getClass(), "fDocumentURI", null);
        setField(term68878, term68878.getClass(), "userData", null);
        setField(term68878, term68878.getClass(), "identifiers", null);
        setField(term68878, term68878.getClass(), "domNormalizer", null);
        setField(term68878, term68878.getClass(), "fConfiguration", null);
        setIntField(term68878, term68878.getClass(), "changes", 0);
        setBooleanField(term68878, term68878.getClass(), "allowGrammarAccess", false);
        setBooleanField(term68878, term68878.getClass(), "errorChecking", false);
        setIntField(term68878, term68878.getClass(), "documentNumber", 0);
        setIntField(term68878, term68878.getClass(), "nodeCounter", 0);
        setField(term68878, term68878.getClass(), "nodeTable", null);
        setField(term68878, term68878.getClass(), "ownerDocument", null);
        setField(term68878, term68878.getClass(), "firstChild", null);
        setField(term68878, term68878.getClass(), "fNodeListCache", null);
        setField(term68878, term68878.getClass(), "previousSibling", null);
        setField(term68878, term68878.getClass(), "nextSibling", null);
        setField(term68878, term68878.getClass(), "ownerNode", null);
        setShortField(term68878, term68878.getClass(), "flags", (short) 0);
        setField(term68877, term68877.getClass(), "ownerDocument", term68878);
        setField(term68877, term68877.getClass(), "firstChild", null);
        setField(term68877, term68877.getClass(), "fNodeListCache", null);
        setField(term68877, term68877.getClass(), "previousSibling", null);
        setField(term68877, term68877.getClass(), "nextSibling", null);
        setField(term68877, term68877.getClass(), "ownerNode", null);
        setShortField(term68877, term68877.getClass(), "flags", (short) 0);
        setField(term68876, term68876.getClass(), "node", term68877);
        setField(term68876, term68876.getClass(), "namespaces", null);
        setField(term68876, term68876.getClass(), "defaultNamespace", null);
        setField(term68876, term68876.getClass(), "id", null);
        setField(term68876, term68876.getClass(), "localNamespaceResolver", null);
        setIntField(term68876, term68876.getClass(), "index", 0);
        setBooleanField(term68876, term68876.getClass(), "attribute", false);
        setField(term68876, term68876.getClass(), "namespaceResolver", null);
        setField(term68876, term68876.getClass(), "exceptionHandler", null);
        setField(term68876, term68876.getClass(), "rootNode", null);
        setField(term68876, term68876.getClass(), "parent", null);
        setField(term68876, term68876.getClass(), "locale", null);
        term68872 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term68873 = newInstance(Class.forName("java.lang.Object"));
        setField(term68872, term68872.getClass(), "name", null);
        setField(term68872, term68872.getClass(), "id", null);
        setField(term68872, term68872.getClass(), "value", term68873);
        setIntField(term68872, term68872.getClass(), "index", -2147483648);
        setBooleanField(term68872, term68872.getClass(), "attribute", false);
        setField(term68872, term68872.getClass(), "namespaceResolver", null);
        setField(term68872, term68872.getClass(), "exceptionHandler", null);
        setField(term68872, term68872.getClass(), "rootNode", null);
        setField(term68872, term68872.getClass(), "parent", null);
        setField(term68872, term68872.getClass(), "locale", null);
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
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term68352, args);
        assertTrue(recursiveEquals(term68352, term68876));
        assertTrue(recursiveEquals(retValue, term68872));
    }

};


