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

public class DOMNodePointer_getPrefix_1701054681219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48670;
     Object term48979;

    public DOMNodePointer_getPrefix_1701054681219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48670 = newInstance(Class.forName("org.apache.html.dom.HTMLTableRowElementImpl"));
        setShortField(term48670, term48670.getClass(), "flags", (short) 0);
        setField(term48670, term48670.getClass(), "name", "");
        term48979 = newInstance(Class.forName("org.apache.html.dom.HTMLTableRowElementImpl"));
        setField(term48979, term48979.getClass(), "_cells", null);
        setField(term48979, term48979.getClass(), "name", "");
        setField(term48979, term48979.getClass(), "attributes", null);
        setField(term48979, term48979.getClass(), "ownerDocument", null);
        setField(term48979, term48979.getClass(), "firstChild", null);
        setField(term48979, term48979.getClass(), "fNodeListCache", null);
        setField(term48979, term48979.getClass(), "previousSibling", null);
        setField(term48979, term48979.getClass(), "nextSibling", null);
        setField(term48979, term48979.getClass(), "ownerNode", null);
        setShortField(term48979, term48979.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term48670;
        Object retValue = callMethod(klass, "getPrefix", argTypes, null, args);
        assertTrue(recursiveEquals(term48670, term48979));
        assertTrue(recursiveEquals(retValue, null));
    }

};


