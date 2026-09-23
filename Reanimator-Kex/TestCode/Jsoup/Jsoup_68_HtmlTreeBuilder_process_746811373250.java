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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilder_process_746811373250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255256;
     Object term255446;

    public HtmlTreeBuilder_process_746811373250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256150 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term256149 = ((Class) term256150).getDeclaredField((String) "Initial");
        ((Field) term256149).setAccessible(true);
        Object enum575 = ((Field) term256149).get((Object) null);
        term255256 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term255256, term255256.getClass(), "currentToken", null);
        setField(term255256, term255256.getClass(), "state", enum575);
        term255446 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term255446;
        try {
            callMethod(klass, "process", argTypes, term255256, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


