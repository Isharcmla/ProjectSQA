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
import java.util.HashMap;

public class DOMNodePointer_getNamespaceURI_795756451319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98747;
     Object term99223;

    public DOMNodePointer_getNamespaceURI_795756451319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98747 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term98837 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term98909 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term98747, term98747.getClass(), "namespaces", null);
        setShortField(term98837, term98837.getClass(), "flags", (short) 0);
        setField(term98837, term98837.getClass(), "docElement", term98909);
        setField(term98747, term98747.getClass(), "node", term98837);
        HashMap term99226 = new HashMap();
        term99223 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term99224 = newInstance(Class.forName("org.apache.xerces.impl.xs.dom.DocumentImpl"));
        Object term99225 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term99224, term99224.getClass(), "fNodePool", null);
        setField(term99224, term99224.getClass(), "docType", null);
        setField(term99225, term99225.getClass(), "name", null);
        setField(term99225, term99225.getClass(), "attributes", null);
        setField(term99225, term99225.getClass(), "ownerDocument", null);
        setField(term99225, term99225.getClass(), "firstChild", null);
        setField(term99225, term99225.getClass(), "fNodeListCache", null);
        setField(term99225, term99225.getClass(), "previousSibling", null);
        setField(term99225, term99225.getClass(), "nextSibling", null);
        setField(term99225, term99225.getClass(), "ownerNode", null);
        setShortField(term99225, term99225.getClass(), "flags", (short) 0);
        setField(term99224, term99224.getClass(), "docElement", term99225);
        setField(term99224, term99224.getClass(), "fFreeNLCache", null);
        setField(term99224, term99224.getClass(), "encoding", null);
        setField(term99224, term99224.getClass(), "actualEncoding", null);
        setField(term99224, term99224.getClass(), "version", null);
        setBooleanField(term99224, term99224.getClass(), "standalone", false);
        setField(term99224, term99224.getClass(), "fDocumentURI", null);
        setField(term99224, term99224.getClass(), "userData", null);
        setField(term99224, term99224.getClass(), "identifiers", null);
        setField(term99224, term99224.getClass(), "domNormalizer", null);
        setField(term99224, term99224.getClass(), "fConfiguration", null);
        setIntField(term99224, term99224.getClass(), "changes", 0);
        setBooleanField(term99224, term99224.getClass(), "allowGrammarAccess", false);
        setBooleanField(term99224, term99224.getClass(), "errorChecking", false);
        setIntField(term99224, term99224.getClass(), "documentNumber", 0);
        setIntField(term99224, term99224.getClass(), "nodeCounter", 0);
        setField(term99224, term99224.getClass(), "nodeTable", null);
        setField(term99224, term99224.getClass(), "ownerDocument", null);
        setField(term99224, term99224.getClass(), "firstChild", null);
        setField(term99224, term99224.getClass(), "fNodeListCache", null);
        setField(term99224, term99224.getClass(), "previousSibling", null);
        setField(term99224, term99224.getClass(), "nextSibling", null);
        setField(term99224, term99224.getClass(), "ownerNode", null);
        setShortField(term99224, term99224.getClass(), "flags", (short) 0);
        setField(term99223, term99223.getClass(), "node", term99224);
        setField(term99223, term99223.getClass(), "namespaces", term99226);
        setField(term99223, term99223.getClass(), "defaultNamespace", null);
        setField(term99223, term99223.getClass(), "id", null);
        setIntField(term99223, term99223.getClass(), "index", 0);
        setBooleanField(term99223, term99223.getClass(), "attribute", false);
        setField(term99223, term99223.getClass(), "rootNode", null);
        setField(term99223, term99223.getClass(), "namespaceResolver", null);
        setField(term99223, term99223.getClass(), "parent", null);
        setField(term99223, term99223.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                ";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term98747, args);
        assertTrue(recursiveEquals(term98747, term99223));
        assertTrue(recursiveEquals(retValue, null));
    }

};


