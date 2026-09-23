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

public class TreeBuilderState_isWhitespace_198456220347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79250;
     Object term79737;

    public TreeBuilderState_isWhitespace_198456220347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79745 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term79744 = ((Class) term79745).getDeclaredField((String) "Character");
        ((Field) term79744).setAccessible(true);
        Object enum203 = ((Field) term79744).get((Object) null);
        term79250 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term79250, term79250.getClass(), "type", enum203);
        setField(term79250, term79250.getClass(), "data", "\t            ");
        Class<? extends Object> term79953 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term79952 = ((Class) term79953).getDeclaredField((String) "Character");
        ((Field) term79952).setAccessible(true);
        Object enum204 = ((Field) term79952).get((Object) null);
        term79737 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term79737, term79737.getClass(), "data", "\t            ");
        setField(term79737, term79737.getClass(), "type", enum204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term79250;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term79250, term79737));
        assertTrue(recursiveEquals(retValue, true));
    }

};


