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

public class DOMNodePointer_testNode_1702276443299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76725;
     Object term76831;
     Object term77511;
     Object term77512;

    public DOMNodePointer_testNode_1702276443299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76725 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        term76831 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term76831, term76831.getClass(), "nodeType", 1);
        term77511 = newInstance(Class.forName("org.apache.html.dom.HTMLBaseFontElementImpl"));
        setField(term77511, term77511.getClass(), "name", null);
        setField(term77511, term77511.getClass(), "attributes", null);
        setField(term77511, term77511.getClass(), "ownerDocument", null);
        setField(term77511, term77511.getClass(), "firstChild", null);
        setField(term77511, term77511.getClass(), "fNodeListCache", null);
        setField(term77511, term77511.getClass(), "previousSibling", null);
        setField(term77511, term77511.getClass(), "nextSibling", null);
        setField(term77511, term77511.getClass(), "ownerNode", null);
        setShortField(term77511, term77511.getClass(), "flags", (short) 0);
        term77512 = newInstance(Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTypeTest"));
        setIntField(term77512, term77512.getClass(), "nodeType", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.dom.DOMNodePointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Node");
        argTypes[1] = Class.forName("org.apache.commons.jxpath.ri.compiler.NodeTest");
        Object[] args = new Object[2];
        args[0] = term76725;
        args[1] = term76831;
        Object retValue = callMethod(klass, "testNode", argTypes, null, args);
        assertTrue(recursiveEquals(term76725, term77511));
        assertTrue(recursiveEquals(term76831, term77512));
        assertTrue(recursiveEquals(retValue, true));
    }

};


