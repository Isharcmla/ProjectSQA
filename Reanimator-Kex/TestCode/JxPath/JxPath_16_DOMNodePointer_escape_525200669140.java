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

public class DOMNodePointer_escape_525200669140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26540;
     Object term27075;

    public DOMNodePointer_escape_525200669140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26540 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term27075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term27075, term27075.getClass(), "node", null);
        setField(term27075, term27075.getClass(), "namespaces", null);
        setField(term27075, term27075.getClass(), "defaultNamespace", null);
        setField(term27075, term27075.getClass(), "id", null);
        setField(term27075, term27075.getClass(), "localNamespaceResolver", null);
        setIntField(term27075, term27075.getClass(), "index", 0);
        setBooleanField(term27075, term27075.getClass(), "attribute", false);
        setField(term27075, term27075.getClass(), "rootNode", null);
        setField(term27075, term27075.getClass(), "namespaceResolver", null);
        setField(term27075, term27075.getClass(), "parent", null);
        setField(term27075, term27075.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "escape", argTypes, term26540, args);
        assertTrue(recursiveEquals(term26540, term27075));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


