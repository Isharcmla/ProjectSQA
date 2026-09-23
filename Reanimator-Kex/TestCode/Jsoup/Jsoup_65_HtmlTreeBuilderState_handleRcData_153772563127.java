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

public class HtmlTreeBuilderState_handleRcData_153772563127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34307;
     Object term34377;

    public HtmlTreeBuilderState_handleRcData_153772563127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34307 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term34307, term34307.getClass(), "selfClosing", true);
        Class<? extends Object> term35652 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term35651 = ((Class) term35652).getDeclaredField((String) "Data");
        ((Field) term35651).setAccessible(true);
        Object enum100 = ((Field) term35651).get((Object) null);
        Class<? extends Object> term35826 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term35825 = ((Class) term35826).getDeclaredField((String) "InCell");
        ((Field) term35825).setAccessible(true);
        Object enum101 = ((Field) term35825).get((Object) null);
        Class<? extends Object> term36036 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term36035 = ((Class) term36036).getDeclaredField((String) "Initial");
        ((Field) term36035).setAccessible(true);
        Object enum102 = ((Field) term36035).get((Object) null);
        term34377 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term34435 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term34435, term34435.getClass(), "state", enum100);
        setField(term34377, term34377.getClass(), "tokeniser", term34435);
        setField(term34377, term34377.getClass(), "state", enum101);
        setField(term34377, term34377.getClass(), "originalState", enum102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term34307;
        args[1] = term34377;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


