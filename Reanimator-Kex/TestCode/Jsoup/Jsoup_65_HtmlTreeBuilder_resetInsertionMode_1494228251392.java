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

public class HtmlTreeBuilder_resetInsertionMode_1494228251392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481308;

    public HtmlTreeBuilder_resetInsertionMode_1494228251392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term481412 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term481360 = new ArrayList();
        ((ArrayList) term481360).add(term481412);
        term481308 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term481308, term481308.getClass(), "stack", term481360);
        setField(term481308, term481308.getClass(), "contextElement", term481412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term481308, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


