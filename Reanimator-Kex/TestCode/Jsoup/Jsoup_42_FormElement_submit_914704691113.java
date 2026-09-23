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

public class FormElement_submit_914704691113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49733;

    public FormElement_submit_914704691113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term49851 = new LinkedHashMap();
        ((LinkedHashMap) term49851).put("", "");
        term49733 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term49791 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term49791, term49791.getClass(), "attributes", term49851);
        setField(term49733, term49733.getClass(), "attributes", term49791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term49733, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


