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
import java.util.LinkedHashMap;

public class FormElement_submit_91470469124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5494;

    public FormElement_submit_91470469124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5612 = new LinkedHashMap();
        term5494 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term5552 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5552, term5552.getClass(), "attributes", term5612);
        setField(term5494, term5494.getClass(), "attributes", term5552);
        setField(term5494, term5494.getClass(), "baseUri", "POST");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term5494, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


