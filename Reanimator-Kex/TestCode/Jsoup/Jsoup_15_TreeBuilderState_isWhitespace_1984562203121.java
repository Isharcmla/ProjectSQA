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

public class TreeBuilderState_isWhitespace_1984562203121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248566;
     Object term256813;

    public TreeBuilderState_isWhitespace_1984562203121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256821 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term256820 = ((Class) term256821).getDeclaredField((String) "Character");
        ((Field) term256820).setAccessible(true);
        Object enum272 = ((Field) term256820).get((Object) null);
        term248566 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term248566, term248566.getClass(), "type", enum272);
        setField(term248566, term248566.getClass(), "data", "\t\n\t\n\n\t");
        Class<? extends Object> term257027 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term257026 = ((Class) term257027).getDeclaredField((String) "Character");
        ((Field) term257026).setAccessible(true);
        Object enum273 = ((Field) term257026).get((Object) null);
        term256813 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term256813, term256813.getClass(), "data", "\t\n\t\n\n\t");
        setField(term256813, term256813.getClass(), "type", enum273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term248566;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term248566, term256813));
        assertTrue(recursiveEquals(retValue, true));
    }

};


