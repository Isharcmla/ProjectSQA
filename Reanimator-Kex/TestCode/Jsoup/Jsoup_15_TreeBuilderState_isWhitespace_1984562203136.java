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

public class TreeBuilderState_isWhitespace_1984562203136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1299053;
     Object term1397620;

    public TreeBuilderState_isWhitespace_1984562203136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1397628 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1397627 = ((Class) term1397628).getDeclaredField((String) "Character");
        ((Field) term1397627).setAccessible(true);
        Object enum291 = ((Field) term1397627).get((Object) null);
        term1299053 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1299053, term1299053.getClass(), "type", enum291);
        setField(term1299053, term1299053.getClass(), "data", "\t\t\t\n \t  \n\n\n\t\n \n\n\t\n\t \t\t\n\t\n   \t\n\n\n\t\n\t\n\t\n\t\n \n\t\n\n\t\t\n\n\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\n \n \t\n\t\n\t\n\n\n\n\n\t\t\t\n\n\n\n\t\n\n\n\n\n\n\n\n\t\t\t \n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n \n \n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n \n\t\n\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t");
        Class<? extends Object> term1398222 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term1398221 = ((Class) term1398222).getDeclaredField((String) "Character");
        ((Field) term1398221).setAccessible(true);
        Object enum292 = ((Field) term1398221).get((Object) null);
        term1397620 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term1397620, term1397620.getClass(), "data", "\t\t\t\n \t  \n\n\n\t\n \n\n\t\n\t \t\t\n\t\n   \t\n\n\n\t\n\t\n\t\n\t\n \n\t\n\n\t\t\n\n\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n\n \n \t\n\t\n\t\n\n\n\n\n\t\t\t\n\n\n\n\t\n\n\n\n\n\n\n\n\t\t\t \n\n\t\n\n\n\t\n\n\n\n\n\n\t\n\n\n\n\n\n \n \n\n\n\n\t\n\t\n\n\n\n\n\t\t\n\t\n\n\n\t\n\n\n\n\n\n\n\n \n\t\n\n\n\t\n\n\t\n\n\n\n\n\n\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t\n\n\t\n\t");
        setField(term1397620, term1397620.getClass(), "type", enum292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term1299053;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term1299053, term1397620));
        assertTrue(recursiveEquals(retValue, true));
    }

};


