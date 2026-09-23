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

public class TreeBuilderState_isWhitespace_198456220395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133113;
     Object term154164;

    public TreeBuilderState_isWhitespace_198456220395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term154172 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term154171 = ((Class) term154172).getDeclaredField((String) "Character");
        ((Field) term154171).setAccessible(true);
        Object enum226 = ((Field) term154171).get((Object) null);
        term133113 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term133113, term133113.getClass(), "type", enum226);
        setField(term133113, term133113.getClass(), "data", "\n\n\n\t \t\n\t\n\n \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        Class<? extends Object> term154873 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term154872 = ((Class) term154873).getDeclaredField((String) "Character");
        ((Field) term154872).setAccessible(true);
        Object enum227 = ((Field) term154872).get((Object) null);
        term154164 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term154164, term154164.getClass(), "data", "\n\n\n\t \t\n\t\n\n \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        setField(term154164, term154164.getClass(), "type", enum227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term133113;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term133113, term154164));
        assertTrue(recursiveEquals(retValue, true));
    }

};


