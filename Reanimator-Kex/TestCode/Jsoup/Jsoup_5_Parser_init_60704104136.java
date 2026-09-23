package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class Parser_init_60704104136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Parser_init_60704104136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term7050 = new LinkedList();
        Object term6996 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7110 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setBooleanField(term6996, term6996.getClass(), "relaxed", false);
        setField(term6996, term6996.getClass(), "stack", term7050);
        setField(term6996, term6996.getClass(), "tq", term7110);
        setField(term6996, term6996.getClass(), "baseUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = "";
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


