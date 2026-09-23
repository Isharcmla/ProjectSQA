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

public class HtmlTreeBuilder_resetInsertionMode_1494228251231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609531;

    public HtmlTreeBuilder_resetInsertionMode_1494228251231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term609635 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term609583 = new ArrayList();
        ((ArrayList) term609583).add(term609635);
        term609531 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term609531, term609531.getClass(), "stack", term609583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term609531, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


