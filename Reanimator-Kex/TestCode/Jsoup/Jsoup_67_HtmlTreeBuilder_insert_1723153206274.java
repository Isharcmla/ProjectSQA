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
import java.util.ArrayList;
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218859;
     Object term218977;

    public HtmlTreeBuilder_insert_1723153206274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term218911 = new ArrayList();
        term218859 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term218859, term218859.getClass(), "stack", term218911);
        StringBuilder term219037 = new StringBuilder();
        term218977 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term218977, term218977.getClass(), "data", term219037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term218977;
        try {
            callMethod(klass, "insert", argTypes, term218859, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


