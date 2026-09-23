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
import java.lang.Boolean;

public class Parser_addChildToParent_71584410931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6102;
     Object term6104;

    public Parser_addChildToParent_71584410931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6102 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term6102, term6102.getClass(), "stack", null);
        setField(term6102, term6102.getClass(), "tq", null);
        setField(term6102, term6102.getClass(), "doc", null);
        setField(term6102, term6102.getClass(), "baseUri", null);
        setBooleanField(term6102, term6102.getClass(), "relaxed", false);
        term6104 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6104;
        callMethod(klass, "addChildToParent", argTypes, term6102, args);
    }

};


