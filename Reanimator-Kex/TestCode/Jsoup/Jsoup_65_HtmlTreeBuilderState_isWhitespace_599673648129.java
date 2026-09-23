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
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilderState_isWhitespace_599673648129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95808;
     Object term96893;

    public HtmlTreeBuilderState_isWhitespace_599673648129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96900 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term96899 = ((Class) term96900).getDeclaredField((String) "Character");
        ((Field) term96899).setAccessible(true);
        Object enum219 = ((Field) term96899).get((Object) null);
        term95808 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term95808, term95808.getClass(), "type", enum219);
        setField(term95808, term95808.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term97213 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term97212 = ((Class) term97213).getDeclaredField((String) "Character");
        ((Field) term97212).setAccessible(true);
        Object enum220 = ((Field) term97212).get((Object) null);
        term96893 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term96893, term96893.getClass(), "data", "EndTag                                                                                                           ");
        setField(term96893, term96893.getClass(), "type", enum220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term95808;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term95808, term96893));
    }

};


