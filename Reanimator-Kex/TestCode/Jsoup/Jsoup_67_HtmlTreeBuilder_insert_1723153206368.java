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

public class HtmlTreeBuilder_insert_1723153206368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257636;
     Object term257808;

    public HtmlTreeBuilder_insert_1723153206368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term257688 = new ArrayList();
        term257636 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term257742 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term257636, term257636.getClass(), "stack", term257688);
        setField(term257636, term257636.getClass(), "doc", term257742);
        StringBuilder term257868 = new StringBuilder();
        term257808 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term257808, term257808.getClass(), "data", term257868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term257808;
        try {
            callMethod(klass, "insert", argTypes, term257636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


