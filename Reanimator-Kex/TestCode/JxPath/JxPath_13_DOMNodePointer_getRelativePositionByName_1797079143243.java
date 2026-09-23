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

public class DOMNodePointer_getRelativePositionByName_1797079143243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65047;
     Object term65596;

    public DOMNodePointer_getRelativePositionByName_1797079143243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65047 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65129 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        Object term65211 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        setShortField(term65129, term65129.getClass(), "flags", (short) 0);
        setShortField(term65211, term65211.getClass(), "flags", (short) 0);
        setField(term65211, term65211.getClass(), "name", "");
        setField(term65129, term65129.getClass(), "previousSibling", term65211);
        setField(term65129, term65129.getClass(), "name", "");
        setField(term65047, term65047.getClass(), "node", term65129);
        term65596 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term65597 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        Object term65600 = newInstance(Class.forName("org.apache.html.dom.HTMLDivElementImpl"));
        setField(term65597, term65597.getClass(), "name", "");
        setField(term65597, term65597.getClass(), "attributes", null);
        setField(term65597, term65597.getClass(), "ownerDocument", null);
        setField(term65597, term65597.getClass(), "firstChild", null);
        setField(term65597, term65597.getClass(), "fNodeListCache", null);
        setField(term65600, term65600.getClass(), "name", "");
        setField(term65600, term65600.getClass(), "attributes", null);
        setField(term65600, term65600.getClass(), "ownerDocument", null);
        setField(term65600, term65600.getClass(), "firstChild", null);
        setField(term65600, term65600.getClass(), "fNodeListCache", null);
        setField(term65600, term65600.getClass(), "previousSibling", null);
        setField(term65600, term65600.getClass(), "nextSibling", null);
        setField(term65600, term65600.getClass(), "ownerNode", null);
        setShortField(term65600, term65600.getClass(), "flags", (short) 0);
        setField(term65597, term65597.getClass(), "previousSibling", term65600);
        setField(term65597, term65597.getClass(), "nextSibling", null);
        setField(term65597, term65597.getClass(), "ownerNode", null);
        setShortField(term65597, term65597.getClass(), "flags", (short) 0);
        setField(term65596, term65596.getClass(), "node", term65597);
        setField(term65596, term65596.getClass(), "namespaces", null);
        setField(term65596, term65596.getClass(), "defaultNamespace", null);
        setField(term65596, term65596.getClass(), "id", null);
        setIntField(term65596, term65596.getClass(), "index", 0);
        setBooleanField(term65596, term65596.getClass(), "attribute", false);
        setField(term65596, term65596.getClass(), "rootNode", null);
        setField(term65596, term65596.getClass(), "namespaceResolver", null);
        setField(term65596, term65596.getClass(), "parent", null);
        setField(term65596, term65596.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePositionByName", argTypes, term65047, args);
        assertTrue(recursiveEquals(term65047, term65596));
    }

};


