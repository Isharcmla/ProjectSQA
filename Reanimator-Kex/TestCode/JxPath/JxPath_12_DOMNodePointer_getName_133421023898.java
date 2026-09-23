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

public class DOMNodePointer_getName_133421023898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14463;
     Object term15558;
     Object term15552;

    public DOMNodePointer_getName_133421023898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14463 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term14529 = newInstance(Class.forName("org.apache.xerces.dom.TextImpl"));
        setField(term14463, term14463.getClass(), "node", term14529);
        term15558 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term15559 = newInstance(Class.forName("org.apache.xerces.dom.TextImpl"));
        setField(term15559, term15559.getClass(), "data", null);
        setField(term15559, term15559.getClass(), "previousSibling", null);
        setField(term15559, term15559.getClass(), "nextSibling", null);
        setField(term15559, term15559.getClass(), "ownerNode", null);
        setShortField(term15559, term15559.getClass(), "flags", (short) 0);
        setField(term15558, term15558.getClass(), "node", term15559);
        setField(term15558, term15558.getClass(), "namespaces", null);
        setField(term15558, term15558.getClass(), "defaultNamespace", null);
        setField(term15558, term15558.getClass(), "id", null);
        setIntField(term15558, term15558.getClass(), "index", 0);
        setBooleanField(term15558, term15558.getClass(), "attribute", false);
        setField(term15558, term15558.getClass(), "rootNode", null);
        setField(term15558, term15558.getClass(), "namespaceResolver", null);
        setField(term15558, term15558.getClass(), "parent", null);
        setField(term15558, term15558.getClass(), "locale", null);
        term15552 = newInstance(Class.forName("org.apache.commons.jxpath.ri.QName"));
        setField(term15552, term15552.getClass(), "prefix", null);
        setField(term15552, term15552.getClass(), "name", null);
        setField(term15552, term15552.getClass(), "qualifiedName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getName", argTypes, term14463, args);
        assertTrue(recursiveEquals(term14463, term15558));
        assertTrue(recursiveEquals(retValue, term15552));
    }

};


