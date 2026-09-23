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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Parser_popStackToClose_120125886733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6108;

    public Parser_popStackToClose_120125886733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6108 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term6108, term6108.getClass(), "stack", null);
        setField(term6108, term6108.getClass(), "tq", null);
        setField(term6108, term6108.getClass(), "doc", null);
        setField(term6108, term6108.getClass(), "baseUri", null);
        setBooleanField(term6108, term6108.getClass(), "relaxed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term6108, args);
    }

};


