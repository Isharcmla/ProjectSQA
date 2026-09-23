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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Element_accumulateParents_1378870327104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1069;

    public Element_accumulateParents_1378870327104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1069 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term1069, term1069.getClass(), "tag", null);
        setField(term1069, term1069.getClass(), "classNames", null);
        setField(term1069, term1069.getClass(), "parentNode", null);
        setField(term1069, term1069.getClass(), "childNodes", null);
        setField(term1069, term1069.getClass(), "attributes", null);
        setField(term1069, term1069.getClass(), "baseUri", null);
        setIntField(term1069, term1069.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("org.jsoup.select.Elements");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "accumulateParents", argTypes, term1069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


