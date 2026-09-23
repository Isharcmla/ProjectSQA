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

public class DOMNodePointer_stringValue_2129170303305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94244;
     Object term94330;
     Object term94345;
     Object term94346;

    public DOMNodePointer_stringValue_2129170303305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94244 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term94330 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setShortField(term94330, term94330.getClass(), "nodeType", (short) 8);
        term94345 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term94345, term94345.getClass(), "node", null);
        setField(term94345, term94345.getClass(), "namespaces", null);
        setField(term94345, term94345.getClass(), "defaultNamespace", null);
        setField(term94345, term94345.getClass(), "id", null);
        setIntField(term94345, term94345.getClass(), "index", 0);
        setBooleanField(term94345, term94345.getClass(), "attribute", false);
        setField(term94345, term94345.getClass(), "rootNode", null);
        setField(term94345, term94345.getClass(), "namespaceResolver", null);
        setField(term94345, term94345.getClass(), "parent", null);
        setField(term94345, term94345.getClass(), "locale", null);
        term94346 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term94346, term94346.getClass(), "relations", null);
        setField(term94346, term94346.getClass(), "parent", null);
        setIntField(term94346, term94346.getClass(), "currLoc", 0);
        setIntField(term94346, term94346.getClass(), "nextFreeLoc", 0);
        setBooleanField(term94346, term94346.getClass(), "hidden", false);
        setField(term94346, term94346.getClass(), "prefix", null);
        setField(term94346, term94346.getClass(), "localpart", null);
        setField(term94346, term94346.getClass(), "rawname", null);
        setField(term94346, term94346.getClass(), "uri", null);
        setShortField(term94346, term94346.getClass(), "nodeType", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term94330;
        Object retValue = callMethod(klass, "stringValue", argTypes, term94244, args);
        assertTrue(recursiveEquals(term94244, term94345));
        assertTrue(recursiveEquals(term94330, term94346));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


