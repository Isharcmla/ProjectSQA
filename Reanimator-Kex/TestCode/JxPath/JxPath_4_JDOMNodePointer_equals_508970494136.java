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

public class JDOMNodePointer_equals_508970494136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20972;
     Object term21088;
     Object term21174;
     Object term21175;

    public JDOMNodePointer_equals_508970494136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20972 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term21088 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        term21174 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term21174, term21174.getClass(), "node", null);
        setField(term21174, term21174.getClass(), "id", null);
        setIntField(term21174, term21174.getClass(), "index", 0);
        setBooleanField(term21174, term21174.getClass(), "attribute", false);
        setField(term21174, term21174.getClass(), "rootNode", null);
        setField(term21174, term21174.getClass(), "namespaceResolver", null);
        setField(term21174, term21174.getClass(), "parent", null);
        setField(term21174, term21174.getClass(), "locale", null);
        term21175 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term21175, term21175.getClass(), "node", null);
        setField(term21175, term21175.getClass(), "id", null);
        setIntField(term21175, term21175.getClass(), "index", 0);
        setBooleanField(term21175, term21175.getClass(), "attribute", false);
        setField(term21175, term21175.getClass(), "rootNode", null);
        setField(term21175, term21175.getClass(), "namespaceResolver", null);
        setField(term21175, term21175.getClass(), "parent", null);
        setField(term21175, term21175.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21088;
        Object retValue = callMethod(klass, "equals", argTypes, term20972, args);
        assertTrue(recursiveEquals(term20972, term21174));
        assertTrue(recursiveEquals(term21088, term21175));
        assertTrue(recursiveEquals(retValue, true));
    }

};


