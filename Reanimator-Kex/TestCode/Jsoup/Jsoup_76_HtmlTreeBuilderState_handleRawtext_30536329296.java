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

public class HtmlTreeBuilderState_handleRawtext_30536329296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188180;
     Object term188250;

    public HtmlTreeBuilderState_handleRawtext_30536329296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188180 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term188180, term188180.getClass(), "selfClosing", true);
        Class<? extends Object> term197222 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term197221 = ((Class) term197222).getDeclaredField((String) "Data");
        ((Field) term197221).setAccessible(true);
        Object enum204 = ((Field) term197221).get((Object) null);
        Class<? extends Object> term197396 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term197395 = ((Class) term197396).getDeclaredField((String) "AfterAfterBody");
        ((Field) term197395).setAccessible(true);
        Object enum205 = ((Field) term197395).get((Object) null);
        term188250 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term188308 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term188308, term188308.getClass(), "state", enum204);
        setField(term188250, term188250.getClass(), "tokeniser", term188308);
        setField(term188250, term188250.getClass(), "state", enum205);
        setField(term188250, term188250.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term188180;
        args[1] = term188250;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


