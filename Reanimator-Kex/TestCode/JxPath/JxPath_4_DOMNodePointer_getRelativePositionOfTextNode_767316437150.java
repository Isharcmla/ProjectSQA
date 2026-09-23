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
     Object term28484;
     Object term28792;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28484 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28578 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setField(term28484, term28484.getClass(), "node", term28578);
        term28792 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term28793 = newInstance(Class.forName("org.apache.html.dom.HTMLParagraphElementImpl"));
        setField(term28793, term28793.getClass(), "name", null);
        setField(term28793, term28793.getClass(), "attributes", null);
        setField(term28793, term28793.getClass(), "ownerDocument", null);
        setField(term28793, term28793.getClass(), "firstChild", null);
        setField(term28793, term28793.getClass(), "fNodeListCache", null);
        setField(term28793, term28793.getClass(), "previousSibling", null);
        setField(term28793, term28793.getClass(), "nextSibling", null);
        setField(term28793, term28793.getClass(), "ownerNode", null);
        setShortField(term28793, term28793.getClass(), "flags", (short) 0);
        setField(term28792, term28792.getClass(), "node", term28793);
        setField(term28792, term28792.getClass(), "namespaces", null);
        setField(term28792, term28792.getClass(), "defaultNamespace", null);
        setField(term28792, term28792.getClass(), "id", null);
        setIntField(term28792, term28792.getClass(), "index", 0);
        setBooleanField(term28792, term28792.getClass(), "attribute", false);
        setField(term28792, term28792.getClass(), "rootNode", null);
        setField(term28792, term28792.getClass(), "namespaceResolver", null);
        setField(term28792, term28792.getClass(), "parent", null);
        setField(term28792, term28792.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfTextNode", argTypes, term28484, args);
        assertTrue(recursiveEquals(term28484, term28792));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


