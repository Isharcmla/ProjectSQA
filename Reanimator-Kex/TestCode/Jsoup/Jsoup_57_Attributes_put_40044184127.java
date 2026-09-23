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

public class Attributes_put_40044184127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213;
     Object term238;
     Object term1381;
     Object term1390;

    public Attributes_put_40044184127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term214 = new LinkedHashMap();
        term213 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term213, term213.getClass(), "attributes", term214);
        term238 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term238, term238.getClass(), "key", "hNxWaHcfhY");
        setField(term238, term238.getClass(), "value", "RkybSrpybU");
        LinkedHashMap term1382 = new LinkedHashMap();
        term1381 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1381, term1381.getClass(), "attributes", term1382);
        term1390 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term1390, term1390.getClass(), "key", "");
        setField(term1390, term1390.getClass(), "value", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attribute");
        Object[] args = new Object[1];
        args[0] = term238;
        callMethod(klass, "put", argTypes, term213, args);
        assertTrue(recursiveEquals(term213, term1381));
        assertTrue(recursiveEquals(term238, term1390));
    }

};


