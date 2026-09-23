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

public class TreeBuilderState_isWhitespace_1984562203108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176241;
     Object term194168;

    public TreeBuilderState_isWhitespace_1984562203108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194176 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194175 = ((Class) term194176).getDeclaredField((String) "Character");
        ((Field) term194175).setAccessible(true);
        Object enum242 = ((Field) term194175).get((Object) null);
        term176241 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term176241, term176241.getClass(), "type", enum242);
        setField(term176241, term176241.getClass(), "data", "\n \n\t \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        Class<? extends Object> term194871 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194870 = ((Class) term194871).getDeclaredField((String) "Character");
        ((Field) term194870).setAccessible(true);
        Object enum243 = ((Field) term194870).get((Object) null);
        term194168 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term194168, term194168.getClass(), "data", "\n \n\t \n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term194168, term194168.getClass(), "type", enum243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term176241;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term176241, term194168));
        assertTrue(recursiveEquals(retValue, true));
    }

};


