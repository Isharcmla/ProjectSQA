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

public class DOMNodePointer_getRelativePositionByQName_171057332242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59811;
     Object term60564;

    public DOMNodePointer_getRelativePositionByQName_171057332242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59811 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59893 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term59975 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term60057 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setShortField(term59893, term59893.getClass(), "flags", (short) 0);
        setShortField(term59975, term59975.getClass(), "flags", (short) 0);
        setField(term59975, term59975.getClass(), "previousSibling", term60057);
        setField(term59893, term59893.getClass(), "previousSibling", term59975);
        setField(term59811, term59811.getClass(), "node", term59893);
        term60564 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term60565 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term60566 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        Object term60567 = newInstance(Class.forName("org.apache.xerces.dom.DocumentTypeImpl"));
        setField(term60565, term60565.getClass(), "name", null);
        setField(term60565, term60565.getClass(), "entities", null);
        setField(term60565, term60565.getClass(), "notations", null);
        setField(term60565, term60565.getClass(), "elements", null);
        setField(term60565, term60565.getClass(), "publicID", null);
        setField(term60565, term60565.getClass(), "systemID", null);
        setField(term60565, term60565.getClass(), "internalSubset", null);
        setIntField(term60565, term60565.getClass(), "doctypeNumber", 0);
        setField(term60565, term60565.getClass(), "ownerDocument", null);
        setField(term60565, term60565.getClass(), "firstChild", null);
        setField(term60565, term60565.getClass(), "fNodeListCache", null);
        setField(term60566, term60566.getClass(), "name", null);
        setField(term60566, term60566.getClass(), "entities", null);
        setField(term60566, term60566.getClass(), "notations", null);
        setField(term60566, term60566.getClass(), "elements", null);
        setField(term60566, term60566.getClass(), "publicID", null);
        setField(term60566, term60566.getClass(), "systemID", null);
        setField(term60566, term60566.getClass(), "internalSubset", null);
        setIntField(term60566, term60566.getClass(), "doctypeNumber", 0);
        setField(term60566, term60566.getClass(), "ownerDocument", null);
        setField(term60566, term60566.getClass(), "firstChild", null);
        setField(term60566, term60566.getClass(), "fNodeListCache", null);
        setField(term60567, term60567.getClass(), "name", null);
        setField(term60567, term60567.getClass(), "entities", null);
        setField(term60567, term60567.getClass(), "notations", null);
        setField(term60567, term60567.getClass(), "elements", null);
        setField(term60567, term60567.getClass(), "publicID", null);
        setField(term60567, term60567.getClass(), "systemID", null);
        setField(term60567, term60567.getClass(), "internalSubset", null);
        setIntField(term60567, term60567.getClass(), "doctypeNumber", 0);
        setField(term60567, term60567.getClass(), "ownerDocument", null);
        setField(term60567, term60567.getClass(), "firstChild", null);
        setField(term60567, term60567.getClass(), "fNodeListCache", null);
        setField(term60567, term60567.getClass(), "previousSibling", null);
        setField(term60567, term60567.getClass(), "nextSibling", null);
        setField(term60567, term60567.getClass(), "ownerNode", null);
        setShortField(term60567, term60567.getClass(), "flags", (short) 0);
        setField(term60566, term60566.getClass(), "previousSibling", term60567);
        setField(term60566, term60566.getClass(), "nextSibling", null);
        setField(term60566, term60566.getClass(), "ownerNode", null);
        setShortField(term60566, term60566.getClass(), "flags", (short) 0);
        setField(term60565, term60565.getClass(), "previousSibling", term60566);
        setField(term60565, term60565.getClass(), "nextSibling", null);
        setField(term60565, term60565.getClass(), "ownerNode", null);
        setShortField(term60565, term60565.getClass(), "flags", (short) 0);
        setField(term60564, term60564.getClass(), "node", term60565);
        setField(term60564, term60564.getClass(), "namespaces", null);
        setField(term60564, term60564.getClass(), "defaultNamespace", null);
        setField(term60564, term60564.getClass(), "id", null);
        setField(term60564, term60564.getClass(), "localNamespaceResolver", null);
        setIntField(term60564, term60564.getClass(), "index", 0);
        setBooleanField(term60564, term60564.getClass(), "attribute", false);
        setField(term60564, term60564.getClass(), "namespaceResolver", null);
        setField(term60564, term60564.getClass(), "exceptionHandler", null);
        setField(term60564, term60564.getClass(), "rootNode", null);
        setField(term60564, term60564.getClass(), "parent", null);
        setField(term60564, term60564.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionByQName", argTypes, term59811, args);
        assertTrue(recursiveEquals(term59811, term60564));
    }

};


