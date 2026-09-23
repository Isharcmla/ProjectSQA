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

public class DOMNodePointer_getNamespaceURI_795756451294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75623;
     Object term76018;

    public DOMNodePointer_getNamespaceURI_795756451294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75623 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term75709 = newInstance(Class.forName("org.apache.html.dom.HTMLFrameElementImpl"));
        setField(term75623, term75623.getClass(), "defaultNamespace", null);
        setField(term75623, term75623.getClass(), "node", term75709);
        term76018 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term76019 = newInstance(Class.forName("org.apache.html.dom.HTMLFrameElementImpl"));
        setField(term76019, term76019.getClass(), "name", null);
        setField(term76019, term76019.getClass(), "attributes", null);
        setField(term76019, term76019.getClass(), "ownerDocument", null);
        setField(term76019, term76019.getClass(), "firstChild", null);
        setField(term76019, term76019.getClass(), "fNodeListCache", null);
        setField(term76019, term76019.getClass(), "previousSibling", null);
        setField(term76019, term76019.getClass(), "nextSibling", null);
        setField(term76019, term76019.getClass(), "ownerNode", null);
        setShortField(term76019, term76019.getClass(), "flags", (short) 0);
        setField(term76018, term76018.getClass(), "node", term76019);
        setField(term76018, term76018.getClass(), "namespaces", null);
        setField(term76018, term76018.getClass(), "defaultNamespace", "");
        setField(term76018, term76018.getClass(), "id", null);
        setField(term76018, term76018.getClass(), "localNamespaceResolver", null);
        setIntField(term76018, term76018.getClass(), "index", 0);
        setBooleanField(term76018, term76018.getClass(), "attribute", false);
        setField(term76018, term76018.getClass(), "rootNode", null);
        setField(term76018, term76018.getClass(), "namespaceResolver", null);
        setField(term76018, term76018.getClass(), "parent", null);
        setField(term76018, term76018.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term75623, args);
        assertTrue(recursiveEquals(term75623, term76018));
        assertTrue(recursiveEquals(retValue, null));
    }

};


