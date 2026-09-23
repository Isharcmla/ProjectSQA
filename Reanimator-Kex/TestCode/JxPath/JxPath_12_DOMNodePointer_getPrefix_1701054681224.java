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

public class DOMNodePointer_getPrefix_1701054681224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54151;
     Object term54875;

    public DOMNodePointer_getPrefix_1701054681224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54151 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setShortField(term54151, term54151.getClass(), "flags", (short) 0);
        setField(term54151, term54151.getClass(), "name", "");
        term54875 = newInstance(Class.forName("org.apache.html.dom.HTMLBodyElementImpl"));
        setField(term54875, term54875.getClass(), "name", "");
        setField(term54875, term54875.getClass(), "attributes", null);
        setField(term54875, term54875.getClass(), "ownerDocument", null);
        setField(term54875, term54875.getClass(), "firstChild", null);
        setField(term54875, term54875.getClass(), "fNodeListCache", null);
        setField(term54875, term54875.getClass(), "previousSibling", null);
        setField(term54875, term54875.getClass(), "nextSibling", null);
        setField(term54875, term54875.getClass(), "ownerNode", null);
        setShortField(term54875, term54875.getClass(), "flags", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term54151;
        Object retValue = callMethod(klass, "getPrefix", argTypes, null, args);
        assertTrue(recursiveEquals(term54151, term54875));
        assertTrue(recursiveEquals(retValue, null));
    }

};


