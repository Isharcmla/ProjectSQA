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

public class Attributes_hasKey_921497907595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15668534;
     Object term15668605;

    public Attributes_hasKey_921497907595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15668534 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15667832 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term15668534, term15668534.getClass(), "size", 11);
        setField(term15668534, term15668534.getClass(), "keys", term15667832);
        term15668605 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15668606 = (Object[]) newArray("java.lang.String", 499);
        setIntField(term15668605, term15668605.getClass(), "size", 11);
        setField(term15668605, term15668605.getClass(), "keys", term15668606);
        setField(term15668605, term15668605.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "hasKey", argTypes, term15668534, args);
        assertTrue(recursiveEquals(term15668534, term15668605));
        assertTrue(recursiveEquals(retValue, false));
    }

};


