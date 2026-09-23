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

public class TreeBuilderState_isWhitespace_1984562203141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2193631;
     Object term2734652;

    public TreeBuilderState_isWhitespace_1984562203141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2734660 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term2734659 = ((Class) term2734660).getDeclaredField((String) "Character");
        ((Field) term2734659).setAccessible(true);
        Object enum298 = ((Field) term2734659).get((Object) null);
        term2193631 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term2193631, term2193631.getClass(), "type", enum298);
        setField(term2193631, term2193631.getClass(), "data", "\n \n\n    \n \n\t\n\n\n\n\n \n\n\n\n \n   \t\n\n\t\t\n\t\t\n\n\t\n\n\n\n\n\n\n\t\n\n \n\n\t\n\t\n\n\t\n\n \n\t\t\n \t\t \n\n\n\n\n\n\n\n\n\n\t\t\t \n\t\n\n\n \n\n\n\n\t\n\t\n\t\n\t\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\t\t\n\n\n\t\t\n\n\t\n\n\t\n\n\t\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n \t\n\n\t\n\n\n\t\n\n\t\n\n\n\t\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n \t\n\t\n\n \t\n\t\n\n\n\n\n\n\n\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\n\t\t\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n \n\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n                                                                                                                                                                                                                                                                ");
        Class<? extends Object> term2736132 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term2736131 = ((Class) term2736132).getDeclaredField((String) "Character");
        ((Field) term2736131).setAccessible(true);
        Object enum299 = ((Field) term2736131).get((Object) null);
        term2734652 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term2734652, term2734652.getClass(), "data", "\n \n\n    \n \n\t\n\n\n\n\n \n\n\n\n \n   \t\n\n\t\t\n\t\t\n\n\t\n\n\n\n\n\n\n\t\n\n \n\n\t\n\t\n\n\t\n\n \n\t\t\n \t\t \n\n\n\n\n\n\n\n\n\n\t\t\t \n\t\n\n\n \n\n\n\n\t\n\t\n\t\n\t\n\n\n\n\n\n\n\t\n\n\n\n\n\t\n\t\t\n\n\n\t\t\n\n\t\n\n\t\n\n\t\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n \t\n\n\t\n\n\n\t\n\n\t\n\n\n\t\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n \t\n\t\n\n \t\n\t\n\n\n\n\n\n\n\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\n\t\t\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n \n\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n                                                                                                                                                                                                                                                                ");
        setField(term2734652, term2734652.getClass(), "type", enum299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term2193631;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term2193631, term2734652));
        assertTrue(recursiveEquals(retValue, true));
    }

};


