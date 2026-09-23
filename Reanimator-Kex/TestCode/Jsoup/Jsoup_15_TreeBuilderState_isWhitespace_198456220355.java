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

public class TreeBuilderState_isWhitespace_198456220355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83133;
     Object term83149;

    public TreeBuilderState_isWhitespace_198456220355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83133 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        term83149 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term83149, term83149.getClass(), "name", null);
        setField(term83149, term83149.getClass(), "publicIdentifier", null);
        setField(term83149, term83149.getClass(), "systemIdentifier", null);
        setBooleanField(term83149, term83149.getClass(), "forceQuirks", false);
        setField(term83149, term83149.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term83133;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term83133, term83149));
        assertTrue(recursiveEquals(retValue, false));
    }

};


