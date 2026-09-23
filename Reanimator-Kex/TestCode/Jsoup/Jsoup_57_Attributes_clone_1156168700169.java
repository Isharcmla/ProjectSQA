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

public class Attributes_clone_1156168700169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4033106;
     Object term4033290;
     Object term4033283;

    public Attributes_clone_1156168700169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4033166 = new LinkedHashMap();
        term4033106 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4033106, term4033106.getClass(), "attributes", term4033166);
        LinkedHashMap term4033291 = new LinkedHashMap();
        term4033290 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4033290, term4033290.getClass(), "attributes", term4033291);
        LinkedHashMap term4033284 = new LinkedHashMap();
        term4033283 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4033283, term4033283.getClass(), "attributes", term4033284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term4033106, args);
        assertTrue(recursiveEquals(term4033106, term4033290));
        assertTrue(recursiveEquals(retValue, term4033283));
    }

};


