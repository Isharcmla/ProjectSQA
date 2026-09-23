package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class W3CDom_fromJsoup_66549132655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101368;
     Object term101460;

    public W3CDom_fromJsoup_66549132655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101368 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term101368, term101368.getClass(), "factory", "");
        term101460 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term101556 = newInstance(Class.forName("java.lang.ClassValue$Entry"));
        setField(term101460, term101460.getClass(), "location", "                                                                                                                                                                                                                                                                ");
        setField(term101460, term101460.getClass(), "shadowChildrenRef", term101556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term101460;
        callMethod(klass, "fromJsoup", argTypes, term101368, args);
    }

};


