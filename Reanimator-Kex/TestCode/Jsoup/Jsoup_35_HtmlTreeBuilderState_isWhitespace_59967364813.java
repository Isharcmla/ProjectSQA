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

public class HtmlTreeBuilderState_isWhitespace_59967364813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22748;
     Object term23012;

    public HtmlTreeBuilderState_isWhitespace_59967364813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22748 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        term23012 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term23012, term23012.getClass(), "name", null);
        setField(term23012, term23012.getClass(), "publicIdentifier", null);
        setField(term23012, term23012.getClass(), "systemIdentifier", null);
        setBooleanField(term23012, term23012.getClass(), "forceQuirks", false);
        setField(term23012, term23012.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term22748;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term22748, term23012));
        assertTrue(recursiveEquals(retValue, false));
    }

};


