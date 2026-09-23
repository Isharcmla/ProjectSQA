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

public class DOMNodePointer_stringValue_2129170303111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15893;
     Object term15979;
     Object term17897;
     Object term17898;

    public DOMNodePointer_stringValue_2129170303111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15893 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term15979 = newInstance(Class.forName("org.apache.html.dom.HTMLImageElementImpl"));
        term17897 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term17897, term17897.getClass(), "node", null);
        setField(term17897, term17897.getClass(), "namespaces", null);
        setField(term17897, term17897.getClass(), "defaultNamespace", null);
        setField(term17897, term17897.getClass(), "id", null);
        setIntField(term17897, term17897.getClass(), "index", 0);
        setBooleanField(term17897, term17897.getClass(), "attribute", false);
        setField(term17897, term17897.getClass(), "rootNode", null);
        setField(term17897, term17897.getClass(), "namespaceResolver", null);
        setField(term17897, term17897.getClass(), "parent", null);
        setField(term17897, term17897.getClass(), "locale", null);
        term17898 = newInstance(Class.forName("org.apache.html.dom.HTMLImageElementImpl"));
        setField(term17898, term17898.getClass(), "name", null);
        setField(term17898, term17898.getClass(), "attributes", null);
        setField(term17898, term17898.getClass(), "ownerDocument", null);
        setField(term17898, term17898.getClass(), "firstChild", null);
        setField(term17898, term17898.getClass(), "fNodeListCache", null);
        setField(term17898, term17898.getClass(), "previousSibling", null);
        setField(term17898, term17898.getClass(), "nextSibling", null);
        setField(term17898, term17898.getClass(), "ownerNode", null);
        setShortField(term17898, term17898.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term15979;
        Object retValue = callMethod(klass, "stringValue", argTypes, term15893, args);
        assertTrue(recursiveEquals(term15893, term17897));
        assertTrue(recursiveEquals(term15979, term17898));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


