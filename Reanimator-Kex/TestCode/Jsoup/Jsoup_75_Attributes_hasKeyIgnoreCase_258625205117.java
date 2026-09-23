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

public class Attributes_hasKeyIgnoreCase_258625205117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67603;
     Object term67651;

    public Attributes_hasKeyIgnoreCase_258625205117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term67603, term67603.getClass(), "size", 0);
        term67651 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term67651, term67651.getClass(), "size", 0);
        setField(term67651, term67651.getClass(), "keys", null);
        setField(term67651, term67651.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasKeyIgnoreCase", argTypes, term67603, args);
        assertTrue(recursiveEquals(term67603, term67651));
        assertTrue(recursiveEquals(retValue, false));
    }

};


