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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TreeBuilderState_isWhitespace_198456220353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92062;

    public TreeBuilderState_isWhitespace_198456220353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92891 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term92890 = ((Class) term92891).getDeclaredField((String) "Character");
        ((Field) term92890).setAccessible(true);
        Object enum168 = ((Field) term92890).get((Object) null);
        term92062 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term92062, term92062.getClass(), "type", enum168);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term92062;
        try {
            callMethod(klass, "isWhitespace", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


