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

public class HtmlTreeBuilderState_isWhitespace_599673648139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70716;
     Object term71115;

    public HtmlTreeBuilderState_isWhitespace_599673648139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71122 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term71121 = ((Class) term71122).getDeclaredField((String) "Character");
        ((Field) term71121).setAccessible(true);
        Object enum171 = ((Field) term71121).get((Object) null);
        term70716 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term70716, term70716.getClass(), "type", enum171);
        setField(term70716, term70716.getClass(), "data", "");
        Class<? extends Object> term71316 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term71315 = ((Class) term71316).getDeclaredField((String) "Character");
        ((Field) term71315).setAccessible(true);
        Object enum172 = ((Field) term71315).get((Object) null);
        term71115 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term71115, term71115.getClass(), "data", "");
        setField(term71115, term71115.getClass(), "type", enum172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term70716;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term70716, term71115));
    }

};


