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

public class DOMNodePointer_getValue_26659896136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24909;
     Object term25760;

    public DOMNodePointer_getValue_26659896136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24909 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24991 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term24909, term24909.getClass(), "node", term24991);
        term25760 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term25761 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term25761, term25761.getClass(), "name", null);
        setField(term25761, term25761.getClass(), "attributes", null);
        setField(term25761, term25761.getClass(), "ownerDocument", null);
        setField(term25761, term25761.getClass(), "firstChild", null);
        setField(term25761, term25761.getClass(), "fNodeListCache", null);
        setField(term25761, term25761.getClass(), "previousSibling", null);
        setField(term25761, term25761.getClass(), "nextSibling", null);
        setField(term25761, term25761.getClass(), "ownerNode", null);
        setShortField(term25761, term25761.getClass(), "flags", (short) 0);
        setField(term25760, term25760.getClass(), "node", term25761);
        setField(term25760, term25760.getClass(), "namespaces", null);
        setField(term25760, term25760.getClass(), "defaultNamespace", null);
        setField(term25760, term25760.getClass(), "id", null);
        setField(term25760, term25760.getClass(), "localNamespaceResolver", null);
        setIntField(term25760, term25760.getClass(), "index", 0);
        setBooleanField(term25760, term25760.getClass(), "attribute", false);
        setField(term25760, term25760.getClass(), "namespaceResolver", null);
        setField(term25760, term25760.getClass(), "exceptionHandler", null);
        setField(term25760, term25760.getClass(), "rootNode", null);
        setField(term25760, term25760.getClass(), "parent", null);
        setField(term25760, term25760.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term24909, args);
        assertTrue(recursiveEquals(term24909, term25760));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


