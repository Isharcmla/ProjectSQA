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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;

public class FormElement_equals_81763627641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22243;
     Object term23516;

    public FormElement_equals_81763627641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22243 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term23516 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term23516, term23516.getClass(), "elements", null);
        setField(term23516, term23516.getClass(), "tag", null);
        setField(term23516, term23516.getClass(), "parentNode", null);
        setField(term23516, term23516.getClass(), "childNodes", null);
        setField(term23516, term23516.getClass(), "attributes", null);
        setField(term23516, term23516.getClass(), "baseUri", null);
        setIntField(term23516, term23516.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term22243, args);
        assertTrue(recursiveEquals(term22243, term23516));
    }

};


