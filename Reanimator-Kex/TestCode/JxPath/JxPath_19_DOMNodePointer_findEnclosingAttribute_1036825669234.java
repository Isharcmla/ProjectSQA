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

public class DOMNodePointer_findEnclosingAttribute_1036825669234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51337;
     Object term51664;

    public DOMNodePointer_findEnclosingAttribute_1036825669234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51337 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentTypeImpl"));
        term51664 = newInstance(Class.forName("org.apache.xerces.dom.DeferredDocumentTypeImpl"));
        setIntField(term51664, term51664.getClass(), "fNodeIndex", 0);
        setField(term51664, term51664.getClass(), "name", null);
        setField(term51664, term51664.getClass(), "entities", null);
        setField(term51664, term51664.getClass(), "notations", null);
        setField(term51664, term51664.getClass(), "elements", null);
        setField(term51664, term51664.getClass(), "publicID", null);
        setField(term51664, term51664.getClass(), "systemID", null);
        setField(term51664, term51664.getClass(), "internalSubset", null);
        setIntField(term51664, term51664.getClass(), "doctypeNumber", 0);
        setField(term51664, term51664.getClass(), "ownerDocument", null);
        setField(term51664, term51664.getClass(), "firstChild", null);
        setField(term51664, term51664.getClass(), "fNodeListCache", null);
        setField(term51664, term51664.getClass(), "previousSibling", null);
        setField(term51664, term51664.getClass(), "nextSibling", null);
        setField(term51664, term51664.getClass(), "ownerNode", null);
        setShortField(term51664, term51664.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term51337;
        args[1] = null;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term51337, term51664));
        assertTrue(recursiveEquals(retValue, null));
    }

};


