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

public class Tag_equals_134995802669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13303;
     Object term13381;
     Object term13394;
     Object term13395;

    public Tag_equals_134995802669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13303 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        term13381 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        term13394 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term13394, term13394.getClass(), "tagName", null);
        setBooleanField(term13394, term13394.getClass(), "isBlock", false);
        setBooleanField(term13394, term13394.getClass(), "canContainBlock", false);
        setBooleanField(term13394, term13394.getClass(), "canContainInline", false);
        setBooleanField(term13394, term13394.getClass(), "optionalClosing", false);
        setBooleanField(term13394, term13394.getClass(), "empty", false);
        setBooleanField(term13394, term13394.getClass(), "preserveWhitespace", false);
        setField(term13394, term13394.getClass(), "ancestors", null);
        term13395 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        setField(term13395, term13395.getClass(), "elements", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13381;
        Object retValue = callMethod(klass, "equals", argTypes, term13303, args);
        assertTrue(recursiveEquals(term13303, term13394));
        assertTrue(recursiveEquals(term13381, term13395));
        assertTrue(recursiveEquals(retValue, false));
    }

};


