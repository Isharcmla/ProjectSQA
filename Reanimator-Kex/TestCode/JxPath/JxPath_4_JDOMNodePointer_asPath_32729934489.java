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

public class JDOMNodePointer_asPath_32729934489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11420;
     Object term11432;

    public JDOMNodePointer_asPath_32729934489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11420 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term11420, term11420.getClass(), "id", null);
        term11432 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        setField(term11432, term11432.getClass(), "node", null);
        setField(term11432, term11432.getClass(), "id", null);
        setIntField(term11432, term11432.getClass(), "index", 0);
        setBooleanField(term11432, term11432.getClass(), "attribute", false);
        setField(term11432, term11432.getClass(), "rootNode", null);
        setField(term11432, term11432.getClass(), "namespaceResolver", null);
        setField(term11432, term11432.getClass(), "parent", null);
        setField(term11432, term11432.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term11420, args);
        assertTrue(recursiveEquals(term11420, term11432));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


