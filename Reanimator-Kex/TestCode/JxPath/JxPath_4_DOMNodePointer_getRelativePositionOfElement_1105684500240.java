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

public class DOMNodePointer_getRelativePositionOfElement_1105684500240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64609;
     Object term65074;

    public DOMNodePointer_getRelativePositionOfElement_1105684500240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64609 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64693 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        Object term64777 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        setShortField(term64693, term64693.getClass(), "flags", (short) 0);
        setField(term64693, term64693.getClass(), "previousSibling", term64777);
        setField(term64609, term64609.getClass(), "node", term64693);
        term65074 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65075 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        Object term65076 = newInstance(Class.forName("org.apache.html.dom.HTMLMetaElementImpl"));
        setField(term65075, term65075.getClass(), "name", null);
        setField(term65075, term65075.getClass(), "attributes", null);
        setField(term65075, term65075.getClass(), "ownerDocument", null);
        setField(term65075, term65075.getClass(), "firstChild", null);
        setField(term65075, term65075.getClass(), "fNodeListCache", null);
        setField(term65076, term65076.getClass(), "name", null);
        setField(term65076, term65076.getClass(), "attributes", null);
        setField(term65076, term65076.getClass(), "ownerDocument", null);
        setField(term65076, term65076.getClass(), "firstChild", null);
        setField(term65076, term65076.getClass(), "fNodeListCache", null);
        setField(term65076, term65076.getClass(), "previousSibling", null);
        setField(term65076, term65076.getClass(), "nextSibling", null);
        setField(term65076, term65076.getClass(), "ownerNode", null);
        setShortField(term65076, term65076.getClass(), "flags", (short) 0);
        setField(term65075, term65075.getClass(), "previousSibling", term65076);
        setField(term65075, term65075.getClass(), "nextSibling", null);
        setField(term65075, term65075.getClass(), "ownerNode", null);
        setShortField(term65075, term65075.getClass(), "flags", (short) 0);
        setField(term65074, term65074.getClass(), "node", term65075);
        setField(term65074, term65074.getClass(), "namespaces", null);
        setField(term65074, term65074.getClass(), "defaultNamespace", null);
        setField(term65074, term65074.getClass(), "id", null);
        setIntField(term65074, term65074.getClass(), "index", 0);
        setBooleanField(term65074, term65074.getClass(), "attribute", false);
        setField(term65074, term65074.getClass(), "rootNode", null);
        setField(term65074, term65074.getClass(), "namespaceResolver", null);
        setField(term65074, term65074.getClass(), "parent", null);
        setField(term65074, term65074.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfElement", argTypes, term64609, args);
        assertTrue(recursiveEquals(term64609, term65074));
    }

};


