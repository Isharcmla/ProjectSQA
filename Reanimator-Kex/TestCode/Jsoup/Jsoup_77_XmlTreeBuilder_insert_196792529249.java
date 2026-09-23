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

public class XmlTreeBuilder_insert_196792529249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193283;
     Object term193461;

    public XmlTreeBuilder_insert_196792529249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term193395 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term193335 = new ArrayList();
        ((ArrayList) term193335).add(term193395);
        term193283 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term193283, term193283.getClass(), "stack", term193335);
        StringBuilder term193521 = new StringBuilder();
        term193461 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term193461, term193461.getClass(), "data", term193521);
        setBooleanField(term193461, term193461.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term193461;
        try {
            callMethod(klass, "insert", argTypes, term193283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


