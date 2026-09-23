package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Cleaner_createSafeElement_50646280495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34679;
     Object term34739;

    public Cleaner_createSafeElement_50646280495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34679 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term34739 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term34785 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34785, term34785.getClass(), "tagName", "");
        setField(term34739, term34739.getClass(), "tag", term34785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term34739;
        try {
            callMethod(klass, "createSafeElement", argTypes, term34679, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


