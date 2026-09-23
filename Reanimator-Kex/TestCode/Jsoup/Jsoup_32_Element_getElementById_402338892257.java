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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Element_getElementById_402338892257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63884;

    public Element_getElementById_402338892257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term64002 = new LinkedHashMap();
        ArrayList term64158 = new ArrayList();
        ((ArrayList) term64158).add((Object)null);
        ((ArrayList) term64158).add((Object)null);
        term63884 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term63942 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term63942, term63942.getClass(), "attributes", term64002);
        setField(term63884, term63884.getClass(), "attributes", term63942);
        setField(term63884, term63884.getClass(), "childNodes", term64158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "         ";
        callMethod(klass, "getElementById", argTypes, term63884, args);
    }

};


