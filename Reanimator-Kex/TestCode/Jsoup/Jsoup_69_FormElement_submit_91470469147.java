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

public class FormElement_submit_91470469147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77112;

    public FormElement_submit_91470469147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77112 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term77170 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term77012 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term77170, term77170.getClass(), "size", 1);
        setElement(term77012, 0, "");
        setField(term77170, term77170.getClass(), "keys", term77012);
        setField(term77112, term77112.getClass(), "attributes", term77170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term77112, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


