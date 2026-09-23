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

public class DOMNodePointer_testNode_1702276443317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97035;
     Object term97141;
     Object term98995;
     Object term98996;

    public DOMNodePointer_testNode_1702276443317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97035 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        term97141 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        term98995 = newInstance(Class.forName("org.apache.xerces.dom.DocumentImpl"));
        setField(term98995, term98995.getClass(), "iterators", null);
        setField(term98995, term98995.getClass(), "ranges", null);
        setField(term98995, term98995.getClass(), "eventListeners", null);
        setBooleanField(term98995, term98995.getClass(), "mutationEvents", false);
        setField(term98995, term98995.getClass(), "savedEnclosingAttr", null);
        setField(term98995, term98995.getClass(), "docType", null);
        setField(term98995, term98995.getClass(), "docElement", null);
        setField(term98995, term98995.getClass(), "fFreeNLCache", null);
        setField(term98995, term98995.getClass(), "encoding", null);
        setField(term98995, term98995.getClass(), "actualEncoding", null);
        setField(term98995, term98995.getClass(), "version", null);
        setBooleanField(term98995, term98995.getClass(), "standalone", false);
        setField(term98995, term98995.getClass(), "fDocumentURI", null);
        setField(term98995, term98995.getClass(), "userData", null);
        setField(term98995, term98995.getClass(), "identifiers", null);
        setField(term98995, term98995.getClass(), "domNormalizer", null);
        setField(term98995, term98995.getClass(), "fConfiguration", null);
        setIntField(term98995, term98995.getClass(), "changes", 0);
        setBooleanField(term98995, term98995.getClass(), "allowGrammarAccess", false);
        setBooleanField(term98995, term98995.getClass(), "errorChecking", false);
        setIntField(term98995, term98995.getClass(), "documentNumber", 0);
        setIntField(term98995, term98995.getClass(), "nodeCounter", 0);
        setField(term98995, term98995.getClass(), "nodeTable", null);
        setField(term98995, term98995.getClass(), "ownerDocument", null);
        setField(term98995, term98995.getClass(), "firstChild", null);
        setField(term98995, term98995.getClass(), "fNodeListCache", null);
        setField(term98995, term98995.getClass(), "previousSibling", null);
        setField(term98995, term98995.getClass(), "nextSibling", null);
        setField(term98995, term98995.getClass(), "ownerNode", null);
        setShortField(term98995, term98995.getClass(), "flags", (short) 0);
        term98996 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeNameTest"));
        setField(term98996, term98996.getClass(), "qname", null);
        setField(term98996, term98996.getClass(), "namespaceURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term97035;
        args[1] = term97141;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term97035, term98995));
        assertTrue(recursiveEquals(term97141, term98996));
        assertTrue(recursiveEquals(retValue, false));
    }

};


