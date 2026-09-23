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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350971;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term351077 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term351123 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term351077, term351077.getClass(), "tag", term351123);
        ArrayList term351023 = new ArrayList();
        ((ArrayList) term351023).add(term351077);
        term350971 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term350971, term350971.getClass(), "stack", term351023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clearStackToTableContext", argTypes, term350971, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


