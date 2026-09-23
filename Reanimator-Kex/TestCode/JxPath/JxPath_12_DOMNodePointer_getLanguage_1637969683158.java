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

public class DOMNodePointer_getLanguage_1637969683158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26942;
     Object term27848;

    public DOMNodePointer_getLanguage_1637969683158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26942 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term27030 = newInstance(Class.forName("org.apache.html.dom.HTMLButtonElementImpl"));
        setField(term26942, term26942.getClass(), "node", term27030);
        term27848 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term27849 = newInstance(Class.forName("org.apache.html.dom.HTMLButtonElementImpl"));
        setField(term27849, term27849.getClass(), "name", null);
        setField(term27849, term27849.getClass(), "attributes", null);
        setField(term27849, term27849.getClass(), "ownerDocument", null);
        setField(term27849, term27849.getClass(), "firstChild", null);
        setField(term27849, term27849.getClass(), "fNodeListCache", null);
        setField(term27849, term27849.getClass(), "previousSibling", null);
        setField(term27849, term27849.getClass(), "nextSibling", null);
        setField(term27849, term27849.getClass(), "ownerNode", null);
        setShortField(term27849, term27849.getClass(), "flags", (short) 0);
        setField(term27848, term27848.getClass(), "node", term27849);
        setField(term27848, term27848.getClass(), "namespaces", null);
        setField(term27848, term27848.getClass(), "defaultNamespace", null);
        setField(term27848, term27848.getClass(), "id", null);
        setIntField(term27848, term27848.getClass(), "index", 0);
        setBooleanField(term27848, term27848.getClass(), "attribute", false);
        setField(term27848, term27848.getClass(), "rootNode", null);
        setField(term27848, term27848.getClass(), "namespaceResolver", null);
        setField(term27848, term27848.getClass(), "parent", null);
        setField(term27848, term27848.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term26942, args);
        assertTrue(recursiveEquals(term26942, term27848));
        assertTrue(recursiveEquals(retValue, null));
    }

};


