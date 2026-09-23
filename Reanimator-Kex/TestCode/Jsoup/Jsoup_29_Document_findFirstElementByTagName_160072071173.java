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

public class Document_findFirstElementByTagName_160072071173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30045;
     Object term31789;
     Object term31790;
     Object term31775;

    public Document_findFirstElementByTagName_160072071173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30045 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        term31789 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term31789, term31789.getClass(), "outputSettings", null);
        setField(term31789, term31789.getClass(), "quirksMode", null);
        setField(term31789, term31789.getClass(), "tag", null);
        setField(term31789, term31789.getClass(), "classNames", null);
        setField(term31789, term31789.getClass(), "parentNode", null);
        setField(term31789, term31789.getClass(), "childNodes", null);
        setField(term31789, term31789.getClass(), "attributes", null);
        setField(term31789, term31789.getClass(), "baseUri", null);
        setIntField(term31789, term31789.getClass(), "siblingIndex", 0);
        term31790 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term31790, term31790.getClass(), "outputSettings", null);
        setField(term31790, term31790.getClass(), "quirksMode", null);
        setField(term31790, term31790.getClass(), "tag", null);
        setField(term31790, term31790.getClass(), "classNames", null);
        setField(term31790, term31790.getClass(), "parentNode", null);
        setField(term31790, term31790.getClass(), "childNodes", null);
        setField(term31790, term31790.getClass(), "attributes", null);
        setField(term31790, term31790.getClass(), "baseUri", null);
        setIntField(term31790, term31790.getClass(), "siblingIndex", 0);
        term31775 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term31775, term31775.getClass(), "outputSettings", null);
        setField(term31775, term31775.getClass(), "quirksMode", null);
        setField(term31775, term31775.getClass(), "tag", null);
        setField(term31775, term31775.getClass(), "classNames", null);
        setField(term31775, term31775.getClass(), "parentNode", null);
        setField(term31775, term31775.getClass(), "childNodes", null);
        setField(term31775, term31775.getClass(), "attributes", null);
        setField(term31775, term31775.getClass(), "baseUri", null);
        setIntField(term31775, term31775.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[2];
        args[0] = "#document";
        args[1] = term30045;
        Object retValue = callMethod(klass, "findFirstElementByTagName", argTypes, term30045, args);
        assertTrue(recursiveEquals(term30045, term31789));
        assertTrue(recursiveEquals(term30045, "#document"));
        assertTrue(recursiveEquals(retValue, term31775));
    }

};


