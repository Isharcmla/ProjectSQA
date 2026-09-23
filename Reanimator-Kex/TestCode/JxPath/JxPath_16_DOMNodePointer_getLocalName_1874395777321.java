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

public class DOMNodePointer_getLocalName_1874395777321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88022;
     Object term88074;

    public DOMNodePointer_getLocalName_1874395777321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88022 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term88022, term88022.getClass(), "localpart", null);
        setField(term88022, term88022.getClass(), "rawname", "");
        term88074 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term88074, term88074.getClass(), "relations", null);
        setField(term88074, term88074.getClass(), "parent", null);
        setIntField(term88074, term88074.getClass(), "currLoc", 0);
        setIntField(term88074, term88074.getClass(), "nextFreeLoc", 0);
        setBooleanField(term88074, term88074.getClass(), "hidden", false);
        setField(term88074, term88074.getClass(), "prefix", null);
        setField(term88074, term88074.getClass(), "localpart", null);
        setField(term88074, term88074.getClass(), "rawname", "");
        setField(term88074, term88074.getClass(), "uri", null);
        setShortField(term88074, term88074.getClass(), "nodeType", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term88022;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term88022, term88074));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


