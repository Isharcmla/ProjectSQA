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

public class FormElement_equals_81763627630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9338;
     Object term9436;
     Object term9752;
     Object term9753;

    public FormElement_equals_81763627630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9338 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        term9436 = newInstance(Class.forName("java.util.concurrent.ExecutorCompletionService"));
        term9752 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        setField(term9752, term9752.getClass(), "elements", null);
        setField(term9752, term9752.getClass(), "tag", null);
        setField(term9752, term9752.getClass(), "parentNode", null);
        setField(term9752, term9752.getClass(), "childNodes", null);
        setField(term9752, term9752.getClass(), "attributes", null);
        setField(term9752, term9752.getClass(), "baseUri", null);
        setIntField(term9752, term9752.getClass(), "siblingIndex", 0);
        term9753 = newInstance(Class.forName("java.util.concurrent.ExecutorCompletionService"));
        setField(term9753, term9753.getClass(), "executor", null);
        setField(term9753, term9753.getClass(), "aes", null);
        setField(term9753, term9753.getClass(), "completionQueue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9436;
        callMethod(klass, "equals", argTypes, term9338, args);
        assertTrue(recursiveEquals(term9338, term9752));
        assertTrue(recursiveEquals(term9436, term9753));
    }

};


