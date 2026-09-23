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
import java.lang.NullPointerException;
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cleaner_createSafeElement_50646280433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15146;
     Object term15206;

    public Cleaner_createSafeElement_50646280433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15146 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        term15206 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term15206;
        try {
            callMethod(klass, "createSafeElement", argTypes, term15146, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


