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
import java.util.LinkedHashMap;

public class Attributes_put_40044184163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13654;
     Object term13710;
     Object term14229;
     Object term14234;

    public Attributes_put_40044184163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13654 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13654, term13654.getClass(), "attributes", null);
        term13710 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        LinkedHashMap term14230 = new LinkedHashMap();
        term14229 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term14229, term14229.getClass(), "attributes", term14230);
        term14234 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term14234, term14234.getClass(), "key", null);
        setField(term14234, term14234.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term13710;
        callMethod(klass, "put", argTypes, term13654, args);
        assertTrue(recursiveEquals(term13654, term14229));
        assertTrue(recursiveEquals(term13710, term14234));
    }

};


