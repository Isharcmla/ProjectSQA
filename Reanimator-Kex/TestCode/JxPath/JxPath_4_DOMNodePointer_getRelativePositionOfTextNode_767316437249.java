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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66372;
     Object term66749;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66372 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66466 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term66560 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term66654 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setShortField(term66466, term66466.getClass(), "flags", (short) 0);
        setShortField(term66560, term66560.getClass(), "flags", (short) 0);
        setField(term66560, term66560.getClass(), "previousSibling", term66654);
        setField(term66466, term66466.getClass(), "previousSibling", term66560);
        setField(term66372, term66372.getClass(), "node", term66466);
        term66749 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term66750 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term66751 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        Object term66752 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setField(term66750, term66750.getClass(), "name", null);
        setField(term66750, term66750.getClass(), "attributes", null);
        setField(term66750, term66750.getClass(), "ownerDocument", null);
        setField(term66750, term66750.getClass(), "firstChild", null);
        setField(term66750, term66750.getClass(), "fNodeListCache", null);
        setField(term66751, term66751.getClass(), "name", null);
        setField(term66751, term66751.getClass(), "attributes", null);
        setField(term66751, term66751.getClass(), "ownerDocument", null);
        setField(term66751, term66751.getClass(), "firstChild", null);
        setField(term66751, term66751.getClass(), "fNodeListCache", null);
        setField(term66752, term66752.getClass(), "name", null);
        setField(term66752, term66752.getClass(), "attributes", null);
        setField(term66752, term66752.getClass(), "ownerDocument", null);
        setField(term66752, term66752.getClass(), "firstChild", null);
        setField(term66752, term66752.getClass(), "fNodeListCache", null);
        setField(term66752, term66752.getClass(), "previousSibling", null);
        setField(term66752, term66752.getClass(), "nextSibling", null);
        setField(term66752, term66752.getClass(), "ownerNode", null);
        setShortField(term66752, term66752.getClass(), "flags", (short) 0);
        setField(term66751, term66751.getClass(), "previousSibling", term66752);
        setField(term66751, term66751.getClass(), "nextSibling", null);
        setField(term66751, term66751.getClass(), "ownerNode", null);
        setShortField(term66751, term66751.getClass(), "flags", (short) 0);
        setField(term66750, term66750.getClass(), "previousSibling", term66751);
        setField(term66750, term66750.getClass(), "nextSibling", null);
        setField(term66750, term66750.getClass(), "ownerNode", null);
        setShortField(term66750, term66750.getClass(), "flags", (short) 0);
        setField(term66749, term66749.getClass(), "node", term66750);
        setField(term66749, term66749.getClass(), "namespaces", null);
        setField(term66749, term66749.getClass(), "defaultNamespace", null);
        setField(term66749, term66749.getClass(), "id", null);
        setIntField(term66749, term66749.getClass(), "index", 0);
        setBooleanField(term66749, term66749.getClass(), "attribute", false);
        setField(term66749, term66749.getClass(), "rootNode", null);
        setField(term66749, term66749.getClass(), "namespaceResolver", null);
        setField(term66749, term66749.getClass(), "parent", null);
        setField(term66749, term66749.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term66372, args);
        assertTrue(recursiveEquals(term66372, term66749));
    }

};


