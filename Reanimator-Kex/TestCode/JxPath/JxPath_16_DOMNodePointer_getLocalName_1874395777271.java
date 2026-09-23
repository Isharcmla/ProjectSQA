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

public class DOMNodePointer_getLocalName_1874395777271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68141;
     Object term68216;

    public DOMNodePointer_getLocalName_1874395777271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68141 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term68141, term68141.getClass(), "localpart", "");
        term68216 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term68216, term68216.getClass(), "relations", null);
        setField(term68216, term68216.getClass(), "parent", null);
        setIntField(term68216, term68216.getClass(), "currLoc", 0);
        setIntField(term68216, term68216.getClass(), "nextFreeLoc", 0);
        setBooleanField(term68216, term68216.getClass(), "hidden", false);
        setField(term68216, term68216.getClass(), "prefix", null);
        setField(term68216, term68216.getClass(), "localpart", "");
        setField(term68216, term68216.getClass(), "rawname", null);
        setField(term68216, term68216.getClass(), "uri", null);
        setShortField(term68216, term68216.getClass(), "nodeType", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term68141;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term68141, term68216));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


