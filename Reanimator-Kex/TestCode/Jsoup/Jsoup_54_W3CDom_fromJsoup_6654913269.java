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

public class W3CDom_fromJsoup_6654913269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4505;
     Object term4611;

    public W3CDom_fromJsoup_6654913269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4505 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        Object term4557 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term4505, term4505.getClass(), "factory", term4557);
        term4611 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term4611, term4611.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term4611;
        callMethod(klass, "fromJsoup", argTypes, term4505, args);
    }

};


