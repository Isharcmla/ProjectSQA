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

public class TreeBuilderState_isWhitespace_1984562203107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167696;
     Object term190230;

    public TreeBuilderState_isWhitespace_1984562203107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190238 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term190237 = ((Class) term190238).getDeclaredField((String) "Character");
        ((Field) term190237).setAccessible(true);
        Object enum240 = ((Field) term190237).get((Object) null);
        term167696 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term167696, term167696.getClass(), "type", enum240);
        setField(term167696, term167696.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        Class<? extends Object> term190932 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term190931 = ((Class) term190932).getDeclaredField((String) "Character");
        ((Field) term190931).setAccessible(true);
        Object enum241 = ((Field) term190931).get((Object) null);
        term190230 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term190230, term190230.getClass(), "data", "\n\n\t\t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term190230, term190230.getClass(), "type", enum241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term167696;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term167696, term190230));
        assertTrue(recursiveEquals(retValue, true));
    }

};


