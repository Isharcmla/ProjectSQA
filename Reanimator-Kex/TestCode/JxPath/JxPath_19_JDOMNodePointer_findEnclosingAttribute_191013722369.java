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

public class JDOMNodePointer_findEnclosingAttribute_191013722369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2278;
     Object term2291;
     Object term8673;
     Object term8676;

    public JDOMNodePointer_findEnclosingAttribute_191013722369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2278 = newInstance(Class.forName("java.lang.Object"));
        term2291 = newInstance(Class.forName("org.jdom.Namespace"));
        setField(term2291, term2291.getClass(), "prefix", "OWDIEULEFu");
        setField(term2291, term2291.getClass(), "uri", "dWRymuLBtr");
        term8673 = newInstance(Class.forName("java.lang.Object"));
        term8676 = newInstance(Class.forName("org.jdom.Namespace"));
        setField(term8676, term8676.getClass(), "prefix", "OWDIEULEFu");
        setField(term8676, term8676.getClass(), "uri", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jdom.Namespace");
        Object[] args = new Object[3];
        args[0] = term2278;
        args[1] = "TEParAifyi";
        args[2] = term2291;
        Object retValue = callMethod(klass, "findEnclosingAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term2278, term8673));
        assertTrue(recursiveEquals(term2291, term8676));
        assertTrue(recursiveEquals(retValue, null));
    }

};


