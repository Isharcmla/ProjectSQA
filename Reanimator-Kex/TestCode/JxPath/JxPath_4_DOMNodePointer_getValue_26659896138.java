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

public class DOMNodePointer_getValue_26659896138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24548;
     Object term25341;

    public DOMNodePointer_getValue_26659896138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24548 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24636 = newInstance(Class.forName("org.apache.wml.dom.WMLFieldsetElementImpl"));
        setField(term24548, term24548.getClass(), "node", term24636);
        term25341 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term25342 = newInstance(Class.forName("org.apache.wml.dom.WMLFieldsetElementImpl"));
        setField(term25342, term25342.getClass(), "name", null);
        setField(term25342, term25342.getClass(), "attributes", null);
        setField(term25342, term25342.getClass(), "ownerDocument", null);
        setField(term25342, term25342.getClass(), "firstChild", null);
        setField(term25342, term25342.getClass(), "fNodeListCache", null);
        setField(term25342, term25342.getClass(), "previousSibling", null);
        setField(term25342, term25342.getClass(), "nextSibling", null);
        setField(term25342, term25342.getClass(), "ownerNode", null);
        setShortField(term25342, term25342.getClass(), "flags", (short) 0);
        setField(term25341, term25341.getClass(), "node", term25342);
        setField(term25341, term25341.getClass(), "namespaces", null);
        setField(term25341, term25341.getClass(), "defaultNamespace", null);
        setField(term25341, term25341.getClass(), "id", null);
        setIntField(term25341, term25341.getClass(), "index", 0);
        setBooleanField(term25341, term25341.getClass(), "attribute", false);
        setField(term25341, term25341.getClass(), "rootNode", null);
        setField(term25341, term25341.getClass(), "namespaceResolver", null);
        setField(term25341, term25341.getClass(), "parent", null);
        setField(term25341, term25341.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term24548, args);
        assertTrue(recursiveEquals(term24548, term25341));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


