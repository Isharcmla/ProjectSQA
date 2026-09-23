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

public class HtmlTreeBuilderState_isWhitespace_599673648143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81403;
     Object term82488;

    public HtmlTreeBuilderState_isWhitespace_599673648143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82495 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term82494 = ((Class) term82495).getDeclaredField((String) "Character");
        ((Field) term82494).setAccessible(true);
        Object enum178 = ((Field) term82494).get((Object) null);
        term81403 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term81403, term81403.getClass(), "type", enum178);
        setField(term81403, term81403.getClass(), "data", "EndTag                                                                                                           ");
        Class<? extends Object> term82808 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term82807 = ((Class) term82808).getDeclaredField((String) "Character");
        ((Field) term82807).setAccessible(true);
        Object enum179 = ((Field) term82807).get((Object) null);
        term82488 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term82488, term82488.getClass(), "data", "EndTag                                                                                                           ");
        setField(term82488, term82488.getClass(), "type", enum179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term81403;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term81403, term82488));
    }

};


