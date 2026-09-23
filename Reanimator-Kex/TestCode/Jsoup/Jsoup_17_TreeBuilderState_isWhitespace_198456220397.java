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

public class TreeBuilderState_isWhitespace_198456220397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146411;
     Object term158126;

    public TreeBuilderState_isWhitespace_198456220397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term158134 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term158133 = ((Class) term158134).getDeclaredField((String) "Character");
        ((Field) term158133).setAccessible(true);
        Object enum230 = ((Field) term158133).get((Object) null);
        term146411 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term146411, term146411.getClass(), "type", enum230);
        setField(term146411, term146411.getClass(), "data", "\n\t\t\t \n\t\t");
        Class<? extends Object> term158344 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term158343 = ((Class) term158344).getDeclaredField((String) "Character");
        ((Field) term158343).setAccessible(true);
        Object enum231 = ((Field) term158343).get((Object) null);
        term158126 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term158126, term158126.getClass(), "data", "\n\t\t\t \n\t\t");
        setField(term158126, term158126.getClass(), "type", enum231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term146411;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term146411, term158126));
        assertTrue(recursiveEquals(retValue, true));
    }

};


