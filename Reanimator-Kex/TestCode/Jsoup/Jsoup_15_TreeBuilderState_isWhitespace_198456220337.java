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

public class TreeBuilderState_isWhitespace_198456220337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67742;
     Object term68554;

    public TreeBuilderState_isWhitespace_198456220337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68562 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68561 = ((Class) term68562).getDeclaredField((String) "Character");
        ((Field) term68561).setAccessible(true);
        Object enum168 = ((Field) term68561).get((Object) null);
        term67742 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term67742, term67742.getClass(), "type", enum168);
        setField(term67742, term67742.getClass(), "data", "");
        Class<? extends Object> term68756 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term68755 = ((Class) term68756).getDeclaredField((String) "Character");
        ((Field) term68755).setAccessible(true);
        Object enum169 = ((Field) term68755).get((Object) null);
        term68554 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term68554, term68554.getClass(), "data", "");
        setField(term68554, term68554.getClass(), "type", enum169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term67742;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term67742, term68554));
        assertTrue(recursiveEquals(retValue, true));
    }

};


