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

public class HtmlTreeBuilder_process_746811373237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426781;
     Object term426971;

    public HtmlTreeBuilder_process_746811373237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term427459 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term427458 = ((Class) term427459).getDeclaredField((String) "InCaption");
        ((Field) term427458).setAccessible(true);
        Object enum1305 = ((Field) term427458).get((Object) null);
        term426781 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term426781, term426781.getClass(), "currentToken", null);
        setField(term426781, term426781.getClass(), "state", enum1305);
        term426971 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term426971;
        try {
            callMethod(klass, "process", argTypes, term426781, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


