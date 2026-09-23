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

public class Attribute_equals_10770040114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155310;
     Object term155348;
     Object term155742;
     Object term155743;

    public Attribute_equals_10770040114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155310 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        term155348 = newInstance(Class.forName("java.io.Reader$1"));
        term155742 = newInstance(Class.forName("org.jsoup.nodes.BooleanAttribute"));
        setField(term155742, term155742.getClass(), "key", null);
        setField(term155742, term155742.getClass(), "val", null);
        setField(term155742, term155742.getClass(), "parent", null);
        term155743 = newInstance(Class.forName("java.io.Reader$1"));
        setBooleanField(term155743, term155743.getClass(), "closed", false);
        setField(term155743, term155743.getClass(), "lock", null);
        setField(term155743, term155743.getClass(), "skipBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155348;
        Object retValue = callMethod(klass, "equals", argTypes, term155310, args);
        assertTrue(recursiveEquals(term155310, term155742));
        assertTrue(recursiveEquals(term155348, term155743));
        assertTrue(recursiveEquals(retValue, false));
    }

};


