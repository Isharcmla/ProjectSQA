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

public class TreeBuilderState_isWhitespace_198456220368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128072;
     Object term136956;

    public TreeBuilderState_isWhitespace_198456220368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term136964 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term136963 = ((Class) term136964).getDeclaredField((String) "Character");
        ((Field) term136963).setAccessible(true);
        Object enum216 = ((Field) term136963).get((Object) null);
        term128072 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term128072, term128072.getClass(), "type", enum216);
        setField(term128072, term128072.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        Class<? extends Object> term137658 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term137657 = ((Class) term137658).getDeclaredField((String) "Character");
        ((Field) term137657).setAccessible(true);
        Object enum217 = ((Field) term137657).get((Object) null);
        term136956 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term136956, term136956.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term136956, term136956.getClass(), "type", enum217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term128072;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term128072, term136956));
        assertTrue(recursiveEquals(retValue, true));
    }

};


