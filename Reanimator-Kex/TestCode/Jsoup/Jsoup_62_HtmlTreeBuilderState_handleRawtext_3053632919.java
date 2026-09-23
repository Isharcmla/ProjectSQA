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

public class HtmlTreeBuilderState_handleRawtext_3053632919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13881;
     Object term13989;

    public HtmlTreeBuilderState_handleRawtext_3053632919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13881 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term13881, term13881.getClass(), "selfClosing", false);
        setField(term13881, term13881.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        term13989 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term14055 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term13989, term13989.getClass(), "settings", term14055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term13881;
        args[1] = term13989;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


