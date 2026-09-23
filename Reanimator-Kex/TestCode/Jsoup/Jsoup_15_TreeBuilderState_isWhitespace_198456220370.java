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

public class TreeBuilderState_isWhitespace_198456220370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133099;
     Object term142097;

    public TreeBuilderState_isWhitespace_198456220370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term142105 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term142104 = ((Class) term142105).getDeclaredField((String) "Character");
        ((Field) term142104).setAccessible(true);
        Object enum218 = ((Field) term142104).get((Object) null);
        term133099 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term133099, term133099.getClass(), "type", enum218);
        setField(term133099, term133099.getClass(), "data", "\n\n\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        Class<? extends Object> term142793 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term142792 = ((Class) term142793).getDeclaredField((String) "Character");
        ((Field) term142792).setAccessible(true);
        Object enum219 = ((Field) term142792).get((Object) null);
        term142097 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term142097, term142097.getClass(), "data", "\n\n\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term142097, term142097.getClass(), "type", enum219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term133099;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term133099, term142097));
        assertTrue(recursiveEquals(retValue, true));
    }

};


