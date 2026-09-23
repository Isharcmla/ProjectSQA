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

public class JDOMNodePointer_findEnclosingAttribute_191013722371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2178;
     Object term2191;
     Object term8646;
     Object term8649;

    public JDOMNodePointer_findEnclosingAttribute_191013722371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2178 = newInstance(Class.forName("java.lang.Object"));
        term2191 = newInstance(Class.forName("org.jdom.Namespace"));
        setField(term2191, term2191.getClass(), "prefix", "OWDIEULEFu");
        setField(term2191, term2191.getClass(), "uri", "dWRymuLBtr");
        term8646 = newInstance(Class.forName("java.lang.Object"));
        term8649 = newInstance(Class.forName("org.jdom.Namespace"));
        setField(term8649, term8649.getClass(), "prefix", "OWDIEULEFu");
        setField(term8649, term8649.getClass(), "uri", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jdom.Namespace");
        Object[] args = new Object[3];
        args[0] = term2178;
        args[1] = "TEParAifyi";
        args[2] = term2191;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term2178, term8646));
        assertTrue(recursiveEquals(term2191, term8649));
        assertTrue(recursiveEquals(retValue, null));
    }

};


