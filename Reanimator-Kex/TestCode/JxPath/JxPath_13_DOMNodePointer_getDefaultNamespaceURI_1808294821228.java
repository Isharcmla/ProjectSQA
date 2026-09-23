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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59171;
     Object term60696;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59171 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59247 = newInstance(Class.forName("org.apache.wml.dom.WMLTrElementImpl"));
        setField(term59171, term59171.getClass(), "defaultNamespace", null);
        setField(term59171, term59171.getClass(), "node", term59247);
        term60696 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term60697 = newInstance(Class.forName("org.apache.wml.dom.WMLTrElementImpl"));
        setField(term60697, term60697.getClass(), "name", null);
        setField(term60697, term60697.getClass(), "attributes", null);
        setField(term60697, term60697.getClass(), "ownerDocument", null);
        setField(term60697, term60697.getClass(), "firstChild", null);
        setField(term60697, term60697.getClass(), "fNodeListCache", null);
        setField(term60697, term60697.getClass(), "previousSibling", null);
        setField(term60697, term60697.getClass(), "nextSibling", null);
        setField(term60697, term60697.getClass(), "ownerNode", null);
        setShortField(term60697, term60697.getClass(), "flags", (short) 0);
        setField(term60696, term60696.getClass(), "node", term60697);
        setField(term60696, term60696.getClass(), "namespaces", null);
        setField(term60696, term60696.getClass(), "defaultNamespace", "");
        setField(term60696, term60696.getClass(), "id", null);
        setIntField(term60696, term60696.getClass(), "index", 0);
        setBooleanField(term60696, term60696.getClass(), "attribute", false);
        setField(term60696, term60696.getClass(), "rootNode", null);
        setField(term60696, term60696.getClass(), "namespaceResolver", null);
        setField(term60696, term60696.getClass(), "parent", null);
        setField(term60696, term60696.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term59171, args);
        assertTrue(recursiveEquals(term59171, term60696));
        assertTrue(recursiveEquals(retValue, null));
    }

};


