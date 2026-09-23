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

public class HtmlTreeBuilder_resetInsertionMode_1494228251378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304812;

    public HtmlTreeBuilder_resetInsertionMode_1494228251378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term304918 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term304964 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term304964, term304964.getClass(), "tagName", "caption");
        setField(term304918, term304918.getClass(), "tag", term304964);
        ArrayList term304864 = new ArrayList();
        ((ArrayList) term304864).add((Object)null);
        ((ArrayList) term304864).add(term304918);
        term304812 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term304812, term304812.getClass(), "stack", term304864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term304812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


