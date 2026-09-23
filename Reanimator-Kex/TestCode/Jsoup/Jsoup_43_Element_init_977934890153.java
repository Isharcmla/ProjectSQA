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

public class Element_init_977934890153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31700;

    public Element_init_977934890153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31508 = new ArrayList();
        Object term31456 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term31604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term31456, term31456.getClass(), "childNodes", term31508);
        setField(term31456, term31456.getClass(), "baseUri", "");
        setField(term31456, term31456.getClass(), "attributes", term31604);
        term31700 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "";
        args[2] = term31700;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


