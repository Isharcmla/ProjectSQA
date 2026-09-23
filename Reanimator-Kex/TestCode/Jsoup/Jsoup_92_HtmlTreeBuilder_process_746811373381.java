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

public class HtmlTreeBuilder_process_746811373381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354117;
     Object term354307;

    public HtmlTreeBuilder_process_746811373381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term354805 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term354804 = ((Class) term354805).getDeclaredField((String) "InFrameset");
        ((Field) term354804).setAccessible(true);
        Object enum606 = ((Field) term354804).get((Object) null);
        term354117 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term354117, term354117.getClass(), "currentToken", null);
        setField(term354117, term354117.getClass(), "state", enum606);
        term354307 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term354307;
        try {
            callMethod(klass, "process", argTypes, term354117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


