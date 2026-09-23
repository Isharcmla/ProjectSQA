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

public class FormElement_submit_91470469148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29729;

    public FormElement_submit_91470469148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29729 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term29787 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term29787, term29787.getClass(), "attributes", null);
        setField(term29729, term29729.getClass(), "attributes", term29787);
        setField(term29729, term29729.getClass(), "baseUri", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "submit", argTypes, term29729, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


