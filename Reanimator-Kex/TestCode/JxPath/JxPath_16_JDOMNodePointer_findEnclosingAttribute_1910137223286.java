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

public class JDOMNodePointer_findEnclosingAttribute_1910137223286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70307;
     Object term74983;

    public JDOMNodePointer_findEnclosingAttribute_1910137223286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70307 = newInstance(Class.forName("org.jdom.Comment"));
        term74983 = newInstance(Class.forName("org.jdom.Comment"));
        setField(term74983, term74983.getClass(), "text", null);
        setField(term74983, term74983.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jdom.Namespace");
        Object[] args = new Object[3];
        args[0] = term70307;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term70307, term74983));
        assertTrue(recursiveEquals(retValue, null));
    }

};


