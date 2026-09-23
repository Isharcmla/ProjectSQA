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

public class DOMNodePointer_asPath_1752315222162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32413;
     Object term33304;

    public DOMNodePointer_asPath_1752315222162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32413 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32493 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        setField(term32413, term32413.getClass(), "id", null);
        setField(term32413, term32413.getClass(), "parent", null);
        setField(term32413, term32413.getClass(), "node", term32493);
        term33304 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33305 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        setField(term33305, term33305.getClass(), "name", null);
        setField(term33305, term33305.getClass(), "attributes", null);
        setField(term33305, term33305.getClass(), "ownerDocument", null);
        setField(term33305, term33305.getClass(), "firstChild", null);
        setField(term33305, term33305.getClass(), "fNodeListCache", null);
        setField(term33305, term33305.getClass(), "previousSibling", null);
        setField(term33305, term33305.getClass(), "nextSibling", null);
        setField(term33305, term33305.getClass(), "ownerNode", null);
        setShortField(term33305, term33305.getClass(), "flags", (short) 0);
        setField(term33304, term33304.getClass(), "node", term33305);
        setField(term33304, term33304.getClass(), "namespaces", null);
        setField(term33304, term33304.getClass(), "defaultNamespace", null);
        setField(term33304, term33304.getClass(), "id", null);
        setField(term33304, term33304.getClass(), "localNamespaceResolver", null);
        setIntField(term33304, term33304.getClass(), "index", 0);
        setBooleanField(term33304, term33304.getClass(), "attribute", false);
        setField(term33304, term33304.getClass(), "rootNode", null);
        setField(term33304, term33304.getClass(), "namespaceResolver", null);
        setField(term33304, term33304.getClass(), "parent", null);
        setField(term33304, term33304.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term32413, args);
        assertTrue(recursiveEquals(term32413, term33304));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


