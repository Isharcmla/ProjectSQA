package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FormElement_submit_91470469149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77950;

    public FormElement_submit_91470469149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77950 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term78008 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term77842 = (Object[]) newArray("java.lang.String", 2);
        setIntField(term78008, term78008.getClass(), "size", 1);
        setField(term78008, term78008.getClass(), "keys", term77842);
        setField(term77950, term77950.getClass(), "attributes", term78008);
        setField(term77950, term77950.getClass(), "baseUri", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term77950, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


