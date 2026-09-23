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
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilder_process_746811373389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358906;
     Object term359164;

    public HtmlTreeBuilder_process_746811373389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term360218 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term360217 = ((Class) term360218).getDeclaredField((String) "AfterHead");
        ((Field) term360217).setAccessible(true);
        Object enum614 = ((Field) term360217).get((Object) null);
        term358906 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term358974 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term358906, term358906.getClass(), "currentToken", term358974);
        setField(term358906, term358906.getClass(), "state", enum614);
        Class<? extends Object> term360437 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term360436 = ((Class) term360437).getDeclaredField((String) "StartTag");
        ((Field) term360436).setAccessible(true);
        Object enum615 = ((Field) term360436).get((Object) null);
        term359164 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term359164, term359164.getClass(), "type", enum615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term359164;
        try {
            callMethod(klass, "process", argTypes, term358906, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


