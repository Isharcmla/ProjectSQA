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

public class DOMNodePointer_setValue_96835476243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60343;
     Object term60517;
     Object term60610;
     Object term60612;

    public DOMNodePointer_setValue_96835476243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60343 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term60437 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setShortField(term60437, term60437.getClass(), "flags", (short) 0);
        setField(term60437, term60437.getClass(), "fNodeListCache", null);
        setField(term60437, term60437.getClass(), "firstChild", null);
        setField(term60343, term60343.getClass(), "node", term60437);
        term60517 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        term60610 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term60611 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setField(term60611, term60611.getClass(), "name", null);
        setField(term60611, term60611.getClass(), "attributes", null);
        setField(term60611, term60611.getClass(), "ownerDocument", null);
        setField(term60611, term60611.getClass(), "firstChild", null);
        setField(term60611, term60611.getClass(), "fNodeListCache", null);
        setField(term60611, term60611.getClass(), "previousSibling", null);
        setField(term60611, term60611.getClass(), "nextSibling", null);
        setField(term60611, term60611.getClass(), "ownerNode", null);
        setShortField(term60611, term60611.getClass(), "flags", (short) 0);
        setField(term60610, term60610.getClass(), "node", term60611);
        setField(term60610, term60610.getClass(), "namespaces", null);
        setField(term60610, term60610.getClass(), "defaultNamespace", null);
        setField(term60610, term60610.getClass(), "id", null);
        setField(term60610, term60610.getClass(), "localNamespaceResolver", null);
        setIntField(term60610, term60610.getClass(), "index", 0);
        setBooleanField(term60610, term60610.getClass(), "attribute", false);
        setField(term60610, term60610.getClass(), "namespaceResolver", null);
        setField(term60610, term60610.getClass(), "exceptionHandler", null);
        setField(term60610, term60610.getClass(), "rootNode", null);
        setField(term60610, term60610.getClass(), "parent", null);
        setField(term60610, term60610.getClass(), "locale", null);
        term60612 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        setField(term60612, term60612.getClass(), "name", null);
        setField(term60612, term60612.getClass(), "attributes", null);
        setField(term60612, term60612.getClass(), "ownerDocument", null);
        setField(term60612, term60612.getClass(), "firstChild", null);
        setField(term60612, term60612.getClass(), "fNodeListCache", null);
        setField(term60612, term60612.getClass(), "previousSibling", null);
        setField(term60612, term60612.getClass(), "nextSibling", null);
        setField(term60612, term60612.getClass(), "ownerNode", null);
        setShortField(term60612, term60612.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60517;
        callMethod(klass, "setValue", argTypes, term60343, args);
        assertTrue(recursiveEquals(term60343, term60610));
        assertTrue(recursiveEquals(term60517, term60612));
    }

};


