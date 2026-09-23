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

public class TreeBuilderState_isWhitespace_1984562203149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1383619;
     Object term1390697;

    public TreeBuilderState_isWhitespace_1984562203149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1390705 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1390704 = ((Class) term1390705).getDeclaredField((String) "Character");
        ((Field) term1390704).setAccessible(true);
        Object enum302 = ((Field) term1390704).get((Object) null);
        term1383619 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1383619, term1383619.getClass(), "type", enum302);
        setField(term1383619, term1383619.getClass(), "data", "\n \n   \t \t\t\n\n\n\n\n\n\n\n\n\n\n\n \t\n\n \n\n \n\n\n\n\n\n\t\n\n\t\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n     \t\n\n\t\t\n\n\n\n\n \n\n\t\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\n");
        Class<? extends Object> term1391203 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1391202 = ((Class) term1391203).getDeclaredField((String) "Character");
        ((Field) term1391202).setAccessible(true);
        Object enum303 = ((Field) term1391202).get((Object) null);
        term1390697 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1390697, term1390697.getClass(), "data", "\n \n   \t \t\t\n\n\n\n\n\n\n\n\n\n\n\n \t\n\n \n\n \n\n\n\n\n\n\t\n\n\t\n\n\n\n\t\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\n\n\n\n\n     \t\n\n\t\t\n\n\n\n\n \n\n\t\n\t\n\n\n\n\n\n\t\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\n");
        setField(term1390697, term1390697.getClass(), "type", enum303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1383619;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1383619, term1390697));
        assertTrue(recursiveEquals(retValue, true));
    }

};


