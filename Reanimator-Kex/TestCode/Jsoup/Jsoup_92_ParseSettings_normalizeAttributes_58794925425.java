package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class ParseSettings_normalizeAttributes_58794925425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;
     Object term2425;
     Object term2440;
     Object term2441;
     Object term2432;

    public ParseSettings_normalizeAttributes_58794925425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2367 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term2367, term2367.getClass(), "preserveAttributeCase", false);
        term2425 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2285 = (Object[]) newArray("java.lang.String", 105);
        setIntField(term2425, term2425.getClass(), "size", 1);
        setField(term2425, term2425.getClass(), "keys", term2285);
        term2440 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term2440, term2440.getClass(), "preserveTagCase", false);
        setBooleanField(term2440, term2440.getClass(), "preserveAttributeCase", false);
        term2441 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2442 = (Object[]) newArray("java.lang.String", 105);
        setIntField(term2441, term2441.getClass(), "size", 1);
        setElement(term2442, 0, "");
        setField(term2441, term2441.getClass(), "keys", term2442);
        setField(term2441, term2441.getClass(), "vals", null);
        term2432 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2434 = (Object[]) newArray("java.lang.String", 105);
        setIntField(term2432, term2432.getClass(), "size", 1);
        setElement(term2434, 0, "");
        setField(term2432, term2432.getClass(), "keys", term2434);
        setField(term2432, term2432.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.ParseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term2425;
        Object retValue = callMethod(klass, "normalizeAttributes", argTypes, term2367, args);
        assertTrue(recursiveEquals(term2367, term2440));
        assertTrue(recursiveEquals(term2425, term2441));
        assertTrue(recursiveEquals(retValue, term2432));
    }

};


