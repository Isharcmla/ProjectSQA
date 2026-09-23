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
     Object term231536;
     Object term235616;

    public TreeBuilderState_isWhitespace_1984562203110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term235624 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term235623 = ((Class) term235624).getDeclaredField((String) "Character");
        ((Field) term235623).setAccessible(true);
        Object enum260 = ((Field) term235623).get((Object) null);
        term231536 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term231536, term231536.getClass(), "type", enum260);
        setField(term231536, term231536.getClass(), "data", "\n \n\t \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Class<? extends Object> term236319 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term236318 = ((Class) term236319).getDeclaredField((String) "Character");
        ((Field) term236318).setAccessible(true);
        Object enum261 = ((Field) term236318).get((Object) null);
        term235616 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term235616, term235616.getClass(), "data", "\n \n\t \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term235616, term235616.getClass(), "type", enum261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term231536;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term231536, term235616));
        assertTrue(recursiveEquals(retValue, true));
    }

};


