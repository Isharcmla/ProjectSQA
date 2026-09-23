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

public class DOMNodePointer_getLocalName_1874395777141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22218;
     Object term22833;

    public DOMNodePointer_getLocalName_1874395777141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22218 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        term22833 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term22833, term22833.getClass(), "iterators", null);
        setField(term22833, term22833.getClass(), "ranges", null);
        setField(term22833, term22833.getClass(), "eventListeners", null);
        setBooleanField(term22833, term22833.getClass(), "mutationEvents", false);
        setField(term22833, term22833.getClass(), "savedEnclosingAttr", null);
        setField(term22833, term22833.getClass(), "docType", null);
        setField(term22833, term22833.getClass(), "docElement", null);
        setField(term22833, term22833.getClass(), "fFreeNLCache", null);
        setField(term22833, term22833.getClass(), "encoding", null);
        setField(term22833, term22833.getClass(), "actualEncoding", null);
        setField(term22833, term22833.getClass(), "version", null);
        setBooleanField(term22833, term22833.getClass(), "standalone", false);
        setField(term22833, term22833.getClass(), "fDocumentURI", null);
        setField(term22833, term22833.getClass(), "userData", null);
        setField(term22833, term22833.getClass(), "identifiers", null);
        setField(term22833, term22833.getClass(), "domNormalizer", null);
        setField(term22833, term22833.getClass(), "fConfiguration", null);
        setIntField(term22833, term22833.getClass(), "changes", 0);
        setBooleanField(term22833, term22833.getClass(), "allowGrammarAccess", false);
        setBooleanField(term22833, term22833.getClass(), "errorChecking", false);
        setIntField(term22833, term22833.getClass(), "documentNumber", 0);
        setIntField(term22833, term22833.getClass(), "nodeCounter", 0);
        setField(term22833, term22833.getClass(), "nodeTable", null);
        setField(term22833, term22833.getClass(), "ownerDocument", null);
        setField(term22833, term22833.getClass(), "firstChild", null);
        setField(term22833, term22833.getClass(), "fNodeListCache", null);
        setField(term22833, term22833.getClass(), "previousSibling", null);
        setField(term22833, term22833.getClass(), "nextSibling", null);
        setField(term22833, term22833.getClass(), "ownerNode", null);
        setShortField(term22833, term22833.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term22218;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term22218, term22833));
        assertTrue(recursiveEquals(retValue, "#document"));
    }

};


