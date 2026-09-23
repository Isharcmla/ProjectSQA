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

public class HtmlTreeBuilderState_isWhitespace_599673648181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95846;
     Object term97061;

    public HtmlTreeBuilderState_isWhitespace_599673648181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97068 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term97067 = ((Class) term97068).getDeclaredField((String) "Character");
        ((Field) term97067).setAccessible(true);
        Object enum202 = ((Field) term97067).get((Object) null);
        term95846 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term95846, term95846.getClass(), "type", enum202);
        setField(term95846, term95846.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term97381 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term97380 = ((Class) term97381).getDeclaredField((String) "Character");
        ((Field) term97380).setAccessible(true);
        Object enum203 = ((Field) term97380).get((Object) null);
        term97061 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term97061, term97061.getClass(), "data", "EndTag                                                                                                           ");
        setField(term97061, term97061.getClass(), "type", enum203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term95846;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term95846, term97061));
    }

};


