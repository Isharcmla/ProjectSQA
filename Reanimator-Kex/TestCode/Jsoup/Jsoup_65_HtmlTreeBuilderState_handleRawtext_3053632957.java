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

public class HtmlTreeBuilderState_handleRawtext_3053632957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65654;
     Object term65724;

    public HtmlTreeBuilderState_handleRawtext_3053632957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65654 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term65654, term65654.getClass(), "selfClosing", true);
        Class<? extends Object> term66774 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term66773 = ((Class) term66774).getDeclaredField((String) "Data");
        ((Field) term66773).setAccessible(true);
        Object enum158 = ((Field) term66773).get((Object) null);
        Class<? extends Object> term66948 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term66947 = ((Class) term66948).getDeclaredField((String) "AfterAfterBody");
        ((Field) term66947).setAccessible(true);
        Object enum159 = ((Field) term66947).get((Object) null);
        term65724 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term65782 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term65782, term65782.getClass(), "state", enum158);
        setField(term65724, term65724.getClass(), "tokeniser", term65782);
        setField(term65724, term65724.getClass(), "state", enum159);
        setField(term65724, term65724.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term65654;
        args[1] = term65724;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


