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
import java.lang.Object;

public class Tag_setAncestor_1913556177147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30975;
     Object term30389;

    public Tag_setAncestor_1913556177147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30975 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30975, term30975.getClass(), "ancestors", null);
        term30389 = (Object[]) newArray("java.lang.String", 1);
        setElement(term30389, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term30389;
        try {
            callMethod(klass, "setAncestor", argTypes, term30975, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


