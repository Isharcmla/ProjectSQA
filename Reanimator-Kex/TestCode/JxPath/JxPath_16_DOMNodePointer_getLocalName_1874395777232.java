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

public class DOMNodePointer_getLocalName_1874395777232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51416;
     Object term51740;

    public DOMNodePointer_getLocalName_1874395777232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51416 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term51416, term51416.getClass(), "localpart", null);
        setField(term51416, term51416.getClass(), "rawname", "");
        term51740 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term51740, term51740.getClass(), "relations", null);
        setField(term51740, term51740.getClass(), "parent", null);
        setIntField(term51740, term51740.getClass(), "currLoc", 0);
        setIntField(term51740, term51740.getClass(), "nextFreeLoc", 0);
        setBooleanField(term51740, term51740.getClass(), "hidden", false);
        setField(term51740, term51740.getClass(), "prefix", null);
        setField(term51740, term51740.getClass(), "localpart", null);
        setField(term51740, term51740.getClass(), "rawname", "");
        setField(term51740, term51740.getClass(), "uri", null);
        setShortField(term51740, term51740.getClass(), "nodeType", (short) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term51416;
        Object retValue = callMethod(klass, "getLocalName", argTypes, null, args);
        assertTrue(recursiveEquals(term51416, term51740));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


