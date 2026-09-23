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

public class HtmlTreeBuilder_insert_1723153206211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302953;
     Object term303071;

    public HtmlTreeBuilder_insert_1723153206211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term303005 = new ArrayList();
        term302953 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term302953, term302953.getClass(), "stack", term303005);
        StringBuilder term303131 = new StringBuilder();
        term303071 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term303071, term303071.getClass(), "data", term303131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term303071;
        try {
            callMethod(klass, "insert", argTypes, term302953, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


