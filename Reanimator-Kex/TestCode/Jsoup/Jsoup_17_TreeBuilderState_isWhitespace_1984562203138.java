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

public class TreeBuilderState_isWhitespace_1984562203138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274287;
     Object term275375;

    public TreeBuilderState_isWhitespace_1984562203138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term275383 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term275382 = ((Class) term275383).getDeclaredField((String) "Character");
        ((Field) term275382).setAccessible(true);
        Object enum285 = ((Field) term275382).get((Object) null);
        term274287 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term274287, term274287.getClass(), "type", enum285);
        setField(term274287, term274287.getClass(), "data", "\t\t\n\n \n\t\n\t\t");
        Class<? extends Object> term275597 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term275596 = ((Class) term275597).getDeclaredField((String) "Character");
        ((Field) term275596).setAccessible(true);
        Object enum286 = ((Field) term275596).get((Object) null);
        term275375 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term275375, term275375.getClass(), "data", "\t\t\n\n \n\t\n\t\t");
        setField(term275375, term275375.getClass(), "type", enum286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term274287;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term274287, term275375));
        assertTrue(recursiveEquals(retValue, true));
    }

};


