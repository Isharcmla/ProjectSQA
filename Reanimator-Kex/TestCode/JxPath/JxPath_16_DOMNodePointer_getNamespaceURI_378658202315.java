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

public class DOMNodePointer_getNamespaceURI_378658202315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84991;
     Object term85238;

    public DOMNodePointer_getNamespaceURI_378658202315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84991 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term85063 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setShortField(term84991, term84991.getClass(), "flags", (short) 0);
        setShortField(term85063, term85063.getClass(), "flags", (short) 0);
        setField(term85063, term85063.getClass(), "name", "");
        setField(term84991, term84991.getClass(), "docElement", term85063);
        term85238 = newInstance(Class.forName("org.apache.xerces.dom.PSVIDocumentImpl"));
        Object term85239 = newInstance(Class.forName("org.apache.xerces.dom.ElementImpl"));
        setField(term85238, term85238.getClass(), "iterators", null);
        setField(term85238, term85238.getClass(), "ranges", null);
        setField(term85238, term85238.getClass(), "eventListeners", null);
        setBooleanField(term85238, term85238.getClass(), "mutationEvents", false);
        setField(term85238, term85238.getClass(), "savedEnclosingAttr", null);
        setField(term85238, term85238.getClass(), "docType", null);
        setField(term85239, term85239.getClass(), "name", "");
        setField(term85239, term85239.getClass(), "attributes", null);
        setField(term85239, term85239.getClass(), "ownerDocument", null);
        setField(term85239, term85239.getClass(), "firstChild", null);
        setField(term85239, term85239.getClass(), "fNodeListCache", null);
        setField(term85239, term85239.getClass(), "previousSibling", null);
        setField(term85239, term85239.getClass(), "nextSibling", null);
        setField(term85239, term85239.getClass(), "ownerNode", null);
        setShortField(term85239, term85239.getClass(), "flags", (short) 0);
        setField(term85238, term85238.getClass(), "docElement", term85239);
        setField(term85238, term85238.getClass(), "fFreeNLCache", null);
        setField(term85238, term85238.getClass(), "encoding", null);
        setField(term85238, term85238.getClass(), "actualEncoding", null);
        setField(term85238, term85238.getClass(), "version", null);
        setBooleanField(term85238, term85238.getClass(), "standalone", false);
        setField(term85238, term85238.getClass(), "fDocumentURI", null);
        setField(term85238, term85238.getClass(), "userData", null);
        setField(term85238, term85238.getClass(), "identifiers", null);
        setField(term85238, term85238.getClass(), "domNormalizer", null);
        setField(term85238, term85238.getClass(), "fConfiguration", null);
        setIntField(term85238, term85238.getClass(), "changes", 0);
        setBooleanField(term85238, term85238.getClass(), "allowGrammarAccess", false);
        setBooleanField(term85238, term85238.getClass(), "errorChecking", false);
        setIntField(term85238, term85238.getClass(), "documentNumber", 0);
        setIntField(term85238, term85238.getClass(), "nodeCounter", 0);
        setField(term85238, term85238.getClass(), "nodeTable", null);
        setField(term85238, term85238.getClass(), "ownerDocument", null);
        setField(term85238, term85238.getClass(), "firstChild", null);
        setField(term85238, term85238.getClass(), "fNodeListCache", null);
        setField(term85238, term85238.getClass(), "previousSibling", null);
        setField(term85238, term85238.getClass(), "nextSibling", null);
        setField(term85238, term85238.getClass(), "ownerNode", null);
        setShortField(term85238, term85238.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term84991;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, null, args);
        assertTrue(recursiveEquals(term84991, term85238));
        assertTrue(recursiveEquals(retValue, null));
    }

};


