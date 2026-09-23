package org.apache.commons.jxpath.ri.model.jdom;

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
import static org.apache.commons.jxpath.ri.model.jdom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.jxpath.ri.model.jdom.EqualityUtils.*;
import java.lang.Object;

public class JDOMNodePointer_getValue_2106274462156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28761;
     Object term29205;

    public JDOMNodePointer_getValue_2106274462156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28761 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term28827 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term28761, term28761.getClass(), "node", term28827);
        term29205 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term29206 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term29206, term29206.getClass(), "target", null);
        setField(term29206, term29206.getClass(), "rawData", null);
        setField(term29206, term29206.getClass(), "mapData", null);
        setField(term29206, term29206.getClass(), "parent", null);
        setField(term29205, term29205.getClass(), "node", term29206);
        setField(term29205, term29205.getClass(), "id", null);
        setField(term29205, term29205.getClass(), "localNamespaceResolver", null);
        setIntField(term29205, term29205.getClass(), "index", 0);
        setBooleanField(term29205, term29205.getClass(), "attribute", false);
        setField(term29205, term29205.getClass(), "namespaceResolver", null);
        setField(term29205, term29205.getClass(), "rootNode", null);
        setField(term29205, term29205.getClass(), "parent", null);
        setField(term29205, term29205.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term28761, args);
        assertTrue(recursiveEquals(term28761, term29205));
        assertTrue(recursiveEquals(retValue, null));
    }

};


