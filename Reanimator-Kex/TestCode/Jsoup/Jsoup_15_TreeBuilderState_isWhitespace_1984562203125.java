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

public class TreeBuilderState_isWhitespace_1984562203125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262981;
     Object term265527;

    public TreeBuilderState_isWhitespace_1984562203125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term265535 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term265534 = ((Class) term265535).getDeclaredField((String) "Character");
        ((Field) term265534).setAccessible(true);
        Object enum275 = ((Field) term265534).get((Object) null);
        term262981 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term262981, term262981.getClass(), "type", enum275);
        setField(term262981, term262981.getClass(), "data", "\n\t\n  \t \n\n\n\t\n                                                                                                                 ");
        Class<? extends Object> term265867 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term265866 = ((Class) term265867).getDeclaredField((String) "Character");
        ((Field) term265866).setAccessible(true);
        Object enum276 = ((Field) term265866).get((Object) null);
        term265527 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term265527, term265527.getClass(), "data", "\n\t\n  \t \n\n\n\t\n                                                                                                                 ");
        setField(term265527, term265527.getClass(), "type", enum276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term262981;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term262981, term265527));
        assertTrue(recursiveEquals(retValue, true));
    }

};


