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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilder_process_746811373154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397715;
     Object term397907;

    public HtmlTreeBuilder_process_746811373154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term399767 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term399766 = ((Class) term399767).getDeclaredField((String) "InFrameset");
        ((Field) term399766).setAccessible(true);
        Object enum1294 = ((Field) term399766).get((Object) null);
        term397715 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term397715, term397715.getClass(), "currentToken", null);
        setField(term397715, term397715.getClass(), "state", enum1294);
        term397907 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term397907;
        try {
            callMethod(klass, "process", argTypes, term397715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


