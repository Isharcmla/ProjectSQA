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

public class HtmlTreeBuilderState_isWhitespace_599673648131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79887;
     Object term80286;

    public HtmlTreeBuilderState_isWhitespace_599673648131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80293 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term80292 = ((Class) term80293).getDeclaredField((String) "Character");
        ((Field) term80292).setAccessible(true);
        Object enum199 = ((Field) term80292).get((Object) null);
        term79887 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term79887, term79887.getClass(), "type", enum199);
        setField(term79887, term79887.getClass(), "data", "");
        Class<? extends Object> term80487 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term80486 = ((Class) term80487).getDeclaredField((String) "Character");
        ((Field) term80486).setAccessible(true);
        Object enum200 = ((Field) term80486).get((Object) null);
        term80286 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term80286, term80286.getClass(), "data", "");
        setField(term80286, term80286.getClass(), "type", enum200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term79887;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term79887, term80286));
    }

};


