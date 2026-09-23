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

public class TreeBuilderState_isWhitespace_198456220375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158793;
     Object term163195;

    public TreeBuilderState_isWhitespace_198456220375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term163203 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term163202 = ((Class) term163203).getDeclaredField((String) "Character");
        ((Field) term163202).setAccessible(true);
        Object enum224 = ((Field) term163202).get((Object) null);
        term158793 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term158793, term158793.getClass(), "type", enum224);
        setField(term158793, term158793.getClass(), "data", "\t\t\n\t ");
        Class<? extends Object> term163407 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term163406 = ((Class) term163407).getDeclaredField((String) "Character");
        ((Field) term163406).setAccessible(true);
        Object enum225 = ((Field) term163406).get((Object) null);
        term163195 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term163195, term163195.getClass(), "data", "\t\t\n\t ");
        setField(term163195, term163195.getClass(), "type", enum225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term158793;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term158793, term163195));
        assertTrue(recursiveEquals(retValue, true));
    }

};


