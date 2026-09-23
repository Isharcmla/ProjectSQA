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

public class DOMNodePointer_getPointerByID_2127216393256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63091;
     Object term63546;
     Object term63542;

    public DOMNodePointer_getPointerByID_2127216393256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63091 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63183 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term63273 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setField(term63183, term63183.getClass(), "ownerDocument", term63273);
        setField(term63091, term63091.getClass(), "node", term63183);
        term63546 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63547 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementNSImpl"));
        Object term63548 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        setIntField(term63547, term63547.getClass(), "fNodeIndex", 0);
        setField(term63547, term63547.getClass(), "namespaceURI", null);
        setField(term63547, term63547.getClass(), "localName", null);
        setField(term63547, term63547.getClass(), "type", null);
        setField(term63547, term63547.getClass(), "name", null);
        setField(term63547, term63547.getClass(), "attributes", null);
        setField(term63548, term63548.getClass(), "fNodePool", null);
        setField(term63548, term63548.getClass(), "docType", null);
        setField(term63548, term63548.getClass(), "docElement", null);
        setField(term63548, term63548.getClass(), "fFreeNLCache", null);
        setField(term63548, term63548.getClass(), "encoding", null);
        setField(term63548, term63548.getClass(), "actualEncoding", null);
        setField(term63548, term63548.getClass(), "version", null);
        setBooleanField(term63548, term63548.getClass(), "standalone", false);
        setField(term63548, term63548.getClass(), "fDocumentURI", null);
        setField(term63548, term63548.getClass(), "userData", null);
        setField(term63548, term63548.getClass(), "identifiers", null);
        setField(term63548, term63548.getClass(), "domNormalizer", null);
        setField(term63548, term63548.getClass(), "fConfiguration", null);
        setIntField(term63548, term63548.getClass(), "changes", 0);
        setBooleanField(term63548, term63548.getClass(), "allowGrammarAccess", false);
        setBooleanField(term63548, term63548.getClass(), "errorChecking", false);
        setIntField(term63548, term63548.getClass(), "documentNumber", 0);
        setIntField(term63548, term63548.getClass(), "nodeCounter", 0);
        setField(term63548, term63548.getClass(), "nodeTable", null);
        setField(term63548, term63548.getClass(), "ownerDocument", null);
        setField(term63548, term63548.getClass(), "firstChild", null);
        setField(term63548, term63548.getClass(), "fNodeListCache", null);
        setField(term63548, term63548.getClass(), "previousSibling", null);
        setField(term63548, term63548.getClass(), "nextSibling", null);
        setField(term63548, term63548.getClass(), "ownerNode", null);
        setShortField(term63548, term63548.getClass(), "flags", (short) 0);
        setField(term63547, term63547.getClass(), "ownerDocument", term63548);
        setField(term63547, term63547.getClass(), "firstChild", null);
        setField(term63547, term63547.getClass(), "fNodeListCache", null);
        setField(term63547, term63547.getClass(), "previousSibling", null);
        setField(term63547, term63547.getClass(), "nextSibling", null);
        setField(term63547, term63547.getClass(), "ownerNode", null);
        setShortField(term63547, term63547.getClass(), "flags", (short) 0);
        setField(term63546, term63546.getClass(), "node", term63547);
        setField(term63546, term63546.getClass(), "namespaces", null);
        setField(term63546, term63546.getClass(), "defaultNamespace", null);
        setField(term63546, term63546.getClass(), "id", null);
        setField(term63546, term63546.getClass(), "localNamespaceResolver", null);
        setIntField(term63546, term63546.getClass(), "index", 0);
        setBooleanField(term63546, term63546.getClass(), "attribute", false);
        setField(term63546, term63546.getClass(), "namespaceResolver", null);
        setField(term63546, term63546.getClass(), "exceptionHandler", null);
        setField(term63546, term63546.getClass(), "rootNode", null);
        setField(term63546, term63546.getClass(), "parent", null);
        setField(term63546, term63546.getClass(), "locale", null);
        term63542 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.beans.NullPointer"));
        Object term63543 = newInstance(Class.forName("java.lang.Object"));
        setField(term63542, term63542.getClass(), "name", null);
        setField(term63542, term63542.getClass(), "id", null);
        setField(term63542, term63542.getClass(), "value", term63543);
        setIntField(term63542, term63542.getClass(), "index", -2147483648);
        setBooleanField(term63542, term63542.getClass(), "attribute", false);
        setField(term63542, term63542.getClass(), "namespaceResolver", null);
        setField(term63542, term63542.getClass(), "exceptionHandler", null);
        setField(term63542, term63542.getClass(), "rootNode", null);
        setField(term63542, term63542.getClass(), "parent", null);
        setField(term63542, term63542.getClass(), "locale", null);
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
        Object retValue = callMethod(klass, "getPointerByID", argTypes, term63091, args);
        assertTrue(recursiveEquals(term63091, term63546));
        assertTrue(recursiveEquals(retValue, term63542));
    }

};


