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

public class DOMNodePointer_getNamespaceURI_795756451150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27698;
     Object term27829;

    public DOMNodePointer_getNamespaceURI_795756451150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27698 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term27829 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27829, term27829.getClass(), "node", null);
        setField(term27829, term27829.getClass(), "namespaces", null);
        setField(term27829, term27829.getClass(), "defaultNamespace", "");
        setField(term27829, term27829.getClass(), "id", null);
        setIntField(term27829, term27829.getClass(), "index", 0);
        setBooleanField(term27829, term27829.getClass(), "attribute", false);
        setField(term27829, term27829.getClass(), "rootNode", null);
        setField(term27829, term27829.getClass(), "namespaceResolver", null);
        setField(term27829, term27829.getClass(), "parent", null);
        setField(term27829, term27829.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term27698, args);
        assertTrue(recursiveEquals(term27698, term27829));
        assertTrue(recursiveEquals(retValue, null));
    }

};


