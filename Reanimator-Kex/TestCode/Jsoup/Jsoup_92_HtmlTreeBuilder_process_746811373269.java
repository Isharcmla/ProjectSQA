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

public class HtmlTreeBuilder_process_746811373269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327806;
     Object term327996;

    public HtmlTreeBuilder_process_746811373269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term328712 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term328711 = ((Class) term328712).getDeclaredField((String) "Initial");
        ((Field) term328711).setAccessible(true);
        Object enum603 = ((Field) term328711).get((Object) null);
        term327806 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term327806, term327806.getClass(), "currentToken", null);
        setField(term327806, term327806.getClass(), "state", enum603);
        term327996 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term327996;
        try {
            callMethod(klass, "process", argTypes, term327806, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


