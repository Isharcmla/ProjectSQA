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

public class TreeBuilderState_isWhitespace_1984562203119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243386;
     Object term251938;

    public TreeBuilderState_isWhitespace_1984562203119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term251946 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term251945 = ((Class) term251946).getDeclaredField((String) "Character");
        ((Field) term251945).setAccessible(true);
        Object enum268 = ((Field) term251945).get((Object) null);
        term243386 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term243386, term243386.getClass(), "type", enum268);
        setField(term243386, term243386.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        Class<? extends Object> term252639 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term252638 = ((Class) term252639).getDeclaredField((String) "Character");
        ((Field) term252638).setAccessible(true);
        Object enum269 = ((Field) term252638).get((Object) null);
        term251938 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term251938, term251938.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term251938, term251938.getClass(), "type", enum269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term243386;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term243386, term251938));
        assertTrue(recursiveEquals(retValue, true));
    }

};


