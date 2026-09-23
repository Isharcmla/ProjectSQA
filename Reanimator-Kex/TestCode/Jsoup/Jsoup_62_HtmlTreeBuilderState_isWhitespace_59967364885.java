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

public class HtmlTreeBuilderState_isWhitespace_59967364885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63597;
     Object term63996;

    public HtmlTreeBuilderState_isWhitespace_59967364885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64003 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term64002 = ((Class) term64003).getDeclaredField((String) "Character");
        ((Field) term64002).setAccessible(true);
        Object enum169 = ((Field) term64002).get((Object) null);
        term63597 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term63597, term63597.getClass(), "type", enum169);
        setField(term63597, term63597.getClass(), "data", "");
        Class<? extends Object> term64197 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term64196 = ((Class) term64197).getDeclaredField((String) "Character");
        ((Field) term64196).setAccessible(true);
        Object enum170 = ((Field) term64196).get((Object) null);
        term63996 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term63996, term63996.getClass(), "data", "");
        setField(term63996, term63996.getClass(), "type", enum170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term63597;
        callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term63597, term63996));
    }

};


