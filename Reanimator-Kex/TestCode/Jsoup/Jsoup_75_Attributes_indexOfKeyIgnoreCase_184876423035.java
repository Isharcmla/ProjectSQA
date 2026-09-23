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

public class Attributes_indexOfKeyIgnoreCase_184876423035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term46528;

    public Attributes_indexOfKeyIgnoreCase_184876423035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term148 = (Object[]) newArray("java.lang.String", 0);
        Object[] term149 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term146, term146.getClass(), "size", -1922583790);
        setField(term146, term146.getClass(), "keys", term148);
        setField(term146, term146.getClass(), "vals", term149);
        term46528 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term46529 = (Object[]) newArray("java.lang.String", 0);
        Object[] term46530 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term46528, term46528.getClass(), "size", -1922583790);
        setField(term46528, term46528.getClass(), "keys", term46529);
        setField(term46528, term46528.getClass(), "vals", term46530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        Object retValue = callMethod(klass, "indexOfKeyIgnoreCase", argTypes, term146, args);
        assertTrue(recursiveEquals(term146, term46528));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


