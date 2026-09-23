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

public class XmlTreeBuilder_insert_42085483838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190008;
     Object term190130;

    public XmlTreeBuilder_insert_42085483838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term190060 = new ArrayList();
        term190008 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term190008, term190008.getClass(), "stack", term190060);
        term190130 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        setField(term190130, term190130.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term190130;
        try {
            callMethod(klass, "insert", argTypes, term190008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


