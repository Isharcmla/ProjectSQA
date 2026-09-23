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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilderState_isWhitespace_599673648121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77233;

    public HtmlTreeBuilderState_isWhitespace_599673648121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77920 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term77919 = ((Class) term77920).getDeclaredField((String) "Character");
        ((Field) term77919).setAccessible(true);
        Object enum196 = ((Field) term77919).get((Object) null);
        term77233 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term77233, term77233.getClass(), "type", enum196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term77233;
        try {
            callMethod(klass, "isWhitespace", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


