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

public class Element_indexInList_1961680608154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29060;

    public Element_indexInList_1961680608154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29060 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term29060, term29060.getClass(), "tag", null);
        setField(term29060, term29060.getClass(), "classNames", null);
        setField(term29060, term29060.getClass(), "parentNode", null);
        setField(term29060, term29060.getClass(), "childNodes", null);
        setField(term29060, term29060.getClass(), "attributes", null);
        setField(term29060, term29060.getClass(), "baseUri", null);
        setIntField(term29060, term29060.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "indexInList", argTypes, term29060, args);
    }

};


