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

public class HtmlTreeBuilderState_handleRcData_153772563129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38422;
     Object term38530;

    public HtmlTreeBuilderState_handleRcData_153772563129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38422 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term38422, term38422.getClass(), "selfClosing", true);
        setField(term38422, term38422.getClass(), "tagName", "");
        Class<? extends Object> term39838 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term39837 = ((Class) term39838).getDeclaredField((String) "Data");
        ((Field) term39837).setAccessible(true);
        Object enum91 = ((Field) term39837).get((Object) null);
        Class<? extends Object> term40012 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40011 = ((Class) term40012).getDeclaredField((String) "InColumnGroup");
        ((Field) term40011).setAccessible(true);
        Object enum92 = ((Field) term40011).get((Object) null);
        Class<? extends Object> term40243 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40242 = ((Class) term40243).getDeclaredField((String) "Initial");
        ((Field) term40242).setAccessible(true);
        Object enum93 = ((Field) term40242).get((Object) null);
        term38530 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term38588 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term38588, term38588.getClass(), "state", enum91);
        setField(term38530, term38530.getClass(), "tokeniser", term38588);
        setField(term38530, term38530.getClass(), "state", enum92);
        setField(term38530, term38530.getClass(), "originalState", enum93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term38422;
        args[1] = term38530;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


