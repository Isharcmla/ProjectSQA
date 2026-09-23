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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63479;
     Object term63669;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63561 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        Object term63643 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setShortField(term63561, term63561.getClass(), "flags", (short) 0);
        setField(term63561, term63561.getClass(), "previousSibling", term63643);
        setField(term63479, term63479.getClass(), "node", term63561);
        term63669 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term63670 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        Object term63671 = newInstance(Class.forName("org.apache.wml.dom.WMLTableElementImpl"));
        setField(term63670, term63670.getClass(), "name", null);
        setField(term63670, term63670.getClass(), "attributes", null);
        setField(term63670, term63670.getClass(), "ownerDocument", null);
        setField(term63670, term63670.getClass(), "firstChild", null);
        setField(term63670, term63670.getClass(), "fNodeListCache", null);
        setField(term63671, term63671.getClass(), "name", null);
        setField(term63671, term63671.getClass(), "attributes", null);
        setField(term63671, term63671.getClass(), "ownerDocument", null);
        setField(term63671, term63671.getClass(), "firstChild", null);
        setField(term63671, term63671.getClass(), "fNodeListCache", null);
        setField(term63671, term63671.getClass(), "previousSibling", null);
        setField(term63671, term63671.getClass(), "nextSibling", null);
        setField(term63671, term63671.getClass(), "ownerNode", null);
        setShortField(term63671, term63671.getClass(), "flags", (short) 0);
        setField(term63670, term63670.getClass(), "previousSibling", term63671);
        setField(term63670, term63670.getClass(), "nextSibling", null);
        setField(term63670, term63670.getClass(), "ownerNode", null);
        setShortField(term63670, term63670.getClass(), "flags", (short) 0);
        setField(term63669, term63669.getClass(), "node", term63670);
        setField(term63669, term63669.getClass(), "namespaces", null);
        setField(term63669, term63669.getClass(), "defaultNamespace", null);
        setField(term63669, term63669.getClass(), "id", null);
        setField(term63669, term63669.getClass(), "localNamespaceResolver", null);
        setIntField(term63669, term63669.getClass(), "index", 0);
        setBooleanField(term63669, term63669.getClass(), "attribute", false);
        setField(term63669, term63669.getClass(), "rootNode", null);
        setField(term63669, term63669.getClass(), "namespaceResolver", null);
        setField(term63669, term63669.getClass(), "parent", null);
        setField(term63669, term63669.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term63479, args);
        assertTrue(recursiveEquals(term63479, term63669));
    }

};


