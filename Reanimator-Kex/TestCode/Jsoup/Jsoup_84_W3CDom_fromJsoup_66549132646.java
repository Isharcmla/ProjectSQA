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

public class W3CDom_fromJsoup_66549132646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84036;
     Object term84128;

    public W3CDom_fromJsoup_66549132646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84036 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term84036, term84036.getClass(), "factory", "");
        term84128 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term84128, term84128.getClass(), "location", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term84128;
        callMethod(klass, "fromJsoup", argTypes, term84036, args);
    }

};


