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

public class Attributes_equals_1603080095121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84726;
     Object term84778;
     Object term84799;
     Object term84800;

    public Attributes_equals_1603080095121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84726 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        term84778 = newInstance(Class.forName("java.util.regex.Matcher"));
        term84799 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term84799, term84799.getClass(), "size", 0);
        setField(term84799, term84799.getClass(), "keys", null);
        setField(term84799, term84799.getClass(), "vals", null);
        term84800 = newInstance(Class.forName("java.util.regex.Matcher"));
        setField(term84800, term84800.getClass(), "parentPattern", null);
        setField(term84800, term84800.getClass(), "groups", null);
        setIntField(term84800, term84800.getClass(), "from", 0);
        setIntField(term84800, term84800.getClass(), "to", 0);
        setIntField(term84800, term84800.getClass(), "lookbehindTo", 0);
        setField(term84800, term84800.getClass(), "text", null);
        setIntField(term84800, term84800.getClass(), "acceptMode", 0);
        setIntField(term84800, term84800.getClass(), "first", 0);
        setIntField(term84800, term84800.getClass(), "last", 0);
        setIntField(term84800, term84800.getClass(), "oldLast", 0);
        setIntField(term84800, term84800.getClass(), "lastAppendPosition", 0);
        setField(term84800, term84800.getClass(), "locals", null);
        setField(term84800, term84800.getClass(), "localsPos", null);
        setBooleanField(term84800, term84800.getClass(), "hitEnd", false);
        setBooleanField(term84800, term84800.getClass(), "requireEnd", false);
        setBooleanField(term84800, term84800.getClass(), "transparentBounds", false);
        setBooleanField(term84800, term84800.getClass(), "anchoringBounds", false);
        setIntField(term84800, term84800.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84778;
        Object retValue = callMethod(klass, "equals", argTypes, term84726, args);
        assertTrue(recursiveEquals(term84726, term84799));
        assertTrue(recursiveEquals(term84778, term84800));
        assertTrue(recursiveEquals(retValue, false));
    }

};


