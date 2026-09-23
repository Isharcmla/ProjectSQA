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

public class W3CDom_fromJsoup_66549132610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54026;
     Object term54118;

    public W3CDom_fromJsoup_66549132610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54026 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term54026, term54026.getClass(), "factory", "");
        term54118 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term54248 = newInstance(Class.forName("java.io.ObjectStreamClass$FieldReflectorKey"));
        setField(term54118, term54118.getClass(), "location", "                                                                                                                                                                                                                                                                ");
        setField(term54118, term54118.getClass(), "shadowChildrenRef", term54248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term54118;
        callMethod(klass, "fromJsoup", argTypes, term54026, args);
    }

};


