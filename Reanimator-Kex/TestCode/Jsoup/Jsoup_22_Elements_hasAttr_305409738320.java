package org.jsoup.select;

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
import java.lang.NullPointerException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Elements_hasAttr_305409738320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56671;

    public Elements_hasAttr_305409738320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56671 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term56727 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object term56783 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term56727, term56727.getClass(), "contents", term56783);
        setField(term56671, term56671.getClass(), "contents", term56727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Elements");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "hasAttr", argTypes, term56671, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


