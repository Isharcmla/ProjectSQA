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

public class DOMNodePointer_getLocalName_1874395777236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57377;
     Object term59064;

    public DOMNodePointer_getLocalName_1874395777236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57377 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        setShortField(term57377, term57377.getClass(), "flags", (short) 0);
        setField(term57377, term57377.getClass(), "name", "");
        term59064 = newInstance(Class.forName("org.apache.html.dom.HTMLLabelElementImpl"));
        setField(term59064, term59064.getClass(), "name", "");
        setField(term59064, term59064.getClass(), "attributes", null);
        setField(term59064, term59064.getClass(), "ownerDocument", null);
        setField(term59064, term59064.getClass(), "firstChild", null);
        setField(term59064, term59064.getClass(), "fNodeListCache", null);
        setField(term59064, term59064.getClass(), "previousSibling", null);
        setField(term59064, term59064.getClass(), "nextSibling", null);
        setField(term59064, term59064.getClass(), "ownerNode", null);
        setShortField(term59064, term59064.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term57377;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term57377, term59064));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


