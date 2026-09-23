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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63123;
     Object term63349;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63123 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63205 = newInstance(Class.forName("org.apache.xerces.dom.DeferredTextImpl"));
        setField(term63123, term63123.getClass(), "defaultNamespace", null);
        setField(term63123, term63123.getClass(), "node", term63205);
        term63349 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63350 = newInstance(Class.forName("org.apache.xerces.dom.DeferredTextImpl"));
        setIntField(term63350, term63350.getClass(), "fNodeIndex", 0);
        setField(term63350, term63350.getClass(), "data", null);
        setField(term63350, term63350.getClass(), "previousSibling", null);
        setField(term63350, term63350.getClass(), "nextSibling", null);
        setField(term63350, term63350.getClass(), "ownerNode", null);
        setShortField(term63350, term63350.getClass(), "flags", (short) 0);
        setField(term63349, term63349.getClass(), "node", term63350);
        setField(term63349, term63349.getClass(), "namespaces", null);
        setField(term63349, term63349.getClass(), "defaultNamespace", "");
        setField(term63349, term63349.getClass(), "id", null);
        setIntField(term63349, term63349.getClass(), "index", 0);
        setBooleanField(term63349, term63349.getClass(), "attribute", false);
        setField(term63349, term63349.getClass(), "rootNode", null);
        setField(term63349, term63349.getClass(), "namespaceResolver", null);
        setField(term63349, term63349.getClass(), "parent", null);
        setField(term63349, term63349.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term63123, args);
        assertTrue(recursiveEquals(term63123, term63349));
        assertTrue(recursiveEquals(retValue, null));
    }

};


