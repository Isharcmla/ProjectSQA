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

public class TreeBuilderState_isWhitespace_198456220393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198172;
     Object term198652;

    public TreeBuilderState_isWhitespace_198456220393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198660 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198659 = ((Class) term198660).getDeclaredField((String) "Character");
        ((Field) term198659).setAccessible(true);
        Object enum245 = ((Field) term198659).get((Object) null);
        term198172 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term198172, term198172.getClass(), "type", enum245);
        setField(term198172, term198172.getClass(), "data", "\n\n\t\t \n\n\t \n\n\n");
        Class<? extends Object> term198878 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term198877 = ((Class) term198878).getDeclaredField((String) "Character");
        ((Field) term198877).setAccessible(true);
        Object enum246 = ((Field) term198877).get((Object) null);
        term198652 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term198652, term198652.getClass(), "data", "\n\n\t\t \n\n\t \n\n\n");
        setField(term198652, term198652.getClass(), "type", enum246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term198172;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term198172, term198652));
        assertTrue(recursiveEquals(retValue, true));
    }

};


