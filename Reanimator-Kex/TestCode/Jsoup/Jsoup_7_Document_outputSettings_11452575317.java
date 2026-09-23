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

public class Document_outputSettings_11452575317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12192;

    public Document_outputSettings_11452575317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12192 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term12192, term12192.getClass(), "outputSettings", null);
        setField(term12192, term12192.getClass(), "tag", null);
        setField(term12192, term12192.getClass(), "classNames", null);
        setField(term12192, term12192.getClass(), "parentNode", null);
        setField(term12192, term12192.getClass(), "childNodes", null);
        setField(term12192, term12192.getClass(), "attributes", null);
        setField(term12192, term12192.getClass(), "baseUri", null);
        setIntField(term12192, term12192.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "outputSettings", argTypes, term12192, args);
    }

};


