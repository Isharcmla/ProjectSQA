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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57110;
     Object term59048;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57110 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term57190 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        Object term57270 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        setShortField(term57190, term57190.getClass(), "flags", (short) 0);
        setField(term57190, term57190.getClass(), "previousSibling", term57270);
        setField(term57110, term57110.getClass(), "node", term57190);
        term59048 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term59049 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        Object term59050 = newInstance(Class.forName("org.apache.html.dom.HTMLBRElementImpl"));
        setField(term59049, term59049.getClass(), "name", null);
        setField(term59049, term59049.getClass(), "attributes", null);
        setField(term59049, term59049.getClass(), "ownerDocument", null);
        setField(term59049, term59049.getClass(), "firstChild", null);
        setField(term59049, term59049.getClass(), "fNodeListCache", null);
        setField(term59050, term59050.getClass(), "name", null);
        setField(term59050, term59050.getClass(), "attributes", null);
        setField(term59050, term59050.getClass(), "ownerDocument", null);
        setField(term59050, term59050.getClass(), "firstChild", null);
        setField(term59050, term59050.getClass(), "fNodeListCache", null);
        setField(term59050, term59050.getClass(), "previousSibling", null);
        setField(term59050, term59050.getClass(), "nextSibling", null);
        setField(term59050, term59050.getClass(), "ownerNode", null);
        setShortField(term59050, term59050.getClass(), "flags", (short) 0);
        setField(term59049, term59049.getClass(), "previousSibling", term59050);
        setField(term59049, term59049.getClass(), "nextSibling", null);
        setField(term59049, term59049.getClass(), "ownerNode", null);
        setShortField(term59049, term59049.getClass(), "flags", (short) 0);
        setField(term59048, term59048.getClass(), "node", term59049);
        setField(term59048, term59048.getClass(), "namespaces", null);
        setField(term59048, term59048.getClass(), "defaultNamespace", null);
        setField(term59048, term59048.getClass(), "id", null);
        setField(term59048, term59048.getClass(), "localNamespaceResolver", null);
        setIntField(term59048, term59048.getClass(), "index", 0);
        setBooleanField(term59048, term59048.getClass(), "attribute", false);
        setField(term59048, term59048.getClass(), "namespaceResolver", null);
        setField(term59048, term59048.getClass(), "exceptionHandler", null);
        setField(term59048, term59048.getClass(), "rootNode", null);
        setField(term59048, term59048.getClass(), "parent", null);
        setField(term59048, term59048.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term57110, args);
        assertTrue(recursiveEquals(term57110, term59048));
    }

};


