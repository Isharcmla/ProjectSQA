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

public class DOMNodePointer_isLeaf_486659650167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32318;
     Object term32427;

    public DOMNodePointer_isLeaf_486659650167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32318 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32414 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.DefaultElement"));
        setField(term32318, term32318.getClass(), "node", term32414);
        term32427 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32428 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.DefaultElement"));
        setField(term32428, term32428.getClass(), "prefix", null);
        setField(term32428, term32428.getClass(), "localpart", null);
        setField(term32428, term32428.getClass(), "rawname", null);
        setField(term32428, term32428.getClass(), "uri", null);
        setShortField(term32428, term32428.getClass(), "nodeType", (short) 0);
        setBooleanField(term32428, term32428.getClass(), "hidden", false);
        setField(term32427, term32427.getClass(), "node", term32428);
        setField(term32427, term32427.getClass(), "namespaces", null);
        setField(term32427, term32427.getClass(), "defaultNamespace", null);
        setField(term32427, term32427.getClass(), "id", null);
        setField(term32427, term32427.getClass(), "localNamespaceResolver", null);
        setIntField(term32427, term32427.getClass(), "index", 0);
        setBooleanField(term32427, term32427.getClass(), "attribute", false);
        setField(term32427, term32427.getClass(), "namespaceResolver", null);
        setField(term32427, term32427.getClass(), "exceptionHandler", null);
        setField(term32427, term32427.getClass(), "rootNode", null);
        setField(term32427, term32427.getClass(), "parent", null);
        setField(term32427, term32427.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLeaf", argTypes, term32318, args);
        assertTrue(recursiveEquals(term32318, term32427));
        assertTrue(recursiveEquals(retValue, true));
    }

};


