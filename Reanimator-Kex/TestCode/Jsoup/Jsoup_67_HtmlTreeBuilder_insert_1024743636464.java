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
import java.lang.Object;

public class HtmlTreeBuilder_insert_1024743636464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303447;
     Object term303707;

    public HtmlTreeBuilder_insert_1024743636464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term303553 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term303599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term303599, term303599.getClass(), "tagName", "");
        setField(term303553, term303553.getClass(), "tag", term303599);
        ArrayList term303499 = new ArrayList();
        ((ArrayList) term303499).add(term303553);
        term303447 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term303447, term303447.getClass(), "stack", term303499);
        term303707 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term303707;
        try {
            callMethod(klass, "insert", argTypes, term303447, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


