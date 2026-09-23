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

public class HtmlTreeBuilderState_handleRcData_153772563141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56615;
     Object term56685;

    public HtmlTreeBuilderState_handleRcData_153772563141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56615 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term56615, term56615.getClass(), "selfClosing", true);
        term56685 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term56615;
        args[1] = term56685;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


