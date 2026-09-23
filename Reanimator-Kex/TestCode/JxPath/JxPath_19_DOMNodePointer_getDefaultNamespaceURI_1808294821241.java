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

public class DOMNodePointer_getDefaultNamespaceURI_1808294821241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52579;
     Object term52708;

    public DOMNodePointer_getDefaultNamespaceURI_1808294821241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52579 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52657 = newInstance(Class.forName("org.apache.wml.dom.WMLBigElementImpl"));
        setField(term52579, term52579.getClass(), "defaultNamespace", null);
        setField(term52579, term52579.getClass(), "node", term52657);
        term52708 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term52709 = newInstance(Class.forName("org.apache.wml.dom.WMLBigElementImpl"));
        setField(term52709, term52709.getClass(), "name", null);
        setField(term52709, term52709.getClass(), "attributes", null);
        setField(term52709, term52709.getClass(), "ownerDocument", null);
        setField(term52709, term52709.getClass(), "firstChild", null);
        setField(term52709, term52709.getClass(), "fNodeListCache", null);
        setField(term52709, term52709.getClass(), "previousSibling", null);
        setField(term52709, term52709.getClass(), "nextSibling", null);
        setField(term52709, term52709.getClass(), "ownerNode", null);
        setShortField(term52709, term52709.getClass(), "flags", (short) 0);
        setField(term52708, term52708.getClass(), "node", term52709);
        setField(term52708, term52708.getClass(), "namespaces", null);
        setField(term52708, term52708.getClass(), "defaultNamespace", "");
        setField(term52708, term52708.getClass(), "id", null);
        setField(term52708, term52708.getClass(), "localNamespaceResolver", null);
        setIntField(term52708, term52708.getClass(), "index", 0);
        setBooleanField(term52708, term52708.getClass(), "attribute", false);
        setField(term52708, term52708.getClass(), "namespaceResolver", null);
        setField(term52708, term52708.getClass(), "rootNode", null);
        setField(term52708, term52708.getClass(), "parent", null);
        setField(term52708, term52708.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDefaultNamespaceURI", argTypes, term52579, args);
        assertTrue(recursiveEquals(term52579, term52708));
        assertTrue(recursiveEquals(retValue, null));
    }

};


