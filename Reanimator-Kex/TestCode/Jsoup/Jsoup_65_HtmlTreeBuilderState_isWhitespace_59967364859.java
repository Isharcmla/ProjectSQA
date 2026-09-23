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

public class HtmlTreeBuilderState_isWhitespace_59967364859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68055;
     Object term68062;

    public HtmlTreeBuilderState_isWhitespace_59967364859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68055 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        term68062 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term68062, term68062.getClass(), "name", null);
        setField(term68062, term68062.getClass(), "pubSysKey", null);
        setField(term68062, term68062.getClass(), "publicIdentifier", null);
        setField(term68062, term68062.getClass(), "systemIdentifier", null);
        setBooleanField(term68062, term68062.getClass(), "forceQuirks", false);
        setField(term68062, term68062.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term68055;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term68055, term68062));
    }

};


