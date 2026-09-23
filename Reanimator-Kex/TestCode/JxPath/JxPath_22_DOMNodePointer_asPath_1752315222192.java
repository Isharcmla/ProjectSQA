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

public class DOMNodePointer_asPath_1752315222192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37582;
     Object term42257;

    public DOMNodePointer_asPath_1752315222192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37582 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term37678 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.DefaultElement"));
        setField(term37582, term37582.getClass(), "id", null);
        setField(term37582, term37582.getClass(), "parent", null);
        setField(term37582, term37582.getClass(), "node", term37678);
        term42257 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term42258 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.DefaultElement"));
        setField(term42258, term42258.getClass(), "prefix", null);
        setField(term42258, term42258.getClass(), "localpart", null);
        setField(term42258, term42258.getClass(), "rawname", null);
        setField(term42258, term42258.getClass(), "uri", null);
        setShortField(term42258, term42258.getClass(), "nodeType", (short) 0);
        setBooleanField(term42258, term42258.getClass(), "hidden", false);
        setField(term42257, term42257.getClass(), "node", term42258);
        setField(term42257, term42257.getClass(), "namespaces", null);
        setField(term42257, term42257.getClass(), "defaultNamespace", null);
        setField(term42257, term42257.getClass(), "id", null);
        setField(term42257, term42257.getClass(), "localNamespaceResolver", null);
        setIntField(term42257, term42257.getClass(), "index", 0);
        setBooleanField(term42257, term42257.getClass(), "attribute", false);
        setField(term42257, term42257.getClass(), "namespaceResolver", null);
        setField(term42257, term42257.getClass(), "exceptionHandler", null);
        setField(term42257, term42257.getClass(), "rootNode", null);
        setField(term42257, term42257.getClass(), "parent", null);
        setField(term42257, term42257.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term37582, args);
        assertTrue(recursiveEquals(term37582, term42257));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


