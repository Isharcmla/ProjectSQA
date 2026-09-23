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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_196792529242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75240;
     Object term75344;

    public XmlTreeBuilder_insert_196792529242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75240 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term75240, term75240.getClass(), "baseUri", "");
        StringBuilder term75404 = new StringBuilder();
        term75344 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term75344, term75344.getClass(), "data", term75404);
        setBooleanField(term75344, term75344.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term75344;
        try {
            callMethod(klass, "insert", argTypes, term75240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


