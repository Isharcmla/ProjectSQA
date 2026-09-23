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

public class HtmlTreeBuilderState_handleRawtext_30536329112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75370;
     Object term75478;

    public HtmlTreeBuilderState_handleRawtext_30536329112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75370 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term75370, term75370.getClass(), "selfClosing", true);
        setField(term75370, term75370.getClass(), "tagName", "            ");
        term75478 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term75544 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term75544, term75544.getClass(), "preserveTagCase", false);
        setField(term75478, term75478.getClass(), "settings", term75544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term75370;
        args[1] = term75478;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


