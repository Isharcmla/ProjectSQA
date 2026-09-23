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

public class TreeBuilderState_isWhitespace_1984562203129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705031;
     Object term708823;

    public TreeBuilderState_isWhitespace_1984562203129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term708831 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term708830 = ((Class) term708831).getDeclaredField((String) "Character");
        ((Field) term708830).setAccessible(true);
        Object enum281 = ((Field) term708830).get((Object) null);
        term705031 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term705031, term705031.getClass(), "type", enum281);
        setField(term705031, term705031.getClass(), "data", "  \n\t   \n\n\t \n\t\t\n\n\t\n\n\n \n\n\n\n\t\n  \t\t\n\n\n\t\n\n\n\n\t\n\n\n\n\t\n\n\n\n \n\n\t\n\t\n\t\n\n\n\n\t\n \n\t  \t \n\t\t\t\t\t\t\n\n\n\n\n\n\n\n\n\n\t\t\n\n\n\t\n\t\t\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\t\n\n\t\n\t\n\n\n\n\n\n    \t\n\n\n\t\t\n\t\n\n\n\n \n\n\n\n\n\t\n\t\n\n\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n \n\n\n\t\n\n\n\t\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\u0001                                                                                          ");
        Class<? extends Object> term709957 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term709956 = ((Class) term709957).getDeclaredField((String) "Character");
        ((Field) term709956).setAccessible(true);
        Object enum282 = ((Field) term709956).get((Object) null);
        term708823 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term708823, term708823.getClass(), "data", "  \n\t   \n\n\t \n\t\t\n\n\t\n\n\n \n\n\n\n\t\n  \t\t\n\n\n\t\n\n\n\n\t\n\n\n\n\t\n\n\n\n \n\n\t\n\t\n\t\n\n\n\n\t\n \n\t  \t \n\t\t\t\t\t\t\n\n\n\n\n\n\n\n\n\n\t\t\n\n\n\t\n\t\t\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\t\t\n\n\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\t\n\n\n\n\t\n\n\t\n\t\n\n\n\n\n\n    \t\n\n\n\t\t\n\t\n\n\n\n \n\n\n\n\n\t\n\t\n\n\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\n\n\n\n \n\n\n\t\n\n\n\t\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\u0001                                                                                          ");
        setField(term708823, term708823.getClass(), "type", enum282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term705031;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term705031, term708823));
        assertTrue(recursiveEquals(retValue, false));
    }

};


