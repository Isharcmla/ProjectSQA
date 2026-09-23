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

public class JDOMNodePointer_getLanguage_577383047119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16157;
     Object term16985;

    public JDOMNodePointer_getLanguage_577383047119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16157 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term16195 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term16157, term16157.getClass(), "node", term16195);
        term16985 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term16986 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term16986, term16986.getClass(), "text", null);
        setField(term16986, term16986.getClass(), "parent", null);
        setField(term16985, term16985.getClass(), "node", term16986);
        setField(term16985, term16985.getClass(), "id", null);
        setIntField(term16985, term16985.getClass(), "index", 0);
        setBooleanField(term16985, term16985.getClass(), "attribute", false);
        setField(term16985, term16985.getClass(), "rootNode", null);
        setField(term16985, term16985.getClass(), "namespaceResolver", null);
        setField(term16985, term16985.getClass(), "parent", null);
        setField(term16985, term16985.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLanguage", argTypes, term16157, args);
        assertTrue(recursiveEquals(term16157, term16985));
        assertTrue(recursiveEquals(retValue, null));
    }

};


