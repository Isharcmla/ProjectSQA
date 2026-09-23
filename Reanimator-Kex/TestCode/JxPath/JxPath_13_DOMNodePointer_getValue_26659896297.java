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
import java.lang.Object;

public class DOMNodePointer_getValue_26659896297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91355;
     Object term94479;

    public DOMNodePointer_getValue_26659896297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91355 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term91437 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setShortField(term91437, term91437.getClass(), "flags", (short) -32768);
        setField(term91437, term91437.getClass(), "data", "preserve                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term91355, term91355.getClass(), "node", term91437);
        term94479 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term94480 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term94480, term94480.getClass(), "data", "preserve                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        setField(term94480, term94480.getClass(), "previousSibling", null);
        setField(term94480, term94480.getClass(), "nextSibling", null);
        setField(term94480, term94480.getClass(), "ownerNode", null);
        setShortField(term94480, term94480.getClass(), "flags", (short) -32768);
        setField(term94479, term94479.getClass(), "node", term94480);
        setField(term94479, term94479.getClass(), "namespaces", null);
        setField(term94479, term94479.getClass(), "defaultNamespace", null);
        setField(term94479, term94479.getClass(), "id", null);
        setIntField(term94479, term94479.getClass(), "index", 0);
        setBooleanField(term94479, term94479.getClass(), "attribute", false);
        setField(term94479, term94479.getClass(), "rootNode", null);
        setField(term94479, term94479.getClass(), "namespaceResolver", null);
        setField(term94479, term94479.getClass(), "parent", null);
        setField(term94479, term94479.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term91355, args);
        assertTrue(recursiveEquals(term91355, term94479));
        assertTrue(recursiveEquals(retValue, "preserve"));
    }

};


