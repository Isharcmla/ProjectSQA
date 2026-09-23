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

public class TreeBuilderState_isWhitespace_1984562203111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186373;
     Object term200018;

    public TreeBuilderState_isWhitespace_1984562203111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200026 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200025 = ((Class) term200026).getDeclaredField((String) "Character");
        ((Field) term200025).setAccessible(true);
        Object enum248 = ((Field) term200025).get((Object) null);
        term186373 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term186373, term186373.getClass(), "type", enum248);
        setField(term186373, term186373.getClass(), "data", "\n\n\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        Class<? extends Object> term200714 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term200713 = ((Class) term200714).getDeclaredField((String) "Character");
        ((Field) term200713).setAccessible(true);
        Object enum249 = ((Field) term200713).get((Object) null);
        term200018 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term200018, term200018.getClass(), "data", "\n\n\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term200018, term200018.getClass(), "type", enum249);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term186373;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term186373, term200018));
        assertTrue(recursiveEquals(retValue, true));
    }

};


