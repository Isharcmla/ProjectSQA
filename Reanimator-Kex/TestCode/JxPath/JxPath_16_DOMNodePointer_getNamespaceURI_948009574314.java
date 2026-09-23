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

public class DOMNodePointer_getNamespaceURI_948009574314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84656;
     Object term85158;

    public DOMNodePointer_getNamespaceURI_948009574314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84656 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term84732 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setShortField(term84732, term84732.getClass(), "flags", (short) 0);
        setField(term84732, term84732.getClass(), "name", "");
        setField(term84656, term84656.getClass(), "node", term84732);
        term85158 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term85159 = newInstance(Class.forName("org.apache.wml.dom.WMLBrElementImpl"));
        setField(term85159, term85159.getClass(), "name", "");
        setField(term85159, term85159.getClass(), "attributes", null);
        setField(term85159, term85159.getClass(), "ownerDocument", null);
        setField(term85159, term85159.getClass(), "firstChild", null);
        setField(term85159, term85159.getClass(), "fNodeListCache", null);
        setField(term85159, term85159.getClass(), "previousSibling", null);
        setField(term85159, term85159.getClass(), "nextSibling", null);
        setField(term85159, term85159.getClass(), "ownerNode", null);
        setShortField(term85159, term85159.getClass(), "flags", (short) 0);
        setField(term85158, term85158.getClass(), "node", term85159);
        setField(term85158, term85158.getClass(), "namespaces", null);
        setField(term85158, term85158.getClass(), "defaultNamespace", null);
        setField(term85158, term85158.getClass(), "id", null);
        setField(term85158, term85158.getClass(), "localNamespaceResolver", null);
        setIntField(term85158, term85158.getClass(), "index", 0);
        setBooleanField(term85158, term85158.getClass(), "attribute", false);
        setField(term85158, term85158.getClass(), "rootNode", null);
        setField(term85158, term85158.getClass(), "namespaceResolver", null);
        setField(term85158, term85158.getClass(), "parent", null);
        setField(term85158, term85158.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNamespaceURI", argTypes, term84656, args);
        assertTrue(recursiveEquals(term84656, term85158));
        assertTrue(recursiveEquals(retValue, null));
    }

};


