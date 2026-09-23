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

public class JDOMNodePointer_asPath_327299344135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20529;
     Object term21155;

    public JDOMNodePointer_asPath_327299344135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20529 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term20529, term20529.getClass(), "id", "");
        term21155 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term21155, term21155.getClass(), "node", null);
        setField(term21155, term21155.getClass(), "id", "");
        setIntField(term21155, term21155.getClass(), "index", 0);
        setBooleanField(term21155, term21155.getClass(), "attribute", false);
        setField(term21155, term21155.getClass(), "rootNode", null);
        setField(term21155, term21155.getClass(), "namespaceResolver", null);
        setField(term21155, term21155.getClass(), "parent", null);
        setField(term21155, term21155.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term20529, args);
        assertTrue(recursiveEquals(term20529, term21155));
        assertTrue(recursiveEquals(retValue, "id(\'\')"));
    }

};


