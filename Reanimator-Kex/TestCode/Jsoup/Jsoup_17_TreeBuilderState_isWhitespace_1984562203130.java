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

public class TreeBuilderState_isWhitespace_1984562203130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239570;
     Object term262338;

    public TreeBuilderState_isWhitespace_1984562203130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term262346 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term262345 = ((Class) term262346).getDeclaredField((String) "Character");
        ((Field) term262345).setAccessible(true);
        Object enum272 = ((Field) term262345).get((Object) null);
        term239570 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term239570, term239570.getClass(), "type", enum272);
        setField(term239570, term239570.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        Class<? extends Object> term263039 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term263038 = ((Class) term263039).getDeclaredField((String) "Character");
        ((Field) term263038).setAccessible(true);
        Object enum273 = ((Field) term263038).get((Object) null);
        term262338 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term262338, term262338.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term262338, term262338.getClass(), "type", enum273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term239570;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term239570, term262338));
        assertTrue(recursiveEquals(retValue, true));
    }

};


