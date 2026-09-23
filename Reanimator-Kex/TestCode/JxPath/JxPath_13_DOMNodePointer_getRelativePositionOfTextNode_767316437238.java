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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64130;
     Object term64724;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64130 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64214 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term64298 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term64382 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setShortField(term64214, term64214.getClass(), "flags", (short) 0);
        setShortField(term64298, term64298.getClass(), "flags", (short) 0);
        setField(term64298, term64298.getClass(), "previousSibling", term64382);
        setField(term64214, term64214.getClass(), "previousSibling", term64298);
        setField(term64130, term64130.getClass(), "node", term64214);
        term64724 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term64725 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term64726 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term64727 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setField(term64725, term64725.getClass(), "name", null);
        setField(term64725, term64725.getClass(), "attributes", null);
        setField(term64725, term64725.getClass(), "ownerDocument", null);
        setField(term64725, term64725.getClass(), "firstChild", null);
        setField(term64725, term64725.getClass(), "fNodeListCache", null);
        setField(term64726, term64726.getClass(), "name", null);
        setField(term64726, term64726.getClass(), "attributes", null);
        setField(term64726, term64726.getClass(), "ownerDocument", null);
        setField(term64726, term64726.getClass(), "firstChild", null);
        setField(term64726, term64726.getClass(), "fNodeListCache", null);
        setField(term64727, term64727.getClass(), "name", null);
        setField(term64727, term64727.getClass(), "attributes", null);
        setField(term64727, term64727.getClass(), "ownerDocument", null);
        setField(term64727, term64727.getClass(), "firstChild", null);
        setField(term64727, term64727.getClass(), "fNodeListCache", null);
        setField(term64727, term64727.getClass(), "previousSibling", null);
        setField(term64727, term64727.getClass(), "nextSibling", null);
        setField(term64727, term64727.getClass(), "ownerNode", null);
        setShortField(term64727, term64727.getClass(), "flags", (short) 0);
        setField(term64726, term64726.getClass(), "previousSibling", term64727);
        setField(term64726, term64726.getClass(), "nextSibling", null);
        setField(term64726, term64726.getClass(), "ownerNode", null);
        setShortField(term64726, term64726.getClass(), "flags", (short) 0);
        setField(term64725, term64725.getClass(), "previousSibling", term64726);
        setField(term64725, term64725.getClass(), "nextSibling", null);
        setField(term64725, term64725.getClass(), "ownerNode", null);
        setShortField(term64725, term64725.getClass(), "flags", (short) 0);
        setField(term64724, term64724.getClass(), "node", term64725);
        setField(term64724, term64724.getClass(), "namespaces", null);
        setField(term64724, term64724.getClass(), "defaultNamespace", null);
        setField(term64724, term64724.getClass(), "id", null);
        setIntField(term64724, term64724.getClass(), "index", 0);
        setBooleanField(term64724, term64724.getClass(), "attribute", false);
        setField(term64724, term64724.getClass(), "rootNode", null);
        setField(term64724, term64724.getClass(), "namespaceResolver", null);
        setField(term64724, term64724.getClass(), "parent", null);
        setField(term64724, term64724.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term64130, args);
        assertTrue(recursiveEquals(term64130, term64724));
    }

};


