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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80354;
     Object term80558;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80354 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80428 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term80500 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term80354, term80354.getClass(), "defaultNamespace", null);
        setShortField(term80428, term80428.getClass(), "flags", (short) 0);
        setField(term80428, term80428.getClass(), "docElement", term80500);
        setField(term80354, term80354.getClass(), "node", term80428);
        term80558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80559 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term80560 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term80559, term80559.getClass(), "iterators", null);
        setField(term80559, term80559.getClass(), "ranges", null);
        setField(term80559, term80559.getClass(), "eventListeners", null);
        setBooleanField(term80559, term80559.getClass(), "mutationEvents", false);
        setField(term80559, term80559.getClass(), "savedEnclosingAttr", null);
        setField(term80559, term80559.getClass(), "docType", null);
        setField(term80560, term80560.getClass(), "name", null);
        setField(term80560, term80560.getClass(), "attributes", null);
        setField(term80560, term80560.getClass(), "ownerDocument", null);
        setField(term80560, term80560.getClass(), "firstChild", null);
        setField(term80560, term80560.getClass(), "fNodeListCache", null);
        setField(term80560, term80560.getClass(), "previousSibling", null);
        setField(term80560, term80560.getClass(), "nextSibling", null);
        setField(term80560, term80560.getClass(), "ownerNode", null);
        setShortField(term80560, term80560.getClass(), "flags", (short) 0);
        setField(term80559, term80559.getClass(), "docElement", term80560);
        setField(term80559, term80559.getClass(), "fFreeNLCache", null);
        setField(term80559, term80559.getClass(), "encoding", null);
        setField(term80559, term80559.getClass(), "actualEncoding", null);
        setField(term80559, term80559.getClass(), "version", null);
        setBooleanField(term80559, term80559.getClass(), "standalone", false);
        setField(term80559, term80559.getClass(), "fDocumentURI", null);
        setField(term80559, term80559.getClass(), "userData", null);
        setField(term80559, term80559.getClass(), "identifiers", null);
        setField(term80559, term80559.getClass(), "domNormalizer", null);
        setField(term80559, term80559.getClass(), "fConfiguration", null);
        setIntField(term80559, term80559.getClass(), "changes", 0);
        setBooleanField(term80559, term80559.getClass(), "allowGrammarAccess", false);
        setBooleanField(term80559, term80559.getClass(), "errorChecking", false);
        setIntField(term80559, term80559.getClass(), "documentNumber", 0);
        setIntField(term80559, term80559.getClass(), "nodeCounter", 0);
        setField(term80559, term80559.getClass(), "nodeTable", null);
        setField(term80559, term80559.getClass(), "ownerDocument", null);
        setField(term80559, term80559.getClass(), "firstChild", null);
        setField(term80559, term80559.getClass(), "fNodeListCache", null);
        setField(term80559, term80559.getClass(), "previousSibling", null);
        setField(term80559, term80559.getClass(), "nextSibling", null);
        setField(term80559, term80559.getClass(), "ownerNode", null);
        setShortField(term80559, term80559.getClass(), "flags", (short) 0);
        setField(term80558, term80558.getClass(), "node", term80559);
        setField(term80558, term80558.getClass(), "namespaces", null);
        setField(term80558, term80558.getClass(), "defaultNamespace", "");
        setField(term80558, term80558.getClass(), "id", null);
        setIntField(term80558, term80558.getClass(), "index", 0);
        setBooleanField(term80558, term80558.getClass(), "attribute", false);
        setField(term80558, term80558.getClass(), "rootNode", null);
        setField(term80558, term80558.getClass(), "namespaceResolver", null);
        setField(term80558, term80558.getClass(), "parent", null);
        setField(term80558, term80558.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term80354, args);
        assertTrue(recursiveEquals(term80354, term80558));
        assertTrue(recursiveEquals(retValue, null));
    }

};


