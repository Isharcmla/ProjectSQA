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

public class HtmlTreeBuilder_process_277508545308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227744;
     Object term227810;
     Object enum573;

    public HtmlTreeBuilder_process_277508545308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227744 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term227744, term227744.getClass(), "currentToken", null);
        term227810 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Class<? extends Object> term228422 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term228421 = ((Class) term228422).getDeclaredField((String) "InCaption");
        ((Field) term228421).setAccessible(true);
        enum573 = ((Field) term228421).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term227810;
        args[1] = enum573;
        try {
            callMethod(klass, "process", argTypes, term227744, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


