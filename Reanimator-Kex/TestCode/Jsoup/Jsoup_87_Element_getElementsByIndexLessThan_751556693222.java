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
import java.lang.Integer;

public class Element_getElementsByIndexLessThan_751556693222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226039;
     Object term226041;

    public Element_getElementsByIndexLessThan_751556693222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226039 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term226039, term226039.getClass(), "tag", null);
        setField(term226039, term226039.getClass(), "shadowChildrenRef", null);
        setField(term226039, term226039.getClass(), "childNodes", null);
        setField(term226039, term226039.getClass(), "attributes", null);
        setField(term226039, term226039.getClass(), "baseUri", null);
        setField(term226039, term226039.getClass(), "parentNode", null);
        setIntField(term226039, term226039.getClass(), "siblingIndex", 0);
        term226041 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term226041;
        callMethod(klass, "getElementsByIndexLessThan", argTypes, term226039, args);
    }

};


