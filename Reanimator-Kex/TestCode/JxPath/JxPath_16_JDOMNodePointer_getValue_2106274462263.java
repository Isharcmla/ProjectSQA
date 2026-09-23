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

public class JDOMNodePointer_getValue_2106274462263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65393;
     Object term65873;

    public JDOMNodePointer_getValue_2106274462263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65393 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term65459 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term65459, term65459.getClass(), "rawData", "http://www.w3.org/XML/1998/namespace");
        setField(term65459, term65459.getClass(), "parent", null);
        setField(term65393, term65393.getClass(), "node", term65459);
        term65873 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term65874 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term65874, term65874.getClass(), "target", null);
        setField(term65874, term65874.getClass(), "rawData", "http://www.w3.org/XML/1998/namespace");
        setField(term65874, term65874.getClass(), "mapData", null);
        setField(term65874, term65874.getClass(), "parent", null);
        setField(term65873, term65873.getClass(), "node", term65874);
        setField(term65873, term65873.getClass(), "id", null);
        setField(term65873, term65873.getClass(), "localNamespaceResolver", null);
        setIntField(term65873, term65873.getClass(), "index", 0);
        setBooleanField(term65873, term65873.getClass(), "attribute", false);
        setField(term65873, term65873.getClass(), "rootNode", null);
        setField(term65873, term65873.getClass(), "namespaceResolver", null);
        setField(term65873, term65873.getClass(), "parent", null);
        setField(term65873, term65873.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term65393, args);
        assertTrue(recursiveEquals(term65393, term65873));
        assertTrue(recursiveEquals(retValue, "http://www.w3.org/XML/1998/namespace"));
    }

};


