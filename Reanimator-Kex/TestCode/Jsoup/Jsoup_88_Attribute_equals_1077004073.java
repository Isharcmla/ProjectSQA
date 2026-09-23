package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class Attribute_equals_1077004073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146597;
     Object term146657;
     Object term146666;
     Object term146667;

    public Attribute_equals_1077004073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146597 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        term146657 = newInstance(Class.forName("java.util.jar.JarVerifier$1"));
        term146666 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term146666, term146666.getClass(), "key", null);
        setField(term146666, term146666.getClass(), "val", null);
        setField(term146666, term146666.getClass(), "parent", null);
        term146667 = newInstance(Class.forName("java.util.jar.JarVerifier$1"));
        setField(term146667, term146667.getClass(), "name", null);
        setField(term146667, term146667.getClass(), "val$itor", null);
        setField(term146667, term146667.getClass(), "val$signersReq", null);
        setField(term146667, term146667.getClass(), "val$enum2", null);
        setField(term146667, term146667.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term146657;
        Object retValue = callMethod(klass, "equals", argTypes, term146597, args);
        assertTrue(recursiveEquals(term146597, term146666));
        assertTrue(recursiveEquals(term146657, term146667));
        assertTrue(recursiveEquals(retValue, false));
    }

};


