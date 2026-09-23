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

public class HtmlTreeBuilder_resetInsertionMode_1494228251262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263480;

    public HtmlTreeBuilder_resetInsertionMode_1494228251262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term263584 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term263532 = new ArrayList();
        ((ArrayList) term263532).add(term263584);
        term263480 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term263480, term263480.getClass(), "stack", term263532);
        setField(term263480, term263480.getClass(), "contextElement", term263584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term263480, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


