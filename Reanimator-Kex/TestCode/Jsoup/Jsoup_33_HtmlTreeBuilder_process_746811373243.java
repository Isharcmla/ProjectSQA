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

public class HtmlTreeBuilder_process_746811373243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430885;
     Object term431079;

    public HtmlTreeBuilder_process_746811373243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term432133 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term432132 = ((Class) term432133).getDeclaredField((String) "InHeadNoscript");
        ((Field) term432132).setAccessible(true);
        Object enum1308 = ((Field) term432132).get((Object) null);
        term430885 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term430885, term430885.getClass(), "currentToken", null);
        setField(term430885, term430885.getClass(), "state", enum1308);
        Class<? extends Object> term432367 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term432366 = ((Class) term432367).getDeclaredField((String) "EndTag");
        ((Field) term432366).setAccessible(true);
        Object enum1309 = ((Field) term432366).get((Object) null);
        term431079 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term431079, term431079.getClass(), "type", enum1309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term431079;
        try {
            callMethod(klass, "process", argTypes, term430885, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


