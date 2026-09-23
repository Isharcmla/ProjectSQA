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

public class DOMNodePointer_stringValue_2129170303146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27804;
     Object term27896;
     Object term28352;
     Object term28353;

    public DOMNodePointer_stringValue_2129170303146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27804 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term27896 = newInstance(Class.forName("org.apache.html.dom.HTMLOptGroupElementImpl"));
        term28352 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term28352, term28352.getClass(), "node", null);
        setField(term28352, term28352.getClass(), "namespaces", null);
        setField(term28352, term28352.getClass(), "defaultNamespace", null);
        setField(term28352, term28352.getClass(), "id", null);
        setIntField(term28352, term28352.getClass(), "index", 0);
        setBooleanField(term28352, term28352.getClass(), "attribute", false);
        setField(term28352, term28352.getClass(), "rootNode", null);
        setField(term28352, term28352.getClass(), "namespaceResolver", null);
        setField(term28352, term28352.getClass(), "parent", null);
        setField(term28352, term28352.getClass(), "locale", null);
        term28353 = newInstance(Class.forName("org.apache.html.dom.HTMLOptGroupElementImpl"));
        setField(term28353, term28353.getClass(), "name", null);
        setField(term28353, term28353.getClass(), "attributes", null);
        setField(term28353, term28353.getClass(), "ownerDocument", null);
        setField(term28353, term28353.getClass(), "firstChild", null);
        setField(term28353, term28353.getClass(), "fNodeListCache", null);
        setField(term28353, term28353.getClass(), "previousSibling", null);
        setField(term28353, term28353.getClass(), "nextSibling", null);
        setField(term28353, term28353.getClass(), "ownerNode", null);
        setShortField(term28353, term28353.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term27896;
        Object retValue = callMethod(klass, "stringValue", argTypes, term27804, args);
        assertTrue(recursiveEquals(term27804, term28352));
        assertTrue(recursiveEquals(term27896, term28353));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


