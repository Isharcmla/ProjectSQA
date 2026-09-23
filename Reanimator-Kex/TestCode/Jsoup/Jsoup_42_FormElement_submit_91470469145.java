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

public class FormElement_submit_91470469145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24120;

    public FormElement_submit_91470469145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term24238 = new LinkedHashMap();
        term24120 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term24178 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24178, term24178.getClass(), "attributes", term24238);
        setField(term24120, term24120.getClass(), "attributes", term24178);
        setField(term24120, term24120.getClass(), "baseUri", "                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term24120, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


