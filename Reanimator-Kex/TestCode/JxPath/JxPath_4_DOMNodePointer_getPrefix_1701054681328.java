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

public class DOMNodePointer_getPrefix_1701054681328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101749;
     Object term103207;

    public DOMNodePointer_getPrefix_1701054681328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101749 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setShortField(term101749, term101749.getClass(), "flags", (short) 0);
        setField(term101749, term101749.getClass(), "name", "");
        term103207 = newInstance(Class.forName("org.apache.html.dom.HTMLSelectElementImpl"));
        setField(term103207, term103207.getClass(), "_options", null);
        setField(term103207, term103207.getClass(), "name", "");
        setField(term103207, term103207.getClass(), "attributes", null);
        setField(term103207, term103207.getClass(), "ownerDocument", null);
        setField(term103207, term103207.getClass(), "firstChild", null);
        setField(term103207, term103207.getClass(), "fNodeListCache", null);
        setField(term103207, term103207.getClass(), "previousSibling", null);
        setField(term103207, term103207.getClass(), "nextSibling", null);
        setField(term103207, term103207.getClass(), "ownerNode", null);
        setShortField(term103207, term103207.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term101749;
        Object retValue = callMethod(klass, "getPrefix", argTypes, null, args);
        assertTrue(recursiveEquals(term101749, term103207));
        assertTrue(recursiveEquals(retValue, null));
    }

};


