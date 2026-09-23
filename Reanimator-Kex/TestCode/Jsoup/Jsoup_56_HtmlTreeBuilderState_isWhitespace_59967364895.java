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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilderState_isWhitespace_59967364895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70517;

    public HtmlTreeBuilderState_isWhitespace_59967364895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71344 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term71343 = ((Class) term71344).getDeclaredField((String) "Character");
        ((Field) term71343).setAccessible(true);
        Object enum190 = ((Field) term71343).get((Object) null);
        term70517 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term70517, term70517.getClass(), "type", enum190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term70517;
        try {
            callMethod(klass, "isWhitespace", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


