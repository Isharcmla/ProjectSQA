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

public class HtmlTreeBuilder_process_746811373165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405445;
     Object term405637;

    public HtmlTreeBuilder_process_746811373165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term406105 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term406104 = ((Class) term406105).getDeclaredField((String) "InSelect");
        ((Field) term406104).setAccessible(true);
        Object enum1303 = ((Field) term406104).get((Object) null);
        term405445 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term405445, term405445.getClass(), "currentToken", null);
        setField(term405445, term405445.getClass(), "state", enum1303);
        term405637 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term405637;
        try {
            callMethod(klass, "process", argTypes, term405445, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


