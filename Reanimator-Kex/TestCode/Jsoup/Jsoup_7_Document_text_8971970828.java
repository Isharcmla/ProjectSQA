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

public class Document_text_8971970828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13553;

    public Document_text_8971970828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13553 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term13553, term13553.getClass(), "outputSettings", null);
        setField(term13553, term13553.getClass(), "tag", null);
        setField(term13553, term13553.getClass(), "classNames", null);
        setField(term13553, term13553.getClass(), "parentNode", null);
        setField(term13553, term13553.getClass(), "childNodes", null);
        setField(term13553, term13553.getClass(), "attributes", null);
        setField(term13553, term13553.getClass(), "baseUri", null);
        setIntField(term13553, term13553.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "text", argTypes, term13553, args);
    }

};


