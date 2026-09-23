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

public class DOMNodePointer_getLocalName_1874395777202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48648;
     Object term48925;

    public DOMNodePointer_getLocalName_1874395777202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48648 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setShortField(term48648, term48648.getClass(), "flags", (short) 0);
        setField(term48648, term48648.getClass(), "name", "");
        term48925 = newInstance(Class.forName("org.apache.wml.dom.WMLStrongElementImpl"));
        setField(term48925, term48925.getClass(), "name", "");
        setField(term48925, term48925.getClass(), "attributes", null);
        setField(term48925, term48925.getClass(), "ownerDocument", null);
        setField(term48925, term48925.getClass(), "firstChild", null);
        setField(term48925, term48925.getClass(), "fNodeListCache", null);
        setField(term48925, term48925.getClass(), "previousSibling", null);
        setField(term48925, term48925.getClass(), "nextSibling", null);
        setField(term48925, term48925.getClass(), "ownerNode", null);
        setShortField(term48925, term48925.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term48648;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term48648, term48925));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


