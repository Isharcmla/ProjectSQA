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

public class HtmlTreeBuilder_resetInsertionMode_1494228251361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723181;

    public HtmlTreeBuilder_resetInsertionMode_1494228251361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term723285 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term723233 = new ArrayList();
        ((ArrayList) term723233).add(term723285);
        term723181 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term723181, term723181.getClass(), "stack", term723233);
        setField(term723181, term723181.getClass(), "contextElement", term723285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term723181, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


