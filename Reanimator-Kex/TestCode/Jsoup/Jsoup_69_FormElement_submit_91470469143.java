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

public class FormElement_submit_91470469143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75823;

    public FormElement_submit_91470469143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75823 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term75881 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term75727 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term75881, term75881.getClass(), "size", 1);
        setField(term75881, term75881.getClass(), "keys", term75727);
        setField(term75823, term75823.getClass(), "attributes", term75881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term75823, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


