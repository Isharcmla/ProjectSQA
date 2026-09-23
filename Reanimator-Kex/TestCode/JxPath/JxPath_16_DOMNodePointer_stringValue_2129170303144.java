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

public class DOMNodePointer_stringValue_2129170303144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27242;
     Object term27330;
     Object term27433;
     Object term27434;

    public DOMNodePointer_stringValue_2129170303144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27242 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term27330 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        term27433 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27433, term27433.getClass(), "node", null);
        setField(term27433, term27433.getClass(), "namespaces", null);
        setField(term27433, term27433.getClass(), "defaultNamespace", null);
        setField(term27433, term27433.getClass(), "id", null);
        setField(term27433, term27433.getClass(), "localNamespaceResolver", null);
        setIntField(term27433, term27433.getClass(), "index", 0);
        setBooleanField(term27433, term27433.getClass(), "attribute", false);
        setField(term27433, term27433.getClass(), "rootNode", null);
        setField(term27433, term27433.getClass(), "namespaceResolver", null);
        setField(term27433, term27433.getClass(), "parent", null);
        setField(term27433, term27433.getClass(), "locale", null);
        term27434 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        setIntField(term27434, term27434.getClass(), "fNodeIndex", 0);
        setField(term27434, term27434.getClass(), "data", null);
        setField(term27434, term27434.getClass(), "previousSibling", null);
        setField(term27434, term27434.getClass(), "nextSibling", null);
        setField(term27434, term27434.getClass(), "ownerNode", null);
        setShortField(term27434, term27434.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term27330;
        Object retValue = callMethod(klass, "stringValue", argTypes, term27242, args);
        assertTrue(recursiveEquals(term27242, term27433));
        assertTrue(recursiveEquals(term27330, term27434));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


