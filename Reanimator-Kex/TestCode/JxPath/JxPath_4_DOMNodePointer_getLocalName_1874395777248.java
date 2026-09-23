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

public class DOMNodePointer_getLocalName_1874395777248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66184;
     Object term66668;

    public DOMNodePointer_getLocalName_1874395777248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66184 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setShortField(term66184, term66184.getClass(), "flags", (short) 0);
        setField(term66184, term66184.getClass(), "name", "");
        term66668 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setField(term66668, term66668.getClass(), "name", "");
        setField(term66668, term66668.getClass(), "attributes", null);
        setField(term66668, term66668.getClass(), "ownerDocument", null);
        setField(term66668, term66668.getClass(), "firstChild", null);
        setField(term66668, term66668.getClass(), "fNodeListCache", null);
        setField(term66668, term66668.getClass(), "previousSibling", null);
        setField(term66668, term66668.getClass(), "nextSibling", null);
        setField(term66668, term66668.getClass(), "ownerNode", null);
        setShortField(term66668, term66668.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term66184;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term66184, term66668));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


