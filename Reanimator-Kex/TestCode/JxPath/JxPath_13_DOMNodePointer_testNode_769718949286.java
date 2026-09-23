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

public class DOMNodePointer_testNode_769718949286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84607;
     Object term84787;
     Object term86517;
     Object term86519;

    public DOMNodePointer_testNode_769718949286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84607 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term84681 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        setField(term84607, term84607.getClass(), "node", term84681);
        term84787 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        term86517 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term86518 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        setField(term86518, term86518.getClass(), "iterators", null);
        setField(term86518, term86518.getClass(), "ranges", null);
        setField(term86518, term86518.getClass(), "eventListeners", null);
        setBooleanField(term86518, term86518.getClass(), "mutationEvents", false);
        setField(term86518, term86518.getClass(), "savedEnclosingAttr", null);
        setField(term86518, term86518.getClass(), "docType", null);
        setField(term86518, term86518.getClass(), "docElement", null);
        setField(term86518, term86518.getClass(), "fFreeNLCache", null);
        setField(term86518, term86518.getClass(), "encoding", null);
        setField(term86518, term86518.getClass(), "actualEncoding", null);
        setField(term86518, term86518.getClass(), "version", null);
        setBooleanField(term86518, term86518.getClass(), "standalone", false);
        setField(term86518, term86518.getClass(), "fDocumentURI", null);
        setField(term86518, term86518.getClass(), "userData", null);
        setField(term86518, term86518.getClass(), "identifiers", null);
        setField(term86518, term86518.getClass(), "domNormalizer", null);
        setField(term86518, term86518.getClass(), "fConfiguration", null);
        setIntField(term86518, term86518.getClass(), "changes", 0);
        setBooleanField(term86518, term86518.getClass(), "allowGrammarAccess", false);
        setBooleanField(term86518, term86518.getClass(), "errorChecking", false);
        setIntField(term86518, term86518.getClass(), "documentNumber", 0);
        setIntField(term86518, term86518.getClass(), "nodeCounter", 0);
        setField(term86518, term86518.getClass(), "nodeTable", null);
        setField(term86518, term86518.getClass(), "ownerDocument", null);
        setField(term86518, term86518.getClass(), "firstChild", null);
        setField(term86518, term86518.getClass(), "fNodeListCache", null);
        setField(term86518, term86518.getClass(), "previousSibling", null);
        setField(term86518, term86518.getClass(), "nextSibling", null);
        setField(term86518, term86518.getClass(), "ownerNode", null);
        setShortField(term86518, term86518.getClass(), "flags", (short) 0);
        setField(term86517, term86517.getClass(), "node", term86518);
        setField(term86517, term86517.getClass(), "namespaces", null);
        setField(term86517, term86517.getClass(), "defaultNamespace", null);
        setField(term86517, term86517.getClass(), "id", null);
        setIntField(term86517, term86517.getClass(), "index", 0);
        setBooleanField(term86517, term86517.getClass(), "attribute", false);
        setField(term86517, term86517.getClass(), "rootNode", null);
        setField(term86517, term86517.getClass(), "namespaceResolver", null);
        setField(term86517, term86517.getClass(), "parent", null);
        setField(term86517, term86517.getClass(), "locale", null);
        term86519 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term86519, term86519.getClass(), "nodeType", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[1];
        args[0] = term84787;
        callMethod(klass, "testNode", argTypes, term84607, args);
        assertTrue(recursiveEquals(term84607, term86517));
        assertTrue(recursiveEquals(term84787, term86519));
    }

};


