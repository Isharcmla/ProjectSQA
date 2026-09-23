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

public class DOMNodePointer_asPath_1752315222239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59488;
     Object term61885;

    public DOMNodePointer_asPath_1752315222239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59488 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59568 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        setField(term59488, term59488.getClass(), "id", null);
        setField(term59488, term59488.getClass(), "parent", null);
        setField(term59488, term59488.getClass(), "node", term59568);
        term61885 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term61886 = newInstance(Class.forName("org.apache.html.dom.HTMLHRElementImpl"));
        setField(term61886, term61886.getClass(), "name", null);
        setField(term61886, term61886.getClass(), "attributes", null);
        setField(term61886, term61886.getClass(), "ownerDocument", null);
        setField(term61886, term61886.getClass(), "firstChild", null);
        setField(term61886, term61886.getClass(), "fNodeListCache", null);
        setField(term61886, term61886.getClass(), "previousSibling", null);
        setField(term61886, term61886.getClass(), "nextSibling", null);
        setField(term61886, term61886.getClass(), "ownerNode", null);
        setShortField(term61886, term61886.getClass(), "flags", (short) 0);
        setField(term61885, term61885.getClass(), "node", term61886);
        setField(term61885, term61885.getClass(), "namespaces", null);
        setField(term61885, term61885.getClass(), "defaultNamespace", null);
        setField(term61885, term61885.getClass(), "id", null);
        setIntField(term61885, term61885.getClass(), "index", 0);
        setBooleanField(term61885, term61885.getClass(), "attribute", false);
        setField(term61885, term61885.getClass(), "rootNode", null);
        setField(term61885, term61885.getClass(), "namespaceResolver", null);
        setField(term61885, term61885.getClass(), "parent", null);
        setField(term61885, term61885.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term59488, args);
        assertTrue(recursiveEquals(term59488, term61885));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


