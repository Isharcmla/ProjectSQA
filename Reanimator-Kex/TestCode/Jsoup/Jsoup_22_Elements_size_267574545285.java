package org.jsoup.select;

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
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Elements_size_267574545285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42165;

    public Elements_size_267574545285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42165 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term42221 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term42277 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term42221, term42221.getClass(), "contents", term42277);
        setField(term42165, term42165.getClass(), "contents", term42221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "size", argTypes, term42165, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


