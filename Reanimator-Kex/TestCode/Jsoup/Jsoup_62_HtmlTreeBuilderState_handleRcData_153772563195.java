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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HtmlTreeBuilderState_handleRcData_153772563195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69499;
     Object term69607;

    public HtmlTreeBuilderState_handleRcData_153772563195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69499 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term69499, term69499.getClass(), "selfClosing", true);
        setField(term69499, term69499.getClass(), "tagName", "        ");
        term69607 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term69499;
        args[1] = term69607;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


