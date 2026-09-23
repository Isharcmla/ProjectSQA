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

public class Document_title_4082304106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8868;

    public Document_title_4082304106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8868 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term8868, term8868.getClass(), "outputSettings", null);
        setField(term8868, term8868.getClass(), "tag", null);
        setField(term8868, term8868.getClass(), "classNames", null);
        setField(term8868, term8868.getClass(), "parentNode", null);
        setField(term8868, term8868.getClass(), "childNodes", null);
        setField(term8868, term8868.getClass(), "attributes", null);
        setField(term8868, term8868.getClass(), "baseUri", null);
        setIntField(term8868, term8868.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "title", argTypes, term8868, args);
    }

};


