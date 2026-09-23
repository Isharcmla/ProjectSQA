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

public class W3CDom_fromJsoup_66549132665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111768;
     Object term111860;

    public W3CDom_fromJsoup_66549132665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111768 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term111768, term111768.getClass(), "factory", "");
        term111860 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term111962 = newInstance(Class.forName("java.lang.Thread$WeakClassKey"));
        setField(term111860, term111860.getClass(), "location", "                                                                                                                                                                                                                                                                ");
        setField(term111860, term111860.getClass(), "shadowChildrenRef", term111962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term111860;
        callMethod(klass, "fromJsoup", argTypes, term111768, args);
    }

};


