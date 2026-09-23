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

public class TreeBuilderState_isWhitespace_1984562203101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206962;
     Object term207414;

    public TreeBuilderState_isWhitespace_1984562203101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term207422 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term207421 = ((Class) term207422).getDeclaredField((String) "Character");
        ((Field) term207421).setAccessible(true);
        Object enum251 = ((Field) term207421).get((Object) null);
        term206962 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term206962, term206962.getClass(), "type", enum251);
        setField(term206962, term206962.getClass(), "data", "\n\t\t\t \n\t\t");
        Class<? extends Object> term207632 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term207631 = ((Class) term207632).getDeclaredField((String) "Character");
        ((Field) term207631).setAccessible(true);
        Object enum252 = ((Field) term207631).get((Object) null);
        term207414 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term207414, term207414.getClass(), "data", "\n\t\t\t \n\t\t");
        setField(term207414, term207414.getClass(), "type", enum252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term206962;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term206962, term207414));
        assertTrue(recursiveEquals(retValue, true));
    }

};


