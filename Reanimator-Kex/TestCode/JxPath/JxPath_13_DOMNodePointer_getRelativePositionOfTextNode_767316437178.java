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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35941;
     Object term36443;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35941 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term36025 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term36109 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setShortField(term36025, term36025.getClass(), "flags", (short) 0);
        setField(term36025, term36025.getClass(), "previousSibling", term36109);
        setField(term35941, term35941.getClass(), "node", term36025);
        term36443 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term36444 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term36445 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setField(term36444, term36444.getClass(), "name", null);
        setField(term36444, term36444.getClass(), "attributes", null);
        setField(term36444, term36444.getClass(), "ownerDocument", null);
        setField(term36444, term36444.getClass(), "firstChild", null);
        setField(term36444, term36444.getClass(), "fNodeListCache", null);
        setField(term36445, term36445.getClass(), "name", null);
        setField(term36445, term36445.getClass(), "attributes", null);
        setField(term36445, term36445.getClass(), "ownerDocument", null);
        setField(term36445, term36445.getClass(), "firstChild", null);
        setField(term36445, term36445.getClass(), "fNodeListCache", null);
        setField(term36445, term36445.getClass(), "previousSibling", null);
        setField(term36445, term36445.getClass(), "nextSibling", null);
        setField(term36445, term36445.getClass(), "ownerNode", null);
        setShortField(term36445, term36445.getClass(), "flags", (short) 0);
        setField(term36444, term36444.getClass(), "previousSibling", term36445);
        setField(term36444, term36444.getClass(), "nextSibling", null);
        setField(term36444, term36444.getClass(), "ownerNode", null);
        setShortField(term36444, term36444.getClass(), "flags", (short) 0);
        setField(term36443, term36443.getClass(), "node", term36444);
        setField(term36443, term36443.getClass(), "namespaces", null);
        setField(term36443, term36443.getClass(), "defaultNamespace", null);
        setField(term36443, term36443.getClass(), "id", null);
        setIntField(term36443, term36443.getClass(), "index", 0);
        setBooleanField(term36443, term36443.getClass(), "attribute", false);
        setField(term36443, term36443.getClass(), "rootNode", null);
        setField(term36443, term36443.getClass(), "namespaceResolver", null);
        setField(term36443, term36443.getClass(), "parent", null);
        setField(term36443, term36443.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term35941, args);
        assertTrue(recursiveEquals(term35941, term36443));
    }

};


