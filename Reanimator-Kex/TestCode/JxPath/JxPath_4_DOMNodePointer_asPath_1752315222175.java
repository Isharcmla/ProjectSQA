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

public class DOMNodePointer_asPath_1752315222175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35658;
     Object term35743;

    public DOMNodePointer_asPath_1752315222175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35658 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term35730 = newInstance(Class.forName("org.apache.xerces.dom.CommentImpl"));
        setField(term35658, term35658.getClass(), "id", null);
        setField(term35658, term35658.getClass(), "parent", null);
        setField(term35658, term35658.getClass(), "node", term35730);
        term35743 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term35744 = newInstance(Class.forName("org.apache.xerces.dom.CommentImpl"));
        setField(term35744, term35744.getClass(), "data", null);
        setField(term35744, term35744.getClass(), "previousSibling", null);
        setField(term35744, term35744.getClass(), "nextSibling", null);
        setField(term35744, term35744.getClass(), "ownerNode", null);
        setShortField(term35744, term35744.getClass(), "flags", (short) 0);
        setField(term35743, term35743.getClass(), "node", term35744);
        setField(term35743, term35743.getClass(), "namespaces", null);
        setField(term35743, term35743.getClass(), "defaultNamespace", null);
        setField(term35743, term35743.getClass(), "id", null);
        setIntField(term35743, term35743.getClass(), "index", 0);
        setBooleanField(term35743, term35743.getClass(), "attribute", false);
        setField(term35743, term35743.getClass(), "rootNode", null);
        setField(term35743, term35743.getClass(), "namespaceResolver", null);
        setField(term35743, term35743.getClass(), "parent", null);
        setField(term35743, term35743.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term35658, args);
        assertTrue(recursiveEquals(term35658, term35743));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


