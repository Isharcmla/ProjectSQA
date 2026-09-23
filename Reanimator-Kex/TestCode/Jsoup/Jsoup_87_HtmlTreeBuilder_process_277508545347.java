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

public class HtmlTreeBuilder_process_277508545347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507436;
     Object term507502;
     Object enum624;

    public HtmlTreeBuilder_process_277508545347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507436 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term507436, term507436.getClass(), "currentToken", null);
        term507502 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Class<? extends Object> term508092 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term508091 = ((Class) term508092).getDeclaredField((String) "InSelect");
        ((Field) term508091).setAccessible(true);
        enum624 = ((Field) term508091).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Object[] args = new Object[2];
        args[0] = term507502;
        args[1] = enum624;
        try {
            callMethod(klass, "process", argTypes, term507436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


