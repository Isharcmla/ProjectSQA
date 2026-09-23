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

public class DOMNodePointer_escape_525200669157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30265;
     Object term30336;

    public DOMNodePointer_escape_525200669157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30265 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term30336 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term30336, term30336.getClass(), "node", null);
        setField(term30336, term30336.getClass(), "namespaces", null);
        setField(term30336, term30336.getClass(), "defaultNamespace", null);
        setField(term30336, term30336.getClass(), "id", null);
        setIntField(term30336, term30336.getClass(), "index", 0);
        setBooleanField(term30336, term30336.getClass(), "attribute", false);
        setField(term30336, term30336.getClass(), "rootNode", null);
        setField(term30336, term30336.getClass(), "namespaceResolver", null);
        setField(term30336, term30336.getClass(), "parent", null);
        setField(term30336, term30336.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term30265, args);
        assertTrue(recursiveEquals(term30265, term30336));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


