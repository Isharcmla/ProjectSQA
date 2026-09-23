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

public class TreeBuilderState_isWhitespace_198456220394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119521;
     Object term150734;

    public TreeBuilderState_isWhitespace_198456220394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150742 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term150741 = ((Class) term150742).getDeclaredField((String) "Character");
        ((Field) term150741).setAccessible(true);
        Object enum224 = ((Field) term150741).get((Object) null);
        term119521 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term119521, term119521.getClass(), "type", enum224);
        setField(term119521, term119521.getClass(), "data", "\t\t\n\t ");
        Class<? extends Object> term150946 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term150945 = ((Class) term150946).getDeclaredField((String) "Character");
        ((Field) term150945).setAccessible(true);
        Object enum225 = ((Field) term150945).get((Object) null);
        term150734 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term150734, term150734.getClass(), "data", "\t\t\n\t ");
        setField(term150734, term150734.getClass(), "type", enum225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term119521;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term119521, term150734));
        assertTrue(recursiveEquals(retValue, true));
    }

};


