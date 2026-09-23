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

public class DOMNodePointer_getRelativePositionOfPI_202037106220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53270;
     Object term53720;

    public DOMNodePointer_getRelativePositionOfPI_202037106220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53270 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term53344 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term53418 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setShortField(term53344, term53344.getClass(), "flags", (short) 0);
        setField(term53344, term53344.getClass(), "previousSibling", term53418);
        setField(term53270, term53270.getClass(), "node", term53344);
        term53720 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term53721 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        Object term53722 = newInstance(Class.forName("org.apache.wml.dom.WMLDocumentImpl"));
        setField(term53721, term53721.getClass(), "iterators", null);
        setField(term53721, term53721.getClass(), "ranges", null);
        setField(term53721, term53721.getClass(), "eventListeners", null);
        setBooleanField(term53721, term53721.getClass(), "mutationEvents", false);
        setField(term53721, term53721.getClass(), "savedEnclosingAttr", null);
        setField(term53721, term53721.getClass(), "docType", null);
        setField(term53721, term53721.getClass(), "docElement", null);
        setField(term53721, term53721.getClass(), "fFreeNLCache", null);
        setField(term53721, term53721.getClass(), "encoding", null);
        setField(term53721, term53721.getClass(), "actualEncoding", null);
        setField(term53721, term53721.getClass(), "version", null);
        setBooleanField(term53721, term53721.getClass(), "standalone", false);
        setField(term53721, term53721.getClass(), "fDocumentURI", null);
        setField(term53721, term53721.getClass(), "userData", null);
        setField(term53721, term53721.getClass(), "identifiers", null);
        setField(term53721, term53721.getClass(), "domNormalizer", null);
        setField(term53721, term53721.getClass(), "fConfiguration", null);
        setIntField(term53721, term53721.getClass(), "changes", 0);
        setBooleanField(term53721, term53721.getClass(), "allowGrammarAccess", false);
        setBooleanField(term53721, term53721.getClass(), "errorChecking", false);
        setIntField(term53721, term53721.getClass(), "documentNumber", 0);
        setIntField(term53721, term53721.getClass(), "nodeCounter", 0);
        setField(term53721, term53721.getClass(), "nodeTable", null);
        setField(term53721, term53721.getClass(), "ownerDocument", null);
        setField(term53721, term53721.getClass(), "firstChild", null);
        setField(term53721, term53721.getClass(), "fNodeListCache", null);
        setField(term53722, term53722.getClass(), "iterators", null);
        setField(term53722, term53722.getClass(), "ranges", null);
        setField(term53722, term53722.getClass(), "eventListeners", null);
        setBooleanField(term53722, term53722.getClass(), "mutationEvents", false);
        setField(term53722, term53722.getClass(), "savedEnclosingAttr", null);
        setField(term53722, term53722.getClass(), "docType", null);
        setField(term53722, term53722.getClass(), "docElement", null);
        setField(term53722, term53722.getClass(), "fFreeNLCache", null);
        setField(term53722, term53722.getClass(), "encoding", null);
        setField(term53722, term53722.getClass(), "actualEncoding", null);
        setField(term53722, term53722.getClass(), "version", null);
        setBooleanField(term53722, term53722.getClass(), "standalone", false);
        setField(term53722, term53722.getClass(), "fDocumentURI", null);
        setField(term53722, term53722.getClass(), "userData", null);
        setField(term53722, term53722.getClass(), "identifiers", null);
        setField(term53722, term53722.getClass(), "domNormalizer", null);
        setField(term53722, term53722.getClass(), "fConfiguration", null);
        setIntField(term53722, term53722.getClass(), "changes", 0);
        setBooleanField(term53722, term53722.getClass(), "allowGrammarAccess", false);
        setBooleanField(term53722, term53722.getClass(), "errorChecking", false);
        setIntField(term53722, term53722.getClass(), "documentNumber", 0);
        setIntField(term53722, term53722.getClass(), "nodeCounter", 0);
        setField(term53722, term53722.getClass(), "nodeTable", null);
        setField(term53722, term53722.getClass(), "ownerDocument", null);
        setField(term53722, term53722.getClass(), "firstChild", null);
        setField(term53722, term53722.getClass(), "fNodeListCache", null);
        setField(term53722, term53722.getClass(), "previousSibling", null);
        setField(term53722, term53722.getClass(), "nextSibling", null);
        setField(term53722, term53722.getClass(), "ownerNode", null);
        setShortField(term53722, term53722.getClass(), "flags", (short) 0);
        setField(term53721, term53721.getClass(), "previousSibling", term53722);
        setField(term53721, term53721.getClass(), "nextSibling", null);
        setField(term53721, term53721.getClass(), "ownerNode", null);
        setShortField(term53721, term53721.getClass(), "flags", (short) 0);
        setField(term53720, term53720.getClass(), "node", term53721);
        setField(term53720, term53720.getClass(), "namespaces", null);
        setField(term53720, term53720.getClass(), "defaultNamespace", null);
        setField(term53720, term53720.getClass(), "id", null);
        setIntField(term53720, term53720.getClass(), "index", 0);
        setBooleanField(term53720, term53720.getClass(), "attribute", false);
        setField(term53720, term53720.getClass(), "rootNode", null);
        setField(term53720, term53720.getClass(), "namespaceResolver", null);
        setField(term53720, term53720.getClass(), "parent", null);
        setField(term53720, term53720.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term53270, args);
        assertTrue(recursiveEquals(term53270, term53720));
    }

};


