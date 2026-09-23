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
     Object term257790;
     Object term268813;

    public TreeBuilderState_isWhitespace_1984562203133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term268821 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term268820 = ((Class) term268821).getDeclaredField((String) "Character");
        ((Field) term268820).setAccessible(true);
        Object enum277 = ((Field) term268820).get((Object) null);
        term257790 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term257790, term257790.getClass(), "type", enum277);
        setField(term257790, term257790.getClass(), "data", "\n\t\n\t \n\n\n\t\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        Class<? extends Object> term269521 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term269520 = ((Class) term269521).getDeclaredField((String) "Character");
        ((Field) term269520).setAccessible(true);
        Object enum278 = ((Field) term269520).get((Object) null);
        term268813 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term268813, term268813.getClass(), "data", "\n\t\n\t \n\n\n\t\n\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        setField(term268813, term268813.getClass(), "type", enum278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term257790;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term257790, term268813));
        assertTrue(recursiveEquals(retValue, true));
    }

};


