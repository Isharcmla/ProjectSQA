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

public class DOMNodePointer_getRelativePositionOfElement_1105684500169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32659;
     Object term33018;

    public DOMNodePointer_getRelativePositionOfElement_1105684500169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32659 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term32743 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setField(term32659, term32659.getClass(), "node", term32743);
        term33018 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term33019 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setField(term33019, term33019.getClass(), "name", null);
        setField(term33019, term33019.getClass(), "attributes", null);
        setField(term33019, term33019.getClass(), "ownerDocument", null);
        setField(term33019, term33019.getClass(), "firstChild", null);
        setField(term33019, term33019.getClass(), "fNodeListCache", null);
        setField(term33019, term33019.getClass(), "previousSibling", null);
        setField(term33019, term33019.getClass(), "nextSibling", null);
        setField(term33019, term33019.getClass(), "ownerNode", null);
        setShortField(term33019, term33019.getClass(), "flags", (short) 0);
        setField(term33018, term33018.getClass(), "node", term33019);
        setField(term33018, term33018.getClass(), "namespaces", null);
        setField(term33018, term33018.getClass(), "defaultNamespace", null);
        setField(term33018, term33018.getClass(), "id", null);
        setIntField(term33018, term33018.getClass(), "index", 0);
        setBooleanField(term33018, term33018.getClass(), "attribute", false);
        setField(term33018, term33018.getClass(), "rootNode", null);
        setField(term33018, term33018.getClass(), "namespaceResolver", null);
        setField(term33018, term33018.getClass(), "parent", null);
        setField(term33018, term33018.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRelativePositionOfElement", argTypes, term32659, args);
        assertTrue(recursiveEquals(term32659, term33018));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


