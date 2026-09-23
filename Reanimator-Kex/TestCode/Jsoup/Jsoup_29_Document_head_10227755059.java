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
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.ArrayList;

public class Document_head_10227755059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26291;
     Object term26369;

    public Document_head_10227755059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26343 = new ArrayList();
        term26291 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term26291, term26291.getClass(), "childNodes", term26343);
        ArrayList term26370 = new ArrayList();
        term26369 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term26369, term26369.getClass(), "outputSettings", null);
        setField(term26369, term26369.getClass(), "quirksMode", null);
        setField(term26369, term26369.getClass(), "tag", null);
        setField(term26369, term26369.getClass(), "classNames", null);
        setField(term26369, term26369.getClass(), "parentNode", null);
        setField(term26369, term26369.getClass(), "childNodes", term26370);
        setField(term26369, term26369.getClass(), "attributes", null);
        setField(term26369, term26369.getClass(), "baseUri", null);
        setIntField(term26369, term26369.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "head", argTypes, term26291, args);
        assertTrue(recursiveEquals(term26291, term26369));
        assertTrue(recursiveEquals(retValue, null));
    }

};


