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
import java.lang.StringBuilder;

public class HtmlTreeBuilder_insert_1723153206366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297068;
     Object term297240;

    public HtmlTreeBuilder_insert_1723153206366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297120 = new ArrayList();
        term297068 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term297174 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term297068, term297068.getClass(), "stack", term297120);
        setField(term297068, term297068.getClass(), "doc", term297174);
        StringBuilder term297300 = new StringBuilder();
        term297240 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term297240, term297240.getClass(), "data", term297300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term297240;
        try {
            callMethod(klass, "insert", argTypes, term297068, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


