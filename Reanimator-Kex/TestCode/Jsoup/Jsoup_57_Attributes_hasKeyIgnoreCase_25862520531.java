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

public class Attributes_hasKeyIgnoreCase_25862520531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424;
     Object term1578;

    public Attributes_hasKeyIgnoreCase_25862520531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term425 = new LinkedHashMap();
        term424 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term424, term424.getClass(), "attributes", term425);
        LinkedHashMap term1579 = new LinkedHashMap();
        term1578 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1578, term1578.getClass(), "attributes", term1579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        Object retValue = callMethod(klass, "hasKeyIgnoreCase", argTypes, term424, args);
        assertTrue(recursiveEquals(term424, term1578));
        assertTrue(recursiveEquals(retValue, false));
    }

};


