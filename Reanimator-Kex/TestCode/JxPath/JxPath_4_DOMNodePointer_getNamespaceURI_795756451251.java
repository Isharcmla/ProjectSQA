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
     Object term66912;
     Object term67027;

    public DOMNodePointer_getNamespaceURI_795756451251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66912 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66994 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term66912, term66912.getClass(), "defaultNamespace", null);
        setField(term66912, term66912.getClass(), "node", term66994);
        term67027 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term67028 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term67028, term67028.getClass(), "iterators", null);
        setField(term67028, term67028.getClass(), "ranges", null);
        setField(term67028, term67028.getClass(), "eventListeners", null);
        setBooleanField(term67028, term67028.getClass(), "mutationEvents", false);
        setField(term67028, term67028.getClass(), "savedEnclosingAttr", null);
        setField(term67028, term67028.getClass(), "docType", null);
        setField(term67028, term67028.getClass(), "docElement", null);
        setField(term67028, term67028.getClass(), "fFreeNLCache", null);
        setField(term67028, term67028.getClass(), "encoding", null);
        setField(term67028, term67028.getClass(), "actualEncoding", null);
        setField(term67028, term67028.getClass(), "version", null);
        setBooleanField(term67028, term67028.getClass(), "standalone", false);
        setField(term67028, term67028.getClass(), "fDocumentURI", null);
        setField(term67028, term67028.getClass(), "userData", null);
        setField(term67028, term67028.getClass(), "identifiers", null);
        setField(term67028, term67028.getClass(), "domNormalizer", null);
        setField(term67028, term67028.getClass(), "fConfiguration", null);
        setIntField(term67028, term67028.getClass(), "changes", 0);
        setBooleanField(term67028, term67028.getClass(), "allowGrammarAccess", false);
        setBooleanField(term67028, term67028.getClass(), "errorChecking", false);
        setIntField(term67028, term67028.getClass(), "documentNumber", 0);
        setIntField(term67028, term67028.getClass(), "nodeCounter", 0);
        setField(term67028, term67028.getClass(), "nodeTable", null);
        setField(term67028, term67028.getClass(), "ownerDocument", null);
        setField(term67028, term67028.getClass(), "firstChild", null);
        setField(term67028, term67028.getClass(), "fNodeListCache", null);
        setField(term67028, term67028.getClass(), "previousSibling", null);
        setField(term67028, term67028.getClass(), "nextSibling", null);
        setField(term67028, term67028.getClass(), "ownerNode", null);
        setShortField(term67028, term67028.getClass(), "flags", (short) 0);
        setField(term67027, term67027.getClass(), "node", term67028);
        setField(term67027, term67027.getClass(), "namespaces", null);
        setField(term67027, term67027.getClass(), "defaultNamespace", "");
        setField(term67027, term67027.getClass(), "id", null);
        setIntField(term67027, term67027.getClass(), "index", 0);
        setBooleanField(term67027, term67027.getClass(), "attribute", false);
        setField(term67027, term67027.getClass(), "rootNode", null);
        setField(term67027, term67027.getClass(), "namespaceResolver", null);
        setField(term67027, term67027.getClass(), "parent", null);
        setField(term67027, term67027.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term66912, args);
        assertTrue(recursiveEquals(term66912, term67027));
        assertTrue(recursiveEquals(retValue, null));
    }

};


