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

public class DOMNodePointer_stringValue_2129170303209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49674;
     Object term49760;
     Object term49796;
     Object term49797;

    public DOMNodePointer_stringValue_2129170303209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49674 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        term49760 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setShortField(term49760, term49760.getClass(), "nodeType", (short) 3);
        term49796 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"));
        setField(term49796, term49796.getClass(), "node", null);
        setField(term49796, term49796.getClass(), "namespaces", null);
        setField(term49796, term49796.getClass(), "defaultNamespace", null);
        setField(term49796, term49796.getClass(), "id", null);
        setIntField(term49796, term49796.getClass(), "index", 0);
        setBooleanField(term49796, term49796.getClass(), "attribute", false);
        setField(term49796, term49796.getClass(), "rootNode", null);
        setField(term49796, term49796.getClass(), "namespaceResolver", null);
        setField(term49796, term49796.getClass(), "parent", null);
        setField(term49796, term49796.getClass(), "locale", null);
        term49797 = newInstance(Class.forName("org.apache.xerces.impl.xs.opti.SchemaDOM"));
        setField(term49797, term49797.getClass(), "relations", null);
        setField(term49797, term49797.getClass(), "parent", null);
        setIntField(term49797, term49797.getClass(), "currLoc", 0);
        setIntField(term49797, term49797.getClass(), "nextFreeLoc", 0);
        setBooleanField(term49797, term49797.getClass(), "hidden", false);
        setField(term49797, term49797.getClass(), "prefix", null);
        setField(term49797, term49797.getClass(), "localpart", null);
        setField(term49797, term49797.getClass(), "rawname", null);
        setField(term49797, term49797.getClass(), "uri", null);
        setShortField(term49797, term49797.getClass(), "nodeType", (short) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        Object[] args = new Object[1];
        args[0] = term49760;
        Object retValue = callMethod(klass, "stringValue", argTypes, term49674, args);
        assertTrue(recursiveEquals(term49674, term49796));
        assertTrue(recursiveEquals(term49760, term49797));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


