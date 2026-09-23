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
import java.util.ArrayList;

public class Element_selectFirst_2005301264253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60385;

    public Element_selectFirst_2005301264253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60573 = new ArrayList();
        ArrayList term60521 = new ArrayList();
        ((ArrayList) term60521).add(term60573);
        term60385 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term60431 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term60431, term60431.getClass(), "tagName", "");
        setField(term60385, term60385.getClass(), "tag", term60431);
        setField(term60385, term60385.getClass(), "childNodes", term60521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "3343K4k0LK";
        callMethod(klass, "selectFirst", argTypes, term60385, args);
    }

};


