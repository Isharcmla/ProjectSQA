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
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilderState_handleRawtext_30536329442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604801;
     Object term604909;

    public HtmlTreeBuilderState_handleRawtext_30536329442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604801 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term604801, term604801.getClass(), "selfClosing", true);
        setField(term604801, term604801.getClass(), "tagName", "");
        Class<? extends Object> term627446 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term627445 = ((Class) term627446).getDeclaredField((String) "Data");
        ((Field) term627445).setAccessible(true);
        Object enum236 = ((Field) term627445).get((Object) null);
        Class<? extends Object> term627620 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term627619 = ((Class) term627620).getDeclaredField((String) "InFrameset");
        ((Field) term627619).setAccessible(true);
        Object enum237 = ((Field) term627619).get((Object) null);
        term604909 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term604967 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term604967, term604967.getClass(), "state", enum236);
        setField(term604909, term604909.getClass(), "tokeniser", term604967);
        setField(term604909, term604909.getClass(), "state", enum237);
        setField(term604909, term604909.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term604801;
        args[1] = term604909;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


