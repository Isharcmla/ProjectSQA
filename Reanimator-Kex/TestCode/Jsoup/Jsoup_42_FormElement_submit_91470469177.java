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
import java.lang.ClassCastException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;

public class FormElement_submit_91470469177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37743;

    public FormElement_submit_91470469177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term37861 = new LinkedHashMap();
        ((LinkedHashMap) term37861).put("action", "action");
        term37743 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term37801 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term37801, term37801.getClass(), "attributes", term37861);
        setField(term37743, term37743.getClass(), "attributes", term37801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term37743, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


