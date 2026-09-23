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

public class Element_init_1390623358152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Element_init_1390623358152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31230 = new ArrayList();
        Object term31178 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term31326 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term31178, term31178.getClass(), "childNodes", term31230);
        setField(term31178, term31178.getClass(), "baseUri", "");
        setField(term31178, term31178.getClass(), "attributes", term31326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


