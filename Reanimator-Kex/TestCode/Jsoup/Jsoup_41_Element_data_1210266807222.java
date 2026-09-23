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

public class Element_data_1210266807222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59957;

    public Element_data_1210266807222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59957 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term59957, term59957.getClass(), "tag", null);
        setField(term59957, term59957.getClass(), "parentNode", null);
        setField(term59957, term59957.getClass(), "childNodes", null);
        setField(term59957, term59957.getClass(), "attributes", null);
        setField(term59957, term59957.getClass(), "baseUri", null);
        setIntField(term59957, term59957.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term59957, args);
    }

};


