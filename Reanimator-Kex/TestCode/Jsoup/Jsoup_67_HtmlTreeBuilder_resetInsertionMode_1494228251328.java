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

public class HtmlTreeBuilder_resetInsertionMode_1494228251328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234621;

    public HtmlTreeBuilder_resetInsertionMode_1494228251328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term234725 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term234673 = new ArrayList();
        ((ArrayList) term234673).add(term234725);
        term234621 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term234621, term234621.getClass(), "stack", term234673);
        setField(term234621, term234621.getClass(), "contextElement", term234725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetInsertionMode", argTypes, term234621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


