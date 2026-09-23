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

public class Document_nodeName_1582854315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11776;

    public Document_nodeName_1582854315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11776 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term11776, term11776.getClass(), "outputSettings", null);
        setField(term11776, term11776.getClass(), "tag", null);
        setField(term11776, term11776.getClass(), "classNames", null);
        setField(term11776, term11776.getClass(), "parentNode", null);
        setField(term11776, term11776.getClass(), "childNodes", null);
        setField(term11776, term11776.getClass(), "attributes", null);
        setField(term11776, term11776.getClass(), "baseUri", null);
        setIntField(term11776, term11776.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodeName", argTypes, term11776, args);
    }

};


