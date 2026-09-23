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

public class DOMNodePointer_getValue_26659896187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37965;
     Object term38107;

    public DOMNodePointer_getValue_26659896187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37965 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term38047 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term37965, term37965.getClass(), "node", term38047);
        term38107 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term38108 = newInstance(Class.forName("org.apache.wml.dom.WMLTimerElementImpl"));
        setField(term38108, term38108.getClass(), "name", null);
        setField(term38108, term38108.getClass(), "attributes", null);
        setField(term38108, term38108.getClass(), "ownerDocument", null);
        setField(term38108, term38108.getClass(), "firstChild", null);
        setField(term38108, term38108.getClass(), "fNodeListCache", null);
        setField(term38108, term38108.getClass(), "previousSibling", null);
        setField(term38108, term38108.getClass(), "nextSibling", null);
        setField(term38108, term38108.getClass(), "ownerNode", null);
        setShortField(term38108, term38108.getClass(), "flags", (short) 0);
        setField(term38107, term38107.getClass(), "node", term38108);
        setField(term38107, term38107.getClass(), "namespaces", null);
        setField(term38107, term38107.getClass(), "defaultNamespace", null);
        setField(term38107, term38107.getClass(), "id", null);
        setField(term38107, term38107.getClass(), "localNamespaceResolver", null);
        setIntField(term38107, term38107.getClass(), "index", 0);
        setBooleanField(term38107, term38107.getClass(), "attribute", false);
        setField(term38107, term38107.getClass(), "rootNode", null);
        setField(term38107, term38107.getClass(), "namespaceResolver", null);
        setField(term38107, term38107.getClass(), "parent", null);
        setField(term38107, term38107.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term37965, args);
        assertTrue(recursiveEquals(term37965, term38107));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


