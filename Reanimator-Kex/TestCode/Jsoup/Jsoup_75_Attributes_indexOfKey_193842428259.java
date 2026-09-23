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

public class Attributes_indexOfKey_193842428259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1214307;
     Object term1766420;

    public Attributes_indexOfKey_193842428259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1214307 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1214307, term1214307.getClass(), "size", 0);
        term1766420 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term1766420, term1766420.getClass(), "size", 0);
        setField(term1766420, term1766420.getClass(), "keys", null);
        setField(term1766420, term1766420.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term1214307, args);
        assertTrue(recursiveEquals(term1214307, term1766420));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


