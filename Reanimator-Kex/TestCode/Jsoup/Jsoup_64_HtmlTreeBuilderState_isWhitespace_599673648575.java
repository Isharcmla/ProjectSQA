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

public class HtmlTreeBuilderState_isWhitespace_599673648575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171930;
     Object term173461;

    public HtmlTreeBuilderState_isWhitespace_599673648575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term173468 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term173467 = ((Class) term173468).getDeclaredField((String) "Character");
        ((Field) term173467).setAccessible(true);
        Object enum183 = ((Field) term173467).get((Object) null);
        term171930 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term171930, term171930.getClass(), "type", enum183);
        setField(term171930, term171930.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term173781 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term173780 = ((Class) term173781).getDeclaredField((String) "Character");
        ((Field) term173780).setAccessible(true);
        Object enum184 = ((Field) term173780).get((Object) null);
        term173461 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term173461, term173461.getClass(), "data", "EndTag                                                                                                           ");
        setField(term173461, term173461.getClass(), "type", enum184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term171930;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term171930, term173461));
    }

};


