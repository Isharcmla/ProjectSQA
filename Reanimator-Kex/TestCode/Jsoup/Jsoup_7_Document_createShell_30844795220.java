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

public class Document_createShell_30844795220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13537;

    public Document_createShell_30844795220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13537 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term13537, term13537.getClass(), "outputSettings", null);
        setField(term13537, term13537.getClass(), "tag", null);
        setField(term13537, term13537.getClass(), "classNames", null);
        setField(term13537, term13537.getClass(), "parentNode", null);
        setField(term13537, term13537.getClass(), "childNodes", null);
        setField(term13537, term13537.getClass(), "attributes", null);
        setField(term13537, term13537.getClass(), "baseUri", null);
        setIntField(term13537, term13537.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createShell", argTypes, term13537, args);
    }

};


