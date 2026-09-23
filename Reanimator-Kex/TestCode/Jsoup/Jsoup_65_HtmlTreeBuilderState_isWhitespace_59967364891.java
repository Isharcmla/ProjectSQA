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

public class HtmlTreeBuilderState_isWhitespace_59967364891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84958;
     Object term85357;

    public HtmlTreeBuilderState_isWhitespace_59967364891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85364 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term85363 = ((Class) term85364).getDeclaredField((String) "Character");
        ((Field) term85363).setAccessible(true);
        Object enum213 = ((Field) term85363).get((Object) null);
        term84958 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term84958, term84958.getClass(), "type", enum213);
        setField(term84958, term84958.getClass(), "data", "");
        Class<? extends Object> term85558 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term85557 = ((Class) term85558).getDeclaredField((String) "Character");
        ((Field) term85557).setAccessible(true);
        Object enum214 = ((Field) term85557).get((Object) null);
        term85357 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term85357, term85357.getClass(), "data", "");
        setField(term85357, term85357.getClass(), "type", enum214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term84958;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term84958, term85357));
    }

};


