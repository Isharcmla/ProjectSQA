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
     Object term39439;
     Object term39509;

    public HtmlTreeBuilderState_handleRcData_153772563129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39439 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term39439, term39439.getClass(), "selfClosing", false);
        setField(term39439, term39439.getClass(), "tagName", null);
        Class<? extends Object> term40241 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term40240 = ((Class) term40241).getDeclaredField((String) "Initial");
        ((Field) term40240).setAccessible(true);
        Object enum107 = ((Field) term40240).get((Object) null);
        term39509 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term39567 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term39567, term39567.getClass(), "state", null);
        setField(term39509, term39509.getClass(), "tokeniser", term39567);
        setField(term39509, term39509.getClass(), "state", enum107);
        setField(term39509, term39509.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term39439;
        args[1] = term39509;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


