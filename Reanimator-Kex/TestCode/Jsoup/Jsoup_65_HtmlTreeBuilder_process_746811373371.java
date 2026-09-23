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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class HtmlTreeBuilder_process_746811373371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435675;
     Object term435863;

    public HtmlTreeBuilder_process_746811373371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term437138 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term437137 = ((Class) term437138).getDeclaredField((String) "AfterAfterFrameset");
        ((Field) term437137).setAccessible(true);
        Object enum572 = ((Field) term437137).get((Object) null);
        term435675 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term435675, term435675.getClass(), "currentToken", null);
        setField(term435675, term435675.getClass(), "state", enum572);
        Class<? extends Object> term437384 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term437383 = ((Class) term437384).getDeclaredField((String) "StartTag");
        ((Field) term437383).setAccessible(true);
        Object enum573 = ((Field) term437383).get((Object) null);
        term435863 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term435863, term435863.getClass(), "type", enum573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term435863;
        try {
            callMethod(klass, "process", argTypes, term435675, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


