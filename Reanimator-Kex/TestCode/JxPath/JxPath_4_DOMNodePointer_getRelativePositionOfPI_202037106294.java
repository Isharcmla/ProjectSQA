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

public class DOMNodePointer_getRelativePositionOfPI_202037106294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88101;
     Object term89823;

    public DOMNodePointer_getRelativePositionOfPI_202037106294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88101 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term88191 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term88281 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term88371 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setShortField(term88191, term88191.getClass(), "flags", (short) 0);
        setShortField(term88281, term88281.getClass(), "flags", (short) 0);
        setField(term88281, term88281.getClass(), "previousSibling", term88371);
        setField(term88191, term88191.getClass(), "previousSibling", term88281);
        setField(term88101, term88101.getClass(), "node", term88191);
        term89823 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term89824 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term89825 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term89826 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        setField(term89824, term89824.getClass(), "name", null);
        setField(term89824, term89824.getClass(), "attributes", null);
        setField(term89824, term89824.getClass(), "ownerDocument", null);
        setField(term89824, term89824.getClass(), "firstChild", null);
        setField(term89824, term89824.getClass(), "fNodeListCache", null);
        setField(term89825, term89825.getClass(), "name", null);
        setField(term89825, term89825.getClass(), "attributes", null);
        setField(term89825, term89825.getClass(), "ownerDocument", null);
        setField(term89825, term89825.getClass(), "firstChild", null);
        setField(term89825, term89825.getClass(), "fNodeListCache", null);
        setField(term89826, term89826.getClass(), "name", null);
        setField(term89826, term89826.getClass(), "attributes", null);
        setField(term89826, term89826.getClass(), "ownerDocument", null);
        setField(term89826, term89826.getClass(), "firstChild", null);
        setField(term89826, term89826.getClass(), "fNodeListCache", null);
        setField(term89826, term89826.getClass(), "previousSibling", null);
        setField(term89826, term89826.getClass(), "nextSibling", null);
        setField(term89826, term89826.getClass(), "ownerNode", null);
        setShortField(term89826, term89826.getClass(), "flags", (short) 0);
        setField(term89825, term89825.getClass(), "previousSibling", term89826);
        setField(term89825, term89825.getClass(), "nextSibling", null);
        setField(term89825, term89825.getClass(), "ownerNode", null);
        setShortField(term89825, term89825.getClass(), "flags", (short) 0);
        setField(term89824, term89824.getClass(), "previousSibling", term89825);
        setField(term89824, term89824.getClass(), "nextSibling", null);
        setField(term89824, term89824.getClass(), "ownerNode", null);
        setShortField(term89824, term89824.getClass(), "flags", (short) 0);
        setField(term89823, term89823.getClass(), "node", term89824);
        setField(term89823, term89823.getClass(), "namespaces", null);
        setField(term89823, term89823.getClass(), "defaultNamespace", null);
        setField(term89823, term89823.getClass(), "id", null);
        setIntField(term89823, term89823.getClass(), "index", 0);
        setBooleanField(term89823, term89823.getClass(), "attribute", false);
        setField(term89823, term89823.getClass(), "rootNode", null);
        setField(term89823, term89823.getClass(), "namespaceResolver", null);
        setField(term89823, term89823.getClass(), "parent", null);
        setField(term89823, term89823.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term88101, args);
        assertTrue(recursiveEquals(term88101, term89823));
    }

};


