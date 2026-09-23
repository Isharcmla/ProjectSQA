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

public class Document_normaliseTextNodes_97858987080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34136;
     Object term34190;
     Object term34770;
     Object term34771;

    public Document_normaliseTextNodes_97858987080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34136 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term34242 = new ArrayList();
        term34190 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term34190, term34190.getClass(), "childNodes", term34242);
        term34770 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term34770, term34770.getClass(), "outputSettings", null);
        setField(term34770, term34770.getClass(), "quirksMode", null);
        setField(term34770, term34770.getClass(), "tag", null);
        setField(term34770, term34770.getClass(), "classNames", null);
        setField(term34770, term34770.getClass(), "parentNode", null);
        setField(term34770, term34770.getClass(), "childNodes", null);
        setField(term34770, term34770.getClass(), "attributes", null);
        setField(term34770, term34770.getClass(), "baseUri", null);
        setIntField(term34770, term34770.getClass(), "siblingIndex", 0);
        ArrayList term34772 = new ArrayList();
        term34771 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term34771, term34771.getClass(), "outputSettings", null);
        setField(term34771, term34771.getClass(), "quirksMode", null);
        setField(term34771, term34771.getClass(), "tag", null);
        setField(term34771, term34771.getClass(), "classNames", null);
        setField(term34771, term34771.getClass(), "parentNode", null);
        setField(term34771, term34771.getClass(), "childNodes", term34772);
        setField(term34771, term34771.getClass(), "attributes", null);
        setField(term34771, term34771.getClass(), "baseUri", null);
        setIntField(term34771, term34771.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term34190;
        callMethod(klass, "normaliseTextNodes", argTypes, term34136, args);
        assertTrue(recursiveEquals(term34136, term34770));
        assertTrue(recursiveEquals(term34190, term34771));
    }

};


