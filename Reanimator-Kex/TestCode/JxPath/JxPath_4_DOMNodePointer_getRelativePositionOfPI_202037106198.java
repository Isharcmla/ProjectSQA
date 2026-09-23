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

public class DOMNodePointer_getRelativePositionOfPI_202037106198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46078;
     Object term48281;

    public DOMNodePointer_getRelativePositionOfPI_202037106198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46078 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term46168 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term46258 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setShortField(term46168, term46168.getClass(), "flags", (short) 0);
        setField(term46168, term46168.getClass(), "previousSibling", term46258);
        setField(term46078, term46078.getClass(), "node", term46168);
        term48281 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48282 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term48283 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term48282, term48282.getClass(), "name", null);
        setField(term48282, term48282.getClass(), "attributes", null);
        setField(term48282, term48282.getClass(), "ownerDocument", null);
        setField(term48282, term48282.getClass(), "firstChild", null);
        setField(term48282, term48282.getClass(), "fNodeListCache", null);
        setField(term48283, term48283.getClass(), "name", null);
        setField(term48283, term48283.getClass(), "attributes", null);
        setField(term48283, term48283.getClass(), "ownerDocument", null);
        setField(term48283, term48283.getClass(), "firstChild", null);
        setField(term48283, term48283.getClass(), "fNodeListCache", null);
        setField(term48283, term48283.getClass(), "previousSibling", null);
        setField(term48283, term48283.getClass(), "nextSibling", null);
        setField(term48283, term48283.getClass(), "ownerNode", null);
        setShortField(term48283, term48283.getClass(), "flags", (short) 0);
        setField(term48282, term48282.getClass(), "previousSibling", term48283);
        setField(term48282, term48282.getClass(), "nextSibling", null);
        setField(term48282, term48282.getClass(), "ownerNode", null);
        setShortField(term48282, term48282.getClass(), "flags", (short) 0);
        setField(term48281, term48281.getClass(), "node", term48282);
        setField(term48281, term48281.getClass(), "namespaces", null);
        setField(term48281, term48281.getClass(), "defaultNamespace", null);
        setField(term48281, term48281.getClass(), "id", null);
        setIntField(term48281, term48281.getClass(), "index", 0);
        setBooleanField(term48281, term48281.getClass(), "attribute", false);
        setField(term48281, term48281.getClass(), "rootNode", null);
        setField(term48281, term48281.getClass(), "namespaceResolver", null);
        setField(term48281, term48281.getClass(), "parent", null);
        setField(term48281, term48281.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term46078, args);
        assertTrue(recursiveEquals(term46078, term48281));
    }

};


