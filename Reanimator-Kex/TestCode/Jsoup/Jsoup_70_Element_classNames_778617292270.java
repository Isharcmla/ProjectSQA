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

public class Element_classNames_778617292270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295755;

    public Element_classNames_778617292270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295755 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term295755, term295755.getClass(), "tag", null);
        setField(term295755, term295755.getClass(), "shadowChildrenRef", null);
        setField(term295755, term295755.getClass(), "childNodes", null);
        setField(term295755, term295755.getClass(), "attributes", null);
        setField(term295755, term295755.getClass(), "baseUri", null);
        setField(term295755, term295755.getClass(), "parentNode", null);
        setIntField(term295755, term295755.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term295755, args);
    }

};


