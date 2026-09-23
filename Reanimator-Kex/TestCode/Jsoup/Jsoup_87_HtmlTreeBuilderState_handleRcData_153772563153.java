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

public class HtmlTreeBuilderState_handleRcData_153772563153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117225;
     Object term117295;

    public HtmlTreeBuilderState_handleRcData_153772563153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117225 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term117225, term117225.getClass(), "selfClosing", false);
        setField(term117225, term117225.getClass(), "tagName", null);
        Class<? extends Object> term118029 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term118028 = ((Class) term118029).getDeclaredField((String) "Initial");
        ((Field) term118028).setAccessible(true);
        Object enum98 = ((Field) term118028).get((Object) null);
        term117295 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term117353 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term117353, term117353.getClass(), "state", null);
        setField(term117295, term117295.getClass(), "tokeniser", term117353);
        setField(term117295, term117295.getClass(), "state", enum98);
        setField(term117295, term117295.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term117225;
        args[1] = term117295;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


