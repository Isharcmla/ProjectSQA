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

public class JDOMNodePointer_asPath_327299344168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26544;
     Object term27593;

    public JDOMNodePointer_asPath_327299344168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26544 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term26610 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term26544, term26544.getClass(), "id", null);
        setField(term26544, term26544.getClass(), "parent", null);
        setField(term26544, term26544.getClass(), "node", term26610);
        term27593 = newInstance(Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"));
        Object term27594 = newInstance(Class.forName("org.jdom.ProcessingInstruction"));
        setField(term27594, term27594.getClass(), "target", null);
        setField(term27594, term27594.getClass(), "rawData", null);
        setField(term27594, term27594.getClass(), "mapData", null);
        setField(term27594, term27594.getClass(), "parent", null);
        setField(term27593, term27593.getClass(), "node", term27594);
        setField(term27593, term27593.getClass(), "id", null);
        setIntField(term27593, term27593.getClass(), "index", 0);
        setBooleanField(term27593, term27593.getClass(), "attribute", false);
        setField(term27593, term27593.getClass(), "rootNode", null);
        setField(term27593, term27593.getClass(), "namespaceResolver", null);
        setField(term27593, term27593.getClass(), "parent", null);
        setField(term27593, term27593.getClass(), "locale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asPath", argTypes, term26544, args);
        assertTrue(recursiveEquals(term26544, term27593));
        assertTrue(recursiveEquals(retValue, "/processing-instruction(\'null\')[1]"));
    }

};


