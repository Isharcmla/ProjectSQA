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

public class Document_body_26470769243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21065;
     Object term21685;

    public Document_body_26470769243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term21117 = new ArrayList();
        term21065 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21065, term21065.getClass(), "childNodes", term21117);
        ArrayList term21686 = new ArrayList();
        term21685 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term21685, term21685.getClass(), "outputSettings", null);
        setField(term21685, term21685.getClass(), "quirksMode", null);
        setField(term21685, term21685.getClass(), "tag", null);
        setField(term21685, term21685.getClass(), "classNames", null);
        setField(term21685, term21685.getClass(), "parentNode", null);
        setField(term21685, term21685.getClass(), "childNodes", term21686);
        setField(term21685, term21685.getClass(), "attributes", null);
        setField(term21685, term21685.getClass(), "baseUri", null);
        setIntField(term21685, term21685.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "body", argTypes, term21065, args);
        assertTrue(recursiveEquals(term21065, term21685));
        assertTrue(recursiveEquals(retValue, null));
    }

};


