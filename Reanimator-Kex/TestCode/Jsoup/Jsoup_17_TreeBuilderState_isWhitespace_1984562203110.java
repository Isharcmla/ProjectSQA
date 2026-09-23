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

public class TreeBuilderState_isWhitespace_1984562203110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181742;
     Object term196407;

    public TreeBuilderState_isWhitespace_1984562203110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196415 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term196414 = ((Class) term196415).getDeclaredField((String) "Character");
        ((Field) term196414).setAccessible(true);
        Object enum246 = ((Field) term196414).get((Object) null);
        term181742 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term181742, term181742.getClass(), "type", enum246);
        setField(term181742, term181742.getClass(), "data", "\n\t\n  \t \n\n\n\t\n                                                                                                                 ");
        Class<? extends Object> term196747 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term196746 = ((Class) term196747).getDeclaredField((String) "Character");
        ((Field) term196746).setAccessible(true);
        Object enum247 = ((Field) term196746).get((Object) null);
        term196407 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term196407, term196407.getClass(), "data", "\n\t\n  \t \n\n\n\t\n                                                                                                                 ");
        setField(term196407, term196407.getClass(), "type", enum247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term181742;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term181742, term196407));
        assertTrue(recursiveEquals(retValue, true));
    }

};


