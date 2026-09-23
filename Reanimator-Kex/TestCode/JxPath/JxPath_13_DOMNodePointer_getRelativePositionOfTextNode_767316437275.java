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

public class DOMNodePointer_getRelativePositionOfTextNode_767316437275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79804;
     Object term80196;

    public DOMNodePointer_getRelativePositionOfTextNode_767316437275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79804 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term79888 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term79972 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term80056 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term80140 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setShortField(term79888, term79888.getClass(), "flags", (short) 0);
        setShortField(term79972, term79972.getClass(), "flags", (short) 0);
        setShortField(term80056, term80056.getClass(), "flags", (short) 0);
        setField(term80056, term80056.getClass(), "previousSibling", term80140);
        setField(term79972, term79972.getClass(), "previousSibling", term80056);
        setField(term79888, term79888.getClass(), "previousSibling", term79972);
        setField(term79804, term79804.getClass(), "node", term79888);
        term80196 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term80197 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term80198 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term80199 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        Object term80200 = newInstance(Class.forName("org.apache.wml.dom.WMLSelectElementImpl"));
        setField(term80197, term80197.getClass(), "name", null);
        setField(term80197, term80197.getClass(), "attributes", null);
        setField(term80197, term80197.getClass(), "ownerDocument", null);
        setField(term80197, term80197.getClass(), "firstChild", null);
        setField(term80197, term80197.getClass(), "fNodeListCache", null);
        setField(term80198, term80198.getClass(), "name", null);
        setField(term80198, term80198.getClass(), "attributes", null);
        setField(term80198, term80198.getClass(), "ownerDocument", null);
        setField(term80198, term80198.getClass(), "firstChild", null);
        setField(term80198, term80198.getClass(), "fNodeListCache", null);
        setField(term80199, term80199.getClass(), "name", null);
        setField(term80199, term80199.getClass(), "attributes", null);
        setField(term80199, term80199.getClass(), "ownerDocument", null);
        setField(term80199, term80199.getClass(), "firstChild", null);
        setField(term80199, term80199.getClass(), "fNodeListCache", null);
        setField(term80200, term80200.getClass(), "name", null);
        setField(term80200, term80200.getClass(), "attributes", null);
        setField(term80200, term80200.getClass(), "ownerDocument", null);
        setField(term80200, term80200.getClass(), "firstChild", null);
        setField(term80200, term80200.getClass(), "fNodeListCache", null);
        setField(term80200, term80200.getClass(), "previousSibling", null);
        setField(term80200, term80200.getClass(), "nextSibling", null);
        setField(term80200, term80200.getClass(), "ownerNode", null);
        setShortField(term80200, term80200.getClass(), "flags", (short) 0);
        setField(term80199, term80199.getClass(), "previousSibling", term80200);
        setField(term80199, term80199.getClass(), "nextSibling", null);
        setField(term80199, term80199.getClass(), "ownerNode", null);
        setShortField(term80199, term80199.getClass(), "flags", (short) 0);
        setField(term80198, term80198.getClass(), "previousSibling", term80199);
        setField(term80198, term80198.getClass(), "nextSibling", null);
        setField(term80198, term80198.getClass(), "ownerNode", null);
        setShortField(term80198, term80198.getClass(), "flags", (short) 0);
        setField(term80197, term80197.getClass(), "previousSibling", term80198);
        setField(term80197, term80197.getClass(), "nextSibling", null);
        setField(term80197, term80197.getClass(), "ownerNode", null);
        setShortField(term80197, term80197.getClass(), "flags", (short) 0);
        setField(term80196, term80196.getClass(), "node", term80197);
        setField(term80196, term80196.getClass(), "namespaces", null);
        setField(term80196, term80196.getClass(), "defaultNamespace", null);
        setField(term80196, term80196.getClass(), "id", null);
        setIntField(term80196, term80196.getClass(), "index", 0);
        setBooleanField(term80196, term80196.getClass(), "attribute", false);
        setField(term80196, term80196.getClass(), "rootNode", null);
        setField(term80196, term80196.getClass(), "namespaceResolver", null);
        setField(term80196, term80196.getClass(), "parent", null);
        setField(term80196, term80196.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionOfTextNode", argTypes, term79804, args);
        assertTrue(recursiveEquals(term79804, term80196));
    }

};


