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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27097;
     Object term27144;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27097 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27097, term27097.getClass(), "defaultNamespace", "");
        term27144 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27144, term27144.getClass(), "node", null);
        setField(term27144, term27144.getClass(), "namespaces", null);
        setField(term27144, term27144.getClass(), "defaultNamespace", "");
        setField(term27144, term27144.getClass(), "id", null);
        setField(term27144, term27144.getClass(), "localNamespaceResolver", null);
        setIntField(term27144, term27144.getClass(), "index", 0);
        setBooleanField(term27144, term27144.getClass(), "attribute", false);
        setField(term27144, term27144.getClass(), "namespaceResolver", null);
        setField(term27144, term27144.getClass(), "rootNode", null);
        setField(term27144, term27144.getClass(), "parent", null);
        setField(term27144, term27144.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term27097, args);
        assertTrue(recursiveEquals(term27097, term27144));
        assertTrue(recursiveEquals(retValue, null));
    }

};


