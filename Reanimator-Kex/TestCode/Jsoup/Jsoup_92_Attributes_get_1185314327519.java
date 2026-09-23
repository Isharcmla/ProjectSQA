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
import java.lang.Object;

public class Attributes_get_1185314327519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13896043;
     Object term13896115;

    public Attributes_get_1185314327519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13896043 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13895341 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term13896043, term13896043.getClass(), "size", 11);
        setField(term13896043, term13896043.getClass(), "keys", term13895341);
        term13896115 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term13896116 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term13896115, term13896115.getClass(), "size", 11);
        setField(term13896115, term13896115.getClass(), "keys", term13896116);
        setField(term13896115, term13896115.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "get", argTypes, term13896043, args);
        assertTrue(recursiveEquals(term13896043, term13896115));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


