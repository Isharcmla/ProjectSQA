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

public class JDOMNodePointer_getValue_2106274462105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14075;
     Object term14122;

    public JDOMNodePointer_getValue_2106274462105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14075 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term14113 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term14075, term14075.getClass(), "node", term14113);
        term14122 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term14123 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term14123, term14123.getClass(), "text", null);
        setField(term14123, term14123.getClass(), "parent", null);
        setField(term14122, term14122.getClass(), "node", term14123);
        setField(term14122, term14122.getClass(), "id", null);
        setIntField(term14122, term14122.getClass(), "index", 0);
        setBooleanField(term14122, term14122.getClass(), "attribute", false);
        setField(term14122, term14122.getClass(), "rootNode", null);
        setField(term14122, term14122.getClass(), "namespaceResolver", null);
        setField(term14122, term14122.getClass(), "parent", null);
        setField(term14122, term14122.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValue", argTypes, term14075, args);
        assertTrue(recursiveEquals(term14075, term14122));
        assertTrue(recursiveEquals(retValue, null));
    }

};


