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

public class DOMNodePointer_getRelativePositionByQName_171057332125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24044;
     Object term24154;

    public DOMNodePointer_getRelativePositionByQName_171057332125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24044 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24128 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term24044, term24044.getClass(), "node", term24128);
        term24154 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term24155 = newInstance(Class.forName("org.apache.wml.dom.WMLSetvarElementImpl"));
        setField(term24155, term24155.getClass(), "name", null);
        setField(term24155, term24155.getClass(), "attributes", null);
        setField(term24155, term24155.getClass(), "ownerDocument", null);
        setField(term24155, term24155.getClass(), "firstChild", null);
        setField(term24155, term24155.getClass(), "fNodeListCache", null);
        setField(term24155, term24155.getClass(), "previousSibling", null);
        setField(term24155, term24155.getClass(), "nextSibling", null);
        setField(term24155, term24155.getClass(), "ownerNode", null);
        setShortField(term24155, term24155.getClass(), "flags", (short) 0);
        setField(term24154, term24154.getClass(), "node", term24155);
        setField(term24154, term24154.getClass(), "namespaces", null);
        setField(term24154, term24154.getClass(), "defaultNamespace", null);
        setField(term24154, term24154.getClass(), "id", null);
        setField(term24154, term24154.getClass(), "localNamespaceResolver", null);
        setIntField(term24154, term24154.getClass(), "index", 0);
        setBooleanField(term24154, term24154.getClass(), "attribute", false);
        setField(term24154, term24154.getClass(), "namespaceResolver", null);
        setField(term24154, term24154.getClass(), "rootNode", null);
        setField(term24154, term24154.getClass(), "parent", null);
        setField(term24154, term24154.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionByQName", argTypes, term24044, args);
        assertTrue(recursiveEquals(term24044, term24154));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


