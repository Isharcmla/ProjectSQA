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

public class HtmlTreeBuilder_insert_1723153206339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503779;
     Object term503951;

    public HtmlTreeBuilder_insert_1723153206339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term503831 = new ArrayList();
        term503779 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term503885 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term503779, term503779.getClass(), "stack", term503831);
        setField(term503779, term503779.getClass(), "doc", term503885);
        StringBuilder term504011 = new StringBuilder();
        term503951 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term503951, term503951.getClass(), "data", term504011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term503951;
        try {
            callMethod(klass, "insert", argTypes, term503779, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


