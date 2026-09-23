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

public class HtmlTreeBuilderState_handleRawtext_30536329137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85417;
     Object term85487;

    public HtmlTreeBuilderState_handleRawtext_30536329137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85417 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term85417, term85417.getClass(), "selfClosing", false);
        setField(term85417, term85417.getClass(), "tagName", null);
        Class<? extends Object> term86538 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term86537 = ((Class) term86538).getDeclaredField((String) "InTableBody");
        ((Field) term86537).setAccessible(true);
        Object enum194 = ((Field) term86537).get((Object) null);
        Class<? extends Object> term86763 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term86762 = ((Class) term86763).getDeclaredField((String) "Initial");
        ((Field) term86762).setAccessible(true);
        Object enum195 = ((Field) term86762).get((Object) null);
        term85487 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term85545 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term85545, term85545.getClass(), "state", null);
        setField(term85487, term85487.getClass(), "tokeniser", term85545);
        setField(term85487, term85487.getClass(), "state", enum194);
        setField(term85487, term85487.getClass(), "originalState", enum195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term85417;
        args[1] = term85487;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


