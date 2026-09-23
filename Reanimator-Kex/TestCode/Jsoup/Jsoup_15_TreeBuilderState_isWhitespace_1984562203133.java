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

public class TreeBuilderState_isWhitespace_1984562203133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1206873;
     Object term1213719;

    public TreeBuilderState_isWhitespace_1984562203133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1213727 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1213726 = ((Class) term1213727).getDeclaredField((String) "Character");
        ((Field) term1213726).setAccessible(true);
        Object enum287 = ((Field) term1213726).get((Object) null);
        term1206873 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1206873, term1206873.getClass(), "type", enum287);
        setField(term1206873, term1206873.getClass(), "data", "\n\n\t\t\t\t\n\t\t\t\n\t \n\n\n\n\n\t\n\n \n\t\n \t\t\n\t\t\n\n\n\n\n\n\n\t\n\n\n\t\t  \t\t\n\n\n\t\n\n\n\n\t\n\t\n \n\t\n\n\t \t\n\t\n\t\n\n\n\n\n\t\n\t\n\n\t\t\t\n\n\t\n\n\n\t\n\n\n\n \n\n\n\n\n\n\n\n\t\n \n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n   \n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n \n\t\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\t\n\n\t\n\t\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n");
        Class<? extends Object> term1214529 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1214528 = ((Class) term1214529).getDeclaredField((String) "Character");
        ((Field) term1214528).setAccessible(true);
        Object enum288 = ((Field) term1214528).get((Object) null);
        term1213719 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1213719, term1213719.getClass(), "data", "\n\n\t\t\t\t\n\t\t\t\n\t \n\n\n\n\n\t\n\n \n\t\n \t\t\n\t\t\n\n\n\n\n\n\n\t\n\n\n\t\t  \t\t\n\n\n\t\n\n\n\n\t\n\t\n \n\t\n\n\t \t\n\t\n\t\n\n\n\n\n\t\n\t\n\n\t\t\t\n\n\t\n\n\n\t\n\n\n\n \n\n\n\n\n\n\n\n\t\n \n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n   \n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n \n\t\t\n\t\n\n\n\t\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\t\n\n\t\n\t\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\n\n\n\n\t\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n");
        setField(term1213719, term1213719.getClass(), "type", enum288);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1206873;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1206873, term1213719));
        assertTrue(recursiveEquals(retValue, true));
    }

};


