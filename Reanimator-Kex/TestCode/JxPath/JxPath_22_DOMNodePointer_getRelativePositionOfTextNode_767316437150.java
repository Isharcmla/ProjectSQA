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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28198;
     Object term28431;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28198 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28278 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        setField(term28198, term28198.getClass(), "node", term28278);
        term28431 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28432 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        setField(term28432, term28432.getClass(), "name", null);
        setField(term28432, term28432.getClass(), "attributes", null);
        setField(term28432, term28432.getClass(), "ownerDocument", null);
        setField(term28432, term28432.getClass(), "firstChild", null);
        setField(term28432, term28432.getClass(), "fNodeListCache", null);
        setField(term28432, term28432.getClass(), "previousSibling", null);
        setField(term28432, term28432.getClass(), "nextSibling", null);
        setField(term28432, term28432.getClass(), "ownerNode", null);
        setShortField(term28432, term28432.getClass(), "flags", (short) 0);
        setField(term28431, term28431.getClass(), "node", term28432);
        setField(term28431, term28431.getClass(), "namespaces", null);
        setField(term28431, term28431.getClass(), "defaultNamespace", null);
        setField(term28431, term28431.getClass(), "id", null);
        setField(term28431, term28431.getClass(), "localNamespaceResolver", null);
        setIntField(term28431, term28431.getClass(), "index", 0);
        setBooleanField(term28431, term28431.getClass(), "attribute", false);
        setField(term28431, term28431.getClass(), "namespaceResolver", null);
        setField(term28431, term28431.getClass(), "exceptionHandler", null);
        setField(term28431, term28431.getClass(), "rootNode", null);
        setField(term28431, term28431.getClass(), "parent", null);
        setField(term28431, term28431.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term28198, args);
        assertTrue(recursiveEquals(term28198, term28431));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


