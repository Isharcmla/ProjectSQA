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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43967;
     Object term46167;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43967 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term44075 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        setField(term43967, term43967.getClass(), "node", term44075);
        term46167 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term46168 = newInstance(Class.forName("org.apache.xerces.dom.DeferredElementDefinitionImpl"));
        setIntField(term46168, term46168.getClass(), "fNodeIndex", 0);
        setField(term46168, term46168.getClass(), "name", null);
        setField(term46168, term46168.getClass(), "attributes", null);
        setField(term46168, term46168.getClass(), "ownerDocument", null);
        setField(term46168, term46168.getClass(), "firstChild", null);
        setField(term46168, term46168.getClass(), "fNodeListCache", null);
        setField(term46168, term46168.getClass(), "previousSibling", null);
        setField(term46168, term46168.getClass(), "nextSibling", null);
        setField(term46168, term46168.getClass(), "ownerNode", null);
        setShortField(term46168, term46168.getClass(), "flags", (short) 0);
        setField(term46167, term46167.getClass(), "node", term46168);
        setField(term46167, term46167.getClass(), "namespaces", null);
        setField(term46167, term46167.getClass(), "defaultNamespace", null);
        setField(term46167, term46167.getClass(), "id", null);
        setIntField(term46167, term46167.getClass(), "index", 0);
        setBooleanField(term46167, term46167.getClass(), "attribute", false);
        setField(term46167, term46167.getClass(), "rootNode", null);
        setField(term46167, term46167.getClass(), "namespaceResolver", null);
        setField(term46167, term46167.getClass(), "parent", null);
        setField(term46167, term46167.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term43967, args);
        assertTrue(recursiveEquals(term43967, term46167));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


