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

public class TreeBuilderState_isWhitespace_198456220386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191857;
     Object term193814;

    public TreeBuilderState_isWhitespace_198456220386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term193822 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term193821 = ((Class) term193822).getDeclaredField((String) "Character");
        ((Field) term193821).setAccessible(true);
        Object enum236 = ((Field) term193821).get((Object) null);
        term191857 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term191857, term191857.getClass(), "type", enum236);
        setField(term191857, term191857.getClass(), "data", "\t\t\t\n");
        Class<? extends Object> term194024 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term194023 = ((Class) term194024).getDeclaredField((String) "Character");
        ((Field) term194023).setAccessible(true);
        Object enum237 = ((Field) term194023).get((Object) null);
        term193814 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term193814, term193814.getClass(), "data", "\t\t\t\n");
        setField(term193814, term193814.getClass(), "type", enum237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term191857;
        Object retValue = callMethod(klass, "isWhitespace", argTypes, null, args);
        assertTrue(recursiveEquals(term191857, term193814));
        assertTrue(recursiveEquals(retValue, true));
    }

};


