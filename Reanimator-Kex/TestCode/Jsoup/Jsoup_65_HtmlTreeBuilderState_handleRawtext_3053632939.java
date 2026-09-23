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

public class HtmlTreeBuilderState_handleRawtext_3053632939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50180;
     Object term50250;

    public HtmlTreeBuilderState_handleRawtext_3053632939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50180 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term50180, term50180.getClass(), "selfClosing", false);
        setField(term50180, term50180.getClass(), "tagName", null);
        Class<? extends Object> term51299 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51298 = ((Class) term51299).getDeclaredField((String) "InTableBody");
        ((Field) term51298).setAccessible(true);
        Object enum122 = ((Field) term51298).get((Object) null);
        Class<? extends Object> term51524 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term51523 = ((Class) term51524).getDeclaredField((String) "Initial");
        ((Field) term51523).setAccessible(true);
        Object enum123 = ((Field) term51523).get((Object) null);
        term50250 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term50308 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term50308, term50308.getClass(), "state", null);
        setField(term50250, term50250.getClass(), "tokeniser", term50308);
        setField(term50250, term50250.getClass(), "state", enum122);
        setField(term50250, term50250.getClass(), "originalState", enum123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term50180;
        args[1] = term50250;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


