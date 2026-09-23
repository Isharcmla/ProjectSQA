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

public class DOMNodePointer_getPrefix_1701054681183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36152;
     Object term36499;

    public DOMNodePointer_getPrefix_1701054681183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36152 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        term36499 = newInstance(Class.forName("org.apache.xerces.dom.DeferredCommentImpl"));
        setIntField(term36499, term36499.getClass(), "fNodeIndex", 0);
        setField(term36499, term36499.getClass(), "data", null);
        setField(term36499, term36499.getClass(), "previousSibling", null);
        setField(term36499, term36499.getClass(), "nextSibling", null);
        setField(term36499, term36499.getClass(), "ownerNode", null);
        setShortField(term36499, term36499.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term36152;
        Object retValue = callMethod(klass, "getPrefix", argTypes, null, args);
        assertTrue(recursiveEquals(term36152, term36499));
        assertTrue(recursiveEquals(retValue, null));
    }

};


