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

public class DOMNodePointer_getLocalName_1874395777272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73246;
     Object term74714;

    public DOMNodePointer_getLocalName_1874395777272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73246 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        term74714 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        setField(term74714, term74714.getClass(), "iterators", null);
        setField(term74714, term74714.getClass(), "ranges", null);
        setField(term74714, term74714.getClass(), "eventListeners", null);
        setBooleanField(term74714, term74714.getClass(), "mutationEvents", false);
        setField(term74714, term74714.getClass(), "savedEnclosingAttr", null);
        setField(term74714, term74714.getClass(), "docType", null);
        setField(term74714, term74714.getClass(), "docElement", null);
        setField(term74714, term74714.getClass(), "fFreeNLCache", null);
        setField(term74714, term74714.getClass(), "encoding", null);
        setField(term74714, term74714.getClass(), "actualEncoding", null);
        setField(term74714, term74714.getClass(), "version", null);
        setBooleanField(term74714, term74714.getClass(), "standalone", false);
        setField(term74714, term74714.getClass(), "fDocumentURI", null);
        setField(term74714, term74714.getClass(), "userData", null);
        setField(term74714, term74714.getClass(), "identifiers", null);
        setField(term74714, term74714.getClass(), "domNormalizer", null);
        setField(term74714, term74714.getClass(), "fConfiguration", null);
        setIntField(term74714, term74714.getClass(), "changes", 0);
        setBooleanField(term74714, term74714.getClass(), "allowGrammarAccess", false);
        setBooleanField(term74714, term74714.getClass(), "errorChecking", false);
        setIntField(term74714, term74714.getClass(), "documentNumber", 0);
        setIntField(term74714, term74714.getClass(), "nodeCounter", 0);
        setField(term74714, term74714.getClass(), "nodeTable", null);
        setField(term74714, term74714.getClass(), "ownerDocument", null);
        setField(term74714, term74714.getClass(), "firstChild", null);
        setField(term74714, term74714.getClass(), "fNodeListCache", null);
        setField(term74714, term74714.getClass(), "previousSibling", null);
        setField(term74714, term74714.getClass(), "nextSibling", null);
        setField(term74714, term74714.getClass(), "ownerNode", null);
        setShortField(term74714, term74714.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term73246;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term73246, term74714));
        assertTrue(recursiveEquals(retValue, "#document"));
    }

};


