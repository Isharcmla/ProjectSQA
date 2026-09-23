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

public class DOMNodePointer_getValue_26659896132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20513;
     Object term20787;

    public DOMNodePointer_getValue_26659896132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20513 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20595 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term20513, term20513.getClass(), "node", term20595);
        term20787 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        Object term20788 = newInstance(Class.forName("org.apache.xerces.dom.CDATASectionImpl"));
        setField(term20788, term20788.getClass(), "data", null);
        setField(term20788, term20788.getClass(), "previousSibling", null);
        setField(term20788, term20788.getClass(), "nextSibling", null);
        setField(term20788, term20788.getClass(), "ownerNode", null);
        setShortField(term20788, term20788.getClass(), "flags", (short) 0);
        setField(term20787, term20787.getClass(), "node", term20788);
        setField(term20787, term20787.getClass(), "namespaces", null);
        setField(term20787, term20787.getClass(), "defaultNamespace", null);
        setField(term20787, term20787.getClass(), "id", null);
        setIntField(term20787, term20787.getClass(), "index", 0);
        setBooleanField(term20787, term20787.getClass(), "attribute", false);
        setField(term20787, term20787.getClass(), "rootNode", null);
        setField(term20787, term20787.getClass(), "namespaceResolver", null);
        setField(term20787, term20787.getClass(), "parent", null);
        setField(term20787, term20787.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term20513, args);
        assertTrue(recursiveEquals(term20513, term20787));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


