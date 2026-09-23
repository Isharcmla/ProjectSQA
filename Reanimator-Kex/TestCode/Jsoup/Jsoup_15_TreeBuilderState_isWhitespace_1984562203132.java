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

public class TreeBuilderState_isWhitespace_1984562203132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017052;
     Object term1210639;

    public TreeBuilderState_isWhitespace_1984562203132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1210647 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1210646 = ((Class) term1210647).getDeclaredField((String) "Character");
        ((Field) term1210646).setAccessible(true);
        Object enum285 = ((Field) term1210646).get((Object) null);
        term1017052 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1017052, term1017052.getClass(), "type", enum285);
        setField(term1017052, term1017052.getClass(), "data", "\n\n\n\t  \n\n\n\n\n\t\t\n\n\n\t\n\t\n\t\n\t\n\n  \n\n\n\t\t\t\t\n\n\n\t\n\n\n\t\n\n\n\n \n\n\n\n \n\t\n\n\n\t\n\n \t\n\t \t\n \n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\t\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\n\t\t\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\t\t\t\n\n\n\n\t\n\t\n\n\n\n\t\n\t\n\n\n\n\n\n   \n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n \n \t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\t\n\t\n\t\n\n\n\t\n\n\t\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n                                                                                                                                                                                                                        ");
        Class<? extends Object> term1211647 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1211646 = ((Class) term1211647).getDeclaredField((String) "Character");
        ((Field) term1211646).setAccessible(true);
        Object enum286 = ((Field) term1211646).get((Object) null);
        term1210639 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1210639, term1210639.getClass(), "data", "\n\n\n\t  \n\n\n\n\n\t\t\n\n\n\t\n\t\n\t\n\t\n\n  \n\n\n\t\t\t\t\n\n\n\t\n\n\n\t\n\n\n\n \n\n\n\n \n\t\n\n\n\t\n\n \t\n\t \t\n \n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\t\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\n\t\t\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\t\t\t\n\n\n\n\t\n\t\n\n\n\n\t\n\t\n\n\n\n\n\n   \n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n \n \t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\t\n\t\n\t\n\n\n\t\n\n\t\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n                                                                                                                                                                                                                        ");
        setField(term1210639, term1210639.getClass(), "type", enum286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1017052;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1017052, term1210639));
        assertTrue(recursiveEquals(retValue, true));
    }

};


