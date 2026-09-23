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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class HtmlTreeBuilder_inSelectScope_1800117556263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455224;

    public HtmlTreeBuilder_inSelectScope_1800117556263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term455276 = new ArrayList();
        term455224 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term455224, term455224.getClass(), "stack", term455276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "inSelectScope", argTypes, term455224, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


