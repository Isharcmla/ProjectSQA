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

public class Element_html_923814631285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66116;

    public Element_html_923814631285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66116 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term66116, term66116.getClass(), "tag", null);
        setField(term66116, term66116.getClass(), "shadowChildrenRef", null);
        setField(term66116, term66116.getClass(), "childNodes", null);
        setField(term66116, term66116.getClass(), "attributes", null);
        setField(term66116, term66116.getClass(), "baseUri", null);
        setField(term66116, term66116.getClass(), "parentNode", null);
        setIntField(term66116, term66116.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "html", argTypes, term66116, args);
    }

};


