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

public class TreeBuilderState_isWhitespace_1984562203144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700129;
     Object term1189620;

    public TreeBuilderState_isWhitespace_1984562203144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1189628 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1189627 = ((Class) term1189628).getDeclaredField((String) "Character");
        ((Field) term1189627).setAccessible(true);
        Object enum294 = ((Field) term1189627).get((Object) null);
        term700129 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term700129, term700129.getClass(), "type", enum294);
        setField(term700129, term700129.getClass(), "data", " \t \n\n\t\n\t\n\t\n\t\n\n\t\n\n\n\t\t\t\n\n\n\n\t\t  \n\n\n\n\n\t\n\n\t\t\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\t  \t \n\n\n\n\n\t\n \n\n\n\n\t\n\n\t\t\t\n\n\t\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\t\n\t\n\n\n\n\n\t\n\n   \n \n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t \n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\n\t\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\u0001                                                                                                                                                                                                                               ");
        Class<? extends Object> term1190621 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1190620 = ((Class) term1190621).getDeclaredField((String) "Character");
        ((Field) term1190620).setAccessible(true);
        Object enum295 = ((Field) term1190620).get((Object) null);
        term1189620 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1189620, term1189620.getClass(), "data", " \t \n\n\t\n\t\n\t\n\t\n\n\t\n\n\n\t\t\t\n\n\n\n\t\t  \n\n\n\n\n\t\n\n\t\t\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\t  \t \n\n\n\n\n\t\n \n\n\n\n\t\n\n\t\t\t\n\n\t\n\n\n\t\n\t\n\n\n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t\t\n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\t\n\t\n\n\n\n\n\t\n\n   \n \n\n\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\t \n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\t\n\n\n\n\n\n\t\n\t\n\n\n\t\n\n\n\t\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\u0001                                                                                                                                                                                                                               ");
        setField(term1189620, term1189620.getClass(), "type", enum295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term700129;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term700129, term1189620));
        assertTrue(recursiveEquals(retValue, false));
    }

};


