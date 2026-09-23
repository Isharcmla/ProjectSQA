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
     Object term33989;
     Object term34059;

    public HtmlTreeBuilderState_handleRcData_153772563127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33989 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term33989, term33989.getClass(), "selfClosing", false);
        setField(term33989, term33989.getClass(), "tagName", null);
        Class<? extends Object> term34791 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term34790 = ((Class) term34791).getDeclaredField((String) "Initial");
        ((Field) term34790).setAccessible(true);
        Object enum84 = ((Field) term34790).get((Object) null);
        term34059 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term34117 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term34117, term34117.getClass(), "state", null);
        setField(term34059, term34059.getClass(), "tokeniser", term34117);
        setField(term34059, term34059.getClass(), "state", enum84);
        setField(term34059, term34059.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term33989;
        args[1] = term34059;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


