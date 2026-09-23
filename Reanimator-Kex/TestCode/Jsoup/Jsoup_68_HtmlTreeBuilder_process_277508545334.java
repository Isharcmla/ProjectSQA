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

public class HtmlTreeBuilder_process_277508545334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287866;
     Object term287932;
     Object enum580;

    public HtmlTreeBuilder_process_277508545334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287866 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term287866, term287866.getClass(), "currentToken", null);
        term287932 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Class<? extends Object> term288542 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term288541 = ((Class) term288542).getDeclaredField((String) "InCaption");
        ((Field) term288541).setAccessible(true);
        enum580 = ((Field) term288541).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term287932;
        args[1] = enum580;
        try {
            callMethod(klass, "process", argTypes, term287866, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


