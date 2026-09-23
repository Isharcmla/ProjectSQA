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

public class Document_findFirstElementByTagName_160072071172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29764;
     Object term29818;
     Object term31760;
     Object term31761;

    public Document_findFirstElementByTagName_160072071172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29764 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term29870 = new ArrayList();
        term29818 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term29818, term29818.getClass(), "childNodes", term29870);
        term31760 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term31760, term31760.getClass(), "outputSettings", null);
        setField(term31760, term31760.getClass(), "quirksMode", null);
        setField(term31760, term31760.getClass(), "tag", null);
        setField(term31760, term31760.getClass(), "classNames", null);
        setField(term31760, term31760.getClass(), "parentNode", null);
        setField(term31760, term31760.getClass(), "childNodes", null);
        setField(term31760, term31760.getClass(), "attributes", null);
        setField(term31760, term31760.getClass(), "baseUri", null);
        setIntField(term31760, term31760.getClass(), "siblingIndex", 0);
        ArrayList term31762 = new ArrayList();
        term31761 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term31761, term31761.getClass(), "outputSettings", null);
        setField(term31761, term31761.getClass(), "quirksMode", null);
        setField(term31761, term31761.getClass(), "tag", null);
        setField(term31761, term31761.getClass(), "classNames", null);
        setField(term31761, term31761.getClass(), "parentNode", null);
        setField(term31761, term31761.getClass(), "childNodes", term31762);
        setField(term31761, term31761.getClass(), "attributes", null);
        setField(term31761, term31761.getClass(), "baseUri", null);
        setIntField(term31761, term31761.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29818;
        Object retValue = callMethod(klass, "findFirstElementByTagName", argTypes, term29764, args);
        assertTrue(recursiveEquals(term29764, term31760));
        assertTrue(recursiveEquals(term29818, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


