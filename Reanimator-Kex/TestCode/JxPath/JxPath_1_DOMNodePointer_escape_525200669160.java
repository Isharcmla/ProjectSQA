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

public class DOMNodePointer_escape_525200669160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28135;
     Object term28441;

    public DOMNodePointer_escape_525200669160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28135 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term28441 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term28441, term28441.getClass(), "node", null);
        setField(term28441, term28441.getClass(), "namespaces", null);
        setField(term28441, term28441.getClass(), "defaultNamespace", null);
        setField(term28441, term28441.getClass(), "id", null);
        setIntField(term28441, term28441.getClass(), "index", 0);
        setBooleanField(term28441, term28441.getClass(), "attribute", false);
        setField(term28441, term28441.getClass(), "rootNode", null);
        setField(term28441, term28441.getClass(), "namespaceResolver", null);
        setField(term28441, term28441.getClass(), "parent", null);
        setField(term28441, term28441.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term28135, args);
        assertTrue(recursiveEquals(term28135, term28441));
        assertTrue(recursiveEquals(retValue, ""));
    }

};
