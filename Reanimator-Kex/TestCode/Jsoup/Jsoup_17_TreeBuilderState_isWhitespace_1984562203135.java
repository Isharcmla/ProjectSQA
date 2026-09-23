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

public class TreeBuilderState_isWhitespace_1984562203135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265370;
     Object term270321;

    public TreeBuilderState_isWhitespace_1984562203135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term270329 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term270328 = ((Class) term270329).getDeclaredField((String) "Character");
        ((Field) term270328).setAccessible(true);
        Object enum281 = ((Field) term270328).get((Object) null);
        term265370 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term265370, term265370.getClass(), "type", enum281);
        setField(term265370, term265370.getClass(), "data", "\n\n\n\t   \t\t");
        Class<? extends Object> term270541 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term270540 = ((Class) term270541).getDeclaredField((String) "Character");
        ((Field) term270540).setAccessible(true);
        Object enum282 = ((Field) term270540).get((Object) null);
        term270321 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term270321, term270321.getClass(), "data", "\n\n\n\t   \t\t");
        setField(term270321, term270321.getClass(), "type", enum282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term265370;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term265370, term270321));
        assertTrue(recursiveEquals(retValue, true));
    }

};


