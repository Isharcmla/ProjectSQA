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

public class DOMNodePointer_getRelativePositionOfPI_202037106371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131798;
     Object term132100;

    public DOMNodePointer_getRelativePositionOfPI_202037106371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131798 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term131888 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term131978 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term132062 = newInstance(Class.forName("org.apache.html.dom.HTMLLinkElementImpl"));
        setShortField(term131888, term131888.getClass(), "flags", (short) 0);
        setShortField(term131978, term131978.getClass(), "flags", (short) 0);
        setField(term131978, term131978.getClass(), "previousSibling", term132062);
        setField(term131888, term131888.getClass(), "previousSibling", term131978);
        setField(term131798, term131798.getClass(), "node", term131888);
        term132100 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term132101 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term132102 = newInstance(Class.forName("org.apache.html.dom.HTMLIsIndexElementImpl"));
        Object term132103 = newInstance(Class.forName("org.apache.html.dom.HTMLLinkElementImpl"));
        setField(term132101, term132101.getClass(), "name", null);
        setField(term132101, term132101.getClass(), "attributes", null);
        setField(term132101, term132101.getClass(), "ownerDocument", null);
        setField(term132101, term132101.getClass(), "firstChild", null);
        setField(term132101, term132101.getClass(), "fNodeListCache", null);
        setField(term132102, term132102.getClass(), "name", null);
        setField(term132102, term132102.getClass(), "attributes", null);
        setField(term132102, term132102.getClass(), "ownerDocument", null);
        setField(term132102, term132102.getClass(), "firstChild", null);
        setField(term132102, term132102.getClass(), "fNodeListCache", null);
        setField(term132103, term132103.getClass(), "name", null);
        setField(term132103, term132103.getClass(), "attributes", null);
        setField(term132103, term132103.getClass(), "ownerDocument", null);
        setField(term132103, term132103.getClass(), "firstChild", null);
        setField(term132103, term132103.getClass(), "fNodeListCache", null);
        setField(term132103, term132103.getClass(), "previousSibling", null);
        setField(term132103, term132103.getClass(), "nextSibling", null);
        setField(term132103, term132103.getClass(), "ownerNode", null);
        setShortField(term132103, term132103.getClass(), "flags", (short) 0);
        setField(term132102, term132102.getClass(), "previousSibling", term132103);
        setField(term132102, term132102.getClass(), "nextSibling", null);
        setField(term132102, term132102.getClass(), "ownerNode", null);
        setShortField(term132102, term132102.getClass(), "flags", (short) 0);
        setField(term132101, term132101.getClass(), "previousSibling", term132102);
        setField(term132101, term132101.getClass(), "nextSibling", null);
        setField(term132101, term132101.getClass(), "ownerNode", null);
        setShortField(term132101, term132101.getClass(), "flags", (short) 0);
        setField(term132100, term132100.getClass(), "node", term132101);
        setField(term132100, term132100.getClass(), "namespaces", null);
        setField(term132100, term132100.getClass(), "defaultNamespace", null);
        setField(term132100, term132100.getClass(), "id", null);
        setIntField(term132100, term132100.getClass(), "index", 0);
        setBooleanField(term132100, term132100.getClass(), "attribute", false);
        setField(term132100, term132100.getClass(), "rootNode", null);
        setField(term132100, term132100.getClass(), "namespaceResolver", null);
        setField(term132100, term132100.getClass(), "parent", null);
        setField(term132100, term132100.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getRelativePositionOfPI", argTypes, term131798, args);
        assertTrue(recursiveEquals(term131798, term132100));
    }

};


