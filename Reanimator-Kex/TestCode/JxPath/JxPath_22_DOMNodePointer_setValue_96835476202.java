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

public class DOMNodePointer_setValue_96835476202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45436;
     Object term45624;
     Object term48383;
     Object term48385;

    public DOMNodePointer_setValue_96835476202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45436 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term45530 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setShortField(term45530, term45530.getClass(), "flags", (short) 0);
        setField(term45530, term45530.getClass(), "fNodeListCache", null);
        setField(term45530, term45530.getClass(), "firstChild", null);
        setField(term45436, term45436.getClass(), "node", term45530);
        term45624 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        term48383 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term48384 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setField(term48384, term48384.getClass(), "name", null);
        setField(term48384, term48384.getClass(), "attributes", null);
        setField(term48384, term48384.getClass(), "ownerDocument", null);
        setField(term48384, term48384.getClass(), "firstChild", null);
        setField(term48384, term48384.getClass(), "fNodeListCache", null);
        setField(term48384, term48384.getClass(), "previousSibling", null);
        setField(term48384, term48384.getClass(), "nextSibling", null);
        setField(term48384, term48384.getClass(), "ownerNode", null);
        setShortField(term48384, term48384.getClass(), "flags", (short) 0);
        setField(term48383, term48383.getClass(), "node", term48384);
        setField(term48383, term48383.getClass(), "namespaces", null);
        setField(term48383, term48383.getClass(), "defaultNamespace", null);
        setField(term48383, term48383.getClass(), "id", null);
        setField(term48383, term48383.getClass(), "localNamespaceResolver", null);
        setIntField(term48383, term48383.getClass(), "index", 0);
        setBooleanField(term48383, term48383.getClass(), "attribute", false);
        setField(term48383, term48383.getClass(), "namespaceResolver", null);
        setField(term48383, term48383.getClass(), "exceptionHandler", null);
        setField(term48383, term48383.getClass(), "rootNode", null);
        setField(term48383, term48383.getClass(), "parent", null);
        setField(term48383, term48383.getClass(), "locale", null);
        term48385 = newInstance(Class.forName("org.apache.html.dom.HTMLTableCellElementImpl"));
        setField(term48385, term48385.getClass(), "name", null);
        setField(term48385, term48385.getClass(), "attributes", null);
        setField(term48385, term48385.getClass(), "ownerDocument", null);
        setField(term48385, term48385.getClass(), "firstChild", null);
        setField(term48385, term48385.getClass(), "fNodeListCache", null);
        setField(term48385, term48385.getClass(), "previousSibling", null);
        setField(term48385, term48385.getClass(), "nextSibling", null);
        setField(term48385, term48385.getClass(), "ownerNode", null);
        setShortField(term48385, term48385.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45624;
        callMethod(klass, "setValue", argTypes, term45436, args);
        assertTrue(recursiveEquals(term45436, term48383));
        assertTrue(recursiveEquals(term45624, term48385));
    }

};


